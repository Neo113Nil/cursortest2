package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
abstract class WrappingExecutorService implements java.util.concurrent.ExecutorService {
    private final java.util.concurrent.ExecutorService delegate;

    protected abstract <T> java.util.concurrent.Callable<T> wrapTask(java.util.concurrent.Callable<T> callable);

    protected WrappingExecutorService(java.util.concurrent.ExecutorService executorService) {
        this.delegate = (java.util.concurrent.ExecutorService) com.google.common.base.Preconditions.checkNotNull(executorService);
    }

    protected java.lang.Runnable wrapTask(java.lang.Runnable runnable) {
        final java.util.concurrent.Callable wrapTask = wrapTask(java.util.concurrent.Executors.callable(runnable, null));
        return new java.lang.Runnable() { // from class: com.google.common.util.concurrent.WrappingExecutorService$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.common.util.concurrent.WrappingExecutorService.lambda$wrapTask$0(wrapTask);
            }
        };
    }

    static /* synthetic */ void lambda$wrapTask$0(java.util.concurrent.Callable callable) {
        try {
            callable.call();
        } catch (java.lang.Exception e) {
            com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(e);
            com.google.common.base.Throwables.throwIfUnchecked(e);
            throw new java.lang.RuntimeException(e);
        }
    }

    private <T> com.google.common.collect.ImmutableList<java.util.concurrent.Callable<T>> wrapTasks(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection) {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        java.util.Iterator<? extends java.util.concurrent.Callable<T>> it = collection.iterator();
        while (it.hasNext()) {
            builder.add((com.google.common.collect.ImmutableList.Builder) wrapTask(it.next()));
        }
        return builder.build();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.delegate.execute(wrapTask(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> callable) {
        return this.delegate.submit(wrapTask((java.util.concurrent.Callable) com.google.common.base.Preconditions.checkNotNull(callable)));
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future<?> submit(java.lang.Runnable runnable) {
        return this.delegate.submit(wrapTask(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> java.util.concurrent.Future<T> submit(java.lang.Runnable runnable, T t) {
        return this.delegate.submit(wrapTask(runnable), t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection) throws java.lang.InterruptedException {
        return this.delegate.invokeAll(wrapTasks(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.delegate.invokeAll(wrapTasks(collection), j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        return (T) this.delegate.invokeAny(wrapTasks(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        return (T) this.delegate.invokeAny(wrapTasks(collection), j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.delegate.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List<java.lang.Runnable> shutdownNow() {
        return this.delegate.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.delegate.awaitTermination(j, timeUnit);
    }
}
