package io.reactivex.internal.schedulers;

/* loaded from: classes17.dex */
public final class ComputationScheduler extends io.reactivex.Scheduler implements io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport {
    static final io.reactivex.internal.schedulers.RxThreadFactory Camera2StreamConfigurationMap;
    static final int getHighSpeedVideoFpsRanges;
    static final io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker getHighSpeedVideoFpsRangesFor;
    static final io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool getHighSpeedVideoSizes;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool> getHighSpeedVideoSizesFor;
    final java.util.concurrent.ThreadFactory getOutputMinFrameDuration;

    static {
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        int intValue = java.lang.Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        getHighSpeedVideoFpsRanges = availableProcessors;
        io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker poolWorker = new io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker(new io.reactivex.internal.schedulers.RxThreadFactory("RxComputationShutdown"));
        getHighSpeedVideoFpsRangesFor = poolWorker;
        poolWorker.dispose();
        io.reactivex.internal.schedulers.RxThreadFactory rxThreadFactory = new io.reactivex.internal.schedulers.RxThreadFactory("RxComputationThreadPool", java.lang.Math.max(1, java.lang.Math.min(10, java.lang.Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        Camera2StreamConfigurationMap = rxThreadFactory;
        io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool fixedSchedulerPool = new io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool(0, rxThreadFactory);
        getHighSpeedVideoSizes = fixedSchedulerPool;
        for (io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker poolWorker2 : fixedSchedulerPool.getHighSpeedVideoFpsRanges) {
            poolWorker2.dispose();
        }
    }

    static final class FixedSchedulerPool implements io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport {
        final io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker[] getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;
        long getHighSpeedVideoSizes;

        FixedSchedulerPool(int i, java.util.concurrent.ThreadFactory threadFactory) {
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoFpsRanges = new io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.getHighSpeedVideoFpsRanges[i2] = new io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker(threadFactory);
            }
        }

        public final io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker getHighSpeedVideoFpsRangesFor() {
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                return io.reactivex.internal.schedulers.ComputationScheduler.getHighSpeedVideoFpsRangesFor;
            }
            io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker[] poolWorkerArr = this.getHighSpeedVideoFpsRanges;
            long j = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = 1 + j;
            return poolWorkerArr[(int) (j % i)];
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
        public final void createWorkers(int i, io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            if (i2 == 0) {
                for (int i3 = 0; i3 < i; i3++) {
                    workerCallback.onWorker(i3, io.reactivex.internal.schedulers.ComputationScheduler.getHighSpeedVideoFpsRangesFor);
                }
                return;
            }
            int i4 = ((int) this.getHighSpeedVideoSizes) % i2;
            for (int i5 = 0; i5 < i; i5++) {
                workerCallback.onWorker(i5, new io.reactivex.internal.schedulers.ComputationScheduler.EventLoopWorker(this.getHighSpeedVideoFpsRanges[i4]));
                i4++;
                if (i4 == i2) {
                    i4 = 0;
                }
            }
            this.getHighSpeedVideoSizes = i4;
        }
    }

    public ComputationScheduler() {
        this(Camera2StreamConfigurationMap);
    }

    public ComputationScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        this.getOutputMinFrameDuration = threadFactory;
        this.getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicReference<>(getHighSpeedVideoSizes);
        start();
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.Scheduler.Worker createWorker() {
        return new io.reactivex.internal.schedulers.ComputationScheduler.EventLoopWorker(this.getHighSpeedVideoSizesFor.get().getHighSpeedVideoFpsRangesFor());
    }

    @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
    public final void createWorkers(int i, io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
        io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "number > 0 required");
        this.getHighSpeedVideoSizesFor.get().createWorkers(i, workerCallback);
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.getHighSpeedVideoSizesFor.get().getHighSpeedVideoFpsRangesFor().scheduleDirect(runnable, j, timeUnit);
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return this.getHighSpeedVideoSizesFor.get().getHighSpeedVideoFpsRangesFor().schedulePeriodicallyDirect(runnable, j, j2, timeUnit);
    }

    @Override // io.reactivex.Scheduler
    public final void start() {
        io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool fixedSchedulerPool = new io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool(getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration);
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizesFor, getHighSpeedVideoSizes, fixedSchedulerPool)) {
            return;
        }
        for (io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker poolWorker : fixedSchedulerPool.getHighSpeedVideoFpsRanges) {
            poolWorker.dispose();
        }
    }

    @Override // io.reactivex.Scheduler
    public final void shutdown() {
        io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool fixedSchedulerPool;
        io.reactivex.internal.schedulers.ComputationScheduler.FixedSchedulerPool fixedSchedulerPool2;
        do {
            fixedSchedulerPool = this.getHighSpeedVideoSizesFor.get();
            fixedSchedulerPool2 = getHighSpeedVideoSizes;
            if (fixedSchedulerPool == fixedSchedulerPool2) {
                return;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizesFor, fixedSchedulerPool, fixedSchedulerPool2));
        for (io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker poolWorker : fixedSchedulerPool.getHighSpeedVideoFpsRanges) {
            poolWorker.dispose();
        }
    }

    static final class EventLoopWorker extends io.reactivex.Scheduler.Worker {
        volatile boolean Camera2StreamConfigurationMap;
        private final io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker getHighResolutionOutputSizeshNQ4ISI;
        private final io.reactivex.internal.disposables.ListCompositeDisposable getHighSpeedVideoFpsRanges;
        private final io.reactivex.internal.disposables.ListCompositeDisposable getHighSpeedVideoFpsRangesFor;
        private final io.reactivex.disposables.CompositeDisposable getHighSpeedVideoSizes;

        EventLoopWorker(io.reactivex.internal.schedulers.ComputationScheduler.PoolWorker poolWorker) {
            this.getHighResolutionOutputSizeshNQ4ISI = poolWorker;
            io.reactivex.internal.disposables.ListCompositeDisposable listCompositeDisposable = new io.reactivex.internal.disposables.ListCompositeDisposable();
            this.getHighSpeedVideoFpsRanges = listCompositeDisposable;
            io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
            this.getHighSpeedVideoSizes = compositeDisposable;
            io.reactivex.internal.disposables.ListCompositeDisposable listCompositeDisposable2 = new io.reactivex.internal.disposables.ListCompositeDisposable();
            this.getHighSpeedVideoFpsRangesFor = listCompositeDisposable2;
            listCompositeDisposable2.add(listCompositeDisposable);
            listCompositeDisposable2.add(compositeDisposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable) {
            if (this.Camera2StreamConfigurationMap) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            return this.getHighResolutionOutputSizeshNQ4ISI.scheduleActual(runnable, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, this.getHighSpeedVideoFpsRanges);
        }

        @Override // io.reactivex.Scheduler.Worker
        public final io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            if (this.Camera2StreamConfigurationMap) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            return this.getHighResolutionOutputSizeshNQ4ISI.scheduleActual(runnable, j, timeUnit, this.getHighSpeedVideoSizes);
        }
    }

    static final class PoolWorker extends io.reactivex.internal.schedulers.NewThreadWorker {
        PoolWorker(java.util.concurrent.ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}
