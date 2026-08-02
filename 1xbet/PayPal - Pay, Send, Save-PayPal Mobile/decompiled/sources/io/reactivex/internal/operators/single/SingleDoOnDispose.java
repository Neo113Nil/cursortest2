package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleDoOnDispose<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Action getHighSpeedVideoFpsRanges;
    final io.reactivex.SingleSource<T> getHighSpeedVideoSizes;

    public SingleDoOnDispose(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Action action) {
        this.getHighSpeedVideoSizes = singleSource;
        this.getHighSpeedVideoFpsRanges = action;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.single.SingleDoOnDispose.DoOnDisposeObserver(singleObserver, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class DoOnDisposeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.functions.Action> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8583764624474935784L;
        final io.reactivex.SingleObserver<? super T> Camera2StreamConfigurationMap;
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;

        DoOnDisposeObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.functions.Action action) {
            this.Camera2StreamConfigurationMap = singleObserver;
            lazySet(action);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.functions.Action andSet = getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
                this.getHighResolutionOutputSizeshNQ4ISI.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
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
