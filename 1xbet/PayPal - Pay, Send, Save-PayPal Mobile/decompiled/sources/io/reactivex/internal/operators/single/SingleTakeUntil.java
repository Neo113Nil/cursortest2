package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleTakeUntil<T, U> extends io.reactivex.Single<T> {
    final org.reactivestreams.Publisher<U> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.SingleSource<T> getHighSpeedVideoSizes;

    public SingleTakeUntil(io.reactivex.SingleSource<T> singleSource, org.reactivestreams.Publisher<U> publisher) {
        this.getHighSpeedVideoSizes = singleSource;
        this.getHighSpeedVideoFpsRangesFor = publisher;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilMainObserver takeUntilMainObserver = new io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilMainObserver(singleObserver);
        singleObserver.onSubscribe(takeUntilMainObserver);
        this.getHighSpeedVideoFpsRangesFor.subscribe(takeUntilMainObserver.getHighSpeedVideoSizes);
        this.getHighSpeedVideoSizes.subscribe(takeUntilMainObserver);
    }

    /* loaded from: classes17.dex */
    static final class TakeUntilMainObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -622603812305745221L;
        final io.reactivex.SingleObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilOtherSubscriber getHighSpeedVideoSizes = new io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilOtherSubscriber(this);

        TakeUntilMainObserver(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.getHighResolutionOutputSizeshNQ4ISI = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoSizes);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(t);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoSizes);
            if (get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED && getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
            io.reactivex.disposables.Disposable andSet;
            if (get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED && (andSet = getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED)) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                if (andSet != null) {
                    andSet.dispose();
                }
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }

    /* loaded from: classes17.dex */
    static final class TakeUntilOtherSubscriber extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
        private static final long serialVersionUID = 5170026210238877381L;
        final io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilMainObserver<?> getHighSpeedVideoFpsRanges;

        TakeUntilOtherSubscriber(io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilMainObserver<?> takeUntilMainObserver) {
            this.getHighSpeedVideoFpsRanges = takeUntilMainObserver;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(java.lang.Object obj) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this)) {
                this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(new java.util.concurrent.CancellationException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (get() != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
                this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(new java.util.concurrent.CancellationException());
            }
        }
    }
}
