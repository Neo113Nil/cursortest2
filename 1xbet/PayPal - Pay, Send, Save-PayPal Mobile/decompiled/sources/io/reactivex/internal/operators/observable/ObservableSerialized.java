package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableSerialized<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    public ObservableSerialized(io.reactivex.Observable<T> observable) {
        super(observable);
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.observers.SerializedObserver(observer));
    }
}
