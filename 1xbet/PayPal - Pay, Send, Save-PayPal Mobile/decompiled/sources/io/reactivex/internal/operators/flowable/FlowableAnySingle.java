package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableAnySingle<T> extends io.reactivex.Single<java.lang.Boolean> implements io.reactivex.internal.fuseable.FuseToFlowable<java.lang.Boolean> {
    final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoFpsRanges;
    final io.reactivex.Flowable<T> getHighSpeedVideoFpsRangesFor;

    public FlowableAnySingle(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Predicate<? super T> predicate) {
        this.getHighSpeedVideoFpsRangesFor = flowable;
        this.getHighSpeedVideoFpsRanges = predicate;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
        this.getHighSpeedVideoFpsRangesFor.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableAnySingle.AnySubscriber(singleObserver, this.getHighSpeedVideoFpsRanges));
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public final io.reactivex.Flowable<java.lang.Boolean> fuseToFlowable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableAny(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class AnySubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super java.lang.Boolean> Camera2StreamConfigurationMap;
        final io.reactivex.functions.Predicate<? super T> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRangesFor;

        AnySubscriber(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver, io.reactivex.functions.Predicate<? super T> predicate) {
            this.Camera2StreamConfigurationMap = singleObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = predicate;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRangesFor, subscription)) {
                this.getHighSpeedVideoFpsRangesFor = subscription;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            try {
                if (this.getHighResolutionOutputSizeshNQ4ISI.test(t)) {
                    this.getHighSpeedVideoFpsRanges = true;
                    this.getHighSpeedVideoFpsRangesFor.cancel();
                    this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                    this.Camera2StreamConfigurationMap.onSuccess(java.lang.Boolean.TRUE);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoFpsRangesFor.cancel();
                this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.Camera2StreamConfigurationMap.onSuccess(java.lang.Boolean.FALSE);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor.cancel();
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }
    }
}
