package rx.internal.subscriptions;

/* loaded from: classes18.dex */
public enum Unsubscribed implements rx.Subscription {
    INSTANCE;

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return true;
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
    }
}
