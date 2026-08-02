package androidx.camera.core;

/* loaded from: classes6.dex */
public class CameraExecutor implements java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService {
    private static final java.util.concurrent.ThreadFactory getHighSpeedVideoSizes = new androidx.camera.core.CameraExecutor.AnonymousClass1();
    final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    java.util.concurrent.ScheduledThreadPoolExecutor getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges();

    /* renamed from: androidx.camera.core.CameraExecutor$1, reason: invalid class name */
    class AnonymousClass1 implements java.util.concurrent.ThreadFactory {
        private final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicInteger(0);

        AnonymousClass1() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(final java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: androidx.camera.core.CameraExecutor$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.CameraExecutor.AnonymousClass1.getHighSpeedVideoFpsRangesFor(runnable);
                }
            });
            thread.setPriority(7);
            thread.setName(java.lang.String.format(java.util.Locale.US, "CameraX-core_camera_%d", java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap.getAndIncrement())));
            return thread;
        }

        static /* synthetic */ void getHighSpeedVideoFpsRangesFor(java.lang.Runnable runnable) {
            android.os.Process.setThreadPriority(-3);
            runnable.run();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        androidx.core.util.Preconditions.checkNotNull(runnable);
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getHighResolutionOutputSizeshNQ4ISI.execute(runnable);
        }
    }

    static java.util.concurrent.ScheduledThreadPoolExecutor getHighSpeedVideoFpsRanges() {
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1, getHighSpeedVideoSizes);
        scheduledThreadPoolExecutor.setKeepAliveTime(0L, java.util.concurrent.TimeUnit.MILLISECONDS);
        scheduledThreadPoolExecutor.setRejectedExecutionHandler(new java.util.concurrent.RejectedExecutionHandler() { // from class: androidx.camera.core.CameraExecutor$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
                androidx.camera.core.Logger.w("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return scheduledThreadPoolExecutor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.ScheduledFuture<?> schedule;
        synchronized (this.Camera2StreamConfigurationMap) {
            schedule = this.getHighResolutionOutputSizeshNQ4ISI.schedule(runnable, j, timeUnit);
        }
        return schedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> java.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.ScheduledFuture<V> schedule;
        synchronized (this.Camera2StreamConfigurationMap) {
            schedule = this.getHighResolutionOutputSizeshNQ4ISI.schedule(callable, j, timeUnit);
        }
        return schedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate;
        synchronized (this.Camera2StreamConfigurationMap) {
            scheduleAtFixedRate = this.getHighResolutionOutputSizeshNQ4ISI.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }
        return scheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay;
        synchronized (this.Camera2StreamConfigurationMap) {
            scheduleWithFixedDelay = this.getHighResolutionOutputSizeshNQ4ISI.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }
        return scheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getHighResolutionOutputSizeshNQ4ISI.shutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List<java.lang.Runnable> shutdownNow() {
        java.util.List<java.lang.Runnable> shutdownNow;
        synchronized (this.Camera2StreamConfigurationMap) {
            shutdownNow = this.getHighResolutionOutputSizeshNQ4ISI.shutdownNow();
        }
        return shutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        boolean isShutdown;
        synchronized (this.Camera2StreamConfigurationMap) {
            isShutdown = this.getHighResolutionOutputSizeshNQ4ISI.isShutdown();
        }
        return isShutdown;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        boolean isTerminated;
        synchronized (this.Camera2StreamConfigurationMap) {
            isTerminated = this.getHighResolutionOutputSizeshNQ4ISI.isTerminated();
        }
        return isTerminated;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        boolean awaitTermination;
        synchronized (this.Camera2StreamConfigurationMap) {
            awaitTermination = this.getHighResolutionOutputSizeshNQ4ISI.awaitTermination(j, timeUnit);
        }
        return awaitTermination;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> callable) {
        java.util.concurrent.Future<T> submit;
        synchronized (this.Camera2StreamConfigurationMap) {
            submit = this.getHighResolutionOutputSizeshNQ4ISI.submit(callable);
        }
        return submit;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.lang.Runnable runnable, T t) {
        java.util.concurrent.Future<T> submit;
        synchronized (this.Camera2StreamConfigurationMap) {
            submit = this.getHighResolutionOutputSizeshNQ4ISI.submit(runnable, t);
        }
        return submit;
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future<?> submit(java.lang.Runnable runnable) {
        java.util.concurrent.Future<?> submit;
        synchronized (this.Camera2StreamConfigurationMap) {
            submit = this.getHighResolutionOutputSizeshNQ4ISI.submit(runnable);
        }
        return submit;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection) throws java.lang.InterruptedException {
        java.util.List<java.util.concurrent.Future<T>> invokeAll;
        synchronized (this.Camera2StreamConfigurationMap) {
            invokeAll = this.getHighResolutionOutputSizeshNQ4ISI.invokeAll(collection);
        }
        return invokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        java.util.List<java.util.concurrent.Future<T>> invokeAll;
        synchronized (this.Camera2StreamConfigurationMap) {
            invokeAll = this.getHighResolutionOutputSizeshNQ4ISI.invokeAll(collection, j, timeUnit);
        }
        return invokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        T t;
        synchronized (this.Camera2StreamConfigurationMap) {
            t = (T) this.getHighResolutionOutputSizeshNQ4ISI.invokeAny(collection);
        }
        return t;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> collection, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        T t;
        synchronized (this.Camera2StreamConfigurationMap) {
            t = (T) this.getHighResolutionOutputSizeshNQ4ISI.invokeAny(collection, j, timeUnit);
        }
        return t;
    }
}
