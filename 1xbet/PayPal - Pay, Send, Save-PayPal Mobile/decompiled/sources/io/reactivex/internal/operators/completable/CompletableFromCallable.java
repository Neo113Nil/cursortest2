package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableFromCallable extends io.reactivex.Completable {
    final java.util.concurrent.Callable<?> Camera2StreamConfigurationMap;

    public CompletableFromCallable(java.util.concurrent.Callable<?> callable) {
        this.Camera2StreamConfigurationMap = callable;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.disposables.Disposable empty = io.reactivex.disposables.Disposables.empty();
        completableObserver.onSubscribe(empty);
        try {
            this.Camera2StreamConfigurationMap.call();
            if (empty.isDisposed()) {
                return;
            }
            completableObserver.onComplete();
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            if (empty.isDisposed()) {
                return;
            }
            completableObserver.onError(th);
        }
    }
}
