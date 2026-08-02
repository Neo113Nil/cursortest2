package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableElementAtSingle<T> extends io.reactivex.Single<T> implements io.reactivex.internal.fuseable.FuseToFlowable<T> {
    final long Camera2StreamConfigurationMap;
    final io.reactivex.Flowable<T> getHighResolutionOutputSizeshNQ4ISI;
    final T getHighSpeedVideoFpsRanges;

    public FlowableElementAtSingle(io.reactivex.Flowable<T> flowable, long j, T t) {
        this.getHighResolutionOutputSizeshNQ4ISI = flowable;
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRanges = t;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableElementAtSingle.ElementAtSubscriber(singleObserver, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges));
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public final io.reactivex.Flowable<T> fuseToFlowable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableElementAt(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, true));
    }

    /* loaded from: classes17.dex */
    static final class ElementAtSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        long Camera2StreamConfigurationMap;
        final io.reactivex.SingleObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        final T getHighSpeedVideoFpsRangesFor;
        final long getHighSpeedVideoSizes;
        org.reactivestreams.Subscription getHighSpeedVideoSizesFor;

        ElementAtSubscriber(io.reactivex.SingleObserver<? super T> singleObserver, long j, T t) {
            this.getHighResolutionOutputSizeshNQ4ISI = singleObserver;
            this.getHighSpeedVideoSizes = j;
            this.getHighSpeedVideoFpsRangesFor = t;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizesFor, subscription)) {
                this.getHighSpeedVideoSizesFor = subscription;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            long j = this.Camera2StreamConfigurationMap;
            if (j == this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoFpsRanges = true;
                this.getHighSpeedVideoSizesFor.cancel();
                this.getHighSpeedVideoSizesFor = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(t);
                return;
            }
            this.Camera2StreamConfigurationMap = j + 1;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoSizesFor = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoSizesFor = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            T t = this.getHighSpeedVideoFpsRangesFor;
            if (t != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(t);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.onError(new java.util.NoSuchElementException());
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizesFor.cancel();
            this.getHighSpeedVideoSizesFor = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizesFor == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }
    }
}
