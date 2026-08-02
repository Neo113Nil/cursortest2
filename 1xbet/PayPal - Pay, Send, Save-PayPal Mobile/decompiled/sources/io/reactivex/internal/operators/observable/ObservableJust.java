package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableJust<T> extends io.reactivex.Observable<T> implements io.reactivex.internal.fuseable.ScalarCallable<T> {
    private final T Camera2StreamConfigurationMap;

    public ObservableJust(T t) {
        this.Camera2StreamConfigurationMap = t;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableScalarXMap.ScalarDisposable scalarDisposable = new io.reactivex.internal.operators.observable.ObservableScalarXMap.ScalarDisposable(observer, this.Camera2StreamConfigurationMap);
        observer.onSubscribe(scalarDisposable);
        scalarDisposable.run();
    }

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public final T call() {
        return this.Camera2StreamConfigurationMap;
    }
}
