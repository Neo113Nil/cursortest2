package com.google.common.util.concurrent;

@com.google.errorprone.annotations.DoNotMock("Use FluentFuture.from(Futures.immediate*Future) or SettableFuture")
/* loaded from: classes4.dex */
public abstract class FluentFuture<V> extends com.google.common.util.concurrent.GwtFluentFutureCatchingSpecialization<V> {

    static abstract class TrustedFuture<V> extends com.google.common.util.concurrent.FluentFuture<V> implements com.google.common.util.concurrent.AbstractFuture.Trusted<V> {
        TrustedFuture() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final V get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            return (V) super.get(j, timeUnit);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
        public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }
    }

    FluentFuture() {
    }

    public static <V> com.google.common.util.concurrent.FluentFuture<V> from(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture) {
        if (listenableFuture instanceof com.google.common.util.concurrent.FluentFuture) {
            return (com.google.common.util.concurrent.FluentFuture) listenableFuture;
        }
        return new com.google.common.util.concurrent.ForwardingFluentFuture(listenableFuture);
    }

    @java.lang.Deprecated
    public static <V> com.google.common.util.concurrent.FluentFuture<V> from(com.google.common.util.concurrent.FluentFuture<V> fluentFuture) {
        return (com.google.common.util.concurrent.FluentFuture) com.google.common.base.Preconditions.checkNotNull(fluentFuture);
    }

    public final <X extends java.lang.Throwable> com.google.common.util.concurrent.FluentFuture<V> catching(java.lang.Class<X> cls, com.google.common.base.Function<? super X, ? extends V> function, java.util.concurrent.Executor executor) {
        return (com.google.common.util.concurrent.FluentFuture) com.google.common.util.concurrent.Futures.catching(this, cls, function, executor);
    }

    public final <X extends java.lang.Throwable> com.google.common.util.concurrent.FluentFuture<V> catchingAsync(java.lang.Class<X> cls, com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> asyncFunction, java.util.concurrent.Executor executor) {
        return (com.google.common.util.concurrent.FluentFuture) com.google.common.util.concurrent.Futures.catchingAsync(this, cls, asyncFunction, executor);
    }

    public final com.google.common.util.concurrent.FluentFuture<V> withTimeout(java.time.Duration duration, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return withTimeout(com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS, scheduledExecutorService);
    }

    public final com.google.common.util.concurrent.FluentFuture<V> withTimeout(long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return (com.google.common.util.concurrent.FluentFuture) com.google.common.util.concurrent.Futures.withTimeout(this, j, timeUnit, scheduledExecutorService);
    }

    public final <T> com.google.common.util.concurrent.FluentFuture<T> transformAsync(com.google.common.util.concurrent.AsyncFunction<? super V, T> asyncFunction, java.util.concurrent.Executor executor) {
        return (com.google.common.util.concurrent.FluentFuture) com.google.common.util.concurrent.Futures.transformAsync(this, asyncFunction, executor);
    }

    public final <T> com.google.common.util.concurrent.FluentFuture<T> transform(com.google.common.base.Function<? super V, T> function, java.util.concurrent.Executor executor) {
        return (com.google.common.util.concurrent.FluentFuture) com.google.common.util.concurrent.Futures.transform(this, function, executor);
    }

    public final void addCallback(com.google.common.util.concurrent.FutureCallback<? super V> futureCallback, java.util.concurrent.Executor executor) {
        com.google.common.util.concurrent.Futures.addCallback(this, futureCallback, executor);
    }
}
