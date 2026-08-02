package io.reactivex.internal.observers;

/* loaded from: classes17.dex */
public final class BlockingObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    public static final java.lang.Object TERMINATED = new java.lang.Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final java.util.Queue<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    public BlockingObserver(java.util.Queue<java.lang.Object> queue) {
        this.getHighResolutionOutputSizeshNQ4ISI = queue;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        this.getHighResolutionOutputSizeshNQ4ISI.offer(io.reactivex.internal.util.NotificationLite.next(t));
    }

    @Override // io.reactivex.Observer
    public final void onError(java.lang.Throwable th) {
        this.getHighResolutionOutputSizeshNQ4ISI.offer(io.reactivex.internal.util.NotificationLite.error(th));
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        this.getHighResolutionOutputSizeshNQ4ISI.offer(io.reactivex.internal.util.NotificationLite.complete());
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (io.reactivex.internal.disposables.DisposableHelper.dispose(this)) {
            this.getHighResolutionOutputSizeshNQ4ISI.offer(TERMINATED);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
    }
}
