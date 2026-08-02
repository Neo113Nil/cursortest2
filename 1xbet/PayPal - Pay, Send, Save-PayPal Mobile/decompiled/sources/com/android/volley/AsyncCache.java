package com.android.volley;

/* loaded from: classes7.dex */
public abstract class AsyncCache {

    public interface OnGetCompleteCallback {
        void onGetComplete(com.android.volley.Cache.Entry entry);
    }

    public interface OnWriteCompleteCallback {
        void onWriteComplete();
    }

    public abstract void clear(com.android.volley.AsyncCache.OnWriteCompleteCallback onWriteCompleteCallback);

    public abstract void get(java.lang.String str, com.android.volley.AsyncCache.OnGetCompleteCallback onGetCompleteCallback);

    public abstract void initialize(com.android.volley.AsyncCache.OnWriteCompleteCallback onWriteCompleteCallback);

    public abstract void invalidate(java.lang.String str, boolean z, com.android.volley.AsyncCache.OnWriteCompleteCallback onWriteCompleteCallback);

    public abstract void put(java.lang.String str, com.android.volley.Cache.Entry entry, com.android.volley.AsyncCache.OnWriteCompleteCallback onWriteCompleteCallback);

    public abstract void remove(java.lang.String str, com.android.volley.AsyncCache.OnWriteCompleteCallback onWriteCompleteCallback);
}
