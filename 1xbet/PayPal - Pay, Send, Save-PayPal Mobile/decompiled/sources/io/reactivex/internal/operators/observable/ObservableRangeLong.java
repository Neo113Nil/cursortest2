package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableRangeLong extends io.reactivex.Observable<java.lang.Long> {
    private final long Camera2StreamConfigurationMap;
    private final long getHighSpeedVideoFpsRanges;

    public ObservableRangeLong(long j, long j2) {
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRanges = j2;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super java.lang.Long> observer) {
        long j = this.Camera2StreamConfigurationMap;
        io.reactivex.internal.operators.observable.ObservableRangeLong.RangeDisposable rangeDisposable = new io.reactivex.internal.operators.observable.ObservableRangeLong.RangeDisposable(observer, j, this.getHighSpeedVideoFpsRanges + j);
        observer.onSubscribe(rangeDisposable);
        if (rangeDisposable.getHighSpeedVideoSizes) {
            return;
        }
        io.reactivex.Observer<? super java.lang.Long> observer2 = rangeDisposable.Camera2StreamConfigurationMap;
        long j2 = rangeDisposable.getHighSpeedVideoFpsRangesFor;
        for (long j3 = rangeDisposable.getHighSpeedVideoFpsRanges; j3 != j2 && rangeDisposable.get() == 0; j3++) {
            observer2.onNext(java.lang.Long.valueOf(j3));
        }
        if (rangeDisposable.get() == 0) {
            rangeDisposable.lazySet(1);
            observer2.onComplete();
        }
    }

    /* loaded from: classes17.dex */
    static final class RangeDisposable extends io.reactivex.internal.observers.BasicIntQueueDisposable<java.lang.Long> {
        private static final long serialVersionUID = 396518478098735504L;
        final io.reactivex.Observer<? super java.lang.Long> Camera2StreamConfigurationMap;
        long getHighSpeedVideoFpsRanges;
        final long getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        RangeDisposable(io.reactivex.Observer<? super java.lang.Long> observer, long j, long j2) {
            this.Camera2StreamConfigurationMap = observer;
            this.getHighSpeedVideoFpsRanges = j;
            this.getHighSpeedVideoFpsRangesFor = j2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getHighSpeedVideoFpsRanges == this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor;
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
            this.getHighSpeedVideoSizes = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final /* synthetic */ java.lang.Object poll() throws java.lang.Exception {
            long j = this.getHighSpeedVideoFpsRanges;
            if (j != this.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoFpsRanges = 1 + j;
                return java.lang.Long.valueOf(j);
            }
            lazySet(1);
            return null;
        }
    }
}
