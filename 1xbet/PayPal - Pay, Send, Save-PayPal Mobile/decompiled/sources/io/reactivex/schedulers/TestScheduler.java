package io.reactivex.schedulers;

/* loaded from: classes17.dex */
public final class TestScheduler extends io.reactivex.Scheduler {
    volatile long Camera2StreamConfigurationMap;
    long getHighSpeedVideoFpsRanges;
    final java.util.Queue<io.reactivex.schedulers.TestScheduler.TimedRunnable> getHighSpeedVideoSizes = new java.util.concurrent.PriorityBlockingQueue(11);

    public TestScheduler() {
    }

    public TestScheduler(long j, java.util.concurrent.TimeUnit timeUnit) {
        this.Camera2StreamConfigurationMap = timeUnit.toNanos(j);
    }

    static final class TimedRunnable implements java.lang.Comparable<io.reactivex.schedulers.TestScheduler.TimedRunnable> {
        final long Camera2StreamConfigurationMap;
        final io.reactivex.schedulers.TestScheduler.TestWorker getHighResolutionOutputSizeshNQ4ISI;
        final java.lang.Runnable getHighSpeedVideoFpsRanges;
        final long getHighSpeedVideoSizes;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(io.reactivex.schedulers.TestScheduler.TimedRunnable timedRunnable) {
            io.reactivex.schedulers.TestScheduler.TimedRunnable timedRunnable2 = timedRunnable;
            long j = this.Camera2StreamConfigurationMap;
            long j2 = timedRunnable2.Camera2StreamConfigurationMap;
            if (j == j2) {
                return io.reactivex.internal.functions.ObjectHelper.compare(this.getHighSpeedVideoSizes, timedRunnable2.getHighSpeedVideoSizes);
            }
            return io.reactivex.internal.functions.ObjectHelper.compare(j, j2);
        }

        TimedRunnable(io.reactivex.schedulers.TestScheduler.TestWorker testWorker, long j, java.lang.Runnable runnable, long j2) {
            this.Camera2StreamConfigurationMap = j;
            this.getHighSpeedVideoFpsRanges = runnable;
            this.getHighResolutionOutputSizeshNQ4ISI = testWorker;
            this.getHighSpeedVideoSizes = j2;
        }

        public final java.lang.String toString() {
            long j = this.Camera2StreamConfigurationMap;
            return java.lang.String.format("TimedRunnable(time = %d, run = %s)", java.lang.Long.valueOf(j), this.getHighSpeedVideoFpsRanges.toString());
        }
    }

    @Override // io.reactivex.Scheduler
    public final long now(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.Camera2StreamConfigurationMap, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final void advanceTimeBy(long j, java.util.concurrent.TimeUnit timeUnit) {
        advanceTimeTo(this.Camera2StreamConfigurationMap + timeUnit.toNanos(j), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final void advanceTimeTo(long j, java.util.concurrent.TimeUnit timeUnit) {
        getHighSpeedVideoSizes(timeUnit.toNanos(j));
    }

    public final void triggerActions() {
        getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap);
    }

    private void getHighSpeedVideoSizes(long j) {
        while (true) {
            io.reactivex.schedulers.TestScheduler.TimedRunnable peek = this.getHighSpeedVideoSizes.peek();
            if (peek == null || peek.Camera2StreamConfigurationMap > j) {
                break;
            }
            this.Camera2StreamConfigurationMap = peek.Camera2StreamConfigurationMap == 0 ? this.Camera2StreamConfigurationMap : peek.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes.remove(peek);
            if (!peek.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor) {
                peek.getHighSpeedVideoFpsRanges.run();
            }
        }
        this.Camera2StreamConfigurationMap = j;
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.Scheduler.Worker createWorker() {
        return new io.reactivex.schedulers.TestScheduler.TestWorker();
    }

    final class TestWorker extends io.reactivex.Scheduler.Worker {
        volatile boolean getHighSpeedVideoFpsRangesFor;

        TestWorker() {
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            long j2 = io.reactivex.schedulers.TestScheduler.this.Camera2StreamConfigurationMap;
            long nanos = timeUnit.toNanos(j);
            io.reactivex.schedulers.TestScheduler testScheduler = io.reactivex.schedulers.TestScheduler.this;
            long j3 = testScheduler.getHighSpeedVideoFpsRanges;
            testScheduler.getHighSpeedVideoFpsRanges = 1 + j3;
            io.reactivex.schedulers.TestScheduler.TimedRunnable timedRunnable = new io.reactivex.schedulers.TestScheduler.TimedRunnable(this, j2 + nanos, runnable, j3);
            io.reactivex.schedulers.TestScheduler.this.getHighSpeedVideoSizes.add(timedRunnable);
            return io.reactivex.disposables.Disposables.fromRunnable(new io.reactivex.schedulers.TestScheduler.TestWorker.QueueRemove(timedRunnable));
        }

        @Override // io.reactivex.Scheduler.Worker
        public final io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            io.reactivex.schedulers.TestScheduler testScheduler = io.reactivex.schedulers.TestScheduler.this;
            long j = testScheduler.getHighSpeedVideoFpsRanges;
            testScheduler.getHighSpeedVideoFpsRanges = 1 + j;
            io.reactivex.schedulers.TestScheduler.TimedRunnable timedRunnable = new io.reactivex.schedulers.TestScheduler.TimedRunnable(this, 0L, runnable, j);
            io.reactivex.schedulers.TestScheduler.this.getHighSpeedVideoSizes.add(timedRunnable);
            return io.reactivex.disposables.Disposables.fromRunnable(new io.reactivex.schedulers.TestScheduler.TestWorker.QueueRemove(timedRunnable));
        }

        @Override // io.reactivex.Scheduler.Worker
        public final long now(java.util.concurrent.TimeUnit timeUnit) {
            return io.reactivex.schedulers.TestScheduler.this.now(timeUnit);
        }

        final class QueueRemove implements java.lang.Runnable {
            final io.reactivex.schedulers.TestScheduler.TimedRunnable getHighSpeedVideoSizes;

            QueueRemove(io.reactivex.schedulers.TestScheduler.TimedRunnable timedRunnable) {
                this.getHighSpeedVideoSizes = timedRunnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                io.reactivex.schedulers.TestScheduler.this.getHighSpeedVideoSizes.remove(this.getHighSpeedVideoSizes);
            }
        }
    }
}
