package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleLift<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.SingleOperator<? extends R, ? super T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.SingleSource<T> getHighSpeedVideoSizes;

    public SingleLift(io.reactivex.SingleSource<T> singleSource, io.reactivex.SingleOperator<? extends R, ? super T> singleOperator) {
        this.getHighSpeedVideoSizes = singleSource;
        this.getHighResolutionOutputSizeshNQ4ISI = singleOperator;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super R> singleObserver) {
        try {
            this.getHighSpeedVideoSizes.subscribe((io.reactivex.SingleObserver) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.apply(singleObserver), "The onLift returned a null SingleObserver"));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, singleObserver);
        }
    }
}
