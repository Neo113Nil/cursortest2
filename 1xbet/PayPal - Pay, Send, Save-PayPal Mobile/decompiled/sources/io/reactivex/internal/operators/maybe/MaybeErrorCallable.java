package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeErrorCallable<T> extends io.reactivex.Maybe<T> {
    final java.util.concurrent.Callable<? extends java.lang.Throwable> getHighResolutionOutputSizeshNQ4ISI;

    public MaybeErrorCallable(java.util.concurrent.Callable<? extends java.lang.Throwable> callable) {
        this.getHighResolutionOutputSizeshNQ4ISI = callable;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        maybeObserver.onSubscribe(io.reactivex.disposables.Disposables.disposed());
        try {
            th = (java.lang.Throwable) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (java.lang.Throwable th) {
            th = th;
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
        }
        maybeObserver.onError(th);
    }
}
