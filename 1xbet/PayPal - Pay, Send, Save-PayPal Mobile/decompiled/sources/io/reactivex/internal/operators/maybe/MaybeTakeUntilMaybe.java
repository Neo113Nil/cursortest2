package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeTakeUntilMaybe<T, U> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.MaybeSource<U> Camera2StreamConfigurationMap;

    public MaybeTakeUntilMaybe(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.MaybeSource<U> maybeSource2) {
        super(maybeSource);
        this.Camera2StreamConfigurationMap = maybeSource2;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe.TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = new io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe.TakeUntilMainMaybeObserver(maybeObserver);
        maybeObserver.onSubscribe(takeUntilMainMaybeObserver);
        this.Camera2StreamConfigurationMap.subscribe(takeUntilMainMaybeObserver.getHighResolutionOutputSizeshNQ4ISI);
        this.source.subscribe(takeUntilMainMaybeObserver);
    }

    /* loaded from: classes17.dex */
    static final class TakeUntilMainMaybeObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2187421758664251153L;
        final io.reactivex.MaybeObserver<? super T> Camera2StreamConfigurationMap;
        final io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe.TakeUntilMainMaybeObserver.TakeUntilOtherMaybeObserver<U> getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe.TakeUntilMainMaybeObserver.TakeUntilOtherMaybeObserver<>(this);

        TakeUntilMainMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.Camera2StreamConfigurationMap = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighResolutionOutputSizeshNQ4ISI);
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
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighResolutionOutputSizeshNQ4ISI);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.Camera2StreamConfigurationMap.onSuccess(t);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighResolutionOutputSizeshNQ4ISI);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.Camera2StreamConfigurationMap.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighResolutionOutputSizeshNQ4ISI);
            if (getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED) != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.Camera2StreamConfigurationMap.onComplete();
            }
        }

        static final class TakeUntilOtherMaybeObserver<U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<U> {
            private static final long serialVersionUID = -1266041316834525931L;
            final io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe.TakeUntilMainMaybeObserver<?, U> getHighSpeedVideoFpsRangesFor;

            TakeUntilOtherMaybeObserver(io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe.TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver) {
                this.getHighSpeedVideoFpsRangesFor = takeUntilMainMaybeObserver;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(java.lang.Object obj) {
                io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe.TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver = this.getHighSpeedVideoFpsRangesFor;
                if (io.reactivex.internal.disposables.DisposableHelper.dispose(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.Camera2StreamConfigurationMap.onComplete();
                }
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe.TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver = this.getHighSpeedVideoFpsRangesFor;
                if (io.reactivex.internal.disposables.DisposableHelper.dispose(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.Camera2StreamConfigurationMap.onError(th);
                } else {
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe.TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver = this.getHighSpeedVideoFpsRangesFor;
                if (io.reactivex.internal.disposables.DisposableHelper.dispose(takeUntilMainMaybeObserver)) {
                    takeUntilMainMaybeObserver.Camera2StreamConfigurationMap.onComplete();
                }
            }
        }
    }
}
