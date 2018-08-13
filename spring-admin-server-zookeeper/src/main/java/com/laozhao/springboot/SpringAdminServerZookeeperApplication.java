package com.laozhao.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class SpringAdminServerZookeeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAdminServerZookeeperApplication.class, args);
	}

	@RequestMapping("/hello")
	public String home() {
		return "Hello world";
	}

}
