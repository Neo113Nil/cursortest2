package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableSkipUntil<T, U> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final org.reactivestreams.Publisher<U> Camera2StreamConfigurationMap;

    public FlowableSkipUntil(io.reactivex.Flowable<T> flowable, org.reactivestreams.Publisher<U> publisher) {
        super(flowable);
        this.Camera2StreamConfigurationMap = publisher;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableSkipUntil.SkipUntilMainSubscriber skipUntilMainSubscriber = new io.reactivex.internal.operators.flowable.FlowableSkipUntil.SkipUntilMainSubscriber(subscriber);
        subscriber.onSubscribe(skipUntilMainSubscriber);
        this.Camera2StreamConfigurationMap.subscribe(skipUntilMainSubscriber.Camera2StreamConfigurationMap);
        this.source.subscribe((io.reactivex.FlowableSubscriber) skipUntilMainSubscriber);
    }

    /* loaded from: classes17.dex */
    static final class SkipUntilMainSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -6270983465606289181L;
        volatile boolean getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getOutputFormats = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.internal.operators.flowable.FlowableSkipUntil.SkipUntilMainSubscriber<T>.OtherSubscriber Camera2StreamConfigurationMap = new io.reactivex.internal.operators.flowable.FlowableSkipUntil.SkipUntilMainSubscriber.OtherSubscriber();
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.util.AtomicThrowable();

        SkipUntilMainSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoSizes = subscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.getOutputFormats.get().request(1L);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t) {
            if (!this.getHighSpeedVideoFpsRanges) {
                return false;
            }
            io.reactivex.internal.util.HalfSerializer.onNext(this.getHighSpeedVideoSizes, t, this, this.getHighSpeedVideoFpsRangesFor);
            return true;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.Camera2StreamConfigurationMap);
            io.reactivex.internal.util.HalfSerializer.onError(this.getHighSpeedVideoSizes, th, this, this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.Camera2StreamConfigurationMap);
            io.reactivex.internal.util.HalfSerializer.onComplete(this.getHighSpeedVideoSizes, this, this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getOutputFormats);
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.Camera2StreamConfigurationMap);
        }

        final class OtherSubscriber extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
            private static final long serialVersionUID = -5592042965931999169L;

            OtherSubscriber() {
            }

            @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
            public final void onSubscribe(org.reactivestreams.Subscription subscription) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(java.lang.Object obj) {
                io.reactivex.internal.operators.flowable.FlowableSkipUntil.SkipUntilMainSubscriber.this.getHighSpeedVideoFpsRanges = true;
                get().cancel();
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(io.reactivex.internal.operators.flowable.FlowableSkipUntil.SkipUntilMainSubscriber.this.getOutputFormats);
                org.reactivestreams.Subscriber<? super T> subscriber = io.reactivex.internal.operators.flowable.FlowableSkipUntil.SkipUntilMainSubscriber.this.getHighSpeedVideoSizes;
                io.reactivex.internal.operators.flowable.FlowableSkipUntil.SkipUntilMainSubscriber skipUntilMainSubscriber = io.reactivex.internal.operators.flowable.FlowableSkipUntil.SkipUntilMainSubscriber.this;
                io.reactivex.internal.util.HalfSerializer.onError(subscriber, th, skipUntilMainSubscriber, skipUntilMainSubscriber.getHighSpeedVideoFpsRangesFor);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                io.reactivex.internal.operators.flowable.FlowableSkipUntil.SkipUntilMainSubscriber.this.getHighSpeedVideoFpsRanges = true;
            }
        }
    }
}
