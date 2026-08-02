package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableFromPublisher<T> extends io.reactivex.Observable<T> {
    final org.reactivestreams.Publisher<? extends T> getHighSpeedVideoFpsRanges;

    public ObservableFromPublisher(org.reactivestreams.Publisher<? extends T> publisher) {
        this.getHighSpeedVideoFpsRanges = publisher;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.getHighSpeedVideoFpsRanges.subscribe(new io.reactivex.internal.operators.observable.ObservableFromPublisher.PublisherSubscriber(observer));
    }

    /* loaded from: classes17.dex */
    static final class PublisherSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> getHighResolutionOutputSizeshNQ4ISI;
        org.reactivestreams.Subscription getHighSpeedVideoSizes;

        PublisherSubscriber(io.reactivex.Observer<? super T> observer) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizes, subscription)) {
                this.getHighSpeedVideoSizes = subscription;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
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
