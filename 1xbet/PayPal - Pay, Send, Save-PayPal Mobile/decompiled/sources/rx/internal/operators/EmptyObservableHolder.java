package rx.internal.operators;

/* loaded from: classes18.dex */
public enum EmptyObservableHolder implements rx.Observable.OnSubscribe<java.lang.Object> {
    INSTANCE;

    static final rx.Observable<java.lang.Object> getHighSpeedVideoFpsRangesFor = rx.Observable.unsafeCreate(INSTANCE);

    public static <T> rx.Observable<T> instance() {
        return (rx.Observable<T>) getHighSpeedVideoFpsRangesFor;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super java.lang.Object> subscriber) {
        subscriber.onCompleted();
    }
}
