package io.reactivex.internal.schedulers;

/* loaded from: classes17.dex */
public final class NewThreadScheduler extends io.reactivex.Scheduler {
    private static final io.reactivex.internal.schedulers.RxThreadFactory getHighSpeedVideoSizes = new io.reactivex.internal.schedulers.RxThreadFactory("RxNewThreadScheduler", java.lang.Math.max(1, java.lang.Math.min(10, java.lang.Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    final java.util.concurrent.ThreadFactory getHighSpeedVideoFpsRangesFor;

    public NewThreadScheduler() {
        this(getHighSpeedVideoSizes);
    }

    public NewThreadScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        this.getHighSpeedVideoFpsRangesFor = threadFactory;
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.Scheduler.Worker createWorker() {
        return new io.reactivex.internal.schedulers.NewThreadWorker(this.getHighSpeedVideoFpsRangesFor);
    }
}
