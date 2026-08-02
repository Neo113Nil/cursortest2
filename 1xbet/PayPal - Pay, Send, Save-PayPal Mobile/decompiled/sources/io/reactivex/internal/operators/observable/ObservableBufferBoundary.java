package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableBufferBoundary<T, U extends java.util.Collection<? super T>, Open, Close> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final io.reactivex.functions.Function<? super Open, ? extends io.reactivex.ObservableSource<? extends Close>> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.ObservableSource<? extends Open> getHighSpeedVideoFpsRanges;
    final java.util.concurrent.Callable<U> getHighSpeedVideoFpsRangesFor;

    public ObservableBufferBoundary(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<? extends Open> observableSource2, io.reactivex.functions.Function<? super Open, ? extends io.reactivex.ObservableSource<? extends Close>> function, java.util.concurrent.Callable<U> callable) {
        super(observableSource);
        this.getHighSpeedVideoFpsRanges = observableSource2;
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.getHighSpeedVideoFpsRangesFor = callable;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super U> observer) {
        io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver bufferBoundaryObserver = new io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver(observer, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
        observer.onSubscribe(bufferBoundaryObserver);
        this.source.subscribe(bufferBoundaryObserver);
    }

    /* loaded from: classes17.dex */
    static final class BufferBoundaryObserver<T, C extends java.util.Collection<? super T>, Open, Close> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8466418554264089604L;
        final io.reactivex.functions.Function<? super Open, ? extends io.reactivex.ObservableSource<? extends Close>> getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.Callable<C> getHighSpeedVideoFpsRanges;
        final io.reactivex.ObservableSource<? extends Open> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Observer<? super C> getHighSpeedVideoSizes;
        volatile boolean getInputFormats;
        long getInputSizeshNQ4ISI;
        volatile boolean getOutputMinFrameDuration;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<C> getOutputStallDurationlomOqCM = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(io.reactivex.Observable.bufferSize());
        final io.reactivex.disposables.CompositeDisposable getOutputFormats = new io.reactivex.disposables.CompositeDisposable();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
        java.util.Map<java.lang.Long, C> Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoSizesFor = new io.reactivex.internal.util.AtomicThrowable();

        BufferBoundaryObserver(io.reactivex.Observer<? super C> observer, io.reactivex.ObservableSource<? extends Open> observableSource, io.reactivex.functions.Function<? super Open, ? extends io.reactivex.ObservableSource<? extends Close>> function, java.util.concurrent.Callable<C> callable) {
            this.getHighSpeedVideoSizes = observer;
            this.getHighSpeedVideoFpsRanges = callable;
            this.getHighSpeedVideoFpsRangesFor = observableSource;
            this.getHighResolutionOutputSizeshNQ4ISI = function;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getOutputSizeshNQ4ISI, disposable)) {
                io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver.BufferOpenObserver bufferOpenObserver = new io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver.BufferOpenObserver(this);
                this.getOutputFormats.add(bufferOpenObserver);
                this.getHighSpeedVideoFpsRangesFor.subscribe(bufferOpenObserver);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            synchronized (this) {
                java.util.Map<java.lang.Long, C> map = this.Camera2StreamConfigurationMap;
                if (map == null) {
                    return;
                }
                java.util.Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizesFor.addThrowable(th)) {
                this.getOutputFormats.dispose();
                synchronized (this) {
                    this.Camera2StreamConfigurationMap = null;
                }
                this.getInputFormats = true;
                Camera2StreamConfigurationMap();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getOutputFormats.dispose();
            synchronized (this) {
                java.util.Map<java.lang.Long, C> map = this.Camera2StreamConfigurationMap;
                if (map == null) {
                    return;
                }
                java.util.Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    this.getOutputStallDurationlomOqCM.offer(it.next());
                }
                this.Camera2StreamConfigurationMap = null;
                this.getInputFormats = true;
                Camera2StreamConfigurationMap();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (io.reactivex.internal.disposables.DisposableHelper.dispose(this.getOutputSizeshNQ4ISI)) {
                this.getOutputMinFrameDuration = true;
                this.getOutputFormats.dispose();
                synchronized (this) {
                    this.Camera2StreamConfigurationMap = null;
                }
                if (getAndIncrement() != 0) {
                    this.getOutputStallDurationlomOqCM.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getOutputSizeshNQ4ISI.get());
        }

        final void getHighSpeedVideoSizes(io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferCloseObserver<T, C> bufferCloseObserver, long j) {
            boolean z;
            this.getOutputFormats.delete(bufferCloseObserver);
            if (this.getOutputFormats.size() == 0) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getOutputSizeshNQ4ISI);
                z = true;
            } else {
                z = false;
            }
            synchronized (this) {
                java.util.Map<java.lang.Long, C> map = this.Camera2StreamConfigurationMap;
                if (map == null) {
                    return;
                }
                this.getOutputStallDurationlomOqCM.offer(map.remove(java.lang.Long.valueOf(j)));
                if (z) {
                    this.getInputFormats = true;
                }
                Camera2StreamConfigurationMap();
            }
        }

        final void Camera2StreamConfigurationMap() {
            if (getAndIncrement() == 0) {
                io.reactivex.Observer<? super C> observer = this.getHighSpeedVideoSizes;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<C> spscLinkedArrayQueue = this.getOutputStallDurationlomOqCM;
                int i = 1;
                while (!this.getOutputMinFrameDuration) {
                    boolean z = this.getInputFormats;
                    if (z && this.getHighSpeedVideoSizesFor.get() != null) {
                        spscLinkedArrayQueue.clear();
                        observer.onError(this.getHighSpeedVideoSizesFor.terminate());
                        return;
                    }
                    C poll = spscLinkedArrayQueue.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        observer.onComplete();
                        return;
                    } else if (!z2) {
                        observer.onNext(poll);
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

        static final class BufferOpenObserver<Open> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<Open>, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = -8498650778633225126L;
            final io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver<?, ?, Open, ?> getHighResolutionOutputSizeshNQ4ISI;

            BufferOpenObserver(io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver<?, ?, Open, ?> bufferBoundaryObserver) {
                this.getHighResolutionOutputSizeshNQ4ISI = bufferBoundaryObserver;
            }

            @Override // io.reactivex.Observer
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.Observer
            public final void onNext(Open open) {
                io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver<?, ?, Open, ?> bufferBoundaryObserver = this.getHighResolutionOutputSizeshNQ4ISI;
                try {
                    java.util.Collection collection = (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(bufferBoundaryObserver.getHighSpeedVideoFpsRanges.call(), "The bufferSupplier returned a null Collection");
                    io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(bufferBoundaryObserver.getHighResolutionOutputSizeshNQ4ISI.apply(open), "The bufferClose returned a null ObservableSource");
                    long j = bufferBoundaryObserver.getInputSizeshNQ4ISI;
                    bufferBoundaryObserver.getInputSizeshNQ4ISI = 1 + j;
                    synchronized (bufferBoundaryObserver) {
                        java.util.Map<java.lang.Long, ?> map = bufferBoundaryObserver.Camera2StreamConfigurationMap;
                        if (map == null) {
                            return;
                        }
                        map.put(java.lang.Long.valueOf(j), collection);
                        io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferCloseObserver bufferCloseObserver = new io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferCloseObserver(bufferBoundaryObserver, j);
                        bufferBoundaryObserver.getOutputFormats.add(bufferCloseObserver);
                        observableSource.subscribe(bufferCloseObserver);
                    }
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.internal.disposables.DisposableHelper.dispose(bufferBoundaryObserver.getOutputSizeshNQ4ISI);
                    bufferBoundaryObserver.onError(th);
                }
            }

            @Override // io.reactivex.Observer
            public final void onError(java.lang.Throwable th) {
                lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
                io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver<?, ?, Open, ?> bufferBoundaryObserver = this.getHighResolutionOutputSizeshNQ4ISI;
                io.reactivex.internal.disposables.DisposableHelper.dispose(bufferBoundaryObserver.getOutputSizeshNQ4ISI);
                bufferBoundaryObserver.getOutputFormats.delete(this);
                bufferBoundaryObserver.onError(th);
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
                io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver<?, ?, Open, ?> bufferBoundaryObserver = this.getHighResolutionOutputSizeshNQ4ISI;
                bufferBoundaryObserver.getOutputFormats.delete(this);
                if (bufferBoundaryObserver.getOutputFormats.size() == 0) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(bufferBoundaryObserver.getOutputSizeshNQ4ISI);
                    bufferBoundaryObserver.getInputFormats = true;
                    bufferBoundaryObserver.Camera2StreamConfigurationMap();
                }
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferCloseObserver<T, C extends java.util.Collection<? super T>> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8498650778633225126L;
        final io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver<T, C, ?, ?> Camera2StreamConfigurationMap;
        final long getHighResolutionOutputSizeshNQ4ISI;

        BufferCloseObserver(io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver<T, C, ?, ?> bufferBoundaryObserver, long j) {
            this.Camera2StreamConfigurationMap = bufferBoundaryObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(java.lang.Object obj) {
            io.reactivex.disposables.Disposable disposable = get();
            if (disposable != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
                disposable.dispose();
                this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(this, this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
                io.reactivex.internal.operators.observable.ObservableBufferBoundary.BufferBoundaryObserver<T, C, ?, ?> bufferBoundaryObserver = this.Camera2StreamConfigurationMap;
                io.reactivex.internal.disposables.DisposableHelper.dispose(bufferBoundaryObserver.getOutputSizeshNQ4ISI);
                bufferBoundaryObserver.getOutputFormats.delete(this);
                bufferBoundaryObserver.onError(th);
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
                this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(this, this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }
    }
}
