package rx.internal.schedulers;

/* loaded from: classes18.dex */
class SleepingAction implements rx.functions.Action0 {
    private final long Camera2StreamConfigurationMap;
    private final rx.functions.Action0 getHighSpeedVideoFpsRanges;
    private final rx.Scheduler.Worker getHighSpeedVideoFpsRangesFor;

    public SleepingAction(rx.functions.Action0 action0, rx.Scheduler.Worker worker, long j) {
        this.getHighSpeedVideoFpsRanges = action0;
        this.getHighSpeedVideoFpsRangesFor = worker;
        this.Camera2StreamConfigurationMap = j;
    }

    @Override // rx.functions.Action0
    public void call() {
        if (this.getHighSpeedVideoFpsRangesFor.isUnsubscribed()) {
            return;
        }
        long now = this.Camera2StreamConfigurationMap - this.getHighSpeedVideoFpsRangesFor.now();
        if (now > 0) {
            try {
                java.lang.Thread.sleep(now);
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
                rx.exceptions.Exceptions.propagate(e);
            }
        }
        if (this.getHighSpeedVideoFpsRangesFor.isUnsubscribed()) {
            return;
        }
        this.getHighSpeedVideoFpsRanges.call();
    }
}
