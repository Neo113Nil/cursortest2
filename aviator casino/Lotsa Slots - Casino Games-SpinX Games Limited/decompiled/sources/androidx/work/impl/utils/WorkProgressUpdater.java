package androidx.work.impl.utils;

/* loaded from: classes2.dex */
public class WorkProgressUpdater implements androidx.work.ProgressUpdater {
    static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("WorkProgressUpdater");
    final androidx.work.impl.utils.taskexecutor.TaskExecutor mTaskExecutor;
    final androidx.work.impl.WorkDatabase mWorkDatabase;

    public WorkProgressUpdater(androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        this.mWorkDatabase = workDatabase;
        this.mTaskExecutor = taskExecutor;
    }

    @Override // androidx.work.ProgressUpdater
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> updateProgress(final android.content.Context context, final java.util.UUID id, final androidx.work.Data data) {
        final androidx.work.impl.utils.futures.SettableFuture create = androidx.work.impl.utils.futures.SettableFuture.create();
        this.mTaskExecutor.executeOnTaskThread(new java.lang.Runnable() { // from class: androidx.work.impl.utils.WorkProgressUpdater.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.work.impl.model.WorkSpec workSpec;
                java.lang.String uuid = id.toString();
                androidx.work.Logger.get().debug(androidx.work.impl.utils.WorkProgressUpdater.TAG, "Updating progress for " + id + " (" + data + ")");
                androidx.work.impl.utils.WorkProgressUpdater.this.mWorkDatabase.beginTransaction();
                try {
                    workSpec = androidx.work.impl.utils.WorkProgressUpdater.this.mWorkDatabase.workSpecDao().getWorkSpec(uuid);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (workSpec != null) {
                    if (workSpec.state == androidx.work.WorkInfo.State.RUNNING) {
                        androidx.work.impl.utils.WorkProgressUpdater.this.mWorkDatabase.workProgressDao().insert(new androidx.work.impl.model.WorkProgress(uuid, data));
                    } else {
                        androidx.work.Logger.get().warning(androidx.work.impl.utils.WorkProgressUpdater.TAG, "Ignoring setProgressAsync(...). WorkSpec (" + uuid + ") is not in a RUNNING state.");
                    }
                    create.set(null);
                    androidx.work.impl.utils.WorkProgressUpdater.this.mWorkDatabase.setTransactionSuccessful();
                    return;
                }
                throw new java.lang.IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
        });
        return create;
    }
}
