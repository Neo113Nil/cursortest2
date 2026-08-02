package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableFromCallable<T> extends io.reactivex.Observable<T> implements java.util.concurrent.Callable<T> {
    final java.util.concurrent.Callable<? extends T> getHighSpeedVideoFpsRanges;

    public ObservableFromCallable(java.util.concurrent.Callable<? extends T> callable) {
        this.getHighSpeedVideoFpsRanges = callable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.observers.DeferredScalarDisposable deferredScalarDisposable = new io.reactivex.internal.observers.DeferredScalarDisposable(observer);
        observer.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.isDisposed()) {
            return;
        }
        try {
            deferredScalarDisposable.complete(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.call(), "Callable returned null"));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            if (!deferredScalarDisposable.isDisposed()) {
                observer.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final T call() throws java.lang.Exception {
        return (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.call(), "The callable returned a null value");
    }
}
