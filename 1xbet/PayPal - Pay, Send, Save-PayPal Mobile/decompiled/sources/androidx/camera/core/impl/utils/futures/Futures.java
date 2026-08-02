package androidx.camera.core.impl.utils.futures;

/* loaded from: classes6.dex */
public final class Futures {
    private static final androidx.arch.core.util.Function<?, ?> Camera2StreamConfigurationMap = new androidx.arch.core.util.Function<java.lang.Object, java.lang.Object>() { // from class: androidx.camera.core.impl.utils.futures.Futures.2
        @Override // androidx.arch.core.util.Function
        public java.lang.Object apply(java.lang.Object obj) {
            return obj;
        }
    };

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFuture(V v) {
        if (v == null) {
            return androidx.camera.core.impl.utils.futures.ImmediateFuture.getHighResolutionOutputSizeshNQ4ISI();
        }
        return new androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateSuccessfulFuture(v);
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFailedFuture(java.lang.Throwable th) {
        return new androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateFailedFuture(th);
    }

    public static <V> java.util.concurrent.ScheduledFuture<V> immediateFailedScheduledFuture(java.lang.Throwable th) {
        return new androidx.camera.core.impl.utils.futures.ImmediateFuture.ImmediateFailedScheduledFuture(th);
    }

    public static <I, O> com.google.common.util.concurrent.ListenableFuture<O> transformAsync(com.google.common.util.concurrent.ListenableFuture<I> listenableFuture, androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O> asyncFunction, java.util.concurrent.Executor executor) {
        androidx.camera.core.impl.utils.futures.ChainingListenableFuture chainingListenableFuture = new androidx.camera.core.impl.utils.futures.ChainingListenableFuture(asyncFunction, listenableFuture);
        listenableFuture.addListener(chainingListenableFuture, executor);
        return chainingListenableFuture;
    }

    public static <I, O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> listenableFuture, final androidx.arch.core.util.Function<? super I, ? extends O> function, java.util.concurrent.Executor executor) {
        androidx.core.util.Preconditions.checkNotNull(function);
        return transformAsync(listenableFuture, new androidx.camera.core.impl.utils.futures.AsyncFunction<I, O>() { // from class: androidx.camera.core.impl.utils.futures.Futures.1
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public com.google.common.util.concurrent.ListenableFuture<O> apply(I i) {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(androidx.arch.core.util.Function.this.apply(i));
            }
        }, executor);
    }

