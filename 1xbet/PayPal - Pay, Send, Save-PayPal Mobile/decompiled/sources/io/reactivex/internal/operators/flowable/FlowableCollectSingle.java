package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableCollectSingle<T, U> extends io.reactivex.Single<U> implements io.reactivex.internal.fuseable.FuseToFlowable<U> {
    final java.util.concurrent.Callable<? extends U> Camera2StreamConfigurationMap;
    final io.reactivex.functions.BiConsumer<? super U, ? super T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.Flowable<T> getHighSpeedVideoFpsRangesFor;

    public FlowableCollectSingle(io.reactivex.Flowable<T> flowable, java.util.concurrent.Callable<? extends U> callable, io.reactivex.functions.BiConsumer<? super U, ? super T> biConsumer) {
        this.getHighSpeedVideoFpsRangesFor = flowable;
        this.Camera2StreamConfigurationMap = callable;
        this.getHighResolutionOutputSizeshNQ4ISI = biConsumer;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super U> singleObserver) {
        try {
            this.getHighSpeedVideoFpsRangesFor.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableCollectSingle.CollectSubscriber(singleObserver, io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The initialSupplier returned a null value"), this.getHighResolutionOutputSizeshNQ4ISI));
        } catch (java.lang.Throwable th) {
            io.reactivex.internal.disposables.EmptyDisposable.error(th, singleObserver);
        }
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public final io.reactivex.Flowable<U> fuseToFlowable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableCollect(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class CollectSubscriber<T, U> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        boolean Camera2StreamConfigurationMap;
        final io.reactivex.functions.BiConsumer<? super U, ? super T> getHighResolutionOutputSizeshNQ4ISI;
        final U getHighSpeedVideoFpsRanges;
        final io.reactivex.SingleObserver<? super U> getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Subscription getHighSpeedVideoSizes;

        CollectSubscriber(io.reactivex.SingleObserver<? super U> singleObserver, U u, io.reactivex.functions.BiConsumer<? super U, ? super T> biConsumer) {
            this.getHighSpeedVideoFpsRangesFor = singleObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = biConsumer;
            this.getHighSpeedVideoFpsRanges = u;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizes, subscription)) {
                this.getHighSpeedVideoSizes = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.accept(this.getHighSpeedVideoFpsRanges, t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoSizes.cancel();
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
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoSizes = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.getHighSpeedVideoFpsRangesFor.onSuccess(this.getHighSpeedVideoFpsRanges);
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
