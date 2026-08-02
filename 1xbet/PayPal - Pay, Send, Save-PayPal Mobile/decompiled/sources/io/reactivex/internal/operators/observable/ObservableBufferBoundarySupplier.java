package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableBufferBoundarySupplier<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final java.util.concurrent.Callable<U> Camera2StreamConfigurationMap;
    final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> getHighSpeedVideoFpsRangesFor;

    public ObservableBufferBoundarySupplier(io.reactivex.ObservableSource<T> observableSource, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> callable, java.util.concurrent.Callable<U> callable2) {
        super(observableSource);
        this.getHighSpeedVideoFpsRangesFor = callable;
        this.Camera2StreamConfigurationMap = callable2;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super U> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier.BufferBoundarySupplierObserver(new io.reactivex.observers.SerializedObserver(observer), this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class BufferBoundarySupplierObserver<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> Camera2StreamConfigurationMap;
        final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> getHighResolutionOutputSizeshNQ4ISI;
        U getHighSpeedVideoFpsRanges;
        final java.util.concurrent.Callable<U> getHighSpeedVideoFpsRangesFor;
        io.reactivex.disposables.Disposable getInputFormats;

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public final /* synthetic */ void accept(io.reactivex.Observer observer, java.lang.Object obj) {
            this.actual.onNext((java.util.Collection) obj);
        }

        BufferBoundarySupplierObserver(io.reactivex.Observer<? super U> observer, java.util.concurrent.Callable<U> callable, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> callable2) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();
            this.getHighSpeedVideoFpsRangesFor = callable;
            this.getHighResolutionOutputSizeshNQ4ISI = callable2;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getInputFormats, disposable)) {
                this.getInputFormats = disposable;
                io.reactivex.Observer<? super V> observer = this.actual;
                try {
                    this.getHighSpeedVideoFpsRanges = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.call(), "The buffer supplied is null");
                    try {
                        io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.call(), "The boundary ObservableSource supplied is null");
                        io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier.BufferBoundaryObserver bufferBoundaryObserver = new io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier.BufferBoundaryObserver(this);
                        this.Camera2StreamConfigurationMap.set(bufferBoundaryObserver);
                        observer.onSubscribe(this);
                        if (this.cancelled) {
                            return;
                        }
                        observableSource.subscribe(bufferBoundaryObserver);
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.cancelled = true;
                        disposable.dispose();
                        io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
                    }
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    this.cancelled = true;
                    disposable.dispose();
                    io.reactivex.internal.disposables.EmptyDisposable.error(th2, observer);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            synchronized (this) {
                U u = this.getHighSpeedVideoFpsRanges;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            dispose();
            this.actual.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            synchronized (this) {
                U u = this.getHighSpeedVideoFpsRanges;
                if (u == null) {
                    return;
                }
                this.getHighSpeedVideoFpsRanges = null;
                this.queue.offer(u);
                this.done = true;
                if (enter()) {
                    io.reactivex.internal.util.QueueDrainHelper.drainLoop(this.queue, this.actual, false, this, this);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.getInputFormats.dispose();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.Camera2StreamConfigurationMap);
            if (enter()) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            try {
                U u = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.call(), "The buffer supplied is null");
                try {
                    io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.call(), "The boundary ObservableSource supplied is null");
                    io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier.BufferBoundaryObserver bufferBoundaryObserver = new io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier.BufferBoundaryObserver(this);
                    if (io.reactivex.internal.disposables.DisposableHelper.replace(this.Camera2StreamConfigurationMap, bufferBoundaryObserver)) {
                        synchronized (this) {
                            U u2 = this.getHighSpeedVideoFpsRanges;
                            if (u2 == null) {
                                return;
                            }
                            this.getHighSpeedVideoFpsRanges = u;
                            observableSource.subscribe(bufferBoundaryObserver);
                            fastPathEmit(u2, false, this);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.cancelled = true;
                    this.getInputFormats.dispose();
                    this.actual.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                dispose();
                this.actual.onError(th2);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferBoundaryObserver<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.observers.DisposableObserver<B> {
        final io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier.BufferBoundarySupplierObserver<T, U, B> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoSizes;

        BufferBoundaryObserver(io.reactivex.internal.operators.observable.ObservableBufferBoundarySupplier.BufferBoundarySupplierObserver<T, U, B> bufferBoundarySupplierObserver) {
            this.getHighResolutionOutputSizeshNQ4ISI = bufferBoundarySupplierObserver;
        }

        @Override // io.reactivex.Observer
        public final void onNext(B b) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            dispose();
            this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoSizes = true;
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
        }
    }
}
