package io.reactivex.internal.operators.observable;

/* loaded from: classes17.dex */
public final class ObserverResourceWrapper<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = -8612022020200669122L;
    final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>();

    public ObserverResourceWrapper(io.reactivex.Observer<? super T> observer) {
        this.getHighSpeedVideoFpsRanges = observer;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighSpeedVideoFpsRangesFor, disposable)) {
            this.getHighSpeedVideoFpsRanges.onSubscribe(this);
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        this.getHighSpeedVideoFpsRanges.onNext(t);
    }

    @Override // io.reactivex.Observer
    public final void onError(java.lang.Throwable th) {
        dispose();
        this.getHighSpeedVideoFpsRanges.onError(th);
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        dispose();
        this.getHighSpeedVideoFpsRanges.onComplete();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRangesFor);
        io.reactivex.internal.disposables.DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.getHighSpeedVideoFpsRangesFor.get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
    }

    public final void setResource(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.disposables.DisposableHelper.set(this, disposable);
    }
}
