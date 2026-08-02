package io.reactivex.observers;

/* loaded from: classes17.dex */
public abstract class ResourceMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
    private final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
    private final io.reactivex.internal.disposables.ListCompositeDisposable Camera2StreamConfigurationMap = new io.reactivex.internal.disposables.ListCompositeDisposable();

    protected void onStart() {
    }

    public final void add(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "resource is null");
        this.Camera2StreamConfigurationMap.add(disposable);
    }

    @Override // io.reactivex.MaybeObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (io.reactivex.internal.util.EndConsumerHelper.setOnce(this.getHighSpeedVideoFpsRanges, disposable, getClass())) {
            onStart();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges)) {
            this.Camera2StreamConfigurationMap.dispose();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighSpeedVideoFpsRanges.get());
    }
}
