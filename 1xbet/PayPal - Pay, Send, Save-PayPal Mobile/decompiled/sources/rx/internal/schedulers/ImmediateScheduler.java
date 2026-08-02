package rx.internal.schedulers;

/* loaded from: classes18.dex */
public final class ImmediateScheduler extends rx.Scheduler {
    public static final rx.internal.schedulers.ImmediateScheduler INSTANCE = new rx.internal.schedulers.ImmediateScheduler();

    private ImmediateScheduler() {
    }

    @Override // rx.Scheduler
    public final rx.Scheduler.Worker createWorker() {
        return new rx.internal.schedulers.ImmediateScheduler.InnerImmediateScheduler();
    }

    final class InnerImmediateScheduler extends rx.Scheduler.Worker implements rx.Subscription {
        final rx.subscriptions.BooleanSubscription getHighSpeedVideoFpsRangesFor = new rx.subscriptions.BooleanSubscription();

        InnerImmediateScheduler() {
        }

        @Override // rx.Scheduler.Worker
        public final rx.Subscription schedule(rx.functions.Action0 action0, long j, java.util.concurrent.TimeUnit timeUnit) {
            return schedule(new rx.internal.schedulers.SleepingAction(action0, this, rx.internal.schedulers.ImmediateScheduler.this.now() + timeUnit.toMillis(j)));
        }

        @Override // rx.Scheduler.Worker
        public final rx.Subscription schedule(rx.functions.Action0 action0) {
            action0.call();
            return rx.subscriptions.Subscriptions.unsubscribed();
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
}
