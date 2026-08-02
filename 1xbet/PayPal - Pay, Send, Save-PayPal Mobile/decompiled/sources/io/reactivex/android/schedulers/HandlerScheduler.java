package io.reactivex.android.schedulers;

/* loaded from: classes17.dex */
final class HandlerScheduler extends io.reactivex.Scheduler {
    private final android.os.Handler Camera2StreamConfigurationMap;

    HandlerScheduler(android.os.Handler handler) {
        this.Camera2StreamConfigurationMap = handler;
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        if (runnable == null) {
            throw new java.lang.NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new java.lang.NullPointerException("unit == null");
        }
        io.reactivex.android.schedulers.HandlerScheduler.ScheduledRunnable scheduledRunnable = new io.reactivex.android.schedulers.HandlerScheduler.ScheduledRunnable(this.Camera2StreamConfigurationMap, io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable));
        this.Camera2StreamConfigurationMap.postDelayed(scheduledRunnable, timeUnit.toMillis(j));
        return scheduledRunnable;
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.Scheduler.Worker createWorker() {
        return new io.reactivex.android.schedulers.HandlerScheduler.HandlerWorker(this.Camera2StreamConfigurationMap);
    }

    static final class HandlerWorker extends io.reactivex.Scheduler.Worker {
        private final android.os.Handler getHighSpeedVideoFpsRanges;
        private volatile boolean getHighSpeedVideoFpsRangesFor;

        HandlerWorker(android.os.Handler handler) {
            this.getHighSpeedVideoFpsRanges = handler;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            if (runnable == null) {
                throw new java.lang.NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new java.lang.NullPointerException("unit == null");
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                return io.reactivex.disposables.Disposables.disposed();
            }
            io.reactivex.android.schedulers.HandlerScheduler.ScheduledRunnable scheduledRunnable = new io.reactivex.android.schedulers.HandlerScheduler.ScheduledRunnable(this.getHighSpeedVideoFpsRanges, io.reactivex.plugins.RxJavaPlugins.onSchedule(runnable));
            android.os.Message obtain = android.os.Message.obtain(this.getHighSpeedVideoFpsRanges, scheduledRunnable);
            obtain.obj = this;
            this.getHighSpeedVideoFpsRanges.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.getHighSpeedVideoFpsRangesFor) {
                return scheduledRunnable;
            }
            this.getHighSpeedVideoFpsRanges.removeCallbacks(scheduledRunnable);
            return io.reactivex.disposables.Disposables.disposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighSpeedVideoFpsRanges.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    static final class ScheduledRunnable implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        private final java.lang.Runnable Camera2StreamConfigurationMap;
        private final android.os.Handler getHighResolutionOutputSizeshNQ4ISI;
        private volatile boolean getHighSpeedVideoSizes;

        ScheduledRunnable(android.os.Handler handler, java.lang.Runnable runnable) {
            this.getHighResolutionOutputSizeshNQ4ISI = handler;
            this.Camera2StreamConfigurationMap = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.Camera2StreamConfigurationMap.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes = true;
            this.getHighResolutionOutputSizeshNQ4ISI.removeCallbacks(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes;
        }
    }
}
