package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<TLeft, R> {
    final io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> Camera2StreamConfigurationMap;
    final io.reactivex.ObservableSource<? extends TRight> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> getHighSpeedVideoSizes;

    public ObservableJoin(io.reactivex.ObservableSource<TLeft> observableSource, io.reactivex.ObservableSource<? extends TRight> observableSource2, io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> function, io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> function2, io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
        super(observableSource);
        this.getHighResolutionOutputSizeshNQ4ISI = observableSource2;
        this.getHighSpeedVideoSizes = function;
        this.Camera2StreamConfigurationMap = function2;
        this.getHighSpeedVideoFpsRanges = biFunction;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        io.reactivex.internal.operators.observable.ObservableJoin.JoinDisposable joinDisposable = new io.reactivex.internal.operators.observable.ObservableJoin.JoinDisposable(observer, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
        observer.onSubscribe(joinDisposable);
        io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver leftRightObserver = new io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver(joinDisposable, true);
        joinDisposable.getHighSpeedVideoSizesFor.add(leftRightObserver);
        io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver leftRightObserver2 = new io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver(joinDisposable, false);
        joinDisposable.getHighSpeedVideoSizesFor.add(leftRightObserver2);
        this.source.subscribe(leftRightObserver);
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(leftRightObserver2);
    }

    /* loaded from: classes17.dex */
    static final class JoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable, io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport {
        private static final long serialVersionUID = -6071216598687999801L;
        final io.reactivex.Observer<? super R> getInputFormats;
        volatile boolean getInputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> getOutputMinFrameDuration;
        final io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> getOutputSizes;
        final io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> getOutputStallDuration;
        int getOutputStallDurationlomOqCM;
        int isOutputSupportedForhNQ4ISI;
        static final java.lang.Integer getHighSpeedVideoSizes = 1;
        static final java.lang.Integer getHighResolutionOutputSizeshNQ4ISI = 2;
        static final java.lang.Integer Camera2StreamConfigurationMap = 3;
        static final java.lang.Integer getHighSpeedVideoFpsRangesFor = 4;
        final io.reactivex.disposables.CompositeDisposable getHighSpeedVideoSizesFor = new io.reactivex.disposables.CompositeDisposable();
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> getOutputMinFrameDurationlomOqCM = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(io.reactivex.Observable.bufferSize());
        final java.util.Map<java.lang.Integer, TLeft> getOutputSizeshNQ4ISI = new java.util.LinkedHashMap();
        final java.util.Map<java.lang.Integer, TRight> toString = new java.util.LinkedHashMap();
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> getOutputFormats = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicInteger(2);

        JoinDisposable(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> function, io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> function2, io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
            this.getInputFormats = observer;
            this.getOutputMinFrameDuration = function;
            this.getOutputStallDuration = function2;
            this.getOutputSizes = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getInputSizeshNQ4ISI) {
                return;
            }
            this.getInputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizesFor.dispose();
            if (getAndIncrement() == 0) {
                this.getOutputMinFrameDurationlomOqCM.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getInputSizeshNQ4ISI;
        }

        private void getHighResolutionOutputSizeshNQ4ISI(io.reactivex.Observer<?> observer) {
            java.lang.Throwable terminate = io.reactivex.internal.util.ExceptionHelper.terminate(this.getOutputFormats);
            this.getOutputSizeshNQ4ISI.clear();
            this.toString.clear();
            observer.onError(terminate);
        }

        private void getHighSpeedVideoFpsRanges() {
            if (getAndIncrement() == 0) {
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> spscLinkedArrayQueue = this.getOutputMinFrameDurationlomOqCM;
                io.reactivex.Observer<? super R> observer = this.getInputFormats;
                int i = 1;
                while (!this.getInputSizeshNQ4ISI) {
                    if (this.getOutputFormats.get() != null) {
                        spscLinkedArrayQueue.clear();
                        this.getHighSpeedVideoSizesFor.dispose();
                        getHighResolutionOutputSizeshNQ4ISI(observer);
                        return;
                    }
                    boolean z = this.getHighSpeedVideoFpsRanges.get() == 0;
                    java.lang.Integer num = (java.lang.Integer) spscLinkedArrayQueue.poll();
                    boolean z2 = num == null;
                    if (z && z2) {
                        this.getOutputSizeshNQ4ISI.clear();
                        this.toString.clear();
                        this.getHighSpeedVideoSizesFor.dispose();
                        observer.onComplete();
                        return;
                    }
                    if (!z2) {
                        java.lang.Object poll = spscLinkedArrayQueue.poll();
                        if (num == getHighSpeedVideoSizes) {
                            int i2 = this.getOutputStallDurationlomOqCM;
                            this.getOutputStallDurationlomOqCM = i2 + 1;
                            this.getOutputSizeshNQ4ISI.put(java.lang.Integer.valueOf(i2), poll);
                            try {
                                io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputMinFrameDuration.apply(poll), "The leftEnd returned a null ObservableSource");
                                io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver = new io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver(this, true, i2);
                                this.getHighSpeedVideoSizesFor.add(leftRightEndObserver);
                                observableSource.subscribe(leftRightEndObserver);
                                if (this.getOutputFormats.get() != null) {
                                    spscLinkedArrayQueue.clear();
                                    this.getHighSpeedVideoSizesFor.dispose();
                                    getHighResolutionOutputSizeshNQ4ISI(observer);
                                    return;
                                }
                                java.util.Iterator<TRight> it = this.toString.values().iterator();
                                while (it.hasNext()) {
                                    try {
                                        observer.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputSizes.apply(poll, it.next()), "The resultSelector returned a null value"));
                                    } catch (java.lang.Throwable th) {
                                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                        io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, th);
                                        spscLinkedArrayQueue.clear();
                                        this.getHighSpeedVideoSizesFor.dispose();
                                        getHighResolutionOutputSizeshNQ4ISI(observer);
                                        return;
                                    }
                                }
                            } catch (java.lang.Throwable th2) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, th2);
                                spscLinkedArrayQueue.clear();
                                this.getHighSpeedVideoSizesFor.dispose();
                                getHighResolutionOutputSizeshNQ4ISI(observer);
                                return;
                            }
                        } else if (num == getHighResolutionOutputSizeshNQ4ISI) {
                            int i3 = this.isOutputSupportedForhNQ4ISI;
                            this.isOutputSupportedForhNQ4ISI = i3 + 1;
                            this.toString.put(java.lang.Integer.valueOf(i3), poll);
                            try {
                                io.reactivex.ObservableSource observableSource2 = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputStallDuration.apply(poll), "The rightEnd returned a null ObservableSource");
                                io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver2 = new io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver(this, false, i3);
                                this.getHighSpeedVideoSizesFor.add(leftRightEndObserver2);
                                observableSource2.subscribe(leftRightEndObserver2);
                                if (this.getOutputFormats.get() != null) {
                                    spscLinkedArrayQueue.clear();
                                    this.getHighSpeedVideoSizesFor.dispose();
                                    getHighResolutionOutputSizeshNQ4ISI(observer);
                                    return;
                                }
                                java.util.Iterator<TLeft> it2 = this.getOutputSizeshNQ4ISI.values().iterator();
                                while (it2.hasNext()) {
                                    try {
                                        observer.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputSizes.apply(it2.next(), poll), "The resultSelector returned a null value"));
                                    } catch (java.lang.Throwable th3) {
                                        io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                                        io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, th3);
                                        spscLinkedArrayQueue.clear();
                                        this.getHighSpeedVideoSizesFor.dispose();
                                        getHighResolutionOutputSizeshNQ4ISI(observer);
                                        return;
                                    }
                                }
                            } catch (java.lang.Throwable th4) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
                                io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, th4);
                                spscLinkedArrayQueue.clear();
                                this.getHighSpeedVideoSizesFor.dispose();
                                getHighResolutionOutputSizeshNQ4ISI(observer);
                                return;
                            }
                        } else if (num == Camera2StreamConfigurationMap) {
                            io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver3 = (io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver) poll;
                            this.getOutputSizeshNQ4ISI.remove(java.lang.Integer.valueOf(leftRightEndObserver3.getHighResolutionOutputSizeshNQ4ISI));
                            this.getHighSpeedVideoSizesFor.remove(leftRightEndObserver3);
                        } else {
                            io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver4 = (io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver) poll;
                            this.toString.remove(java.lang.Integer.valueOf(leftRightEndObserver4.getHighResolutionOutputSizeshNQ4ISI));
                            this.getHighSpeedVideoSizesFor.remove(leftRightEndObserver4);
                        }
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                spscLinkedArrayQueue.clear();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void Camera2StreamConfigurationMap(java.lang.Throwable th) {
            if (io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, th)) {
                this.getHighSpeedVideoFpsRanges.decrementAndGet();
                getHighSpeedVideoFpsRanges();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void Camera2StreamConfigurationMap(io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver leftRightObserver) {
            this.getHighSpeedVideoSizesFor.delete(leftRightObserver);
            this.getHighSpeedVideoFpsRanges.decrementAndGet();
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void Camera2StreamConfigurationMap(boolean z, java.lang.Object obj) {
            synchronized (this) {
                this.getOutputMinFrameDurationlomOqCM.offer(z ? getHighSpeedVideoSizes : getHighResolutionOutputSizeshNQ4ISI, obj);
            }
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void getHighResolutionOutputSizeshNQ4ISI(boolean z, io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                this.getOutputMinFrameDurationlomOqCM.offer(z ? Camera2StreamConfigurationMap : getHighSpeedVideoFpsRangesFor, leftRightEndObserver);
            }
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
            if (io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, th)) {
                getHighSpeedVideoFpsRanges();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }
}
