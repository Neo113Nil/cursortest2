package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableIgnoreElements<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    public FlowableIgnoreElements(io.reactivex.Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableIgnoreElements.IgnoreElementsSubscriber(subscriber));
    }

    /* loaded from: classes17.dex */
    static final class IgnoreElementsSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.internal.fuseable.QueueSubscription<T> {
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Subscription getHighSpeedVideoSizes;

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() {
            return null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return i & 2;
        }

        IgnoreElementsSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizes, subscription)) {
                this.getHighSpeedVideoSizes = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(T t) {
            throw new java.lang.UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(T t, T t2) {
            throw new java.lang.UnsupportedOperationException("Should not be called!");
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoSizes.cancel();
        }
    }
}
