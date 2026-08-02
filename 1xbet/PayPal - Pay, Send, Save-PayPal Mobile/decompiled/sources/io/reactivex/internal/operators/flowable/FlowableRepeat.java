package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableRepeat<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long Camera2StreamConfigurationMap;

    public FlowableRepeat(io.reactivex.Flowable<T> flowable, long j) {
        super(flowable);
        this.Camera2StreamConfigurationMap = j;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.subscriptions.SubscriptionArbiter subscriptionArbiter = new io.reactivex.internal.subscriptions.SubscriptionArbiter();
        subscriber.onSubscribe(subscriptionArbiter);
        long j = this.Camera2StreamConfigurationMap;
        new io.reactivex.internal.operators.flowable.FlowableRepeat.RepeatSubscriber(subscriber, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, subscriptionArbiter, this.source).getHighResolutionOutputSizeshNQ4ISI();
    }

    /* loaded from: classes17.dex */
    static final class RepeatSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        long Camera2StreamConfigurationMap;
        final org.reactivestreams.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final org.reactivestreams.Publisher<? extends T> getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoFpsRangesFor;
        final io.reactivex.internal.subscriptions.SubscriptionArbiter getHighSpeedVideoSizes;

        RepeatSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j, io.reactivex.internal.subscriptions.SubscriptionArbiter subscriptionArbiter, org.reactivestreams.Publisher<? extends T> publisher) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getHighSpeedVideoSizes = subscriptionArbiter;
            this.getHighSpeedVideoFpsRanges = publisher;
            this.getHighSpeedVideoFpsRangesFor = j;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            this.getHighSpeedVideoSizes.setSubscription(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.Camera2StreamConfigurationMap++;
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            long j = this.getHighSpeedVideoFpsRangesFor;
            if (j != Long.MAX_VALUE) {
                this.getHighSpeedVideoFpsRangesFor = j - 1;
            }
            if (j != 0) {
                getHighResolutionOutputSizeshNQ4ISI();
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.getHighSpeedVideoSizes.isCancelled()) {
                    long j = this.Camera2StreamConfigurationMap;
                    if (j != 0) {
                        this.Camera2StreamConfigurationMap = 0L;
                        this.getHighSpeedVideoSizes.produced(j);
                    }
                    this.getHighSpeedVideoFpsRanges.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }
}
