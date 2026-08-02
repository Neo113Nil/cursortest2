package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleFromCallable<T> extends io.reactivex.Single<T> {
    final java.util.concurrent.Callable<? extends T> getHighSpeedVideoFpsRangesFor;

    public SingleFromCallable(java.util.concurrent.Callable<? extends T> callable) {
        this.getHighSpeedVideoFpsRangesFor = callable;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        io.reactivex.disposables.Disposable empty = io.reactivex.disposables.Disposables.empty();
        singleObserver.onSubscribe(empty);
        if (empty.isDisposed()) {
            return;
        }
        try {
            amex.AMEXKernel aMEXKernel = (java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.call(), "The callable returned a null value");
            if (empty.isDisposed()) {
                return;
            }
            singleObserver.onSuccess(aMEXKernel);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            if (!empty.isDisposed()) {
                singleObserver.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }
}
