package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableConcatMapEager<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final int Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> getHighSpeedVideoFpsRanges;
    final io.reactivex.internal.util.ErrorMode getHighSpeedVideoFpsRangesFor;

    public ObservableConcatMapEager(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> function, io.reactivex.internal.util.ErrorMode errorMode, int i, int i2) {
        super(observableSource);
        this.getHighSpeedVideoFpsRanges = function;
        this.getHighSpeedVideoFpsRangesFor = errorMode;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = i2;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableConcatMapEager.ConcatMapEagerMainObserver(observer, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class ConcatMapEagerMainObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.internal.observers.InnerQueuedObserverSupport<R> {
        private static final long serialVersionUID = 8080567949447303262L;
        final io.reactivex.Observer<? super R> Camera2StreamConfigurationMap;
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        io.reactivex.internal.observers.InnerQueuedObserver<R> getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final int getInputFormats;
        volatile boolean getInputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> getOutputFormats;
        final io.reactivex.internal.util.ErrorMode getOutputMinFrameDuration;
        int getOutputMinFrameDurationlomOqCM;
        io.reactivex.internal.fuseable.SimpleQueue<T> getOutputSizes;
        final int getOutputSizeshNQ4ISI;
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoSizesFor = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.ArrayDeque<io.reactivex.internal.observers.InnerQueuedObserver<R>> getOutputStallDurationlomOqCM = new java.util.ArrayDeque<>();

        ConcatMapEagerMainObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> function, int i, int i2, io.reactivex.internal.util.ErrorMode errorMode) {
            this.Camera2StreamConfigurationMap = observer;
            this.getOutputFormats = function;
            this.getInputFormats = i;
            this.getOutputSizeshNQ4ISI = i2;
            this.getOutputMinFrameDuration = errorMode;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                if (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable) {
                    io.reactivex.internal.fuseable.QueueDisposable queueDisposable = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(3);
                    if (requestFusion == 1) {
                        this.getOutputMinFrameDurationlomOqCM = requestFusion;
                        this.getOutputSizes = queueDisposable;
                        this.getInputSizeshNQ4ISI = true;
                        this.Camera2StreamConfigurationMap.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.getOutputMinFrameDurationlomOqCM = requestFusion;
                        this.getOutputSizes = queueDisposable;
                        this.Camera2StreamConfigurationMap.onSubscribe(this);
                        return;
                    }
                }
                this.getOutputSizes = new io.reactivex.internal.queue.SpscLinkedArrayQueue(this.getOutputSizeshNQ4ISI);
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getOutputMinFrameDurationlomOqCM == 0) {
                this.getOutputSizes.offer(t);
            }
            drain();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizesFor.addThrowable(th)) {
                this.getInputSizeshNQ4ISI = true;
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getInputSizeshNQ4ISI = true;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes = true;
            if (getAndIncrement() == 0) {
                this.getOutputSizes.clear();
                getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes;
        }

        private void getHighSpeedVideoFpsRangesFor() {
            io.reactivex.internal.observers.InnerQueuedObserver<R> innerQueuedObserver = this.getHighSpeedVideoFpsRangesFor;
            if (innerQueuedObserver != null) {
                innerQueuedObserver.dispose();
            }
            while (true) {
                io.reactivex.internal.observers.InnerQueuedObserver<R> poll = this.getOutputStallDurationlomOqCM.poll();
                if (poll == null) {
                    return;
                } else {
                    poll.dispose();
                }
            }
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public final void innerNext(io.reactivex.internal.observers.InnerQueuedObserver<R> innerQueuedObserver, R r) {
            innerQueuedObserver.queue().offer(r);
            drain();
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public final void innerError(io.reactivex.internal.observers.InnerQueuedObserver<R> innerQueuedObserver, java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizesFor.addThrowable(th)) {
                if (this.getOutputMinFrameDuration == io.reactivex.internal.util.ErrorMode.IMMEDIATE) {
                    this.getHighResolutionOutputSizeshNQ4ISI.dispose();
                }
                innerQueuedObserver.setDone();
                drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public final void innerComplete(io.reactivex.internal.observers.InnerQueuedObserver<R> innerQueuedObserver) {
            innerQueuedObserver.setDone();
            drain();
        }

        @Override // io.reactivex.internal.observers.InnerQueuedObserverSupport
        public final void drain() {
            R poll;
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.getOutputSizes;
            java.util.ArrayDeque<io.reactivex.internal.observers.InnerQueuedObserver<R>> arrayDeque = this.getOutputStallDurationlomOqCM;
            io.reactivex.Observer<? super R> observer = this.Camera2StreamConfigurationMap;
            io.reactivex.internal.util.ErrorMode errorMode = this.getOutputMinFrameDuration;
            int i = 1;
            while (true) {
                int i2 = this.getHighSpeedVideoFpsRanges;
                while (i2 != this.getInputFormats) {
                    if (this.getHighSpeedVideoSizes) {
                        simpleQueue.clear();
                        getHighSpeedVideoFpsRangesFor();
                        return;
                    }
                    if (errorMode == io.reactivex.internal.util.ErrorMode.IMMEDIATE && this.getHighSpeedVideoSizesFor.get() != null) {
                        simpleQueue.clear();
                        getHighSpeedVideoFpsRangesFor();
                        observer.onError(this.getHighSpeedVideoSizesFor.terminate());
                        return;
                    }
                    try {
                        T poll2 = simpleQueue.poll();
                        if (poll2 == null) {
                            break;
                        }
                        io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputFormats.apply(poll2), "The mapper returned a null ObservableSource");
                        io.reactivex.internal.observers.InnerQueuedObserver<R> innerQueuedObserver = new io.reactivex.internal.observers.InnerQueuedObserver<>(this, this.getOutputSizeshNQ4ISI);
                        arrayDeque.offer(innerQueuedObserver);
                        observableSource.subscribe(innerQueuedObserver);
                        i2++;
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.getHighResolutionOutputSizeshNQ4ISI.dispose();
                        simpleQueue.clear();
                        getHighSpeedVideoFpsRangesFor();
                        this.getHighSpeedVideoSizesFor.addThrowable(th);
                        observer.onError(this.getHighSpeedVideoSizesFor.terminate());
                        return;
                    }
                }
                this.getHighSpeedVideoFpsRanges = i2;
                if (this.getHighSpeedVideoSizes) {
                    simpleQueue.clear();
                    getHighSpeedVideoFpsRangesFor();
                    return;
                }
                if (errorMode == io.reactivex.internal.util.ErrorMode.IMMEDIATE && this.getHighSpeedVideoSizesFor.get() != null) {
                    simpleQueue.clear();
                    getHighSpeedVideoFpsRangesFor();
                    observer.onError(this.getHighSpeedVideoSizesFor.terminate());
                    return;
                }
                io.reactivex.internal.observers.InnerQueuedObserver<R> innerQueuedObserver2 = this.getHighSpeedVideoFpsRangesFor;
                if (innerQueuedObserver2 == null) {
                    if (errorMode == io.reactivex.internal.util.ErrorMode.BOUNDARY && this.getHighSpeedVideoSizesFor.get() != null) {
                        simpleQueue.clear();
                        getHighSpeedVideoFpsRangesFor();
                        observer.onError(this.getHighSpeedVideoSizesFor.terminate());
                        return;
                    }
                    boolean z2 = this.getInputSizeshNQ4ISI;
                    io.reactivex.internal.observers.InnerQueuedObserver<R> poll3 = arrayDeque.poll();
                    boolean z3 = poll3 == null;
                    if (z2 && z3) {
                        if (this.getHighSpeedVideoSizesFor.get() != null) {
                            simpleQueue.clear();
                            getHighSpeedVideoFpsRangesFor();
                            observer.onError(this.getHighSpeedVideoSizesFor.terminate());
                            return;
                        }
                        observer.onComplete();
                        return;
                    }
                    if (!z3) {
                        this.getHighSpeedVideoFpsRangesFor = poll3;
                    }
                    innerQueuedObserver2 = poll3;
                }
                if (innerQueuedObserver2 != null) {
                    io.reactivex.internal.fuseable.SimpleQueue<R> queue = innerQueuedObserver2.queue();
                    while (!this.getHighSpeedVideoSizes) {
                        boolean isDone = innerQueuedObserver2.isDone();
                        if (errorMode == io.reactivex.internal.util.ErrorMode.IMMEDIATE && this.getHighSpeedVideoSizesFor.get() != null) {
                            simpleQueue.clear();
                            getHighSpeedVideoFpsRangesFor();
                            observer.onError(this.getHighSpeedVideoSizesFor.terminate());
                            return;
                        }
                        try {
                            poll = queue.poll();
                            z = poll == null;
                        } catch (java.lang.Throwable th2) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                            this.getHighSpeedVideoSizesFor.addThrowable(th2);
                            this.getHighSpeedVideoFpsRangesFor = null;
                            this.getHighSpeedVideoFpsRanges--;
                        }
                        if (isDone && z) {
                            this.getHighSpeedVideoFpsRangesFor = null;
                            this.getHighSpeedVideoFpsRanges--;
                        } else if (!z) {
                            observer.onNext(poll);
                        }
                    }
                    simpleQueue.clear();
                    getHighSpeedVideoFpsRangesFor();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }
}
