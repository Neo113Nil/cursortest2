package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeTimerPeriodically implements rx.Observable.OnSubscribe<java.lang.Long> {
    final rx.Scheduler getHighResolutionOutputSizeshNQ4ISI;
    final long getHighSpeedVideoFpsRanges;
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRangesFor;
    final long getHighSpeedVideoSizes;

    public OnSubscribeTimerPeriodically(long j, long j2, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRanges = j2;
        this.getHighSpeedVideoFpsRangesFor = timeUnit;
        this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
    }

    @Override // rx.functions.Action1
    public final void call(final rx.Subscriber<? super java.lang.Long> subscriber) {
        final rx.Scheduler.Worker createWorker = this.getHighResolutionOutputSizeshNQ4ISI.createWorker();
        subscriber.add(createWorker);
        createWorker.schedulePeriodically(new rx.functions.Action0() { // from class: rx.internal.operators.OnSubscribeTimerPeriodically.1
            long Camera2StreamConfigurationMap;

            @Override // rx.functions.Action0
            public void call() {
                try {
                    rx.Subscriber subscriber2 = subscriber;
                    long j = this.Camera2StreamConfigurationMap;
                    this.Camera2StreamConfigurationMap = 1 + j;
                    subscriber2.onNext(java.lang.Long.valueOf(j));
                } catch (java.lang.Throwable th) {
                    try {
                        createWorker.unsubscribe();
                    } finally {
                        rx.exceptions.Exceptions.throwOrReport(th, subscriber);
                    }
                }
            }
        }, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
    }
}
