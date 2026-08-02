package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableElementAtMaybe<T> extends io.reactivex.Maybe<T> implements io.reactivex.internal.fuseable.FuseToFlowable<T> {
    final long Camera2StreamConfigurationMap;
    final io.reactivex.Flowable<T> getHighSpeedVideoSizes;

    public FlowableElementAtMaybe(io.reactivex.Flowable<T> flowable, long j) {
        this.getHighSpeedVideoSizes = flowable;
        this.Camera2StreamConfigurationMap = j;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.getHighSpeedVideoSizes.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableElementAtMaybe.ElementAtSubscriber(maybeObserver, this.Camera2StreamConfigurationMap));
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public final io.reactivex.Flowable<T> fuseToFlowable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableElementAt(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, null, false));
    }

    /* loaded from: classes17.dex */
    static final class ElementAtSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        boolean Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoFpsRangesFor;
        final long getHighSpeedVideoSizes;

        ElementAtSubscriber(io.reactivex.MaybeObserver<? super T> maybeObserver, long j) {
            this.getHighSpeedVideoFpsRanges = maybeObserver;
            this.getHighSpeedVideoSizes = j;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, subscription)) {
                this.getHighResolutionOutputSizeshNQ4ISI = subscription;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            long j = this.getHighSpeedVideoFpsRangesFor;
            if (j == this.getHighSpeedVideoSizes) {
                this.Camera2StreamConfigurationMap = true;
                this.getHighResolutionOutputSizeshNQ4ISI.cancel();
                this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                this.getHighSpeedVideoFpsRanges.onSuccess(t);
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = j + 1;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRanges.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }
    }
}
