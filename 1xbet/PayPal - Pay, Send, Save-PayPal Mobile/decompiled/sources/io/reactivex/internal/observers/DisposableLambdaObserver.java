package io.reactivex.internal.observers;

/* loaded from: classes17.dex */
public final class DisposableLambdaObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> Camera2StreamConfigurationMap;
    io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Action getHighSpeedVideoFpsRangesFor;

    public DisposableLambdaObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer, io.reactivex.functions.Action action) {
        this.getHighSpeedVideoFpsRanges = observer;
        this.Camera2StreamConfigurationMap = consumer;
        this.getHighSpeedVideoFpsRangesFor = action;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        try {
            this.Camera2StreamConfigurationMap.accept(disposable);
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            disposable.dispose();
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            io.reactivex.internal.disposables.EmptyDisposable.error(th, this.getHighSpeedVideoFpsRanges);
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        this.getHighSpeedVideoFpsRanges.onNext(t);
    }

    @Override // io.reactivex.Observer
    public final void onError(java.lang.Throwable th) {
        if (this.getHighResolutionOutputSizeshNQ4ISI != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        } else {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.getHighResolutionOutputSizeshNQ4ISI != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        try {
            this.getHighSpeedVideoFpsRangesFor.run();
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isDisposed();
    }
}
