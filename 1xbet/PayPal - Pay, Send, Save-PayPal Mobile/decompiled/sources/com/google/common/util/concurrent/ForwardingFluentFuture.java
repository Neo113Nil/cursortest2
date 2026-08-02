package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
final class ForwardingFluentFuture<V> extends com.google.common.util.concurrent.FluentFuture<V> {
    private final com.google.common.util.concurrent.ListenableFuture<V> delegate;

    ForwardingFluentFuture(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture) {
        this.delegate = (com.google.common.util.concurrent.ListenableFuture) com.google.common.base.Preconditions.checkNotNull(listenableFuture);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.delegate.addListener(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.delegate.cancel(z);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.delegate.isCancelled();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public final boolean isDone() {
        return this.delegate.isDone();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public final V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        return this.delegate.get();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public final V get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        return this.delegate.get(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final java.lang.String toString() {
        return this.delegate.toString();
    }
}
