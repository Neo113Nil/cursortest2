package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleObserveOn<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<T> getHighSpeedVideoFpsRanges;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;

    public SingleObserveOn(io.reactivex.SingleSource<T> singleSource, io.reactivex.Scheduler scheduler) {
        this.getHighSpeedVideoFpsRanges = singleSource;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoFpsRanges.subscribe(new io.reactivex.internal.operators.single.SingleObserveOn.ObserveOnSingleObserver(singleObserver, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class ObserveOnSingleObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        T getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoFpsRanges;
        java.lang.Throwable getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Scheduler getHighSpeedVideoSizes;

        ObserveOnSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoFpsRanges = singleObserver;
            this.getHighSpeedVideoSizes = scheduler;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI = t;
            io.reactivex.internal.disposables.DisposableHelper.replace(this, this.getHighSpeedVideoSizes.scheduleDirect(this));
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor = th;
            io.reactivex.internal.disposables.DisposableHelper.replace(this, this.getHighSpeedVideoSizes.scheduleDirect(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            java.lang.Throwable th = this.getHighSpeedVideoFpsRangesFor;
            if (th != null) {
                this.getHighSpeedVideoFpsRanges.onError(th);
            } else {
                this.getHighSpeedVideoFpsRanges.onSuccess(this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }
}
