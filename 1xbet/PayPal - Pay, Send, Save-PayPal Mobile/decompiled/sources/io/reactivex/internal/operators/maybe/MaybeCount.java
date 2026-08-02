package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeCount<T> extends io.reactivex.Single<java.lang.Long> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T> {
    final io.reactivex.MaybeSource<T> getHighSpeedVideoSizes;

    public MaybeCount(io.reactivex.MaybeSource<T> maybeSource) {
        this.getHighSpeedVideoSizes = maybeSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public final io.reactivex.MaybeSource<T> source() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Long> singleObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.maybe.MaybeCount.CountMaybeObserver(singleObserver));
    }

    /* loaded from: classes17.dex */
    static final class CountMaybeObserver implements io.reactivex.MaybeObserver<java.lang.Object>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;
        final io.reactivex.SingleObserver<? super java.lang.Long> getHighSpeedVideoFpsRangesFor;

        CountMaybeObserver(io.reactivex.SingleObserver<? super java.lang.Long> singleObserver) {
            this.getHighSpeedVideoFpsRangesFor = singleObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRanges, disposable)) {
                this.getHighSpeedVideoFpsRanges = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(java.lang.Object obj) {
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRangesFor.onSuccess(1L);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRangesFor.onSuccess(0L);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges.dispose();
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }
    }
}
