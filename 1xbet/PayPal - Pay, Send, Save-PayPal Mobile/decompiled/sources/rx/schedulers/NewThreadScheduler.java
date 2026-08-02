package rx.schedulers;

@java.lang.Deprecated
/* loaded from: classes18.dex */
public final class NewThreadScheduler extends rx.Scheduler {
    @Override // rx.Scheduler
    public final rx.Scheduler.Worker createWorker() {
        return null;
    }

    private NewThreadScheduler() {
        throw new java.lang.IllegalStateException("No instances!");
    }
}
