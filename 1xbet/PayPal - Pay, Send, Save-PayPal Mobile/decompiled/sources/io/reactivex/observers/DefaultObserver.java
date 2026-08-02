package io.reactivex.observers;

/* loaded from: classes17.dex */
public abstract class DefaultObserver<T> implements io.reactivex.Observer<T> {
    private io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;

    protected void onStart() {
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (io.reactivex.internal.util.EndConsumerHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable, getClass())) {
            this.getHighResolutionOutputSizeshNQ4ISI = disposable;
            onStart();
        }
    }

    protected final void cancel() {
        io.reactivex.disposables.Disposable disposable = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        disposable.dispose();
    }
}
