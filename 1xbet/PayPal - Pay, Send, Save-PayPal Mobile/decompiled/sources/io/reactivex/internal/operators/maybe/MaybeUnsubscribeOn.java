package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeUnsubscribeOn<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;

    public MaybeUnsubscribeOn(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.Scheduler scheduler) {
        super(maybeSource);
        this.getHighSpeedVideoFpsRangesFor = scheduler;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeUnsubscribeOn.UnsubscribeOnMaybeObserver(maybeObserver, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class UnsubscribeOnMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 3256698449646456986L;
        final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoSizes;

        UnsubscribeOnMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoSizes = maybeObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.disposables.Disposable andSet = getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
            if (andSet != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.getHighSpeedVideoFpsRanges = andSet;
                this.getHighResolutionOutputSizeshNQ4ISI.scheduleDirect(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.getHighSpeedVideoFpsRanges.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoSizes.onSuccess(t);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoSizes.onComplete();
        }
    }
}
