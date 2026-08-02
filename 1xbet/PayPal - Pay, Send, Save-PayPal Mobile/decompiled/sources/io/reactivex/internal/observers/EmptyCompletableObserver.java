package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public final class EmptyCompletableObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable, io.reactivex.observers.LambdaConsumerIntrospection {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return false;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        io.reactivex.internal.disposables.DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public final void onComplete() {
        lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.CompletableObserver
    public final void onError(java.lang.Throwable th) {
        lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
        io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.OnErrorNotImplementedException(th));
    }

    @Override // io.reactivex.CompletableObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
    }
}
