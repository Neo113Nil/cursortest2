package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableScan<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.BiFunction<T, T, T> getHighSpeedVideoFpsRangesFor;

    public ObservableScan(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
        super(observableSource);
        this.getHighSpeedVideoFpsRangesFor = biFunction;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableScan.ScanObserver(observer, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class ScanObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> Camera2StreamConfigurationMap;
        T getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.BiFunction<T, T, T> getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        ScanObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
            this.Camera2StreamConfigurationMap = observer;
            this.getHighSpeedVideoFpsRanges = biFunction;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.isDisposed();
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            io.reactivex.Observer<? super T> observer = this.Camera2StreamConfigurationMap;
            T t2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (t2 == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = t;
                observer.onNext(t);
                return;
            }
            try {
                ?? r4 = (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(t2, t), "The value returned by the accumulator is null");
                this.getHighResolutionOutputSizeshNQ4ISI = r4;
                observer.onNext(r4);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoFpsRangesFor.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoSizes = true;
                this.Camera2StreamConfigurationMap.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.Camera2StreamConfigurationMap.onComplete();
        }
    }
}
