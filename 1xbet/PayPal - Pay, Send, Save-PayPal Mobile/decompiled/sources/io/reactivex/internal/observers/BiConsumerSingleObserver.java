package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public final class BiConsumerSingleObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = 4943102778943297569L;
    final io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> getHighSpeedVideoSizes;

    public BiConsumerSingleObserver(io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> biConsumer) {
        this.getHighSpeedVideoSizes = biConsumer;
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(java.lang.Throwable th) {
        try {
            lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
            this.getHighSpeedVideoSizes.accept(null, th);
        } catch (java.lang.Throwable th2) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
            io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.SingleObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(T t) {
        try {
            lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
            this.getHighSpeedVideoSizes.accept(t, null);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        io.reactivex.internal.disposables.DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
    }
}
