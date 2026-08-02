package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableZipIterable<T, U, V> extends io.reactivex.Observable<V> {
    final io.reactivex.Observable<? extends T> Camera2StreamConfigurationMap;
    final java.lang.Iterable<U> getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> getHighSpeedVideoFpsRangesFor;

    public ObservableZipIterable(io.reactivex.Observable<? extends T> observable, java.lang.Iterable<U> iterable, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> biFunction) {
        this.Camera2StreamConfigurationMap = observable;
        this.getHighSpeedVideoFpsRanges = iterable;
        this.getHighSpeedVideoFpsRangesFor = biFunction;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super V> observer) {
        try {
            java.util.Iterator it = (java.util.Iterator) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    io.reactivex.internal.disposables.EmptyDisposable.complete(observer);
                } else {
                    this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.observable.ObservableZipIterable.ZipIterableObserver(observer, it, this.getHighSpeedVideoFpsRangesFor));
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
            }
        } catch (java.lang.Throwable th2) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
            io.reactivex.internal.disposables.EmptyDisposable.error(th2, observer);
        }
    }

    /* loaded from: classes17.dex */
    static final class ZipIterableObserver<T, U, V> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        boolean Camera2StreamConfigurationMap;
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> getHighSpeedVideoFpsRanges;
        final java.util.Iterator<U> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Observer<? super V> getHighSpeedVideoSizes;

        ZipIterableObserver(io.reactivex.Observer<? super V> observer, java.util.Iterator<U> it, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> biFunction) {
            this.getHighSpeedVideoSizes = observer;
            this.getHighSpeedVideoFpsRangesFor = it;
            this.getHighSpeedVideoFpsRanges = biFunction;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            try {
                try {
                    this.getHighSpeedVideoSizes.onNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(t, io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (this.getHighSpeedVideoFpsRangesFor.hasNext()) {
                            return;
                        }
                        this.Camera2StreamConfigurationMap = true;
                        this.getHighResolutionOutputSizeshNQ4ISI.dispose();
                        this.getHighSpeedVideoSizes.onComplete();
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.Camera2StreamConfigurationMap = true;
                        this.getHighResolutionOutputSizeshNQ4ISI.dispose();
                        this.getHighSpeedVideoSizes.onError(th);
                    }
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    this.Camera2StreamConfigurationMap = true;
                    this.getHighResolutionOutputSizeshNQ4ISI.dispose();
                    this.getHighSpeedVideoSizes.onError(th2);
                }
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                this.Camera2StreamConfigurationMap = true;
                this.getHighResolutionOutputSizeshNQ4ISI.dispose();
                this.getHighSpeedVideoSizes.onError(th3);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.Camera2StreamConfigurationMap = true;
                this.getHighSpeedVideoSizes.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoSizes.onComplete();
        }
    }
}
