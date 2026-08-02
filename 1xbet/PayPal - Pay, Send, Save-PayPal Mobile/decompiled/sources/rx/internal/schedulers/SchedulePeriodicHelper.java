package rx.internal.schedulers;

/* loaded from: classes18.dex */
public final class SchedulePeriodicHelper {
    public static final long CLOCK_DRIFT_TOLERANCE_NANOS = java.util.concurrent.TimeUnit.MINUTES.toNanos(java.lang.Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    public interface NowNanoSupplier {
        long nowNanos();
    }

    private SchedulePeriodicHelper() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static rx.Subscription schedulePeriodically(rx.Scheduler.Worker worker, rx.functions.Action0 action0, long j, long j2, java.util.concurrent.TimeUnit timeUnit, rx.internal.schedulers.SchedulePeriodicHelper.NowNanoSupplier nowNanoSupplier) {
        long nanos = timeUnit.toNanos(j2);
        long nowNanos = nowNanoSupplier != null ? nowNanoSupplier.nowNanos() : java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(worker.now());
        long nanos2 = timeUnit.toNanos(j);
        rx.internal.subscriptions.SequentialSubscription sequentialSubscription = new rx.internal.subscriptions.SequentialSubscription();
        rx.internal.subscriptions.SequentialSubscription sequentialSubscription2 = new rx.internal.subscriptions.SequentialSubscription(sequentialSubscription);
        sequentialSubscription.replace(worker.schedule(new rx.functions.Action0(nowNanos, nanos2 + nowNanos, action0, sequentialSubscription2, nowNanoSupplier, worker, nanos) { // from class: rx.internal.schedulers.SchedulePeriodicHelper.1
            final /* synthetic */ long Camera2StreamConfigurationMap;
            long getHighResolutionOutputSizeshNQ4ISI;
            long getHighSpeedVideoFpsRanges;
            long getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ rx.functions.Action0 getHighSpeedVideoSizes;
            final /* synthetic */ rx.internal.schedulers.SchedulePeriodicHelper.NowNanoSupplier getHighSpeedVideoSizesFor;
            final /* synthetic */ long getInputFormats;
            final /* synthetic */ rx.internal.subscriptions.SequentialSubscription getInputSizeshNQ4ISI;
            final /* synthetic */ rx.Scheduler.Worker getOutputFormats;
            final /* synthetic */ long getOutputMinFrameDuration;

            {
                this.Camera2StreamConfigurationMap = nowNanos;
                this.getOutputMinFrameDuration = r3;
                this.getHighSpeedVideoSizes = action0;
                this.getInputSizeshNQ4ISI = sequentialSubscription2;
                this.getHighSpeedVideoSizesFor = nowNanoSupplier;
                this.getOutputFormats = worker;
                this.getInputFormats = nanos;
                this.getHighSpeedVideoFpsRangesFor = nowNanos;
                this.getHighSpeedVideoFpsRanges = r3;
            }

            @Override // rx.functions.Action0
            public final void call() {
                long j3;
                this.getHighSpeedVideoSizes.call();
                if (this.getInputSizeshNQ4ISI.isUnsubscribed()) {
                    return;
                }
                rx.internal.schedulers.SchedulePeriodicHelper.NowNanoSupplier nowNanoSupplier2 = this.getHighSpeedVideoSizesFor;
                long nowNanos2 = nowNanoSupplier2 != null ? nowNanoSupplier2.nowNanos() : java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(this.getOutputFormats.now());
                long j4 = rx.internal.schedulers.SchedulePeriodicHelper.CLOCK_DRIFT_TOLERANCE_NANOS;
                long j5 = this.getHighSpeedVideoFpsRangesFor;
                if (j4 + nowNanos2 < j5 || nowNanos2 >= j5 + this.getInputFormats + rx.internal.schedulers.SchedulePeriodicHelper.CLOCK_DRIFT_TOLERANCE_NANOS) {
                    long j6 = this.getInputFormats;
                    long j7 = nowNanos2 + j6;
                    long j8 = this.getHighResolutionOutputSizeshNQ4ISI + 1;
                    this.getHighResolutionOutputSizeshNQ4ISI = j8;
                    this.getHighSpeedVideoFpsRanges = j7 - (j6 * j8);
                    j3 = j7;
                } else {
                    long j9 = this.getHighSpeedVideoFpsRanges;
                    long j10 = this.getHighResolutionOutputSizeshNQ4ISI + 1;
                    this.getHighResolutionOutputSizeshNQ4ISI = j10;
                    j3 = j9 + (j10 * this.getInputFormats);
                }
                this.getHighSpeedVideoFpsRangesFor = nowNanos2;
                this.getInputSizeshNQ4ISI.replace(this.getOutputFormats.schedule(this, j3 - nowNanos2, java.util.concurrent.TimeUnit.NANOSECONDS));
            }
        }, j, timeUnit));
        return sequentialSubscription2;
    }
}
