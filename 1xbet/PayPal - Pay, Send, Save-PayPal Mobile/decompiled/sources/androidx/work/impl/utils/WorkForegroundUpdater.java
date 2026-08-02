package androidx.work.impl.utils;

/* loaded from: classes3.dex */
public class WorkForegroundUpdater implements androidx.work.ForegroundUpdater {
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.work.Logger.tagWithPrefix("WMFgUpdater");
    final androidx.work.impl.model.WorkSpecDao getHighResolutionOutputSizeshNQ4ISI;
    final androidx.work.impl.foreground.ForegroundProcessor getHighSpeedVideoFpsRangesFor;
    private final androidx.work.impl.utils.taskexecutor.TaskExecutor getHighSpeedVideoSizes;

    public WorkForegroundUpdater(androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.foreground.ForegroundProcessor foregroundProcessor, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor) {
        this.getHighSpeedVideoFpsRangesFor = foregroundProcessor;
        this.getHighSpeedVideoSizes = taskExecutor;
        this.getHighResolutionOutputSizeshNQ4ISI = workDatabase.workSpecDao();
    }

    @Override // androidx.work.ForegroundUpdater
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setForegroundAsync(final android.content.Context context, final java.util.UUID uuid, final androidx.work.ForegroundInfo foregroundInfo) {
        return androidx.work.ListenableFutureKt.executeAsync(this.getHighSpeedVideoSizes.getSerialTaskExecutor(), "setForegroundAsync", new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.utils.WorkForegroundUpdater$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.work.impl.utils.WorkForegroundUpdater workForegroundUpdater = androidx.work.impl.utils.WorkForegroundUpdater.this;
                java.util.UUID uuid2 = uuid;
                androidx.work.ForegroundInfo foregroundInfo2 = foregroundInfo;
                android.content.Context context2 = context;
                java.lang.String obj = uuid2.toString();
                androidx.work.impl.model.WorkSpec workSpec = workForegroundUpdater.getHighResolutionOutputSizeshNQ4ISI.getWorkSpec(obj);
                if (workSpec == null || workSpec.state.isFinished()) {
                    throw new java.lang.IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                workForegroundUpdater.getHighSpeedVideoFpsRangesFor.startForeground(obj, foregroundInfo2);
                context2.startService(androidx.work.impl.foreground.SystemForegroundDispatcher.createNotifyIntent(context2, androidx.work.impl.model.WorkSpecKt.generationalId(workSpec), foregroundInfo2));
                return null;
            }
        });
    }
}
