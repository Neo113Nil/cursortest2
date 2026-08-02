package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeError<T> extends io.reactivex.Maybe<T> {
    final java.lang.Throwable getHighSpeedVideoFpsRanges;

    public MaybeError(java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRanges = th;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        maybeObserver.onSubscribe(io.reactivex.disposables.Disposables.disposed());
        maybeObserver.onError(this.getHighSpeedVideoFpsRanges);
    }
}
