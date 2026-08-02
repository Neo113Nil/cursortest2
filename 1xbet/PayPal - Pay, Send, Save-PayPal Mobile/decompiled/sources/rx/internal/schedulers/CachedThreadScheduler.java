package rx.internal.schedulers;

/* loaded from: classes18.dex */
public final class CachedThreadScheduler extends rx.Scheduler implements rx.internal.schedulers.SchedulerLifecycle {
    static final rx.internal.schedulers.CachedThreadScheduler.ThreadWorker getHighSpeedVideoFpsRanges;
    static final rx.internal.schedulers.CachedThreadScheduler.CachedWorkerPool getHighSpeedVideoFpsRangesFor;
    private static final long getHighSpeedVideoSizes;
    private static final java.util.concurrent.TimeUnit getInputFormats = java.util.concurrent.TimeUnit.SECONDS;
    final java.util.concurrent.atomic.AtomicReference<rx.internal.schedulers.CachedThreadScheduler.CachedWorkerPool> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>(getHighSpeedVideoFpsRangesFor);
    final java.util.concurrent.ThreadFactory getHighResolutionOutputSizeshNQ4ISI;

    static {
        rx.internal.schedulers.CachedThreadScheduler.ThreadWorker threadWorker = new rx.internal.schedulers.CachedThreadScheduler.ThreadWorker(rx.internal.util.RxThreadFactory.NONE);
        getHighSpeedVideoFpsRanges = threadWorker;
        threadWorker.unsubscribe();
        rx.internal.schedulers.CachedThreadScheduler.CachedWorkerPool cachedWorkerPool = new rx.internal.schedulers.CachedThreadScheduler.CachedWorkerPool(null, 0L, null);
        getHighSpeedVideoFpsRangesFor = cachedWorkerPool;
        cachedWorkerPool.getHighSpeedVideoFpsRanges();
        getHighSpeedVideoSizes = java.lang.Integer.getInteger("rx.io-scheduler.keepalive", 60).intValue();
    }

    static final class CachedWorkerPool {
        final long Camera2StreamConfigurationMap;
        private final java.util.concurrent.ScheduledExecutorService getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.ThreadFactory getHighSpeedVideoFpsRanges;
        final java.util.concurrent.ConcurrentLinkedQueue<rx.internal.schedulers.CachedThreadScheduler.ThreadWorker> getHighSpeedVideoFpsRangesFor;
        final rx.subscriptions.CompositeSubscription getHighSpeedVideoSizes;
        private final java.util.concurrent.Future<?> getInputSizeshNQ4ISI;

        CachedWorkerPool(final java.util.concurrent.ThreadFactory threadFactory, long j, java.util.concurrent.TimeUnit timeUnit) {
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
            java.util.concurrent.ScheduledFuture<?> scheduledFuture;
            this.getHighSpeedVideoFpsRanges = threadFactory;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.Camera2StreamConfigurationMap = nanos;
            this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.ConcurrentLinkedQueue<>();
            this.getHighSpeedVideoSizes = new rx.subscriptions.CompositeSubscription();
            if (timeUnit != null) {
                scheduledExecutorService = java.util.concurrent.Executors.newScheduledThreadPool(1, new java.util.concurrent.ThreadFactory() { // from class: rx.internal.schedulers.CachedThreadScheduler.CachedWorkerPool.1
                    @Override // java.util.concurrent.ThreadFactory
                    public java.lang.Thread newThread(java.lang.Runnable runnable) {
                        java.lang.Thread newThread = threadFactory.newThread(runnable);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(newThread.getName());
                        sb.append(" (Evictor)");
                        newThread.setName(sb.toString());
                        return newThread;
                    }
                });
                rx.internal.schedulers.NewThreadWorker.tryEnableCancelPolicy(scheduledExecutorService);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(new java.lang.Runnable() { // from class: rx.internal.schedulers.CachedThreadScheduler.CachedWorkerPool.2
                    @Override // java.lang.Runnable
                    public void run() {
                        rx.internal.schedulers.CachedThreadScheduler.CachedWorkerPool cachedWorkerPool = rx.internal.schedulers.CachedThreadScheduler.CachedWorkerPool.this;
                        if (cachedWorkerPool.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                            return;
                        }
                        long highSpeedVideoFpsRangesFor = rx.internal.schedulers.CachedThreadScheduler.CachedWorkerPool.getHighSpeedVideoFpsRangesFor();
                        java.util.Iterator<rx.internal.schedulers.CachedThreadScheduler.ThreadWorker> it = cachedWorkerPool.getHighSpeedVideoFpsRangesFor.iterator();
                        while (it.hasNext()) {
                            rx.internal.schedulers.CachedThreadScheduler.ThreadWorker next = it.next();
                            if (next.getHighSpeedVideoSizes > highSpeedVideoFpsRangesFor) {
                                return;
                            }
                            if (cachedWorkerPool.getHighSpeedVideoFpsRangesFor.remove(next)) {
                                cachedWorkerPool.getHighSpeedVideoSizes.remove(next);
                            }
                        }
                    }
                }, nanos, nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = scheduledExecutorService;
            this.getInputSizeshNQ4ISI = scheduledFuture;
        }

        static long getHighSpeedVideoFpsRangesFor() {
            return java.lang.System.nanoTime();
        }

        final void getHighSpeedVideoFpsRanges() {
            try {
                java.util.concurrent.Future<?> future = this.getInputSizeshNQ4ISI;
                if (future != null) {
                    future.cancel(true);
                }
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.getHighResolutionOutputSizeshNQ4ISI;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
            } finally {
                this.getHighSpeedVideoSizes.unsubscribe();
            }
        }
    }

    public CachedThreadScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        this.getHighResolutionOutputSizeshNQ4ISI = threadFactory;
        start();
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public final void start() {
        rx.internal.schedulers.CachedThreadScheduler.CachedWorkerPool cachedWorkerPool = new rx.internal.schedulers.CachedThreadScheduler.CachedWorkerPool(this.getHighResolutionOutputSizeshNQ4ISI, getHighSpeedVideoSizes, getInputFormats);
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, getHighSpeedVideoFpsRangesFor, cachedWorkerPool)) {
            return;
        }
        cachedWorkerPool.getHighSpeedVideoFpsRanges();
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public final void shutdown() {
        rx.internal.schedulers.CachedThreadScheduler.CachedWorkerPool cachedWorkerPool;
        rx.internal.schedulers.CachedThreadScheduler.CachedWorkerPool cachedWorkerPool2;
        do {
            cachedWorkerPool = this.Camera2StreamConfigurationMap.get();
            cachedWorkerPool2 = getHighSpeedVideoFpsRangesFor;
            if (cachedWorkerPool == cachedWorkerPool2) {
                return;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, cachedWorkerPool, cachedWorkerPool2));
        cachedWorkerPool.getHighSpeedVideoFpsRanges();
    }

