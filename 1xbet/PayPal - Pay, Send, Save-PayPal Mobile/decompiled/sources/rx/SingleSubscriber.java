package rx;

/* loaded from: classes18.dex */
public abstract class SingleSubscriber<T> implements rx.Subscription {
    private final rx.internal.util.SubscriptionList getHighSpeedVideoFpsRanges = new rx.internal.util.SubscriptionList();

    public abstract void onError(java.lang.Throwable th);

    public abstract void onSuccess(T t);

    public final void add(rx.Subscription subscription) {
        this.getHighSpeedVideoFpsRanges.add(subscription);
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        this.getHighSpeedVideoFpsRanges.unsubscribe();
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.getHighSpeedVideoFpsRanges.isUnsubscribed();
    }
}
