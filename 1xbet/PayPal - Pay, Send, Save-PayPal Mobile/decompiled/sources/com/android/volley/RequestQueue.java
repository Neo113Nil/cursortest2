package com.android.volley;

/* loaded from: classes3.dex */
public class RequestQueue {
    private com.android.volley.CacheDispatcher Camera2StreamConfigurationMap;
    private final com.android.volley.Cache getHighResolutionOutputSizeshNQ4ISI;
    final java.util.Set<com.android.volley.Request<?>> getHighSpeedVideoFpsRanges;
    final java.util.List<com.android.volley.RequestQueue.RequestFinishedListener> getHighSpeedVideoFpsRangesFor;
    private final java.util.concurrent.PriorityBlockingQueue<com.android.volley.Request<?>> getHighSpeedVideoSizes;
    private final java.util.concurrent.PriorityBlockingQueue<com.android.volley.Request<?>> getHighSpeedVideoSizesFor;
    private final com.android.volley.ResponseDelivery getInputFormats;
    private final com.android.volley.Network getInputSizeshNQ4ISI;
    private final java.util.List<com.android.volley.RequestQueue.RequestEventListener> getOutputFormats;
    private final com.android.volley.NetworkDispatcher[] getOutputMinFrameDuration;
    private final java.util.concurrent.atomic.AtomicInteger getOutputMinFrameDurationlomOqCM;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RequestEvent {
        public static final int REQUEST_CACHE_LOOKUP_FINISHED = 2;
        public static final int REQUEST_CACHE_LOOKUP_STARTED = 1;
        public static final int REQUEST_FINISHED = 5;
        public static final int REQUEST_NETWORK_DISPATCH_FINISHED = 4;
        public static final int REQUEST_NETWORK_DISPATCH_STARTED = 3;
        public static final int REQUEST_QUEUED = 0;
    }

    public interface RequestEventListener {
        void onRequestEvent(com.android.volley.Request<?> request, int i);
    }

    /* loaded from: classes7.dex */
    public interface RequestFilter {
        boolean apply(com.android.volley.Request<?> request);
    }

    @java.lang.Deprecated
    public interface RequestFinishedListener<T> {
        void onRequestFinished(com.android.volley.Request<T> request);
    }

    public RequestQueue(com.android.volley.Cache cache, com.android.volley.Network network, int i, com.android.volley.ResponseDelivery responseDelivery) {
        this.getOutputMinFrameDurationlomOqCM = new java.util.concurrent.atomic.AtomicInteger();
        this.getHighSpeedVideoFpsRanges = new java.util.HashSet();
        this.getHighSpeedVideoSizes = new java.util.concurrent.PriorityBlockingQueue<>();
        this.getHighSpeedVideoSizesFor = new java.util.concurrent.PriorityBlockingQueue<>();
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        this.getOutputFormats = new java.util.ArrayList();
        this.getHighResolutionOutputSizeshNQ4ISI = cache;
        this.getInputSizeshNQ4ISI = network;
        this.getOutputMinFrameDuration = new com.android.volley.NetworkDispatcher[i];
        this.getInputFormats = responseDelivery;
    }

    public RequestQueue(com.android.volley.Cache cache, com.android.volley.Network network, int i) {
        this(cache, network, i, new com.android.volley.ExecutorDelivery(new android.os.Handler(android.os.Looper.getMainLooper())));
    }

    public RequestQueue(com.android.volley.Cache cache, com.android.volley.Network network) {
        this(cache, network, 4);
    }

    public void start() {
        stop();
        com.android.volley.CacheDispatcher cacheDispatcher = new com.android.volley.CacheDispatcher(this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats);
        this.Camera2StreamConfigurationMap = cacheDispatcher;
        cacheDispatcher.start();
        for (int i = 0; i < this.getOutputMinFrameDuration.length; i++) {
            com.android.volley.NetworkDispatcher networkDispatcher = new com.android.volley.NetworkDispatcher(this.getHighSpeedVideoSizesFor, this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats);
            this.getOutputMinFrameDuration[i] = networkDispatcher;
            networkDispatcher.start();
        }
    }

    public void stop() {
        com.android.volley.CacheDispatcher cacheDispatcher = this.Camera2StreamConfigurationMap;
        if (cacheDispatcher != null) {
            cacheDispatcher.quit();
        }
        for (com.android.volley.NetworkDispatcher networkDispatcher : this.getOutputMinFrameDuration) {
            if (networkDispatcher != null) {
                networkDispatcher.quit();
            }
        }
    }

    public int getSequenceNumber() {
        return this.getOutputMinFrameDurationlomOqCM.incrementAndGet();
    }

    public com.android.volley.Cache getCache() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void cancelAll(com.android.volley.RequestQueue.RequestFilter requestFilter) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            for (com.android.volley.Request<?> request : this.getHighSpeedVideoFpsRanges) {
                if (requestFilter.apply(request)) {
                    request.cancel();
                }
            }
        }
    }

    public void cancelAll(final java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        cancelAll(new com.android.volley.RequestQueue.RequestFilter() { // from class: com.android.volley.RequestQueue.1
            @Override // com.android.volley.RequestQueue.RequestFilter
            public boolean apply(com.android.volley.Request<?> request) {
                return request.getTag() == obj;
            }
        });
    }

    public <T> com.android.volley.Request<T> add(com.android.volley.Request<T> request) {
        request.setRequestQueue(this);
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRanges.add(request);
        }
        request.setSequence(getSequenceNumber());
        request.addMarker("add-to-queue");
        getHighResolutionOutputSizeshNQ4ISI(request, 0);
        getHighSpeedVideoFpsRanges(request);
        return request;
    }

    <T> void getHighSpeedVideoFpsRanges(com.android.volley.Request<T> request) {
        if (!request.shouldCache()) {
            getHighResolutionOutputSizeshNQ4ISI(request);
        } else {
            this.getHighSpeedVideoSizes.add(request);
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI(com.android.volley.Request<?> request, int i) {
        synchronized (this.getOutputFormats) {
            java.util.Iterator<com.android.volley.RequestQueue.RequestEventListener> it = this.getOutputFormats.iterator();
            while (it.hasNext()) {
                it.next().onRequestEvent(request, i);
            }
        }
    }

    public void addRequestEventListener(com.android.volley.RequestQueue.RequestEventListener requestEventListener) {
        synchronized (this.getOutputFormats) {
            this.getOutputFormats.add(requestEventListener);
        }
    }

    public void removeRequestEventListener(com.android.volley.RequestQueue.RequestEventListener requestEventListener) {
        synchronized (this.getOutputFormats) {
            this.getOutputFormats.remove(requestEventListener);
        }
    }

    @java.lang.Deprecated
    public <T> void addRequestFinishedListener(com.android.volley.RequestQueue.RequestFinishedListener<T> requestFinishedListener) {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRangesFor.add(requestFinishedListener);
        }
    }

    @java.lang.Deprecated
    public <T> void removeRequestFinishedListener(com.android.volley.RequestQueue.RequestFinishedListener<T> requestFinishedListener) {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRangesFor.remove(requestFinishedListener);
        }
    }

    public com.android.volley.ResponseDelivery getResponseDelivery() {
        return this.getInputFormats;
    }

    <T> void getHighResolutionOutputSizeshNQ4ISI(com.android.volley.Request<T> request) {
        this.getHighSpeedVideoSizesFor.add(request);
    }
}
