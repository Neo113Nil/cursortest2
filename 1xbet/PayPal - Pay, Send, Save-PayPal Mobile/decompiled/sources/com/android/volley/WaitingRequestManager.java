package com.android.volley;

/* loaded from: classes3.dex */
class WaitingRequestManager implements com.android.volley.Request.NetworkRequestCompleteListener {
    private final com.android.volley.ResponseDelivery Camera2StreamConfigurationMap;
    private final java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> getHighSpeedVideoFpsRanges;
    private final com.android.volley.RequestQueue getHighSpeedVideoFpsRangesFor;
    private final com.android.volley.CacheDispatcher getHighSpeedVideoSizes;

    WaitingRequestManager(com.android.volley.RequestQueue requestQueue) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
        this.getHighSpeedVideoFpsRangesFor = requestQueue;
        this.Camera2StreamConfigurationMap = requestQueue.getResponseDelivery();
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRanges = null;
    }

    WaitingRequestManager(com.android.volley.CacheDispatcher cacheDispatcher, java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> blockingQueue, com.android.volley.ResponseDelivery responseDelivery) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = responseDelivery;
        this.getHighSpeedVideoSizes = cacheDispatcher;
        this.getHighSpeedVideoFpsRanges = blockingQueue;
    }

    @Override // com.android.volley.Request.NetworkRequestCompleteListener
    public final void getHighSpeedVideoSizes(com.android.volley.Request<?> request, com.android.volley.Response<?> response) {
        java.util.List<com.android.volley.Request<?>> remove;
        if (response.cacheEntry == null || response.cacheEntry.isExpired()) {
            getHighSpeedVideoSizes(request);
            return;
        }
        java.lang.String cacheKey = request.getCacheKey();
        synchronized (this) {
            remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(cacheKey);
        }
        if (remove != null) {
            if (com.android.volley.VolleyLog.DEBUG) {
                com.android.volley.VolleyLog.v("Releasing %d waiting requests for cacheKey=%s.", java.lang.Integer.valueOf(remove.size()), cacheKey);
            }
            java.util.Iterator<com.android.volley.Request<?>> it = remove.iterator();
            while (it.hasNext()) {
                this.Camera2StreamConfigurationMap.postResponse(it.next(), response);
            }
        }
    }

    @Override // com.android.volley.Request.NetworkRequestCompleteListener
    public final void getHighSpeedVideoSizes(com.android.volley.Request<?> request) {
        java.util.concurrent.BlockingQueue<com.android.volley.Request<?>> blockingQueue;
        synchronized (this) {
            java.lang.String cacheKey = request.getCacheKey();
            java.util.List<com.android.volley.Request<?>> remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(cacheKey);
            if (remove != null && !remove.isEmpty()) {
                if (com.android.volley.VolleyLog.DEBUG) {
                    com.android.volley.VolleyLog.v("%d waiting requests for cacheKey=%s; resend to network", java.lang.Integer.valueOf(remove.size()), cacheKey);
                }
                com.android.volley.Request<?> remove2 = remove.remove(0);
                this.getHighResolutionOutputSizeshNQ4ISI.put(cacheKey, remove);
                remove2.setNetworkRequestCompleteListener(this);
                com.android.volley.RequestQueue requestQueue = this.getHighSpeedVideoFpsRangesFor;
                if (requestQueue != null) {
                    requestQueue.getHighResolutionOutputSizeshNQ4ISI(remove2);
                } else if (this.getHighSpeedVideoSizes != null && (blockingQueue = this.getHighSpeedVideoFpsRanges) != null) {
                    try {
                        blockingQueue.put(remove2);
                    } catch (java.lang.InterruptedException e) {
                        com.android.volley.VolleyLog.e("Couldn't add request to queue. %s", e.toString());
                        java.lang.Thread.currentThread().interrupt();
                        this.getHighSpeedVideoSizes.quit();
                    }
                }
            }
        }
    }

    final boolean getHighSpeedVideoFpsRangesFor(com.android.volley.Request<?> request) {
        synchronized (this) {
            java.lang.String cacheKey = request.getCacheKey();
            if (this.getHighResolutionOutputSizeshNQ4ISI.containsKey(cacheKey)) {
                java.util.List<com.android.volley.Request<?>> list = this.getHighResolutionOutputSizeshNQ4ISI.get(cacheKey);
                if (list == null) {
                    list = new java.util.ArrayList<>();
                }
                request.addMarker("waiting-for-response");
                list.add(request);
                this.getHighResolutionOutputSizeshNQ4ISI.put(cacheKey, list);
                if (com.android.volley.VolleyLog.DEBUG) {
                    com.android.volley.VolleyLog.d("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
                }
                return true;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.put(cacheKey, null);
            request.setNetworkRequestCompleteListener(this);
            if (com.android.volley.VolleyLog.DEBUG) {
                com.android.volley.VolleyLog.d("new request, sending to network %s", cacheKey);
            }
            return false;
        }
    }
}
