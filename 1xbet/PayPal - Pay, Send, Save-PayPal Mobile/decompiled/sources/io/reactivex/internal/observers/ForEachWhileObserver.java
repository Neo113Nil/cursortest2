package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public final class ForEachWhileObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = -4403180040475402120L;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Predicate<? super T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Action getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;

    public ForEachWhileObserver(io.reactivex.functions.Predicate<? super T> predicate, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer, io.reactivex.functions.Action action) {
        this.getHighResolutionOutputSizeshNQ4ISI = predicate;
        this.Camera2StreamConfigurationMap = consumer;
        this.getHighSpeedVideoFpsRanges = action;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        if (this.getHighSpeedVideoFpsRangesFor) {
            return;
        }
        try {
            if (this.getHighResolutionOutputSizeshNQ4ISI.test(t)) {
                return;
            }
            dispose();
            onComplete();
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            dispose();
            onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(java.lang.Throwable th) {
        if (this.getHighSpeedVideoFpsRangesFor) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = true;
        try {
            this.Camera2StreamConfigurationMap.accept(th);
        } catch (java.lang.Throwable th2) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
            io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.getHighSpeedVideoFpsRangesFor) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = true;
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
        return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
    }
}
