package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableZip<T, R> extends io.reactivex.Observable<R> {
    final int Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> getHighResolutionOutputSizeshNQ4ISI;
    final boolean getHighSpeedVideoFpsRanges;
    final io.reactivex.ObservableSource<? extends T>[] getHighSpeedVideoFpsRangesFor;
    final java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> getHighSpeedVideoSizes;

    public ObservableZip(io.reactivex.ObservableSource<? extends T>[] observableSourceArr, java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> iterable, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function, int i, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = observableSourceArr;
        this.getHighSpeedVideoSizes = iterable;
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        int length;
        io.reactivex.ObservableSource<? extends T>[] observableSourceArr = this.getHighSpeedVideoFpsRangesFor;
        if (observableSourceArr == null) {
            observableSourceArr = new io.reactivex.Observable[8];
            length = 0;
            for (io.reactivex.ObservableSource<? extends T> observableSource : this.getHighSpeedVideoSizes) {
                if (length == observableSourceArr.length) {
                    io.reactivex.ObservableSource<? extends T>[] observableSourceArr2 = new io.reactivex.ObservableSource[(length >> 2) + length];
                    java.lang.System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                    observableSourceArr = observableSourceArr2;
                }
                observableSourceArr[length] = observableSource;
                length++;
            }
        } else {
            length = observableSourceArr.length;
        }
        if (length == 0) {
            io.reactivex.internal.disposables.EmptyDisposable.complete(observer);
            return;
        }
        io.reactivex.internal.operators.observable.ObservableZip.ZipCoordinator zipCoordinator = new io.reactivex.internal.operators.observable.ObservableZip.ZipCoordinator(observer, this.getHighResolutionOutputSizeshNQ4ISI, length, this.getHighSpeedVideoFpsRanges);
        int i = this.Camera2StreamConfigurationMap;
        io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<T, R>[] zipObserverArr = zipCoordinator.getHighResolutionOutputSizeshNQ4ISI;
        int length2 = zipObserverArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            zipObserverArr[i2] = new io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<>(zipCoordinator, i);
        }
        zipCoordinator.lazySet(0);
        zipCoordinator.getHighSpeedVideoFpsRangesFor.onSubscribe(zipCoordinator);
        for (int i3 = 0; i3 < length2 && !zipCoordinator.getHighSpeedVideoFpsRanges; i3++) {
            observableSourceArr[i3].subscribe(zipObserverArr[i3]);
        }
    }

    /* loaded from: classes17.dex */
    static final class ZipCoordinator<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 2983708048395377667L;
        final T[] Camera2StreamConfigurationMap;
        final io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<T, R>[] getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.Observer<? super R> getHighSpeedVideoFpsRangesFor;
        final boolean getHighSpeedVideoSizes;
        final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> getHighSpeedVideoSizesFor;

        ZipCoordinator(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function, int i, boolean z) {
            this.getHighSpeedVideoFpsRangesFor = observer;
            this.getHighSpeedVideoSizesFor = function;
            this.getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.operators.observable.ObservableZip.ZipObserver[i];
            this.Camera2StreamConfigurationMap = (T[]) new java.lang.Object[i];
            this.getHighSpeedVideoSizes = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            for (io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<T, R> zipObserver : this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(zipObserver.Camera2StreamConfigurationMap);
            }
            if (getAndIncrement() == 0) {
                for (io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<T, R> zipObserver2 : this.getHighResolutionOutputSizeshNQ4ISI) {
                    zipObserver2.getHighResolutionOutputSizeshNQ4ISI.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final void getHighSpeedVideoFpsRanges() {
            java.lang.Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<T, R>[] zipObserverArr = this.getHighResolutionOutputSizeshNQ4ISI;
            io.reactivex.Observer<? super R> observer = this.getHighSpeedVideoFpsRangesFor;
            T[] tArr = this.Camera2StreamConfigurationMap;
            boolean z = this.getHighSpeedVideoSizes;
            int i = 1;
            while (true) {
                int i2 = 0;
                int i3 = 0;
                for (io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<T, R> zipObserver : zipObserverArr) {
                    if (tArr[i3] == null) {
                        boolean z2 = zipObserver.getHighSpeedVideoFpsRangesFor;
                        T poll = zipObserver.getHighResolutionOutputSizeshNQ4ISI.poll();
                        boolean z3 = poll == null;
                        if (this.getHighSpeedVideoFpsRanges) {
                            getHighResolutionOutputSizeshNQ4ISI();
                            return;
                        }
                        if (z2) {
                            if (!z) {
                                java.lang.Throwable th2 = zipObserver.getHighSpeedVideoSizes;
                                if (th2 != null) {
                                    getHighResolutionOutputSizeshNQ4ISI();
                                    observer.onError(th2);
                                    return;
                                } else if (z3) {
                                    getHighResolutionOutputSizeshNQ4ISI();
                                    observer.onComplete();
                                    return;
                                }
                            } else if (z3) {
                                java.lang.Throwable th3 = zipObserver.getHighSpeedVideoSizes;
                                getHighResolutionOutputSizeshNQ4ISI();
                                if (th3 != null) {
                                    observer.onError(th3);
                                    return;
                                } else {
                                    observer.onComplete();
                                    return;
                                }
                            }
                        }
                        if (z3) {
                            i2++;
                        } else {
                            tArr[i3] = poll;
                        }
                    } else if (zipObserver.getHighSpeedVideoFpsRangesFor && !z && (th = zipObserver.getHighSpeedVideoSizes) != null) {
                        getHighResolutionOutputSizeshNQ4ISI();
                        observer.onError(th);
                        return;
                    }
                    i3++;
                }
                if (i2 == 0) {
                    try {
                        observer.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizesFor.apply(tArr.clone()), "The zipper returned a null value"));
                        java.util.Arrays.fill(tArr, (java.lang.Object) null);
                    } catch (java.lang.Throwable th4) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
                        getHighResolutionOutputSizeshNQ4ISI();
                        observer.onError(th4);
                        return;
                    }
                } else {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            for (io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<T, R> zipObserver : this.getHighResolutionOutputSizeshNQ4ISI) {
                zipObserver.getHighResolutionOutputSizeshNQ4ISI.clear();
            }
            for (io.reactivex.internal.operators.observable.ObservableZip.ZipObserver<T, R> zipObserver2 : this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(zipObserver2.Camera2StreamConfigurationMap);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class ZipObserver<T, R> implements io.reactivex.Observer<T> {
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.operators.observable.ObservableZip.ZipCoordinator<T, R> getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        java.lang.Throwable getHighSpeedVideoSizes;

        ZipObserver(io.reactivex.internal.operators.observable.ObservableZip.ZipCoordinator<T, R> zipCoordinator, int i) {
            this.getHighSpeedVideoFpsRanges = zipCoordinator;
            this.getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.Camera2StreamConfigurationMap, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI.offer(t);
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = th;
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
        }
    }
}
