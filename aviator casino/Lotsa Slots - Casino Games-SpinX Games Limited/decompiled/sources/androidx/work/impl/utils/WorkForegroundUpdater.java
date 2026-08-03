package androidx.work.impl.utils;

/* loaded from: classes2.dex */
public class WorkForegroundUpdater implements androidx.work.ForegroundUpdater {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("WMFgUpdater");
    final androidx.work.impl.foreground.ForegroundProcessor mForegroundProcessor;
    private final androidx.work.impl.utils.taskexecutor.TaskExecutor mTaskExecutor;
    final androidx.work.impl.model.WorkSpecDao mWorkSpecDao;

    public WorkForegroundUpdater(androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.foreground.ForegroundProcessor foregroundProcessor, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        this.mForegroundProcessor = foregroundProcessor;
        this.mTaskExecutor = taskExecutor;
        this.mWorkSpecDao = workDatabase.workSpecDao();
    }

    @Override // androidx.work.ForegroundUpdater
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setForegroundAsync(final android.content.Context context, final java.util.UUID id, final androidx.work.ForegroundInfo foregroundInfo) {
        final androidx.work.impl.utils.futures.SettableFuture create = androidx.work.impl.utils.futures.SettableFuture.create();
        this.mTaskExecutor.executeOnTaskThread(new java.lang.Runnable() { // from class: androidx.work.impl.utils.WorkForegroundUpdater.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!create.isCancelled()) {
                        java.lang.String uuid = id.toString();
                        androidx.work.impl.model.WorkSpec workSpec = androidx.work.impl.utils.WorkForegroundUpdater.this.mWorkSpecDao.getWorkSpec(uuid);
                        if (workSpec == null || workSpec.state.isFinished()) {
                            throw new java.lang.IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        androidx.work.impl.utils.WorkForegroundUpdater.this.mForegroundProcessor.startForeground(uuid, foregroundInfo);
                        context.startService(androidx.work.impl.foreground.SystemForegroundDispatcher.createNotifyIntent(context, androidx.work.impl.model.WorkSpecKt.generationalId(workSpec), foregroundInfo));
                    }
                    create.set(null);
                } catch (java.lang.Throwable th) {
                    create.setException(th);
                }
            }
        });
        return create;
    }
}
