package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class GenericResponse {
    private final java.util.Map<java.lang.String, java.lang.String> headers;
    private final java.lang.String reason;
    private final int statusCode;

    public GenericResponse(int i, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.statusCode = i;
        this.reason = str;
        this.headers = map;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public java.lang.String getReason() {
        return this.reason;
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return this.headers;
    }
}
