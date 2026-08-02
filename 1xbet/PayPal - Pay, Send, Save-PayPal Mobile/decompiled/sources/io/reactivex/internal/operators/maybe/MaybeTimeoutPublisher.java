package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeTimeoutPublisher<T, U> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final org.reactivestreams.Publisher<U> getHighSpeedVideoFpsRanges;
    final io.reactivex.MaybeSource<? extends T> getHighSpeedVideoFpsRangesFor;

    public MaybeTimeoutPublisher(io.reactivex.MaybeSource<T> maybeSource, org.reactivestreams.Publisher<U> publisher, io.reactivex.MaybeSource<? extends T> maybeSource2) {
        super(maybeSource);
        this.getHighSpeedVideoFpsRanges = publisher;
        this.getHighSpeedVideoFpsRangesFor = maybeSource2;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher.TimeoutMainMaybeObserver timeoutMainMaybeObserver = new io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher.TimeoutMainMaybeObserver(maybeObserver, this.getHighSpeedVideoFpsRangesFor);
        maybeObserver.onSubscribe(timeoutMainMaybeObserver);
        this.getHighSpeedVideoFpsRanges.subscribe(timeoutMainMaybeObserver.getHighSpeedVideoFpsRanges);
        this.source.subscribe(timeoutMainMaybeObserver);
    }

    /* loaded from: classes17.dex */
    static final class TimeoutMainMaybeObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5955289211445418871L;
        final io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher.TimeoutFallbackMaybeObserver<T> Camera2StreamConfigurationMap;
        final io.reactivex.MaybeObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher.TimeoutOtherMaybeObserver<T, U> getHighSpeedVideoFpsRanges = new io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher.TimeoutOtherMaybeObserver<>(this);
        final io.reactivex.MaybeSource<? extends T> getHighSpeedVideoSizes;

        TimeoutMainMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.MaybeSource<? extends T> maybeSource) {
            this.getHighResolutionOutputSizeshNQ4ISI = maybeObserver;
            this.getHighSpeedVideoSizes = maybeSource;
            this.Camera2StreamConfigurationMap = maybeSource != null ? new io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher.TimeoutFallbackMaybeObserver<>(maybeObserver) : null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRanges);
            io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher.TimeoutFallbackMaybeObserver<T> timeoutFallbackMaybeObserver = this.Camera2StreamConfigurationMap;
            if (timeoutFallbackMaybeObserver != null) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(timeoutFallbackMaybeObserver);
            }
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
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRanges);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(t);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRanges);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRanges);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            }
        }

        public final void getHighResolutionOutputSizeshNQ4ISI() {
            if (io.reactivex.internal.disposables.DisposableHelper.dispose(this)) {
                io.reactivex.MaybeSource<? extends T> maybeSource = this.getHighSpeedVideoSizes;
                if (maybeSource == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(new java.util.concurrent.TimeoutException());
                } else {
                    maybeSource.subscribe(this.Camera2StreamConfigurationMap);
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class TimeoutOtherMaybeObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
        private static final long serialVersionUID = 8663801314800248617L;
        final io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher.TimeoutMainMaybeObserver<T, U> Camera2StreamConfigurationMap;

        TimeoutOtherMaybeObserver(io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher.TimeoutMainMaybeObserver<T, U> timeoutMainMaybeObserver) {
            this.Camera2StreamConfigurationMap = timeoutMainMaybeObserver;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(java.lang.Object obj) {
            get().cancel();
            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.maybe.MaybeTimeoutPublisher.TimeoutMainMaybeObserver<T, U> timeoutMainMaybeObserver = this.Camera2StreamConfigurationMap;
            if (io.reactivex.internal.disposables.DisposableHelper.dispose(timeoutMainMaybeObserver)) {
                timeoutMainMaybeObserver.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    /* loaded from: classes17.dex */
    static final class TimeoutFallbackMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = 8663801314800248617L;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRanges;

        TimeoutFallbackMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.getHighSpeedVideoFpsRanges = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRanges.onSuccess(t);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }
}
