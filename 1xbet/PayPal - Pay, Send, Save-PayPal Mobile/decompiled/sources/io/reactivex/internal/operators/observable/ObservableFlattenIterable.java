package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableFlattenIterable<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> getHighResolutionOutputSizeshNQ4ISI;

    public ObservableFlattenIterable(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function) {
        super(observableSource);
        this.getHighResolutionOutputSizeshNQ4ISI = function;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableFlattenIterable.FlattenIterableObserver(observer, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class FlattenIterableObserver<T, R> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super R> getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> getHighSpeedVideoFpsRangesFor;

        FlattenIterableObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function) {
            this.getHighSpeedVideoFpsRanges = observer;
            this.getHighSpeedVideoFpsRangesFor = function;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                try {
                    java.util.Iterator<? extends R> it = this.getHighSpeedVideoFpsRangesFor.apply(t).iterator();
                    io.reactivex.Observer<? super R> observer = this.getHighSpeedVideoFpsRanges;
                    while (it.hasNext()) {
                        try {
                            try {
                                observer.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                this.Camera2StreamConfigurationMap.dispose();
                                onError(th);
                                return;
                            }
                        } catch (java.lang.Throwable th2) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                            this.Camera2StreamConfigurationMap.dispose();
                            onError(th2);
                            return;
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                    this.Camera2StreamConfigurationMap.dispose();
                    onError(th3);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
                this.getHighSpeedVideoFpsRanges.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return;
            }
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRanges.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap.dispose();
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }
    }
}
