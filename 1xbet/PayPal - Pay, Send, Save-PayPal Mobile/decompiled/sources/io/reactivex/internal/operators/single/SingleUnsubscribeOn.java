package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleUnsubscribeOn<T> extends io.reactivex.Single<T> {
    final io.reactivex.Scheduler getHighSpeedVideoFpsRanges;
    final io.reactivex.SingleSource<T> getHighSpeedVideoSizes;

    public SingleUnsubscribeOn(io.reactivex.SingleSource<T> singleSource, io.reactivex.Scheduler scheduler) {
        this.getHighSpeedVideoSizes = singleSource;
        this.getHighSpeedVideoFpsRanges = scheduler;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.single.SingleUnsubscribeOn.UnsubscribeOnSingleObserver(singleObserver, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class UnsubscribeOnSingleObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 3256698449646456986L;
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoFpsRanges;

        UnsubscribeOnSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoFpsRanges = singleObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.disposables.Disposable andSet = getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
            if (andSet != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.Camera2StreamConfigurationMap = andSet;
                this.getHighResolutionOutputSizeshNQ4ISI.scheduleDirect(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.Camera2StreamConfigurationMap.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRanges.onSuccess(t);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }
    }
}
