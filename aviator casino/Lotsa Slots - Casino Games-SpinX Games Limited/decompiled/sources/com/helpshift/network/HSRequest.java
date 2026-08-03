package com.helpshift.network;

/* loaded from: classes2.dex */
public class HSRequest {
    public static final int CONNECT_TIMEOUT = 5000;
    private final java.lang.String body;
    private final java.util.Map<java.lang.String, java.lang.String> headers;
    private final com.helpshift.network.HSRequest.Method method;
    private final int timeout;
    private final java.lang.String url;

    enum Method {
        POST,
        GET,
        PUT
    }

    public HSRequest(com.helpshift.network.HSRequest.Method method, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, int i) {
        this.method = method;
        this.url = str;
        this.headers = map;
        this.body = str2;
        this.timeout = i;
    }

    public com.helpshift.network.HSRequest.Method getMethod() {
        return this.method;
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return this.headers;
    }

    public java.lang.String getBody() {
        return this.body;
    }

    public int getTimeout() {
        return this.timeout;
    }
}
