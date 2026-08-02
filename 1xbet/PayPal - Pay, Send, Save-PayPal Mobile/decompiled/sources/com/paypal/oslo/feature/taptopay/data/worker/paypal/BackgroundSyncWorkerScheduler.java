package com.paypal.oslo.feature.taptopay.data.worker.paypal;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u00020\f\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0080\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/worker/paypal/BackgroundSyncWorkerScheduler;", "", "Landroidx/work/WorkManager;", "workManager", "Landroidx/work/Constraints;", "constraints", "<init>", "(Landroidx/work/WorkManager;Landroidx/work/Constraints;)V", "Landroidx/work/ListenableWorker;", "T", "Landroidx/work/Data;", "inputData", "Landroidx/work/Operation;", "invoke$taptopay_prodRelease", "(Landroidx/work/Data;)Landroidx/work/Operation;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/work/WorkManager;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/work/Constraints;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BackgroundSyncWorkerScheduler {
    public static final java.lang.String TAG_BACKGROUND_SYNC_WORK = "ttp-pp-data-background-sync-work";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.work.WorkManager getHighSpeedVideoFpsRanges;
    private final androidx.work.Constraints getHighSpeedVideoSizes;
    public static final int $stable = 8;

    @javax.inject.Inject
    public BackgroundSyncWorkerScheduler(androidx.work.WorkManager workManager, androidx.work.Constraints constraints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "");
        this.getHighSpeedVideoFpsRanges = workManager;
        this.getHighSpeedVideoSizes = constraints;
    }

    public static /* synthetic */ androidx.work.Operation invoke$taptopay_prodRelease$default(com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler backgroundSyncWorkerScheduler, androidx.work.Data data, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            data = null;
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.paypal.android.logger.Logger.i$default(logger, "New worker enqueue request received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("worker", androidx.work.ListenableWorker.class.getSimpleName())), null, 4, null);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        androidx.work.OneTimeWorkRequest.Builder builder = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) androidx.work.ListenableWorker.class);
        if (data != null) {
            builder.setInputData(data);
        }
        builder.addTag(TAG_BACKGROUND_SYNC_WORK);
        builder.setConstraints(backgroundSyncWorkerScheduler.getHighSpeedVideoSizes);
        builder.setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, 30L, java.util.concurrent.TimeUnit.SECONDS);
        return backgroundSyncWorkerScheduler.getHighSpeedVideoFpsRanges.enqueue(builder.build());
    }

    public final /* synthetic */ <T extends androidx.work.ListenableWorker> androidx.work.Operation invoke$taptopay_prodRelease(androidx.work.Data inputData) {
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.paypal.android.logger.Logger.i$default(logger, "New worker enqueue request received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("worker", androidx.work.ListenableWorker.class.getSimpleName())), null, 4, null);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        androidx.work.OneTimeWorkRequest.Builder builder = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) androidx.work.ListenableWorker.class);
        if (inputData != null) {
            builder.setInputData(inputData);
        }
        builder.addTag(TAG_BACKGROUND_SYNC_WORK);
        builder.setConstraints(this.getHighSpeedVideoSizes);
        builder.setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, 30L, java.util.concurrent.TimeUnit.SECONDS);
        return this.getHighSpeedVideoFpsRanges.enqueue(builder.build());
    }
}
