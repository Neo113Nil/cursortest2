package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleZipArray<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.SingleSource<? extends T>[] getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> getHighSpeedVideoFpsRanges;

    public SingleZipArray(io.reactivex.SingleSource<? extends T>[] singleSourceArr, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function) {
        this.getHighResolutionOutputSizeshNQ4ISI = singleSourceArr;
        this.getHighSpeedVideoFpsRanges = function;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super R> singleObserver) {
        io.reactivex.SingleSource<? extends T>[] singleSourceArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int length = singleSourceArr.length;
        if (length == 1) {
            singleSourceArr[0].subscribe(new io.reactivex.internal.operators.single.SingleMap.MapSingleObserver(singleObserver, new io.reactivex.internal.operators.single.SingleZipArray.SingletonArrayFunc()));
            return;
        }
        io.reactivex.internal.operators.single.SingleZipArray.ZipCoordinator zipCoordinator = new io.reactivex.internal.operators.single.SingleZipArray.ZipCoordinator(singleObserver, length, this.getHighSpeedVideoFpsRanges);
        singleObserver.onSubscribe(zipCoordinator);
        for (int i = 0; i < length && !zipCoordinator.isDisposed(); i++) {
            io.reactivex.SingleSource<? extends T> singleSource = singleSourceArr[i];
            if (singleSource == null) {
                java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("One of the sources is null");
                if (zipCoordinator.getAndSet(0) > 0) {
                    zipCoordinator.getHighResolutionOutputSizeshNQ4ISI(i);
                    zipCoordinator.getHighSpeedVideoFpsRangesFor.onError(nullPointerException);
                    return;
                } else {
                    io.reactivex.plugins.RxJavaPlugins.onError(nullPointerException);
                    return;
                }
            }
            singleSource.subscribe(zipCoordinator.getHighSpeedVideoFpsRanges[i]);
        }
    }

    /* loaded from: classes17.dex */
    static final class ZipCoordinator<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5556924161382950569L;
        final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> Camera2StreamConfigurationMap;
        final io.reactivex.internal.operators.single.SingleZipArray.ZipSingleObserver<T>[] getHighSpeedVideoFpsRanges;
        final io.reactivex.SingleObserver<? super R> getHighSpeedVideoFpsRangesFor;
        final java.lang.Object[] getHighSpeedVideoSizes;

        ZipCoordinator(io.reactivex.SingleObserver<? super R> singleObserver, int i, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function) {
            super(i);
            this.getHighSpeedVideoFpsRangesFor = singleObserver;
            this.Camera2StreamConfigurationMap = function;
            io.reactivex.internal.operators.single.SingleZipArray.ZipSingleObserver<T>[] zipSingleObserverArr = new io.reactivex.internal.operators.single.SingleZipArray.ZipSingleObserver[i];
            for (int i2 = 0; i2 < i; i2++) {
                zipSingleObserverArr[i2] = new io.reactivex.internal.operators.single.SingleZipArray.ZipSingleObserver<>(this, i2);
            }
            this.getHighSpeedVideoFpsRanges = zipSingleObserverArr;
            this.getHighSpeedVideoSizes = new java.lang.Object[i];
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() <= 0;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (io.reactivex.internal.operators.single.SingleZipArray.ZipSingleObserver<T> zipSingleObserver : this.getHighSpeedVideoFpsRanges) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(zipSingleObserver);
                }
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI(int i) {
            io.reactivex.internal.operators.single.SingleZipArray.ZipSingleObserver<T>[] zipSingleObserverArr = this.getHighSpeedVideoFpsRanges;
            int length = zipSingleObserverArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(zipSingleObserverArr[i2]);
            }
            while (true) {
                i++;
                if (i >= length) {
                    return;
                } else {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(zipSingleObserverArr[i]);
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class ZipSingleObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.operators.single.SingleZipArray.ZipCoordinator<T, ?> getHighSpeedVideoFpsRangesFor;

        ZipSingleObserver(io.reactivex.internal.operators.single.SingleZipArray.ZipCoordinator<T, ?> zipCoordinator, int i) {
            this.getHighSpeedVideoFpsRangesFor = zipCoordinator;
            this.getHighSpeedVideoFpsRanges = i;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            io.reactivex.internal.operators.single.SingleZipArray.ZipCoordinator<T, ?> zipCoordinator = this.getHighSpeedVideoFpsRangesFor;
            zipCoordinator.getHighSpeedVideoSizes[this.getHighSpeedVideoFpsRanges] = t;
            if (zipCoordinator.decrementAndGet() == 0) {
                try {
                    zipCoordinator.getHighSpeedVideoFpsRangesFor.onSuccess(io.reactivex.internal.functions.ObjectHelper.requireNonNull(zipCoordinator.Camera2StreamConfigurationMap.apply(zipCoordinator.getHighSpeedVideoSizes), "The zipper returned a null value"));
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    zipCoordinator.getHighSpeedVideoFpsRangesFor.onError(th);
                }
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.single.SingleZipArray.ZipCoordinator<T, ?> zipCoordinator = this.getHighSpeedVideoFpsRangesFor;
            int i = this.getHighSpeedVideoFpsRanges;
            if (zipCoordinator.getAndSet(0) > 0) {
                zipCoordinator.getHighResolutionOutputSizeshNQ4ISI(i);
                zipCoordinator.getHighSpeedVideoFpsRangesFor.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }

    /* loaded from: classes17.dex */
    final class SingletonArrayFunc implements io.reactivex.functions.Function<T, R> {
        SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public final R apply(T t) throws java.lang.Exception {
            return (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(io.reactivex.internal.operators.single.SingleZipArray.this.getHighSpeedVideoFpsRanges.apply(new java.lang.Object[]{t}), "The zipper returned a null value");
        }
    }
}
