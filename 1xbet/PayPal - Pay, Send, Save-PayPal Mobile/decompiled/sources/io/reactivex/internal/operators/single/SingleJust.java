package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleJust<T> extends io.reactivex.Single<T> {
    final T getHighResolutionOutputSizeshNQ4ISI;

    public SingleJust(T t) {
        this.getHighResolutionOutputSizeshNQ4ISI = t;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        singleObserver.onSubscribe(io.reactivex.disposables.Disposables.disposed());
        singleObserver.onSuccess(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
