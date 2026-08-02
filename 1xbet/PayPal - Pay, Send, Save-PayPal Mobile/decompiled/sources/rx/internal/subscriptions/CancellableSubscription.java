package rx.internal.subscriptions;

/* loaded from: classes18.dex */
public final class CancellableSubscription extends java.util.concurrent.atomic.AtomicReference<rx.functions.Cancellable> implements rx.Subscription {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableSubscription(rx.functions.Cancellable cancellable) {
        super(cancellable);
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return get() == null;
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        rx.functions.Cancellable andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (java.lang.Exception e) {
            rx.exceptions.Exceptions.throwIfFatal(e);
            rx.plugins.RxJavaHooks.onError(e);
        }
    }
}
