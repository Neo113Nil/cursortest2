package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeFlatMapSingle<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.MaybeSource<T> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> getHighSpeedVideoSizes;

    public MaybeFlatMapSingle(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function) {
        this.Camera2StreamConfigurationMap = maybeSource;
        this.getHighSpeedVideoSizes = function;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super R> singleObserver) {
        this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.maybe.MaybeFlatMapSingle.FlatMapMaybeObserver(singleObserver, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class FlatMapMaybeObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 4827726964688405508L;
        final io.reactivex.SingleObserver<? super R> Camera2StreamConfigurationMap;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> getHighSpeedVideoSizes;

        FlatMapMaybeObserver(io.reactivex.SingleObserver<? super R> singleObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function) {
            this.Camera2StreamConfigurationMap = singleObserver;
            this.getHighSpeedVideoSizes = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            try {
                io.reactivex.SingleSource singleSource = (io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.apply(t), "The mapper returned a null SingleSource");
                if (isDisposed()) {
                    return;
                }
                singleSource.subscribe(new io.reactivex.internal.operators.maybe.MaybeFlatMapSingle.FlatMapSingleObserver(this, this.Camera2StreamConfigurationMap));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.Camera2StreamConfigurationMap.onError(new java.util.NoSuchElementException());
        }
    }

    /* loaded from: classes17.dex */
    static final class FlatMapSingleObserver<R> implements io.reactivex.SingleObserver<R> {
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.SingleObserver<? super R> getHighSpeedVideoFpsRanges;

        FlatMapSingleObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference, io.reactivex.SingleObserver<? super R> singleObserver) {
            this.getHighResolutionOutputSizeshNQ4ISI = atomicReference;
            this.getHighSpeedVideoFpsRanges = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.replace(this.getHighResolutionOutputSizeshNQ4ISI, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(R r) {
            this.getHighSpeedVideoFpsRanges.onSuccess(r);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }
    }
}
