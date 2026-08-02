package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableTakeLastOne<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    public FlowableTakeLastOne(io.reactivex.Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableTakeLastOne.TakeLastOneSubscriber(subscriber));
    }

    /* loaded from: classes17.dex */
    static final class TakeLastOneSubscriber<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -5467847744262967226L;
        org.reactivestreams.Subscription Camera2StreamConfigurationMap;

        TakeLastOneSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.Camera2StreamConfigurationMap, subscription)) {
                this.Camera2StreamConfigurationMap = subscription;
                this.actual.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.value = t;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.value = null;
            this.actual.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            T t = this.value;
            if (t != null) {
                complete(t);
            } else {
                this.actual.onComplete();
            }
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.Camera2StreamConfigurationMap.cancel();
        }
    }
}
