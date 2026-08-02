package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableBufferExactBoundary<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final java.util.concurrent.Callable<U> getHighSpeedVideoFpsRanges;
    final io.reactivex.ObservableSource<B> getHighSpeedVideoFpsRangesFor;

    public ObservableBufferExactBoundary(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<B> observableSource2, java.util.concurrent.Callable<U> callable) {
        super(observableSource);
        this.getHighSpeedVideoFpsRangesFor = observableSource2;
        this.getHighSpeedVideoFpsRanges = callable;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super U> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableBufferExactBoundary.BufferExactBoundaryObserver(new io.reactivex.observers.SerializedObserver(observer), this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class BufferExactBoundaryObserver<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        U Camera2StreamConfigurationMap;
        final io.reactivex.ObservableSource<B> getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;
        final java.util.concurrent.Callable<U> getHighSpeedVideoFpsRangesFor;
        io.reactivex.disposables.Disposable getInputSizeshNQ4ISI;

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public final /* synthetic */ void accept(io.reactivex.Observer observer, java.lang.Object obj) {
            this.actual.onNext((java.util.Collection) obj);
        }

        BufferExactBoundaryObserver(io.reactivex.Observer<? super U> observer, java.util.concurrent.Callable<U> callable, io.reactivex.ObservableSource<B> observableSource) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.getHighSpeedVideoFpsRangesFor = callable;
            this.getHighResolutionOutputSizeshNQ4ISI = observableSource;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getInputSizeshNQ4ISI, disposable)) {
                this.getInputSizeshNQ4ISI = disposable;
                try {
                    this.Camera2StreamConfigurationMap = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.call(), "The buffer supplied is null");
                    io.reactivex.internal.operators.observable.ObservableBufferExactBoundary.BufferBoundaryObserver bufferBoundaryObserver = new io.reactivex.internal.operators.observable.ObservableBufferExactBoundary.BufferBoundaryObserver(this);
                    this.getHighSpeedVideoFpsRanges = bufferBoundaryObserver;
                    this.actual.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.subscribe(bufferBoundaryObserver);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.cancelled = true;
                    disposable.dispose();
                    io.reactivex.internal.disposables.EmptyDisposable.error(th, this.actual);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            synchronized (this) {
                U u = this.Camera2StreamConfigurationMap;
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
                U u = this.Camera2StreamConfigurationMap;
                if (u == null) {
                    return;
                }
                this.Camera2StreamConfigurationMap = null;
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
            this.getHighSpeedVideoFpsRanges.dispose();
            this.getInputSizeshNQ4ISI.dispose();
            if (enter()) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }

        final void getHighSpeedVideoSizes() {
            try {
                U u = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.call(), "The buffer supplied is null");
                synchronized (this) {
                    U u2 = this.Camera2StreamConfigurationMap;
                    if (u2 == null) {
                        return;
                    }
                    this.Camera2StreamConfigurationMap = u;
                    fastPathEmit(u2, false, this);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                dispose();
                this.actual.onError(th);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferBoundaryObserver<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.observers.DisposableObserver<B> {
        final io.reactivex.internal.operators.observable.ObservableBufferExactBoundary.BufferExactBoundaryObserver<T, U, B> getHighSpeedVideoSizes;

        BufferBoundaryObserver(io.reactivex.internal.operators.observable.ObservableBufferExactBoundary.BufferExactBoundaryObserver<T, U, B> bufferExactBoundaryObserver) {
            this.getHighSpeedVideoSizes = bufferExactBoundaryObserver;
        }

        @Override // io.reactivex.Observer
        public final void onNext(B b) {
            this.getHighSpeedVideoSizes.getHighSpeedVideoSizes();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoSizes.onComplete();
        }
    }
}