    @Override // rx.Scheduler
    public final rx.Scheduler.Worker createWorker() {
        return new rx.internal.schedulers.CachedThreadScheduler.EventLoopWorker(this.Camera2StreamConfigurationMap.get());
    }

    static final class EventLoopWorker extends rx.Scheduler.Worker implements rx.functions.Action0 {
        private final rx.internal.schedulers.CachedThreadScheduler.ThreadWorker Camera2StreamConfigurationMap;
        private final rx.internal.schedulers.CachedThreadScheduler.CachedWorkerPool getHighSpeedVideoSizes;
        private final rx.subscriptions.CompositeSubscription getHighSpeedVideoFpsRangesFor = new rx.subscriptions.CompositeSubscription();
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicBoolean();

        EventLoopWorker(rx.internal.schedulers.CachedThreadScheduler.CachedWorkerPool cachedWorkerPool) {
            rx.internal.schedulers.CachedThreadScheduler.ThreadWorker threadWorker;
            rx.internal.schedulers.CachedThreadScheduler.ThreadWorker threadWorker2;
            this.getHighSpeedVideoSizes = cachedWorkerPool;
            if (cachedWorkerPool.getHighSpeedVideoSizes.isUnsubscribed()) {
                threadWorker2 = rx.internal.schedulers.CachedThreadScheduler.getHighSpeedVideoFpsRanges;
            } else {
                while (true) {
                    if (!cachedWorkerPool.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                        threadWorker = cachedWorkerPool.getHighSpeedVideoFpsRangesFor.poll();
                        if (threadWorker != null) {
                            break;
                        }
                    } else {
                        threadWorker = new rx.internal.schedulers.CachedThreadScheduler.ThreadWorker(cachedWorkerPool.getHighSpeedVideoFpsRanges);
                        cachedWorkerPool.getHighSpeedVideoSizes.add(threadWorker);
                        break;
                    }
                }
                threadWorker2 = threadWorker;
            }
            this.Camera2StreamConfigurationMap = threadWorker2;
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            if (this.getHighSpeedVideoFpsRanges.compareAndSet(false, true)) {
                this.Camera2StreamConfigurationMap.schedule(this);
            }
            this.getHighSpeedVideoFpsRangesFor.unsubscribe();
        }

        @Override // rx.functions.Action0
        public final void call() {
            rx.internal.schedulers.CachedThreadScheduler.CachedWorkerPool cachedWorkerPool = this.getHighSpeedVideoSizes;
            rx.internal.schedulers.CachedThreadScheduler.ThreadWorker threadWorker = this.Camera2StreamConfigurationMap;
            threadWorker.getHighSpeedVideoSizes = rx.internal.schedulers.CachedThreadScheduler.CachedWorkerPool.getHighSpeedVideoFpsRangesFor() + cachedWorkerPool.Camera2StreamConfigurationMap;
            cachedWorkerPool.getHighSpeedVideoFpsRangesFor.offer(threadWorker);
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.getHighSpeedVideoFpsRangesFor.isUnsubscribed();
        }

        @Override // rx.Scheduler.Worker
        public final rx.Subscription schedule(rx.functions.Action0 action0) {
            return schedule(action0, 0L, null);
        }

        @Override // rx.Scheduler.Worker
        public final rx.Subscription schedule(final rx.functions.Action0 action0, long j, java.util.concurrent.TimeUnit timeUnit) {
            if (this.getHighSpeedVideoFpsRangesFor.isUnsubscribed()) {
                return rx.subscriptions.Subscriptions.unsubscribed();
            }
            rx.internal.schedulers.ScheduledAction scheduleActual = this.Camera2StreamConfigurationMap.scheduleActual(new rx.functions.Action0() { // from class: rx.internal.schedulers.CachedThreadScheduler.EventLoopWorker.1
                @Override // rx.functions.Action0
                public void call() {
                    if (rx.internal.schedulers.CachedThreadScheduler.EventLoopWorker.this.isUnsubscribed()) {
                        return;
                    }
                    action0.call();
                }
            }, j, timeUnit);
            this.getHighSpeedVideoFpsRangesFor.add(scheduleActual);
            scheduleActual.addParent(this.getHighSpeedVideoFpsRangesFor);
            return scheduleActual;
        }
    }

    static final class ThreadWorker extends rx.internal.schedulers.NewThreadWorker {
        long getHighSpeedVideoSizes;

        ThreadWorker(java.util.concurrent.ThreadFactory threadFactory) {
            super(threadFactory);
            this.getHighSpeedVideoSizes = 0L;
        }
    }
}
