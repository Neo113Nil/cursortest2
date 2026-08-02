package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
final class DirectExecutorService extends com.google.common.util.concurrent.AbstractListeningExecutorService {
    private final java.lang.Object lock = new java.lang.Object();
    private int runningTasks = 0;
    private boolean shutdown = false;

    DirectExecutorService() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        startTask();
        try {
            runnable.run();
        } finally {
            endTask();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean z;
        synchronized (this.lock) {
            z = this.shutdown;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        synchronized (this.lock) {
            this.shutdown = true;
            if (this.runningTasks == 0) {
                this.lock.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List<java.lang.Runnable> shutdownNow() {
        shutdown();
        return com.google.common.collect.ImmutableList.of();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean z;
        synchronized (this.lock) {
            if (this.shutdown) {
                z = this.runningTasks == 0;
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        long nanos = timeUnit.toNanos(j);
        synchronized (this.lock) {
            while (true) {
                if (this.shutdown && this.runningTasks == 0) {
                    return true;
                }
                if (nanos <= 0) {
                    return false;
                }
                long nanoTime = java.lang.System.nanoTime();
                java.util.concurrent.TimeUnit.NANOSECONDS.timedWait(this.lock, nanos);
                nanos -= java.lang.System.nanoTime() - nanoTime;
            }
        }
    }

    private void startTask() {
        synchronized (this.lock) {
            if (this.shutdown) {
                throw new java.util.concurrent.RejectedExecutionException("Executor already shutdown");
            }
            this.runningTasks++;
        }
    }

    private void endTask() {
        synchronized (this.lock) {
            int i = this.runningTasks - 1;
            this.runningTasks = i;
            if (i == 0) {
                this.lock.notifyAll();
            }
        }
    }
}
