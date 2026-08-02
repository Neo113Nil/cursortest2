package io.reactivex.observers;

/* loaded from: classes17.dex */
public abstract class DisposableObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicReference<>();

    protected void onStart() {
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (io.reactivex.internal.util.EndConsumerHelper.setOnce(this.getHighSpeedVideoSizesFor, disposable, getClass())) {
            onStart();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.getHighSpeedVideoSizesFor.get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizesFor);
    }
}
