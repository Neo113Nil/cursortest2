package rx.internal.subscriptions;

/* loaded from: classes18.dex */
public final class SequentialSubscription extends java.util.concurrent.atomic.AtomicReference<rx.Subscription> implements rx.Subscription {
    private static final long serialVersionUID = 995205034283130269L;

    public SequentialSubscription() {
    }

    public SequentialSubscription(rx.Subscription subscription) {
        lazySet(subscription);
    }

    public final rx.Subscription current() {
        rx.Subscription subscription = (rx.Subscription) super.get();
        return subscription == rx.internal.subscriptions.Unsubscribed.INSTANCE ? rx.subscriptions.Subscriptions.unsubscribed() : subscription;
    }

    public final boolean update(rx.Subscription subscription) {
        rx.Subscription subscription2;
        do {
            subscription2 = get();
            if (subscription2 == rx.internal.subscriptions.Unsubscribed.INSTANCE) {
                if (subscription == null) {
                    return false;
                }
                subscription.unsubscribe();
                return false;
            }
        } while (!compareAndSet(subscription2, subscription));
        if (subscription2 == null) {
            return true;
        }
        subscription2.unsubscribe();
        return true;
    }

    public final boolean replace(rx.Subscription subscription) {
        rx.Subscription subscription2;
        do {
            subscription2 = get();
            if (subscription2 == rx.internal.subscriptions.Unsubscribed.INSTANCE) {
                if (subscription == null) {
                    return false;
                }
                subscription.unsubscribe();
                return false;
            }
        } while (!compareAndSet(subscription2, subscription));
        return true;
    }

    public final boolean updateWeak(rx.Subscription subscription) {
        rx.Subscription subscription2 = get();
        if (subscription2 == rx.internal.subscriptions.Unsubscribed.INSTANCE) {
            if (subscription != null) {
                subscription.unsubscribe();
            }
            return false;
        }
        if (compareAndSet(subscription2, subscription)) {
            return true;
        }
        rx.Subscription subscription3 = get();
        if (subscription != null) {
            subscription.unsubscribe();
        }
        return subscription3 == rx.internal.subscriptions.Unsubscribed.INSTANCE;
    }

    public final boolean replaceWeak(rx.Subscription subscription) {
        rx.Subscription subscription2 = get();
        if (subscription2 == rx.internal.subscriptions.Unsubscribed.INSTANCE) {
            if (subscription != null) {
                subscription.unsubscribe();
            }
            return false;
        }
        if (compareAndSet(subscription2, subscription) || get() != rx.internal.subscriptions.Unsubscribed.INSTANCE) {
            return true;
        }
        if (subscription != null) {
            subscription.unsubscribe();
        }
        return false;
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        rx.Subscription andSet;
        if (get() == rx.internal.subscriptions.Unsubscribed.INSTANCE || (andSet = getAndSet(rx.internal.subscriptions.Unsubscribed.INSTANCE)) == null || andSet == rx.internal.subscriptions.Unsubscribed.INSTANCE) {
            return;
        }
        andSet.unsubscribe();
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return get() == rx.internal.subscriptions.Unsubscribed.INSTANCE;
    }
}