    public static <V> void propagate(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture, androidx.concurrent.futures.CallbackToFutureAdapter.Completer<V> completer) {
        propagateTransform(listenableFuture, Camera2StreamConfigurationMap, completer, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    public static <I, O> void propagateTransform(com.google.common.util.concurrent.ListenableFuture<I> listenableFuture, androidx.arch.core.util.Function<? super I, ? extends O> function, androidx.concurrent.futures.CallbackToFutureAdapter.Completer<O> completer, java.util.concurrent.Executor executor) {
        getHighSpeedVideoFpsRangesFor(true, listenableFuture, function, completer, executor);
    }

    private static <I, O> void getHighSpeedVideoFpsRangesFor(boolean z, final com.google.common.util.concurrent.ListenableFuture<I> listenableFuture, final androidx.arch.core.util.Function<? super I, ? extends O> function, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<O> completer, java.util.concurrent.Executor executor) {
        androidx.core.util.Preconditions.checkNotNull(listenableFuture);
        androidx.core.util.Preconditions.checkNotNull(function);
        androidx.core.util.Preconditions.checkNotNull(completer);
        androidx.core.util.Preconditions.checkNotNull(executor);
        addCallback(listenableFuture, new androidx.camera.core.impl.utils.futures.FutureCallback<I>() { // from class: androidx.camera.core.impl.utils.futures.Futures.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(I i) {
                try {
                    androidx.concurrent.futures.CallbackToFutureAdapter.Completer.this.set(function.apply(i));
                } catch (java.lang.Throwable th) {
                    androidx.concurrent.futures.CallbackToFutureAdapter.Completer.this.setException(th);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                androidx.concurrent.futures.CallbackToFutureAdapter.Completer.this.setException(th);
            }
        }, executor);
        if (z) {
            completer.addCancellationListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures.4
                @Override // java.lang.Runnable
                public void run() {
                    com.google.common.util.concurrent.ListenableFuture.this.cancel(true);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        }
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> nonCancellationPropagating(final com.google.common.util.concurrent.ListenableFuture<V> listenableFuture) {
        androidx.core.util.Preconditions.checkNotNull(listenableFuture);
        return listenableFuture.isDone() ? listenableFuture : androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda3
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.core.impl.utils.futures.Futures.Camera2StreamConfigurationMap(com.google.common.util.concurrent.ListenableFuture.this, completer);
            }
        });
    }

    static /* synthetic */ java.lang.Object Camera2StreamConfigurationMap(com.google.common.util.concurrent.ListenableFuture listenableFuture, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        getHighSpeedVideoFpsRangesFor(false, listenableFuture, Camera2StreamConfigurationMap, completer, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        java.lang.StringBuilder sb = new java.lang.StringBuilder("nonCancellationPropagating[");
        sb.append(listenableFuture);
        sb.append("]");
        return sb.toString();
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> successfulAsList(java.util.Collection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> collection) {
        return new androidx.camera.core.impl.utils.futures.ListFuture(new java.util.ArrayList(collection), false, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> allAsList(java.util.Collection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> collection) {
        return new androidx.camera.core.impl.utils.futures.ListFuture(new java.util.ArrayList(collection), true, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    public static <V> void addCallback(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture, androidx.camera.core.impl.utils.futures.FutureCallback<? super V> futureCallback, java.util.concurrent.Executor executor) {
        androidx.core.util.Preconditions.checkNotNull(futureCallback);
        listenableFuture.addListener(new androidx.camera.core.impl.utils.futures.Futures.CallbackListener(listenableFuture, futureCallback), executor);
    }

    static final class CallbackListener<V> implements java.lang.Runnable {
        final androidx.camera.core.impl.utils.futures.FutureCallback<? super V> Camera2StreamConfigurationMap;
        final java.util.concurrent.Future<V> getHighSpeedVideoFpsRangesFor;

        CallbackListener(java.util.concurrent.Future<V> future, androidx.camera.core.impl.utils.futures.FutureCallback<? super V> futureCallback) {
            this.getHighSpeedVideoFpsRangesFor = future;
            this.Camera2StreamConfigurationMap = futureCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.Camera2StreamConfigurationMap.onSuccess(androidx.camera.core.impl.utils.futures.Futures.getDone(this.getHighSpeedVideoFpsRangesFor));
            } catch (java.lang.Error e) {
                e = e;
                this.Camera2StreamConfigurationMap.onFailure(e);
            } catch (java.lang.RuntimeException e2) {
                e = e2;
                this.Camera2StreamConfigurationMap.onFailure(e);
            } catch (java.util.concurrent.ExecutionException e3) {
                java.lang.Throwable cause = e3.getCause();
                if (cause == null) {
                    this.Camera2StreamConfigurationMap.onFailure(e3);
                } else {
                    this.Camera2StreamConfigurationMap.onFailure(cause);
                }
            }
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(",");
            sb.append(this.Camera2StreamConfigurationMap);
            return sb.toString();
        }
    }

    public static <V> V getDone(java.util.concurrent.Future<V> future) throws java.util.concurrent.ExecutionException {
        androidx.core.util.Preconditions.checkState(future.isDone(), "Future was expected to be done, ".concat(java.lang.String.valueOf(future)));
        return (V) getUninterruptibly(future);
    }

    public static <V> V getUninterruptibly(java.util.concurrent.Future<V> future) throws java.util.concurrent.ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
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
        return v;
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> makeTimeoutFuture(final long j, final java.util.concurrent.ScheduledExecutorService scheduledExecutorService, final com.google.common.util.concurrent.ListenableFuture<V> listenableFuture) {
        return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.core.impl.utils.futures.Futures.Camera2StreamConfigurationMap(com.google.common.util.concurrent.ListenableFuture.this, scheduledExecutorService, j, completer);
            }
        });
    }

    static /* synthetic */ java.lang.Object Camera2StreamConfigurationMap(final com.google.common.util.concurrent.ListenableFuture listenableFuture, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, final long j, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        propagate(listenableFuture, completer);
        if (!listenableFuture.isDone()) {
            final java.util.concurrent.ScheduledFuture schedule = scheduledExecutorService.schedule(new java.util.concurrent.Callable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda7
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return androidx.camera.core.impl.utils.futures.Futures.Camera2StreamConfigurationMap(androidx.concurrent.futures.CallbackToFutureAdapter.Completer.this, listenableFuture, j);
                }
            }, j, java.util.concurrent.TimeUnit.MILLISECONDS);
            listenableFuture.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    schedule.cancel(true);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TimeoutFuture[");
        sb.append(listenableFuture);
        sb.append("]");
        return sb.toString();
    }

    static /* synthetic */ java.lang.Boolean Camera2StreamConfigurationMap(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer, com.google.common.util.concurrent.ListenableFuture listenableFuture, long j) throws java.lang.Exception {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Future[");
        sb.append(listenableFuture);
        sb.append("] is not done within ");
        sb.append(j);
        sb.append(" ms.");
        return java.lang.Boolean.valueOf(completer.setException(new java.util.concurrent.TimeoutException(sb.toString())));
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> makeTimeoutFuture(final long j, final java.util.concurrent.ScheduledExecutorService scheduledExecutorService, final V v, final boolean z, final com.google.common.util.concurrent.ListenableFuture<V> listenableFuture) {
        return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda4
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.core.impl.utils.futures.Futures.Camera2StreamConfigurationMap(com.google.common.util.concurrent.ListenableFuture.this, scheduledExecutorService, v, z, j, completer);
            }
        });
    }

    static /* synthetic */ java.lang.Object Camera2StreamConfigurationMap(final com.google.common.util.concurrent.ListenableFuture listenableFuture, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, final java.lang.Object obj, final boolean z, long j, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        propagate(listenableFuture, completer);
        if (!listenableFuture.isDone()) {
            final java.util.concurrent.ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.impl.utils.futures.Futures.getHighSpeedVideoSizes(androidx.concurrent.futures.CallbackToFutureAdapter.Completer.this, obj, z, listenableFuture);
                }
            }, j, java.util.concurrent.TimeUnit.MILLISECONDS);
            listenableFuture.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    schedule.cancel(true);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TimeoutFuture[");
        sb.append(listenableFuture);
        sb.append("]");
        return sb.toString();
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer, java.lang.Object obj, boolean z, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        completer.set(obj);
        if (z) {
            listenableFuture.cancel(true);
        }
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<java.lang.Void> transformAsyncOnCompletion(final com.google.common.util.concurrent.ListenableFuture<V> listenableFuture) {
        return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.core.impl.utils.futures.Futures.getHighResolutionOutputSizeshNQ4ISI(com.google.common.util.concurrent.ListenableFuture.this, completer);
            }
        });
    }

    static /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.google.common.util.concurrent.ListenableFuture listenableFuture, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        listenableFuture.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.concurrent.futures.CallbackToFutureAdapter.Completer.this.set(null);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        java.lang.StringBuilder sb = new java.lang.StringBuilder("transformVoidFuture [");
        sb.append(listenableFuture);
        sb.append("]");
        return sb.toString();
    }

    private Futures() {
    }
}
