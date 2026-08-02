package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableReduceSeedSingle<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.functions.BiFunction<R, ? super T, R> getHighResolutionOutputSizeshNQ4ISI;
    final R getHighSpeedVideoFpsRanges;
    final org.reactivestreams.Publisher<T> getHighSpeedVideoFpsRangesFor;

    public FlowableReduceSeedSingle(org.reactivestreams.Publisher<T> publisher, R r, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction) {
        this.getHighSpeedVideoFpsRangesFor = publisher;
        this.getHighSpeedVideoFpsRanges = r;
        this.getHighResolutionOutputSizeshNQ4ISI = biFunction;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super R> singleObserver) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.flowable.FlowableReduceSeedSingle.ReduceSeedObserver(singleObserver, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class ReduceSeedObserver<T, R> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        org.reactivestreams.Subscription Camera2StreamConfigurationMap;
        final io.reactivex.functions.BiFunction<R, ? super T, R> getHighSpeedVideoFpsRanges;
        final io.reactivex.SingleObserver<? super R> getHighSpeedVideoFpsRangesFor;
        R getHighSpeedVideoSizes;

        ReduceSeedObserver(io.reactivex.SingleObserver<? super R> singleObserver, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction, R r) {
            this.getHighSpeedVideoFpsRangesFor = singleObserver;
            this.getHighSpeedVideoSizes = r;
            this.getHighSpeedVideoFpsRanges = biFunction;
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
            R r = this.getHighSpeedVideoSizes;
            if (r != null) {
                try {
                    this.getHighSpeedVideoSizes = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(r, t), "The reducer returned a null value");
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.Camera2StreamConfigurationMap.cancel();
                    onError(th);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes != null) {
                this.getHighSpeedVideoSizes = null;
                this.Camera2StreamConfigurationMap = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                this.getHighSpeedVideoFpsRangesFor.onError(th);
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            R r = this.getHighSpeedVideoSizes;
            if (r != null) {
                this.getHighSpeedVideoSizes = null;
                this.Camera2StreamConfigurationMap = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                this.getHighSpeedVideoFpsRangesFor.onSuccess(r);
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
