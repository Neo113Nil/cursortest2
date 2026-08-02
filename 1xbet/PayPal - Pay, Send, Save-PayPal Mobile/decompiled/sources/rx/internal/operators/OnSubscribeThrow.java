package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeThrow<T> implements rx.Observable.OnSubscribe<T> {
    private final java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;

    public OnSubscribeThrow(java.lang.Throwable th) {
        this.getHighResolutionOutputSizeshNQ4ISI = th;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        subscriber.onError(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
