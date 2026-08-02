package io.reactivex.internal.subscriptions;

/* loaded from: classes3.dex */
public enum EmptySubscription implements io.reactivex.internal.fuseable.QueueSubscription<java.lang.Object> {
    INSTANCE;

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final java.lang.Object poll() {
        return null;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i) {
        return i & 2;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "EmptySubscription";
    }

    public static void error(java.lang.Throwable th, org.reactivestreams.Subscriber<?> subscriber) {
        subscriber.onSubscribe(INSTANCE);
        subscriber.onError(th);
    }

    public static void complete(org.reactivestreams.Subscriber<?> subscriber) {
        subscriber.onSubscribe(INSTANCE);
        subscriber.onComplete();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Should not be called!");
    }
}
