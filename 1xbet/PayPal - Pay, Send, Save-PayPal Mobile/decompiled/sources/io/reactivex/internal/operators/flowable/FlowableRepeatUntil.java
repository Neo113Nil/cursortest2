package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableRepeatUntil<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.BooleanSupplier getHighSpeedVideoSizes;

    public FlowableRepeatUntil(io.reactivex.Flowable<T> flowable, io.reactivex.functions.BooleanSupplier booleanSupplier) {
        super(flowable);
        this.getHighSpeedVideoSizes = booleanSupplier;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.subscriptions.SubscriptionArbiter subscriptionArbiter = new io.reactivex.internal.subscriptions.SubscriptionArbiter();
        subscriber.onSubscribe(subscriptionArbiter);
        new io.reactivex.internal.operators.flowable.FlowableRepeatUntil.RepeatSubscriber(subscriber, this.getHighSpeedVideoSizes, subscriptionArbiter, this.source).getHighResolutionOutputSizeshNQ4ISI();
    }

    /* loaded from: classes17.dex */
    static final class RepeatSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.internal.subscriptions.SubscriptionArbiter Camera2StreamConfigurationMap;
        final org.reactivestreams.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.BooleanSupplier getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Publisher<? extends T> getHighSpeedVideoFpsRangesFor;
        long getHighSpeedVideoSizes;

        RepeatSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.BooleanSupplier booleanSupplier, io.reactivex.internal.subscriptions.SubscriptionArbiter subscriptionArbiter, org.reactivestreams.Publisher<? extends T> publisher) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.Camera2StreamConfigurationMap = subscriptionArbiter;
            this.getHighSpeedVideoFpsRangesFor = publisher;
            this.getHighSpeedVideoFpsRanges = booleanSupplier;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            this.Camera2StreamConfigurationMap.setSubscription(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighSpeedVideoSizes++;
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            try {
                if (this.getHighSpeedVideoFpsRanges.getAsBoolean()) {
                    this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
                } else {
                    getHighResolutionOutputSizeshNQ4ISI();
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.Camera2StreamConfigurationMap.isCancelled()) {
                    long j = this.getHighSpeedVideoSizes;
                    if (j != 0) {
                        this.getHighSpeedVideoSizes = 0L;
                        this.Camera2StreamConfigurationMap.produced(j);
                    }
                    this.getHighSpeedVideoFpsRangesFor.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }
}
