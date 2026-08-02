package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableRetryBiPredicate<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> getHighSpeedVideoSizes;

    public FlowableRetryBiPredicate(io.reactivex.Flowable<T> flowable, io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> biPredicate) {
        super(flowable);
        this.getHighSpeedVideoSizes = biPredicate;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.subscriptions.SubscriptionArbiter subscriptionArbiter = new io.reactivex.internal.subscriptions.SubscriptionArbiter();
        subscriber.onSubscribe(subscriptionArbiter);
        new io.reactivex.internal.operators.flowable.FlowableRetryBiPredicate.RetryBiSubscriber(subscriber, this.getHighSpeedVideoSizes, subscriptionArbiter, this.source).Camera2StreamConfigurationMap();
    }

    /* loaded from: classes17.dex */
    static final class RetryBiSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        long Camera2StreamConfigurationMap;
        final io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.subscriptions.SubscriptionArbiter getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        final org.reactivestreams.Publisher<? extends T> getOutputMinFrameDuration;

        RetryBiSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> biPredicate, io.reactivex.internal.subscriptions.SubscriptionArbiter subscriptionArbiter, org.reactivestreams.Publisher<? extends T> publisher) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighSpeedVideoFpsRanges = subscriptionArbiter;
            this.getOutputMinFrameDuration = publisher;
            this.getHighResolutionOutputSizeshNQ4ISI = biPredicate;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            this.getHighSpeedVideoFpsRanges.setSubscription(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.Camera2StreamConfigurationMap++;
            this.getHighSpeedVideoFpsRangesFor.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            try {
                io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> biPredicate = this.getHighResolutionOutputSizeshNQ4ISI;
                int i = this.getHighSpeedVideoSizes + 1;
                this.getHighSpeedVideoSizes = i;
                if (!biPredicate.test(java.lang.Integer.valueOf(i), th)) {
                    this.getHighSpeedVideoFpsRangesFor.onError(th);
                } else {
                    Camera2StreamConfigurationMap();
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.getHighSpeedVideoFpsRangesFor.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }

        final void Camera2StreamConfigurationMap() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.getHighSpeedVideoFpsRanges.isCancelled()) {
                    long j = this.Camera2StreamConfigurationMap;
                    if (j != 0) {
                        this.Camera2StreamConfigurationMap = 0L;
                        this.getHighSpeedVideoFpsRanges.produced(j);
                    }
                    this.getOutputMinFrameDuration.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }
}
