package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public final class CallbackCompletableObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable, io.reactivex.functions.Consumer<java.lang.Throwable>, io.reactivex.observers.LambdaConsumerIntrospection {
    private static final long serialVersionUID = -4361286194466301354L;
    final io.reactivex.functions.Action getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> getHighSpeedVideoFpsRanges;

    public CallbackCompletableObserver(io.reactivex.functions.Action action) {
        this.getHighSpeedVideoFpsRanges = this;
        this.getHighResolutionOutputSizeshNQ4ISI = action;
    }

    public CallbackCompletableObserver(io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer, io.reactivex.functions.Action action) {
        this.getHighSpeedVideoFpsRanges = consumer;
        this.getHighResolutionOutputSizeshNQ4ISI = action;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(java.lang.Throwable th) {
        io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.OnErrorNotImplementedException(th));
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public final void onComplete() {
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.run();
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
        lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.CompletableObserver
    public final void onError(java.lang.Throwable th) {
        try {
            this.getHighSpeedVideoFpsRanges.accept(th);
        } catch (java.lang.Throwable th2) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
            io.reactivex.plugins.RxJavaPlugins.onError(th2);
        }
        lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
    }

    @Override // io.reactivex.CompletableObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        io.reactivex.internal.disposables.DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.getHighSpeedVideoFpsRanges != this;
    }
}
