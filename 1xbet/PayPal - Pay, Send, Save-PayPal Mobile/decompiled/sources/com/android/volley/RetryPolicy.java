package com.android.volley;

/* loaded from: classes3.dex */
public interface RetryPolicy {
    int getCurrentRetryCount();

    int getCurrentTimeout();

    void retry(com.android.volley.VolleyError volleyError) throws com.android.volley.VolleyError;
}
