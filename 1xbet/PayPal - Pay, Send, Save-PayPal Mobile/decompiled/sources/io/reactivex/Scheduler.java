package io.reactivex;

/* loaded from: classes3.dex */
public abstract class Scheduler {
    static final long getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.TimeUnit.MINUTES.toNanos(java.lang.Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public abstract io.reactivex.Scheduler.Worker createWorker();

    public void shutdown() {
    }

    public void start() {
    }

    public static long clockDriftTolerance() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public long now(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(java.lang.System.currentTimeMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable) {
        return scheduleDirect(runnable, 0L, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        io.reactivex.Scheduler.Worker createWorker = createWorker();
        io.reactivex.Scheduler.DisposeTask disposeTask = new io.reactivex.Scheduler.DisposeTask(io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable), createWorker);
        createWorker.schedule(disposeTask, j, timeUnit);
        return disposeTask;
    }

    public io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        io.reactivex.Scheduler.Worker createWorker = createWorker();
        io.reactivex.Scheduler.PeriodicDirectTask periodicDirectTask = new io.reactivex.Scheduler.PeriodicDirectTask(io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable), createWorker);
        io.reactivex.disposables.Disposable schedulePeriodically = createWorker.schedulePeriodically(periodicDirectTask, j, j2, timeUnit);
        return schedulePeriodically == io.reactivex.internal.disposables.EmptyDisposable.INSTANCE ? schedulePeriodically : periodicDirectTask;
    }

    public <S extends io.reactivex.Scheduler & io.reactivex.disposables.Disposable> S when(io.reactivex.functions.Function<io.reactivex.Flowable<io.reactivex.Flowable<io.reactivex.Completable>>, io.reactivex.Completable> function) {
        return new io.reactivex.internal.schedulers.SchedulerWhen(function, this);
    }

    /* loaded from: classes17.dex */
    public static abstract class Worker implements io.reactivex.disposables.Disposable {
        public abstract io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit);

        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable) {
            return schedule(runnable, 0L, java.util.concurrent.TimeUnit.NANOSECONDS);
        }

        public io.reactivex.disposables.Disposable schedulePeriodically(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
            io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable2 = new io.reactivex.internal.disposables.SequentialDisposable(sequentialDisposable);
            java.lang.Runnable onSchedule = io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable);
            long nanos = timeUnit.toNanos(j2);
            long now = now(java.util.concurrent.TimeUnit.NANOSECONDS);
            io.reactivex.disposables.Disposable schedule = schedule(new io.reactivex.Scheduler.Worker.PeriodicTask(now + timeUnit.toNanos(j), onSchedule, now, sequentialDisposable2, nanos), j, timeUnit);
            if (schedule == io.reactivex.internal.disposables.EmptyDisposable.INSTANCE) {
                return schedule;
            }
            sequentialDisposable.replace(schedule);
            return sequentialDisposable2;
        }

        public long now(java.util.concurrent.TimeUnit timeUnit) {
            return timeUnit.convert(java.lang.System.currentTimeMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }

        final class PeriodicTask implements java.lang.Runnable, io.reactivex.schedulers.SchedulerRunnableIntrospection {
            long Camera2StreamConfigurationMap;
            final long getHighResolutionOutputSizeshNQ4ISI;
            long getHighSpeedVideoFpsRanges;
            final java.lang.Runnable getHighSpeedVideoFpsRangesFor;
            final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoSizes;
            long getOutputMinFrameDuration;

            PeriodicTask(long j, java.lang.Runnable runnable, long j2, io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable, long j3) {
                this.getHighSpeedVideoFpsRangesFor = runnable;
                this.getHighSpeedVideoSizes = sequentialDisposable;
                this.getHighResolutionOutputSizeshNQ4ISI = j3;
                this.Camera2StreamConfigurationMap = j2;
                this.getOutputMinFrameDuration = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                long j;
                this.getHighSpeedVideoFpsRangesFor.run();
                if (this.getHighSpeedVideoSizes.isDisposed()) {
                    return;
                }
                long now = io.reactivex.Scheduler.Worker.this.now(java.util.concurrent.TimeUnit.NANOSECONDS);
                long j2 = io.reactivex.Scheduler.getHighResolutionOutputSizeshNQ4ISI;
                long j3 = this.Camera2StreamConfigurationMap;
                if (j2 + now < j3 || now >= j3 + this.getHighResolutionOutputSizeshNQ4ISI + io.reactivex.Scheduler.getHighResolutionOutputSizeshNQ4ISI) {
                    long j4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    long j5 = now + j4;
                    long j6 = this.getHighSpeedVideoFpsRanges + 1;
                    this.getHighSpeedVideoFpsRanges = j6;
                    this.getOutputMinFrameDuration = j5 - (j4 * j6);
                    j = j5;
                } else {
                    long j7 = this.getOutputMinFrameDuration;
                    long j8 = this.getHighSpeedVideoFpsRanges + 1;
                    this.getHighSpeedVideoFpsRanges = j8;
                    j = j7 + (j8 * this.getHighResolutionOutputSizeshNQ4ISI);
                }
                this.Camera2StreamConfigurationMap = now;
                this.getHighSpeedVideoSizes.replace(io.reactivex.Scheduler.Worker.this.schedule(this, j - now, java.util.concurrent.TimeUnit.NANOSECONDS));
            }

            @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
            public final java.lang.Runnable getWrappedRunnable() {
                return this.getHighSpeedVideoFpsRangesFor;
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class PeriodicDirectTask implements io.reactivex.disposables.Disposable, java.lang.Runnable, io.reactivex.schedulers.SchedulerRunnableIntrospection {
        final java.lang.Runnable Camera2StreamConfigurationMap;
        volatile boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.Scheduler.Worker getHighSpeedVideoFpsRangesFor;

        PeriodicDirectTask(java.lang.Runnable runnable, io.reactivex.Scheduler.Worker worker) {
            this.Camera2StreamConfigurationMap = runnable;
            this.getHighSpeedVideoFpsRangesFor = worker;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            try {
                this.Camera2StreamConfigurationMap.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoFpsRangesFor.dispose();
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public final java.lang.Runnable getWrappedRunnable() {
            return this.Camera2StreamConfigurationMap;
        }
    }

    /* loaded from: classes17.dex */
    static final class DisposeTask implements io.reactivex.disposables.Disposable, java.lang.Runnable, io.reactivex.schedulers.SchedulerRunnableIntrospection {
        java.lang.Thread getHighResolutionOutputSizeshNQ4ISI;
        final java.lang.Runnable getHighSpeedVideoFpsRanges;
        final io.reactivex.Scheduler.Worker getHighSpeedVideoFpsRangesFor;

        DisposeTask(java.lang.Runnable runnable, io.reactivex.Scheduler.Worker worker) {
            this.getHighSpeedVideoFpsRanges = runnable;
            this.getHighSpeedVideoFpsRangesFor = worker;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Thread.currentThread();
            try {
                this.getHighSpeedVideoFpsRanges.run();
            } finally {
                dispose();
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighResolutionOutputSizeshNQ4ISI == java.lang.Thread.currentThread()) {
                io.reactivex.Scheduler.Worker worker = this.getHighSpeedVideoFpsRangesFor;
                if (worker instanceof io.reactivex.internal.schedulers.NewThreadWorker) {
                    ((io.reactivex.internal.schedulers.NewThreadWorker) worker).shutdown();
                    return;
                }
            }
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.isDisposed();
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public final java.lang.Runnable getWrappedRunnable() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }
}
