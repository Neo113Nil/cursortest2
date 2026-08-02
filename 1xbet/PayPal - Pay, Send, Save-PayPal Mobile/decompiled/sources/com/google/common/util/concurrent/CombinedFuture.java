package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
final class CombinedFuture<V> extends com.google.common.util.concurrent.AggregateFuture<java.lang.Object, V> {

    @com.google.errorprone.annotations.concurrent.LazyInit
    private com.google.common.util.concurrent.CombinedFuture<V>.CombinedFutureInterruptibleTask<?> task;

    @Override // com.google.common.util.concurrent.AggregateFuture
    final void collectOneValue(int i, java.lang.Object obj) {
    }

    CombinedFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<?>> immutableCollection, boolean z, java.util.concurrent.Executor executor, com.google.common.util.concurrent.AsyncCallable<V> asyncCallable) {
        super(immutableCollection, z, false);
        this.task = new com.google.common.util.concurrent.CombinedFuture.AsyncCallableInterruptibleTask(asyncCallable, executor);
        init();
    }

    CombinedFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<?>> immutableCollection, boolean z, java.util.concurrent.Executor executor, java.util.concurrent.Callable<V> callable) {
        super(immutableCollection, z, false);
        this.task = new com.google.common.util.concurrent.CombinedFuture.CallableInterruptibleTask(callable, executor);
        init();
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    final void handleAllCompleted() {
        com.google.common.util.concurrent.CombinedFuture<V>.CombinedFutureInterruptibleTask<?> combinedFutureInterruptibleTask = this.task;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.execute();
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    final void releaseResources(com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.releaseResources(releaseResourcesReason);
        if (releaseResourcesReason == com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE) {
            this.task = null;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void interruptTask() {
        com.google.common.util.concurrent.CombinedFuture<V>.CombinedFutureInterruptibleTask<?> combinedFutureInterruptibleTask = this.task;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.interruptTask();
        }
    }

    abstract class CombinedFutureInterruptibleTask<T> extends com.google.common.util.concurrent.InterruptibleTask<T> {
        private final java.util.concurrent.Executor listenerExecutor;

        abstract void setValue(T t);

        CombinedFutureInterruptibleTask(java.util.concurrent.Executor executor) {
            this.listenerExecutor = (java.util.concurrent.Executor) com.google.common.base.Preconditions.checkNotNull(executor);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean isDone() {
            return com.google.common.util.concurrent.CombinedFuture.this.isDone();
        }

        final void execute() {
            try {
                this.listenerExecutor.execute(this);
            } catch (java.util.concurrent.RejectedExecutionException e) {
                com.google.common.util.concurrent.CombinedFuture.this.setException(e);
            }
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void afterRanInterruptiblySuccess(T t) {
            com.google.common.util.concurrent.CombinedFuture.this.task = null;
            setValue(t);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void afterRanInterruptiblyFailure(java.lang.Throwable th) {
            com.google.common.util.concurrent.CombinedFuture.this.task = null;
            if (th instanceof java.util.concurrent.ExecutionException) {
                com.google.common.util.concurrent.CombinedFuture.this.setException(((java.util.concurrent.ExecutionException) th).getCause());
            } else if (th instanceof java.util.concurrent.CancellationException) {
                com.google.common.util.concurrent.CombinedFuture.this.cancel(false);
            } else {
                com.google.common.util.concurrent.CombinedFuture.this.setException(th);
            }
        }
    }

    final class AsyncCallableInterruptibleTask extends com.google.common.util.concurrent.CombinedFuture<V>.CombinedFutureInterruptibleTask<com.google.common.util.concurrent.ListenableFuture<V>> {
        private final com.google.common.util.concurrent.AsyncCallable<V> callable;

        AsyncCallableInterruptibleTask(com.google.common.util.concurrent.AsyncCallable<V> asyncCallable, java.util.concurrent.Executor executor) {
            super(executor);
            this.callable = (com.google.common.util.concurrent.AsyncCallable) com.google.common.base.Preconditions.checkNotNull(asyncCallable);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final com.google.common.util.concurrent.ListenableFuture<V> runInterruptibly() throws java.lang.Exception {
            return (com.google.common.util.concurrent.ListenableFuture) com.google.common.base.Preconditions.checkNotNull(this.callable.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.callable);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        public final void setValue(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture) {
            com.google.common.util.concurrent.CombinedFuture.this.setFuture(listenableFuture);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final java.lang.String toPendingString() {
            return this.callable.toString();
        }
    }

    final class CallableInterruptibleTask extends com.google.common.util.concurrent.CombinedFuture<V>.CombinedFutureInterruptibleTask<V> {
        private final java.util.concurrent.Callable<V> callable;

        CallableInterruptibleTask(java.util.concurrent.Callable<V> callable, java.util.concurrent.Executor executor) {
            super(executor);
            this.callable = (java.util.concurrent.Callable) com.google.common.base.Preconditions.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final V runInterruptibly() throws java.lang.Exception {
            return this.callable.call();
        }

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        final void setValue(V v) {
            com.google.common.util.concurrent.CombinedFuture.this.set(v);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final java.lang.String toPendingString() {
            return this.callable.toString();
        }
    }
}
