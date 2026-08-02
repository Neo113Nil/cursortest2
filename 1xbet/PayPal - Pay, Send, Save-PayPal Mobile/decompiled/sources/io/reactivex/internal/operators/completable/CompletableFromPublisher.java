package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableFromPublisher<T> extends io.reactivex.Completable {
    final org.reactivestreams.Publisher<T> getHighSpeedVideoSizes;

    public CompletableFromPublisher(org.reactivestreams.Publisher<T> publisher) {
        this.getHighSpeedVideoSizes = publisher;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.completable.CompletableFromPublisher.FromPublisherSubscriber(completableObserver));
    }

    /* loaded from: classes17.dex */
    static final class FromPublisherSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.CompletableObserver getHighResolutionOutputSizeshNQ4ISI;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
        }

        FromPublisherSubscriber(io.reactivex.CompletableObserver completableObserver) {
            this.getHighResolutionOutputSizeshNQ4ISI = completableObserver;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
                this.getHighSpeedVideoFpsRanges = subscription;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
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
