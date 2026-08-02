package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableFromArray<T> extends io.reactivex.Observable<T> {
    final T[] getHighResolutionOutputSizeshNQ4ISI;

    public ObservableFromArray(T[] tArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = tArr;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableFromArray.FromArrayDisposable fromArrayDisposable = new io.reactivex.internal.operators.observable.ObservableFromArray.FromArrayDisposable(observer, this.getHighResolutionOutputSizeshNQ4ISI);
        observer.onSubscribe(fromArrayDisposable);
        if (fromArrayDisposable.getHighSpeedVideoSizes) {
            return;
        }
        T[] tArr = fromArrayDisposable.getHighSpeedVideoFpsRanges;
        int length = tArr.length;
        for (int i = 0; i < length && !fromArrayDisposable.isDisposed(); i++) {
            T t = tArr[i];
            if (t == null) {
                io.reactivex.Observer<? super T> observer2 = fromArrayDisposable.Camera2StreamConfigurationMap;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The ");
                sb.append(i);
                sb.append("th element is null");
                observer2.onError(new java.lang.NullPointerException(sb.toString()));
                return;
            }
            fromArrayDisposable.Camera2StreamConfigurationMap.onNext(t);
        }
        if (fromArrayDisposable.isDisposed()) {
            return;
        }
        fromArrayDisposable.Camera2StreamConfigurationMap.onComplete();
    }

    /* loaded from: classes17.dex */
    static final class FromArrayDisposable<T> extends io.reactivex.internal.observers.BasicQueueDisposable<T> {
        final io.reactivex.Observer<? super T> Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final T[] getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        FromArrayDisposable(io.reactivex.Observer<? super T> observer, T[] tArr) {
            this.Camera2StreamConfigurationMap = observer;
            this.getHighSpeedVideoFpsRanges = tArr;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.getHighSpeedVideoSizes = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() {
            int i = this.getHighSpeedVideoFpsRangesFor;
            T[] tArr = this.getHighSpeedVideoFpsRanges;
            if (i == tArr.length) {
                return null;
            }
            this.getHighSpeedVideoFpsRangesFor = i + 1;
            return (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(tArr[i], "The array element is null");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getHighSpeedVideoFpsRangesFor == this.getHighSpeedVideoFpsRanges.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.length;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }
}
