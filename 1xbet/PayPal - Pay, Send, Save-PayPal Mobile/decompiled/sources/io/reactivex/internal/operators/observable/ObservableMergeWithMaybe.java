package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableMergeWithMaybe<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.MaybeSource<? extends T> Camera2StreamConfigurationMap;

    public ObservableMergeWithMaybe(io.reactivex.Observable<T> observable, io.reactivex.MaybeSource<? extends T> maybeSource) {
        super(observable);
        this.Camera2StreamConfigurationMap = maybeSource;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableMergeWithMaybe.MergeWithObserver mergeWithObserver = new io.reactivex.internal.operators.observable.ObservableMergeWithMaybe.MergeWithObserver(observer);
        observer.onSubscribe(mergeWithObserver);
        this.source.subscribe(mergeWithObserver);
        this.Camera2StreamConfigurationMap.subscribe(mergeWithObserver.getInputSizeshNQ4ISI);
    }

    /* loaded from: classes17.dex */
    static final class MergeWithObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Observer<? super T> getHighSpeedVideoSizes;
        T getHighSpeedVideoSizesFor;
        volatile int getInputFormats;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<T> getOutputFormats;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.internal.operators.observable.ObservableMergeWithMaybe.MergeWithObserver.OtherObserver<T> getInputSizeshNQ4ISI = new io.reactivex.internal.operators.observable.ObservableMergeWithMaybe.MergeWithObserver.OtherObserver<>(this);
        final io.reactivex.internal.util.AtomicThrowable Camera2StreamConfigurationMap = new io.reactivex.internal.util.AtomicThrowable();

        MergeWithObserver(io.reactivex.Observer<? super T> observer) {
            this.getHighSpeedVideoSizes = observer;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighSpeedVideoFpsRanges, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.getHighSpeedVideoSizes.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                io.reactivex.internal.queue.SpscLinkedArrayQueue spscLinkedArrayQueue = this.getOutputFormats;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new io.reactivex.internal.queue.SpscLinkedArrayQueue(io.reactivex.Observable.bufferSize());
                    this.getOutputFormats = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap.addThrowable(th)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
                if (getAndIncrement() == 0) {
                    getHighSpeedVideoFpsRanges();
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            if (getAndIncrement() == 0) {
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighSpeedVideoFpsRanges.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor = true;
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
            if (getAndIncrement() == 0) {
                this.getOutputFormats = null;
                this.getHighSpeedVideoSizesFor = null;
            }
        }

        final void getHighSpeedVideoFpsRanges() {
            io.reactivex.Observer<? super T> observer = this.getHighSpeedVideoSizes;
            int i = 1;
            while (!this.getHighSpeedVideoFpsRangesFor) {
                if (this.Camera2StreamConfigurationMap.get() != null) {
                    this.getHighSpeedVideoSizesFor = null;
                    this.getOutputFormats = null;
                    observer.onError(this.Camera2StreamConfigurationMap.terminate());
                    return;
                }
                int i2 = this.getInputFormats;
                if (i2 == 1) {
                    T t = this.getHighSpeedVideoSizesFor;
                    this.getHighSpeedVideoSizesFor = null;
                    this.getInputFormats = 2;
                    observer.onNext(t);
                    i2 = 2;
                }
                boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
                io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.getOutputFormats;
                amex.AMEXKernel poll = simplePlainQueue != null ? simplePlainQueue.poll() : null;
                boolean z2 = poll == null;
                if (z && z2 && i2 == 2) {
                    this.getOutputFormats = null;
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
            this.getHighSpeedVideoSizesFor = null;
            this.getOutputFormats = null;
        }

        static final class OtherObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final io.reactivex.internal.operators.observable.ObservableMergeWithMaybe.MergeWithObserver<T> Camera2StreamConfigurationMap;

            OtherObserver(io.reactivex.internal.operators.observable.ObservableMergeWithMaybe.MergeWithObserver<T> mergeWithObserver) {
                this.Camera2StreamConfigurationMap = mergeWithObserver;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(T t) {
                io.reactivex.internal.operators.observable.ObservableMergeWithMaybe.MergeWithObserver<T> mergeWithObserver = this.Camera2StreamConfigurationMap;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    mergeWithObserver.getHighSpeedVideoSizes.onNext(t);
                    mergeWithObserver.getInputFormats = 2;
                } else {
                    mergeWithObserver.getHighSpeedVideoSizesFor = t;
                    mergeWithObserver.getInputFormats = 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.getHighSpeedVideoFpsRanges();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.observable.ObservableMergeWithMaybe.MergeWithObserver<T> mergeWithObserver = this.Camera2StreamConfigurationMap;
                if (mergeWithObserver.Camera2StreamConfigurationMap.addThrowable(th)) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(mergeWithObserver.getHighSpeedVideoFpsRanges);
                    if (mergeWithObserver.getAndIncrement() == 0) {
                        mergeWithObserver.getHighSpeedVideoFpsRanges();
                        return;
                    }
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.observable.ObservableMergeWithMaybe.MergeWithObserver<T> mergeWithObserver = this.Camera2StreamConfigurationMap;
                mergeWithObserver.getInputFormats = 2;
                if (mergeWithObserver.getAndIncrement() == 0) {
                    mergeWithObserver.getHighSpeedVideoFpsRanges();
                }
            }
        }
    }
}
