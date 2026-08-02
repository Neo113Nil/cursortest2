package rx.subscriptions;

/* loaded from: classes18.dex */
public final class SerialSubscription implements rx.Subscription {
    final rx.internal.subscriptions.SequentialSubscription getHighSpeedVideoFpsRangesFor = new rx.internal.subscriptions.SequentialSubscription();

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.getHighSpeedVideoFpsRangesFor.isUnsubscribed();
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        this.getHighSpeedVideoFpsRangesFor.unsubscribe();
    }

    public final void set(rx.Subscription subscription) {
        if (subscription == null) {
            throw new java.lang.IllegalArgumentException("Subscription can not be null");
        }
        this.getHighSpeedVideoFpsRangesFor.update(subscription);
    }

    public final rx.Subscription get() {
        return this.getHighSpeedVideoFpsRangesFor.current();
    }
}
