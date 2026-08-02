package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableFromUnsafeSource extends io.reactivex.Completable {
    final io.reactivex.CompletableSource getHighSpeedVideoSizes;

    public CompletableFromUnsafeSource(io.reactivex.CompletableSource completableSource) {
        this.getHighSpeedVideoSizes = completableSource;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.getHighSpeedVideoSizes.subscribe(completableObserver);
    }
}
