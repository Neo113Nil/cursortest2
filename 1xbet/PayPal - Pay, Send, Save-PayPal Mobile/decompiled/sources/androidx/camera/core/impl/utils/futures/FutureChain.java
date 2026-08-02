package androidx.camera.core.impl.utils.futures;

/* loaded from: classes6.dex */
public class FutureChain<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    private final com.google.common.util.concurrent.ListenableFuture<V> Camera2StreamConfigurationMap;
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<V> getHighSpeedVideoFpsRanges;

    public static <V> androidx.camera.core.impl.utils.futures.FutureChain<V> from(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture) {
        return listenableFuture instanceof androidx.camera.core.impl.utils.futures.FutureChain ? (androidx.camera.core.impl.utils.futures.FutureChain) listenableFuture : new androidx.camera.core.impl.utils.futures.FutureChain<>(listenableFuture);
    }

    public final <T> androidx.camera.core.impl.utils.futures.FutureChain<T> transformAsync(androidx.camera.core.impl.utils.futures.AsyncFunction<? super V, T> asyncFunction, java.util.concurrent.Executor executor) {
        return (androidx.camera.core.impl.utils.futures.FutureChain) androidx.camera.core.impl.utils.futures.Futures.transformAsync(this, asyncFunction, executor);
    }

    public final <T> androidx.camera.core.impl.utils.futures.FutureChain<T> transform(androidx.arch.core.util.Function<? super V, T> function, java.util.concurrent.Executor executor) {
        return (androidx.camera.core.impl.utils.futures.FutureChain) androidx.camera.core.impl.utils.futures.Futures.transform(this, function, executor);
    }

    public final void addCallback(androidx.camera.core.impl.utils.futures.FutureCallback<? super V> futureCallback, java.util.concurrent.Executor executor) {
        androidx.camera.core.impl.utils.futures.Futures.addCallback(this, futureCallback, executor);
    }

    private FutureChain(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture) {
        this.Camera2StreamConfigurationMap = (com.google.common.util.concurrent.ListenableFuture) androidx.core.util.Preconditions.checkNotNull(listenableFuture);
    }

    FutureChain() {
        this.Camera2StreamConfigurationMap = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver<V>() { // from class: androidx.camera.core.impl.utils.futures.FutureChain.1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer<V> completer) {
                androidx.core.util.Preconditions.checkState(androidx.camera.core.impl.utils.futures.FutureChain.this.getHighSpeedVideoFpsRanges == null, "The result can only set once!");
                androidx.camera.core.impl.utils.futures.FutureChain.this.getHighSpeedVideoFpsRanges = completer;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FutureChain[");
                sb.append(androidx.camera.core.impl.utils.futures.FutureChain.this);
                sb.append("]");
                return sb.toString();
            }
        });
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.Camera2StreamConfigurationMap.addListener(runnable, executor);
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
    public V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        return this.Camera2StreamConfigurationMap.get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        return this.Camera2StreamConfigurationMap.get(j, timeUnit);
    }
}
