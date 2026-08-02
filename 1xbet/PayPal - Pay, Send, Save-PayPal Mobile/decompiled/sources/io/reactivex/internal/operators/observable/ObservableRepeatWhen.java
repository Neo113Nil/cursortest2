package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableRepeatWhen<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super io.reactivex.Observable<java.lang.Object>, ? extends io.reactivex.ObservableSource<?>> getHighSpeedVideoSizes;

    public ObservableRepeatWhen(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super io.reactivex.Observable<java.lang.Object>, ? extends io.reactivex.ObservableSource<?>> function) {
        super(observableSource);
        this.getHighSpeedVideoSizes = function;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.subjects.Subject<T> serialized = io.reactivex.subjects.PublishSubject.create().toSerialized();
        try {
            io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.apply(serialized), "The handler returned a null ObservableSource");
            io.reactivex.internal.operators.observable.ObservableRepeatWhen.RepeatWhenObserver repeatWhenObserver = new io.reactivex.internal.operators.observable.ObservableRepeatWhen.RepeatWhenObserver(observer, serialized, this.source);
            observer.onSubscribe(repeatWhenObserver);
            observableSource.subscribe(repeatWhenObserver.Camera2StreamConfigurationMap);
            repeatWhenObserver.getHighSpeedVideoSizes();
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
        }
    }

    /* loaded from: classes17.dex */
    static final class RepeatWhenObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 802743776666017014L;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final io.reactivex.ObservableSource<T> getHighSpeedVideoSizesFor;
        final io.reactivex.subjects.Subject<java.lang.Object> getOutputMinFrameDuration;
        final java.util.concurrent.atomic.AtomicInteger getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger();
        final io.reactivex.internal.util.AtomicThrowable getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.internal.operators.observable.ObservableRepeatWhen.RepeatWhenObserver<T>.InnerRepeatObserver Camera2StreamConfigurationMap = new io.reactivex.internal.operators.observable.ObservableRepeatWhen.RepeatWhenObserver.InnerRepeatObserver();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();

        RepeatWhenObserver(io.reactivex.Observer<? super T> observer, io.reactivex.subjects.Subject<java.lang.Object> subject, io.reactivex.ObservableSource<T> observableSource) {
            this.getHighSpeedVideoFpsRanges = observer;
            this.getOutputMinFrameDuration = subject;
            this.getHighSpeedVideoSizesFor = observableSource;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.replace(this.getHighSpeedVideoSizes, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            io.reactivex.internal.util.HalfSerializer.onNext(this.getHighSpeedVideoFpsRanges, t, this, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.Camera2StreamConfigurationMap);
            io.reactivex.internal.util.HalfSerializer.onError(this.getHighSpeedVideoFpsRanges, th, this, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor = false;
            this.getOutputMinFrameDuration.onNext(0);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighSpeedVideoSizes.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizes);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.Camera2StreamConfigurationMap);
        }

        final void getHighSpeedVideoSizes() {
            if (this.getInputSizeshNQ4ISI.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.getHighSpeedVideoFpsRangesFor) {
                        this.getHighSpeedVideoFpsRangesFor = true;
                        this.getHighSpeedVideoSizesFor.subscribe(this);
                    }
                    if (this.getInputSizeshNQ4ISI.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        final class InnerRepeatObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<java.lang.Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            InnerRepeatObserver() {
            }

            @Override // io.reactivex.Observer
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.Observer
            public final void onNext(java.lang.Object obj) {
                io.reactivex.internal.operators.observable.ObservableRepeatWhen.RepeatWhenObserver.this.getHighSpeedVideoSizes();
            }

            @Override // io.reactivex.Observer
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.observable.ObservableRepeatWhen.RepeatWhenObserver repeatWhenObserver = io.reactivex.internal.operators.observable.ObservableRepeatWhen.RepeatWhenObserver.this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(repeatWhenObserver.getHighSpeedVideoSizes);
                io.reactivex.internal.util.HalfSerializer.onError(repeatWhenObserver.getHighSpeedVideoFpsRanges, th, repeatWhenObserver, repeatWhenObserver.getHighResolutionOutputSizeshNQ4ISI);
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                io.reactivex.internal.operators.observable.ObservableRepeatWhen.RepeatWhenObserver repeatWhenObserver = io.reactivex.internal.operators.observable.ObservableRepeatWhen.RepeatWhenObserver.this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(repeatWhenObserver.getHighSpeedVideoSizes);
                io.reactivex.internal.util.HalfSerializer.onComplete(repeatWhenObserver.getHighSpeedVideoFpsRanges, repeatWhenObserver, repeatWhenObserver.getHighResolutionOutputSizeshNQ4ISI);
            }
        }
    }
}
