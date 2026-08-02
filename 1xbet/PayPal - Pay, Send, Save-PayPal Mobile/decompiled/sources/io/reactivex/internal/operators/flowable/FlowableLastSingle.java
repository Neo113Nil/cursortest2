package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableLastSingle<T> extends io.reactivex.Single<T> {
    final org.reactivestreams.Publisher<T> getHighResolutionOutputSizeshNQ4ISI;
    final T getHighSpeedVideoFpsRangesFor;

    public FlowableLastSingle(org.reactivestreams.Publisher<T> publisher, T t) {
        this.getHighResolutionOutputSizeshNQ4ISI = publisher;
        this.getHighSpeedVideoFpsRangesFor = t;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.flowable.FlowableLastSingle.LastSubscriber(singleObserver, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class LastSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;
        T getHighSpeedVideoFpsRanges;
        final T getHighSpeedVideoFpsRangesFor;
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoSizes;

        LastSubscriber(io.reactivex.SingleObserver<? super T> singleObserver, T t) {
            this.getHighSpeedVideoSizes = singleObserver;
            this.getHighSpeedVideoFpsRangesFor = t;
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

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, subscription)) {
                this.getHighResolutionOutputSizeshNQ4ISI = subscription;
                this.getHighSpeedVideoSizes.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRanges = t;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            T t = this.getHighSpeedVideoFpsRanges;
            if (t != null) {
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighSpeedVideoSizes.onSuccess(t);
                return;
            }
            T t2 = this.getHighSpeedVideoFpsRangesFor;
            if (t2 != null) {
                this.getHighSpeedVideoSizes.onSuccess(t2);
            } else {
                this.getHighSpeedVideoSizes.onError(new java.util.NoSuchElementException());
            }
        }
    }
}
