package io.reactivex.disposables;

/* loaded from: classes17.dex */
public final class SerialDisposable implements io.reactivex.disposables.Disposable {
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRanges;

    public SerialDisposable() {
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public SerialDisposable(io.reactivex.disposables.Disposable disposable) {
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>(disposable);
    }

    public final boolean set(io.reactivex.disposables.Disposable disposable) {
        return io.reactivex.internal.disposables.DisposableHelper.set(this.getHighSpeedVideoFpsRanges, disposable);
    }

    public final boolean replace(io.reactivex.disposables.Disposable disposable) {
        return io.reactivex.internal.disposables.DisposableHelper.replace(this.getHighSpeedVideoFpsRanges, disposable);
    }

    public final io.reactivex.disposables.Disposable get() {
        io.reactivex.disposables.Disposable disposable = this.getHighSpeedVideoFpsRanges.get();
        return disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED ? io.reactivex.disposables.Disposables.disposed() : disposable;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighSpeedVideoFpsRanges.get());
    }
}
