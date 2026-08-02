package rx.internal.operators;

/* loaded from: classes18.dex */
public enum NeverObservableHolder implements rx.Observable.OnSubscribe<java.lang.Object> {
    INSTANCE;

    static final rx.Observable<java.lang.Object> Camera2StreamConfigurationMap = rx.Observable.unsafeCreate(INSTANCE);

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super java.lang.Object> subscriber) {
    }

    public static <T> rx.Observable<T> instance() {
        return (rx.Observable<T>) Camera2StreamConfigurationMap;
    }
}
