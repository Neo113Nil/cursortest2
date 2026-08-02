package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleFromPublisher<T> extends io.reactivex.Single<T> {
    final org.reactivestreams.Publisher<? extends T> getHighSpeedVideoFpsRanges;

    public SingleFromPublisher(org.reactivestreams.Publisher<? extends T> publisher) {
        this.getHighSpeedVideoFpsRanges = publisher;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoFpsRanges.subscribe(new io.reactivex.internal.operators.single.SingleFromPublisher.ToSingleObserver(singleObserver));
    }

    /* loaded from: classes17.dex */
    static final class ToSingleObserver<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        boolean Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoFpsRanges;
        T getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;

        ToSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.getHighSpeedVideoFpsRanges = singleObserver;
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
            if (this.getHighSpeedVideoFpsRangesFor != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.cancel();
                this.Camera2StreamConfigurationMap = true;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoFpsRanges.onError(new java.lang.IndexOutOfBoundsException("Too many elements in the Publisher"));
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = t;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            T t = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = null;
            if (t == null) {
                this.getHighSpeedVideoFpsRanges.onError(new java.util.NoSuchElementException("The source Publisher is empty"));
            } else {
                this.getHighSpeedVideoFpsRanges.onSuccess(t);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes = true;
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
        }
    }
}
