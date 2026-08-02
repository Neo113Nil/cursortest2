package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleDelay<T> extends io.reactivex.Single<T> {
    final boolean Camera2StreamConfigurationMap;
    final io.reactivex.SingleSource<? extends T> getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRanges;
    final long getHighSpeedVideoFpsRangesFor;
    final io.reactivex.Scheduler getHighSpeedVideoSizes;

    public SingleDelay(io.reactivex.SingleSource<? extends T> singleSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = singleSource;
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoFpsRanges = timeUnit;
        this.getHighSpeedVideoSizes = scheduler;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
        singleObserver.onSubscribe(sequentialDisposable);
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.single.SingleDelay.Delay(sequentialDisposable, singleObserver));
    }

    /* loaded from: classes17.dex */
    final class Delay implements io.reactivex.SingleObserver<T> {
        private final io.reactivex.internal.disposables.SequentialDisposable getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoFpsRanges;

        Delay(io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable, io.reactivex.SingleObserver<? super T> singleObserver) {
            this.getHighResolutionOutputSizeshNQ4ISI = sequentialDisposable;
            this.getHighSpeedVideoFpsRanges = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighResolutionOutputSizeshNQ4ISI.replace(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI.replace(io.reactivex.internal.operators.single.SingleDelay.this.getHighSpeedVideoSizes.scheduleDirect(new io.reactivex.internal.operators.single.SingleDelay.Delay.OnSuccess(t), io.reactivex.internal.operators.single.SingleDelay.this.getHighSpeedVideoFpsRangesFor, io.reactivex.internal.operators.single.SingleDelay.this.getHighSpeedVideoFpsRanges));
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.replace(io.reactivex.internal.operators.single.SingleDelay.this.getHighSpeedVideoSizes.scheduleDirect(new io.reactivex.internal.operators.single.SingleDelay.Delay.OnError(th), io.reactivex.internal.operators.single.SingleDelay.this.Camera2StreamConfigurationMap ? io.reactivex.internal.operators.single.SingleDelay.this.getHighSpeedVideoFpsRangesFor : 0L, io.reactivex.internal.operators.single.SingleDelay.this.getHighSpeedVideoFpsRanges));
        }

        final class OnSuccess implements java.lang.Runnable {
            private final T getHighSpeedVideoFpsRanges;

            OnSuccess(T t) {
                this.getHighSpeedVideoFpsRanges = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                io.reactivex.internal.operators.single.SingleDelay.Delay.this.getHighSpeedVideoFpsRanges.onSuccess(this.getHighSpeedVideoFpsRanges);
            }
        }

        final class OnError implements java.lang.Runnable {
            private final java.lang.Throwable getHighSpeedVideoFpsRangesFor;

            OnError(java.lang.Throwable th) {
                this.getHighSpeedVideoFpsRangesFor = th;
            }

            @Override // java.lang.Runnable
            public final void run() {
                io.reactivex.internal.operators.single.SingleDelay.Delay.this.getHighSpeedVideoFpsRanges.onError(this.getHighSpeedVideoFpsRangesFor);
            }
        }
    }
}
