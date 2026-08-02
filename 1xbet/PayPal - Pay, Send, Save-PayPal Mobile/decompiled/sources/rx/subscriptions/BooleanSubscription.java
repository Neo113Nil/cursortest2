package rx.subscriptions;

/* loaded from: classes18.dex */
public final class BooleanSubscription implements rx.Subscription {
    static final rx.functions.Action0 getHighSpeedVideoFpsRangesFor = new rx.functions.Action0() { // from class: rx.subscriptions.BooleanSubscription.1
        @Override // rx.functions.Action0
        public final void call() {
        }
    };
    final java.util.concurrent.atomic.AtomicReference<rx.functions.Action0> getHighSpeedVideoFpsRanges;

    public BooleanSubscription() {
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
    }

    private BooleanSubscription(rx.functions.Action0 action0) {
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>(action0);
    }

    public static rx.subscriptions.BooleanSubscription create() {
        return new rx.subscriptions.BooleanSubscription();
    }

    public static rx.subscriptions.BooleanSubscription create(rx.functions.Action0 action0) {
        return new rx.subscriptions.BooleanSubscription(action0);
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.getHighSpeedVideoFpsRanges.get() == getHighSpeedVideoFpsRangesFor;
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        rx.functions.Action0 andSet;
        rx.functions.Action0 action0 = this.getHighSpeedVideoFpsRanges.get();
        rx.functions.Action0 action02 = getHighSpeedVideoFpsRangesFor;
        if (action0 == action02 || (andSet = this.getHighSpeedVideoFpsRanges.getAndSet(action02)) == null || andSet == action02) {
            return;
        }
        andSet.call();
    }
}
