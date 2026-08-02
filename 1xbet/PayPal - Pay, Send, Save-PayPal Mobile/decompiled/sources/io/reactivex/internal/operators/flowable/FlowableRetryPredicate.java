package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableRetryPredicate<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long Camera2StreamConfigurationMap;
    final io.reactivex.functions.Predicate<? super java.lang.Throwable> getHighSpeedVideoFpsRangesFor;

    public FlowableRetryPredicate(io.reactivex.Flowable<T> flowable, long j, io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = predicate;
        this.Camera2StreamConfigurationMap = j;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.subscriptions.SubscriptionArbiter subscriptionArbiter = new io.reactivex.internal.subscriptions.SubscriptionArbiter();
        subscriber.onSubscribe(subscriptionArbiter);
        new io.reactivex.internal.operators.flowable.FlowableRetryPredicate.RetrySubscriber(subscriber, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, subscriptionArbiter, this.source).Camera2StreamConfigurationMap();
    }

    /* loaded from: classes17.dex */
    static final class RetrySubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.internal.subscriptions.SubscriptionArbiter Camera2StreamConfigurationMap;
        long getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Predicate<? super java.lang.Throwable> getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoFpsRangesFor;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;
        final org.reactivestreams.Publisher<? extends T> getOutputFormats;

        RetrySubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j, io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate, io.reactivex.internal.subscriptions.SubscriptionArbiter subscriptionArbiter, org.reactivestreams.Publisher<? extends T> publisher) {
            this.getHighSpeedVideoSizes = subscriber;
            this.Camera2StreamConfigurationMap = subscriptionArbiter;
            this.getOutputFormats = publisher;
            this.getHighSpeedVideoFpsRanges = predicate;
            this.getHighSpeedVideoFpsRangesFor = j;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            this.Camera2StreamConfigurationMap.setSubscription(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI++;
            this.getHighSpeedVideoSizes.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            long j = this.getHighSpeedVideoFpsRangesFor;
            if (j != Long.MAX_VALUE) {
                this.getHighSpeedVideoFpsRangesFor = j - 1;
            }
            if (j == 0) {
                this.getHighSpeedVideoSizes.onError(th);
                return;
            }
            try {
                if (!this.getHighSpeedVideoFpsRanges.test(th)) {
                    this.getHighSpeedVideoSizes.onError(th);
                } else {
                    Camera2StreamConfigurationMap();
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.getHighSpeedVideoSizes.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoSizes.onComplete();
        }

        final void Camera2StreamConfigurationMap() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.Camera2StreamConfigurationMap.isCancelled()) {
                    long j = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (j != 0) {
                        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
                        this.Camera2StreamConfigurationMap.produced(j);
                    }
                    this.getOutputFormats.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }
}
