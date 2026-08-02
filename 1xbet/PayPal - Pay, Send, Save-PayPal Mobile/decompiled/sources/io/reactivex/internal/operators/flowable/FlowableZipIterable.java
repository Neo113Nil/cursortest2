package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableZipIterable<T, U, V> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, V> {
    final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.Iterable<U> getHighSpeedVideoSizes;

    public FlowableZipIterable(io.reactivex.Flowable<T> flowable, java.lang.Iterable<U> iterable, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> biFunction) {
        super(flowable);
        this.getHighSpeedVideoSizes = iterable;
        this.getHighResolutionOutputSizeshNQ4ISI = biFunction;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super V> subscriber) {
        try {
            java.util.Iterator it = (java.util.Iterator) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    io.reactivex.internal.subscriptions.EmptySubscription.complete(subscriber);
                } else {
                    this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableZipIterable.ZipIterableSubscriber(subscriber, it, this.getHighResolutionOutputSizeshNQ4ISI));
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
            }
        } catch (java.lang.Throwable th2) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th2, subscriber);
        }
    }

    /* loaded from: classes17.dex */
    static final class ZipIterableSubscriber<T, U, V> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super V> Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        final java.util.Iterator<U> getHighSpeedVideoSizes;

        ZipIterableSubscriber(org.reactivestreams.Subscriber<? super V> subscriber, java.util.Iterator<U> it, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> biFunction) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoSizes = it;
            this.getHighSpeedVideoFpsRanges = biFunction;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, subscription)) {
                this.getHighResolutionOutputSizeshNQ4ISI = subscription;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            try {
                try {
                    this.Camera2StreamConfigurationMap.onNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(t, io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (this.getHighSpeedVideoSizes.hasNext()) {
                            return;
                        }
                        this.getHighSpeedVideoFpsRangesFor = true;
                        this.getHighResolutionOutputSizeshNQ4ISI.cancel();
                        this.Camera2StreamConfigurationMap.onComplete();
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.getHighSpeedVideoFpsRangesFor = true;
                        this.getHighResolutionOutputSizeshNQ4ISI.cancel();
                        this.Camera2StreamConfigurationMap.onError(th);
                    }
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    this.getHighSpeedVideoFpsRangesFor = true;
                    this.getHighResolutionOutputSizeshNQ4ISI.cancel();
                    this.Camera2StreamConfigurationMap.onError(th2);
                }
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                this.getHighSpeedVideoFpsRangesFor = true;
                this.getHighResolutionOutputSizeshNQ4ISI.cancel();
                this.Camera2StreamConfigurationMap.onError(th3);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoFpsRangesFor = true;
                this.Camera2StreamConfigurationMap.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.Camera2StreamConfigurationMap.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighResolutionOutputSizeshNQ4ISI.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
        }
    }
}
