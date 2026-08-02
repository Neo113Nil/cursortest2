package io.reactivex.internal.schedulers;

/* loaded from: classes17.dex */
public final class IoScheduler extends io.reactivex.Scheduler {
    static final io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool Camera2StreamConfigurationMap;
    static final io.reactivex.internal.schedulers.RxThreadFactory getHighSpeedVideoFpsRanges;
    static final io.reactivex.internal.schedulers.IoScheduler.ThreadWorker getHighSpeedVideoFpsRangesFor;
    static final io.reactivex.internal.schedulers.RxThreadFactory getHighSpeedVideoSizes;
    private static final java.util.concurrent.TimeUnit getOutputMinFrameDuration = java.util.concurrent.TimeUnit.SECONDS;
    final java.util.concurrent.ThreadFactory getInputFormats;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool> getInputSizeshNQ4ISI;

    static {
        io.reactivex.internal.schedulers.IoScheduler.ThreadWorker threadWorker = new io.reactivex.internal.schedulers.IoScheduler.ThreadWorker(new io.reactivex.internal.schedulers.RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        getHighSpeedVideoFpsRangesFor = threadWorker;
        threadWorker.dispose();
        int max = java.lang.Math.max(1, java.lang.Math.min(10, java.lang.Integer.getInteger("rx2.io-priority", 5).intValue()));
        io.reactivex.internal.schedulers.RxThreadFactory rxThreadFactory = new io.reactivex.internal.schedulers.RxThreadFactory("RxCachedThreadScheduler", max);
        getHighSpeedVideoSizes = rxThreadFactory;
        getHighSpeedVideoFpsRanges = new io.reactivex.internal.schedulers.RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool cachedWorkerPool = new io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool(0L, null, rxThreadFactory);
        Camera2StreamConfigurationMap = cachedWorkerPool;
        cachedWorkerPool.Camera2StreamConfigurationMap();
    }

    static final class CachedWorkerPool implements java.lang.Runnable {
        final io.reactivex.disposables.CompositeDisposable Camera2StreamConfigurationMap;
        private final java.util.concurrent.ScheduledExecutorService getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoFpsRanges;
        final java.util.concurrent.ConcurrentLinkedQueue<io.reactivex.internal.schedulers.IoScheduler.ThreadWorker> getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.ThreadFactory getHighSpeedVideoSizes;
        private final java.util.concurrent.Future<?> getOutputMinFrameDuration;

        CachedWorkerPool(long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ThreadFactory threadFactory) {
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
            java.util.concurrent.ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.getHighSpeedVideoFpsRanges = nanos;
            this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.ConcurrentLinkedQueue<>();
            this.Camera2StreamConfigurationMap = new io.reactivex.disposables.CompositeDisposable();
            this.getHighSpeedVideoSizes = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = java.util.concurrent.Executors.newScheduledThreadPool(1, io.reactivex.internal.schedulers.IoScheduler.getHighSpeedVideoFpsRanges);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = scheduledExecutorService;
            this.getOutputMinFrameDuration = scheduledFuture;
        }

        static long getHighSpeedVideoFpsRangesFor() {
            return java.lang.System.nanoTime();
        }

        final void Camera2StreamConfigurationMap() {
            this.Camera2StreamConfigurationMap.dispose();
            java.util.concurrent.Future<?> future = this.getOutputMinFrameDuration;
            if (future != null) {
                future.cancel(true);
            }
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.getHighResolutionOutputSizeshNQ4ISI;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                return;
            }
            long nanoTime = java.lang.System.nanoTime();
            java.util.Iterator<io.reactivex.internal.schedulers.IoScheduler.ThreadWorker> it = this.getHighSpeedVideoFpsRangesFor.iterator();
            while (it.hasNext()) {
                io.reactivex.internal.schedulers.IoScheduler.ThreadWorker next = it.next();
                if (next.getHighSpeedVideoFpsRangesFor > nanoTime) {
                    return;
                }
                if (this.getHighSpeedVideoFpsRangesFor.remove(next)) {
                    this.Camera2StreamConfigurationMap.remove(next);
                }
            }
        }
    }

    public IoScheduler() {
        this(getHighSpeedVideoSizes);
    }

