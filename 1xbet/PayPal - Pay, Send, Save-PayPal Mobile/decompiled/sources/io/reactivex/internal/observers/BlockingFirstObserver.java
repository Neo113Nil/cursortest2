package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public final class BlockingFirstObserver<T> extends io.reactivex.internal.observers.BlockingBaseObserver<T> {
    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = t;
            this.getHighSpeedVideoFpsRangesFor.dispose();
            countDown();
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(java.lang.Throwable th) {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.Camera2StreamConfigurationMap = th;
        }
        countDown();
    }
}
