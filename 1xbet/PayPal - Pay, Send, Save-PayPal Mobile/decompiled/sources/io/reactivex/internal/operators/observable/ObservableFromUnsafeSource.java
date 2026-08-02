package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableFromUnsafeSource<T> extends io.reactivex.Observable<T> {
    final io.reactivex.ObservableSource<T> getHighSpeedVideoSizes;

    public ObservableFromUnsafeSource(io.reactivex.ObservableSource<T> observableSource) {
        this.getHighSpeedVideoSizes = observableSource;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.getHighSpeedVideoSizes.subscribe(observer);
    }
}
