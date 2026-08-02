package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableDisposeOn extends io.reactivex.Completable {
    final io.reactivex.CompletableSource getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRanges;

    public CompletableDisposeOn(io.reactivex.CompletableSource completableSource, io.reactivex.Scheduler scheduler) {
        this.getHighResolutionOutputSizeshNQ4ISI = completableSource;
        this.getHighSpeedVideoFpsRanges = scheduler;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.completable.CompletableDisposeOn.CompletableObserverImplementation(completableObserver, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class CompletableObserverImplementation implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable, java.lang.Runnable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.CompletableObserver getHighSpeedVideoFpsRanges;
        final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;

        CompletableObserverImplementation(io.reactivex.CompletableObserver completableObserver, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoFpsRanges = completableObserver;
            this.getHighSpeedVideoFpsRangesFor = scheduler;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighSpeedVideoFpsRanges.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoFpsRanges.onError(th);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoFpsRangesFor.scheduleDirect(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.Camera2StreamConfigurationMap.dispose();
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }
    }
}
