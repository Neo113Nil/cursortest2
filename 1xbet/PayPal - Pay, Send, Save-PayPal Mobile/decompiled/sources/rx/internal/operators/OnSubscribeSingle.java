package rx.internal.operators;

/* loaded from: classes18.dex */
public class OnSubscribeSingle<T> implements rx.Single.OnSubscribe<T> {
    private final rx.Observable<T> Camera2StreamConfigurationMap;

    public OnSubscribeSingle(rx.Observable<T> observable) {
        this.Camera2StreamConfigurationMap = observable;
    }

    @Override // rx.functions.Action1
    public void call(final rx.SingleSubscriber<? super T> singleSubscriber) {
        rx.Subscriber<T> subscriber = new rx.Subscriber<T>() { // from class: rx.internal.operators.OnSubscribeSingle.1
            private boolean Camera2StreamConfigurationMap;
            private T getHighSpeedVideoFpsRanges;
            private boolean getHighSpeedVideoFpsRangesFor;

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void onStart() {
                request(2L);
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    return;
                }
                if (this.Camera2StreamConfigurationMap) {
                    singleSubscriber.onSuccess(this.getHighSpeedVideoFpsRanges);
                } else {
                    singleSubscriber.onError(new java.util.NoSuchElementException("Observable emitted no items"));
                }
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                singleSubscriber.onError(th);
                unsubscribe();
            }

            @Override // rx.Observer
            public void onNext(T t) {
                if (this.Camera2StreamConfigurationMap) {
                    this.getHighSpeedVideoFpsRangesFor = true;
                    singleSubscriber.onError(new java.lang.IllegalArgumentException("Observable emitted too many elements"));
                    unsubscribe();
                } else {
                    this.Camera2StreamConfigurationMap = true;
                    this.getHighSpeedVideoFpsRanges = t;
                }
            }
        };
        singleSubscriber.add(subscriber);
        this.Camera2StreamConfigurationMap.unsafeSubscribe(subscriber);
    }

    public static <T> rx.internal.operators.OnSubscribeSingle<T> create(rx.Observable<T> observable) {
        return new rx.internal.operators.OnSubscribeSingle<>(observable);
    }
}
