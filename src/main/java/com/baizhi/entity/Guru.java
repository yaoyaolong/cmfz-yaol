package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Guru implements Serializable {
  @Id
  private String id;
  private String name;
  private String photo;
  private String status;
  private String nickName;




}
