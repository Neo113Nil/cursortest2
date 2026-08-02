package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeDelaySubscription<T> implements rx.Observable.OnSubscribe<T> {
    final long Camera2StreamConfigurationMap;
    final java.util.concurrent.TimeUnit getHighResolutionOutputSizeshNQ4ISI;
    final rx.Observable<? extends T> getHighSpeedVideoFpsRangesFor;
    final rx.Scheduler getHighSpeedVideoSizes;

    public OnSubscribeDelaySubscription(rx.Observable<? extends T> observable, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        this.getHighSpeedVideoFpsRangesFor = observable;
        this.Camera2StreamConfigurationMap = j;
        this.getHighResolutionOutputSizeshNQ4ISI = timeUnit;
        this.getHighSpeedVideoSizes = scheduler;
    }

    @Override // rx.functions.Action1
    public final void call(final rx.Subscriber<? super T> subscriber) {
        rx.Scheduler.Worker createWorker = this.getHighSpeedVideoSizes.createWorker();
        subscriber.add(createWorker);
        createWorker.schedule(new rx.functions.Action0() { // from class: rx.internal.operators.OnSubscribeDelaySubscription.1
            @Override // rx.functions.Action0
            public void call() {
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                rx.internal.operators.OnSubscribeDelaySubscription.this.getHighSpeedVideoFpsRangesFor.unsafeSubscribe(rx.observers.Subscribers.wrap(subscriber));
            }
        }, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
