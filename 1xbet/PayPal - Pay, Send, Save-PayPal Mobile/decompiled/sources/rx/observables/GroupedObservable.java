package rx.observables;

/* loaded from: classes18.dex */
public class GroupedObservable<K, T> extends rx.Observable<T> {
    private final K Camera2StreamConfigurationMap;

    public static <K, T> rx.observables.GroupedObservable<K, T> from(K k, final rx.Observable<T> observable) {
        return new rx.observables.GroupedObservable<>(k, new rx.Observable.OnSubscribe<T>() { // from class: rx.observables.GroupedObservable.1
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(java.lang.Object obj) {
                rx.Observable.this.unsafeSubscribe((rx.Subscriber) obj);
            }
        });
    }

    public static <K, T> rx.observables.GroupedObservable<K, T> create(K k, rx.Observable.OnSubscribe<T> onSubscribe) {
        return new rx.observables.GroupedObservable<>(k, onSubscribe);
    }

    public GroupedObservable(K k, rx.Observable.OnSubscribe<T> onSubscribe) {
        super(onSubscribe);
        this.Camera2StreamConfigurationMap = k;
    }

    public K getKey() {
        return this.Camera2StreamConfigurationMap;
    }
}
