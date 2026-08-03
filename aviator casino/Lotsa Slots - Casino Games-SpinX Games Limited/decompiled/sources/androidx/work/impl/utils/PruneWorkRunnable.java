package androidx.work.impl.utils;

/* loaded from: classes2.dex */
public class PruneWorkRunnable implements java.lang.Runnable {
    private final androidx.work.impl.OperationImpl mOperation = new androidx.work.impl.OperationImpl();
    private final androidx.work.impl.WorkManagerImpl mWorkManagerImpl;

    public PruneWorkRunnable(androidx.work.impl.WorkManagerImpl workManagerImpl) {
        this.mWorkManagerImpl = workManagerImpl;
    }

    public androidx.work.Operation getOperation() {
        return this.mOperation;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.mWorkManagerImpl.getWorkDatabase().workSpecDao().pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
            this.mOperation.markState(androidx.work.Operation.SUCCESS);
        } catch (java.lang.Throwable th) {
            this.mOperation.markState(new androidx.work.Operation.State.FAILURE(th));
        }
    }
}
