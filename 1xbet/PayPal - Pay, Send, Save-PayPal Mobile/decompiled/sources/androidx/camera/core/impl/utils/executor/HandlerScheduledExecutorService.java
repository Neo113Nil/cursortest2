package androidx.camera.core.impl.utils.executor;

/* loaded from: classes6.dex */
final class HandlerScheduledExecutorService extends java.util.concurrent.AbstractExecutorService implements java.util.concurrent.ScheduledExecutorService {
    private static java.lang.ThreadLocal<java.util.concurrent.ScheduledExecutorService> Camera2StreamConfigurationMap = new java.lang.ThreadLocal<java.util.concurrent.ScheduledExecutorService>() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.1
        @Override // java.lang.ThreadLocal
        public /* synthetic */ java.util.concurrent.ScheduledExecutorService initialValue() {
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                return androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor();
            }
            if (android.os.Looper.myLooper() != null) {
                return new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService(new android.os.Handler(android.os.Looper.myLooper()));
            }
            return null;
        }
    };
    private final android.os.Handler getHighSpeedVideoFpsRanges;

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    HandlerScheduledExecutorService(android.os.Handler handler) {
        this.getHighSpeedVideoFpsRanges = handler;
    }

    static java.util.concurrent.ScheduledExecutorService getHighSpeedVideoFpsRanges() {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = Camera2StreamConfigurationMap.get();
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper == null) {
            throw new java.lang.IllegalStateException("Current thread has no looper!");
        }
        androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService handlerScheduledExecutorService = new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService(new android.os.Handler(myLooper));
        Camera2StreamConfigurationMap.set(handlerScheduledExecutorService);
        return handlerScheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture<?> schedule(final java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        return schedule(new java.util.concurrent.Callable<java.lang.Void>() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.2
            @Override // java.util.concurrent.Callable
            public /* synthetic */ java.lang.Void call() throws java.lang.Exception {
                runnable.run();
                return null;
            }
        }, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> java.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis() + java.util.concurrent.TimeUnit.MILLISECONDS.convert(j, timeUnit);
        androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture handlerScheduledFuture = new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture(this.getHighSpeedVideoFpsRanges, uptimeMillis, callable);
        if (this.getHighSpeedVideoFpsRanges.postAtTime(handlerScheduledFuture, uptimeMillis)) {
            return handlerScheduledFuture;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(" is shutting down");
        return androidx.camera.core.impl.utils.futures.Futures.immediateFailedScheduledFuture(new java.util.concurrent.RejectedExecutionException(sb.toString()));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new java.lang.UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List<java.lang.Runnable> shutdownNow() {
        throw new java.lang.UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (this.getHighSpeedVideoFpsRanges.post(runnable)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(" is shutting down");
        throw new java.util.concurrent.RejectedExecutionException(sb.toString());
    }

    static class HandlerScheduledFuture<V> implements java.util.concurrent.RunnableScheduledFuture<V> {
        private final com.google.common.util.concurrent.ListenableFuture<V> Camera2StreamConfigurationMap;
        private final java.util.concurrent.Callable<V> getHighSpeedVideoFpsRanges;
        private final long getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicReference<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<V>> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>(null);

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(java.util.concurrent.Delayed delayed) {
            return java.lang.Long.compare(getDelay(java.util.concurrent.TimeUnit.MILLISECONDS), delayed.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
        }

        HandlerScheduledFuture(final android.os.Handler handler, long j, final java.util.concurrent.Callable<V> callable) {
            this.getHighSpeedVideoFpsRangesFor = j;
            this.getHighSpeedVideoFpsRanges = callable;
            this.Camera2StreamConfigurationMap = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver<V>() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.1
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer<V> completer) throws java.util.concurrent.RejectedExecutionException {
                    completer.addCancellationListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.this.getHighSpeedVideoSizes.getAndSet(null) != null) {
                                handler.removeCallbacks(androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.this);
                            }
                        }
                    }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
                    androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService.HandlerScheduledFuture.this.getHighSpeedVideoSizes.set(completer);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("HandlerScheduledFuture-");
                    sb.append(callable.toString());
                    return sb.toString();
                }
            });
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(java.util.concurrent.TimeUnit timeUnit) {
            return timeUnit.convert(this.getHighSpeedVideoFpsRangesFor - java.lang.System.currentTimeMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            androidx.concurrent.futures.CallbackToFutureAdapter.Completer andSet = this.getHighSpeedVideoSizes.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.set(this.getHighSpeedVideoFpsRanges.call());
                } catch (java.lang.Exception e) {
                    andSet.setException(e);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return this.Camera2StreamConfigurationMap.cancel(z);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.Camera2StreamConfigurationMap.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.Camera2StreamConfigurationMap.isDone();
        }

        @Override // java.util.concurrent.Future
        public V get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
            return this.Camera2StreamConfigurationMap.get();
        }

        @Override // java.util.concurrent.Future
        public V get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            return this.Camera2StreamConfigurationMap.get(j, timeUnit);
        }
    }
}
