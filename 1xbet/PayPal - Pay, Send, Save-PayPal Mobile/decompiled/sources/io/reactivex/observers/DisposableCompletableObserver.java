package io.reactivex.observers;

/* loaded from: classes17.dex */
public abstract class DisposableCompletableObserver implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();

    protected void onStart() {
    }

    @Override // io.reactivex.CompletableObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (io.reactivex.internal.util.EndConsumerHelper.setOnce(this.getHighResolutionOutputSizeshNQ4ISI, disposable, getClass())) {
            onStart();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.getHighResolutionOutputSizeshNQ4ISI.get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
