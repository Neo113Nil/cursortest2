package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public final class LambdaObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.observers.LambdaConsumerIntrospection {
    private static final long serialVersionUID = -7251123623727029452L;
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Action getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Consumer<? super T> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> getHighSpeedVideoSizes;

    public LambdaObserver(io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer2, io.reactivex.functions.Action action, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer3) {
        this.getHighSpeedVideoFpsRangesFor = consumer;
        this.getHighSpeedVideoSizes = consumer2;
        this.getHighSpeedVideoFpsRanges = action;
        this.Camera2StreamConfigurationMap = consumer3;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
            try {
                this.Camera2StreamConfigurationMap.accept(this);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                disposable.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.getHighSpeedVideoFpsRangesFor.accept(t);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            get().dispose();
            onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(java.lang.Throwable th) {
        if (isDisposed()) {
            return;
        }
        lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
        try {
            this.getHighSpeedVideoSizes.accept(th);
        } catch (java.lang.Throwable th2) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
            io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
        try {
            this.getHighSpeedVideoFpsRanges.run();
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
        return this.getHighSpeedVideoSizes != io.reactivex.internal.functions.Functions.ON_ERROR_MISSING;
    }
}
