package com.android.volley.toolbox;

/* loaded from: classes7.dex */
public class StringRequest extends com.android.volley.Request<java.lang.String> {
    private com.android.volley.Response.Listener<java.lang.String> getHighSpeedVideoFpsRangesFor;
    private final java.lang.Object getHighSpeedVideoSizes;

    public StringRequest(int i, java.lang.String str, com.android.volley.Response.Listener<java.lang.String> listener, com.android.volley.Response.ErrorListener errorListener) {
        super(i, str, errorListener);
        this.getHighSpeedVideoSizes = new java.lang.Object();
        this.getHighSpeedVideoFpsRangesFor = listener;
    }

    public StringRequest(java.lang.String str, com.android.volley.Response.Listener<java.lang.String> listener, com.android.volley.Response.ErrorListener errorListener) {
        this(0, str, listener, errorListener);
    }

    @Override // com.android.volley.Request
    public void cancel() {
        super.cancel();
        synchronized (this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoFpsRangesFor = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public void deliverResponse(java.lang.String str) {
        com.android.volley.Response.Listener<java.lang.String> listener;
        synchronized (this.getHighSpeedVideoSizes) {
            listener = this.getHighSpeedVideoFpsRangesFor;
        }
        if (listener != null) {
            listener.onResponse(str);
        }
    }

    @Override // com.android.volley.Request
    public com.android.volley.Response<java.lang.String> parseNetworkResponse(com.android.volley.NetworkResponse networkResponse) {
        java.lang.String str;
        try {
            str = new java.lang.String(networkResponse.data, com.android.volley.toolbox.HttpHeaderParser.parseCharset(networkResponse.headers));
        } catch (java.io.UnsupportedEncodingException unused) {
            str = new java.lang.String(networkResponse.data);
        }
        return com.android.volley.Response.success(str, com.android.volley.toolbox.HttpHeaderParser.parseCacheHeaders(networkResponse));
    }
}
