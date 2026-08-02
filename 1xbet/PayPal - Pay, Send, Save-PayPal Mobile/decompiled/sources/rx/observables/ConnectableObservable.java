package rx.observables;

/* loaded from: classes18.dex */
public abstract class ConnectableObservable<T> extends rx.Observable<T> {
    public abstract void connect(rx.functions.Action1<? super rx.Subscription> action1);

    public ConnectableObservable(rx.Observable.OnSubscribe<T> onSubscribe) {
        super(onSubscribe);
    }

    public final rx.Subscription connect() {
        final rx.Subscription[] subscriptionArr = new rx.Subscription[1];
        connect(new rx.functions.Action1<rx.Subscription>() { // from class: rx.observables.ConnectableObservable.1
            @Override // rx.functions.Action1
            public /* bridge */ /* synthetic */ void call(rx.Subscription subscription) {
                subscriptionArr[0] = subscription;
            }
        });
        return subscriptionArr[0];
    }

    public rx.Observable<T> refCount() {
        return unsafeCreate(new rx.internal.operators.OnSubscribeRefCount(this));
    }

    public rx.Observable<T> autoConnect() {
        return autoConnect(1);
    }

    public rx.Observable<T> autoConnect(int i) {
        return autoConnect(i, rx.functions.Actions.empty());
    }

    public rx.Observable<T> autoConnect(int i, rx.functions.Action1<? super rx.Subscription> action1) {
        if (i <= 0) {
            connect(action1);
            return this;
        }
        return unsafeCreate(new rx.internal.operators.OnSubscribeAutoConnect(this, i, action1));
    }
}
