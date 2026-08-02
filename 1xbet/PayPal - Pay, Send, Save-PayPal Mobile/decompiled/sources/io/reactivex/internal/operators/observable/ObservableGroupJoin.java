package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<TLeft, R> {
    final io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Observable<TRight>, ? extends R> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.ObservableSource<? extends TRight> getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> getHighSpeedVideoFpsRangesFor;

    /* loaded from: classes17.dex */
    interface JoinSupport {
        void Camera2StreamConfigurationMap(io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver leftRightObserver);

        void Camera2StreamConfigurationMap(java.lang.Throwable th);

        void Camera2StreamConfigurationMap(boolean z, java.lang.Object obj);

        void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th);

        void getHighResolutionOutputSizeshNQ4ISI(boolean z, io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver);
    }

    public ObservableGroupJoin(io.reactivex.ObservableSource<TLeft> observableSource, io.reactivex.ObservableSource<? extends TRight> observableSource2, io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> function, io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> function2, io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Observable<TRight>, ? extends R> biFunction) {
        super(observableSource);
        this.getHighSpeedVideoFpsRanges = observableSource2;
        this.getHighSpeedVideoFpsRangesFor = function;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.Camera2StreamConfigurationMap = biFunction;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable groupJoinDisposable = new io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable(observer, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
        observer.onSubscribe(groupJoinDisposable);
        io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver leftRightObserver = new io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver(groupJoinDisposable, true);
        groupJoinDisposable.getInputFormats.add(leftRightObserver);
        io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver leftRightObserver2 = new io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver(groupJoinDisposable, false);
        groupJoinDisposable.getInputFormats.add(leftRightObserver2);
        this.source.subscribe(leftRightObserver);
        this.getHighSpeedVideoFpsRanges.subscribe(leftRightObserver2);
    }

    /* loaded from: classes17.dex */
    static final class GroupJoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable, io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport {
        private static final long serialVersionUID = -6071216598687999801L;
        final io.reactivex.Observer<? super R> getHighSpeedVideoSizesFor;
        volatile boolean getInputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> getOutputMinFrameDuration;
        final io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Observable<TRight>, ? extends R> getOutputSizes;
        final io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> getOutputStallDuration;
        int getOutputStallDurationlomOqCM;
        int unwrapAs;
        static final java.lang.Integer getHighSpeedVideoSizes = 1;
        static final java.lang.Integer getHighResolutionOutputSizeshNQ4ISI = 2;
        static final java.lang.Integer getHighSpeedVideoFpsRanges = 3;
        static final java.lang.Integer getHighSpeedVideoFpsRangesFor = 4;
        final io.reactivex.disposables.CompositeDisposable getInputFormats = new io.reactivex.disposables.CompositeDisposable();
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> getOutputSizeshNQ4ISI = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(io.reactivex.Observable.bufferSize());
        final java.util.Map<java.lang.Integer, io.reactivex.subjects.UnicastSubject<TRight>> getOutputMinFrameDurationlomOqCM = new java.util.LinkedHashMap();
        final java.util.Map<java.lang.Integer, TRight> isOutputSupportedFor = new java.util.LinkedHashMap();
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> getOutputFormats = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicInteger(2);

        GroupJoinDisposable(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super TLeft, ? extends io.reactivex.ObservableSource<TLeftEnd>> function, io.reactivex.functions.Function<? super TRight, ? extends io.reactivex.ObservableSource<TRightEnd>> function2, io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Observable<TRight>, ? extends R> biFunction) {
            this.getHighSpeedVideoSizesFor = observer;
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
            this.getInputFormats.dispose();
            if (getAndIncrement() == 0) {
                this.getOutputSizeshNQ4ISI.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getInputSizeshNQ4ISI;
        }

        private void getHighSpeedVideoFpsRanges(io.reactivex.Observer<?> observer) {
            java.lang.Throwable terminate = io.reactivex.internal.util.ExceptionHelper.terminate(this.getOutputFormats);
            java.util.Iterator<io.reactivex.subjects.UnicastSubject<TRight>> it = this.getOutputMinFrameDurationlomOqCM.values().iterator();
            while (it.hasNext()) {
                it.next().onError(terminate);
            }
            this.getOutputMinFrameDurationlomOqCM.clear();
            this.isOutputSupportedFor.clear();
            observer.onError(terminate);
        }

        private void getHighSpeedVideoSizes() {
            if (getAndIncrement() == 0) {
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> spscLinkedArrayQueue = this.getOutputSizeshNQ4ISI;
                io.reactivex.Observer<? super R> observer = this.getHighSpeedVideoSizesFor;
                int i = 1;
                while (!this.getInputSizeshNQ4ISI) {
                    if (this.getOutputFormats.get() != null) {
                        spscLinkedArrayQueue.clear();
                        this.getInputFormats.dispose();
                        getHighSpeedVideoFpsRanges(observer);
                        return;
                    }
                    boolean z = this.Camera2StreamConfigurationMap.get() == 0;
                    java.lang.Integer num = (java.lang.Integer) spscLinkedArrayQueue.poll();
                    boolean z2 = num == null;
                    if (z && z2) {
                        java.util.Iterator<io.reactivex.subjects.UnicastSubject<TRight>> it = this.getOutputMinFrameDurationlomOqCM.values().iterator();
                        while (it.hasNext()) {
                            it.next().onComplete();
                        }
                        this.getOutputMinFrameDurationlomOqCM.clear();
                        this.isOutputSupportedFor.clear();
                        this.getInputFormats.dispose();
                        observer.onComplete();
                        return;
                    }
                    if (!z2) {
                        java.lang.Object poll = spscLinkedArrayQueue.poll();
                        if (num == getHighSpeedVideoSizes) {
                            io.reactivex.subjects.UnicastSubject create = io.reactivex.subjects.UnicastSubject.create();
                            int i2 = this.getOutputStallDurationlomOqCM;
                            this.getOutputStallDurationlomOqCM = i2 + 1;
                            this.getOutputMinFrameDurationlomOqCM.put(java.lang.Integer.valueOf(i2), create);
                            try {
                                io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputMinFrameDuration.apply(poll), "The leftEnd returned a null ObservableSource");
                                io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver = new io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver(this, true, i2);
                                this.getInputFormats.add(leftRightEndObserver);
                                observableSource.subscribe(leftRightEndObserver);
                                if (this.getOutputFormats.get() != null) {
                                    spscLinkedArrayQueue.clear();
                                    this.getInputFormats.dispose();
                                    getHighSpeedVideoFpsRanges(observer);
                                    return;
                                }
                                try {
                                    observer.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputSizes.apply(poll, create), "The resultSelector returned a null value"));
                                    java.util.Iterator<TRight> it2 = this.isOutputSupportedFor.values().iterator();
                                    while (it2.hasNext()) {
                                        create.onNext(it2.next());
                                    }
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, th);
                                    spscLinkedArrayQueue.clear();
                                    this.getInputFormats.dispose();
                                    getHighSpeedVideoFpsRanges(observer);
                                    return;
                                }
                            } catch (java.lang.Throwable th2) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, th2);
                                spscLinkedArrayQueue.clear();
                                this.getInputFormats.dispose();
                                getHighSpeedVideoFpsRanges(observer);
                                return;
                            }
                        } else if (num == getHighResolutionOutputSizeshNQ4ISI) {
                            int i3 = this.unwrapAs;
                            this.unwrapAs = i3 + 1;
                            this.isOutputSupportedFor.put(java.lang.Integer.valueOf(i3), poll);
                            try {
                                io.reactivex.ObservableSource observableSource2 = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputStallDuration.apply(poll), "The rightEnd returned a null ObservableSource");
                                io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver2 = new io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver(this, false, i3);
                                this.getInputFormats.add(leftRightEndObserver2);
                                observableSource2.subscribe(leftRightEndObserver2);
                                if (this.getOutputFormats.get() != null) {
                                    spscLinkedArrayQueue.clear();
                                    this.getInputFormats.dispose();
                                    getHighSpeedVideoFpsRanges(observer);
                                    return;
                                } else {
                                    java.util.Iterator<io.reactivex.subjects.UnicastSubject<TRight>> it3 = this.getOutputMinFrameDurationlomOqCM.values().iterator();
                                    while (it3.hasNext()) {
                                        it3.next().onNext(poll);
                                    }
                                }
                            } catch (java.lang.Throwable th3) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                                io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, th3);
                                spscLinkedArrayQueue.clear();
                                this.getInputFormats.dispose();
                                getHighSpeedVideoFpsRanges(observer);
                                return;
                            }
                        } else if (num == getHighSpeedVideoFpsRanges) {
                            io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver3 = (io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver) poll;
                            io.reactivex.subjects.UnicastSubject<TRight> remove = this.getOutputMinFrameDurationlomOqCM.remove(java.lang.Integer.valueOf(leftRightEndObserver3.getHighResolutionOutputSizeshNQ4ISI));
                            this.getInputFormats.remove(leftRightEndObserver3);
                            if (remove != null) {
                                remove.onComplete();
                            }
                        } else if (num == getHighSpeedVideoFpsRangesFor) {
                            io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver4 = (io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver) poll;
                            this.isOutputSupportedFor.remove(java.lang.Integer.valueOf(leftRightEndObserver4.getHighResolutionOutputSizeshNQ4ISI));
                            this.getInputFormats.remove(leftRightEndObserver4);
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
                this.Camera2StreamConfigurationMap.decrementAndGet();
                getHighSpeedVideoSizes();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void Camera2StreamConfigurationMap(io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightObserver leftRightObserver) {
            this.getInputFormats.delete(leftRightObserver);
            this.Camera2StreamConfigurationMap.decrementAndGet();
            getHighSpeedVideoSizes();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void Camera2StreamConfigurationMap(boolean z, java.lang.Object obj) {
            synchronized (this) {
                this.getOutputSizeshNQ4ISI.offer(z ? getHighSpeedVideoSizes : getHighResolutionOutputSizeshNQ4ISI, obj);
            }
            getHighSpeedVideoSizes();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void getHighResolutionOutputSizeshNQ4ISI(boolean z, io.reactivex.internal.operators.observable.ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                this.getOutputSizeshNQ4ISI.offer(z ? getHighSpeedVideoFpsRanges : getHighSpeedVideoFpsRangesFor, leftRightEndObserver);
            }
            getHighSpeedVideoSizes();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
            if (io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, th)) {
                getHighSpeedVideoSizes();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class LeftRightObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport Camera2StreamConfigurationMap;
        final boolean getHighSpeedVideoFpsRanges;

        LeftRightObserver(io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport joinSupport, boolean z) {
            this.Camera2StreamConfigurationMap = joinSupport;
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(java.lang.Object obj) {
            this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, obj);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(this);
        }
    }

    /* loaded from: classes17.dex */
    static final class LeftRightEndObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport Camera2StreamConfigurationMap;
        final int getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRangesFor;

        LeftRightEndObserver(io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport joinSupport, boolean z, int i) {
            this.Camera2StreamConfigurationMap = joinSupport;
            this.getHighSpeedVideoFpsRangesFor = z;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(java.lang.Object obj) {
            if (io.reactivex.internal.disposables.DisposableHelper.dispose(this)) {
                this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this);
        }
    }
}
