package com.android.volley.toolbox;

/* loaded from: classes7.dex */
public class ClearCacheRequest extends com.android.volley.Request<java.lang.Object> {
    private final java.lang.Runnable Camera2StreamConfigurationMap;
    private final com.android.volley.Cache getHighSpeedVideoFpsRangesFor;

    @Override // com.android.volley.Request
    public void deliverResponse(java.lang.Object obj) {
    }

    @Override // com.android.volley.Request
    public com.android.volley.Response<java.lang.Object> parseNetworkResponse(com.android.volley.NetworkResponse networkResponse) {
        return null;
    }

    public ClearCacheRequest(com.android.volley.Cache cache, java.lang.Runnable runnable) {
        super(0, null, null);
        this.getHighSpeedVideoFpsRangesFor = cache;
        this.Camera2StreamConfigurationMap = runnable;
    }

    @Override // com.android.volley.Request
    public boolean isCanceled() {
        this.getHighSpeedVideoFpsRangesFor.clear();
        if (this.Camera2StreamConfigurationMap == null) {
            return true;
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).postAtFrontOfQueue(this.Camera2StreamConfigurationMap);
        return true;
    }

    @Override // com.android.volley.Request
    public com.android.volley.Request.Priority getPriority() {
        return com.android.volley.Request.Priority.IMMEDIATE;
    }
}
