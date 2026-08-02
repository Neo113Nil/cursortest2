package io.reactivex.internal.operators.flowable;

/* loaded from: classes17.dex */
public final class FlowableCount<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, java.lang.Long> {
    public FlowableCount(io.reactivex.Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableCount.CountSubscriber(subscriber));
    }

    static final class CountSubscriber extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<java.lang.Long> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
        private static final long serialVersionUID = 4973004223787171406L;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoSizes;

        CountSubscriber(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber) {
            super(subscriber);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, subscription)) {
                this.getHighResolutionOutputSizeshNQ4ISI = subscription;
                this.actual.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(java.lang.Object obj) {
            this.getHighSpeedVideoSizes++;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.actual.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            complete(java.lang.Long.valueOf(this.getHighSpeedVideoSizes));
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
        }
    }
}
