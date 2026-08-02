package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeFromFuture<T> extends io.reactivex.Maybe<T> {
    final java.util.concurrent.Future<? extends T> Camera2StreamConfigurationMap;
    final long getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRanges;

    public MaybeFromFuture(java.util.concurrent.Future<? extends T> future, long j, java.util.concurrent.TimeUnit timeUnit) {
        this.Camera2StreamConfigurationMap = future;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRanges = timeUnit;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        T t;
        io.reactivex.disposables.Disposable empty = io.reactivex.disposables.Disposables.empty();
        maybeObserver.onSubscribe(empty);
        if (empty.isDisposed()) {
            return;
        }
        try {
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            if (j <= 0) {
                t = this.Camera2StreamConfigurationMap.get();
            } else {
                t = this.Camera2StreamConfigurationMap.get(j, this.getHighSpeedVideoFpsRanges);
            }
            if (empty.isDisposed()) {
                return;
            }
            if (t == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(t);
            }
        } catch (java.lang.Throwable th) {
            th = th;
            if (th instanceof java.util.concurrent.ExecutionException) {
                th = th.getCause();
            }
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            if (empty.isDisposed()) {
                return;
            }
            maybeObserver.onError(th);
        }
    }
}
