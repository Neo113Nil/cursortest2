package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeTakeUntilPublisher<T, U> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final org.reactivestreams.Publisher<U> getHighResolutionOutputSizeshNQ4ISI;

    public MaybeTakeUntilPublisher(io.reactivex.MaybeSource<T> maybeSource, org.reactivestreams.Publisher<U> publisher) {
        super(maybeSource);
        this.getHighResolutionOutputSizeshNQ4ISI = publisher;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = new io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver(maybeObserver);
        maybeObserver.onSubscribe(takeUntilMainMaybeObserver);
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(takeUntilMainMaybeObserver.getHighSpeedVideoFpsRangesFor);
        this.source.subscribe(takeUntilMainMaybeObserver);
    }

    /* loaded from: classes17.dex */
    static final class TakeUntilMainMaybeObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2187421758664251153L;
        final io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver.TakeUntilOtherMaybeObserver<U> getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver.TakeUntilOtherMaybeObserver<>(this);
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoSizes;

        TakeUntilMainMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.getHighSpeedVideoSizes = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRangesFor);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.getHighSpeedVideoSizes.onSuccess(t);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRangesFor);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.getHighSpeedVideoSizes.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRangesFor);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.getHighSpeedVideoSizes.onComplete();
            }
        }

        static final class TakeUntilOtherMaybeObserver<U> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<U> {
            private static final long serialVersionUID = -1266041316834525931L;
            final io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver<?, U> Camera2StreamConfigurationMap;

            TakeUntilOtherMaybeObserver(io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver) {
                this.Camera2StreamConfigurationMap = takeUntilMainMaybeObserver;
            }

            @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
            public final void onSubscribe(org.reactivestreams.Subscription subscription) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(java.lang.Object obj) {
                io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver = this.Camera2StreamConfigurationMap;
                if (io.reactivex.internal.disposables.DisposableHelper.dispose(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.getHighSpeedVideoSizes.onComplete();
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver = this.Camera2StreamConfigurationMap;
                if (io.reactivex.internal.disposables.DisposableHelper.dispose(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.getHighSpeedVideoSizes.onError(th);
                } else {
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver = this.Camera2StreamConfigurationMap;
                if (io.reactivex.internal.disposables.DisposableHelper.dispose(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.getHighSpeedVideoSizes.onComplete();
                }
            }
        }
    }
}
