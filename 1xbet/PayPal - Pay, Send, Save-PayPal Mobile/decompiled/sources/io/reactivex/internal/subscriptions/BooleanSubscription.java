package io.reactivex.internal.subscriptions;

/* loaded from: classes17.dex */
public final class BooleanSubscription extends java.util.concurrent.atomic.AtomicBoolean implements org.reactivestreams.Subscription {
    private static final long serialVersionUID = -8127758972444290902L;

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j);
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        lazySet(true);
    }

    public final boolean isCancelled() {
        return get();
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BooleanSubscription(cancelled=");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }
}
