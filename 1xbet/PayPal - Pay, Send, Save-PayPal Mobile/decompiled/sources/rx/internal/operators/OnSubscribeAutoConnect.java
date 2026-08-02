package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeAutoConnect<T> extends java.util.concurrent.atomic.AtomicInteger implements rx.Observable.OnSubscribe<T> {
    final rx.functions.Action1<? super rx.Subscription> Camera2StreamConfigurationMap;
    final int getHighSpeedVideoFpsRanges;
    final rx.observables.ConnectableObservable<? extends T> getHighSpeedVideoFpsRangesFor;

    public OnSubscribeAutoConnect(rx.observables.ConnectableObservable<? extends T> connectableObservable, int i, rx.functions.Action1<? super rx.Subscription> action1) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("numberOfSubscribers > 0 required");
        }
        this.getHighSpeedVideoFpsRangesFor = connectableObservable;
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = action1;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        this.getHighSpeedVideoFpsRangesFor.unsafeSubscribe(rx.observers.Subscribers.wrap(subscriber));
        if (incrementAndGet() == this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRangesFor.connect(this.Camera2StreamConfigurationMap);
        }
    }
}
