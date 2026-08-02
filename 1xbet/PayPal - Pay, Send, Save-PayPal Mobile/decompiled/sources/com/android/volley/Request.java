package com.android.volley;

/* loaded from: classes3.dex */
public abstract class Request<T> implements java.lang.Comparable<com.android.volley.Request<T>> {
    private static final java.lang.String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private com.android.volley.Cache.Entry mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private com.android.volley.Response.ErrorListener mErrorListener;
    private final com.android.volley.VolleyLog.MarkerLog mEventLog;
    private final java.lang.Object mLock;
    private final int mMethod;
    private com.android.volley.Request.NetworkRequestCompleteListener mRequestCompleteListener;
    private com.android.volley.RequestQueue mRequestQueue;
    private boolean mResponseDelivered;
    private com.android.volley.RetryPolicy mRetryPolicy;
    private java.lang.Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private java.lang.Object mTag;
    private final java.lang.String mUrl;

    /* loaded from: classes7.dex */
    public interface Method {
        public static final int DELETE = 3;
        public static final int DEPRECATED_GET_OR_POST = -1;
        public static final int GET = 0;
        public static final int HEAD = 4;
        public static final int OPTIONS = 5;
        public static final int PATCH = 7;
        public static final int POST = 1;
        public static final int PUT = 2;
        public static final int TRACE = 6;
    }

    interface NetworkRequestCompleteListener {
        void getHighSpeedVideoSizes(com.android.volley.Request<?> request);

        void getHighSpeedVideoSizes(com.android.volley.Request<?> request, com.android.volley.Response<?> response);
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    protected abstract void deliverResponse(T t);

    protected java.util.Map<java.lang.String, java.lang.String> getParams() throws com.android.volley.AuthFailureError {
        return null;
    }

    protected com.android.volley.VolleyError parseNetworkError(com.android.volley.VolleyError volleyError) {
        return volleyError;
    }

    protected abstract com.android.volley.Response<T> parseNetworkResponse(com.android.volley.NetworkResponse networkResponse);

    @java.lang.Deprecated
    public Request(java.lang.String str, com.android.volley.Response.ErrorListener errorListener) {
        this(-1, str, errorListener);
    }

    public Request(int i, java.lang.String str, com.android.volley.Response.ErrorListener errorListener) {
        this.mEventLog = com.android.volley.VolleyLog.MarkerLog.getHighResolutionOutputSizeshNQ4ISI ? new com.android.volley.VolleyLog.MarkerLog() : null;
        this.mLock = new java.lang.Object();
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = i;
        this.mUrl = str;
        this.mErrorListener = errorListener;
        setRetryPolicy(new com.android.volley.DefaultRetryPolicy());
        this.mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(str);
    }

