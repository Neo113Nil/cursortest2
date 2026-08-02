package io.reactivex.internal.subscriptions;

/* loaded from: classes17.dex */
public final class ScalarSubscription<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.internal.fuseable.QueueSubscription<T> {
    private static final long serialVersionUID = -3830916580126663321L;
    final T getHighSpeedVideoFpsRangesFor;
    final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i) {
        return i & 1;
    }

    public ScalarSubscription(org.reactivestreams.Subscriber<? super T> subscriber, T t) {
        this.getHighSpeedVideoSizes = subscriber;
        this.getHighSpeedVideoFpsRangesFor = t;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j) && compareAndSet(0, 1)) {
            org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoSizes;
            subscriber.onNext(this.getHighSpeedVideoFpsRangesFor);
            if (get() != 2) {
                subscriber.onComplete();
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        lazySet(2);
    }

    public final boolean isCancelled() {
        return get() == 2;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(T t) {
        throw new java.lang.UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(T t, T t2) {
        throw new java.lang.UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(1);
    }
}
