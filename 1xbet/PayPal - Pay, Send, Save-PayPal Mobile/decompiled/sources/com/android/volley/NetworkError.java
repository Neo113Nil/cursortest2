package com.android.volley;

/* loaded from: classes3.dex */
public class NetworkError extends com.android.volley.VolleyError {
    public NetworkError() {
    }

    public NetworkError(java.lang.Throwable th) {
        super(th);
    }

    public NetworkError(com.android.volley.NetworkResponse networkResponse) {
        super(networkResponse);
    }
}
