package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableTakeUntilPredicate<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Predicate<? super T> Camera2StreamConfigurationMap;

    public FlowableTakeUntilPredicate(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Predicate<? super T> predicate) {
        super(flowable);
        this.Camera2StreamConfigurationMap = predicate;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableTakeUntilPredicate.InnerSubscriber(subscriber, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class InnerSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> Camera2StreamConfigurationMap;
        final io.reactivex.functions.Predicate<? super T> getHighResolutionOutputSizeshNQ4ISI;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;

        InnerSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Predicate<? super T> predicate) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = predicate;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
                this.getHighSpeedVideoFpsRanges = subscription;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.Camera2StreamConfigurationMap.onNext(t);
            try {
                if (this.getHighResolutionOutputSizeshNQ4ISI.test(t)) {
                    this.getHighSpeedVideoFpsRangesFor = true;
                    this.getHighSpeedVideoFpsRanges.cancel();
                    this.Camera2StreamConfigurationMap.onComplete();
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoFpsRanges.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (!this.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoFpsRangesFor = true;
                this.Camera2StreamConfigurationMap.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.Camera2StreamConfigurationMap.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighSpeedVideoFpsRanges.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRanges.cancel();
        }
    }
}
