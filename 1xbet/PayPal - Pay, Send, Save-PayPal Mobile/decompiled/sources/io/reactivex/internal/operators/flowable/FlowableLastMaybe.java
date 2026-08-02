package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableLastMaybe<T> extends io.reactivex.Maybe<T> {
    final org.reactivestreams.Publisher<T> getHighResolutionOutputSizeshNQ4ISI;

    public FlowableLastMaybe(org.reactivestreams.Publisher<T> publisher) {
        this.getHighResolutionOutputSizeshNQ4ISI = publisher;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.flowable.FlowableLastMaybe.LastSubscriber(maybeObserver));
    }

    /* loaded from: classes17.dex */
    static final class LastSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        T Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRangesFor;

        LastSubscriber(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.getHighSpeedVideoFpsRangesFor = maybeObserver;
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
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.Camera2StreamConfigurationMap = t;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            T t = this.Camera2StreamConfigurationMap;
            if (t != null) {
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
            } else {
                this.getHighSpeedVideoFpsRangesFor.onComplete();
            }
        }
    }
}
