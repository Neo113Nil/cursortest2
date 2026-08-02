package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableWithLatestFromMany<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final java.lang.Iterable<? extends io.reactivex.ObservableSource<?>> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.ObservableSource<?>[] getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Function<? super java.lang.Object[], R> getHighSpeedVideoSizes;

    public ObservableWithLatestFromMany(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<?>[] observableSourceArr, io.reactivex.functions.Function<? super java.lang.Object[], R> function) {
        super(observableSource);
        this.getHighSpeedVideoFpsRanges = observableSourceArr;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizes = function;
    }

    public ObservableWithLatestFromMany(io.reactivex.ObservableSource<T> observableSource, java.lang.Iterable<? extends io.reactivex.ObservableSource<?>> iterable, io.reactivex.functions.Function<? super java.lang.Object[], R> function) {
        super(observableSource);
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighResolutionOutputSizeshNQ4ISI = iterable;
        this.getHighSpeedVideoSizes = function;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        int length;
        io.reactivex.ObservableSource<?>[] observableSourceArr = this.getHighSpeedVideoFpsRanges;
        if (observableSourceArr == null) {
            observableSourceArr = new io.reactivex.ObservableSource[8];
            try {
                length = 0;
                for (io.reactivex.ObservableSource<?> observableSource : this.getHighResolutionOutputSizeshNQ4ISI) {
                    if (length == observableSourceArr.length) {
                        observableSourceArr = (io.reactivex.ObservableSource[]) java.util.Arrays.copyOf(observableSourceArr, (length >> 1) + length);
                    }
                    observableSourceArr[length] = observableSource;
                    length++;
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
                return;
            }
        } else {
            length = observableSourceArr.length;
        }
        if (length == 0) {
            new io.reactivex.internal.operators.observable.ObservableMap(this.source, new io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.SingletonArrayFunc()).subscribeActual(observer);
            return;
        }
        io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestFromObserver withLatestFromObserver = new io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestFromObserver(observer, this.getHighSpeedVideoSizes, length);
        observer.onSubscribe(withLatestFromObserver);
        io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestInnerObserver[] withLatestInnerObserverArr = withLatestFromObserver.getOutputFormats;
        java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference = withLatestFromObserver.getHighSpeedVideoSizes;
        for (int i = 0; i < length && !io.reactivex.internal.disposables.DisposableHelper.isDisposed(atomicReference.get()) && !withLatestFromObserver.getHighSpeedVideoFpsRangesFor; i++) {
            observableSourceArr[i].subscribe(withLatestInnerObserverArr[i]);
        }
        this.source.subscribe(withLatestFromObserver);
    }

    /* loaded from: classes17.dex */
    static final class WithLatestFromObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 1577321883966341961L;
        final io.reactivex.Observer<? super R> Camera2StreamConfigurationMap;
        final io.reactivex.functions.Function<? super java.lang.Object[], R> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoSizes;
        final java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> getInputFormats;
        final io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestInnerObserver[] getOutputFormats;

        WithLatestFromObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super java.lang.Object[], R> function, int i) {
            this.Camera2StreamConfigurationMap = observer;
            this.getHighResolutionOutputSizeshNQ4ISI = function;
            io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestInnerObserver[] withLatestInnerObserverArr = new io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestInnerObserver[i];
            for (int i2 = 0; i2 < i; i2++) {
                withLatestInnerObserverArr[i2] = new io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestInnerObserver(this, i2);
            }
            this.getOutputFormats = withLatestInnerObserverArr;
            this.getInputFormats = new java.util.concurrent.atomic.AtomicReferenceArray<>(i);
            this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();
            this.getHighSpeedVideoFpsRanges = new io.reactivex.internal.util.AtomicThrowable();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighSpeedVideoSizes, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.getInputFormats;
            int length = atomicReferenceArray.length();
            java.lang.Object[] objArr = new java.lang.Object[length + 1];
            int i = 0;
            objArr[0] = t;
            while (i < length) {
                java.lang.Object obj = atomicReferenceArray.get(i);
                if (obj == null) {
                    return;
                }
                i++;
                objArr[i] = obj;
            }
            try {
                io.reactivex.internal.util.HalfSerializer.onNext(this.Camera2StreamConfigurationMap, io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.apply(objArr), "combiner returned a null value"), this, this.getHighSpeedVideoFpsRanges);
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
            io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestInnerObserver[] withLatestInnerObserverArr = this.getOutputFormats;
            for (int i = 0; i < withLatestInnerObserverArr.length; i++) {
                if (i != -1) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(withLatestInnerObserverArr[i]);
                }
            }
            io.reactivex.internal.util.HalfSerializer.onError(this.Camera2StreamConfigurationMap, th, this, this.getHighSpeedVideoFpsRanges);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestInnerObserver[] withLatestInnerObserverArr = this.getOutputFormats;
            for (int i = 0; i < withLatestInnerObserverArr.length; i++) {
                if (i != -1) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(withLatestInnerObserverArr[i]);
                }
            }
            io.reactivex.internal.util.HalfSerializer.onComplete(this.Camera2StreamConfigurationMap, this, this.getHighSpeedVideoFpsRanges);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighSpeedVideoSizes.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizes);
            for (io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestInnerObserver withLatestInnerObserver : this.getOutputFormats) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(withLatestInnerObserver);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class WithLatestInnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<java.lang.Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        final io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestFromObserver<?, ?> Camera2StreamConfigurationMap;
        boolean getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoSizes;

        WithLatestInnerObserver(io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestFromObserver<?, ?> withLatestFromObserver, int i) {
            this.Camera2StreamConfigurationMap = withLatestFromObserver;
            this.getHighSpeedVideoSizes = i;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(java.lang.Object obj) {
            if (!this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoFpsRanges = true;
            }
            io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestFromObserver<?, ?> withLatestFromObserver = this.Camera2StreamConfigurationMap;
            withLatestFromObserver.getInputFormats.set(this.getHighSpeedVideoSizes, obj);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestFromObserver<?, ?> withLatestFromObserver = this.Camera2StreamConfigurationMap;
            int i = this.getHighSpeedVideoSizes;
            withLatestFromObserver.getHighSpeedVideoFpsRangesFor = true;
            io.reactivex.internal.disposables.DisposableHelper.dispose(withLatestFromObserver.getHighSpeedVideoSizes);
            io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestInnerObserver[] withLatestInnerObserverArr = withLatestFromObserver.getOutputFormats;
            for (int i2 = 0; i2 < withLatestInnerObserverArr.length; i2++) {
                if (i2 != i) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(withLatestInnerObserverArr[i2]);
                }
            }
            io.reactivex.internal.util.HalfSerializer.onError(withLatestFromObserver.Camera2StreamConfigurationMap, th, withLatestFromObserver, withLatestFromObserver.getHighSpeedVideoFpsRanges);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestFromObserver<?, ?> withLatestFromObserver = this.Camera2StreamConfigurationMap;
            int i = this.getHighSpeedVideoSizes;
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            withLatestFromObserver.getHighSpeedVideoFpsRangesFor = true;
            io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.WithLatestInnerObserver[] withLatestInnerObserverArr = withLatestFromObserver.getOutputFormats;
            for (int i2 = 0; i2 < withLatestInnerObserverArr.length; i2++) {
                if (i2 != i) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(withLatestInnerObserverArr[i2]);
                }
            }
            io.reactivex.internal.util.HalfSerializer.onComplete(withLatestFromObserver.Camera2StreamConfigurationMap, withLatestFromObserver, withLatestFromObserver.getHighSpeedVideoFpsRanges);
        }
    }

    /* loaded from: classes17.dex */
    final class SingletonArrayFunc implements io.reactivex.functions.Function<T, R> {
        SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public final R apply(T t) throws java.lang.Exception {
            return (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(io.reactivex.internal.operators.observable.ObservableWithLatestFromMany.this.getHighSpeedVideoSizes.apply(new java.lang.Object[]{t}), "The combiner returned a null value");
        }
    }
}
