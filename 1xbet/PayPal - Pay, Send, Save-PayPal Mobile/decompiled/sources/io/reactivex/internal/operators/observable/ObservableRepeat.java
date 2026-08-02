package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableRepeat<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final long getHighSpeedVideoFpsRangesFor;

    public ObservableRepeat(io.reactivex.Observable<T> observable, long j) {
        super(observable);
        this.getHighSpeedVideoFpsRangesFor = j;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        long j = this.getHighSpeedVideoFpsRangesFor;
        new io.reactivex.internal.operators.observable.ObservableRepeat.RepeatObserver(observer, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, sequentialDisposable, this.source).Camera2StreamConfigurationMap();
    }

    /* loaded from: classes17.dex */
    static final class RepeatObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final io.reactivex.Observer<? super T> Camera2StreamConfigurationMap;
        long getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoFpsRanges;
        final io.reactivex.ObservableSource<? extends T> getHighSpeedVideoFpsRangesFor;

        RepeatObserver(io.reactivex.Observer<? super T> observer, long j, io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable, io.reactivex.ObservableSource<? extends T> observableSource) {
            this.Camera2StreamConfigurationMap = observer;
            this.getHighSpeedVideoFpsRanges = sequentialDisposable;
            this.getHighSpeedVideoFpsRangesFor = observableSource;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoFpsRanges.replace(disposable);
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
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            if (j != Long.MAX_VALUE) {
                this.getHighResolutionOutputSizeshNQ4ISI = j - 1;
            }
            if (j != 0) {
                Camera2StreamConfigurationMap();
            } else {
                this.Camera2StreamConfigurationMap.onComplete();
            }
        }

        final void Camera2StreamConfigurationMap() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.getHighSpeedVideoFpsRanges.isDisposed()) {
                    this.getHighSpeedVideoFpsRangesFor.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }
}
