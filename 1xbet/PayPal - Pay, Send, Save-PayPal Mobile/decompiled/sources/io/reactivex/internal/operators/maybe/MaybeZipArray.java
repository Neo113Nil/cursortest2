package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeZipArray<T, R> extends io.reactivex.Maybe<R> {
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> getHighSpeedVideoFpsRanges;
    final io.reactivex.MaybeSource<? extends T>[] getHighSpeedVideoFpsRangesFor;

    public MaybeZipArray(io.reactivex.MaybeSource<? extends T>[] maybeSourceArr, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function) {
        this.getHighSpeedVideoFpsRangesFor = maybeSourceArr;
        this.getHighSpeedVideoFpsRanges = function;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super R> maybeObserver) {
        io.reactivex.MaybeSource<? extends T>[] maybeSourceArr = this.getHighSpeedVideoFpsRangesFor;
        int length = maybeSourceArr.length;
        if (length == 1) {
            maybeSourceArr[0].subscribe(new io.reactivex.internal.operators.maybe.MaybeMap.MapMaybeObserver(maybeObserver, new io.reactivex.internal.operators.maybe.MaybeZipArray.SingletonArrayFunc()));
            return;
        }
        io.reactivex.internal.operators.maybe.MaybeZipArray.ZipCoordinator zipCoordinator = new io.reactivex.internal.operators.maybe.MaybeZipArray.ZipCoordinator(maybeObserver, length, this.getHighSpeedVideoFpsRanges);
        maybeObserver.onSubscribe(zipCoordinator);
        for (int i = 0; i < length && !zipCoordinator.isDisposed(); i++) {
            io.reactivex.MaybeSource<? extends T> maybeSource = maybeSourceArr[i];
            if (maybeSource == null) {
                java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("One of the sources is null");
                if (zipCoordinator.getAndSet(0) > 0) {
                    zipCoordinator.Camera2StreamConfigurationMap(i);
                    zipCoordinator.Camera2StreamConfigurationMap.onError(nullPointerException);
                    return;
                } else {
                    io.reactivex.plugins.RxJavaPlugins.onError(nullPointerException);
                    return;
                }
            }
            maybeSource.subscribe(zipCoordinator.getHighResolutionOutputSizeshNQ4ISI[i]);
        }
    }

    /* loaded from: classes17.dex */
    static final class ZipCoordinator<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5556924161382950569L;
        final io.reactivex.MaybeObserver<? super R> Camera2StreamConfigurationMap;
        final io.reactivex.internal.operators.maybe.MaybeZipArray.ZipMaybeObserver<T>[] getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> getHighSpeedVideoFpsRanges;
        final java.lang.Object[] getHighSpeedVideoFpsRangesFor;

        ZipCoordinator(io.reactivex.MaybeObserver<? super R> maybeObserver, int i, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function) {
            super(i);
            this.Camera2StreamConfigurationMap = maybeObserver;
            this.getHighSpeedVideoFpsRanges = function;
            io.reactivex.internal.operators.maybe.MaybeZipArray.ZipMaybeObserver<T>[] zipMaybeObserverArr = new io.reactivex.internal.operators.maybe.MaybeZipArray.ZipMaybeObserver[i];
            for (int i2 = 0; i2 < i; i2++) {
                zipMaybeObserverArr[i2] = new io.reactivex.internal.operators.maybe.MaybeZipArray.ZipMaybeObserver<>(this, i2);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = zipMaybeObserverArr;
            this.getHighSpeedVideoFpsRangesFor = new java.lang.Object[i];
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() <= 0;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (io.reactivex.internal.operators.maybe.MaybeZipArray.ZipMaybeObserver<T> zipMaybeObserver : this.getHighResolutionOutputSizeshNQ4ISI) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(zipMaybeObserver);
                }
            }
        }

        final void Camera2StreamConfigurationMap(int i) {
            io.reactivex.internal.operators.maybe.MaybeZipArray.ZipMaybeObserver<T>[] zipMaybeObserverArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int length = zipMaybeObserverArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(zipMaybeObserverArr[i2]);
            }
            while (true) {
                i++;
                if (i >= length) {
                    return;
                } else {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(zipMaybeObserverArr[i]);
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class ZipMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final io.reactivex.internal.operators.maybe.MaybeZipArray.ZipCoordinator<T, ?> Camera2StreamConfigurationMap;
        final int getHighSpeedVideoFpsRangesFor;

        ZipMaybeObserver(io.reactivex.internal.operators.maybe.MaybeZipArray.ZipCoordinator<T, ?> zipCoordinator, int i) {
            this.Camera2StreamConfigurationMap = zipCoordinator;
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            io.reactivex.internal.operators.maybe.MaybeZipArray.ZipCoordinator<T, ?> zipCoordinator = this.Camera2StreamConfigurationMap;
            zipCoordinator.getHighSpeedVideoFpsRangesFor[this.getHighSpeedVideoFpsRangesFor] = t;
            if (zipCoordinator.decrementAndGet() == 0) {
                try {
                    zipCoordinator.Camera2StreamConfigurationMap.onSuccess(io.reactivex.internal.functions.ObjectHelper.requireNonNull(zipCoordinator.getHighSpeedVideoFpsRanges.apply(zipCoordinator.getHighSpeedVideoFpsRangesFor), "The zipper returned a null value"));
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    zipCoordinator.Camera2StreamConfigurationMap.onError(th);
                }
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.maybe.MaybeZipArray.ZipCoordinator<T, ?> zipCoordinator = this.Camera2StreamConfigurationMap;
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (zipCoordinator.getAndSet(0) > 0) {
                zipCoordinator.Camera2StreamConfigurationMap(i);
                zipCoordinator.Camera2StreamConfigurationMap.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            io.reactivex.internal.operators.maybe.MaybeZipArray.ZipCoordinator<T, ?> zipCoordinator = this.Camera2StreamConfigurationMap;
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (zipCoordinator.getAndSet(0) > 0) {
                zipCoordinator.Camera2StreamConfigurationMap(i);
                zipCoordinator.Camera2StreamConfigurationMap.onComplete();
            }
        }
    }

    /* loaded from: classes17.dex */
    final class SingletonArrayFunc implements io.reactivex.functions.Function<T, R> {
        SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public final R apply(T t) throws java.lang.Exception {
            return (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(io.reactivex.internal.operators.maybe.MaybeZipArray.this.getHighSpeedVideoFpsRanges.apply(new java.lang.Object[]{t}), "The zipper returned a null value");
        }
    }
}
