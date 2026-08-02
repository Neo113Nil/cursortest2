package com.android.volley;

/* loaded from: classes3.dex */
public class CacheDispatcher extends java.lang.Thread {
    private static final boolean getHighSpeedVideoFpsRanges = com.android.volley.VolleyLog.DEBUG;
    private final java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> Camera2StreamConfigurationMap;
    private final com.android.volley.ResponseDelivery getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> getHighSpeedVideoFpsRangesFor;
    private final com.android.volley.Cache getHighSpeedVideoSizes;
    private volatile boolean getHighSpeedVideoSizesFor = false;
    private final com.android.volley.WaitingRequestManager getInputSizeshNQ4ISI;

    public CacheDispatcher(java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> blockingQueue, java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> blockingQueue2, com.android.volley.Cache cache, com.android.volley.ResponseDelivery responseDelivery) {
        this.Camera2StreamConfigurationMap = blockingQueue;
        this.getHighSpeedVideoFpsRangesFor = blockingQueue2;
        this.getHighSpeedVideoSizes = cache;
        this.getHighResolutionOutputSizeshNQ4ISI = responseDelivery;
        this.getInputSizeshNQ4ISI = new com.android.volley.WaitingRequestManager(this, blockingQueue2, responseDelivery);
    }

    public void quit() {
        this.getHighSpeedVideoSizesFor = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (getHighSpeedVideoFpsRanges) {
            com.android.volley.VolleyLog.v("start new dispatcher", new java.lang.Object[0]);
        }
        android.os.Process.setThreadPriority(10);
        this.getHighSpeedVideoSizes.initialize();
        while (true) {
            try {
                getHighSpeedVideoSizes();
            } catch (java.lang.InterruptedException unused) {
                if (this.getHighSpeedVideoSizesFor) {
                    java.lang.Thread.currentThread().interrupt();
                    return;
                }
                com.android.volley.VolleyLog.e("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new java.lang.Object[0]);
            }
        }
    }

    private void getHighSpeedVideoSizes() throws java.lang.InterruptedException {
        final com.android.volley.Request<?> take = this.Camera2StreamConfigurationMap.take();
        take.addMarker("cache-queue-take");
        take.sendEvent(1);
        try {
            if (take.isCanceled()) {
                take.finish("cache-discard-canceled");
                return;
            }
            com.android.volley.Cache.Entry entry = this.getHighSpeedVideoSizes.get(take.getCacheKey());
            if (entry == null) {
                take.addMarker("cache-miss");
                if (!this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(take)) {
                    this.getHighSpeedVideoFpsRangesFor.put(take);
                }
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (entry.ttl < currentTimeMillis) {
                take.addMarker("cache-hit-expired");
                take.setCacheEntry(entry);
                if (!this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(take)) {
                    this.getHighSpeedVideoFpsRangesFor.put(take);
                }
                return;
            }
            take.addMarker("cache-hit");
            com.android.volley.Response<?> parseNetworkResponse = take.parseNetworkResponse(new com.android.volley.NetworkResponse(entry.data, entry.responseHeaders));
            take.addMarker("cache-hit-parsed");
            if (!parseNetworkResponse.isSuccess()) {
                take.addMarker("cache-parsing-failed");
                this.getHighSpeedVideoSizes.invalidate(take.getCacheKey(), true);
                take.setCacheEntry(null);
                if (!this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(take)) {
                    this.getHighSpeedVideoFpsRangesFor.put(take);
                }
                return;
            }
            if (entry.softTtl < currentTimeMillis) {
                take.addMarker("cache-hit-refresh-needed");
                take.setCacheEntry(entry);
                parseNetworkResponse.intermediate = true;
                if (this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(take)) {
                    this.getHighResolutionOutputSizeshNQ4ISI.postResponse(take, parseNetworkResponse);
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI.postResponse(take, parseNetworkResponse, new java.lang.Runnable() { // from class: com.android.volley.CacheDispatcher.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                com.android.volley.CacheDispatcher.this.getHighSpeedVideoFpsRangesFor.put(take);
                            } catch (java.lang.InterruptedException unused) {
                                java.lang.Thread.currentThread().interrupt();
                            }
                        }
                    });
                }
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.postResponse(take, parseNetworkResponse);
            }
        } finally {
            take.sendEvent(2);
        }
    }
}
