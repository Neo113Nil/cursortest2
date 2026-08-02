package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableFromRunnable extends io.reactivex.Completable {
    final java.lang.Runnable getHighResolutionOutputSizeshNQ4ISI;

    public CompletableFromRunnable(java.lang.Runnable runnable) {
        this.getHighResolutionOutputSizeshNQ4ISI = runnable;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.disposables.Disposable empty = io.reactivex.disposables.Disposables.empty();
        completableObserver.onSubscribe(empty);
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.run();
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
