package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
class ImmediateFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    static final com.google.common.util.concurrent.ListenableFuture<?> NULL = new com.google.common.util.concurrent.ImmediateFuture(null);
    private static final com.google.common.util.concurrent.LazyLogger log = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.ImmediateFuture.class);
    private final V value;

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    ImmediateFuture(V v) {
        this.value = v;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(runnable, "Runnable was null.");
        com.google.common.base.Preconditions.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e) {
            java.util.logging.Logger logger = log.get();
            java.util.logging.Level level = java.util.logging.Level.SEVERE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), (java.lang.Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.value;
    }

    @Override // java.util.concurrent.Future
    public V get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException {
        com.google.common.base.Preconditions.checkNotNull(timeUnit);
        return get();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=SUCCESS, result=[");
        sb.append(this.value);
        sb.append("]]");
        return sb.toString();
    }

    static final class ImmediateFailedFuture<V> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V> {
        ImmediateFailedFuture(java.lang.Throwable th) {
            setException(th);
        }
    }

    static final class ImmediateCancelledFuture<V> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V> {
        static final com.google.common.util.concurrent.ImmediateFuture.ImmediateCancelledFuture<java.lang.Object> INSTANCE;

        static {
            INSTANCE = com.google.common.util.concurrent.AbstractFuture.GENERATE_CANCELLATION_CAUSES ? null : new com.google.common.util.concurrent.ImmediateFuture.ImmediateCancelledFuture<>();
        }

        ImmediateCancelledFuture() {
            cancel(false);
        }
    }
}
