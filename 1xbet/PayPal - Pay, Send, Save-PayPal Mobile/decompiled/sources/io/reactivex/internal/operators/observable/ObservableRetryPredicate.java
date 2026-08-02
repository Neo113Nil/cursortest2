package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableRetryPredicate<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final long getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Predicate<? super java.lang.Throwable> getHighSpeedVideoFpsRangesFor;

    public ObservableRetryPredicate(io.reactivex.Observable<T> observable, long j, io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate) {
        super(observable);
        this.getHighSpeedVideoFpsRangesFor = predicate;
        this.getHighSpeedVideoFpsRanges = j;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        new io.reactivex.internal.operators.observable.ObservableRetryPredicate.RepeatObserver(observer, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, sequentialDisposable, this.source).getHighResolutionOutputSizeshNQ4ISI();
    }

    /* loaded from: classes17.dex */
    static final class RepeatObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.ObservableSource<? extends T> Camera2StreamConfigurationMap;
        final io.reactivex.functions.Predicate<? super java.lang.Throwable> getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Observer<? super T> getHighSpeedVideoSizes;

        RepeatObserver(io.reactivex.Observer<? super T> observer, long j, io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate, io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable, io.reactivex.ObservableSource<? extends T> observableSource) {
            this.getHighSpeedVideoSizes = observer;
            this.getHighSpeedVideoFpsRangesFor = sequentialDisposable;
            this.Camera2StreamConfigurationMap = observableSource;
            this.getHighResolutionOutputSizeshNQ4ISI = predicate;
            this.getHighSpeedVideoFpsRanges = j;
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
            long j = this.getHighSpeedVideoFpsRanges;
            if (j != Long.MAX_VALUE) {
                this.getHighSpeedVideoFpsRanges = j - 1;
            }
            if (j == 0) {
                this.getHighSpeedVideoSizes.onError(th);
                return;
            }
            try {
                if (!this.getHighResolutionOutputSizeshNQ4ISI.test(th)) {
                    this.getHighSpeedVideoSizes.onError(th);
                } else {
                    getHighResolutionOutputSizeshNQ4ISI();
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

        final void getHighResolutionOutputSizeshNQ4ISI() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.getHighSpeedVideoFpsRangesFor.isDisposed()) {
                    this.Camera2StreamConfigurationMap.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }
}
