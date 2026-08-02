package io.reactivex.internal.operators.flowable;

/* loaded from: classes17.dex */
public final class FlowableSingle<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final T getHighResolutionOutputSizeshNQ4ISI;
    final boolean getHighSpeedVideoSizes;

    public FlowableSingle(io.reactivex.Flowable<T> flowable, T t, boolean z) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = t;
        this.getHighSpeedVideoSizes = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableSingle.SingleElementSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes));
    }

    static final class SingleElementSubscriber<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -5526049321428043809L;
        org.reactivestreams.Subscription Camera2StreamConfigurationMap;
        boolean getHighSpeedVideoFpsRanges;
        final boolean getHighSpeedVideoFpsRangesFor;
        final T getHighSpeedVideoSizes;

        SingleElementSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, T t, boolean z) {
            super(subscriber);
            this.getHighSpeedVideoSizes = t;
            this.getHighSpeedVideoFpsRangesFor = z;
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
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            if (this.value != null) {
                this.getHighSpeedVideoFpsRanges = true;
                this.Camera2StreamConfigurationMap.cancel();
                this.actual.onError(new java.lang.IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.value = t;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoFpsRanges = true;
                this.actual.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            T t = this.value;
            this.value = null;
            if (t == null) {
                t = this.getHighSpeedVideoSizes;
            }
            if (t == null) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    this.actual.onError(new java.util.NoSuchElementException());
                    return;
                } else {
                    this.actual.onComplete();
                    return;
                }
            }
            complete(t);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.Camera2StreamConfigurationMap.cancel();
        }
    }
}
