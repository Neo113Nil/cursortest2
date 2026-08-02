package io.reactivex.internal.operators.flowable;

/* loaded from: classes17.dex */
public final class FlowableReduce<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.BiFunction<T, T, T> getHighSpeedVideoFpsRangesFor;

    public FlowableReduce(io.reactivex.Flowable<T> flowable, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = biFunction;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableReduce.ReduceSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor));
    }

    static final class ReduceSubscriber<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -4663883003264602070L;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.BiFunction<T, T, T> getHighSpeedVideoFpsRanges;

        ReduceSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
            super(subscriber);
            this.getHighSpeedVideoFpsRanges = biFunction;
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
            if (this.getHighResolutionOutputSizeshNQ4ISI == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                return;
            }
            T t2 = this.value;
            if (t2 == null) {
                this.value = t;
                return;
            }
            try {
                this.value = (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(t2, t), "The reducer returned a null value");
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighResolutionOutputSizeshNQ4ISI.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                this.actual.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
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
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }
    }
}
