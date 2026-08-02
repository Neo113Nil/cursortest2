package rx.schedulers;

@java.lang.Deprecated
/* loaded from: classes18.dex */
public final class ImmediateScheduler extends rx.Scheduler {
    @Override // rx.Scheduler
    public final rx.Scheduler.Worker createWorker() {
        return null;
    }

    private ImmediateScheduler() {
        throw new java.lang.IllegalStateException("No instances!");
    }
}
