package com.android.volley.toolbox;

/* loaded from: classes7.dex */
public abstract class JsonRequest<T> extends com.android.volley.Request<T> {
    protected static final java.lang.String PROTOCOL_CHARSET = "utf-8";
    private static final java.lang.String PROTOCOL_CONTENT_TYPE = java.lang.String.format("application/json; charset=%s", PROTOCOL_CHARSET);
    private com.android.volley.Response.Listener<T> mListener;
    private final java.lang.Object mLock;
    private final java.lang.String mRequestBody;

    @Override // com.android.volley.Request
    public abstract com.android.volley.Response<T> parseNetworkResponse(com.android.volley.NetworkResponse networkResponse);

    @java.lang.Deprecated
    public JsonRequest(java.lang.String str, java.lang.String str2, com.android.volley.Response.Listener<T> listener, com.android.volley.Response.ErrorListener errorListener) {
        this(-1, str, str2, listener, errorListener);
    }

    public JsonRequest(int i, java.lang.String str, java.lang.String str2, com.android.volley.Response.Listener<T> listener, com.android.volley.Response.ErrorListener errorListener) {
        super(i, str, errorListener);
        this.mLock = new java.lang.Object();
        this.mListener = listener;
        this.mRequestBody = str2;
    }

    @Override // com.android.volley.Request
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // com.android.volley.Request
    public void deliverResponse(T t) {
        com.android.volley.Response.Listener<T> listener;
        synchronized (this.mLock) {
            listener = this.mListener;
        }
        if (listener != null) {
            listener.onResponse(t);
        }
    }

    @Override // com.android.volley.Request
    @java.lang.Deprecated
    public java.lang.String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Override // com.android.volley.Request
    @java.lang.Deprecated
    public byte[] getPostBody() {
        return getBody();
    }

    @Override // com.android.volley.Request
    public java.lang.String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    @Override // com.android.volley.Request
    public byte[] getBody() {
        try {
            java.lang.String str = this.mRequestBody;
            if (str == null) {
                return null;
            }
            return str.getBytes(PROTOCOL_CHARSET);
        } catch (java.io.UnsupportedEncodingException unused) {
            com.android.volley.VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", this.mRequestBody, PROTOCOL_CHARSET);
            return null;
        }
    }
}
