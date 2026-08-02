package io.reactivex.internal.schedulers;

/* loaded from: classes17.dex */
public class NewThreadWorker extends io.reactivex.Scheduler.Worker implements io.reactivex.disposables.Disposable {
    volatile boolean Camera2StreamConfigurationMap;
    private final java.util.concurrent.ScheduledExecutorService getHighSpeedVideoFpsRanges;

    public NewThreadWorker(java.util.concurrent.ThreadFactory threadFactory) {
        this.getHighSpeedVideoFpsRanges = io.reactivex.internal.schedulers.SchedulerPoolFactory.create(threadFactory);
    }

    @Override // io.reactivex.Scheduler.Worker
    public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable) {
        return schedule(runnable, 0L, null);
    }

    @Override // io.reactivex.Scheduler.Worker
    public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        if (this.Camera2StreamConfigurationMap) {
            return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
        }
        return scheduleActual(runnable, j, timeUnit, null);
    }

    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.Future<?> schedule;
        io.reactivex.internal.schedulers.ScheduledDirectTask scheduledDirectTask = new io.reactivex.internal.schedulers.ScheduledDirectTask(io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable));
        try {
            if (j <= 0) {
                schedule = this.getHighSpeedVideoFpsRanges.submit(scheduledDirectTask);
            } else {
                schedule = this.getHighSpeedVideoFpsRanges.schedule(scheduledDirectTask, j, timeUnit);
            }
            scheduledDirectTask.setFuture(schedule);
            return scheduledDirectTask;
        } catch (java.util.concurrent.RejectedExecutionException e) {
            io.reactivex.plugins.RxJavaPlugins.onError(e);
            return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
        }
    }

    public io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.Future<?> schedule;
        java.lang.Runnable onSchedule = io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable);
        if (j2 <= 0) {
            io.reactivex.internal.schedulers.InstantPeriodicTask instantPeriodicTask = new io.reactivex.internal.schedulers.InstantPeriodicTask(onSchedule, this.getHighSpeedVideoFpsRanges);
            try {
                if (j <= 0) {
                    schedule = this.getHighSpeedVideoFpsRanges.submit(instantPeriodicTask);
                } else {
                    schedule = this.getHighSpeedVideoFpsRanges.schedule(instantPeriodicTask, j, timeUnit);
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
            scheduledDirectPeriodicTask.setFuture(this.getHighSpeedVideoFpsRanges.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (java.util.concurrent.RejectedExecutionException e2) {
            io.reactivex.plugins.RxJavaPlugins.onError(e2);
            return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
        }
    }

    public io.reactivex.internal.schedulers.ScheduledRunnable scheduleActual(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.internal.disposables.DisposableContainer disposableContainer) {
        java.util.concurrent.Future<?> schedule;
        io.reactivex.internal.schedulers.ScheduledRunnable scheduledRunnable = new io.reactivex.internal.schedulers.ScheduledRunnable(io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable), disposableContainer);
        if (disposableContainer != null && !disposableContainer.add(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            if (j <= 0) {
                schedule = this.getHighSpeedVideoFpsRanges.submit((java.util.concurrent.Callable) scheduledRunnable);
            } else {
                schedule = this.getHighSpeedVideoFpsRanges.schedule((java.util.concurrent.Callable) scheduledRunnable, j, timeUnit);
            }
            scheduledRunnable.setFuture(schedule);
            return scheduledRunnable;
        } catch (java.util.concurrent.RejectedExecutionException e) {
            if (disposableContainer != null) {
                disposableContainer.remove(scheduledRunnable);
            }
            io.reactivex.plugins.RxJavaPlugins.onError(e);
            return scheduledRunnable;
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.Camera2StreamConfigurationMap = true;
        this.getHighSpeedVideoFpsRanges.shutdownNow();
    }

    public void shutdown() {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.Camera2StreamConfigurationMap = true;
        this.getHighSpeedVideoFpsRanges.shutdown();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.Camera2StreamConfigurationMap;
    }
}
