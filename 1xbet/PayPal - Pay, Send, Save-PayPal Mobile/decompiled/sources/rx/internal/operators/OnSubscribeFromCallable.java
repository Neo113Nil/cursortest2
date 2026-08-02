package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeFromCallable<T> implements rx.Observable.OnSubscribe<T> {
    private final java.util.concurrent.Callable<? extends T> getHighSpeedVideoSizes;

    public OnSubscribeFromCallable(java.util.concurrent.Callable<? extends T> callable) {
        this.getHighSpeedVideoSizes = callable;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        rx.internal.producers.SingleDelayedProducer singleDelayedProducer = new rx.internal.producers.SingleDelayedProducer(subscriber);
        subscriber.setProducer(singleDelayedProducer);
        try {
            singleDelayedProducer.setValue(this.getHighSpeedVideoSizes.call());
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwOrReport(th, subscriber);
        }
    }
}
