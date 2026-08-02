package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableSingleSingle<T> extends io.reactivex.Single<T> implements io.reactivex.internal.fuseable.FuseToFlowable<T> {
    final io.reactivex.Flowable<T> getHighSpeedVideoFpsRanges;
    final T getHighSpeedVideoSizes;

    public FlowableSingleSingle(io.reactivex.Flowable<T> flowable, T t) {
        this.getHighSpeedVideoFpsRanges = flowable;
        this.getHighSpeedVideoSizes = t;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoFpsRanges.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableSingleSingle.SingleElementSubscriber(singleObserver, this.getHighSpeedVideoSizes));
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public final io.reactivex.Flowable<T> fuseToFlowable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableSingle(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, true));
    }

    /* loaded from: classes17.dex */
    static final class SingleElementSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        org.reactivestreams.Subscription Camera2StreamConfigurationMap;
        final T getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoFpsRangesFor;
        T getHighSpeedVideoSizes;

        SingleElementSubscriber(io.reactivex.SingleObserver<? super T> singleObserver, T t) {
            this.getHighSpeedVideoFpsRangesFor = singleObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = t;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.Camera2StreamConfigurationMap, subscription)) {
                this.Camera2StreamConfigurationMap = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            if (this.getHighSpeedVideoSizes != null) {
                this.getHighSpeedVideoFpsRanges = true;
                this.Camera2StreamConfigurationMap.cancel();
                this.Camera2StreamConfigurationMap = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                this.getHighSpeedVideoFpsRangesFor.onError(new java.lang.IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.getHighSpeedVideoSizes = t;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.Camera2StreamConfigurationMap = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.Camera2StreamConfigurationMap = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            T t = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = null;
            if (t == null) {
                t = this.getHighResolutionOutputSizeshNQ4ISI;
            }
            if (t != null) {
                this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
            } else {
                this.getHighSpeedVideoFpsRangesFor.onError(new java.util.NoSuchElementException());
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap.cancel();
            this.Camera2StreamConfigurationMap = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }
    }
}
