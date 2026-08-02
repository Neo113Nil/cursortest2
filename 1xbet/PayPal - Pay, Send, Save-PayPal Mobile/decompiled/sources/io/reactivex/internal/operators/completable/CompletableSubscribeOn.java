package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableSubscribeOn extends io.reactivex.Completable {
    final io.reactivex.CompletableSource Camera2StreamConfigurationMap;
    final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI;

    public CompletableSubscribeOn(io.reactivex.CompletableSource completableSource, io.reactivex.Scheduler scheduler) {
        this.Camera2StreamConfigurationMap = completableSource;
        this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.internal.operators.completable.CompletableSubscribeOn.SubscribeOnObserver subscribeOnObserver = new io.reactivex.internal.operators.completable.CompletableSubscribeOn.SubscribeOnObserver(completableObserver, this.Camera2StreamConfigurationMap);
        completableObserver.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.getHighSpeedVideoFpsRangesFor.replace(this.getHighResolutionOutputSizeshNQ4ISI.scheduleDirect(subscribeOnObserver));
    }

    /* loaded from: classes17.dex */
    static final class SubscribeOnObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final io.reactivex.CompletableSource Camera2StreamConfigurationMap;
        final io.reactivex.CompletableObserver getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.disposables.SequentialDisposable();

        SubscribeOnObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.CompletableSource completableSource) {
            this.getHighSpeedVideoFpsRanges = completableObserver;
            this.Camera2StreamConfigurationMap = completableSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.Camera2StreamConfigurationMap.subscribe(this);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }
}
