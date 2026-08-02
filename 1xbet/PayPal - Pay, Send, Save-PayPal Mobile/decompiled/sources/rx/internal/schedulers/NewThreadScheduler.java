package rx.internal.schedulers;

/* loaded from: classes18.dex */
public final class NewThreadScheduler extends rx.Scheduler {
    private final java.util.concurrent.ThreadFactory getHighSpeedVideoSizes;

    public NewThreadScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        this.getHighSpeedVideoSizes = threadFactory;
    }

    @Override // rx.Scheduler
    public final rx.Scheduler.Worker createWorker() {
        return new rx.internal.schedulers.NewThreadWorker(this.getHighSpeedVideoSizes);
    }
}
