package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeTimeoutMaybe<T, U> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.MaybeSource<U> Camera2StreamConfigurationMap;
    final io.reactivex.MaybeSource<? extends T> getHighSpeedVideoFpsRangesFor;

    public MaybeTimeoutMaybe(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.MaybeSource<U> maybeSource2, io.reactivex.MaybeSource<? extends T> maybeSource3) {
        super(maybeSource);
        this.Camera2StreamConfigurationMap = maybeSource2;
        this.getHighSpeedVideoFpsRangesFor = maybeSource3;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutMainMaybeObserver timeoutMainMaybeObserver = new io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutMainMaybeObserver(maybeObserver, this.getHighSpeedVideoFpsRangesFor);
        maybeObserver.onSubscribe(timeoutMainMaybeObserver);
        this.Camera2StreamConfigurationMap.subscribe(timeoutMainMaybeObserver.getHighSpeedVideoFpsRanges);
        this.source.subscribe(timeoutMainMaybeObserver);
    }

    /* loaded from: classes17.dex */
    static final class TimeoutMainMaybeObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5955289211445418871L;
        final io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutFallbackMaybeObserver<T> Camera2StreamConfigurationMap;
        final io.reactivex.MaybeSource<? extends T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutOtherMaybeObserver<T, U> getHighSpeedVideoFpsRanges = new io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutOtherMaybeObserver<>(this);
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRangesFor;

        TimeoutMainMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.MaybeSource<? extends T> maybeSource) {
            this.getHighSpeedVideoFpsRangesFor = maybeObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = maybeSource;
            this.Camera2StreamConfigurationMap = maybeSource != null ? new io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutFallbackMaybeObserver<>(maybeObserver) : null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
            io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutFallbackMaybeObserver<T> timeoutFallbackMaybeObserver = this.Camera2StreamConfigurationMap;
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
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.getHighSpeedVideoFpsRangesFor.onComplete();
            }
        }

        public final void getHighSpeedVideoFpsRanges() {
            if (io.reactivex.internal.disposables.DisposableHelper.dispose(this)) {
                io.reactivex.MaybeSource<? extends T> maybeSource = this.getHighResolutionOutputSizeshNQ4ISI;
                if (maybeSource == null) {
                    this.getHighSpeedVideoFpsRangesFor.onError(new java.util.concurrent.TimeoutException());
                } else {
                    maybeSource.subscribe(this.Camera2StreamConfigurationMap);
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class TimeoutOtherMaybeObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<java.lang.Object> {
        private static final long serialVersionUID = 8663801314800248617L;
        final io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutMainMaybeObserver<T, U> getHighSpeedVideoSizes;

        TimeoutOtherMaybeObserver(io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutMainMaybeObserver<T, U> timeoutMainMaybeObserver) {
            this.getHighSpeedVideoSizes = timeoutMainMaybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(java.lang.Object obj) {
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.maybe.MaybeTimeoutMaybe.TimeoutMainMaybeObserver<T, U> timeoutMainMaybeObserver = this.getHighSpeedVideoSizes;
            if (io.reactivex.internal.disposables.DisposableHelper.dispose(timeoutMainMaybeObserver)) {
                timeoutMainMaybeObserver.getHighSpeedVideoFpsRangesFor.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges();
        }
    }

    /* loaded from: classes17.dex */
    static final class TimeoutFallbackMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = 8663801314800248617L;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRangesFor;

        TimeoutFallbackMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.getHighSpeedVideoFpsRangesFor = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }
    }
}
