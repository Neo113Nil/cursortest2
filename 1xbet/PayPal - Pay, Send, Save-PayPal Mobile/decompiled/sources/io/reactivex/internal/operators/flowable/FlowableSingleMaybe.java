package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableSingleMaybe<T> extends io.reactivex.Maybe<T> implements io.reactivex.internal.fuseable.FuseToFlowable<T> {
    final io.reactivex.Flowable<T> Camera2StreamConfigurationMap;

    public FlowableSingleMaybe(io.reactivex.Flowable<T> flowable) {
        this.Camera2StreamConfigurationMap = flowable;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.Camera2StreamConfigurationMap.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableSingleMaybe.SingleElementSubscriber(maybeObserver));
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public final io.reactivex.Flowable<T> fuseToFlowable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableSingle(this.Camera2StreamConfigurationMap, null, false));
    }

    /* loaded from: classes17.dex */
    static final class SingleElementSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        T Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoSizes;

        SingleElementSubscriber(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.getHighSpeedVideoSizes = maybeObserver;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
                this.getHighSpeedVideoFpsRanges = subscription;
                this.getHighSpeedVideoSizes.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            if (this.Camera2StreamConfigurationMap != null) {
                this.getHighSpeedVideoFpsRangesFor = true;
                this.getHighSpeedVideoFpsRanges.cancel();
                this.getHighSpeedVideoFpsRanges = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                this.getHighSpeedVideoSizes.onError(new java.lang.IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.Camera2StreamConfigurationMap = t;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            T t = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = null;
            if (t == null) {
                this.getHighSpeedVideoSizes.onComplete();
            } else {
                this.getHighSpeedVideoSizes.onSuccess(t);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges.cancel();
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }
    }
}
