package androidx.work.impl.utils;

/* loaded from: classes3.dex */
public class WorkProgressUpdater implements androidx.work.ProgressUpdater {
    static final java.lang.String Camera2StreamConfigurationMap = androidx.work.Logger.tagWithPrefix("WorkProgressUpdater");
    final androidx.work.impl.utils.taskexecutor.TaskExecutor getHighResolutionOutputSizeshNQ4ISI;
    final androidx.work.impl.WorkDatabase getHighSpeedVideoFpsRanges;

    public WorkProgressUpdater(androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        this.getHighSpeedVideoFpsRanges = workDatabase;
        this.getHighResolutionOutputSizeshNQ4ISI = taskExecutor;
    }

    @Override // androidx.work.ProgressUpdater
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> updateProgress(android.content.Context context, final java.util.UUID uuid, final androidx.work.Data data) {
        return androidx.work.ListenableFutureKt.executeAsync(this.getHighResolutionOutputSizeshNQ4ISI.getSerialTaskExecutor(), "updateProgress", new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.utils.WorkProgressUpdater$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.work.impl.utils.WorkProgressUpdater.this.getHighSpeedVideoFpsRangesFor(uuid, data);
            }
        });
    }

    final /* synthetic */ java.lang.Void getHighSpeedVideoFpsRangesFor(java.util.UUID uuid, androidx.work.Data data) {
        java.lang.String obj = uuid.toString();
        androidx.work.Logger logger = androidx.work.Logger.get();
        java.lang.String str = Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Updating progress for ");
        sb.append(uuid);
        sb.append(" (");
        sb.append(data);
        sb.append(")");
        logger.debug(str, sb.toString());
        this.getHighSpeedVideoFpsRanges.beginTransaction();
        try {
            androidx.work.impl.model.WorkSpec workSpec = this.getHighSpeedVideoFpsRanges.workSpecDao().getWorkSpec(obj);
            if (workSpec != null) {
                if (workSpec.state == androidx.work.WorkInfo.State.RUNNING) {
                    this.getHighSpeedVideoFpsRanges.workProgressDao().insert(new androidx.work.impl.model.WorkProgress(obj, data));
                } else {
                    androidx.work.Logger logger2 = androidx.work.Logger.get();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Ignoring setProgressAsync(...). WorkSpec (");
                    sb2.append(obj);
                    sb2.append(") is not in a RUNNING state.");
                    logger2.warning(str, sb2.toString());
                }
                this.getHighSpeedVideoFpsRanges.setTransactionSuccessful();
                this.getHighSpeedVideoFpsRanges.endTransaction();
                return null;
            }
            throw new java.lang.IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        } catch (java.lang.Throwable th) {
            try {
                androidx.work.Logger.get().error(Camera2StreamConfigurationMap, "Error updating Worker progress", th);
                throw th;
            } catch (java.lang.Throwable th2) {
                this.getHighSpeedVideoFpsRanges.endTransaction();
                throw th2;
            }
        }
    }
}
