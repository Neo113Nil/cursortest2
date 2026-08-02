package rx.internal.schedulers;

/* loaded from: classes18.dex */
public final class TrampolineScheduler extends rx.Scheduler {
    public static final rx.internal.schedulers.TrampolineScheduler INSTANCE = new rx.internal.schedulers.TrampolineScheduler();

    static int getHighSpeedVideoFpsRanges(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    @Override // rx.Scheduler
    public final rx.Scheduler.Worker createWorker() {
        return new rx.internal.schedulers.TrampolineScheduler.InnerCurrentThreadScheduler();
    }

    private TrampolineScheduler() {
    }

    static final class InnerCurrentThreadScheduler extends rx.Scheduler.Worker implements rx.Subscription {
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.concurrent.PriorityBlockingQueue<rx.internal.schedulers.TrampolineScheduler.TimedAction> getHighSpeedVideoSizes = new java.util.concurrent.PriorityBlockingQueue<>();
        private final rx.subscriptions.BooleanSubscription getHighSpeedVideoFpsRangesFor = new rx.subscriptions.BooleanSubscription();
        private final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicInteger();

        InnerCurrentThreadScheduler() {
        }

        @Override // rx.Scheduler.Worker
        public final rx.Subscription schedule(rx.functions.Action0 action0) {
            return getHighResolutionOutputSizeshNQ4ISI(action0, now());
        }

        @Override // rx.Scheduler.Worker
        public final rx.Subscription schedule(rx.functions.Action0 action0, long j, java.util.concurrent.TimeUnit timeUnit) {
            long now = now() + timeUnit.toMillis(j);
            return getHighResolutionOutputSizeshNQ4ISI(new rx.internal.schedulers.SleepingAction(action0, this, now), now);
        }

        private rx.Subscription getHighResolutionOutputSizeshNQ4ISI(rx.functions.Action0 action0, long j) {
            if (this.getHighSpeedVideoFpsRangesFor.isUnsubscribed()) {
                return rx.subscriptions.Subscriptions.unsubscribed();
            }
            final rx.internal.schedulers.TrampolineScheduler.TimedAction timedAction = new rx.internal.schedulers.TrampolineScheduler.TimedAction(action0, java.lang.Long.valueOf(j), this.getHighSpeedVideoFpsRanges.incrementAndGet());
            this.getHighSpeedVideoSizes.add(timedAction);
            if (this.Camera2StreamConfigurationMap.getAndIncrement() == 0) {
                do {
                    rx.internal.schedulers.TrampolineScheduler.TimedAction poll = this.getHighSpeedVideoSizes.poll();
                    if (poll != null) {
                        poll.getHighSpeedVideoFpsRangesFor.call();
                    }
                } while (this.Camera2StreamConfigurationMap.decrementAndGet() > 0);
                return rx.subscriptions.Subscriptions.unsubscribed();
            }
            return rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.internal.schedulers.TrampolineScheduler.InnerCurrentThreadScheduler.1
                @Override // rx.functions.Action0
                public void call() {
                    rx.internal.schedulers.TrampolineScheduler.InnerCurrentThreadScheduler.this.getHighSpeedVideoSizes.remove(timedAction);
                }
            });
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            this.getHighSpeedVideoFpsRangesFor.unsubscribe();
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.getHighSpeedVideoFpsRangesFor.isUnsubscribed();
        }
    }

    static final class TimedAction implements java.lang.Comparable<rx.internal.schedulers.TrampolineScheduler.TimedAction> {
        final java.lang.Long Camera2StreamConfigurationMap;
        final rx.functions.Action0 getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(rx.internal.schedulers.TrampolineScheduler.TimedAction timedAction) {
            rx.internal.schedulers.TrampolineScheduler.TimedAction timedAction2 = timedAction;
            int compareTo = this.Camera2StreamConfigurationMap.compareTo(timedAction2.Camera2StreamConfigurationMap);
            return compareTo == 0 ? rx.internal.schedulers.TrampolineScheduler.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, timedAction2.getHighSpeedVideoSizes) : compareTo;
        }

        TimedAction(rx.functions.Action0 action0, java.lang.Long l, int i) {
            this.getHighSpeedVideoFpsRangesFor = action0;
            this.Camera2StreamConfigurationMap = l;
            this.getHighSpeedVideoSizes = i;
        }
    }
}
