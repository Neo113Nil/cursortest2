package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public class LoginRequest {
    private java.lang.String assertion;
    private java.lang.String grant_type = "urn:ietf:params:oauth:grant-type:jwt-bearer";

    public LoginRequest(java.lang.String str) {
        this.assertion = str;
    }

    public java.lang.String getGrant_type() {
        return this.grant_type;
    }

    public java.lang.String getAssertion() {
        return this.assertion;
    }
}
