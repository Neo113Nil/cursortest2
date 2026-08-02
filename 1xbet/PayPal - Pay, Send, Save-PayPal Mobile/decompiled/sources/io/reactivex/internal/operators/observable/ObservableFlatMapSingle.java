package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableFlatMapSingle<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> getHighSpeedVideoFpsRanges;

    public ObservableFlatMapSingle(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function, boolean z) {
        super(observableSource);
        this.getHighSpeedVideoFpsRanges = function;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableFlatMapSingle.FlatMapSingleObserver(observer, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class FlatMapSingleObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8600231336733376951L;
        final io.reactivex.Observer<? super R> Camera2StreamConfigurationMap;
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoSizes;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> getHighSpeedVideoSizesFor;
        final io.reactivex.disposables.CompositeDisposable getInputSizeshNQ4ISI = new io.reactivex.disposables.CompositeDisposable();
        final io.reactivex.internal.util.AtomicThrowable getInputFormats = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicInteger(1);
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicReference<>();

        FlatMapSingleObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function, boolean z) {
            this.Camera2StreamConfigurationMap = observer;
            this.getHighSpeedVideoSizesFor = function;
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            try {
                io.reactivex.SingleSource singleSource = (io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizesFor.apply(t), "The mapper returned a null SingleSource");
                this.getHighSpeedVideoFpsRangesFor.getAndIncrement();
                io.reactivex.internal.operators.observable.ObservableFlatMapSingle.FlatMapSingleObserver.InnerObserver innerObserver = new io.reactivex.internal.operators.observable.ObservableFlatMapSingle.FlatMapSingleObserver.InnerObserver();
                if (this.getHighSpeedVideoSizes || !this.getInputSizeshNQ4ISI.add(innerObserver)) {
                    return;
                }
                singleSource.subscribe(innerObserver);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighResolutionOutputSizeshNQ4ISI.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.decrementAndGet();
            if (this.getInputFormats.addThrowable(th)) {
                if (!this.getHighSpeedVideoFpsRanges) {
                    this.getInputSizeshNQ4ISI.dispose();
                }
                if (getAndIncrement() == 0) {
                    getHighSpeedVideoFpsRangesFor();
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor.decrementAndGet();
            if (getAndIncrement() == 0) {
                getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes = true;
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
            this.getInputSizeshNQ4ISI.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes;
        }

        final void getHighSpeedVideoFpsRangesFor() {
            io.reactivex.Observer<? super R> observer = this.Camera2StreamConfigurationMap;
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.getHighSpeedVideoFpsRangesFor;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> atomicReference = this.getOutputMinFrameDuration;
            int i = 1;
            while (!this.getHighSpeedVideoSizes) {
                if (!this.getHighSpeedVideoFpsRanges && this.getInputFormats.get() != null) {
                    java.lang.Throwable terminate = this.getInputFormats.terminate();
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
                    java.lang.Throwable terminate2 = this.getInputFormats.terminate();
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

        final class InnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<R>, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = -502562646270949838L;

            InnerObserver() {
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(R r) {
                io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue;
                io.reactivex.internal.operators.observable.ObservableFlatMapSingle.FlatMapSingleObserver flatMapSingleObserver = io.reactivex.internal.operators.observable.ObservableFlatMapSingle.FlatMapSingleObserver.this;
                flatMapSingleObserver.getInputSizeshNQ4ISI.delete(this);
                if (flatMapSingleObserver.get() == 0) {
                    if (flatMapSingleObserver.compareAndSet(0, 1)) {
                        flatMapSingleObserver.Camera2StreamConfigurationMap.onNext(r);
                        boolean z = flatMapSingleObserver.getHighSpeedVideoFpsRangesFor.decrementAndGet() == 0;
                        io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = flatMapSingleObserver.getOutputMinFrameDuration.get();
                        if (z && (spscLinkedArrayQueue2 == null || spscLinkedArrayQueue2.isEmpty())) {
                            java.lang.Throwable terminate = flatMapSingleObserver.getInputFormats.terminate();
                            if (terminate != null) {
                                flatMapSingleObserver.Camera2StreamConfigurationMap.onError(terminate);
                                return;
                            } else {
                                flatMapSingleObserver.Camera2StreamConfigurationMap.onComplete();
                                return;
                            }
                        }
                        if (flatMapSingleObserver.decrementAndGet() == 0) {
                            return;
                        }
                        flatMapSingleObserver.getHighSpeedVideoFpsRangesFor();
                    }
                }
                do {
                    spscLinkedArrayQueue = flatMapSingleObserver.getOutputMinFrameDuration.get();
                    if (spscLinkedArrayQueue != null) {
                        break;
                    } else {
                        spscLinkedArrayQueue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(io.reactivex.Observable.bufferSize());
                    }
                } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(flatMapSingleObserver.getOutputMinFrameDuration, null, spscLinkedArrayQueue));
                synchronized (spscLinkedArrayQueue) {
                    spscLinkedArrayQueue.offer(r);
                }
                flatMapSingleObserver.getHighSpeedVideoFpsRangesFor.decrementAndGet();
                if (flatMapSingleObserver.getAndIncrement() != 0) {
                    return;
                }
                flatMapSingleObserver.getHighSpeedVideoFpsRangesFor();
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.observable.ObservableFlatMapSingle.FlatMapSingleObserver flatMapSingleObserver = io.reactivex.internal.operators.observable.ObservableFlatMapSingle.FlatMapSingleObserver.this;
                flatMapSingleObserver.getInputSizeshNQ4ISI.delete(this);
                if (flatMapSingleObserver.getInputFormats.addThrowable(th)) {
                    if (!flatMapSingleObserver.getHighSpeedVideoFpsRanges) {
                        flatMapSingleObserver.getHighResolutionOutputSizeshNQ4ISI.dispose();
                        flatMapSingleObserver.getInputSizeshNQ4ISI.dispose();
                    }
                    flatMapSingleObserver.getHighSpeedVideoFpsRangesFor.decrementAndGet();
                    if (flatMapSingleObserver.getAndIncrement() == 0) {
                        flatMapSingleObserver.getHighSpeedVideoFpsRangesFor();
                        return;
                    }
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
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
