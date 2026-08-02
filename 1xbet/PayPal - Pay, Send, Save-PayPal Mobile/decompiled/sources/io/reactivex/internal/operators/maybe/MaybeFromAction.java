package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeFromAction<T> extends io.reactivex.Maybe<T> implements java.util.concurrent.Callable<T> {
    final io.reactivex.functions.Action getHighSpeedVideoSizes;

    public MaybeFromAction(io.reactivex.functions.Action action) {
        this.getHighSpeedVideoSizes = action;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.disposables.Disposable empty = io.reactivex.disposables.Disposables.empty();
        maybeObserver.onSubscribe(empty);
        if (empty.isDisposed()) {
            return;
        }
        try {
            this.getHighSpeedVideoSizes.run();
            if (empty.isDisposed()) {
                return;
            }
            maybeObserver.onComplete();
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
        this.getHighSpeedVideoSizes.run();
        return null;
    }
}
