package rx.subscriptions;

/* loaded from: classes18.dex */
public final class Subscriptions {
    private static final rx.subscriptions.Subscriptions.Unsubscribed getHighSpeedVideoSizes = new rx.subscriptions.Subscriptions.Unsubscribed();

    private Subscriptions() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static rx.Subscription empty() {
        return rx.subscriptions.BooleanSubscription.create();
    }

    public static rx.Subscription unsubscribed() {
        return getHighSpeedVideoSizes;
    }

    public static rx.Subscription create(rx.functions.Action0 action0) {
        return rx.subscriptions.BooleanSubscription.create(action0);
    }

    public static rx.Subscription from(java.util.concurrent.Future<?> future) {
        return new rx.subscriptions.Subscriptions.FutureSubscription(future);
    }

    static final class FutureSubscription implements rx.Subscription {
        final java.util.concurrent.Future<?> getHighSpeedVideoFpsRanges;

        public FutureSubscription(java.util.concurrent.Future<?> future) {
            this.getHighSpeedVideoFpsRanges = future;
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            this.getHighSpeedVideoFpsRanges.cancel(true);
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.getHighSpeedVideoFpsRanges.isCancelled();
        }
    }

    public static rx.subscriptions.CompositeSubscription from(rx.Subscription... subscriptionArr) {
        return new rx.subscriptions.CompositeSubscription(subscriptionArr);
    }

    static final class Unsubscribed implements rx.Subscription {
        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return true;
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
        }

        Unsubscribed() {
        }
    }
}
