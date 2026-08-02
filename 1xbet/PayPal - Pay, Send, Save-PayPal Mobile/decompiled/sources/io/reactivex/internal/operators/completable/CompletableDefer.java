package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableDefer extends io.reactivex.Completable {
    final java.util.concurrent.Callable<? extends io.reactivex.CompletableSource> getHighSpeedVideoFpsRanges;

    public CompletableDefer(java.util.concurrent.Callable<? extends io.reactivex.CompletableSource> callable) {
        this.getHighSpeedVideoFpsRanges = callable;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        try {
            ((io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.call(), "The completableSupplier returned a null CompletableSource")).subscribe(completableObserver);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, completableObserver);
        }
    }
}
