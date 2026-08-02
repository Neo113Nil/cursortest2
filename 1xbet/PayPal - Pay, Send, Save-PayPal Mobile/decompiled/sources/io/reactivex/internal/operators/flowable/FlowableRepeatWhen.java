package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableRepeatWhen<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super io.reactivex.Flowable<java.lang.Object>, ? extends org.reactivestreams.Publisher<?>> Camera2StreamConfigurationMap;

    public FlowableRepeatWhen(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super io.reactivex.Flowable<java.lang.Object>, ? extends org.reactivestreams.Publisher<?>> function) {
        super(flowable);
        this.Camera2StreamConfigurationMap = function;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.subscribers.SerializedSubscriber serializedSubscriber = new io.reactivex.subscribers.SerializedSubscriber(subscriber);
        io.reactivex.processors.FlowableProcessor<T> serialized = io.reactivex.processors.UnicastProcessor.create(8).toSerialized();
        try {
            org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply(serialized), "handler returned a null Publisher");
            io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenReceiver whenReceiver = new io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenReceiver(this.source);
            io.reactivex.internal.operators.flowable.FlowableRepeatWhen.RepeatWhenSubscriber repeatWhenSubscriber = new io.reactivex.internal.operators.flowable.FlowableRepeatWhen.RepeatWhenSubscriber(serializedSubscriber, serialized, whenReceiver);
            whenReceiver.getHighResolutionOutputSizeshNQ4ISI = repeatWhenSubscriber;
            subscriber.onSubscribe(repeatWhenSubscriber);
            publisher.subscribe(whenReceiver);
            whenReceiver.onNext(0);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
        }
    }

    /* loaded from: classes17.dex */
    static final class WhenReceiver<T, U> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<java.lang.Object>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 2827772011130406689L;
        io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber<T, U> getHighResolutionOutputSizeshNQ4ISI;
        final org.reactivestreams.Publisher<T> getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicLong();

        WhenReceiver(org.reactivestreams.Publisher<T> publisher) {
            this.getHighSpeedVideoFpsRangesFor = publisher;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(java.lang.Object obj) {
            if (getAndIncrement() == 0) {
                while (!io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(this.getHighSpeedVideoSizes.get())) {
                    this.getHighSpeedVideoFpsRangesFor.subscribe(this.getHighResolutionOutputSizeshNQ4ISI);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
            this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
            this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoSizes);
        }
    }

    /* loaded from: classes17.dex */
    static abstract class WhenSourceSubscriber<T, U> extends io.reactivex.internal.subscriptions.SubscriptionArbiter implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        private long Camera2StreamConfigurationMap;
        protected final org.reactivestreams.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        protected final org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
        protected final io.reactivex.processors.FlowableProcessor<U> getHighSpeedVideoSizes;

        WhenSourceSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.processors.FlowableProcessor<U> flowableProcessor, org.reactivestreams.Subscription subscription) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getHighSpeedVideoSizes = flowableProcessor;
            this.getHighSpeedVideoFpsRanges = subscription;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            setSubscription(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.Camera2StreamConfigurationMap++;
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
        }

        protected final void getHighSpeedVideoFpsRanges(U u) {
            long j = this.Camera2StreamConfigurationMap;
            if (j != 0) {
                this.Camera2StreamConfigurationMap = 0L;
                produced(j);
            }
            this.getHighSpeedVideoFpsRanges.request(1L);
            this.getHighSpeedVideoSizes.onNext(u);
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.getHighSpeedVideoFpsRanges.cancel();
        }
    }

    /* loaded from: classes17.dex */
    static final class RepeatWhenSubscriber<T> extends io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber<T, java.lang.Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        RepeatWhenSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.processors.FlowableProcessor<java.lang.Object> flowableProcessor, org.reactivestreams.Subscription subscription) {
            super(subscriber, flowableProcessor, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.cancel();
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            getHighSpeedVideoFpsRanges(0);
        }
    }
}
