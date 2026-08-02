package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableRetryBiPredicate<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> Camera2StreamConfigurationMap;

    public ObservableRetryBiPredicate(io.reactivex.Observable<T> observable, io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> biPredicate) {
        super(observable);
        this.Camera2StreamConfigurationMap = biPredicate;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        new io.reactivex.internal.operators.observable.ObservableRetryBiPredicate.RetryBiObserver(observer, this.Camera2StreamConfigurationMap, sequentialDisposable, this.source).Camera2StreamConfigurationMap();
    }

    /* loaded from: classes17.dex */
    static final class RetryBiObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.ObservableSource<? extends T> getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Observer<? super T> getHighSpeedVideoSizes;

        RetryBiObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> biPredicate, io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable, io.reactivex.ObservableSource<? extends T> observableSource) {
            this.getHighSpeedVideoSizes = observer;
            this.getHighSpeedVideoFpsRangesFor = sequentialDisposable;
            this.getHighSpeedVideoFpsRanges = observableSource;
            this.Camera2StreamConfigurationMap = biPredicate;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoFpsRangesFor.update(disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoSizes.onNext(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            try {
                io.reactivex.functions.BiPredicate<? super java.lang.Integer, ? super java.lang.Throwable> biPredicate = this.Camera2StreamConfigurationMap;
                int i = this.getHighResolutionOutputSizeshNQ4ISI + 1;
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                if (!biPredicate.test(java.lang.Integer.valueOf(i), th)) {
                    this.getHighSpeedVideoSizes.onError(th);
                } else {
                    Camera2StreamConfigurationMap();
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.getHighSpeedVideoSizes.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoSizes.onComplete();
        }

        final void Camera2StreamConfigurationMap() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.getHighSpeedVideoFpsRangesFor.isDisposed()) {
                    this.getHighSpeedVideoFpsRanges.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }
}
