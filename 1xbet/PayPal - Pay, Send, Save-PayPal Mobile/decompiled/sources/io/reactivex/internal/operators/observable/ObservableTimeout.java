package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableTimeout<T, U, V> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.ObservableSource<U> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> getHighSpeedVideoFpsRanges;
    final io.reactivex.ObservableSource<? extends T> getHighSpeedVideoSizes;

    /* loaded from: classes17.dex */
    interface TimeoutSelectorSupport extends io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport {
        void getHighResolutionOutputSizeshNQ4ISI(long j, java.lang.Throwable th);
    }

    public ObservableTimeout(io.reactivex.Observable<T> observable, io.reactivex.ObservableSource<U> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<V>> function, io.reactivex.ObservableSource<? extends T> observableSource2) {
        super(observable);
        this.Camera2StreamConfigurationMap = observableSource;
        this.getHighSpeedVideoFpsRanges = function;
        this.getHighSpeedVideoSizes = observableSource2;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        if (this.getHighSpeedVideoSizes == null) {
            io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutObserver timeoutObserver = new io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutObserver(observer, this.getHighSpeedVideoFpsRanges);
            observer.onSubscribe(timeoutObserver);
            io.reactivex.ObservableSource<U> observableSource = this.Camera2StreamConfigurationMap;
            if (observableSource != null) {
                io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutConsumer timeoutConsumer = new io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutConsumer(0L, timeoutObserver);
                if (timeoutObserver.Camera2StreamConfigurationMap.replace(timeoutConsumer)) {
                    observableSource.subscribe(timeoutConsumer);
                }
            }
            this.source.subscribe(timeoutObserver);
            return;
        }
        io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutFallbackObserver timeoutFallbackObserver = new io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutFallbackObserver(observer, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
        observer.onSubscribe(timeoutFallbackObserver);
        io.reactivex.ObservableSource<U> observableSource2 = this.Camera2StreamConfigurationMap;
        if (observableSource2 != null) {
            io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutConsumer timeoutConsumer2 = new io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutConsumer(0L, timeoutFallbackObserver);
            if (timeoutFallbackObserver.getHighSpeedVideoSizes.replace(timeoutConsumer2)) {
                observableSource2.subscribe(timeoutConsumer2);
            }
        }
        this.source.subscribe(timeoutFallbackObserver);
    }

    /* loaded from: classes17.dex */
    static final class TimeoutObserver<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final io.reactivex.internal.disposables.SequentialDisposable Camera2StreamConfigurationMap = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<?>> getHighSpeedVideoFpsRangesFor;

        TimeoutObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<?>> function) {
            this.getHighSpeedVideoFpsRanges = observer;
            this.getHighSpeedVideoFpsRangesFor = function;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighResolutionOutputSizeshNQ4ISI, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    io.reactivex.disposables.Disposable disposable = this.Camera2StreamConfigurationMap.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.getHighSpeedVideoFpsRanges.onNext(t);
                    try {
                        io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutConsumer timeoutConsumer = new io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutConsumer(j2, this);
                        if (this.Camera2StreamConfigurationMap.replace(timeoutConsumer)) {
                            observableSource.subscribe(timeoutConsumer);
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.getHighResolutionOutputSizeshNQ4ISI.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.getHighSpeedVideoFpsRanges.onError(th);
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.Camera2StreamConfigurationMap.dispose();
                this.getHighSpeedVideoFpsRanges.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.Camera2StreamConfigurationMap.dispose();
                this.getHighSpeedVideoFpsRanges.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        public final void getHighSpeedVideoFpsRangesFor(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighResolutionOutputSizeshNQ4ISI);
                this.getHighSpeedVideoFpsRanges.onError(new java.util.concurrent.TimeoutException());
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport
        public final void getHighResolutionOutputSizeshNQ4ISI(long j, java.lang.Throwable th) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighResolutionOutputSizeshNQ4ISI);
                this.getHighSpeedVideoFpsRanges.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighResolutionOutputSizeshNQ4ISI);
            this.Camera2StreamConfigurationMap.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighResolutionOutputSizeshNQ4ISI.get());
        }
    }

    /* loaded from: classes17.dex */
    static final class TimeoutFallbackObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport {
        private static final long serialVersionUID = -7508389464265974549L;
        io.reactivex.ObservableSource<? extends T> Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<?>> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoSizes = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicReference<>();

        TimeoutFallbackObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<?>> function, io.reactivex.ObservableSource<? extends T> observableSource) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.getHighSpeedVideoFpsRangesFor = function;
            this.Camera2StreamConfigurationMap = observableSource;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighSpeedVideoSizesFor, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            long j = this.getHighSpeedVideoFpsRanges.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.getHighSpeedVideoFpsRanges.compareAndSet(j, j2)) {
                    io.reactivex.disposables.Disposable disposable = this.getHighSpeedVideoSizes.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
                    try {
                        io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutConsumer timeoutConsumer = new io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutConsumer(j2, this);
                        if (this.getHighSpeedVideoSizes.replace(timeoutConsumer)) {
                            observableSource.subscribe(timeoutConsumer);
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.getHighSpeedVideoSizesFor.get().dispose();
                        this.getHighSpeedVideoFpsRanges.getAndSet(Long.MAX_VALUE);
                        this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.getHighSpeedVideoSizes.dispose();
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                this.getHighSpeedVideoSizes.dispose();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.getHighSpeedVideoSizes.dispose();
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
                this.getHighSpeedVideoSizes.dispose();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        public final void getHighSpeedVideoFpsRangesFor(long j) {
            if (this.getHighSpeedVideoFpsRanges.compareAndSet(j, Long.MAX_VALUE)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizesFor);
                io.reactivex.ObservableSource<? extends T> observableSource = this.Camera2StreamConfigurationMap;
                this.Camera2StreamConfigurationMap = null;
                observableSource.subscribe(new io.reactivex.internal.operators.observable.ObservableTimeoutTimed.FallbackObserver(this.getHighResolutionOutputSizeshNQ4ISI, this));
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport
        public final void getHighResolutionOutputSizeshNQ4ISI(long j, java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges.compareAndSet(j, Long.MAX_VALUE)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizesFor);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            this.getHighSpeedVideoSizes.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }

    /* loaded from: classes17.dex */
    static final class TimeoutConsumer extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8708641127342403073L;
        final io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport getHighSpeedVideoFpsRangesFor;
        final long getHighSpeedVideoSizes;

        TimeoutConsumer(long j, io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutSelectorSupport timeoutSelectorSupport) {
            this.getHighSpeedVideoSizes = j;
            this.getHighSpeedVideoFpsRangesFor = timeoutSelectorSupport;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(java.lang.Object obj) {
            io.reactivex.disposables.Disposable disposable = (io.reactivex.disposables.Disposable) get();
            if (disposable != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                disposable.dispose();
                lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
                this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
                this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
                this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }
}
