package com.datadog.exec;

/* loaded from: classes8.dex */
public final class CommonTaskExecutor extends java.util.concurrent.AbstractExecutorService {
    public static final com.datadog.exec.CommonTaskExecutor INSTANCE = new com.datadog.exec.CommonTaskExecutor();
    private final java.util.concurrent.ScheduledExecutorService getHighSpeedVideoSizes;

    public interface Task<T> {
        void run(T t);
    }

    private CommonTaskExecutor() {
        java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(com.datadog.exec.DaemonThreadFactory.TASK_SCHEDULER);
        this.getHighSpeedVideoSizes = newSingleThreadScheduledExecutor;
        try {
            java.lang.Runtime.getRuntime().addShutdownHook(new com.datadog.exec.CommonTaskExecutor.ShutdownCallback(newSingleThreadScheduledExecutor, (byte) 0));
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    public final <T> java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(com.datadog.exec.CommonTaskExecutor.Task<T> task, T t, long j, long j2, java.util.concurrent.TimeUnit timeUnit, java.lang.String str) {
        if (!INSTANCE.isShutdown()) {
            try {
                com.datadog.exec.CommonTaskExecutor.PeriodicTask periodicTask = new com.datadog.exec.CommonTaskExecutor.PeriodicTask(task, t);
                try {
                    java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay = this.getHighSpeedVideoSizes.scheduleWithFixedDelay(new com.datadog.exec.CommonTaskExecutor.PeriodicTask(task, t), j, j2, timeUnit);
                    periodicTask.getHighSpeedVideoFpsRangesFor = scheduleWithFixedDelay;
                    return scheduleWithFixedDelay;
                } catch (java.util.concurrent.RejectedExecutionException unused) {
                }
            } catch (java.util.concurrent.RejectedExecutionException unused2) {
            }
        }
        return new com.datadog.exec.CommonTaskExecutor.UnscheduledFuture(str);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.getHighSpeedVideoSizes.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List<java.lang.Runnable> shutdownNow() {
        return this.getHighSpeedVideoSizes.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.getHighSpeedVideoSizes.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.getHighSpeedVideoSizes.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return this.getHighSpeedVideoSizes.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.getHighSpeedVideoSizes.execute(runnable);
    }

    static final class ShutdownCallback extends java.lang.Thread {
        private final java.util.concurrent.ScheduledExecutorService getHighResolutionOutputSizeshNQ4ISI;

        private ShutdownCallback(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
            super("dd-exec-shutdown-hook");
            this.getHighResolutionOutputSizeshNQ4ISI = scheduledExecutorService;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            this.getHighResolutionOutputSizeshNQ4ISI.shutdown();
            try {
                if (this.getHighResolutionOutputSizeshNQ4ISI.awaitTermination(5L, java.util.concurrent.TimeUnit.SECONDS)) {
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.shutdownNow();
            } catch (java.lang.InterruptedException unused) {
                this.getHighResolutionOutputSizeshNQ4ISI.shutdownNow();
            }
        }

        /* synthetic */ ShutdownCallback(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, byte b) {
            this(scheduledExecutorService);
        }
    }

    static class PeriodicTask<T> implements java.lang.Runnable {
        private final java.lang.ref.WeakReference<T> getHighResolutionOutputSizeshNQ4ISI;
        volatile java.util.concurrent.ScheduledFuture<?> getHighSpeedVideoFpsRangesFor = null;
        private final com.datadog.exec.CommonTaskExecutor.Task<T> getHighSpeedVideoSizes;

        public PeriodicTask(com.datadog.exec.CommonTaskExecutor.Task<T> task, T t) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.ref.WeakReference<>(t);
            this.getHighSpeedVideoSizes = task;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t = this.getHighResolutionOutputSizeshNQ4ISI.get();
            if (t != null) {
                this.getHighSpeedVideoSizes.run(t);
            } else if (this.getHighSpeedVideoFpsRangesFor != null) {
                this.getHighSpeedVideoFpsRangesFor.cancel(false);
            }
        }
    }

    static class UnscheduledFuture implements java.util.concurrent.ScheduledFuture<java.lang.Object> {
        private final java.lang.String getHighSpeedVideoFpsRanges;

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return false;
        }

        @Override // java.util.concurrent.Future
        public java.lang.Object get() {
            return null;
        }

        @Override // java.util.concurrent.Future
        public java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
            return null;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(java.util.concurrent.TimeUnit timeUnit) {
            return 0L;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return false;
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed delayed) {
            return 0;
        }

        public UnscheduledFuture(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }
    }
}
