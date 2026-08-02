package com.android.volley;

/* loaded from: classes7.dex */
public class AsyncRequestQueue extends com.android.volley.RequestQueue {
    private final com.android.volley.AsyncCache Camera2StreamConfigurationMap;
    java.util.concurrent.ExecutorService getHighResolutionOutputSizeshNQ4ISI;
    private java.util.concurrent.ExecutorService getHighSpeedVideoSizes;
    private volatile boolean getHighSpeedVideoSizesFor;
    private final com.android.volley.AsyncNetwork getInputFormats;
    private java.util.concurrent.ScheduledExecutorService getInputSizeshNQ4ISI;
    private final java.lang.Object getOutputFormats;
    private com.android.volley.AsyncRequestQueue.ExecutorFactory getOutputMinFrameDuration;
    private final java.util.List<com.android.volley.Request<?>> getOutputMinFrameDurationlomOqCM;
    private final com.android.volley.WaitingRequestManager getOutputStallDuration;

    public static abstract class ExecutorFactory {
        public abstract java.util.concurrent.ExecutorService createBlockingExecutor(java.util.concurrent.BlockingQueue<java.lang.Runnable> blockingQueue);

        public abstract java.util.concurrent.ExecutorService createNonBlockingExecutor(java.util.concurrent.BlockingQueue<java.lang.Runnable> blockingQueue);

        public abstract java.util.concurrent.ScheduledExecutorService createNonBlockingScheduledExecutor();
    }

    /* synthetic */ AsyncRequestQueue(com.android.volley.Cache cache, com.android.volley.AsyncNetwork asyncNetwork, com.android.volley.AsyncCache asyncCache, com.android.volley.ResponseDelivery responseDelivery, com.android.volley.AsyncRequestQueue.ExecutorFactory executorFactory, byte b) {
        this(cache, asyncNetwork, asyncCache, responseDelivery, executorFactory);
    }

    private AsyncRequestQueue(com.android.volley.Cache cache, com.android.volley.AsyncNetwork asyncNetwork, com.android.volley.AsyncCache asyncCache, com.android.volley.ResponseDelivery responseDelivery, com.android.volley.AsyncRequestQueue.ExecutorFactory executorFactory) {
        super(cache, asyncNetwork, 0, responseDelivery);
        this.getOutputStallDuration = new com.android.volley.WaitingRequestManager(this);
        this.getOutputMinFrameDurationlomOqCM = new java.util.ArrayList();
        this.getHighSpeedVideoSizesFor = false;
        this.getOutputFormats = new java.lang.Object[0];
        this.Camera2StreamConfigurationMap = asyncCache;
        this.getInputFormats = asyncNetwork;
        this.getOutputMinFrameDuration = executorFactory;
    }

