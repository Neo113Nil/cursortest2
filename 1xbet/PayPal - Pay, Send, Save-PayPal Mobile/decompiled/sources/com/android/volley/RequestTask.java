package com.android.volley;

/* loaded from: classes7.dex */
public abstract class RequestTask<T> implements java.lang.Runnable {
    final com.android.volley.Request<T> getOutputMinFrameDuration;

    public RequestTask(com.android.volley.Request<T> request) {
        this.getOutputMinFrameDuration = request;
    }

    public int compareTo(com.android.volley.RequestTask<?> requestTask) {
        return this.getOutputMinFrameDuration.compareTo((com.android.volley.Request) requestTask.getOutputMinFrameDuration);
    }
}
