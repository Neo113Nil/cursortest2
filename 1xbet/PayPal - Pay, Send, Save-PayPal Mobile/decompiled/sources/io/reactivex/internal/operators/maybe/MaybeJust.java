package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeJust<T> extends io.reactivex.Maybe<T> implements io.reactivex.internal.fuseable.ScalarCallable<T> {
    final T getHighSpeedVideoFpsRanges;

    public MaybeJust(T t) {
        this.getHighSpeedVideoFpsRanges = t;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        maybeObserver.onSubscribe(io.reactivex.disposables.Disposables.disposed());
        maybeObserver.onSuccess(this.getHighSpeedVideoFpsRanges);
    }

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public final T call() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
