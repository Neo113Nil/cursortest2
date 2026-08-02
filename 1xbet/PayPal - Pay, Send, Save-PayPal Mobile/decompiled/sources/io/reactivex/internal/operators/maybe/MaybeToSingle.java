package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeToSingle<T> extends io.reactivex.Single<T> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T> {
    final T getHighSpeedVideoFpsRanges;
    final io.reactivex.MaybeSource<T> getHighSpeedVideoFpsRangesFor;

    public MaybeToSingle(io.reactivex.MaybeSource<T> maybeSource, T t) {
        this.getHighSpeedVideoFpsRangesFor = maybeSource;
        this.getHighSpeedVideoFpsRanges = t;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public final io.reactivex.MaybeSource<T> source() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.maybe.MaybeToSingle.ToSingleMaybeSubscriber(singleObserver, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class ToSingleMaybeSubscriber<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        final T getHighSpeedVideoFpsRanges;
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoSizes;

        ToSingleMaybeSubscriber(io.reactivex.SingleObserver<? super T> singleObserver, T t) {
            this.getHighSpeedVideoSizes = singleObserver;
            this.getHighSpeedVideoFpsRanges = t;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoSizes.onSuccess(t);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            T t = this.getHighSpeedVideoFpsRanges;
            if (t != null) {
                this.getHighSpeedVideoSizes.onSuccess(t);
            } else {
                this.getHighSpeedVideoSizes.onError(new java.util.NoSuchElementException("The MaybeSource is empty"));
            }
        }
    }
}
