package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public class LoginResponse {
    private java.lang.String access_token;
    private com.visa.cbp.sdk.facade.AuthData auth_data;
    private java.lang.Integer expires_in;
    private java.lang.String token_type;
    private java.util.List<com.visa.cbp.sdk.facade.Subject> subjects = null;
    private java.util.List<java.lang.String> subject_auth_status = null;

    public java.lang.String getAccessToken() {
        return this.access_token;
    }

    public void setAccessToken(java.lang.String str) {
        this.access_token = str;
    }

    public java.lang.String getToken_type() {
        return this.token_type;
    }

    public void setToken_type(java.lang.String str) {
        this.token_type = str;
    }

    public java.lang.Integer getExpiresIn() {
        return this.expires_in;
    }

    public void setExpiresIn(java.lang.Integer num) {
        this.expires_in = num;
    }

    public java.util.List<com.visa.cbp.sdk.facade.Subject> getSubjects() {
        return this.subjects;
    }

    public void setSubjects(java.util.List<com.visa.cbp.sdk.facade.Subject> list) {
        this.subjects = list;
    }

    public java.util.List<java.lang.String> getSubject_auth_status() {
        return this.subject_auth_status;
    }

    public void setSubject_auth_status(java.util.List<java.lang.String> list) {
        this.subject_auth_status = list;
    }

    public com.visa.cbp.sdk.facade.AuthData getAuthData() {
        return this.auth_data;
    }

    public void setAuthData(com.visa.cbp.sdk.facade.AuthData authData) {
        this.auth_data = authData;
    }
}
