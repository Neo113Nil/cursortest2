package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableTakeUntil<T, U> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final org.reactivestreams.Publisher<? extends U> getHighResolutionOutputSizeshNQ4ISI;

    public FlowableTakeUntil(io.reactivex.Flowable<T> flowable, org.reactivestreams.Publisher<? extends U> publisher) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = publisher;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber takeUntilMainSubscriber = new io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber(subscriber);
        subscriber.onSubscribe(takeUntilMainSubscriber);
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(takeUntilMainSubscriber.getHighResolutionOutputSizeshNQ4ISI);
        this.source.subscribe((io.reactivex.FlowableSubscriber) takeUntilMainSubscriber);
    }

    /* loaded from: classes17.dex */
    static final class TakeUntilMainSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -4945480365982832967L;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber<T>.OtherSubscriber getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber.OtherSubscriber();
        final io.reactivex.internal.util.AtomicThrowable Camera2StreamConfigurationMap = new io.reactivex.internal.util.AtomicThrowable();

        TakeUntilMainSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            io.reactivex.internal.util.HalfSerializer.onNext(this.getHighSpeedVideoFpsRangesFor, t, this, this.Camera2StreamConfigurationMap);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighResolutionOutputSizeshNQ4ISI);
            io.reactivex.internal.util.HalfSerializer.onError(this.getHighSpeedVideoFpsRangesFor, th, this, this.Camera2StreamConfigurationMap);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighResolutionOutputSizeshNQ4ISI);
            io.reactivex.internal.util.HalfSerializer.onComplete(this.getHighSpeedVideoFpsRangesFor, this, this.Camera2StreamConfigurationMap);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoSizes);
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        final class OtherSubscriber extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
            private static final long serialVersionUID = -3592821756711087922L;

            OtherSubscriber() {
            }

            @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
            public final void onSubscribe(org.reactivestreams.Subscription subscription) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(java.lang.Object obj) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
                onComplete();
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber.this.getHighSpeedVideoSizes);
                org.reactivestreams.Subscriber<? super T> subscriber = io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber.this.getHighSpeedVideoFpsRangesFor;
                io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber takeUntilMainSubscriber = io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber.this;
                io.reactivex.internal.util.HalfSerializer.onError(subscriber, th, takeUntilMainSubscriber, takeUntilMainSubscriber.Camera2StreamConfigurationMap);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber.this.getHighSpeedVideoSizes);
                org.reactivestreams.Subscriber<? super T> subscriber = io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber.this.getHighSpeedVideoFpsRangesFor;
                io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber takeUntilMainSubscriber = io.reactivex.internal.operators.flowable.FlowableTakeUntil.TakeUntilMainSubscriber.this;
                io.reactivex.internal.util.HalfSerializer.onComplete(subscriber, takeUntilMainSubscriber, takeUntilMainSubscriber.Camera2StreamConfigurationMap);
            }
        }
    }
}
