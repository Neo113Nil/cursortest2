package com.android.volley;

/* loaded from: classes3.dex */
public class VolleyError extends java.lang.Exception {
    long Camera2StreamConfigurationMap;
    public final com.android.volley.NetworkResponse networkResponse;

    public VolleyError() {
        this.networkResponse = null;
    }

    public VolleyError(com.android.volley.NetworkResponse networkResponse) {
        this.networkResponse = networkResponse;
    }

    public VolleyError(java.lang.String str) {
        super(str);
        this.networkResponse = null;
    }

    public VolleyError(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.networkResponse = null;
    }

    public VolleyError(java.lang.Throwable th) {
        super(th);
        this.networkResponse = null;
    }

    public long getNetworkTimeMs() {
        return this.Camera2StreamConfigurationMap;
    }
}
