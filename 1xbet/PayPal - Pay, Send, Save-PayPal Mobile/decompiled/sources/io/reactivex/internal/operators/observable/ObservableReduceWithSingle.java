package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableReduceWithSingle<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.functions.BiFunction<R, ? super T, R> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.ObservableSource<T> getHighSpeedVideoFpsRanges;
    final java.util.concurrent.Callable<R> getHighSpeedVideoFpsRangesFor;

    public ObservableReduceWithSingle(io.reactivex.ObservableSource<T> observableSource, java.util.concurrent.Callable<R> callable, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction) {
        this.getHighSpeedVideoFpsRanges = observableSource;
        this.getHighSpeedVideoFpsRangesFor = callable;
        this.getHighResolutionOutputSizeshNQ4ISI = biFunction;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super R> singleObserver) {
        try {
            this.getHighSpeedVideoFpsRanges.subscribe(new io.reactivex.internal.operators.observable.ObservableReduceSeedSingle.ReduceSeedObserver(singleObserver, this.getHighResolutionOutputSizeshNQ4ISI, io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.call(), "The seedSupplier returned a null value")));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, singleObserver);
        }
    }
}
