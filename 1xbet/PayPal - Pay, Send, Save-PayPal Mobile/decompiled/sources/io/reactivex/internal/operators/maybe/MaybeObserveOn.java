package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeObserveOn<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.Scheduler getHighSpeedVideoSizes;

    public MaybeObserveOn(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.Scheduler scheduler) {
        super(maybeSource);
        this.getHighSpeedVideoSizes = scheduler;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeObserveOn.ObserveOnMaybeObserver(maybeObserver, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class ObserveOnMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final io.reactivex.MaybeObserver<? super T> Camera2StreamConfigurationMap;
        final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI;
        T getHighSpeedVideoFpsRanges;
        java.lang.Throwable getHighSpeedVideoSizes;

        ObserveOnMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.Scheduler scheduler) {
            this.Camera2StreamConfigurationMap = maybeObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRanges = t;
            io.reactivex.internal.disposables.DisposableHelper.replace(this, this.getHighResolutionOutputSizeshNQ4ISI.scheduleDirect(this));
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = th;
            io.reactivex.internal.disposables.DisposableHelper.replace(this, this.getHighResolutionOutputSizeshNQ4ISI.scheduleDirect(this));
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            io.reactivex.internal.disposables.DisposableHelper.replace(this, this.getHighResolutionOutputSizeshNQ4ISI.scheduleDirect(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            java.lang.Throwable th = this.getHighSpeedVideoSizes;
            if (th != null) {
                this.getHighSpeedVideoSizes = null;
                this.Camera2StreamConfigurationMap.onError(th);
                return;
            }
            T t = this.getHighSpeedVideoFpsRanges;
            if (t != null) {
                this.getHighSpeedVideoFpsRanges = null;
                this.Camera2StreamConfigurationMap.onSuccess(t);
            } else {
                this.Camera2StreamConfigurationMap.onComplete();
            }
        }
    }
}
