package com.android.volley.toolbox;

/* loaded from: classes7.dex */
public class NoAsyncCache extends com.android.volley.AsyncCache {
    @Override // com.android.volley.AsyncCache
    public void get(java.lang.String str, com.android.volley.AsyncCache.OnGetCompleteCallback onGetCompleteCallback) {
        onGetCompleteCallback.onGetComplete(null);
    }

    @Override // com.android.volley.AsyncCache
    public void put(java.lang.String str, com.android.volley.Cache.Entry entry, com.android.volley.AsyncCache.OnWriteCompleteCallback onWriteCompleteCallback) {
        onWriteCompleteCallback.onWriteComplete();
    }

    @Override // com.android.volley.AsyncCache
    public void clear(com.android.volley.AsyncCache.OnWriteCompleteCallback onWriteCompleteCallback) {
        onWriteCompleteCallback.onWriteComplete();
    }

    @Override // com.android.volley.AsyncCache
    public void initialize(com.android.volley.AsyncCache.OnWriteCompleteCallback onWriteCompleteCallback) {
        onWriteCompleteCallback.onWriteComplete();
    }

    @Override // com.android.volley.AsyncCache
    public void invalidate(java.lang.String str, boolean z, com.android.volley.AsyncCache.OnWriteCompleteCallback onWriteCompleteCallback) {
        onWriteCompleteCallback.onWriteComplete();
    }

    @Override // com.android.volley.AsyncCache
    public void remove(java.lang.String str, com.android.volley.AsyncCache.OnWriteCompleteCallback onWriteCompleteCallback) {
        onWriteCompleteCallback.onWriteComplete();
    }
}