    public IoScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        this.getInputFormats = threadFactory;
        this.getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>(Camera2StreamConfigurationMap);
        start();
    }

    @Override // io.reactivex.Scheduler
    public final void start() {
        io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool cachedWorkerPool = new io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool(60L, getOutputMinFrameDuration, this.getInputFormats);
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputSizeshNQ4ISI, Camera2StreamConfigurationMap, cachedWorkerPool)) {
            return;
        }
        cachedWorkerPool.Camera2StreamConfigurationMap();
    }

    @Override // io.reactivex.Scheduler
    public final void shutdown() {
        io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool cachedWorkerPool;
        io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool cachedWorkerPool2;
        do {
            cachedWorkerPool = this.getInputSizeshNQ4ISI.get();
            cachedWorkerPool2 = Camera2StreamConfigurationMap;
            if (cachedWorkerPool == cachedWorkerPool2) {
                return;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputSizeshNQ4ISI, cachedWorkerPool, cachedWorkerPool2));
        cachedWorkerPool.Camera2StreamConfigurationMap();
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.Scheduler.Worker createWorker() {
        return new io.reactivex.internal.schedulers.IoScheduler.EventLoopWorker(this.getInputSizeshNQ4ISI.get());
    }

    public final int size() {
        return this.getInputSizeshNQ4ISI.get().Camera2StreamConfigurationMap.size();
    }

    static final class EventLoopWorker extends io.reactivex.Scheduler.Worker {
        private final io.reactivex.internal.schedulers.IoScheduler.ThreadWorker getHighSpeedVideoFpsRangesFor;
        private final io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool getHighSpeedVideoSizes;
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicBoolean();
        private final io.reactivex.disposables.CompositeDisposable Camera2StreamConfigurationMap = new io.reactivex.disposables.CompositeDisposable();

        EventLoopWorker(io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool cachedWorkerPool) {
            io.reactivex.internal.schedulers.IoScheduler.ThreadWorker threadWorker;
            io.reactivex.internal.schedulers.IoScheduler.ThreadWorker threadWorker2;
            this.getHighSpeedVideoSizes = cachedWorkerPool;
            if (cachedWorkerPool.Camera2StreamConfigurationMap.isDisposed()) {
                threadWorker2 = io.reactivex.internal.schedulers.IoScheduler.getHighSpeedVideoFpsRangesFor;
            } else {
                while (true) {
                    if (!cachedWorkerPool.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                        threadWorker = cachedWorkerPool.getHighSpeedVideoFpsRangesFor.poll();
                        if (threadWorker != null) {
                            break;
                        }
                    } else {
                        threadWorker = new io.reactivex.internal.schedulers.IoScheduler.ThreadWorker(cachedWorkerPool.getHighSpeedVideoSizes);
                        cachedWorkerPool.Camera2StreamConfigurationMap.add(threadWorker);
                        break;
                    }
                }
                threadWorker2 = threadWorker;
            }
            this.getHighSpeedVideoFpsRangesFor = threadWorker2;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighSpeedVideoFpsRanges.compareAndSet(false, true)) {
                this.Camera2StreamConfigurationMap.dispose();
                io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool cachedWorkerPool = this.getHighSpeedVideoSizes;
                io.reactivex.internal.schedulers.IoScheduler.ThreadWorker threadWorker = this.getHighSpeedVideoFpsRangesFor;
                threadWorker.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.schedulers.IoScheduler.CachedWorkerPool.getHighSpeedVideoFpsRangesFor() + cachedWorkerPool.getHighSpeedVideoFpsRanges;
                cachedWorkerPool.getHighSpeedVideoFpsRangesFor.offer(threadWorker);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges.get();
        }

        @Override // io.reactivex.Scheduler.Worker
        public final io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            if (this.Camera2StreamConfigurationMap.isDisposed()) {
                return io.reactivex.internal.disposables.EmptyDisposable.INSTANCE;
            }
            return this.getHighSpeedVideoFpsRangesFor.scheduleActual(runnable, j, timeUnit, this.Camera2StreamConfigurationMap);
        }
    }

    static final class ThreadWorker extends io.reactivex.internal.schedulers.NewThreadWorker {
        long getHighSpeedVideoFpsRangesFor;

        ThreadWorker(java.util.concurrent.ThreadFactory threadFactory) {
            super(threadFactory);
            this.getHighSpeedVideoFpsRangesFor = 0L;
        }
    }
}
