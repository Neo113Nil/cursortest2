package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleSubscribeOn<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<? extends T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.Scheduler getHighSpeedVideoSizes;

    public SingleSubscribeOn(io.reactivex.SingleSource<? extends T> singleSource, io.reactivex.Scheduler scheduler) {
        this.getHighResolutionOutputSizeshNQ4ISI = singleSource;
        this.getHighSpeedVideoSizes = scheduler;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        io.reactivex.internal.operators.single.SingleSubscribeOn.SubscribeOnObserver subscribeOnObserver = new io.reactivex.internal.operators.single.SingleSubscribeOn.SubscribeOnObserver(singleObserver, this.getHighResolutionOutputSizeshNQ4ISI);
        singleObserver.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.getHighResolutionOutputSizeshNQ4ISI.replace(this.getHighSpeedVideoSizes.scheduleDirect(subscribeOnObserver));
    }

    /* loaded from: classes17.dex */
    static final class SubscribeOnObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final io.reactivex.SingleSource<? extends T> Camera2StreamConfigurationMap;
        final io.reactivex.internal.disposables.SequentialDisposable getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.disposables.SequentialDisposable();
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoFpsRanges;

        SubscribeOnObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.SingleSource<? extends T> singleSource) {
            this.getHighSpeedVideoFpsRanges = singleObserver;
            this.Camera2StreamConfigurationMap = singleSource;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRanges.onSuccess(t);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.Camera2StreamConfigurationMap.subscribe(this);
        }
    }
}
