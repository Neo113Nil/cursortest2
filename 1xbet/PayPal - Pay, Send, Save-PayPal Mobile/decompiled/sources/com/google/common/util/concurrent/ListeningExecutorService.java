package com.google.common.util.concurrent;

@com.google.errorprone.annotations.DoNotMock("Use TestingExecutors.sameThreadScheduledExecutor, or wrap a real Executor from java.util.concurrent.Executors with MoreExecutors.listeningDecorator")
/* loaded from: classes4.dex */
public interface ListeningExecutorService extends java.util.concurrent.ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection) throws java.lang.InterruptedException;

    @Override // java.util.concurrent.ExecutorService
    <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException;

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    com.google.common.util.concurrent.ListenableFuture<?> submit(java.lang.Runnable runnable);

    <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.lang.Runnable runnable, T t);

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    <T> com.google.common.util.concurrent.ListenableFuture<T> submit(java.util.concurrent.Callable<T> callable);

    /* bridge */ /* synthetic */ default java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return submit(runnable, (java.lang.Runnable) obj);
    }
}
