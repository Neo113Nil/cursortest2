package com.android.volley;

/* loaded from: classes3.dex */
public interface ResponseDelivery {
    void postError(com.android.volley.Request<?> request, com.android.volley.VolleyError volleyError);

    void postResponse(com.android.volley.Request<?> request, com.android.volley.Response<?> response);

    void postResponse(com.android.volley.Request<?> request, com.android.volley.Response<?> response, java.lang.Runnable runnable);
}
