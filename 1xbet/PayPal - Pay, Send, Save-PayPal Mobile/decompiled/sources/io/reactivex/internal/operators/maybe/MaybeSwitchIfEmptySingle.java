package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeSwitchIfEmptySingle<T> extends io.reactivex.Single<T> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T> {
    final io.reactivex.MaybeSource<T> Camera2StreamConfigurationMap;
    final io.reactivex.SingleSource<? extends T> getHighSpeedVideoFpsRanges;

    public MaybeSwitchIfEmptySingle(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.SingleSource<? extends T> singleSource) {
        this.Camera2StreamConfigurationMap = maybeSource;
        this.getHighSpeedVideoFpsRanges = singleSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public final io.reactivex.MaybeSource<T> source() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.maybe.MaybeSwitchIfEmptySingle.SwitchIfEmptyMaybeObserver(singleObserver, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class SwitchIfEmptyMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 4603919676453758899L;
        final io.reactivex.SingleSource<? extends T> Camera2StreamConfigurationMap;
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoFpsRangesFor;

        SwitchIfEmptyMaybeObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.SingleSource<? extends T> singleSource) {
            this.getHighSpeedVideoFpsRangesFor = singleObserver;
            this.Camera2StreamConfigurationMap = singleSource;
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
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            io.reactivex.disposables.Disposable disposable = get();
            if (disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED || !compareAndSet(disposable, null)) {
                return;
            }
            this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.maybe.MaybeSwitchIfEmptySingle.SwitchIfEmptyMaybeObserver.OtherSingleObserver(this.getHighSpeedVideoFpsRangesFor, this));
        }

        static final class OtherSingleObserver<T> implements io.reactivex.SingleObserver<T> {
            final io.reactivex.SingleObserver<? super T> Camera2StreamConfigurationMap;
            final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighResolutionOutputSizeshNQ4ISI;

            OtherSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver, java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference) {
                this.Camera2StreamConfigurationMap = singleObserver;
                this.getHighResolutionOutputSizeshNQ4ISI = atomicReference;
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighResolutionOutputSizeshNQ4ISI, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(T t) {
                this.Camera2StreamConfigurationMap.onSuccess(t);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(java.lang.Throwable th) {
                this.Camera2StreamConfigurationMap.onError(th);
            }
        }
    }
}
