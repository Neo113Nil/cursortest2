package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleDoAfterTerminate<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Action getHighSpeedVideoFpsRanges;
    final io.reactivex.SingleSource<T> getHighSpeedVideoSizes;

    public SingleDoAfterTerminate(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Action action) {
        this.getHighSpeedVideoSizes = singleSource;
        this.getHighSpeedVideoFpsRanges = action;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.single.SingleDoAfterTerminate.DoAfterTerminateObserver(singleObserver, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class DoAfterTerminateObserver<T> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final io.reactivex.functions.Action getHighSpeedVideoFpsRanges;
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoSizes;

        DoAfterTerminateObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.functions.Action action) {
            this.getHighSpeedVideoSizes = singleObserver;
            this.getHighSpeedVideoFpsRanges = action;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoSizes.onSuccess(t);
            try {
                this.getHighSpeedVideoFpsRanges.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.onError(th);
            try {
                this.getHighSpeedVideoFpsRanges.run();
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.plugins.RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap.isDisposed();
        }
    }
}
