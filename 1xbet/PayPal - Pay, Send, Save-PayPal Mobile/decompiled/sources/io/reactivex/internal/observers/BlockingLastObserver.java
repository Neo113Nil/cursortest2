package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public final class BlockingLastObserver<T> extends io.reactivex.internal.observers.BlockingBaseObserver<T> {
    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        this.getHighSpeedVideoFpsRanges = t;
    }

    @Override // io.reactivex.Observer
    public final void onError(java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRanges = null;
        this.Camera2StreamConfigurationMap = th;
        countDown();
    }
}
