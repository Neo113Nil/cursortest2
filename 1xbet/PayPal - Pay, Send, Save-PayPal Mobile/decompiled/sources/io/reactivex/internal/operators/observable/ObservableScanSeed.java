package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableScanSeed<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final java.util.concurrent.Callable<R> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.BiFunction<R, ? super T, R> getHighSpeedVideoFpsRanges;

    public ObservableScanSeed(io.reactivex.ObservableSource<T> observableSource, java.util.concurrent.Callable<R> callable, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction) {
        super(observableSource);
        this.getHighSpeedVideoFpsRanges = biFunction;
        this.getHighResolutionOutputSizeshNQ4ISI = callable;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        try {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableScanSeed.ScanSeedObserver(observer, this.getHighSpeedVideoFpsRanges, io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.call(), "The seed supplied is null")));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
        }
    }

    /* loaded from: classes17.dex */
    static final class ScanSeedObserver<T, R> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final io.reactivex.functions.BiFunction<R, ? super T, R> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.Observer<? super R> getHighSpeedVideoFpsRangesFor;
        R getHighSpeedVideoSizes;

        ScanSeedObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction, R r) {
            this.getHighSpeedVideoFpsRangesFor = observer;
            this.getHighResolutionOutputSizeshNQ4ISI = biFunction;
            this.getHighSpeedVideoSizes = r;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                this.getHighSpeedVideoFpsRangesFor.onNext(this.getHighSpeedVideoSizes);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            try {
                R r = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.apply(this.getHighSpeedVideoSizes, t), "The accumulator returned a null value");
                this.getHighSpeedVideoSizes = r;
                this.getHighSpeedVideoFpsRangesFor.onNext(r);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.Camera2StreamConfigurationMap.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoFpsRanges = true;
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }
    }
}
