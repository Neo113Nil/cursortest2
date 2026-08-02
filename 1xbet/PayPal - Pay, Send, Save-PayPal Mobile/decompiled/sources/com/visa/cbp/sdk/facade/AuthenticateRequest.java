package com.visa.cbp.sdk.facade;

/* loaded from: classes16.dex */
public class AuthenticateRequest {
    private java.lang.String deviceId;
    private java.lang.String password;
    private java.lang.String username;

    public void init(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.username = str;
        this.password = str2;
        this.deviceId = str3;
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public void setUsername(java.lang.String str) {
        this.username = str;
    }

    public java.lang.String getPassword() {
        return this.password;
    }

    public void setPassword(java.lang.String str) {
        this.password = str;
    }

    public java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(java.lang.String str) {
        this.deviceId = str;
    }
}
