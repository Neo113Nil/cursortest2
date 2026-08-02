package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableFlatMap<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> Camera2StreamConfigurationMap;
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoFpsRangesFor;

    public ObservableFlatMap(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> function, boolean z, int i, int i2) {
        super(observableSource);
        this.Camera2StreamConfigurationMap = function;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = i2;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super U> observer) {
        if (io.reactivex.internal.operators.observable.ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer, this.Camera2StreamConfigurationMap)) {
            return;
        }
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver(observer, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class MergeObserver<T, U> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable, io.reactivex.Observer<T> {
        static final io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[0];
        static final io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] getHighSpeedVideoSizes = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int Camera2StreamConfigurationMap;
        volatile boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.Observer<? super U> getHighSpeedVideoFpsRangesFor;
        long getHighSpeedVideoSizesFor;
        volatile boolean getInputFormats;
        int getInputSizeshNQ4ISI;
        final io.reactivex.internal.util.AtomicThrowable getOutputFormats = new io.reactivex.internal.util.AtomicThrowable();
        final boolean getOutputMinFrameDuration;
        final int getOutputMinFrameDurationlomOqCM;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> getOutputSizes;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<U> getOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[]> getOutputStallDuration;
        io.reactivex.disposables.Disposable getOutputStallDurationlomOqCM;
        long getValidOutputFormatsForInputhNQ4ISI;
        java.util.Queue<io.reactivex.ObservableSource<? extends U>> isOutputSupportedFor;
        int unwrapAs;

        MergeObserver(io.reactivex.Observer<? super U> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> function, boolean z, int i, int i2) {
            this.getHighSpeedVideoFpsRangesFor = observer;
            this.getOutputSizes = function;
            this.getOutputMinFrameDuration = z;
            this.getOutputMinFrameDurationlomOqCM = i;
            this.Camera2StreamConfigurationMap = i2;
            if (i != Integer.MAX_VALUE) {
                this.isOutputSupportedFor = new java.util.ArrayDeque(i);
            }
            this.getOutputStallDuration = new java.util.concurrent.atomic.AtomicReference<>(getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getOutputStallDurationlomOqCM, disposable)) {
                this.getOutputStallDurationlomOqCM = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getInputFormats) {
                return;
            }
            try {
                io.reactivex.ObservableSource<? extends U> observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputSizes.apply(t), "The mapper returned a null ObservableSource");
                if (this.getOutputMinFrameDurationlomOqCM != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i = this.unwrapAs;
                        if (i == this.getOutputMinFrameDurationlomOqCM) {
                            this.isOutputSupportedFor.offer(observableSource);
                            return;
                        }
                        this.unwrapAs = i + 1;
                    }
                }
                Camera2StreamConfigurationMap(observableSource);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getOutputStallDurationlomOqCM.dispose();
                onError(th);
            }
        }

        private void Camera2StreamConfigurationMap(io.reactivex.ObservableSource<? extends U> observableSource) {
            boolean z;
            while (observableSource instanceof java.util.concurrent.Callable) {
                if (!getHighSpeedVideoFpsRanges((java.util.concurrent.Callable) observableSource) || this.getOutputMinFrameDurationlomOqCM == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    observableSource = this.isOutputSupportedFor.poll();
                    if (observableSource == null) {
                        z = true;
                        this.unwrapAs--;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    if (getAndIncrement() == 0) {
                        getHighSpeedVideoFpsRangesFor();
                        return;
                    }
                    return;
                }
            }
            long j = this.getValidOutputFormatsForInputhNQ4ISI;
            this.getValidOutputFormatsForInputhNQ4ISI = 1 + j;
            io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<T, U> innerObserver = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<>(this, j);
            if (getHighSpeedVideoFpsRanges(innerObserver)) {
                observableSource.subscribe(innerObserver);
            }
        }

        private boolean getHighSpeedVideoFpsRanges(io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<T, U> innerObserver) {
            io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr;
            io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[] innerObserverArr2;
            do {
                innerObserverArr = this.getOutputStallDuration.get();
                if (innerObserverArr != getHighSpeedVideoSizes) {
                    int length = innerObserverArr.length;
                    innerObserverArr2 = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[length + 1];
                    java.lang.System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                    innerObserverArr2[length] = innerObserver;
                } else {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(innerObserver);
                    return false;
                }
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputStallDuration, innerObserverArr, innerObserverArr2));
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void getHighResolutionOutputSizeshNQ4ISI(io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<T, U> innerObserver) {
            io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr;
            io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr2;
            do {
                innerObserverArr = this.getOutputStallDuration.get();
                int length = innerObserverArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerObserverArr[i] == innerObserver) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr2 = getHighResolutionOutputSizeshNQ4ISI;
                } else {
                    io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr3 = new io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver[length - 1];
                    java.lang.System.arraycopy(innerObserverArr, 0, innerObserverArr3, 0, i);
                    java.lang.System.arraycopy(innerObserverArr, i + 1, innerObserverArr3, i, (length - i) - 1);
                    innerObserverArr2 = innerObserverArr3;
                }
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputStallDuration, innerObserverArr, innerObserverArr2));
        }

        private boolean getHighSpeedVideoFpsRanges(java.util.concurrent.Callable<? extends U> callable) {
            try {
                U call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.getHighSpeedVideoFpsRangesFor.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue = this.getOutputSizeshNQ4ISI;
                    if (simplePlainQueue == null) {
                        if (this.getOutputMinFrameDurationlomOqCM == Integer.MAX_VALUE) {
                            simplePlainQueue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(this.Camera2StreamConfigurationMap);
                        } else {
                            simplePlainQueue = new io.reactivex.internal.queue.SpscArrayQueue<>(this.getOutputMinFrameDurationlomOqCM);
                        }
                        this.getOutputSizeshNQ4ISI = simplePlainQueue;
                    }
                    if (!simplePlainQueue.offer(call)) {
                        onError(new java.lang.IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                getHighSpeedVideoFpsRangesFor();
                return true;
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getOutputFormats.addThrowable(th);
                if (getAndIncrement() == 0) {
                    getHighSpeedVideoFpsRangesFor();
                }
                return true;
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getInputFormats) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            if (this.getOutputFormats.addThrowable(th)) {
                this.getInputFormats = true;
                if (getAndIncrement() == 0) {
                    getHighSpeedVideoFpsRangesFor();
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getInputFormats) {
                return;
            }
            this.getInputFormats = true;
            if (getAndIncrement() == 0) {
                getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            java.lang.Throwable terminate;
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            if (!getHighSpeedVideoSizes() || (terminate = this.getOutputFormats.terminate()) == null || terminate == io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(terminate);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void getHighSpeedVideoFpsRangesFor() {
            int i;
            io.reactivex.Observer<? super U> observer = this.getHighSpeedVideoFpsRangesFor;
            int i2 = 1;
            while (!getHighSpeedVideoFpsRanges()) {
                io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue = this.getOutputSizeshNQ4ISI;
                if (simplePlainQueue != null) {
                    while (!getHighSpeedVideoFpsRanges()) {
                        U poll = simplePlainQueue.poll();
                        if (poll != null) {
                            observer.onNext(poll);
                        } else if (poll == null) {
                        }
                    }
                    return;
                }
                boolean z = this.getInputFormats;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue2 = this.getOutputSizeshNQ4ISI;
                io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr = this.getOutputStallDuration.get();
                int length = innerObserverArr.length;
                if (this.getOutputMinFrameDurationlomOqCM != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i = this.isOutputSupportedFor.size();
                    }
                } else {
                    i = 0;
                }
                if (z && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0 && i == 0)) {
                    java.lang.Throwable terminate = this.getOutputFormats.terminate();
                    if (terminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                        if (terminate == null) {
                            observer.onComplete();
                            return;
                        } else {
                            observer.onError(terminate);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j = this.getHighSpeedVideoSizesFor;
                    int i3 = this.getInputSizeshNQ4ISI;
                    if (length <= i3 || innerObserverArr[i3].getHighSpeedVideoFpsRanges != j) {
                        if (length <= i3) {
                            i3 = 0;
                        }
                        for (int i4 = 0; i4 < length && innerObserverArr[i3].getHighSpeedVideoFpsRanges != j; i4++) {
                            i3++;
                            if (i3 == length) {
                                i3 = 0;
                            }
                        }
                        this.getInputSizeshNQ4ISI = i3;
                        this.getHighSpeedVideoSizesFor = innerObserverArr[i3].getHighSpeedVideoFpsRanges;
                    }
                    int i5 = 0;
                    boolean z2 = false;
                    while (i5 < length) {
                        if (getHighSpeedVideoFpsRanges()) {
                            return;
                        }
                        io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<T, U> innerObserver = innerObserverArr[i3];
                        while (!getHighSpeedVideoFpsRanges()) {
                            io.reactivex.internal.fuseable.SimpleQueue<U> simpleQueue = innerObserver.getHighSpeedVideoSizes;
                            if (simpleQueue != null) {
                                do {
                                    try {
                                        U poll2 = simpleQueue.poll();
                                        if (poll2 != null) {
                                            observer.onNext(poll2);
                                        } else if (poll2 == null) {
                                        }
                                    } catch (java.lang.Throwable th) {
                                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                        io.reactivex.internal.disposables.DisposableHelper.dispose(innerObserver);
                                        this.getOutputFormats.addThrowable(th);
                                        if (getHighSpeedVideoFpsRanges()) {
                                            return;
                                        }
                                        getHighResolutionOutputSizeshNQ4ISI(innerObserver);
                                        i5++;
                                        z2 = true;
                                    }
                                } while (!getHighSpeedVideoFpsRanges());
                                return;
                            }
                            boolean z3 = innerObserver.getHighResolutionOutputSizeshNQ4ISI;
                            io.reactivex.internal.fuseable.SimpleQueue<U> simpleQueue2 = innerObserver.getHighSpeedVideoSizes;
                            if (z3 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                getHighResolutionOutputSizeshNQ4ISI(innerObserver);
                                if (getHighSpeedVideoFpsRanges()) {
                                    return;
                                } else {
                                    z2 = true;
                                }
                            }
                            i3++;
                            if (i3 == length) {
                                i3 = 0;
                            }
                            i5++;
                        }
                        return;
                    }
                    this.getInputSizeshNQ4ISI = i3;
                    this.getHighSpeedVideoSizesFor = innerObserverArr[i3].getHighSpeedVideoFpsRanges;
                    if (z2) {
                        if (this.getOutputMinFrameDurationlomOqCM != Integer.MAX_VALUE) {
                            synchronized (this) {
                                io.reactivex.ObservableSource<? extends U> poll3 = this.isOutputSupportedFor.poll();
                                if (poll3 == null) {
                                    this.unwrapAs--;
                                } else {
                                    Camera2StreamConfigurationMap(poll3);
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }

        private boolean getHighSpeedVideoFpsRanges() {
            if (this.getHighSpeedVideoFpsRanges) {
                return true;
            }
            java.lang.Throwable th = this.getOutputFormats.get();
            if (this.getOutputMinFrameDuration || th == null) {
                return false;
            }
            getHighSpeedVideoSizes();
            java.lang.Throwable terminate = this.getOutputFormats.terminate();
            if (terminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                this.getHighSpeedVideoFpsRangesFor.onError(terminate);
            }
            return true;
        }

        final boolean getHighSpeedVideoSizes() {
            io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] andSet;
            this.getOutputStallDurationlomOqCM.dispose();
            io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr = this.getOutputStallDuration.get();
            io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr2 = getHighSpeedVideoSizes;
            if (innerObserverArr == innerObserverArr2 || (andSet = this.getOutputStallDuration.getAndSet(innerObserverArr2)) == innerObserverArr2) {
                return false;
            }
            for (io.reactivex.internal.operators.observable.ObservableFlatMap.InnerObserver<?, ?> innerObserver : andSet) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(innerObserver);
            }
            return true;
        }
    }

    /* loaded from: classes17.dex */
    static final class InnerObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        final io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver<T, U> Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        volatile io.reactivex.internal.fuseable.SimpleQueue<U> getHighSpeedVideoSizes;

        InnerObserver(io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver<T, U> mergeObserver, long j) {
            this.getHighSpeedVideoFpsRanges = j;
            this.Camera2StreamConfigurationMap = mergeObserver;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable) && (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable)) {
                io.reactivex.internal.fuseable.QueueDisposable queueDisposable = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
                int requestFusion = queueDisposable.requestFusion(7);
                if (requestFusion != 1) {
                    if (requestFusion == 2) {
                        this.getHighSpeedVideoFpsRangesFor = requestFusion;
                        this.getHighSpeedVideoSizes = queueDisposable;
                        return;
                    }
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor = requestFusion;
                this.getHighSpeedVideoSizes = queueDisposable;
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver<T, U> mergeObserver = this.Camera2StreamConfigurationMap;
                if (mergeObserver.getAndIncrement() == 0) {
                    mergeObserver.getHighSpeedVideoFpsRangesFor();
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(U u) {
            if (this.getHighSpeedVideoFpsRangesFor == 0) {
                io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver<T, U> mergeObserver = this.Camera2StreamConfigurationMap;
                if (mergeObserver.get() == 0 && mergeObserver.compareAndSet(0, 1)) {
                    mergeObserver.getHighSpeedVideoFpsRangesFor.onNext(u);
                    if (mergeObserver.decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    io.reactivex.internal.fuseable.SimpleQueue simpleQueue = this.getHighSpeedVideoSizes;
                    if (simpleQueue == null) {
                        simpleQueue = new io.reactivex.internal.queue.SpscLinkedArrayQueue(mergeObserver.Camera2StreamConfigurationMap);
                        this.getHighSpeedVideoSizes = simpleQueue;
                    }
                    simpleQueue.offer(u);
                    if (mergeObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeObserver.getHighSpeedVideoFpsRangesFor();
                return;
            }
            io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver<T, U> mergeObserver2 = this.Camera2StreamConfigurationMap;
            if (mergeObserver2.getAndIncrement() == 0) {
                mergeObserver2.getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap.getOutputFormats.addThrowable(th)) {
                if (!this.Camera2StreamConfigurationMap.getOutputMinFrameDuration) {
                    this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes();
                }
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver<T, U> mergeObserver = this.Camera2StreamConfigurationMap;
                if (mergeObserver.getAndIncrement() == 0) {
                    mergeObserver.getHighSpeedVideoFpsRangesFor();
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver<T, U> mergeObserver = this.Camera2StreamConfigurationMap;
            if (mergeObserver.getAndIncrement() == 0) {
                mergeObserver.getHighSpeedVideoFpsRangesFor();
            }
        }
    }
}
