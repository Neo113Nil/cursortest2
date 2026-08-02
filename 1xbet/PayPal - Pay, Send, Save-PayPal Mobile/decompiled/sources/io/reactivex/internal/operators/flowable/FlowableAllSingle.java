package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableAllSingle<T> extends io.reactivex.Single<java.lang.Boolean> implements io.reactivex.internal.fuseable.FuseToFlowable<java.lang.Boolean> {
    final io.reactivex.Flowable<T> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoFpsRangesFor;

    public FlowableAllSingle(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Predicate<? super T> predicate) {
        this.Camera2StreamConfigurationMap = flowable;
        this.getHighSpeedVideoFpsRangesFor = predicate;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
        this.Camera2StreamConfigurationMap.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableAllSingle.AllSubscriber(singleObserver, this.getHighSpeedVideoFpsRangesFor));
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public final io.reactivex.Flowable<java.lang.Boolean> fuseToFlowable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableAll(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class AllSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        boolean Camera2StreamConfigurationMap;
        final io.reactivex.SingleObserver<? super java.lang.Boolean> getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Subscription getHighSpeedVideoSizes;

        AllSubscriber(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver, io.reactivex.functions.Predicate<? super T> predicate) {
            this.getHighSpeedVideoFpsRanges = singleObserver;
            this.getHighSpeedVideoFpsRangesFor = predicate;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizes, subscription)) {
                this.getHighSpeedVideoSizes = subscription;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            try {
                if (this.getHighSpeedVideoFpsRangesFor.test(t)) {
                    return;
                }
                this.Camera2StreamConfigurationMap = true;
                this.getHighSpeedVideoSizes.cancel();
                this.getHighSpeedVideoSizes = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                this.getHighSpeedVideoFpsRanges.onSuccess(java.lang.Boolean.FALSE);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoSizes.cancel();
                this.getHighSpeedVideoSizes = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoSizes = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoSizes = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.getHighSpeedVideoFpsRanges.onSuccess(java.lang.Boolean.TRUE);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes.cancel();
            this.getHighSpeedVideoSizes = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }
    }
}
