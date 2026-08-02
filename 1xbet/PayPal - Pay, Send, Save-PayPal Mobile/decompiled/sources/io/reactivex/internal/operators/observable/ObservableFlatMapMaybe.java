package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableFlatMapMaybe<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final boolean Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> getHighResolutionOutputSizeshNQ4ISI;

    public ObservableFlatMapMaybe(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, boolean z) {
        super(observableSource);
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableFlatMapMaybe.FlatMapMaybeObserver(observer, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class FlatMapMaybeObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8600231336733376951L;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.Observer<? super R> getHighSpeedVideoFpsRangesFor;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizes;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> getInputFormats;
        final io.reactivex.disposables.CompositeDisposable getOutputFormats = new io.reactivex.disposables.CompositeDisposable();
        final io.reactivex.internal.util.AtomicThrowable getInputSizeshNQ4ISI = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicInteger(1);
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicReference<>();

        FlatMapMaybeObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, boolean z) {
            this.getHighSpeedVideoFpsRangesFor = observer;
            this.getInputFormats = function;
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizes, disposable)) {
                this.getHighSpeedVideoSizes = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            try {
                io.reactivex.MaybeSource maybeSource = (io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getInputFormats.apply(t), "The mapper returned a null MaybeSource");
                this.Camera2StreamConfigurationMap.getAndIncrement();
                io.reactivex.internal.operators.observable.ObservableFlatMapMaybe.FlatMapMaybeObserver.InnerObserver innerObserver = new io.reactivex.internal.operators.observable.ObservableFlatMapMaybe.FlatMapMaybeObserver.InnerObserver();
                if (this.getHighResolutionOutputSizeshNQ4ISI || !this.getOutputFormats.add(innerObserver)) {
                    return;
                }
                maybeSource.subscribe(innerObserver);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoSizes.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.decrementAndGet();
            if (this.getInputSizeshNQ4ISI.addThrowable(th)) {
                if (!this.getHighSpeedVideoFpsRanges) {
                    this.getOutputFormats.dispose();
                }
                if (getAndIncrement() == 0) {
                    Camera2StreamConfigurationMap();
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.Camera2StreamConfigurationMap.decrementAndGet();
            if (getAndIncrement() == 0) {
                Camera2StreamConfigurationMap();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizes.dispose();
            this.getOutputFormats.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        final void Camera2StreamConfigurationMap() {
            io.reactivex.Observer<? super R> observer = this.getHighSpeedVideoFpsRangesFor;
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.Camera2StreamConfigurationMap;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> atomicReference = this.getOutputMinFrameDuration;
            int i = 1;
            while (!this.getHighResolutionOutputSizeshNQ4ISI) {
                if (!this.getHighSpeedVideoFpsRanges && this.getInputSizeshNQ4ISI.get() != null) {
                    java.lang.Throwable terminate = this.getInputSizeshNQ4ISI.terminate();
                    io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.getOutputMinFrameDuration.get();
                    if (spscLinkedArrayQueue != null) {
                        spscLinkedArrayQueue.clear();
                    }
                    observer.onError(terminate);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = atomicReference.get();
                amex.AMEXKernel poll = spscLinkedArrayQueue2 != null ? spscLinkedArrayQueue2.poll() : null;
                boolean z2 = poll == null;
                if (z && z2) {
                    java.lang.Throwable terminate2 = this.getInputSizeshNQ4ISI.terminate();
                    if (terminate2 != null) {
                        observer.onError(terminate2);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                if (!z2) {
                    observer.onNext(poll);
                } else {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
            io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue3 = this.getOutputMinFrameDuration.get();
            if (spscLinkedArrayQueue3 != null) {
                spscLinkedArrayQueue3.clear();
            }
        }

        final class InnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<R>, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = -502562646270949838L;

            InnerObserver() {
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(R r) {
                io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue;
                io.reactivex.internal.operators.observable.ObservableFlatMapMaybe.FlatMapMaybeObserver flatMapMaybeObserver = io.reactivex.internal.operators.observable.ObservableFlatMapMaybe.FlatMapMaybeObserver.this;
                flatMapMaybeObserver.getOutputFormats.delete(this);
                if (flatMapMaybeObserver.get() == 0) {
                    if (flatMapMaybeObserver.compareAndSet(0, 1)) {
                        flatMapMaybeObserver.getHighSpeedVideoFpsRangesFor.onNext(r);
                        boolean z = flatMapMaybeObserver.Camera2StreamConfigurationMap.decrementAndGet() == 0;
                        io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = flatMapMaybeObserver.getOutputMinFrameDuration.get();
                        if (z && (spscLinkedArrayQueue2 == null || spscLinkedArrayQueue2.isEmpty())) {
                            java.lang.Throwable terminate = flatMapMaybeObserver.getInputSizeshNQ4ISI.terminate();
                            if (terminate != null) {
                                flatMapMaybeObserver.getHighSpeedVideoFpsRangesFor.onError(terminate);
                                return;
                            } else {
                                flatMapMaybeObserver.getHighSpeedVideoFpsRangesFor.onComplete();
                                return;
                            }
                        }
                        if (flatMapMaybeObserver.decrementAndGet() == 0) {
                            return;
                        }
                        flatMapMaybeObserver.Camera2StreamConfigurationMap();
                    }
                }
                do {
                    spscLinkedArrayQueue = flatMapMaybeObserver.getOutputMinFrameDuration.get();
                    if (spscLinkedArrayQueue != null) {
                        break;
                    } else {
                        spscLinkedArrayQueue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(io.reactivex.Observable.bufferSize());
                    }
                } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(flatMapMaybeObserver.getOutputMinFrameDuration, null, spscLinkedArrayQueue));
                synchronized (spscLinkedArrayQueue) {
                    spscLinkedArrayQueue.offer(r);
                }
                flatMapMaybeObserver.Camera2StreamConfigurationMap.decrementAndGet();
                if (flatMapMaybeObserver.getAndIncrement() != 0) {
                    return;
                }
                flatMapMaybeObserver.Camera2StreamConfigurationMap();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.observable.ObservableFlatMapMaybe.FlatMapMaybeObserver flatMapMaybeObserver = io.reactivex.internal.operators.observable.ObservableFlatMapMaybe.FlatMapMaybeObserver.this;
                flatMapMaybeObserver.getOutputFormats.delete(this);
                if (flatMapMaybeObserver.getInputSizeshNQ4ISI.addThrowable(th)) {
                    if (!flatMapMaybeObserver.getHighSpeedVideoFpsRanges) {
                        flatMapMaybeObserver.getHighSpeedVideoSizes.dispose();
                        flatMapMaybeObserver.getOutputFormats.dispose();
                    }
                    flatMapMaybeObserver.Camera2StreamConfigurationMap.decrementAndGet();
                    if (flatMapMaybeObserver.getAndIncrement() == 0) {
                        flatMapMaybeObserver.Camera2StreamConfigurationMap();
                        return;
                    }
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.observable.ObservableFlatMapMaybe.FlatMapMaybeObserver flatMapMaybeObserver = io.reactivex.internal.operators.observable.ObservableFlatMapMaybe.FlatMapMaybeObserver.this;
                flatMapMaybeObserver.getOutputFormats.delete(this);
                if (flatMapMaybeObserver.get() == 0) {
                    if (flatMapMaybeObserver.compareAndSet(0, 1)) {
                        boolean z = flatMapMaybeObserver.Camera2StreamConfigurationMap.decrementAndGet() == 0;
                        io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue = flatMapMaybeObserver.getOutputMinFrameDuration.get();
                        if (z && (spscLinkedArrayQueue == null || spscLinkedArrayQueue.isEmpty())) {
                            java.lang.Throwable terminate = flatMapMaybeObserver.getInputSizeshNQ4ISI.terminate();
                            if (terminate != null) {
                                flatMapMaybeObserver.getHighSpeedVideoFpsRangesFor.onError(terminate);
                                return;
                            } else {
                                flatMapMaybeObserver.getHighSpeedVideoFpsRangesFor.onComplete();
                                return;
                            }
                        }
                        if (flatMapMaybeObserver.decrementAndGet() != 0) {
                            flatMapMaybeObserver.Camera2StreamConfigurationMap();
                            return;
                        }
                        return;
                    }
                }
                flatMapMaybeObserver.Camera2StreamConfigurationMap.decrementAndGet();
                if (flatMapMaybeObserver.getAndIncrement() == 0) {
                    flatMapMaybeObserver.Camera2StreamConfigurationMap();
                }
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }
        }
    }
}
