package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableScan<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.BiFunction<T, T, T> Camera2StreamConfigurationMap;

    public FlowableScan(io.reactivex.Flowable<T> flowable, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
        super(flowable);
        this.Camera2StreamConfigurationMap = biFunction;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableScan.ScanSubscriber(subscriber, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class ScanSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        org.reactivestreams.Subscription Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        T getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.BiFunction<T, T, T> getHighSpeedVideoFpsRangesFor;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;

        ScanSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getHighSpeedVideoFpsRangesFor = biFunction;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.Camera2StreamConfigurationMap, subscription)) {
                this.Camera2StreamConfigurationMap = subscription;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoSizes;
            T t2 = this.getHighSpeedVideoFpsRanges;
            if (t2 == null) {
                this.getHighSpeedVideoFpsRanges = t;
                subscriber.onNext(t);
                return;
            }
            try {
                ?? r4 = (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.apply(t2, t), "The value returned by the accumulator is null");
                this.getHighSpeedVideoFpsRanges = r4;
                subscriber.onNext(r4);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.Camera2StreamConfigurationMap.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoSizes.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizes.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.Camera2StreamConfigurationMap.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.Camera2StreamConfigurationMap.cancel();
        }
    }
}
