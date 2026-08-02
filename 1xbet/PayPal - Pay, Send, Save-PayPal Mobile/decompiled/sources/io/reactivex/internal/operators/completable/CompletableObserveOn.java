package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableObserveOn extends io.reactivex.Completable {
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;
    final io.reactivex.CompletableSource getHighSpeedVideoSizes;

    public CompletableObserveOn(io.reactivex.CompletableSource completableSource, io.reactivex.Scheduler scheduler) {
        this.getHighSpeedVideoSizes = completableSource;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.completable.CompletableObserveOn.ObserveOnCompletableObserver(completableObserver, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class ObserveOnCompletableObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final io.reactivex.Scheduler Camera2StreamConfigurationMap;
        java.lang.Throwable getHighSpeedVideoFpsRanges;
        final io.reactivex.CompletableObserver getHighSpeedVideoSizes;

        ObserveOnCompletableObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoSizes = completableObserver;
            this.Camera2StreamConfigurationMap = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges = th;
            io.reactivex.internal.disposables.DisposableHelper.replace(this, this.Camera2StreamConfigurationMap.scheduleDirect(this));
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            io.reactivex.internal.disposables.DisposableHelper.replace(this, this.Camera2StreamConfigurationMap.scheduleDirect(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            java.lang.Throwable th = this.getHighSpeedVideoFpsRanges;
            if (th != null) {
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighSpeedVideoSizes.onError(th);
            } else {
                this.getHighSpeedVideoSizes.onComplete();
            }
        }
    }
}
