package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableError extends io.reactivex.Completable {
    final java.lang.Throwable Camera2StreamConfigurationMap;

    public CompletableError(java.lang.Throwable th) {
        this.Camera2StreamConfigurationMap = th;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.internal.disposables.EmptyDisposable.error(this.Camera2StreamConfigurationMap, completableObserver);
    }
}
