package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeIsEmptySingle<T> extends io.reactivex.Single<java.lang.Boolean> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T>, io.reactivex.internal.fuseable.FuseToMaybe<java.lang.Boolean> {
    final io.reactivex.MaybeSource<T> getHighResolutionOutputSizeshNQ4ISI;

    public MaybeIsEmptySingle(io.reactivex.MaybeSource<T> maybeSource) {
        this.getHighResolutionOutputSizeshNQ4ISI = maybeSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public final io.reactivex.MaybeSource<T> source() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // io.reactivex.internal.fuseable.FuseToMaybe
    public final io.reactivex.Maybe<java.lang.Boolean> fuseToMaybe() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.maybe.MaybeIsEmpty(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.maybe.MaybeIsEmptySingle.IsEmptyMaybeObserver(singleObserver));
    }

    /* loaded from: classes17.dex */
    static final class IsEmptyMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;
        final io.reactivex.SingleObserver<? super java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

        IsEmptyMaybeObserver(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
            this.getHighSpeedVideoFpsRangesFor = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges.dispose();
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRanges, disposable)) {
                this.getHighSpeedVideoFpsRanges = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRangesFor.onSuccess(java.lang.Boolean.FALSE);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRangesFor.onSuccess(java.lang.Boolean.TRUE);
        }
    }
}
