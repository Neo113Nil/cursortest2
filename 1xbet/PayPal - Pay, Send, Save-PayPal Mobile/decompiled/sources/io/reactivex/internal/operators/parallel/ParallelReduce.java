package io.reactivex.internal.operators.parallel;

/* loaded from: classes3.dex */
public final class ParallelReduce<T, R> extends io.reactivex.parallel.ParallelFlowable<R> {
    final io.reactivex.parallel.ParallelFlowable<? extends T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.BiFunction<R, ? super T, R> getHighSpeedVideoFpsRanges;
    final java.util.concurrent.Callable<R> getHighSpeedVideoSizes;

    public ParallelReduce(io.reactivex.parallel.ParallelFlowable<? extends T> parallelFlowable, java.util.concurrent.Callable<R> callable, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction) {
        this.getHighResolutionOutputSizeshNQ4ISI = parallelFlowable;
        this.getHighSpeedVideoSizes = callable;
        this.getHighSpeedVideoFpsRanges = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final void subscribe(org.reactivestreams.Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            org.reactivestreams.Subscriber<? super java.lang.Object>[] subscriberArr2 = new org.reactivestreams.Subscriber[length];
            for (int i = 0; i < length; i++) {
                try {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelReduce.ParallelReduceSubscriber(subscriberArr[i], io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.call(), "The initialSupplier returned a null value"), this.getHighSpeedVideoFpsRanges);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    for (org.reactivestreams.Subscriber<? super R> subscriber : subscriberArr) {
                        io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
                    }
                    return;
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI.subscribe(subscriberArr2);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final int parallelism() {
        return this.getHighResolutionOutputSizeshNQ4ISI.parallelism();
    }

    /* loaded from: classes17.dex */
    static final class ParallelReduceSubscriber<T, R> extends io.reactivex.internal.subscribers.DeferredScalarSubscriber<T, R> {
        private static final long serialVersionUID = 8200530050639449080L;
        R getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.BiFunction<R, ? super T, R> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoSizes;

        ParallelReduceSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, R r, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction) {
            super(subscriber);
            this.getHighResolutionOutputSizeshNQ4ISI = r;
            this.getHighSpeedVideoFpsRanges = biFunction;
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
                this.getHighResolutionOutputSizeshNQ4ISI = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(this.getHighResolutionOutputSizeshNQ4ISI, t), "The reducer returned a null value");
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
            R r = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            complete(r);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.s.cancel();
        }
    }
}
