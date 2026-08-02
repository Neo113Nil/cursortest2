package io.reactivex.internal.schedulers;

/* loaded from: classes17.dex */
public final class SingleScheduler extends io.reactivex.Scheduler {
    static final io.reactivex.internal.schedulers.RxThreadFactory Camera2StreamConfigurationMap;
    static final java.util.concurrent.ScheduledExecutorService getHighSpeedVideoFpsRanges;
    final java.util.concurrent.ThreadFactory getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> getHighSpeedVideoSizes;

    static {
        java.util.concurrent.ScheduledExecutorService newScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(0);
        getHighSpeedVideoFpsRanges = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        Camera2StreamConfigurationMap = new io.reactivex.internal.schedulers.RxThreadFactory("RxSingleScheduler", java.lang.Math.max(1, java.lang.Math.min(10, java.lang.Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public SingleScheduler() {
        this(Camera2StreamConfigurationMap);
    }

    public SingleScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ScheduledExecutorService> atomicReference = new java.util.concurrent.atomic.AtomicReference<>();
        this.getHighSpeedVideoSizes = atomicReference;
        this.getHighSpeedVideoFpsRangesFor = threadFactory;
        atomicReference.lazySet(io.reactivex.internal.schedulers.SchedulerPoolFactory.create(threadFactory));
    }

    @Override // io.reactivex.Scheduler
    public final void start() {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = this.getHighSpeedVideoSizes.get();
            if (scheduledExecutorService != getHighSpeedVideoFpsRanges) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = io.reactivex.internal.schedulers.SchedulerPoolFactory.create(this.getHighSpeedVideoFpsRangesFor);
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, scheduledExecutorService, scheduledExecutorService2));
    }

    @Override // io.reactivex.Scheduler
    public final void shutdown() {
        java.util.concurrent.ScheduledExecutorService andSet;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.getHighSpeedVideoSizes.get();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = getHighSpeedVideoFpsRanges;
        if (scheduledExecutorService == scheduledExecutorService2 || (andSet = this.getHighSpeedVideoSizes.getAndSet(scheduledExecutorService2)) == scheduledExecutorService2) {
            return;
        }
        andSet.shutdownNow();
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.Scheduler.Worker createWorker() {
        return new io.reactivex.internal.schedulers.SingleScheduler.ScheduledWorker(this.getHighSpeedVideoSizes.get());
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.Future<?> schedule;
        io.reactivex.internal.schedulers.ScheduledDirectTask scheduledDirectTask = new io.reactivex.internal.schedulers.ScheduledDirectTask(io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable));
        try {
            if (j <= 0) {
                schedule = this.getHighSpeedVideoSizes.get().submit(scheduledDirectTask);
            } else {
                schedule = this.getHighSpeedVideoSizes.get().schedule(scheduledDirectTask, j, timeUnit);
            }
            scheduledDirectTask.setFuture(schedule);
            return scheduledDirectTask;
        } catch (java.util.concurrent.RejectedExecutionException e) {
            io.reactivex.plugins.RxJavaPlugins.onError(e);
            return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.Future<?> schedule;
        java.lang.Runnable onSchedule = io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable);
        if (j2 <= 0) {
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.getHighSpeedVideoSizes.get();
            io.reactivex.internal.schedulers.InstantPeriodicTask instantPeriodicTask = new io.reactivex.internal.schedulers.InstantPeriodicTask(onSchedule, scheduledExecutorService);
            try {
                if (j <= 0) {
                    schedule = scheduledExecutorService.submit(instantPeriodicTask);
                } else {
                    schedule = scheduledExecutorService.schedule(instantPeriodicTask, j, timeUnit);
                }
                instantPeriodicTask.getHighSpeedVideoSizes(schedule);
                return instantPeriodicTask;
            } catch (java.util.concurrent.RejectedExecutionException e) {
                io.reactivex.plugins.RxJavaPlugins.onError(e);
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
        }
        io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask(onSchedule);
        try {
            scheduledDirectPeriodicTask.setFuture(this.getHighSpeedVideoSizes.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (java.util.concurrent.RejectedExecutionException e2) {
            io.reactivex.plugins.RxJavaPlugins.onError(e2);
            return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
        }
    }

    static final class ScheduledWorker extends io.reactivex.Scheduler.Worker {
        volatile boolean getHighSpeedVideoFpsRanges;
        final java.util.concurrent.ScheduledExecutorService getHighSpeedVideoFpsRangesFor;
        final io.reactivex.disposables.CompositeDisposable getHighSpeedVideoSizes = new io.reactivex.disposables.CompositeDisposable();

        ScheduledWorker(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
            this.getHighSpeedVideoFpsRangesFor = scheduledExecutorService;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            java.util.concurrent.Future<?> schedule;
            if (this.getHighSpeedVideoFpsRanges) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            io.reactivex.internal.schedulers.ScheduledRunnable scheduledRunnable = new io.reactivex.internal.schedulers.ScheduledRunnable(io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable), this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoSizes.add(scheduledRunnable);
            try {
                if (j <= 0) {
                    schedule = this.getHighSpeedVideoFpsRangesFor.submit((java.util.concurrent.Callable) scheduledRunnable);
                } else {
                    schedule = this.getHighSpeedVideoFpsRangesFor.schedule((java.util.concurrent.Callable) scheduledRunnable, j, timeUnit);
                }
                scheduledRunnable.setFuture(schedule);
                return scheduledRunnable;
            } catch (java.util.concurrent.RejectedExecutionException e) {
                dispose();
                io.reactivex.plugins.RxJavaPlugins.onError(e);
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoSizes.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }
}
