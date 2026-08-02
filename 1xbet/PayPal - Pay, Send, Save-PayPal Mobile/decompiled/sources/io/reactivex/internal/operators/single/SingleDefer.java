package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleDefer<T> extends io.reactivex.Single<T> {
    final java.util.concurrent.Callable<? extends io.reactivex.SingleSource<? extends T>> getHighSpeedVideoSizes;

    public SingleDefer(java.util.concurrent.Callable<? extends io.reactivex.SingleSource<? extends T>> callable) {
        this.getHighSpeedVideoSizes = callable;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        try {
            ((io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.call(), "The singleSupplier returned a null SingleSource")).subscribe(singleObserver);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, singleObserver);
        }
    }
}
