package io.reactivex.internal.operators.flowable;

/* loaded from: classes17.dex */
public final class FlowableAll<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, java.lang.Boolean> {
    final io.reactivex.functions.Predicate<? super T> getHighResolutionOutputSizeshNQ4ISI;

    public FlowableAll(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Predicate<? super T> predicate) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = predicate;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Boolean> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableAll.AllSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    static final class AllSubscriber<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<java.lang.Boolean> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -3521127104134758517L;
        final io.reactivex.functions.Predicate<? super T> Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        org.reactivestreams.Subscription getHighSpeedVideoSizes;

        AllSubscriber(org.reactivestreams.Subscriber<? super java.lang.Boolean> subscriber, io.reactivex.functions.Predicate<? super T> predicate) {
            super(subscriber);
            this.Camera2StreamConfigurationMap = predicate;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizes, subscription)) {
                this.getHighSpeedVideoSizes = subscription;
                this.actual.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            try {
                if (this.Camera2StreamConfigurationMap.test(t)) {
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoSizes.cancel();
                complete(java.lang.Boolean.FALSE);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoSizes.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.actual.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            complete(java.lang.Boolean.TRUE);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.getHighSpeedVideoSizes.cancel();
        }
    }
}