    public int getMethod() {
        return this.mMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.android.volley.Request<?> setTag(java.lang.Object obj) {
        this.mTag = obj;
        return this;
    }

    public java.lang.Object getTag() {
        return this.mTag;
    }

    public com.android.volley.Response.ErrorListener getErrorListener() {
        com.android.volley.Response.ErrorListener errorListener;
        synchronized (this.mLock) {
            errorListener = this.mErrorListener;
        }
        return errorListener;
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    private static int findDefaultTrafficStatsTag(java.lang.String str) {
        android.net.Uri parse;
        java.lang.String host;
        if (android.text.TextUtils.isEmpty(str) || (parse = android.net.Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.android.volley.Request<?> setRetryPolicy(com.android.volley.RetryPolicy retryPolicy) {
        this.mRetryPolicy = retryPolicy;
        return this;
    }

    public void addMarker(java.lang.String str) {
        if (com.android.volley.VolleyLog.MarkerLog.getHighResolutionOutputSizeshNQ4ISI) {
            this.mEventLog.getHighSpeedVideoFpsRanges(str, java.lang.Thread.currentThread().getId());
        }
    }

    void finish(final java.lang.String str) {
        com.android.volley.RequestQueue requestQueue = this.mRequestQueue;
        if (requestQueue != null) {
            synchronized (requestQueue.getHighSpeedVideoFpsRanges) {
                requestQueue.getHighSpeedVideoFpsRanges.remove(this);
            }
            synchronized (requestQueue.getHighSpeedVideoFpsRangesFor) {
                java.util.Iterator<com.android.volley.RequestQueue.RequestFinishedListener> it = requestQueue.getHighSpeedVideoFpsRangesFor.iterator();
                while (it.hasNext()) {
                    it.next().onRequestFinished(this);
                }
            }
            requestQueue.getHighResolutionOutputSizeshNQ4ISI(this, 5);
        }
        if (com.android.volley.VolleyLog.MarkerLog.getHighResolutionOutputSizeshNQ4ISI) {
            final long id = java.lang.Thread.currentThread().getId();
            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.android.volley.Request.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.android.volley.Request.this.mEventLog.getHighSpeedVideoFpsRanges(str, id);
                        com.android.volley.Request.this.mEventLog.Camera2StreamConfigurationMap(com.android.volley.Request.this.toString());
                    }
                });
            } else {
                this.mEventLog.getHighSpeedVideoFpsRanges(str, id);
                this.mEventLog.Camera2StreamConfigurationMap(toString());
            }
        }
    }

    void sendEvent(int i) {
        com.android.volley.RequestQueue requestQueue = this.mRequestQueue;
        if (requestQueue != null) {
            requestQueue.getHighResolutionOutputSizeshNQ4ISI(this, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.android.volley.Request<?> setRequestQueue(com.android.volley.RequestQueue requestQueue) {
        this.mRequestQueue = requestQueue;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.android.volley.Request<?> setSequence(int i) {
        this.mSequence = java.lang.Integer.valueOf(i);
        return this;
    }

    public final int getSequence() {
        java.lang.Integer num = this.mSequence;
        if (num == null) {
            throw new java.lang.IllegalStateException("getSequence called before setSequence");
        }
        return num.intValue();
    }

    public java.lang.String getUrl() {
        return this.mUrl;
    }

    public java.lang.String getCacheKey() {
        java.lang.String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Integer.toString(method));
        sb.append('-');
        sb.append(url);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.android.volley.Request<?> setCacheEntry(com.android.volley.Cache.Entry entry) {
        this.mCacheEntry = entry;
        return this;
    }

    public com.android.volley.Cache.Entry getCacheEntry() {
        return this.mCacheEntry;
    }

    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mCanceled;
        }
        return z;
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaders() throws com.android.volley.AuthFailureError {
        return java.util.Collections.emptyMap();
    }

    @java.lang.Deprecated
    protected java.util.Map<java.lang.String, java.lang.String> getPostParams() throws com.android.volley.AuthFailureError {
        return getParams();
    }

    @java.lang.Deprecated
    protected java.lang.String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    @java.lang.Deprecated
    public java.lang.String getPostBodyContentType() {
        return getBodyContentType();
    }

    @java.lang.Deprecated
    public byte[] getPostBody() throws com.android.volley.AuthFailureError {
        java.util.Map<java.lang.String, java.lang.String> postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return encodeParameters(postParams, getPostParamsEncoding());
    }

    protected java.lang.String getParamsEncoding() {
        return "UTF-8";
    }

    public java.lang.String getBodyContentType() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("application/x-www-form-urlencoded; charset=");
        sb.append(getParamsEncoding());
        return sb.toString();
    }

    public byte[] getBody() throws com.android.volley.AuthFailureError {
        java.util.Map<java.lang.String, java.lang.String> params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return encodeParameters(params, getParamsEncoding());
    }

    private byte[] encodeParameters(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb.append(java.net.URLEncoder.encode(entry.getKey(), str));
                sb.append('=');
                sb.append(java.net.URLEncoder.encode(entry.getValue(), str));
                sb.append(kotlin.text.Typography.amp);
            }
            return sb.toString().getBytes(str);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException("Encoding not supported: ".concat(java.lang.String.valueOf(str)), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.android.volley.Request<?> setShouldCache(boolean z) {
        this.mShouldCache = z;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.android.volley.Request<?> setShouldRetryServerErrors(boolean z) {
        this.mShouldRetryServerErrors = z;
        return this;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.android.volley.Request<?> setShouldRetryConnectionErrors(boolean z) {
        this.mShouldRetryConnectionErrors = z;
        return this;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public com.android.volley.Request.Priority getPriority() {
        return com.android.volley.Request.Priority.NORMAL;
    }

    public final int getTimeoutMs() {
        return getRetryPolicy().getCurrentTimeout();
    }

    public com.android.volley.RetryPolicy getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    public boolean hasHadResponseDelivered() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mResponseDelivered;
        }
        return z;
    }

    public void deliverError(com.android.volley.VolleyError volleyError) {
        com.android.volley.Response.ErrorListener errorListener;
        synchronized (this.mLock) {
            errorListener = this.mErrorListener;
        }
        if (errorListener != null) {
            errorListener.onErrorResponse(volleyError);
        }
    }

    void setNetworkRequestCompleteListener(com.android.volley.Request.NetworkRequestCompleteListener networkRequestCompleteListener) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = networkRequestCompleteListener;
        }
    }

    void notifyListenerResponseReceived(com.android.volley.Response<?> response) {
        com.android.volley.Request.NetworkRequestCompleteListener networkRequestCompleteListener;
        synchronized (this.mLock) {
            networkRequestCompleteListener = this.mRequestCompleteListener;
        }
        if (networkRequestCompleteListener != null) {
            networkRequestCompleteListener.getHighSpeedVideoSizes(this, response);
        }
    }

    void notifyListenerResponseNotUsable() {
        com.android.volley.Request.NetworkRequestCompleteListener networkRequestCompleteListener;
        synchronized (this.mLock) {
            networkRequestCompleteListener = this.mRequestCompleteListener;
        }
        if (networkRequestCompleteListener != null) {
            networkRequestCompleteListener.getHighSpeedVideoSizes(this);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(com.android.volley.Request<T> request) {
        com.android.volley.Request.Priority priority = getPriority();
        com.android.volley.Request.Priority priority2 = request.getPriority();
        return priority == priority2 ? this.mSequence.intValue() - request.mSequence.intValue() : priority2.ordinal() - priority.ordinal();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("0x");
        sb.append(java.lang.Integer.toHexString(getTrafficStatsTag()));
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(isCanceled() ? "[X] " : "[ ] ");
        sb2.append(getUrl());
        sb2.append(" ");
        sb2.append(obj);
        sb2.append(" ");
        sb2.append(getPriority());
        sb2.append(" ");
        sb2.append(this.mSequence);
        return sb2.toString();
    }
}
