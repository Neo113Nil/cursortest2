package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeDelay<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.Scheduler Camera2StreamConfigurationMap;
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRanges;
    final long getHighSpeedVideoSizes;

    public MaybeDelay(io.reactivex.MaybeSource<T> maybeSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        super(maybeSource);
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRanges = timeUnit;
        this.Camera2StreamConfigurationMap = scheduler;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeDelay.DelayMaybeObserver(maybeObserver, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class DelayMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 5566860102500855068L;
        java.lang.Throwable Camera2StreamConfigurationMap;
        final io.reactivex.MaybeObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoFpsRanges;
        final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.TimeUnit getHighSpeedVideoSizes;
        T getHighSpeedVideoSizesFor;

        DelayMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.getHighResolutionOutputSizeshNQ4ISI = maybeObserver;
            this.getHighSpeedVideoFpsRanges = j;
            this.getHighSpeedVideoSizes = timeUnit;
            this.getHighSpeedVideoFpsRangesFor = scheduler;
        }

        @Override // java.lang.Runnable
        public final void run() {
            java.lang.Throwable th = this.Camera2StreamConfigurationMap;
            if (th != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                return;
            }
            T t = this.getHighSpeedVideoSizesFor;
            if (t != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(t);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
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

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoSizesFor = t;
            io.reactivex.internal.disposables.DisposableHelper.replace(this, this.getHighSpeedVideoFpsRangesFor.scheduleDirect(this, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes));
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = th;
            io.reactivex.internal.disposables.DisposableHelper.replace(this, this.getHighSpeedVideoFpsRangesFor.scheduleDirect(this, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes));
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            io.reactivex.internal.disposables.DisposableHelper.replace(this, this.getHighSpeedVideoFpsRangesFor.scheduleDirect(this, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes));
        }
    }
}
