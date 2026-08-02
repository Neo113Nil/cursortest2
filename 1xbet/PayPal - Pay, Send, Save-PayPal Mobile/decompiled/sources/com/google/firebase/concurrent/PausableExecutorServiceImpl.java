package com.google.firebase.concurrent;

/* loaded from: classes9.dex */
final class PausableExecutorServiceImpl implements com.google.firebase.concurrent.PausableExecutorService {
    private final java.util.concurrent.ExecutorService delegateService;
    private final com.google.firebase.concurrent.PausableExecutor pausableDelegate;

    PausableExecutorServiceImpl(boolean z, java.util.concurrent.ExecutorService executorService) {
        this.delegateService = executorService;
        this.pausableDelegate = new com.google.firebase.concurrent.PausableExecutorImpl(z, executorService);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.pausableDelegate.execute(runnable);
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final void pause() {
        this.pausableDelegate.pause();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final void resume() {
        this.pausableDelegate.resume();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final boolean isPaused() {
        return this.pausableDelegate.isPaused();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new java.lang.UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List<java.lang.Runnable> shutdownNow() {
        throw new java.lang.UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.delegateService.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.delegateService.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.delegateService.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> callable) {
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(callable);
        execute(futureTask);
        return futureTask;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> java.util.concurrent.Future<T> submit(final java.lang.Runnable runnable, final T t) {
        return submit(new java.util.concurrent.Callable() { // from class: com.google.firebase.concurrent.PausableExecutorServiceImpl$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.firebase.concurrent.PausableExecutorServiceImpl.lambda$submit$0(runnable, t);
            }
        });
    }

    static /* synthetic */ java.lang.Object lambda$submit$0(java.lang.Runnable runnable, java.lang.Object obj) throws java.lang.Exception {
        runnable.run();
        return obj;
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future<?> submit(final java.lang.Runnable runnable) {
        return submit(new java.util.concurrent.Callable() { // from class: com.google.firebase.concurrent.PausableExecutorServiceImpl$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.firebase.concurrent.PausableExecutorServiceImpl.lambda$submit$1(runnable);
            }
        });
    }

    static /* synthetic */ java.lang.Object lambda$submit$1(java.lang.Runnable runnable) throws java.lang.Exception {
        runnable.run();
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection) throws java.lang.InterruptedException {
        return this.delegateService.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.delegateService.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return (T) this.delegateService.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return (T) this.delegateService.invokeAny(collection, j, timeUnit);
    }
}
