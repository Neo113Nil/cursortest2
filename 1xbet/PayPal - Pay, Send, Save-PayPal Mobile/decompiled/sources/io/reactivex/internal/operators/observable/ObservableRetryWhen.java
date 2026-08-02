package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableRetryWhen<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super io.reactivex.Observable<java.lang.Throwable>, ? extends io.reactivex.ObservableSource<?>> getHighSpeedVideoSizes;

    public ObservableRetryWhen(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super io.reactivex.Observable<java.lang.Throwable>, ? extends io.reactivex.ObservableSource<?>> function) {
        super(observableSource);
        this.getHighSpeedVideoSizes = function;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.subjects.Subject<T> serialized = io.reactivex.subjects.PublishSubject.create().toSerialized();
        try {
            io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.apply(serialized), "The handler returned a null ObservableSource");
            io.reactivex.internal.operators.observable.ObservableRetryWhen.RepeatWhenObserver repeatWhenObserver = new io.reactivex.internal.operators.observable.ObservableRetryWhen.RepeatWhenObserver(observer, serialized, this.source);
            observer.onSubscribe(repeatWhenObserver);
            observableSource.subscribe(repeatWhenObserver.getHighSpeedVideoFpsRangesFor);
            repeatWhenObserver.getHighSpeedVideoSizes();
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
        }
    }

    /* loaded from: classes17.dex */
    static final class RepeatWhenObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 802743776666017014L;
        final io.reactivex.Observer<? super T> getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.ObservableSource<T> getInputFormats;
        final io.reactivex.subjects.Subject<java.lang.Throwable> getOutputMinFrameDuration;
        final java.util.concurrent.atomic.AtomicInteger getOutputFormats = new java.util.concurrent.atomic.AtomicInteger();
        final io.reactivex.internal.util.AtomicThrowable Camera2StreamConfigurationMap = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.internal.operators.observable.ObservableRetryWhen.RepeatWhenObserver<T>.InnerRepeatObserver getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.operators.observable.ObservableRetryWhen.RepeatWhenObserver.InnerRepeatObserver();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();

        RepeatWhenObserver(io.reactivex.Observer<? super T> observer, io.reactivex.subjects.Subject<java.lang.Throwable> subject, io.reactivex.ObservableSource<T> observableSource) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.getOutputMinFrameDuration = subject;
            this.getInputFormats = observableSource;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.replace(this.getHighSpeedVideoSizes, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            io.reactivex.internal.util.HalfSerializer.onNext(this.getHighResolutionOutputSizeshNQ4ISI, t, this, this.Camera2StreamConfigurationMap);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges = false;
            this.getOutputMinFrameDuration.onNext(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRangesFor);
            io.reactivex.internal.util.HalfSerializer.onComplete(this.getHighResolutionOutputSizeshNQ4ISI, this, this.Camera2StreamConfigurationMap);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighSpeedVideoSizes.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizes);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRangesFor);
        }

        final void getHighSpeedVideoSizes() {
            if (this.getOutputFormats.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.getHighSpeedVideoFpsRanges) {
                        this.getHighSpeedVideoFpsRanges = true;
                        this.getInputFormats.subscribe(this);
                    }
                    if (this.getOutputFormats.decrementAndGet() == 0) {
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
                io.reactivex.internal.operators.observable.ObservableRetryWhen.RepeatWhenObserver.this.getHighSpeedVideoSizes();
            }

            @Override // io.reactivex.Observer
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.observable.ObservableRetryWhen.RepeatWhenObserver repeatWhenObserver = io.reactivex.internal.operators.observable.ObservableRetryWhen.RepeatWhenObserver.this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(repeatWhenObserver.getHighSpeedVideoSizes);
                io.reactivex.internal.util.HalfSerializer.onError(repeatWhenObserver.getHighResolutionOutputSizeshNQ4ISI, th, repeatWhenObserver, repeatWhenObserver.Camera2StreamConfigurationMap);
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                io.reactivex.internal.operators.observable.ObservableRetryWhen.RepeatWhenObserver repeatWhenObserver = io.reactivex.internal.operators.observable.ObservableRetryWhen.RepeatWhenObserver.this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(repeatWhenObserver.getHighSpeedVideoSizes);
                io.reactivex.internal.util.HalfSerializer.onComplete(repeatWhenObserver.getHighResolutionOutputSizeshNQ4ISI, repeatWhenObserver, repeatWhenObserver.Camera2StreamConfigurationMap);
            }
        }
    }
}
