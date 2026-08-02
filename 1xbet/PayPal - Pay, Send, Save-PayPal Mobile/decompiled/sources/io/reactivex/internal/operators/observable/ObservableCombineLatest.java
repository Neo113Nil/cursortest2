package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableCombineLatest<T, R> extends io.reactivex.Observable<R> {
    final java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> getHighSpeedVideoFpsRanges;
    final io.reactivex.ObservableSource<? extends T>[] getHighSpeedVideoFpsRangesFor;
    final boolean getHighSpeedVideoSizes;

    public ObservableCombineLatest(io.reactivex.ObservableSource<? extends T>[] observableSourceArr, java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> iterable, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function, int i, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = observableSourceArr;
        this.Camera2StreamConfigurationMap = iterable;
        this.getHighSpeedVideoFpsRanges = function;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        int length;
        io.reactivex.ObservableSource<? extends T>[] observableSourceArr = this.getHighSpeedVideoFpsRangesFor;
        if (observableSourceArr == null) {
            observableSourceArr = new io.reactivex.Observable[8];
            length = 0;
            for (io.reactivex.ObservableSource<? extends T> observableSource : this.Camera2StreamConfigurationMap) {
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
        int i = length;
        if (i == 0) {
            io.reactivex.internal.disposables.EmptyDisposable.complete(observer);
            return;
        }
        io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator latestCoordinator = new io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator(observer, this.getHighSpeedVideoFpsRanges, i, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver<T, R>[] combinerObserverArr = latestCoordinator.getHighSpeedVideoSizesFor;
        int length2 = combinerObserverArr.length;
        latestCoordinator.getHighSpeedVideoFpsRangesFor.onSubscribe(latestCoordinator);
        for (int i2 = 0; i2 < length2 && !latestCoordinator.getInputFormats && !latestCoordinator.getHighResolutionOutputSizeshNQ4ISI; i2++) {
            observableSourceArr[i2].subscribe(combinerObserverArr[i2]);
        }
    }

    /* loaded from: classes17.dex */
    static final class LatestCoordinator<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8567835998786448817L;
        int Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final io.reactivex.Observer<? super R> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> getHighSpeedVideoSizes;
        final io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver<T, R>[] getHighSpeedVideoSizesFor;
        volatile boolean getInputFormats;
        final io.reactivex.internal.util.AtomicThrowable getInputSizeshNQ4ISI = new io.reactivex.internal.util.AtomicThrowable();
        java.lang.Object[] getOutputFormats;
        final boolean getOutputMinFrameDuration;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object[]> getOutputStallDuration;

        LatestCoordinator(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function, int i, int i2, boolean z) {
            this.getHighSpeedVideoFpsRangesFor = observer;
            this.getHighSpeedVideoSizes = function;
            this.getOutputMinFrameDuration = z;
            this.getOutputFormats = new java.lang.Object[i];
            io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver<T, R>[] combinerObserverArr = new io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver[i];
            for (int i3 = 0; i3 < i; i3++) {
                combinerObserverArr[i3] = new io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver<>(this, i3);
            }
            this.getHighSpeedVideoSizesFor = combinerObserverArr;
            this.getOutputStallDuration = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i2);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            for (io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver<T, R> combinerObserver : this.getHighSpeedVideoSizesFor) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(combinerObserver);
            }
            if (getAndIncrement() == 0) {
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object[]> spscLinkedArrayQueue = this.getOutputStallDuration;
                synchronized (this) {
                    this.getOutputFormats = null;
                }
                spscLinkedArrayQueue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        final void getHighSpeedVideoSizes() {
            if (getAndIncrement() == 0) {
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object[]> spscLinkedArrayQueue = this.getOutputStallDuration;
                io.reactivex.Observer<? super R> observer = this.getHighSpeedVideoFpsRangesFor;
                boolean z = this.getOutputMinFrameDuration;
                int i = 1;
                while (!this.getHighResolutionOutputSizeshNQ4ISI) {
                    int i2 = 0;
                    if (z || this.getInputSizeshNQ4ISI.get() == null) {
                        boolean z2 = this.getInputFormats;
                        java.lang.Object[] poll = spscLinkedArrayQueue.poll();
                        boolean z3 = poll == null;
                        if (z2 && z3) {
                            synchronized (this) {
                                this.getOutputFormats = null;
                            }
                            spscLinkedArrayQueue.clear();
                            java.lang.Throwable terminate = this.getInputSizeshNQ4ISI.terminate();
                            if (terminate == null) {
                                observer.onComplete();
                                return;
                            } else {
                                observer.onError(terminate);
                                return;
                            }
                        }
                        if (!z3) {
                            try {
                                observer.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.apply(poll), "The combiner returned a null value"));
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                this.getInputSizeshNQ4ISI.addThrowable(th);
                                io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver<T, R>[] combinerObserverArr = this.getHighSpeedVideoSizesFor;
                                int length = combinerObserverArr.length;
                                while (i2 < length) {
                                    io.reactivex.internal.disposables.DisposableHelper.dispose(combinerObserverArr[i2]);
                                    i2++;
                                }
                                synchronized (this) {
                                    this.getOutputFormats = null;
                                    spscLinkedArrayQueue.clear();
                                    observer.onError(this.getInputSizeshNQ4ISI.terminate());
                                    return;
                                }
                            }
                        } else {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    } else {
                        io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver<T, R>[] combinerObserverArr2 = this.getHighSpeedVideoSizesFor;
                        int length2 = combinerObserverArr2.length;
                        while (i2 < length2) {
                            io.reactivex.internal.disposables.DisposableHelper.dispose(combinerObserverArr2[i2]);
                            i2++;
                        }
                        synchronized (this) {
                            this.getOutputFormats = null;
                        }
                        spscLinkedArrayQueue.clear();
                        observer.onError(this.getInputSizeshNQ4ISI.terminate());
                        return;
                    }
                }
                synchronized (this) {
                    this.getOutputFormats = null;
                }
                spscLinkedArrayQueue.clear();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void getHighSpeedVideoFpsRangesFor(int i, T t) {
            boolean z;
            synchronized (this) {
                java.lang.Object[] objArr = this.getOutputFormats;
                if (objArr == null) {
                    return;
                }
                java.lang.Object obj = objArr[i];
                int i2 = this.getHighSpeedVideoFpsRanges;
                if (obj == null) {
                    i2++;
                    this.getHighSpeedVideoFpsRanges = i2;
                }
                objArr[i] = t;
                if (i2 == objArr.length) {
                    this.getOutputStallDuration.offer(objArr.clone());
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    getHighSpeedVideoSizes();
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class CombinerObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        final int getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator<T, R> getHighSpeedVideoSizes;

        CombinerObserver(io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator<T, R> latestCoordinator, int i) {
            this.getHighSpeedVideoSizes = latestCoordinator;
            this.getHighSpeedVideoFpsRanges = i;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, t);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
        
            if (r4 == r6.length) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
        
            if (r1 != false) goto L25;
         */
        @Override // io.reactivex.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator<T, R> latestCoordinator = this.getHighSpeedVideoSizes;
            int i = this.getHighSpeedVideoFpsRanges;
            if (latestCoordinator.getInputSizeshNQ4ISI.addThrowable(th)) {
                if (latestCoordinator.getOutputMinFrameDuration) {
                    synchronized (latestCoordinator) {
                        java.lang.Object[] objArr = latestCoordinator.getOutputFormats;
                        if (objArr == null) {
                            return;
                        }
                        boolean z = objArr[i] == null;
                        if (!z) {
                            int i2 = latestCoordinator.Camera2StreamConfigurationMap + 1;
                            latestCoordinator.Camera2StreamConfigurationMap = i2;
                        }
                        latestCoordinator.getInputFormats = true;
                    }
                }
                for (io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver<T, R> combinerObserver : latestCoordinator.getHighSpeedVideoSizesFor) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(combinerObserver);
                }
                latestCoordinator.getHighSpeedVideoSizes();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
        
            if (r5 == r2.length) goto L15;
         */
        @Override // io.reactivex.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onComplete() {
            io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator<T, R> latestCoordinator = this.getHighSpeedVideoSizes;
            int i = this.getHighSpeedVideoFpsRanges;
            synchronized (latestCoordinator) {
                java.lang.Object[] objArr = latestCoordinator.getOutputFormats;
                if (objArr == null) {
                    return;
                }
                boolean z = objArr[i] == null;
                if (!z) {
                    int i2 = latestCoordinator.Camera2StreamConfigurationMap + 1;
                    latestCoordinator.Camera2StreamConfigurationMap = i2;
                }
                latestCoordinator.getInputFormats = true;
                if (z) {
                    for (io.reactivex.internal.operators.observable.ObservableCombineLatest.CombinerObserver<T, R> combinerObserver : latestCoordinator.getHighSpeedVideoSizesFor) {
                        io.reactivex.internal.disposables.DisposableHelper.dispose(combinerObserver);
                    }
                }
                latestCoordinator.getHighSpeedVideoSizes();
            }
        }
    }
}
