package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeContains<T> extends io.reactivex.Single<java.lang.Boolean> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T> {
    final io.reactivex.MaybeSource<T> getHighSpeedVideoFpsRanges;
    final java.lang.Object getHighSpeedVideoFpsRangesFor;

    public MaybeContains(io.reactivex.MaybeSource<T> maybeSource, java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = maybeSource;
        this.getHighSpeedVideoFpsRangesFor = obj;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public final io.reactivex.MaybeSource<T> source() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
        this.getHighSpeedVideoFpsRanges.subscribe(new io.reactivex.internal.operators.maybe.MaybeContains.ContainsMaybeObserver(singleObserver, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class ContainsMaybeObserver implements io.reactivex.MaybeObserver<java.lang.Object>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final java.lang.Object getHighSpeedVideoFpsRangesFor;
        final io.reactivex.SingleObserver<? super java.lang.Boolean> getHighSpeedVideoSizes;

        ContainsMaybeObserver(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver, java.lang.Object obj) {
            this.getHighSpeedVideoSizes = singleObserver;
            this.getHighSpeedVideoFpsRangesFor = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap.dispose();
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(java.lang.Object obj) {
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoSizes.onSuccess(java.lang.Boolean.valueOf(io.reactivex.internal.functions.ObjectHelper.equals(obj, this.getHighSpeedVideoFpsRangesFor)));
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoSizes.onSuccess(java.lang.Boolean.FALSE);
        }
    }
}
