package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableDelay extends io.reactivex.Completable {
    final long Camera2StreamConfigurationMap;
    final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.CompletableSource getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.TimeUnit getHighSpeedVideoSizes;

    public CompletableDelay(io.reactivex.CompletableSource completableSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, boolean z) {
        this.getHighSpeedVideoFpsRanges = completableSource;
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoSizes = timeUnit;
        this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.getHighSpeedVideoFpsRanges.subscribe(new io.reactivex.internal.operators.completable.CompletableDelay.Delay(new io.reactivex.disposables.CompositeDisposable(), completableObserver));
    }

    /* loaded from: classes17.dex */
    final class Delay implements io.reactivex.CompletableObserver {
        private final io.reactivex.disposables.CompositeDisposable Camera2StreamConfigurationMap;
        final io.reactivex.CompletableObserver getHighSpeedVideoFpsRanges;

        Delay(io.reactivex.disposables.CompositeDisposable compositeDisposable, io.reactivex.CompletableObserver completableObserver) {
            this.Camera2StreamConfigurationMap = compositeDisposable;
            this.getHighSpeedVideoFpsRanges = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.Camera2StreamConfigurationMap.add(io.reactivex.internal.operators.completable.CompletableDelay.this.getHighResolutionOutputSizeshNQ4ISI.scheduleDirect(new io.reactivex.internal.operators.completable.CompletableDelay.Delay.OnComplete(), io.reactivex.internal.operators.completable.CompletableDelay.this.Camera2StreamConfigurationMap, io.reactivex.internal.operators.completable.CompletableDelay.this.getHighSpeedVideoSizes));
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.add(io.reactivex.internal.operators.completable.CompletableDelay.this.getHighResolutionOutputSizeshNQ4ISI.scheduleDirect(new io.reactivex.internal.operators.completable.CompletableDelay.Delay.OnError(th), io.reactivex.internal.operators.completable.CompletableDelay.this.getHighSpeedVideoFpsRangesFor ? io.reactivex.internal.operators.completable.CompletableDelay.this.Camera2StreamConfigurationMap : 0L, io.reactivex.internal.operators.completable.CompletableDelay.this.getHighSpeedVideoSizes));
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.Camera2StreamConfigurationMap.add(disposable);
            this.getHighSpeedVideoFpsRanges.onSubscribe(this.Camera2StreamConfigurationMap);
        }

        final class OnComplete implements java.lang.Runnable {
            OnComplete() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                io.reactivex.internal.operators.completable.CompletableDelay.Delay.this.getHighSpeedVideoFpsRanges.onComplete();
            }
        }

        final class OnError implements java.lang.Runnable {
            private final java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;

            OnError(java.lang.Throwable th) {
                this.getHighResolutionOutputSizeshNQ4ISI = th;
            }

            @Override // java.lang.Runnable
            public final void run() {
                io.reactivex.internal.operators.completable.CompletableDelay.Delay.this.getHighSpeedVideoFpsRanges.onError(this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }
    }
}
