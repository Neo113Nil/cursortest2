package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableRange extends io.reactivex.Observable<java.lang.Integer> {
    private final long Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;

    public ObservableRange(int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = i + i2;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super java.lang.Integer> observer) {
        io.reactivex.internal.operators.observable.ObservableRange.RangeDisposable rangeDisposable = new io.reactivex.internal.operators.observable.ObservableRange.RangeDisposable(observer, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
        observer.onSubscribe(rangeDisposable);
        if (rangeDisposable.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        io.reactivex.Observer<? super java.lang.Integer> observer2 = rangeDisposable.Camera2StreamConfigurationMap;
        long j = rangeDisposable.getHighSpeedVideoSizes;
        for (long j2 = rangeDisposable.getHighSpeedVideoFpsRanges; j2 != j && rangeDisposable.get() == 0; j2++) {
            observer2.onNext(java.lang.Integer.valueOf((int) j2));
        }
        if (rangeDisposable.get() == 0) {
            rangeDisposable.lazySet(1);
            observer2.onComplete();
        }
    }

    /* loaded from: classes17.dex */
    static final class RangeDisposable extends io.reactivex.internal.observers.BasicIntQueueDisposable<java.lang.Integer> {
        private static final long serialVersionUID = 396518478098735504L;
        final io.reactivex.Observer<? super java.lang.Integer> Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoFpsRanges;
        final long getHighSpeedVideoSizes;

        RangeDisposable(io.reactivex.Observer<? super java.lang.Integer> observer, long j, long j2) {
            this.Camera2StreamConfigurationMap = observer;
            this.getHighSpeedVideoFpsRanges = j;
            this.getHighSpeedVideoSizes = j2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getHighSpeedVideoFpsRanges == this.getHighSpeedVideoSizes;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            set(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() != 0;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final /* synthetic */ java.lang.Object poll() throws java.lang.Exception {
            long j = this.getHighSpeedVideoFpsRanges;
            if (j != this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoFpsRanges = 1 + j;
                return java.lang.Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }
    }
}
