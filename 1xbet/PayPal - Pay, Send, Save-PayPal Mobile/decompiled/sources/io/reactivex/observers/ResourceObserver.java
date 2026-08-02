package io.reactivex.observers;

/* loaded from: classes17.dex */
public abstract class ResourceObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    private final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
    private final io.reactivex.internal.disposables.ListCompositeDisposable getHighSpeedVideoSizes = new io.reactivex.internal.disposables.ListCompositeDisposable();

    protected void onStart() {
    }

    public final void add(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "resource is null");
        this.getHighSpeedVideoSizes.add(disposable);
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (io.reactivex.internal.util.EndConsumerHelper.setOnce(this.getHighResolutionOutputSizeshNQ4ISI, disposable, getClass())) {
            onStart();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighResolutionOutputSizeshNQ4ISI)) {
            this.getHighSpeedVideoSizes.dispose();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }
}
