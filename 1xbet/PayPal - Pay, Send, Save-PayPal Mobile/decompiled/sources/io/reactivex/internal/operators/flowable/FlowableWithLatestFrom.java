package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableWithLatestFrom<T, U, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final org.reactivestreams.Publisher<? extends U> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> getHighSpeedVideoSizes;

    public FlowableWithLatestFrom(io.reactivex.Flowable<T> flowable, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction, org.reactivestreams.Publisher<? extends U> publisher) {
        super(flowable);
        this.getHighSpeedVideoSizes = biFunction;
        this.getHighSpeedVideoFpsRangesFor = publisher;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        io.reactivex.subscribers.SerializedSubscriber serializedSubscriber = new io.reactivex.subscribers.SerializedSubscriber(subscriber);
        io.reactivex.internal.operators.flowable.FlowableWithLatestFrom.WithLatestFromSubscriber withLatestFromSubscriber = new io.reactivex.internal.operators.flowable.FlowableWithLatestFrom.WithLatestFromSubscriber(serializedSubscriber, this.getHighSpeedVideoSizes);
        serializedSubscriber.onSubscribe(withLatestFromSubscriber);
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.flowable.FlowableWithLatestFrom.FlowableWithLatestSubscriber(withLatestFromSubscriber));
        this.source.subscribe((io.reactivex.FlowableSubscriber) withLatestFromSubscriber);
    }

    /* loaded from: classes17.dex */
    static final class WithLatestFromSubscriber<T, U, R> extends java.util.concurrent.atomic.AtomicReference<U> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -312246233408980075L;
        final org.reactivestreams.Subscriber<? super R> getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> getHighSpeedVideoSizes;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();

        WithLatestFromSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getHighSpeedVideoSizes = biFunction;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.get().request(1L);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t) {
            U u = get();
            if (u == null) {
                return false;
            }
            try {
                this.getHighSpeedVideoFpsRanges.onNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.apply(t, u), "The combiner returned a null value"));
                return true;
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                cancel();
                this.getHighSpeedVideoFpsRanges.onError(th);
                return false;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighSpeedVideoFpsRanges.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRangesFor);
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    /* loaded from: classes17.dex */
    final class FlowableWithLatestSubscriber implements io.reactivex.FlowableSubscriber<U> {
        private final io.reactivex.internal.operators.flowable.FlowableWithLatestFrom.WithLatestFromSubscriber<T, U, R> getHighSpeedVideoSizes;

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        FlowableWithLatestSubscriber(io.reactivex.internal.operators.flowable.FlowableWithLatestFrom.WithLatestFromSubscriber<T, U, R> withLatestFromSubscriber) {
            this.getHighSpeedVideoSizes = withLatestFromSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI, subscription)) {
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(U u) {
            this.getHighSpeedVideoSizes.lazySet(u);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.flowable.FlowableWithLatestFrom.WithLatestFromSubscriber<T, U, R> withLatestFromSubscriber = this.getHighSpeedVideoSizes;
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(withLatestFromSubscriber.getHighSpeedVideoFpsRangesFor);
            withLatestFromSubscriber.getHighSpeedVideoFpsRanges.onError(th);
        }
    }
}
