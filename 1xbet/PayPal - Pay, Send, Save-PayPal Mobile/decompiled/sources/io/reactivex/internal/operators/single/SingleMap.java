package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleMap<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.SingleSource<? extends T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Function<? super T, ? extends R> getHighSpeedVideoFpsRangesFor;

    public SingleMap(io.reactivex.SingleSource<? extends T> singleSource, io.reactivex.functions.Function<? super T, ? extends R> function) {
        this.getHighResolutionOutputSizeshNQ4ISI = singleSource;
        this.getHighSpeedVideoFpsRangesFor = function;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super R> singleObserver) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.single.SingleMap.MapSingleObserver(singleObserver, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class MapSingleObserver<T, R> implements io.reactivex.SingleObserver<T> {
        final io.reactivex.SingleObserver<? super R> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends R> getHighSpeedVideoFpsRanges;

        MapSingleObserver(io.reactivex.SingleObserver<? super R> singleObserver, io.reactivex.functions.Function<? super T, ? extends R> function) {
            this.getHighResolutionOutputSizeshNQ4ISI = singleObserver;
            this.getHighSpeedVideoFpsRanges = function;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(t), "The mapper function returned a null value."));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }
    }
}
