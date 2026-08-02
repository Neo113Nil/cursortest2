package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleDelayWithPublisher<T, U> extends io.reactivex.Single<T> {
    final org.reactivestreams.Publisher<U> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.SingleSource<T> getHighSpeedVideoFpsRanges;

    public SingleDelayWithPublisher(io.reactivex.SingleSource<T> singleSource, org.reactivestreams.Publisher<U> publisher) {
        this.getHighSpeedVideoFpsRanges = singleSource;
        this.getHighResolutionOutputSizeshNQ4ISI = publisher;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.single.SingleDelayWithPublisher.OtherSubscriber(singleObserver, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class OtherSubscriber<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.FlowableSubscriber<U>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8565274649390031272L;
        final io.reactivex.SingleSource<T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoFpsRanges;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        OtherSubscriber(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.SingleSource<T> singleSource) {
            this.getHighSpeedVideoFpsRanges = singleObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = singleSource;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRangesFor, subscription)) {
                this.getHighSpeedVideoFpsRangesFor = subscription;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(U u) {
            this.getHighSpeedVideoFpsRangesFor.cancel();
            onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoSizes = true;
                this.getHighSpeedVideoFpsRanges.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.observers.ResumeSingleObserver(this, this.getHighSpeedVideoFpsRanges));
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor.cancel();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }
}
