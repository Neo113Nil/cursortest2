package io.reactivex.internal.subscribers;

/* loaded from: classes17.dex */
public final class BlockingSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
    public static final java.lang.Object TERMINATED = new java.lang.Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final java.util.Queue<java.lang.Object> getHighSpeedVideoSizes;

    public BlockingSubscriber(java.util.Queue<java.lang.Object> queue) {
        this.getHighSpeedVideoSizes = queue;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription)) {
            this.getHighSpeedVideoSizes.offer(io.reactivex.internal.util.NotificationLite.subscription(this));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        this.getHighSpeedVideoSizes.offer(io.reactivex.internal.util.NotificationLite.next(t));
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        this.getHighSpeedVideoSizes.offer(io.reactivex.internal.util.NotificationLite.error(th));
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.getHighSpeedVideoSizes.offer(io.reactivex.internal.util.NotificationLite.complete());
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        get().request(j);
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this)) {
            this.getHighSpeedVideoSizes.offer(TERMINATED);
        }
    }

    public final boolean isCancelled() {
        return get() == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
    }
}
