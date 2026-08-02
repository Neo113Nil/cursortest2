package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableConcatMap<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final int Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> getHighSpeedVideoFpsRanges;
    final io.reactivex.internal.util.ErrorMode getHighSpeedVideoFpsRangesFor;

    public ObservableConcatMap(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> function, int i, io.reactivex.internal.util.ErrorMode errorMode) {
        super(observableSource);
        this.getHighSpeedVideoFpsRanges = function;
        this.getHighSpeedVideoFpsRangesFor = errorMode;
        this.Camera2StreamConfigurationMap = java.lang.Math.max(8, i);
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super U> observer) {
        if (io.reactivex.internal.operators.observable.ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer, this.getHighSpeedVideoFpsRanges)) {
            return;
        }
        if (this.getHighSpeedVideoFpsRangesFor == io.reactivex.internal.util.ErrorMode.IMMEDIATE) {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver(new io.reactivex.observers.SerializedObserver(observer), this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap));
        } else {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver(observer, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor == io.reactivex.internal.util.ErrorMode.END));
        }
    }

    /* loaded from: classes17.dex */
    static final class SourceObserver<T, U> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8828587559905699186L;
        volatile boolean Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super U> getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        io.reactivex.internal.fuseable.SimpleQueue<T> getHighSpeedVideoSizesFor;
        final io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver.InnerObserver<U> getInputFormats;
        io.reactivex.disposables.Disposable getInputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> getOutputFormats;
        int getOutputMinFrameDuration;

        SourceObserver(io.reactivex.Observer<? super U> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> function, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.getOutputFormats = function;
            this.getHighSpeedVideoFpsRanges = i;
            this.getInputFormats = new io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver.InnerObserver<>(observer, this);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getInputSizeshNQ4ISI, disposable)) {
                this.getInputSizeshNQ4ISI = disposable;
                if (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable) {
                    io.reactivex.internal.fuseable.QueueDisposable queueDisposable = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(3);
                    if (requestFusion == 1) {
                        this.getOutputMinFrameDuration = requestFusion;
                        this.getHighSpeedVideoSizesFor = queueDisposable;
                        this.getHighSpeedVideoFpsRangesFor = true;
                        this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
                        getHighResolutionOutputSizeshNQ4ISI();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.getOutputMinFrameDuration = requestFusion;
                        this.getHighSpeedVideoSizesFor = queueDisposable;
                        this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
                        return;
                    }
                }
                this.getHighSpeedVideoSizesFor = new io.reactivex.internal.queue.SpscLinkedArrayQueue(this.getHighSpeedVideoFpsRanges);
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            if (this.getOutputMinFrameDuration == 0) {
                this.getHighSpeedVideoSizesFor.offer(t);
            }
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            dispose();
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes = true;
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputFormats);
            this.getInputSizeshNQ4ISI.dispose();
            if (getAndIncrement() == 0) {
                this.getHighSpeedVideoSizesFor.clear();
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            if (getAndIncrement() == 0) {
                while (!this.getHighSpeedVideoSizes) {
                    if (!this.Camera2StreamConfigurationMap) {
                        boolean z = this.getHighSpeedVideoFpsRangesFor;
                        try {
                            T poll = this.getHighSpeedVideoSizesFor.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.getHighSpeedVideoSizes = true;
                                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
                                return;
                            } else if (!z2) {
                                try {
                                    io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputFormats.apply(poll), "The mapper returned a null ObservableSource");
                                    this.Camera2StreamConfigurationMap = true;
                                    observableSource.subscribe(this.getInputFormats);
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    dispose();
                                    this.getHighSpeedVideoSizesFor.clear();
                                    this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                                    return;
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                            dispose();
                            this.getHighSpeedVideoSizesFor.clear();
                            this.getHighResolutionOutputSizeshNQ4ISI.onError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.getHighSpeedVideoSizesFor.clear();
            }
        }

        static final class InnerObserver<U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            final io.reactivex.Observer<? super U> getHighResolutionOutputSizeshNQ4ISI;
            final io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver<?, ?> getHighSpeedVideoSizes;

            InnerObserver(io.reactivex.Observer<? super U> observer, io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver<?, ?> sourceObserver) {
                this.getHighResolutionOutputSizeshNQ4ISI = observer;
                this.getHighSpeedVideoSizes = sourceObserver;
            }

            @Override // io.reactivex.Observer
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.set(this, disposable);
            }

            @Override // io.reactivex.Observer
            public final void onNext(U u) {
                this.getHighResolutionOutputSizeshNQ4ISI.onNext(u);
            }

            @Override // io.reactivex.Observer
            public final void onError(java.lang.Throwable th) {
                this.getHighSpeedVideoSizes.dispose();
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver<?, ?> sourceObserver = this.getHighSpeedVideoSizes;
                sourceObserver.Camera2StreamConfigurationMap = false;
                sourceObserver.getHighResolutionOutputSizeshNQ4ISI();
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class ConcatMapDelayErrorObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -6951100001833242599L;
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final int getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Observer<? super R> getHighSpeedVideoSizes;
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoSizesFor = new io.reactivex.internal.util.AtomicThrowable();
        volatile boolean getInputFormats;
        final io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver.DelayErrorInnerObserver<R> getInputSizeshNQ4ISI;
        io.reactivex.internal.fuseable.SimpleQueue<T> getOutputFormats;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> getOutputMinFrameDuration;
        int getOutputSizeshNQ4ISI;
        final boolean getOutputStallDuration;

        ConcatMapDelayErrorObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> function, int i, boolean z) {
            this.getHighSpeedVideoSizes = observer;
            this.getOutputMinFrameDuration = function;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getOutputStallDuration = z;
            this.getInputSizeshNQ4ISI = new io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver.DelayErrorInnerObserver<>(observer, this);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                if (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable) {
                    io.reactivex.internal.fuseable.QueueDisposable queueDisposable = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(3);
                    if (requestFusion == 1) {
                        this.getOutputSizeshNQ4ISI = requestFusion;
                        this.getOutputFormats = queueDisposable;
                        this.getInputFormats = true;
                        this.getHighSpeedVideoSizes.onSubscribe(this);
                        getHighSpeedVideoSizes();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.getOutputSizeshNQ4ISI = requestFusion;
                        this.getOutputFormats = queueDisposable;
                        this.getHighSpeedVideoSizes.onSubscribe(this);
                        return;
                    }
                }
                this.getOutputFormats = new io.reactivex.internal.queue.SpscLinkedArrayQueue(this.getHighResolutionOutputSizeshNQ4ISI);
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getOutputSizeshNQ4ISI == 0) {
                this.getOutputFormats.offer(t);
            }
            getHighSpeedVideoSizes();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizesFor.addThrowable(th)) {
                this.getInputFormats = true;
                getHighSpeedVideoSizes();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getInputFormats = true;
            getHighSpeedVideoSizes();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor = true;
            this.Camera2StreamConfigurationMap.dispose();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
        }

        final void getHighSpeedVideoSizes() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.Observer<? super R> observer = this.getHighSpeedVideoSizes;
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.getOutputFormats;
            io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.getHighSpeedVideoSizesFor;
            while (true) {
                if (!this.getHighSpeedVideoFpsRanges) {
                    if (this.getHighSpeedVideoFpsRangesFor) {
                        simpleQueue.clear();
                        return;
                    }
                    if (!this.getOutputStallDuration && atomicThrowable.get() != null) {
                        simpleQueue.clear();
                        this.getHighSpeedVideoFpsRangesFor = true;
                        observer.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z = this.getInputFormats;
                    try {
                        T poll = simpleQueue.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            this.getHighSpeedVideoFpsRangesFor = true;
                            java.lang.Throwable terminate = atomicThrowable.terminate();
                            if (terminate != null) {
                                observer.onError(terminate);
                                return;
                            } else {
                                observer.onComplete();
                                return;
                            }
                        }
                        if (!z2) {
                            try {
                                io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputMinFrameDuration.apply(poll), "The mapper returned a null ObservableSource");
                                if (observableSource instanceof java.util.concurrent.Callable) {
                                    try {
                                        a.d dVar = (java.lang.Object) ((java.util.concurrent.Callable) observableSource).call();
                                        if (dVar != null && !this.getHighSpeedVideoFpsRangesFor) {
                                            observer.onNext(dVar);
                                        }
                                    } catch (java.lang.Throwable th) {
                                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                        atomicThrowable.addThrowable(th);
                                    }
                                } else {
                                    this.getHighSpeedVideoFpsRanges = true;
                                    observableSource.subscribe(this.getInputSizeshNQ4ISI);
                                }
                            } catch (java.lang.Throwable th2) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                this.getHighSpeedVideoFpsRangesFor = true;
                                this.Camera2StreamConfigurationMap.dispose();
                                simpleQueue.clear();
                                atomicThrowable.addThrowable(th2);
                                observer.onError(atomicThrowable.terminate());
                                return;
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                        this.getHighSpeedVideoFpsRangesFor = true;
                        this.Camera2StreamConfigurationMap.dispose();
                        atomicThrowable.addThrowable(th3);
                        observer.onError(atomicThrowable.terminate());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        static final class DelayErrorInnerObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            final io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver<?, R> Camera2StreamConfigurationMap;
            final io.reactivex.Observer<? super R> getHighSpeedVideoSizes;

            DelayErrorInnerObserver(io.reactivex.Observer<? super R> observer, io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver) {
                this.getHighSpeedVideoSizes = observer;
                this.Camera2StreamConfigurationMap = concatMapDelayErrorObserver;
            }

            @Override // io.reactivex.Observer
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.Observer
            public final void onNext(R r) {
                this.getHighSpeedVideoSizes.onNext(r);
            }

            @Override // io.reactivex.Observer
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.Camera2StreamConfigurationMap;
                if (concatMapDelayErrorObserver.getHighSpeedVideoSizesFor.addThrowable(th)) {
                    if (!concatMapDelayErrorObserver.getOutputStallDuration) {
                        concatMapDelayErrorObserver.Camera2StreamConfigurationMap.dispose();
                    }
                    concatMapDelayErrorObserver.getHighSpeedVideoFpsRanges = false;
                    concatMapDelayErrorObserver.getHighSpeedVideoSizes();
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                io.reactivex.internal.operators.observable.ObservableConcatMap.ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.Camera2StreamConfigurationMap;
                concatMapDelayErrorObserver.getHighSpeedVideoFpsRanges = false;
                concatMapDelayErrorObserver.getHighSpeedVideoSizes();
            }
        }
    }
}
