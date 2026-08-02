package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableToFlowable<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.CompletableSource getHighSpeedVideoFpsRangesFor;

    public CompletableToFlowable(io.reactivex.CompletableSource completableSource) {
        this.getHighSpeedVideoFpsRangesFor = completableSource;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.observers.SubscriberCompletableObserver(subscriber));
    }
}
