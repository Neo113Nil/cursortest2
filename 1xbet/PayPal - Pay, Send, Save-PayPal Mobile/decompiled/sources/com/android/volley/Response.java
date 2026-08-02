package com.android.volley;

/* loaded from: classes3.dex */
public class Response<T> {
    public final com.android.volley.Cache.Entry cacheEntry;
    public final com.android.volley.VolleyError error;
    public boolean intermediate;
    public final T result;

    public interface ErrorListener {
        void onErrorResponse(com.android.volley.VolleyError volleyError);
    }

    /* loaded from: classes7.dex */
    public interface Listener<T> {
        void onResponse(T t);
    }

    public static <T> com.android.volley.Response<T> success(T t, com.android.volley.Cache.Entry entry) {
        return new com.android.volley.Response<>(t, entry);
    }

    public static <T> com.android.volley.Response<T> error(com.android.volley.VolleyError volleyError) {
        return new com.android.volley.Response<>(volleyError);
    }

    public boolean isSuccess() {
        return this.error == null;
    }

    private Response(T t, com.android.volley.Cache.Entry entry) {
        this.intermediate = false;
        this.result = t;
        this.cacheEntry = entry;
        this.error = null;
    }

    private Response(com.android.volley.VolleyError volleyError) {
        this.intermediate = false;
        this.result = null;
        this.cacheEntry = null;
        this.error = volleyError;
    }
}
