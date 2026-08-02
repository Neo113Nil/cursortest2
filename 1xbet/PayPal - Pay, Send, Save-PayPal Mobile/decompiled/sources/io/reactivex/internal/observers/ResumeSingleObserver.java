package io.reactivex.internal.observers;

/* loaded from: classes17.dex */
public final class ResumeSingleObserver<T> implements io.reactivex.SingleObserver<T> {
    final io.reactivex.SingleObserver<? super T> Camera2StreamConfigurationMap;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRangesFor;

    public ResumeSingleObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference, io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoFpsRangesFor = atomicReference;
        this.Camera2StreamConfigurationMap = singleObserver;
    }

    @Override // io.reactivex.SingleObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.disposables.DisposableHelper.replace(this.getHighSpeedVideoFpsRangesFor, disposable);
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
