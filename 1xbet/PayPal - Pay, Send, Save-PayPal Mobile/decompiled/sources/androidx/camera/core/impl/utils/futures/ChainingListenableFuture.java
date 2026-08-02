package androidx.camera.core.impl.utils.futures;

/* loaded from: classes6.dex */
class ChainingListenableFuture<I, O> extends androidx.camera.core.impl.utils.futures.FutureChain<O> implements java.lang.Runnable {
    volatile com.google.common.util.concurrent.ListenableFuture<? extends O> Camera2StreamConfigurationMap;
    private com.google.common.util.concurrent.ListenableFuture<? extends I> getHighSpeedVideoFpsRangesFor;
    private androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O> getHighSpeedVideoSizes;
    private final java.util.concurrent.BlockingQueue<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.LinkedBlockingQueue(1);
    private final java.util.concurrent.CountDownLatch getHighSpeedVideoSizesFor = new java.util.concurrent.CountDownLatch(1);

    ChainingListenableFuture(androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O> asyncFunction, com.google.common.util.concurrent.ListenableFuture<? extends I> listenableFuture) {
        this.getHighSpeedVideoSizes = (androidx.camera.core.impl.utils.futures.AsyncFunction) androidx.core.util.Preconditions.checkNotNull(asyncFunction);
        this.getHighSpeedVideoFpsRangesFor = (com.google.common.util.concurrent.ListenableFuture) androidx.core.util.Preconditions.checkNotNull(listenableFuture);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        if (!isDone()) {
            com.google.common.util.concurrent.ListenableFuture<? extends I> listenableFuture = this.getHighSpeedVideoFpsRangesFor;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.getHighSpeedVideoSizesFor.await();
            com.google.common.util.concurrent.ListenableFuture<? extends O> listenableFuture2 = this.Camera2StreamConfigurationMap;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return (O) super.get();
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        if (!isDone()) {
            if (timeUnit != java.util.concurrent.TimeUnit.NANOSECONDS) {
                j = java.util.concurrent.TimeUnit.NANOSECONDS.convert(j, timeUnit);
                timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
            }
            com.google.common.util.concurrent.ListenableFuture<? extends I> listenableFuture = this.getHighSpeedVideoFpsRangesFor;
            if (listenableFuture != null) {
                long nanoTime = java.lang.System.nanoTime();
                listenableFuture.get(j, timeUnit);
                j -= java.lang.Math.max(0L, java.lang.System.nanoTime() - nanoTime);
            }
            long nanoTime2 = java.lang.System.nanoTime();
            if (!this.getHighSpeedVideoSizesFor.await(j, timeUnit)) {
                throw new java.util.concurrent.TimeoutException();
            }
            j -= java.lang.Math.max(0L, java.lang.System.nanoTime() - nanoTime2);
            com.google.common.util.concurrent.ListenableFuture<? extends O> listenableFuture2 = this.Camera2StreamConfigurationMap;
            if (listenableFuture2 != null) {
                listenableFuture2.get(j, timeUnit);
            }
        }
        return (O) super.get(j, timeUnit);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        boolean z2 = false;
        if (!super.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.put(java.lang.Boolean.valueOf(z));
                break;
            } catch (java.lang.InterruptedException unused) {
                z2 = true;
            } catch (java.lang.Throwable th) {
                if (z2) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            java.lang.Thread.currentThread().interrupt();
        }
        com.google.common.util.concurrent.ListenableFuture<? extends I> listenableFuture = this.getHighSpeedVideoFpsRangesFor;
        if (listenableFuture != null) {
            listenableFuture.cancel(z);
        }
        com.google.common.util.concurrent.ListenableFuture<? extends O> listenableFuture2 = this.Camera2StreamConfigurationMap;
        if (listenableFuture2 != null) {
            listenableFuture2.cancel(z);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>, com.google.common.util.concurrent.ListenableFuture<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public void run() {
        ?? r0 = (androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>) null;
        try {
            try {
                try {
                    try {
                        try {
                            final com.google.common.util.concurrent.ListenableFuture<? extends O> apply = this.getHighSpeedVideoSizes.apply(androidx.camera.core.impl.utils.futures.Futures.getUninterruptibly(this.getHighSpeedVideoFpsRangesFor));
                            this.Camera2StreamConfigurationMap = apply;
                            if (isCancelled()) {
                                apply.cancel(((java.lang.Boolean) getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI)).booleanValue());
                                this.Camera2StreamConfigurationMap = null;
                            } else {
                                apply.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.ChainingListenableFuture.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        try {
                                            try {
                                                try {
                                                    androidx.camera.core.impl.utils.futures.ChainingListenableFuture chainingListenableFuture = androidx.camera.core.impl.utils.futures.ChainingListenableFuture.this;
                                                    java.lang.Object uninterruptibly = androidx.camera.core.impl.utils.futures.Futures.getUninterruptibly(apply);
                                                    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<V> completer = chainingListenableFuture.getHighSpeedVideoFpsRanges;
                                                    if (completer != 0) {
                                                        completer.set(uninterruptibly);
                                                    }
                                                } catch (java.util.concurrent.CancellationException unused) {
                                                    androidx.camera.core.impl.utils.futures.ChainingListenableFuture.this.cancel(false);
                                                }
                                            } catch (java.util.concurrent.ExecutionException e) {
                                                androidx.camera.core.impl.utils.futures.ChainingListenableFuture chainingListenableFuture2 = androidx.camera.core.impl.utils.futures.ChainingListenableFuture.this;
                                                java.lang.Throwable cause = e.getCause();
                                                androidx.concurrent.futures.CallbackToFutureAdapter.Completer<V> completer2 = chainingListenableFuture2.getHighSpeedVideoFpsRanges;
                                                if (completer2 != 0) {
                                                    completer2.setException(cause);
                                                }
                                            }
                                        } finally {
                                            androidx.camera.core.impl.utils.futures.ChainingListenableFuture.this.Camera2StreamConfigurationMap = null;
                                        }
                                    }
                                }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
                            }
                        } catch (java.lang.Error e) {
                            androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer = this.getHighSpeedVideoFpsRanges;
                            if (completer != null) {
                                completer.setException(e);
                            }
                        }
                    } catch (java.lang.reflect.UndeclaredThrowableException e2) {
                        java.lang.Throwable cause = e2.getCause();
                        androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer2 = this.getHighSpeedVideoFpsRanges;
                        if (completer2 != null) {
                            completer2.setException(cause);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    this.getHighSpeedVideoSizes = (androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>) r0;
                    this.getHighSpeedVideoFpsRangesFor = (com.google.common.util.concurrent.ListenableFuture<? extends I>) r0;
                    this.getHighSpeedVideoSizesFor.countDown();
                    throw th;
                }
            } catch (java.util.concurrent.CancellationException unused) {
                cancel(false);
            } catch (java.util.concurrent.ExecutionException e3) {
                java.lang.Throwable cause2 = e3.getCause();
                androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer3 = this.getHighSpeedVideoFpsRanges;
                if (completer3 != null) {
                    completer3.setException(cause2);
                }
            }
        } catch (java.lang.Exception e4) {
            androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer4 = this.getHighSpeedVideoFpsRanges;
            if (completer4 != null) {
                completer4.setException(e4);
            }
        }
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        r0 = (androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>) this.getHighSpeedVideoSizesFor;
        r0.countDown();
    }

    private static <E> E getHighSpeedVideoSizes(java.util.concurrent.BlockingQueue<E> blockingQueue) {
        E take;
        boolean z = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return take;
    }
}
