package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableErrorSupplier extends io.reactivex.Completable {
    final java.util.concurrent.Callable<? extends java.lang.Throwable> Camera2StreamConfigurationMap;

    public CompletableErrorSupplier(java.util.concurrent.Callable<? extends java.lang.Throwable> callable) {
        this.Camera2StreamConfigurationMap = callable;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        try {
            th = (java.lang.Throwable) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The error returned is null");
        } catch (java.lang.Throwable th) {
            th = th;
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
        }
        io.reactivex.internal.disposables.EmptyDisposable.error(th, completableObserver);
    }
}
