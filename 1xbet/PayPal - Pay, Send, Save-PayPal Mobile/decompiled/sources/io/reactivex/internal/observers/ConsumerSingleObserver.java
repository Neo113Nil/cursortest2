package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public final class ConsumerSingleObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable, io.reactivex.observers.LambdaConsumerIntrospection {
    private static final long serialVersionUID = -7012088219455310787L;
    final io.reactivex.functions.Consumer<? super T> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> getHighSpeedVideoFpsRanges;

    public ConsumerSingleObserver(io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer2) {
        this.Camera2StreamConfigurationMap = consumer;
        this.getHighSpeedVideoFpsRanges = consumer2;
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(java.lang.Throwable th) {
        lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
        try {
            this.getHighSpeedVideoFpsRanges.accept(th);
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
        lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
        try {
            this.Camera2StreamConfigurationMap.accept(t);
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

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.getHighSpeedVideoFpsRanges != io.reactivex.internal.functions.Functions.ON_ERROR_MISSING;
    }
}
