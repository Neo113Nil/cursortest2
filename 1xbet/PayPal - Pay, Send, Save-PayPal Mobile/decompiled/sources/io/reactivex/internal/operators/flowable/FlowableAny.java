package io.reactivex.internal.operators.flowable;

/* loaded from: classes17.dex */
public final class FlowableAny<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, java.lang.Boolean> {
    final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoFpsRangesFor;

    public FlowableAny(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Predicate<? super T> predicate) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = predicate;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Boolean> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableAny.AnySubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor));
    }

    static final class AnySubscriber<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<java.lang.Boolean> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -2311252482644620661L;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        AnySubscriber(org.reactivestreams.Subscriber<? super java.lang.Boolean> subscriber, io.reactivex.functions.Predicate<? super T> predicate) {
            super(subscriber);
            this.getHighSpeedVideoFpsRangesFor = predicate;
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
        public final void onNext(T t) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            try {
                if (this.getHighSpeedVideoFpsRangesFor.test(t)) {
                    this.getHighSpeedVideoSizes = true;
                    this.getHighResolutionOutputSizeshNQ4ISI.cancel();
                    complete(java.lang.Boolean.TRUE);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighResolutionOutputSizeshNQ4ISI.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoSizes = true;
                this.actual.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            complete(java.lang.Boolean.FALSE);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
        }
    }
}
