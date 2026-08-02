package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
public abstract class ForwardingFuture<V> extends com.google.common.collect.ForwardingObject implements java.util.concurrent.Future<V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract java.util.concurrent.Future<? extends V> delegate();

    protected ForwardingFuture() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return delegate().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return delegate().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return delegate().isDone();
    }

    @Override // java.util.concurrent.Future
    public V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        return delegate().get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        return delegate().get(j, timeUnit);
    }

    /* loaded from: classes9.dex */
    public static abstract class SimpleForwardingFuture<V> extends com.google.common.util.concurrent.ForwardingFuture<V> {
        private final java.util.concurrent.Future<V> delegate;

        protected SimpleForwardingFuture(java.util.concurrent.Future<V> future) {
            this.delegate = (java.util.concurrent.Future) com.google.common.base.Preconditions.checkNotNull(future);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public final java.util.concurrent.Future<V> delegate() {
            return this.delegate;
        }
    }
}
