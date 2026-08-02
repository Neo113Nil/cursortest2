package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableEmpty extends io.reactivex.Completable {
    public static final io.reactivex.Completable INSTANCE = new io.reactivex.internal.operators.completable.CompletableEmpty();

    private CompletableEmpty() {
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.internal.disposables.EmptyDisposable.complete(completableObserver);
    }
}
