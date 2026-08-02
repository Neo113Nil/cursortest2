package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableRepeatUntil<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.BooleanSupplier Camera2StreamConfigurationMap;

    public ObservableRepeatUntil(io.reactivex.Observable<T> observable, io.reactivex.functions.BooleanSupplier booleanSupplier) {
        super(observable);
        this.Camera2StreamConfigurationMap = booleanSupplier;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        new io.reactivex.internal.operators.observable.ObservableRepeatUntil.RepeatUntilObserver(observer, this.Camera2StreamConfigurationMap, sequentialDisposable, this.source).getHighSpeedVideoFpsRanges();
    }

    /* loaded from: classes17.dex */
    static final class RepeatUntilObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.Observer<? super T> Camera2StreamConfigurationMap;
        final io.reactivex.ObservableSource<? extends T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.BooleanSupplier getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoFpsRangesFor;

        RepeatUntilObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.BooleanSupplier booleanSupplier, io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable, io.reactivex.ObservableSource<? extends T> observableSource) {
            this.Camera2StreamConfigurationMap = observer;
            this.getHighSpeedVideoFpsRangesFor = sequentialDisposable;
            this.getHighResolutionOutputSizeshNQ4ISI = observableSource;
            this.getHighSpeedVideoFpsRanges = booleanSupplier;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoFpsRangesFor.replace(disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.Camera2StreamConfigurationMap.onNext(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            try {
                if (this.getHighSpeedVideoFpsRanges.getAsBoolean()) {
                    this.Camera2StreamConfigurationMap.onComplete();
                } else {
                    getHighSpeedVideoFpsRanges();
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.Camera2StreamConfigurationMap.onError(th);
            }
        }

        final void getHighSpeedVideoFpsRanges() {
            if (getAndIncrement() == 0) {
                int i = 1;
                do {
                    this.getHighResolutionOutputSizeshNQ4ISI.subscribe(this);
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }
    }
}
