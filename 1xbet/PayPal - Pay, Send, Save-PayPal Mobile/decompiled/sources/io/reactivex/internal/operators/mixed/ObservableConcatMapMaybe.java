package io.reactivex.internal.operators.mixed;

/* loaded from: classes3.dex */
public final class ObservableConcatMapMaybe<T, R> extends io.reactivex.Observable<R> {
    final io.reactivex.Observable<T> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final io.reactivex.internal.util.ErrorMode getHighSpeedVideoSizes;

    public ObservableConcatMapMaybe(io.reactivex.Observable<T> observable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, io.reactivex.internal.util.ErrorMode errorMode, int i) {
        this.Camera2StreamConfigurationMap = observable;
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.getHighSpeedVideoSizes = errorMode;
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        if (io.reactivex.internal.operators.mixed.ScalarXMapZHelper.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, observer)) {
            return;
        }
        this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe.ConcatMapMaybeMainObserver(observer, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class ConcatMapMaybeMainObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -9140123220065488293L;
        final io.reactivex.Observer<? super R> Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.util.ErrorMode getHighSpeedVideoSizes;
        volatile int getHighSpeedVideoSizesFor;
        R getInputFormats;
        final io.reactivex.internal.fuseable.SimplePlainQueue<T> getInputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> getOutputFormats;
        io.reactivex.disposables.Disposable getOutputStallDuration;
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe.ConcatMapMaybeMainObserver.ConcatMapMaybeObserver<R> getOutputMinFrameDuration = new io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe.ConcatMapMaybeMainObserver.ConcatMapMaybeObserver<>(this);

        ConcatMapMaybeMainObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, int i, io.reactivex.internal.util.ErrorMode errorMode) {
            this.Camera2StreamConfigurationMap = observer;
            this.getOutputFormats = function;
            this.getHighSpeedVideoSizes = errorMode;
            this.getInputSizeshNQ4ISI = new io.reactivex.internal.queue.SpscLinkedArrayQueue(i);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getOutputStallDuration, disposable)) {
                this.getOutputStallDuration = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getInputSizeshNQ4ISI.offer(t);
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor.addThrowable(th)) {
                if (this.getHighSpeedVideoSizes == io.reactivex.internal.util.ErrorMode.IMMEDIATE) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(this.getOutputMinFrameDuration);
                }
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                getHighResolutionOutputSizeshNQ4ISI();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges = true;
            this.getOutputStallDuration.dispose();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getOutputMinFrameDuration);
            if (getAndIncrement() == 0) {
                this.getInputSizeshNQ4ISI.clear();
                this.getInputFormats = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges;
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            if (getAndIncrement() == 0) {
                io.reactivex.Observer<? super R> observer = this.Camera2StreamConfigurationMap;
                io.reactivex.internal.util.ErrorMode errorMode = this.getHighSpeedVideoSizes;
                io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.getInputSizeshNQ4ISI;
                io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.getHighSpeedVideoFpsRangesFor;
                int i = 1;
                while (true) {
                    if (this.getHighSpeedVideoFpsRanges) {
                        simplePlainQueue.clear();
                        this.getInputFormats = null;
                    }
                    int i2 = this.getHighSpeedVideoSizesFor;
                    if (atomicThrowable.get() == null || (errorMode != io.reactivex.internal.util.ErrorMode.IMMEDIATE && (errorMode != io.reactivex.internal.util.ErrorMode.BOUNDARY || i2 != 0))) {
                        if (i2 == 0) {
                            boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
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
                                    io.reactivex.MaybeSource maybeSource = (io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputFormats.apply(poll), "The mapper returned a null MaybeSource");
                                    this.getHighSpeedVideoSizesFor = 1;
                                    maybeSource.subscribe(this.getOutputMinFrameDuration);
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    this.getOutputStallDuration.dispose();
                                    simplePlainQueue.clear();
                                    atomicThrowable.addThrowable(th);
                                    observer.onError(atomicThrowable.terminate());
                                    return;
                                }
                            }
                        } else if (i2 == 2) {
                            R r = this.getInputFormats;
                            this.getInputFormats = null;
                            observer.onNext(r);
                            this.getHighSpeedVideoSizesFor = 0;
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                simplePlainQueue.clear();
                this.getInputFormats = null;
                observer.onError(atomicThrowable.terminate());
            }
        }

        static final class ConcatMapMaybeObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe.ConcatMapMaybeMainObserver<?, R> Camera2StreamConfigurationMap;

            ConcatMapMaybeObserver(io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe.ConcatMapMaybeMainObserver<?, R> concatMapMaybeMainObserver) {
                this.Camera2StreamConfigurationMap = concatMapMaybeMainObserver;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(R r) {
                io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe.ConcatMapMaybeMainObserver<?, R> concatMapMaybeMainObserver = this.Camera2StreamConfigurationMap;
                concatMapMaybeMainObserver.getInputFormats = r;
                concatMapMaybeMainObserver.getHighSpeedVideoSizesFor = 2;
                concatMapMaybeMainObserver.getHighResolutionOutputSizeshNQ4ISI();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe.ConcatMapMaybeMainObserver<?, R> concatMapMaybeMainObserver = this.Camera2StreamConfigurationMap;
                if (concatMapMaybeMainObserver.getHighSpeedVideoFpsRangesFor.addThrowable(th)) {
                    if (concatMapMaybeMainObserver.getHighSpeedVideoSizes != io.reactivex.internal.util.ErrorMode.END) {
                        concatMapMaybeMainObserver.getOutputStallDuration.dispose();
                    }
                    concatMapMaybeMainObserver.getHighSpeedVideoSizesFor = 0;
                    concatMapMaybeMainObserver.getHighResolutionOutputSizeshNQ4ISI();
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe.ConcatMapMaybeMainObserver<?, R> concatMapMaybeMainObserver = this.Camera2StreamConfigurationMap;
                concatMapMaybeMainObserver.getHighSpeedVideoSizesFor = 0;
                concatMapMaybeMainObserver.getHighResolutionOutputSizeshNQ4ISI();
            }
        }
    }
}
