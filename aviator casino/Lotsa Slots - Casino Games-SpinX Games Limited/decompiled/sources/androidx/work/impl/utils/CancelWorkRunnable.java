package androidx.work.impl.utils;

/* loaded from: classes2.dex */
public abstract class CancelWorkRunnable implements java.lang.Runnable {
    private final androidx.work.impl.OperationImpl mOperation = new androidx.work.impl.OperationImpl();

    abstract void runInternal();

    public androidx.work.Operation getOperation() {
        return this.mOperation;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            runInternal();
            this.mOperation.markState(androidx.work.Operation.SUCCESS);
        } catch (java.lang.Throwable th) {
            this.mOperation.markState(new androidx.work.Operation.State.FAILURE(th));
        }
    }

    void cancel(androidx.work.impl.WorkManagerImpl workManagerImpl, java.lang.String workSpecId) {
        iterativelyCancelWorkAndDependents(workManagerImpl.getWorkDatabase(), workSpecId);
        workManagerImpl.getProcessor().stopAndCancelWork(workSpecId);
        java.util.Iterator<androidx.work.impl.Scheduler> it = workManagerImpl.getSchedulers().iterator();
        while (it.hasNext()) {
            it.next().cancel(workSpecId);
        }
    }

    void reschedulePendingWorkers(androidx.work.impl.WorkManagerImpl workManagerImpl) {
        androidx.work.impl.Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    private void iterativelyCancelWorkAndDependents(androidx.work.impl.WorkDatabase workDatabase, java.lang.String workSpecId) {
        androidx.work.impl.model.WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        androidx.work.impl.model.DependencyDao dependencyDao = workDatabase.dependencyDao();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(workSpecId);
        while (!linkedList.isEmpty()) {
            java.lang.String str = (java.lang.String) linkedList.remove();
            androidx.work.WorkInfo.State state = workSpecDao.getState(str);
            if (state != androidx.work.WorkInfo.State.SUCCEEDED && state != androidx.work.WorkInfo.State.FAILED) {
                workSpecDao.setState(androidx.work.WorkInfo.State.CANCELLED, str);
            }
            linkedList.addAll(dependencyDao.getDependentWorkIds(str));
        }
    }

    public static androidx.work.impl.utils.CancelWorkRunnable forId(final java.util.UUID id, final androidx.work.impl.WorkManagerImpl workManagerImpl) {
        return new androidx.work.impl.utils.CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.1
            @Override // androidx.work.impl.utils.CancelWorkRunnable
            void runInternal() {
                androidx.work.impl.WorkDatabase workDatabase = androidx.work.impl.WorkManagerImpl.this.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    cancel(androidx.work.impl.WorkManagerImpl.this, id.toString());
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    reschedulePendingWorkers(androidx.work.impl.WorkManagerImpl.this);
                } catch (java.lang.Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    public static androidx.work.impl.utils.CancelWorkRunnable forTag(final java.lang.String tag, final androidx.work.impl.WorkManagerImpl workManagerImpl) {
        return new androidx.work.impl.utils.CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.2
            @Override // androidx.work.impl.utils.CancelWorkRunnable
            void runInternal() {
                androidx.work.impl.WorkDatabase workDatabase = androidx.work.impl.WorkManagerImpl.this.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    java.util.Iterator<java.lang.String> it = workDatabase.workSpecDao().getUnfinishedWorkWithTag(tag).iterator();
                    while (it.hasNext()) {
                        cancel(androidx.work.impl.WorkManagerImpl.this, it.next());
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    reschedulePendingWorkers(androidx.work.impl.WorkManagerImpl.this);
                } catch (java.lang.Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    public static androidx.work.impl.utils.CancelWorkRunnable forName(final java.lang.String name, final androidx.work.impl.WorkManagerImpl workManagerImpl, final boolean allowReschedule) {
        return new androidx.work.impl.utils.CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.3
            @Override // androidx.work.impl.utils.CancelWorkRunnable
            void runInternal() {
                androidx.work.impl.WorkDatabase workDatabase = androidx.work.impl.WorkManagerImpl.this.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    java.util.Iterator<java.lang.String> it = workDatabase.workSpecDao().getUnfinishedWorkWithName(name).iterator();
                    while (it.hasNext()) {
                        cancel(androidx.work.impl.WorkManagerImpl.this, it.next());
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    if (allowReschedule) {
                        reschedulePendingWorkers(androidx.work.impl.WorkManagerImpl.this);
                    }
                } catch (java.lang.Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    public static androidx.work.impl.utils.CancelWorkRunnable forAll(final androidx.work.impl.WorkManagerImpl workManagerImpl) {
        return new androidx.work.impl.utils.CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.4
            @Override // androidx.work.impl.utils.CancelWorkRunnable
            void runInternal() {
                androidx.work.impl.WorkDatabase workDatabase = androidx.work.impl.WorkManagerImpl.this.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    java.util.Iterator<java.lang.String> it = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
                    while (it.hasNext()) {
                        cancel(androidx.work.impl.WorkManagerImpl.this, it.next());
                    }
                    new androidx.work.impl.utils.PreferenceUtils(androidx.work.impl.WorkManagerImpl.this.getWorkDatabase()).setLastCancelAllTimeMillis(java.lang.System.currentTimeMillis());
                    workDatabase.setTransactionSuccessful();
                } finally {
                    workDatabase.endTransaction();
                }
            }
        };
    }
}
