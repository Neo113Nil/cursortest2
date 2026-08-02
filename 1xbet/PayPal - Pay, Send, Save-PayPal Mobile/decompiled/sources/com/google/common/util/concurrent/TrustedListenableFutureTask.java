package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
class TrustedListenableFutureTask<V> extends com.google.common.util.concurrent.FluentFuture.TrustedFuture<V> implements java.util.concurrent.RunnableFuture<V> {
    private volatile com.google.common.util.concurrent.InterruptibleTask<?> task;

    static <V> com.google.common.util.concurrent.TrustedListenableFutureTask<V> create(com.google.common.util.concurrent.AsyncCallable<V> asyncCallable) {
        return new com.google.common.util.concurrent.TrustedListenableFutureTask<>(asyncCallable);
    }

    static <V> com.google.common.util.concurrent.TrustedListenableFutureTask<V> create(java.util.concurrent.Callable<V> callable) {
        return new com.google.common.util.concurrent.TrustedListenableFutureTask<>(callable);
    }

    static <V> com.google.common.util.concurrent.TrustedListenableFutureTask<V> create(java.lang.Runnable runnable, V v) {
        return new com.google.common.util.concurrent.TrustedListenableFutureTask<>(java.util.concurrent.Executors.callable(runnable, v));
    }

    TrustedListenableFutureTask(java.util.concurrent.Callable<V> callable) {
        this.task = new com.google.common.util.concurrent.TrustedListenableFutureTask.TrustedFutureInterruptibleTask(callable);
    }

    TrustedListenableFutureTask(com.google.common.util.concurrent.AsyncCallable<V> asyncCallable) {
        this.task = new com.google.common.util.concurrent.TrustedListenableFutureTask.TrustedFutureInterruptibleAsyncTask(asyncCallable);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        com.google.common.util.concurrent.InterruptibleTask<?> interruptibleTask = this.task;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        this.task = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected void afterDone() {
        com.google.common.util.concurrent.InterruptibleTask<?> interruptibleTask;
        super.afterDone();
        if (wasInterrupted() && (interruptibleTask = this.task) != null) {
            interruptibleTask.interruptTask();
        }
        this.task = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected java.lang.String pendingToString() {
        com.google.common.util.concurrent.InterruptibleTask<?> interruptibleTask = this.task;
        if (interruptibleTask != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("task=[");
            sb.append(interruptibleTask);
            sb.append("]");
            return sb.toString();
        }
        return super.pendingToString();
    }

    final class TrustedFutureInterruptibleTask extends com.google.common.util.concurrent.InterruptibleTask<V> {
        private final java.util.concurrent.Callable<V> callable;

        TrustedFutureInterruptibleTask(java.util.concurrent.Callable<V> callable) {
            this.callable = (java.util.concurrent.Callable) com.google.common.base.Preconditions.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean isDone() {
            return com.google.common.util.concurrent.TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final V runInterruptibly() throws java.lang.Exception {
            return this.callable.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void afterRanInterruptiblySuccess(V v) {
            com.google.common.util.concurrent.TrustedListenableFutureTask.this.set(v);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void afterRanInterruptiblyFailure(java.lang.Throwable th) {
            com.google.common.util.concurrent.TrustedListenableFutureTask.this.setException(th);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final java.lang.String toPendingString() {
            return this.callable.toString();
        }
    }

    /* loaded from: classes9.dex */
    final class TrustedFutureInterruptibleAsyncTask extends com.google.common.util.concurrent.InterruptibleTask<com.google.common.util.concurrent.ListenableFuture<V>> {
        private final com.google.common.util.concurrent.AsyncCallable<V> callable;

        TrustedFutureInterruptibleAsyncTask(com.google.common.util.concurrent.AsyncCallable<V> asyncCallable) {
            this.callable = (com.google.common.util.concurrent.AsyncCallable) com.google.common.base.Preconditions.checkNotNull(asyncCallable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean isDone() {
            return com.google.common.util.concurrent.TrustedListenableFutureTask.this.isDone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final com.google.common.util.concurrent.ListenableFuture<V> runInterruptibly() throws java.lang.Exception {
            return (com.google.common.util.concurrent.ListenableFuture) com.google.common.base.Preconditions.checkNotNull(this.callable.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.callable);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptiblySuccess(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture) {
            com.google.common.util.concurrent.TrustedListenableFutureTask.this.setFuture(listenableFuture);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void afterRanInterruptiblyFailure(java.lang.Throwable th) {
            com.google.common.util.concurrent.TrustedListenableFutureTask.this.setException(th);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final java.lang.String toPendingString() {
            return this.callable.toString();
        }
    }
}
