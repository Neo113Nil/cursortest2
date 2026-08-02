package com.android.volley;

/* loaded from: classes3.dex */
public class NetworkDispatcher extends java.lang.Thread {
    private final com.android.volley.ResponseDelivery Camera2StreamConfigurationMap;
    private final com.android.volley.Network getHighResolutionOutputSizeshNQ4ISI;
    private final com.android.volley.Cache getHighSpeedVideoFpsRanges;
    private volatile boolean getHighSpeedVideoFpsRangesFor = false;
    private final java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> getHighSpeedVideoSizes;

    public NetworkDispatcher(java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> blockingQueue, com.android.volley.Network network, com.android.volley.Cache cache, com.android.volley.ResponseDelivery responseDelivery) {
        this.getHighSpeedVideoSizes = blockingQueue;
        this.getHighResolutionOutputSizeshNQ4ISI = network;
        this.getHighSpeedVideoFpsRanges = cache;
        this.Camera2StreamConfigurationMap = responseDelivery;
    }

    public void quit() {
        this.getHighSpeedVideoFpsRangesFor = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        android.os.Process.setThreadPriority(10);
        while (true) {
            try {
                getHighSpeedVideoSizes();
            } catch (java.lang.InterruptedException unused) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    java.lang.Thread.currentThread().interrupt();
                    return;
                }
                com.android.volley.VolleyLog.e("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new java.lang.Object[0]);
            }
        }
    }

    private void getHighSpeedVideoSizes() throws java.lang.InterruptedException {
        com.android.volley.Request<?> take = this.getHighSpeedVideoSizes.take();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        take.sendEvent(3);
        try {
            try {
                take.addMarker("network-queue-take");
                if (take.isCanceled()) {
                    take.finish("network-discard-cancelled");
                    take.notifyListenerResponseNotUsable();
                    return;
                }
                android.net.TrafficStats.setThreadStatsTag(take.getTrafficStatsTag());
                com.android.volley.NetworkResponse performRequest = this.getHighResolutionOutputSizeshNQ4ISI.performRequest(take);
                take.addMarker("network-http-complete");
                if (performRequest.notModified && take.hasHadResponseDelivered()) {
                    take.finish("not-modified");
                    take.notifyListenerResponseNotUsable();
                    return;
                }
                com.android.volley.Response<?> parseNetworkResponse = take.parseNetworkResponse(performRequest);
                take.addMarker("network-parse-complete");
                if (take.shouldCache() && parseNetworkResponse.cacheEntry != null) {
                    this.getHighSpeedVideoFpsRanges.put(take.getCacheKey(), parseNetworkResponse.cacheEntry);
                    take.addMarker("network-cache-written");
                }
                take.markDelivered();
                this.Camera2StreamConfigurationMap.postResponse(take, parseNetworkResponse);
                take.notifyListenerResponseReceived(parseNetworkResponse);
            } catch (com.android.volley.VolleyError e) {
                e.Camera2StreamConfigurationMap = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                this.Camera2StreamConfigurationMap.postError(take, take.parseNetworkError(e));
                take.notifyListenerResponseNotUsable();
            } catch (java.lang.Exception e2) {
                com.android.volley.VolleyLog.e(e2, "Unhandled exception %s", e2.toString());
                com.android.volley.VolleyError volleyError = new com.android.volley.VolleyError(e2);
                volleyError.Camera2StreamConfigurationMap = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                this.Camera2StreamConfigurationMap.postError(take, volleyError);
                take.notifyListenerResponseNotUsable();
            }
        } finally {
            take.sendEvent(4);
        }
    }
}
