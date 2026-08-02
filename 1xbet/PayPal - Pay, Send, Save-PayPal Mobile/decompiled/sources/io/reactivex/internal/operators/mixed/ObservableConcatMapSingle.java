package io.reactivex.internal.operators.mixed;

/* loaded from: classes3.dex */
public final class ObservableConcatMapSingle<T, R> extends io.reactivex.Observable<R> {
    final io.reactivex.Observable<T> Camera2StreamConfigurationMap;
    final int getHighSpeedVideoFpsRanges;
    final io.reactivex.internal.util.ErrorMode getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> getHighSpeedVideoSizes;

    public ObservableConcatMapSingle(io.reactivex.Observable<T> observable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function, io.reactivex.internal.util.ErrorMode errorMode, int i) {
        this.Camera2StreamConfigurationMap = observable;
        this.getHighSpeedVideoSizes = function;
        this.getHighSpeedVideoFpsRangesFor = errorMode;
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        if (io.reactivex.internal.operators.mixed.ScalarXMapZHelper.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, observer)) {
            return;
        }
        this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.mixed.ObservableConcatMapSingle.ConcatMapSingleMainObserver(observer, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class ConcatMapSingleMainObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -9140123220065488293L;
        final io.reactivex.internal.util.ErrorMode Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super R> getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        R getHighSpeedVideoSizesFor;
        final io.reactivex.internal.fuseable.SimplePlainQueue<T> getInputFormats;
        volatile int getInputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> getOutputMinFrameDuration;
        io.reactivex.disposables.Disposable getOutputSizeshNQ4ISI;
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoFpsRanges = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.internal.operators.mixed.ObservableConcatMapSingle.ConcatMapSingleMainObserver.ConcatMapSingleObserver<R> getOutputFormats = new io.reactivex.internal.operators.mixed.ObservableConcatMapSingle.ConcatMapSingleMainObserver.ConcatMapSingleObserver<>(this);

        ConcatMapSingleMainObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function, int i, io.reactivex.internal.util.ErrorMode errorMode) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.getOutputMinFrameDuration = function;
            this.Camera2StreamConfigurationMap = errorMode;
            this.getInputFormats = new io.reactivex.internal.queue.SpscLinkedArrayQueue(i);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getOutputSizeshNQ4ISI, disposable)) {
                this.getOutputSizeshNQ4ISI = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getInputFormats.offer(t);
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges.addThrowable(th)) {
                if (this.Camera2StreamConfigurationMap == io.reactivex.internal.util.ErrorMode.IMMEDIATE) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(this.getOutputFormats);
                }
                this.getHighSpeedVideoFpsRangesFor = true;
                getHighSpeedVideoFpsRanges();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor = true;
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes = true;
            this.getOutputSizeshNQ4ISI.dispose();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getOutputFormats);
            if (getAndIncrement() == 0) {
                this.getInputFormats.clear();
                this.getHighSpeedVideoSizesFor = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes;
        }

        final void getHighSpeedVideoFpsRanges() {
            if (getAndIncrement() == 0) {
                io.reactivex.Observer<? super R> observer = this.getHighResolutionOutputSizeshNQ4ISI;
                io.reactivex.internal.util.ErrorMode errorMode = this.Camera2StreamConfigurationMap;
                io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.getInputFormats;
                io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.getHighSpeedVideoFpsRanges;
                int i = 1;
                while (true) {
                    if (this.getHighSpeedVideoSizes) {
                        simplePlainQueue.clear();
                        this.getHighSpeedVideoSizesFor = null;
                    }
                    int i2 = this.getInputSizeshNQ4ISI;
                    if (atomicThrowable.get() == null || (errorMode != io.reactivex.internal.util.ErrorMode.IMMEDIATE && (errorMode != io.reactivex.internal.util.ErrorMode.BOUNDARY || i2 != 0))) {
                        if (i2 == 0) {
                            boolean z = this.getHighSpeedVideoFpsRangesFor;
                            T poll = simplePlainQueue.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                java.lang.Throwable terminate = atomicThrowable.terminate();
                                if (terminate == null) {
                                    observer.onComplete();
                                    return;
                                } else {
                                    observer.onError(terminate);
                                    return;
                                }
                            }
                            if (!z2) {
                                try {
                                    io.reactivex.SingleSource singleSource = (io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputMinFrameDuration.apply(poll), "The mapper returned a null SingleSource");
                                    this.getInputSizeshNQ4ISI = 1;
                                    singleSource.subscribe(this.getOutputFormats);
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    this.getOutputSizeshNQ4ISI.dispose();
                                    simplePlainQueue.clear();
                                    atomicThrowable.addThrowable(th);
                                    observer.onError(atomicThrowable.terminate());
                                    return;
                                }
                            }
                        } else if (i2 == 2) {
                            R r = this.getHighSpeedVideoSizesFor;
                            this.getHighSpeedVideoSizesFor = null;
                            observer.onNext(r);
                            this.getInputSizeshNQ4ISI = 0;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                simplePlainQueue.clear();
                this.getHighSpeedVideoSizesFor = null;
                observer.onError(atomicThrowable.terminate());
            }
        }

        static final class ConcatMapSingleObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final io.reactivex.internal.operators.mixed.ObservableConcatMapSingle.ConcatMapSingleMainObserver<?, R> getHighSpeedVideoSizes;

            ConcatMapSingleObserver(io.reactivex.internal.operators.mixed.ObservableConcatMapSingle.ConcatMapSingleMainObserver<?, R> concatMapSingleMainObserver) {
                this.getHighSpeedVideoSizes = concatMapSingleMainObserver;
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(R r) {
                io.reactivex.internal.operators.mixed.ObservableConcatMapSingle.ConcatMapSingleMainObserver<?, R> concatMapSingleMainObserver = this.getHighSpeedVideoSizes;
                concatMapSingleMainObserver.getHighSpeedVideoSizesFor = r;
                concatMapSingleMainObserver.getInputSizeshNQ4ISI = 2;
                concatMapSingleMainObserver.getHighSpeedVideoFpsRanges();
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.mixed.ObservableConcatMapSingle.ConcatMapSingleMainObserver<?, R> concatMapSingleMainObserver = this.getHighSpeedVideoSizes;
                if (concatMapSingleMainObserver.getHighSpeedVideoFpsRanges.addThrowable(th)) {
                    if (concatMapSingleMainObserver.Camera2StreamConfigurationMap != io.reactivex.internal.util.ErrorMode.END) {
                        concatMapSingleMainObserver.getOutputSizeshNQ4ISI.dispose();
                    }
                    concatMapSingleMainObserver.getInputSizeshNQ4ISI = 0;
                    concatMapSingleMainObserver.getHighSpeedVideoFpsRanges();
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }
}
