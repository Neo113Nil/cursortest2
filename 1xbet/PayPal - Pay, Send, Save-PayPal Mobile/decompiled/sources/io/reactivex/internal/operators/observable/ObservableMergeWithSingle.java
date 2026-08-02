package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableMergeWithSingle<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.SingleSource<? extends T> getHighSpeedVideoFpsRangesFor;

    public ObservableMergeWithSingle(io.reactivex.Observable<T> observable, io.reactivex.SingleSource<? extends T> singleSource) {
        super(observable);
        this.getHighSpeedVideoFpsRangesFor = singleSource;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableMergeWithSingle.MergeWithObserver mergeWithObserver = new io.reactivex.internal.operators.observable.ObservableMergeWithSingle.MergeWithObserver(observer);
        observer.onSubscribe(mergeWithObserver);
        this.source.subscribe(mergeWithObserver);
        this.getHighSpeedVideoFpsRangesFor.subscribe(mergeWithObserver.getOutputFormats);
    }

    /* loaded from: classes17.dex */
    static final class MergeWithObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        T getInputFormats;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<T> getInputSizeshNQ4ISI;
        volatile int getOutputMinFrameDuration;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.internal.operators.observable.ObservableMergeWithSingle.MergeWithObserver.OtherObserver<T> getOutputFormats = new io.reactivex.internal.operators.observable.ObservableMergeWithSingle.MergeWithObserver.OtherObserver<>(this);
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoSizes = new io.reactivex.internal.util.AtomicThrowable();

        MergeWithObserver(io.reactivex.Observer<? super T> observer) {
            this.getHighSpeedVideoFpsRanges = observer;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighResolutionOutputSizeshNQ4ISI, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.getHighSpeedVideoFpsRanges.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                io.reactivex.internal.queue.SpscLinkedArrayQueue spscLinkedArrayQueue = this.getInputSizeshNQ4ISI;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new io.reactivex.internal.queue.SpscLinkedArrayQueue(io.reactivex.Observable.bufferSize());
                    this.getInputSizeshNQ4ISI = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            getHighSpeedVideoSizes();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes.addThrowable(th)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighResolutionOutputSizeshNQ4ISI);
                if (getAndIncrement() == 0) {
                    getHighSpeedVideoSizes();
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor = true;
            if (getAndIncrement() == 0) {
                getHighSpeedVideoSizes();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighResolutionOutputSizeshNQ4ISI.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap = true;
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighResolutionOutputSizeshNQ4ISI);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getOutputFormats);
            if (getAndIncrement() == 0) {
                this.getInputSizeshNQ4ISI = null;
                this.getInputFormats = null;
            }
        }

        final void getHighSpeedVideoSizes() {
            io.reactivex.Observer<? super T> observer = this.getHighSpeedVideoFpsRanges;
            int i = 1;
            while (!this.Camera2StreamConfigurationMap) {
                if (this.getHighSpeedVideoSizes.get() != null) {
                    this.getInputFormats = null;
                    this.getInputSizeshNQ4ISI = null;
                    observer.onError(this.getHighSpeedVideoSizes.terminate());
                    return;
                }
                int i2 = this.getOutputMinFrameDuration;
                if (i2 == 1) {
                    T t = this.getInputFormats;
                    this.getInputFormats = null;
                    this.getOutputMinFrameDuration = 2;
                    observer.onNext(t);
                    i2 = 2;
                }
                boolean z = this.getHighSpeedVideoFpsRangesFor;
                io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.getInputSizeshNQ4ISI;
                amex.AMEXKernel poll = simplePlainQueue != null ? simplePlainQueue.poll() : null;
                boolean z2 = poll == null;
                if (z && z2 && i2 == 2) {
                    this.getInputSizeshNQ4ISI = null;
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
            this.getInputFormats = null;
            this.getInputSizeshNQ4ISI = null;
        }

        static final class OtherObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final io.reactivex.internal.operators.observable.ObservableMergeWithSingle.MergeWithObserver<T> getHighSpeedVideoSizes;

            OtherObserver(io.reactivex.internal.operators.observable.ObservableMergeWithSingle.MergeWithObserver<T> mergeWithObserver) {
                this.getHighSpeedVideoSizes = mergeWithObserver;
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(T t) {
                io.reactivex.internal.operators.observable.ObservableMergeWithSingle.MergeWithObserver<T> mergeWithObserver = this.getHighSpeedVideoSizes;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    mergeWithObserver.getHighSpeedVideoFpsRanges.onNext(t);
                    mergeWithObserver.getOutputMinFrameDuration = 2;
                } else {
                    mergeWithObserver.getInputFormats = t;
                    mergeWithObserver.getOutputMinFrameDuration = 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.getHighSpeedVideoSizes();
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.observable.ObservableMergeWithSingle.MergeWithObserver<T> mergeWithObserver = this.getHighSpeedVideoSizes;
                if (mergeWithObserver.getHighSpeedVideoSizes.addThrowable(th)) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(mergeWithObserver.getHighResolutionOutputSizeshNQ4ISI);
                    if (mergeWithObserver.getAndIncrement() == 0) {
                        mergeWithObserver.getHighSpeedVideoSizes();
                        return;
                    }
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }
}
