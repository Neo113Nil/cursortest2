package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableFromFuture<T> extends io.reactivex.Observable<T> {
    final java.util.concurrent.TimeUnit Camera2StreamConfigurationMap;
    final java.util.concurrent.Future<? extends T> getHighSpeedVideoFpsRanges;
    final long getHighSpeedVideoSizes;

    public ObservableFromFuture(java.util.concurrent.Future<? extends T> future, long j, java.util.concurrent.TimeUnit timeUnit) {
        this.getHighSpeedVideoFpsRanges = future;
        this.getHighSpeedVideoSizes = j;
        this.Camera2StreamConfigurationMap = timeUnit;
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
            java.util.concurrent.TimeUnit timeUnit = this.Camera2StreamConfigurationMap;
            deferredScalarDisposable.complete(io.reactivex.internal.functions.ObjectHelper.requireNonNull(timeUnit != null ? this.getHighSpeedVideoFpsRanges.get(this.getHighSpeedVideoSizes, timeUnit) : this.getHighSpeedVideoFpsRanges.get(), "Future returned null"));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            if (deferredScalarDisposable.isDisposed()) {
                return;
            }
            observer.onError(th);
        }
    }
}
