package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeFromCallable<T> extends io.reactivex.Maybe<T> implements java.util.concurrent.Callable<T> {
    final java.util.concurrent.Callable<? extends T> Camera2StreamConfigurationMap;

    public MaybeFromCallable(java.util.concurrent.Callable<? extends T> callable) {
        this.Camera2StreamConfigurationMap = callable;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.disposables.Disposable empty = io.reactivex.disposables.Disposables.empty();
        maybeObserver.onSubscribe(empty);
        if (empty.isDisposed()) {
            return;
        }
        try {
            T call = this.Camera2StreamConfigurationMap.call();
            if (empty.isDisposed()) {
                return;
            }
            if (call == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(call);
            }
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            if (!empty.isDisposed()) {
                maybeObserver.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final T call() throws java.lang.Exception {
        return this.Camera2StreamConfigurationMap.call();
    }
}
