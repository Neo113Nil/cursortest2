package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeTimerOnce implements rx.Observable.OnSubscribe<java.lang.Long> {
    final rx.Scheduler Camera2StreamConfigurationMap;
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRanges;
    final long getHighSpeedVideoFpsRangesFor;

    public OnSubscribeTimerOnce(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoFpsRanges = timeUnit;
        this.Camera2StreamConfigurationMap = scheduler;
    }

    @Override // rx.functions.Action1
    public final void call(final rx.Subscriber<? super java.lang.Long> subscriber) {
        rx.Scheduler.Worker createWorker = this.Camera2StreamConfigurationMap.createWorker();
        subscriber.add(createWorker);
        createWorker.schedule(new rx.functions.Action0() { // from class: rx.internal.operators.OnSubscribeTimerOnce.1
            @Override // rx.functions.Action0
            public void call() {
                try {
                    subscriber.onNext(0L);
                    subscriber.onCompleted();
                } catch (java.lang.Throwable th) {
                    rx.exceptions.Exceptions.throwOrReport(th, subscriber);
                }
            }
        }, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
    }
}
