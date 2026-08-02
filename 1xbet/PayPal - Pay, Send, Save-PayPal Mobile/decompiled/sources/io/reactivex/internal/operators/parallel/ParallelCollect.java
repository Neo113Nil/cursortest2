package io.reactivex.internal.operators.parallel;

/* loaded from: classes3.dex */
public final class ParallelCollect<T, C> extends io.reactivex.parallel.ParallelFlowable<C> {
    final io.reactivex.functions.BiConsumer<? super C, ? super T> Camera2StreamConfigurationMap;
    final java.util.concurrent.Callable<? extends C> getHighSpeedVideoFpsRanges;
    final io.reactivex.parallel.ParallelFlowable<? extends T> getHighSpeedVideoFpsRangesFor;

    public ParallelCollect(io.reactivex.parallel.ParallelFlowable<? extends T> parallelFlowable, java.util.concurrent.Callable<? extends C> callable, io.reactivex.functions.BiConsumer<? super C, ? super T> biConsumer) {
        this.getHighSpeedVideoFpsRangesFor = parallelFlowable;
        this.getHighSpeedVideoFpsRanges = callable;
        this.Camera2StreamConfigurationMap = biConsumer;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final void subscribe(org.reactivestreams.Subscriber<? super C>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            org.reactivestreams.Subscriber<? super java.lang.Object>[] subscriberArr2 = new org.reactivestreams.Subscriber[length];
            for (int i = 0; i < length; i++) {
                try {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelCollect.ParallelCollectSubscriber(subscriberArr[i], io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.call(), "The initialSupplier returned a null value"), this.Camera2StreamConfigurationMap);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    for (org.reactivestreams.Subscriber<? super C> subscriber : subscriberArr) {
                        io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
                    }
                    return;
                }
            }
            this.getHighSpeedVideoFpsRangesFor.subscribe(subscriberArr2);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final int parallelism() {
        return this.getHighSpeedVideoFpsRangesFor.parallelism();
    }

    /* loaded from: classes17.dex */
    static final class ParallelCollectSubscriber<T, C> extends io.reactivex.internal.subscribers.DeferredScalarSubscriber<T, C> {
        private static final long serialVersionUID = -4767392946044436228L;
        C getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.BiConsumer<? super C, ? super T> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoSizes;

        ParallelCollectSubscriber(org.reactivestreams.Subscriber<? super C> subscriber, C c, io.reactivex.functions.BiConsumer<? super C, ? super T> biConsumer) {
            super(subscriber);
            this.getHighResolutionOutputSizeshNQ4ISI = c;
            this.getHighSpeedVideoFpsRanges = biConsumer;
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.s, subscription)) {
                this.s = subscription;
                this.actual.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            try {
                this.getHighSpeedVideoFpsRanges.accept(this.getHighResolutionOutputSizeshNQ4ISI, t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.actual.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            C c = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            complete(c);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.s.cancel();
        }
    }
}
