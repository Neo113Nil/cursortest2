package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public class ListenableFutureTask<V> extends java.util.concurrent.FutureTask<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    private final com.google.common.util.concurrent.ExecutionList executionList;

    public static <V> com.google.common.util.concurrent.ListenableFutureTask<V> create(java.util.concurrent.Callable<V> callable) {
        return new com.google.common.util.concurrent.ListenableFutureTask<>(callable);
    }

    public static <V> com.google.common.util.concurrent.ListenableFutureTask<V> create(java.lang.Runnable runnable, V v) {
        return new com.google.common.util.concurrent.ListenableFutureTask<>(runnable, v);
    }

    ListenableFutureTask(java.util.concurrent.Callable<V> callable) {
        super(callable);
        this.executionList = new com.google.common.util.concurrent.ExecutionList();
    }

    ListenableFutureTask(java.lang.Runnable runnable, V v) {
        super(runnable, v);
        this.executionList = new com.google.common.util.concurrent.ExecutionList();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.executionList.add(runnable, executor);
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public V get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException, java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (nanos <= 2147483647999999999L) {
            return (V) super.get(j, timeUnit);
        }
        return (V) super.get(java.lang.Math.min(nanos, 2147483647999999999L), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    @Override // java.util.concurrent.FutureTask
    protected void done() {
        this.executionList.execute();
    }
}
