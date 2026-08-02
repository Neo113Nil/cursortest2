package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleFlatMap<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.SingleSource<? extends T> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> getHighSpeedVideoSizes;

    public SingleFlatMap(io.reactivex.SingleSource<? extends T> singleSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function) {
        this.getHighSpeedVideoSizes = function;
        this.getHighSpeedVideoFpsRangesFor = singleSource;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super R> singleObserver) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.single.SingleFlatMap.SingleFlatMapCallback(singleObserver, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class SingleFlatMapCallback<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 3258103020495908596L;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> getHighSpeedVideoFpsRanges;
        final io.reactivex.SingleObserver<? super R> getHighSpeedVideoFpsRangesFor;

        SingleFlatMapCallback(io.reactivex.SingleObserver<? super R> singleObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function) {
            this.getHighSpeedVideoFpsRangesFor = singleObserver;
            this.getHighSpeedVideoFpsRanges = function;
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
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            try {
                io.reactivex.SingleSource singleSource = (io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(t), "The single returned by the mapper is null");
                if (isDisposed()) {
                    return;
                }
                singleSource.subscribe(new io.reactivex.internal.operators.single.SingleFlatMap.SingleFlatMapCallback.FlatMapSingleObserver(this, this.getHighSpeedVideoFpsRangesFor));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        static final class FlatMapSingleObserver<R> implements io.reactivex.SingleObserver<R> {
            final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> Camera2StreamConfigurationMap;
            final io.reactivex.SingleObserver<? super R> getHighSpeedVideoSizes;

            FlatMapSingleObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference, io.reactivex.SingleObserver<? super R> singleObserver) {
                this.Camera2StreamConfigurationMap = atomicReference;
                this.getHighSpeedVideoSizes = singleObserver;
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.replace(this.Camera2StreamConfigurationMap, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(R r) {
                this.getHighSpeedVideoSizes.onSuccess(r);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(java.lang.Throwable th) {
                this.getHighSpeedVideoSizes.onError(th);
            }
        }
    }
}