    @Override // com.android.volley.RequestQueue
    public void start() {
        stop();
        this.getHighResolutionOutputSizeshNQ4ISI = this.getOutputMinFrameDuration.createNonBlockingExecutor(new java.util.concurrent.PriorityBlockingQueue(11, new java.util.Comparator<java.lang.Runnable>() { // from class: com.android.volley.AsyncRequestQueue.3
            @Override // java.util.Comparator
            public /* synthetic */ int compare(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
                java.lang.Runnable runnable3 = runnable;
                java.lang.Runnable runnable4 = runnable2;
                if (!(runnable3 instanceof com.android.volley.RequestTask)) {
                    return runnable4 instanceof com.android.volley.RequestTask ? -1 : 0;
                }
                if (runnable4 instanceof com.android.volley.RequestTask) {
                    return ((com.android.volley.RequestTask) runnable3).compareTo((com.android.volley.RequestTask) runnable4);
                }
                return 1;
            }
        }));
        this.getHighSpeedVideoSizes = this.getOutputMinFrameDuration.createBlockingExecutor(new java.util.concurrent.PriorityBlockingQueue(11, new java.util.Comparator<java.lang.Runnable>() { // from class: com.android.volley.AsyncRequestQueue.3
            @Override // java.util.Comparator
            public /* synthetic */ int compare(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
                java.lang.Runnable runnable3 = runnable;
                java.lang.Runnable runnable4 = runnable2;
                if (!(runnable3 instanceof com.android.volley.RequestTask)) {
                    return runnable4 instanceof com.android.volley.RequestTask ? -1 : 0;
                }
                if (runnable4 instanceof com.android.volley.RequestTask) {
                    return ((com.android.volley.RequestTask) runnable3).compareTo((com.android.volley.RequestTask) runnable4);
                }
                return 1;
            }
        }));
        this.getInputSizeshNQ4ISI = this.getOutputMinFrameDuration.createNonBlockingScheduledExecutor();
        this.getInputFormats.setBlockingExecutor(this.getHighSpeedVideoSizes);
        this.getInputFormats.setNonBlockingExecutor(this.getHighResolutionOutputSizeshNQ4ISI);
        this.getInputFormats.setNonBlockingScheduledExecutor(this.getInputSizeshNQ4ISI);
        if (this.Camera2StreamConfigurationMap != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.execute(new java.lang.Runnable() { // from class: com.android.volley.AsyncRequestQueue.1
                @Override // java.lang.Runnable
                public void run() {
                    com.android.volley.AsyncRequestQueue.this.Camera2StreamConfigurationMap.initialize(new com.android.volley.AsyncCache.OnWriteCompleteCallback() { // from class: com.android.volley.AsyncRequestQueue.1.1
                        @Override // com.android.volley.AsyncCache.OnWriteCompleteCallback
                        public void onWriteComplete() {
                            com.android.volley.AsyncRequestQueue.getHighSpeedVideoSizes(com.android.volley.AsyncRequestQueue.this);
                        }
                    });
                }
            });
        } else {
            this.getHighSpeedVideoSizes.execute(new java.lang.Runnable() { // from class: com.android.volley.AsyncRequestQueue.2
                @Override // java.lang.Runnable
                public void run() {
                    com.android.volley.AsyncRequestQueue.this.getCache().initialize();
                    com.android.volley.AsyncRequestQueue.this.getHighResolutionOutputSizeshNQ4ISI.execute(new java.lang.Runnable() { // from class: com.android.volley.AsyncRequestQueue.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.android.volley.AsyncRequestQueue.getHighSpeedVideoSizes(com.android.volley.AsyncRequestQueue.this);
                        }
                    });
                }
            });
        }
    }

    @Override // com.android.volley.RequestQueue
    public void stop() {
        java.util.concurrent.ExecutorService executorService = this.getHighResolutionOutputSizeshNQ4ISI;
        if (executorService != null) {
            executorService.shutdownNow();
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
        java.util.concurrent.ExecutorService executorService2 = this.getHighSpeedVideoSizes;
        if (executorService2 != null) {
            executorService2.shutdownNow();
            this.getHighSpeedVideoSizes = null;
        }
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.getInputSizeshNQ4ISI;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.getInputSizeshNQ4ISI = null;
        }
    }

    @Override // com.android.volley.RequestQueue
    final <T> void getHighSpeedVideoFpsRanges(com.android.volley.Request<T> request) {
        if (!this.getHighSpeedVideoSizesFor) {
            synchronized (this.getOutputFormats) {
                if (!this.getHighSpeedVideoSizesFor) {
                    this.getOutputMinFrameDurationlomOqCM.add(request);
                    return;
                }
            }
        }
        if (request.shouldCache()) {
            if (this.Camera2StreamConfigurationMap != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.execute(new com.android.volley.AsyncRequestQueue.CacheTask(request));
                return;
            } else {
                this.getHighSpeedVideoSizes.execute(new com.android.volley.AsyncRequestQueue.CacheTask(request));
                return;
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI.execute(new com.android.volley.AsyncRequestQueue.NetworkTask(request));
    }

    @Override // com.android.volley.RequestQueue
    final <T> void getHighResolutionOutputSizeshNQ4ISI(com.android.volley.Request<T> request) {
        this.getHighResolutionOutputSizeshNQ4ISI.execute(new com.android.volley.AsyncRequestQueue.NetworkTask(request));
    }

    class CacheTask<T> extends com.android.volley.RequestTask<T> {
        CacheTask(com.android.volley.Request<T> request) {
            super(request);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.getOutputMinFrameDuration.isCanceled()) {
                this.getOutputMinFrameDuration.finish("cache-discard-canceled");
                return;
            }
            this.getOutputMinFrameDuration.addMarker("cache-queue-take");
            if (com.android.volley.AsyncRequestQueue.this.Camera2StreamConfigurationMap != null) {
                com.android.volley.AsyncRequestQueue.this.Camera2StreamConfigurationMap.get(this.getOutputMinFrameDuration.getCacheKey(), new com.android.volley.AsyncCache.OnGetCompleteCallback() { // from class: com.android.volley.AsyncRequestQueue.CacheTask.1
                    @Override // com.android.volley.AsyncCache.OnGetCompleteCallback
                    public void onGetComplete(com.android.volley.Cache.Entry entry) {
                        com.android.volley.AsyncRequestQueue.getHighSpeedVideoFpsRangesFor(com.android.volley.AsyncRequestQueue.this, entry, com.android.volley.AsyncRequestQueue.CacheTask.this.getOutputMinFrameDuration);
                    }
                });
            } else {
                com.android.volley.AsyncRequestQueue.getHighSpeedVideoFpsRangesFor(com.android.volley.AsyncRequestQueue.this, com.android.volley.AsyncRequestQueue.this.getCache().get(this.getOutputMinFrameDuration.getCacheKey()), this.getOutputMinFrameDuration);
            }
        }
    }

    class CacheParseTask<T> extends com.android.volley.RequestTask<T> {
        com.android.volley.Cache.Entry getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoFpsRangesFor;

        CacheParseTask(com.android.volley.Request<T> request, com.android.volley.Cache.Entry entry, long j) {
            super(request);
            this.getHighSpeedVideoFpsRanges = entry;
            this.getHighSpeedVideoFpsRangesFor = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.getOutputMinFrameDuration.addMarker("cache-hit");
            com.android.volley.Response<T> parseNetworkResponse = this.getOutputMinFrameDuration.parseNetworkResponse(new com.android.volley.NetworkResponse(200, this.getHighSpeedVideoFpsRanges.data, false, 0L, this.getHighSpeedVideoFpsRanges.allResponseHeaders));
            this.getOutputMinFrameDuration.addMarker("cache-hit-parsed");
            com.android.volley.Cache.Entry entry = this.getHighSpeedVideoFpsRanges;
            if (entry.softTtl >= this.getHighSpeedVideoFpsRangesFor) {
                com.android.volley.AsyncRequestQueue.this.getResponseDelivery().postResponse(this.getOutputMinFrameDuration, parseNetworkResponse);
                return;
            }
            this.getOutputMinFrameDuration.addMarker("cache-hit-refresh-needed");
            this.getOutputMinFrameDuration.setCacheEntry(this.getHighSpeedVideoFpsRanges);
            parseNetworkResponse.intermediate = true;
            if (!com.android.volley.AsyncRequestQueue.this.getOutputStallDuration.getHighSpeedVideoFpsRangesFor(this.getOutputMinFrameDuration)) {
                com.android.volley.AsyncRequestQueue.this.getResponseDelivery().postResponse(this.getOutputMinFrameDuration, parseNetworkResponse, new java.lang.Runnable() { // from class: com.android.volley.AsyncRequestQueue.CacheParseTask.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.android.volley.AsyncRequestQueue asyncRequestQueue = com.android.volley.AsyncRequestQueue.this;
                        asyncRequestQueue.getHighResolutionOutputSizeshNQ4ISI.execute(asyncRequestQueue.new NetworkTask(com.android.volley.AsyncRequestQueue.CacheParseTask.this.getOutputMinFrameDuration));
                    }
                });
            } else {
                com.android.volley.AsyncRequestQueue.this.getResponseDelivery().postResponse(this.getOutputMinFrameDuration, parseNetworkResponse);
            }
        }
    }

    class ParseErrorTask<T> extends com.android.volley.RequestTask<T> {
        com.android.volley.VolleyError getHighSpeedVideoSizes;

        ParseErrorTask(com.android.volley.Request<T> request, com.android.volley.VolleyError volleyError) {
            super(request);
            this.getHighSpeedVideoSizes = volleyError;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.android.volley.AsyncRequestQueue.this.getResponseDelivery().postError(this.getOutputMinFrameDuration, this.getOutputMinFrameDuration.parseNetworkError(this.getHighSpeedVideoSizes));
            this.getOutputMinFrameDuration.notifyListenerResponseNotUsable();
        }
    }

    class NetworkTask<T> extends com.android.volley.RequestTask<T> {
        NetworkTask(com.android.volley.Request<T> request) {
            super(request);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.getOutputMinFrameDuration.isCanceled()) {
                this.getOutputMinFrameDuration.finish("network-discard-cancelled");
                this.getOutputMinFrameDuration.notifyListenerResponseNotUsable();
            } else {
                final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                this.getOutputMinFrameDuration.addMarker("network-queue-take");
                com.android.volley.AsyncRequestQueue.this.getInputFormats.performRequest(this.getOutputMinFrameDuration, new com.android.volley.AsyncNetwork.OnRequestComplete() { // from class: com.android.volley.AsyncRequestQueue.NetworkTask.1
                    @Override // com.android.volley.AsyncNetwork.OnRequestComplete
                    public void onSuccess(com.android.volley.NetworkResponse networkResponse) {
                        com.android.volley.AsyncRequestQueue.NetworkTask.this.getOutputMinFrameDuration.addMarker("network-http-complete");
                        if (!networkResponse.notModified || !com.android.volley.AsyncRequestQueue.NetworkTask.this.getOutputMinFrameDuration.hasHadResponseDelivered()) {
                            com.android.volley.AsyncRequestQueue.this.getHighSpeedVideoSizes.execute(com.android.volley.AsyncRequestQueue.this.new NetworkParseTask(com.android.volley.AsyncRequestQueue.NetworkTask.this.getOutputMinFrameDuration, networkResponse));
                        } else {
                            com.android.volley.AsyncRequestQueue.NetworkTask.this.getOutputMinFrameDuration.finish("not-modified");
                            com.android.volley.AsyncRequestQueue.NetworkTask.this.getOutputMinFrameDuration.notifyListenerResponseNotUsable();
                        }
                    }

                    @Override // com.android.volley.AsyncNetwork.OnRequestComplete
                    public void onError(com.android.volley.VolleyError volleyError) {
                        volleyError.Camera2StreamConfigurationMap = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                        com.android.volley.AsyncRequestQueue.this.getHighSpeedVideoSizes.execute(com.android.volley.AsyncRequestQueue.this.new ParseErrorTask(com.android.volley.AsyncRequestQueue.NetworkTask.this.getOutputMinFrameDuration, volleyError));
                    }
                });
            }
        }
    }

    class NetworkParseTask<T> extends com.android.volley.RequestTask<T> {
        com.android.volley.NetworkResponse getHighSpeedVideoSizes;

        NetworkParseTask(com.android.volley.Request<T> request, com.android.volley.NetworkResponse networkResponse) {
            super(request);
            this.getHighSpeedVideoSizes = networkResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.android.volley.Response<T> parseNetworkResponse = this.getOutputMinFrameDuration.parseNetworkResponse(this.getHighSpeedVideoSizes);
            this.getOutputMinFrameDuration.addMarker("network-parse-complete");
            if (this.getOutputMinFrameDuration.shouldCache() && parseNetworkResponse.cacheEntry != null) {
                if (com.android.volley.AsyncRequestQueue.this.Camera2StreamConfigurationMap != null) {
                    com.android.volley.AsyncRequestQueue.this.getHighResolutionOutputSizeshNQ4ISI.execute(com.android.volley.AsyncRequestQueue.this.new CachePutTask(this.getOutputMinFrameDuration, parseNetworkResponse));
                    return;
                } else {
                    com.android.volley.AsyncRequestQueue.this.getHighSpeedVideoSizes.execute(com.android.volley.AsyncRequestQueue.this.new CachePutTask(this.getOutputMinFrameDuration, parseNetworkResponse));
                    return;
                }
            }
            com.android.volley.AsyncRequestQueue.getHighSpeedVideoFpsRangesFor(com.android.volley.AsyncRequestQueue.this, this.getOutputMinFrameDuration, parseNetworkResponse, false);
        }
    }

    class CachePutTask<T> extends com.android.volley.RequestTask<T> {
        com.android.volley.Response<?> getHighResolutionOutputSizeshNQ4ISI;

        CachePutTask(com.android.volley.Request<T> request, com.android.volley.Response<?> response) {
            super(request);
            this.getHighResolutionOutputSizeshNQ4ISI = response;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.android.volley.AsyncRequestQueue.this.Camera2StreamConfigurationMap != null) {
                com.android.volley.AsyncRequestQueue.this.Camera2StreamConfigurationMap.put(this.getOutputMinFrameDuration.getCacheKey(), this.getHighResolutionOutputSizeshNQ4ISI.cacheEntry, new com.android.volley.AsyncCache.OnWriteCompleteCallback() { // from class: com.android.volley.AsyncRequestQueue.CachePutTask.1
                    @Override // com.android.volley.AsyncCache.OnWriteCompleteCallback
                    public void onWriteComplete() {
                        com.android.volley.AsyncRequestQueue.getHighSpeedVideoFpsRangesFor(com.android.volley.AsyncRequestQueue.this, com.android.volley.AsyncRequestQueue.CachePutTask.this.getOutputMinFrameDuration, com.android.volley.AsyncRequestQueue.CachePutTask.this.getHighResolutionOutputSizeshNQ4ISI, true);
                    }
                });
            } else {
                com.android.volley.AsyncRequestQueue.this.getCache().put(this.getOutputMinFrameDuration.getCacheKey(), this.getHighResolutionOutputSizeshNQ4ISI.cacheEntry);
                com.android.volley.AsyncRequestQueue.getHighSpeedVideoFpsRangesFor(com.android.volley.AsyncRequestQueue.this, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, true);
            }
        }
    }

    public static class Builder {
        private final com.android.volley.AsyncNetwork Camera2StreamConfigurationMap;
        private com.android.volley.AsyncCache getHighSpeedVideoFpsRangesFor = null;
        private com.android.volley.Cache getHighSpeedVideoSizes = null;
        private com.android.volley.AsyncRequestQueue.ExecutorFactory getHighSpeedVideoFpsRanges = null;
        private com.android.volley.ResponseDelivery getHighResolutionOutputSizeshNQ4ISI = null;

        public Builder(com.android.volley.AsyncNetwork asyncNetwork) {
            if (asyncNetwork == null) {
                throw new java.lang.IllegalArgumentException("Network cannot be null");
            }
            this.Camera2StreamConfigurationMap = asyncNetwork;
        }

        public com.android.volley.AsyncRequestQueue.Builder setExecutorFactory(com.android.volley.AsyncRequestQueue.ExecutorFactory executorFactory) {
            this.getHighSpeedVideoFpsRanges = executorFactory;
            return this;
        }

        public com.android.volley.AsyncRequestQueue.Builder setResponseDelivery(com.android.volley.ResponseDelivery responseDelivery) {
            this.getHighResolutionOutputSizeshNQ4ISI = responseDelivery;
            return this;
        }

        public com.android.volley.AsyncRequestQueue.Builder setAsyncCache(com.android.volley.AsyncCache asyncCache) {
            this.getHighSpeedVideoFpsRangesFor = asyncCache;
            return this;
        }

        public com.android.volley.AsyncRequestQueue.Builder setCache(com.android.volley.Cache cache) {
            this.getHighSpeedVideoSizes = cache;
            return this;
        }

        public com.android.volley.AsyncRequestQueue build() {
            com.android.volley.Cache cache = this.getHighSpeedVideoSizes;
            if (cache == null && this.getHighSpeedVideoFpsRangesFor == null) {
                throw new java.lang.IllegalArgumentException("You must set one of the cache objects");
            }
            if (cache == null) {
                this.getHighSpeedVideoSizes = new com.android.volley.AsyncRequestQueue.ThrowingCache((byte) 0);
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = new com.android.volley.ExecutorDelivery(new android.os.Handler(android.os.Looper.getMainLooper()));
            }
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = new com.android.volley.AsyncRequestQueue.ExecutorFactory() { // from class: com.android.volley.AsyncRequestQueue.Builder.1
                    @Override // com.android.volley.AsyncRequestQueue.ExecutorFactory
                    public java.util.concurrent.ExecutorService createNonBlockingExecutor(java.util.concurrent.BlockingQueue<java.lang.Runnable> blockingQueue) {
                        return Camera2StreamConfigurationMap(1, "Non-BlockingExecutor", blockingQueue);
                    }

                    @Override // com.android.volley.AsyncRequestQueue.ExecutorFactory
                    public java.util.concurrent.ExecutorService createBlockingExecutor(java.util.concurrent.BlockingQueue<java.lang.Runnable> blockingQueue) {
                        return Camera2StreamConfigurationMap(4, "BlockingExecutor", blockingQueue);
                    }

                    @Override // com.android.volley.AsyncRequestQueue.ExecutorFactory
                    public java.util.concurrent.ScheduledExecutorService createNonBlockingScheduledExecutor() {
                        return new java.util.concurrent.ScheduledThreadPoolExecutor(0, new com.android.volley.AsyncRequestQueue.Builder.AnonymousClass1.ThreadFactoryC00531("ScheduledExecutor"));
                    }

                    private java.util.concurrent.ThreadPoolExecutor Camera2StreamConfigurationMap(int i, java.lang.String str, java.util.concurrent.BlockingQueue<java.lang.Runnable> blockingQueue) {
                        return new java.util.concurrent.ThreadPoolExecutor(0, i, 60L, java.util.concurrent.TimeUnit.SECONDS, blockingQueue, new com.android.volley.AsyncRequestQueue.Builder.AnonymousClass1.ThreadFactoryC00531(str));
                    }

                    /* renamed from: com.android.volley.AsyncRequestQueue$Builder$1$1, reason: invalid class name and collision with other inner class name */
                    class ThreadFactoryC00531 implements java.util.concurrent.ThreadFactory {
                        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;

                        ThreadFactoryC00531(java.lang.String str) {
                            this.getHighSpeedVideoFpsRangesFor = str;
                        }

                        @Override // java.util.concurrent.ThreadFactory
                        public java.lang.Thread newThread(java.lang.Runnable runnable) {
                            java.lang.Thread newThread = java.util.concurrent.Executors.defaultThreadFactory().newThread(runnable);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Volley-");
                            sb.append(this.getHighSpeedVideoFpsRangesFor);
                            newThread.setName(sb.toString());
                            return newThread;
                        }
                    }
                };
            }
            return new com.android.volley.AsyncRequestQueue(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, (byte) 0);
        }
    }

    static class ThrowingCache implements com.android.volley.Cache {
        private ThrowingCache() {
        }

        /* synthetic */ ThrowingCache(byte b) {
            this();
        }

        @Override // com.android.volley.Cache
        public com.android.volley.Cache.Entry get(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.android.volley.Cache
        public void put(java.lang.String str, com.android.volley.Cache.Entry entry) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.android.volley.Cache
        public void initialize() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.android.volley.Cache
        public void invalidate(java.lang.String str, boolean z) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.android.volley.Cache
        public void remove(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.android.volley.Cache
        public void clear() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    static /* synthetic */ void getHighSpeedVideoSizes(com.android.volley.AsyncRequestQueue asyncRequestQueue) {
        java.util.ArrayList arrayList;
        synchronized (asyncRequestQueue.getOutputFormats) {
            arrayList = new java.util.ArrayList(asyncRequestQueue.getOutputMinFrameDurationlomOqCM);
            asyncRequestQueue.getOutputMinFrameDurationlomOqCM.clear();
            asyncRequestQueue.getHighSpeedVideoSizesFor = true;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            asyncRequestQueue.getHighSpeedVideoFpsRanges((com.android.volley.Request) it.next());
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(com.android.volley.AsyncRequestQueue asyncRequestQueue, com.android.volley.Cache.Entry entry, com.android.volley.Request request) {
        if (entry == null) {
            request.addMarker("cache-miss");
            if (asyncRequestQueue.getOutputStallDuration.getHighSpeedVideoFpsRangesFor(request)) {
                return;
            }
            asyncRequestQueue.getHighResolutionOutputSizeshNQ4ISI.execute(asyncRequestQueue.new NetworkTask(request));
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (entry.ttl < currentTimeMillis) {
            request.addMarker("cache-hit-expired");
            request.setCacheEntry(entry);
            if (asyncRequestQueue.getOutputStallDuration.getHighSpeedVideoFpsRangesFor(request)) {
                return;
            }
            asyncRequestQueue.getHighResolutionOutputSizeshNQ4ISI.execute(asyncRequestQueue.new NetworkTask(request));
            return;
        }
        asyncRequestQueue.getHighSpeedVideoSizes.execute(asyncRequestQueue.new CacheParseTask(request, entry, currentTimeMillis));
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(com.android.volley.AsyncRequestQueue asyncRequestQueue, com.android.volley.Request request, com.android.volley.Response response, boolean z) {
        if (z) {
            request.addMarker("network-cache-written");
        }
        request.markDelivered();
        asyncRequestQueue.getResponseDelivery().postResponse(request, response);
        request.notifyListenerResponseReceived(response);
    }
}
