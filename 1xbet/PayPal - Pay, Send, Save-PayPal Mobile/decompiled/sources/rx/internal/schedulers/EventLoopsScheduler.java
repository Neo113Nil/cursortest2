package rx.internal.schedulers;

/* loaded from: classes18.dex */
public final class EventLoopsScheduler extends rx.Scheduler implements rx.internal.schedulers.SchedulerLifecycle {
    static final rx.internal.schedulers.EventLoopsScheduler.FixedSchedulerPool getHighResolutionOutputSizeshNQ4ISI;
    static final int getHighSpeedVideoFpsRanges;
    static final rx.internal.schedulers.EventLoopsScheduler.PoolWorker getHighSpeedVideoSizes;
    final java.util.concurrent.atomic.AtomicReference<rx.internal.schedulers.EventLoopsScheduler.FixedSchedulerPool> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>(getHighResolutionOutputSizeshNQ4ISI);
    final java.util.concurrent.ThreadFactory getHighSpeedVideoFpsRangesFor;

    static {
        int intValue = java.lang.Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        getHighSpeedVideoFpsRanges = intValue;
        rx.internal.schedulers.EventLoopsScheduler.PoolWorker poolWorker = new rx.internal.schedulers.EventLoopsScheduler.PoolWorker(rx.internal.util.RxThreadFactory.NONE);
        getHighSpeedVideoSizes = poolWorker;
        poolWorker.unsubscribe();
        getHighResolutionOutputSizeshNQ4ISI = new rx.internal.schedulers.EventLoopsScheduler.FixedSchedulerPool(null, 0);
    }

    static final class FixedSchedulerPool {
        final int getHighResolutionOutputSizeshNQ4ISI;
        final rx.internal.schedulers.EventLoopsScheduler.PoolWorker[] getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoSizes;

        FixedSchedulerPool(java.util.concurrent.ThreadFactory threadFactory, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoFpsRanges = new rx.internal.schedulers.EventLoopsScheduler.PoolWorker[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.getHighSpeedVideoFpsRanges[i2] = new rx.internal.schedulers.EventLoopsScheduler.PoolWorker(threadFactory);
            }
        }

        public final rx.internal.schedulers.EventLoopsScheduler.PoolWorker getHighSpeedVideoFpsRangesFor() {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                return rx.internal.schedulers.EventLoopsScheduler.getHighSpeedVideoSizes;
            }
            rx.internal.schedulers.EventLoopsScheduler.PoolWorker[] poolWorkerArr = this.getHighSpeedVideoFpsRanges;
            long j = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = 1 + j;
            return poolWorkerArr[(int) (j % i)];
        }
    }

    public EventLoopsScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        this.getHighSpeedVideoFpsRangesFor = threadFactory;
        start();
    }

    @Override // rx.Scheduler
    public final rx.Scheduler.Worker createWorker() {
        return new rx.internal.schedulers.EventLoopsScheduler.EventLoopWorker(this.Camera2StreamConfigurationMap.get().getHighSpeedVideoFpsRangesFor());
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public final void start() {
        rx.internal.schedulers.EventLoopsScheduler.FixedSchedulerPool fixedSchedulerPool = new rx.internal.schedulers.EventLoopsScheduler.FixedSchedulerPool(this.getHighSpeedVideoFpsRangesFor, getHighSpeedVideoFpsRanges);
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, getHighResolutionOutputSizeshNQ4ISI, fixedSchedulerPool)) {
            return;
        }
        for (rx.internal.schedulers.EventLoopsScheduler.PoolWorker poolWorker : fixedSchedulerPool.getHighSpeedVideoFpsRanges) {
            poolWorker.unsubscribe();
        }
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public final void shutdown() {
        rx.internal.schedulers.EventLoopsScheduler.FixedSchedulerPool fixedSchedulerPool;
        rx.internal.schedulers.EventLoopsScheduler.FixedSchedulerPool fixedSchedulerPool2;
        do {
            fixedSchedulerPool = this.Camera2StreamConfigurationMap.get();
            fixedSchedulerPool2 = getHighResolutionOutputSizeshNQ4ISI;
            if (fixedSchedulerPool == fixedSchedulerPool2) {
                return;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, fixedSchedulerPool, fixedSchedulerPool2));
        for (rx.internal.schedulers.EventLoopsScheduler.PoolWorker poolWorker : fixedSchedulerPool.getHighSpeedVideoFpsRanges) {
            poolWorker.unsubscribe();
        }
    }

    public final rx.Subscription scheduleDirect(rx.functions.Action0 action0) {
        return this.Camera2StreamConfigurationMap.get().getHighSpeedVideoFpsRangesFor().scheduleActual(action0, -1L, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    static final class EventLoopWorker extends rx.Scheduler.Worker {
        private final rx.subscriptions.CompositeSubscription getHighResolutionOutputSizeshNQ4ISI;
        private final rx.internal.util.SubscriptionList getHighSpeedVideoFpsRanges;
        private final rx.internal.util.SubscriptionList getHighSpeedVideoFpsRangesFor;
        private final rx.internal.schedulers.EventLoopsScheduler.PoolWorker getHighSpeedVideoSizes;

        EventLoopWorker(rx.internal.schedulers.EventLoopsScheduler.PoolWorker poolWorker) {
            rx.internal.util.SubscriptionList subscriptionList = new rx.internal.util.SubscriptionList();
            this.getHighSpeedVideoFpsRangesFor = subscriptionList;
            rx.subscriptions.CompositeSubscription compositeSubscription = new rx.subscriptions.CompositeSubscription();
            this.getHighResolutionOutputSizeshNQ4ISI = compositeSubscription;
            this.getHighSpeedVideoFpsRanges = new rx.internal.util.SubscriptionList(subscriptionList, compositeSubscription);
            this.getHighSpeedVideoSizes = poolWorker;
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            this.getHighSpeedVideoFpsRanges.unsubscribe();
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.getHighSpeedVideoFpsRanges.isUnsubscribed();
        }

        @Override // rx.Scheduler.Worker
        public final rx.Subscription schedule(final rx.functions.Action0 action0) {
            if (isUnsubscribed()) {
                return rx.subscriptions.Subscriptions.unsubscribed();
            }
            return this.getHighSpeedVideoSizes.scheduleActual(new rx.functions.Action0() { // from class: rx.internal.schedulers.EventLoopsScheduler.EventLoopWorker.1
                @Override // rx.functions.Action0
                public void call() {
                    if (rx.internal.schedulers.EventLoopsScheduler.EventLoopWorker.this.isUnsubscribed()) {
                        return;
                    }
                    action0.call();
                }
            }, 0L, (java.util.concurrent.TimeUnit) null, this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // rx.Scheduler.Worker
        public final rx.Subscription schedule(final rx.functions.Action0 action0, long j, java.util.concurrent.TimeUnit timeUnit) {
            if (isUnsubscribed()) {
                return rx.subscriptions.Subscriptions.unsubscribed();
            }
            return this.getHighSpeedVideoSizes.scheduleActual(new rx.functions.Action0() { // from class: rx.internal.schedulers.EventLoopsScheduler.EventLoopWorker.2
                @Override // rx.functions.Action0
                public void call() {
                    if (rx.internal.schedulers.EventLoopsScheduler.EventLoopWorker.this.isUnsubscribed()) {
                        return;
                    }
                    action0.call();
                }
            }, j, timeUnit, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    static final class PoolWorker extends rx.internal.schedulers.NewThreadWorker {
        PoolWorker(java.util.concurrent.ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}
