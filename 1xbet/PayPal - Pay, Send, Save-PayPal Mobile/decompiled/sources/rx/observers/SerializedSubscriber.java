package rx.observers;

/* loaded from: classes18.dex */
public class SerializedSubscriber<T> extends rx.Subscriber<T> {
    private final rx.Observer<T> Camera2StreamConfigurationMap;

    public SerializedSubscriber(rx.Subscriber<? super T> subscriber) {
        this(subscriber, true);
    }

    public SerializedSubscriber(rx.Subscriber<? super T> subscriber, boolean z) {
        super(subscriber, z);
        this.Camera2StreamConfigurationMap = new rx.observers.SerializedObserver(subscriber);
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.Camera2StreamConfigurationMap.onCompleted();
    }

    @Override // rx.Observer
    public void onError(java.lang.Throwable th) {
        this.Camera2StreamConfigurationMap.onError(th);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.Camera2StreamConfigurationMap.onNext(t);
    }
}
