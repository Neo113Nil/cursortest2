package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleDetach<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<T> getHighSpeedVideoSizes;

    public SingleDetach(io.reactivex.SingleSource<T> singleSource) {
        this.getHighSpeedVideoSizes = singleSource;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.single.SingleDetach.DetachSingleObserver(singleObserver));
    }

    /* loaded from: classes17.dex */
    static final class DetachSingleObserver<T> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        io.reactivex.SingleObserver<? super T> getHighSpeedVideoSizes;

        DetachSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.getHighSpeedVideoSizes = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes = null;
            this.Camera2StreamConfigurationMap.dispose();
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap.isDisposed();
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
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            io.reactivex.SingleObserver<? super T> singleObserver = this.getHighSpeedVideoSizes;
            if (singleObserver != null) {
                this.getHighSpeedVideoSizes = null;
                singleObserver.onSuccess(t);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            io.reactivex.SingleObserver<? super T> singleObserver = this.getHighSpeedVideoSizes;
            if (singleObserver != null) {
                this.getHighSpeedVideoSizes = null;
                singleObserver.onError(th);
            }
        }
    }
}
