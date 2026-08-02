package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableDefer<T> extends io.reactivex.Observable<T> {
    final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends T>> getHighResolutionOutputSizeshNQ4ISI;

    public ObservableDefer(java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends T>> callable) {
        this.getHighResolutionOutputSizeshNQ4ISI = callable;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        try {
            ((io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.call(), "null ObservableSource supplied")).subscribe(observer);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
        }
    }
}
