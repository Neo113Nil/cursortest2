package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableCountSingle<T> extends io.reactivex.Single<java.lang.Long> implements io.reactivex.internal.fuseable.FuseToFlowable<java.lang.Long> {
    final io.reactivex.Flowable<T> getHighSpeedVideoSizes;

    public FlowableCountSingle(io.reactivex.Flowable<T> flowable) {
        this.getHighSpeedVideoSizes = flowable;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Long> singleObserver) {
        this.getHighSpeedVideoSizes.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableCountSingle.CountSubscriber(singleObserver));
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public final io.reactivex.Flowable<java.lang.Long> fuseToFlowable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableCount(this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class CountSubscriber implements io.reactivex.FlowableSubscriber<java.lang.Object>, io.reactivex.disposables.Disposable {
        org.reactivestreams.Subscription Camera2StreamConfigurationMap;
        final io.reactivex.SingleObserver<? super java.lang.Long> getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoSizes;

        CountSubscriber(io.reactivex.SingleObserver<? super java.lang.Long> singleObserver) {
            this.getHighSpeedVideoFpsRanges = singleObserver;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.Camera2StreamConfigurationMap, subscription)) {
                this.Camera2StreamConfigurationMap = subscription;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(java.lang.Object obj) {
            this.getHighSpeedVideoSizes++;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.Camera2StreamConfigurationMap = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.getHighSpeedVideoFpsRanges.onSuccess(java.lang.Long.valueOf(this.getHighSpeedVideoSizes));
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
