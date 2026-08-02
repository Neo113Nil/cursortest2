package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleFromUnsafeSource<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<T> getHighSpeedVideoSizes;

    public SingleFromUnsafeSource(io.reactivex.SingleSource<T> singleSource) {
        this.getHighSpeedVideoSizes = singleSource;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoSizes.subscribe(singleObserver);
    }
}
