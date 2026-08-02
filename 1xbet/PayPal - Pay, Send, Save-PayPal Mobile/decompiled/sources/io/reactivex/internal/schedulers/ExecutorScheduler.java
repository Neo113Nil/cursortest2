package io.reactivex.internal.schedulers;

/* loaded from: classes17.dex */
public final class ExecutorScheduler extends io.reactivex.Scheduler {
    static final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor = io.reactivex.schedulers.Schedulers.single();
    final java.util.concurrent.Executor getHighSpeedVideoSizes;

    public ExecutorScheduler(java.util.concurrent.Executor executor) {
        this.getHighSpeedVideoSizes = executor;
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.Scheduler.Worker createWorker() {
        return new io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker(this.getHighSpeedVideoSizes);
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable) {
        java.lang.Runnable onSchedule = io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable);
        try {
            if (this.getHighSpeedVideoSizes instanceof java.util.concurrent.ExecutorService) {
                io.reactivex.internal.schedulers.ScheduledDirectTask scheduledDirectTask = new io.reactivex.internal.schedulers.ScheduledDirectTask(onSchedule);
                scheduledDirectTask.setFuture(((java.util.concurrent.ExecutorService) this.getHighSpeedVideoSizes).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker.BooleanRunnable booleanRunnable = new io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker.BooleanRunnable(onSchedule);
            this.getHighSpeedVideoSizes.execute(booleanRunnable);
            return booleanRunnable;
        } catch (java.util.concurrent.RejectedExecutionException e) {
            io.reactivex.plugins.RxJavaPlugins.onError(e);
            return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        java.lang.Runnable onSchedule = io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable);
        if (this.getHighSpeedVideoSizes instanceof java.util.concurrent.ScheduledExecutorService) {
            try {
                io.reactivex.internal.schedulers.ScheduledDirectTask scheduledDirectTask = new io.reactivex.internal.schedulers.ScheduledDirectTask(onSchedule);
                scheduledDirectTask.setFuture(((java.util.concurrent.ScheduledExecutorService) this.getHighSpeedVideoSizes).schedule(scheduledDirectTask, j, timeUnit));
                return scheduledDirectTask;
            } catch (java.util.concurrent.RejectedExecutionException e) {
                io.reactivex.plugins.RxJavaPlugins.onError(e);
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
        }
        io.reactivex.internal.schedulers.ExecutorScheduler.DelayedRunnable delayedRunnable = new io.reactivex.internal.schedulers.ExecutorScheduler.DelayedRunnable(onSchedule);
        delayedRunnable.getHighSpeedVideoFpsRangesFor.replace(getHighSpeedVideoFpsRangesFor.scheduleDirect(new io.reactivex.internal.schedulers.ExecutorScheduler.DelayedDispose(delayedRunnable), j, timeUnit));
        return delayedRunnable;
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        if (this.getHighSpeedVideoSizes instanceof java.util.concurrent.ScheduledExecutorService) {
            try {
                io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask(io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable));
                scheduledDirectPeriodicTask.setFuture(((java.util.concurrent.ScheduledExecutorService) this.getHighSpeedVideoSizes).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (java.util.concurrent.RejectedExecutionException e) {
                io.reactivex.plugins.RxJavaPlugins.onError(e);
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
        }
        return super.schedulePeriodicallyDirect(runnable, j, j2, timeUnit);
    }

    public static final class ExecutorWorker extends io.reactivex.Scheduler.Worker implements java.lang.Runnable {
        volatile boolean getHighSpeedVideoFpsRanges;
        final java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicInteger();
        final io.reactivex.disposables.CompositeDisposable getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.disposables.CompositeDisposable();
        final io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Runnable> getHighSpeedVideoSizes = new io.reactivex.internal.queue.MpscLinkedQueue<>();

        public ExecutorWorker(java.util.concurrent.Executor executor) {
            this.getHighSpeedVideoFpsRangesFor = executor;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable) {
            if (this.getHighSpeedVideoFpsRanges) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker.BooleanRunnable booleanRunnable = new io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker.BooleanRunnable(io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable));
            this.getHighSpeedVideoSizes.offer(booleanRunnable);
            if (this.Camera2StreamConfigurationMap.getAndIncrement() != 0) {
                return booleanRunnable;
            }
            try {
                this.getHighSpeedVideoFpsRangesFor.execute(this);
                return booleanRunnable;
            } catch (java.util.concurrent.RejectedExecutionException e) {
                this.getHighSpeedVideoFpsRanges = true;
                this.getHighSpeedVideoSizes.clear();
                io.reactivex.plugins.RxJavaPlugins.onError(e);
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
        }

        @Override // io.reactivex.Scheduler.Worker
        public final io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            if (j <= 0) {
                return schedule(runnable);
            }
            if (this.getHighSpeedVideoFpsRanges) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
            io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable2 = new io.reactivex.internal.disposables.SequentialDisposable(sequentialDisposable);
            io.reactivex.internal.schedulers.ScheduledRunnable scheduledRunnable = new io.reactivex.internal.schedulers.ScheduledRunnable(new io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker.SequentialDispose(sequentialDisposable2, io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable)), this.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighResolutionOutputSizeshNQ4ISI.add(scheduledRunnable);
            java.util.concurrent.Executor executor = this.getHighSpeedVideoFpsRangesFor;
            if (executor instanceof java.util.concurrent.ScheduledExecutorService) {
                try {
                    scheduledRunnable.setFuture(((java.util.concurrent.ScheduledExecutorService) executor).schedule((java.util.concurrent.Callable) scheduledRunnable, j, timeUnit));
                } catch (java.util.concurrent.RejectedExecutionException e) {
                    this.getHighSpeedVideoFpsRanges = true;
                    io.reactivex.plugins.RxJavaPlugins.onError(e);
                    return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
                }
            } else {
                scheduledRunnable.setFuture(new io.reactivex.internal.schedulers.DisposeOnCancel(io.reactivex.internal.schedulers.ExecutorScheduler.getHighSpeedVideoFpsRangesFor.scheduleDirect(scheduledRunnable, j, timeUnit)));
            }
            sequentialDisposable.replace(scheduledRunnable);
            return sequentialDisposable2;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
            if (this.Camera2StreamConfigurationMap.getAndIncrement() == 0) {
                this.getHighSpeedVideoSizes.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // java.lang.Runnable
        public final void run() {
            io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Runnable> mpscLinkedQueue = this.getHighSpeedVideoSizes;
            int i = 1;
            while (!this.getHighSpeedVideoFpsRanges) {
                do {
                    java.lang.Runnable poll = mpscLinkedQueue.poll();
                    if (poll != null) {
                        poll.run();
                    } else if (this.getHighSpeedVideoFpsRanges) {
                        mpscLinkedQueue.clear();
                        return;
                    } else {
                        i = this.Camera2StreamConfigurationMap.addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                } while (!this.getHighSpeedVideoFpsRanges);
                mpscLinkedQueue.clear();
                return;
            }
            mpscLinkedQueue.clear();
        }

        static final class BooleanRunnable extends java.util.concurrent.atomic.AtomicBoolean implements java.lang.Runnable, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = -2421395018820541164L;
            final java.lang.Runnable Camera2StreamConfigurationMap;

            BooleanRunnable(java.lang.Runnable runnable) {
                this.Camera2StreamConfigurationMap = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get()) {
                    return;
                }
                try {
                    this.Camera2StreamConfigurationMap.run();
                } finally {
                    lazySet(true);
                }
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                lazySet(true);
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return get();
            }
        }

        final class SequentialDispose implements java.lang.Runnable {
            private final java.lang.Runnable Camera2StreamConfigurationMap;
            private final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoFpsRangesFor;

            SequentialDispose(io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable, java.lang.Runnable runnable) {
                this.getHighSpeedVideoFpsRangesFor = sequentialDisposable;
                this.Camera2StreamConfigurationMap = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.getHighSpeedVideoFpsRangesFor.replace(io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker.this.schedule(this.Camera2StreamConfigurationMap));
            }
        }
    }

    static final class DelayedRunnable extends java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> implements java.lang.Runnable, io.reactivex.disposables.Disposable, io.reactivex.schedulers.SchedulerRunnableIntrospection {
        private static final long serialVersionUID = -4101336210206799084L;
        final io.reactivex.internal.disposables.SequentialDisposable Camera2StreamConfigurationMap;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoFpsRangesFor;

        DelayedRunnable(java.lang.Runnable runnable) {
            super(runnable);
            this.getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.disposables.SequentialDisposable();
            this.Camera2StreamConfigurationMap = new io.reactivex.internal.disposables.SequentialDisposable();
        }

        @Override // java.lang.Runnable
        public final void run() {
            java.lang.Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    this.getHighSpeedVideoFpsRangesFor.lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
                    this.Camera2StreamConfigurationMap.lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(null) != null) {
                this.getHighSpeedVideoFpsRangesFor.dispose();
                this.Camera2StreamConfigurationMap.dispose();
            }
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public final java.lang.Runnable getWrappedRunnable() {
            java.lang.Runnable runnable = get();
            return runnable != null ? runnable : io.reactivex.internal.functions.Functions.EMPTY_RUNNABLE;
        }
    }

    final class DelayedDispose implements java.lang.Runnable {
        private final io.reactivex.internal.schedulers.ExecutorScheduler.DelayedRunnable getHighSpeedVideoFpsRangesFor;

        DelayedDispose(io.reactivex.internal.schedulers.ExecutorScheduler.DelayedRunnable delayedRunnable) {
            this.getHighSpeedVideoFpsRangesFor = delayedRunnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap.replace(io.reactivex.internal.schedulers.ExecutorScheduler.this.scheduleDirect(this.getHighSpeedVideoFpsRangesFor));
        }
    }
}
