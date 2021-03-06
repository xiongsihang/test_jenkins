package cn.dabby.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaServer
@SpringBootApplication
@RestController
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
	
	@RequestMapping("/getname")
	public String getName() {
		return "I am Bob";
	}
	
	@RequestMapping("/hello")
	public String setName(String name) {
		return "Hello," + name;
	}
	
	@RequestMapping("/hook")
	public String hook() { 
		return "hook成功生效";
	}
	
	
}
