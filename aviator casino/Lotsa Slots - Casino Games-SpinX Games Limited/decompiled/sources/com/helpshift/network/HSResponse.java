package com.helpshift.network;

/* loaded from: classes2.dex */
public class HSResponse {
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers;
    private final java.lang.String responseString;
    private final int status;

    public HSResponse(int i, java.lang.String str, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        this.status = i;
        this.responseString = str;
        this.headers = map;
    }

    public int getStatus() {
        return this.status;
    }

    public boolean isNetworkCallSuccess() {
        int i = this.status;
        return i >= 200 && i < 300;
    }

    public java.lang.String getResponseString() {
        return this.responseString;
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() {
        return this.headers;
    }
}
