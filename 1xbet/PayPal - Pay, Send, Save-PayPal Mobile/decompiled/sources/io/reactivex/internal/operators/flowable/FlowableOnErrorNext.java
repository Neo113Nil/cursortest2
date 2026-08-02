package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableOnErrorNext<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final boolean Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends org.reactivestreams.Publisher<? extends T>> getHighResolutionOutputSizeshNQ4ISI;

    public FlowableOnErrorNext(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends org.reactivestreams.Publisher<? extends T>> function, boolean z) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableOnErrorNext.OnErrorNextSubscriber onErrorNextSubscriber = new io.reactivex.internal.operators.flowable.FlowableOnErrorNext.OnErrorNextSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
        subscriber.onSubscribe(onErrorNextSubscriber.Camera2StreamConfigurationMap);
        this.source.subscribe((io.reactivex.FlowableSubscriber) onErrorNextSubscriber);
    }

    /* loaded from: classes17.dex */
    static final class OnErrorNextSubscriber<T> implements io.reactivex.FlowableSubscriber<T> {
        final io.reactivex.internal.subscriptions.SubscriptionArbiter Camera2StreamConfigurationMap = new io.reactivex.internal.subscriptions.SubscriptionArbiter();
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends org.reactivestreams.Publisher<? extends T>> getHighSpeedVideoFpsRangesFor;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;
        boolean getHighSpeedVideoSizesFor;

        OnErrorNextSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends org.reactivestreams.Publisher<? extends T>> function, boolean z) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getHighSpeedVideoFpsRangesFor = function;
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            this.Camera2StreamConfigurationMap.setSubscription(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighSpeedVideoSizes.onNext(t);
            if (this.getHighSpeedVideoSizesFor) {
                return;
            }
            this.Camera2StreamConfigurationMap.produced(1L);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizesFor) {
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                    return;
                } else {
                    this.getHighSpeedVideoSizes.onError(th);
                    return;
                }
            }
            this.getHighSpeedVideoSizesFor = true;
            if (this.getHighSpeedVideoFpsRanges && !(th instanceof java.lang.Exception)) {
                this.getHighSpeedVideoSizes.onError(th);
                return;
            }
            try {
                org.reactivestreams.Publisher<? extends T> apply = this.getHighSpeedVideoFpsRangesFor.apply(th);
                if (apply == null) {
                    java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Publisher is null");
                    nullPointerException.initCause(th);
                    this.getHighSpeedVideoSizes.onError(nullPointerException);
                    return;
                }
                apply.subscribe(this);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.getHighSpeedVideoSizes.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizesFor = true;
            this.getHighSpeedVideoSizes.onComplete();
        }
    }
}
