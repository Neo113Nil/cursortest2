package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableEmpty extends io.reactivex.Observable<java.lang.Object> implements io.reactivex.internal.fuseable.ScalarCallable<java.lang.Object> {
    public static final io.reactivex.Observable<java.lang.Object> INSTANCE = new io.reactivex.internal.operators.observable.ObservableEmpty();

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public final java.lang.Object call() {
        return null;
    }

    private ObservableEmpty() {
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super java.lang.Object> observer) {
        io.reactivex.internal.disposables.EmptyDisposable.complete(observer);
    }
}
