package io.reactivex.internal.schedulers;

/* loaded from: classes17.dex */
public final class TrampolineScheduler extends io.reactivex.Scheduler {
    private static final io.reactivex.internal.schedulers.TrampolineScheduler getHighSpeedVideoFpsRanges = new io.reactivex.internal.schedulers.TrampolineScheduler();

    public static io.reactivex.internal.schedulers.TrampolineScheduler instance() {
        return getHighSpeedVideoFpsRanges;
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.Scheduler.Worker createWorker() {
        return new io.reactivex.internal.schedulers.TrampolineScheduler.TrampolineWorker();
    }

    TrampolineScheduler() {
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable) {
        io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable).run();
        return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable).run();
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            io.reactivex.plugins.RxJavaPlugins.onError(e);
        }
        return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
    }

    static final class TrampolineWorker extends io.reactivex.Scheduler.Worker implements io.reactivex.disposables.Disposable {
        volatile boolean Camera2StreamConfigurationMap;
        final java.util.concurrent.PriorityBlockingQueue<io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable> getHighSpeedVideoSizes = new java.util.concurrent.PriorityBlockingQueue<>();
        private final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.concurrent.atomic.AtomicInteger getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger();

        TrampolineWorker() {
        }

        @Override // io.reactivex.Scheduler.Worker
        public final io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable) {
            return getHighResolutionOutputSizeshNQ4ISI(runnable, now(java.util.concurrent.TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.Scheduler.Worker
        public final io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            long now = now(java.util.concurrent.TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return getHighResolutionOutputSizeshNQ4ISI(new io.reactivex.internal.schedulers.TrampolineScheduler.SleepingRunnable(runnable, this, now), now);
        }

        private io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI(java.lang.Runnable runnable, long j) {
            if (this.Camera2StreamConfigurationMap) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable timedRunnable = new io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable(runnable, java.lang.Long.valueOf(j), this.getHighResolutionOutputSizeshNQ4ISI.incrementAndGet());
            this.getHighSpeedVideoSizes.add(timedRunnable);
            if (this.getHighSpeedVideoFpsRanges.getAndIncrement() == 0) {
                int i = 1;
                while (!this.Camera2StreamConfigurationMap) {
                    io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable poll = this.getHighSpeedVideoSizes.poll();
                    if (poll != null) {
                        if (!poll.getHighSpeedVideoSizes) {
                            poll.Camera2StreamConfigurationMap.run();
                        }
                    } else {
                        i = this.getHighSpeedVideoFpsRanges.addAndGet(-i);
                        if (i == 0) {
                            return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
                        }
                    }
                }
                this.getHighSpeedVideoSizes.clear();
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            return io.reactivex.disposables.Disposables.fromRunnable(new io.reactivex.internal.schedulers.TrampolineScheduler.TrampolineWorker.AppendToQueueTask(timedRunnable));
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap;
        }

        final class AppendToQueueTask implements java.lang.Runnable {
            final io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable getHighResolutionOutputSizeshNQ4ISI;

            AppendToQueueTask(io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable timedRunnable) {
                this.getHighResolutionOutputSizeshNQ4ISI = timedRunnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes = true;
                io.reactivex.internal.schedulers.TrampolineScheduler.TrampolineWorker.this.getHighSpeedVideoSizes.remove(this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }
    }

    static final class TimedRunnable implements java.lang.Comparable<io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable> {
        final java.lang.Runnable Camera2StreamConfigurationMap;
        final int getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable timedRunnable) {
            io.reactivex.internal.schedulers.TrampolineScheduler.TimedRunnable timedRunnable2 = timedRunnable;
            int compare = io.reactivex.internal.functions.ObjectHelper.compare(this.getHighSpeedVideoFpsRangesFor, timedRunnable2.getHighSpeedVideoFpsRangesFor);
            return compare == 0 ? io.reactivex.internal.functions.ObjectHelper.compare(this.getHighResolutionOutputSizeshNQ4ISI, timedRunnable2.getHighResolutionOutputSizeshNQ4ISI) : compare;
        }

        TimedRunnable(java.lang.Runnable runnable, java.lang.Long l, int i) {
            this.Camera2StreamConfigurationMap = runnable;
            this.getHighSpeedVideoFpsRangesFor = l.longValue();
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }
    }

    static final class SleepingRunnable implements java.lang.Runnable {
        private final java.lang.Runnable getHighSpeedVideoFpsRanges;
        private final io.reactivex.internal.schedulers.TrampolineScheduler.TrampolineWorker getHighSpeedVideoFpsRangesFor;
        private final long getHighSpeedVideoSizes;

        SleepingRunnable(java.lang.Runnable runnable, io.reactivex.internal.schedulers.TrampolineScheduler.TrampolineWorker trampolineWorker, long j) {
            this.getHighSpeedVideoFpsRanges = runnable;
            this.getHighSpeedVideoFpsRangesFor = trampolineWorker;
            this.getHighSpeedVideoSizes = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap) {
                return;
            }
            long now = this.getHighSpeedVideoFpsRangesFor.now(java.util.concurrent.TimeUnit.MILLISECONDS);
            long j = this.getHighSpeedVideoSizes;
            if (j > now) {
                try {
                    java.lang.Thread.sleep(j - now);
                } catch (java.lang.InterruptedException e) {
                    java.lang.Thread.currentThread().interrupt();
                    io.reactivex.plugins.RxJavaPlugins.onError(e);
                    return;
                }
            }
            if (this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap) {
                return;
            }
            this.getHighSpeedVideoFpsRanges.run();
        }
    }
}
