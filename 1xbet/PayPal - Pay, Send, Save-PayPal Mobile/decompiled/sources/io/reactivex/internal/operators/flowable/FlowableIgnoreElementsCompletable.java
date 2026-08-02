package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableIgnoreElementsCompletable<T> extends io.reactivex.Completable implements io.reactivex.internal.fuseable.FuseToFlowable<T> {
    final io.reactivex.Flowable<T> getHighSpeedVideoFpsRangesFor;

    public FlowableIgnoreElementsCompletable(io.reactivex.Flowable<T> flowable) {
        this.getHighSpeedVideoFpsRangesFor = flowable;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.getHighSpeedVideoFpsRangesFor.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableIgnoreElementsCompletable.IgnoreElementsSubscriber(completableObserver));
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public final io.reactivex.Flowable<T> fuseToFlowable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableIgnoreElements(this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class IgnoreElementsSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        org.reactivestreams.Subscription Camera2StreamConfigurationMap;
        final io.reactivex.CompletableObserver getHighSpeedVideoFpsRanges;

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
        }

        IgnoreElementsSubscriber(io.reactivex.CompletableObserver completableObserver) {
            this.getHighSpeedVideoFpsRanges = completableObserver;
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
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.Camera2StreamConfigurationMap = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.getHighSpeedVideoFpsRanges.onComplete();
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
