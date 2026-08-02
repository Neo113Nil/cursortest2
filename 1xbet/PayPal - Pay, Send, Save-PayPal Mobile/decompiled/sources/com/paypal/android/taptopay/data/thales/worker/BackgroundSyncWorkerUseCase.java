package com.paypal.android.taptopay.data.thales.worker;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000f\u001a\u00020\u000e\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0080\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/worker/BackgroundSyncWorkerUseCase;", "", "Landroidx/work/WorkManager;", "workManager", "Landroidx/work/Constraints;", "constraints", "<init>", "(Landroidx/work/WorkManager;Landroidx/work/Constraints;)V", "Landroidx/work/ListenableWorker;", "T", "Landroidx/work/Data;", "inputData", "", "tag", "Landroidx/work/Operation;", "invoke$tap_to_pay_data_thales_release", "(Landroidx/work/Data;Ljava/lang/String;)Landroidx/work/Operation;", "getHighSpeedVideoFpsRangesFor", "Landroidx/work/Constraints;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/work/WorkManager;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BackgroundSyncWorkerUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.work.WorkManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.work.Constraints getHighResolutionOutputSizeshNQ4ISI;

    public BackgroundSyncWorkerUseCase(androidx.work.WorkManager workManager, androidx.work.Constraints constraints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraints, "");
        this.getHighSpeedVideoFpsRangesFor = workManager;
        this.getHighResolutionOutputSizeshNQ4ISI = constraints;
    }

    public static /* synthetic */ androidx.work.Operation invoke$tap_to_pay_data_thales_release$default(com.paypal.android.taptopay.data.thales.worker.BackgroundSyncWorkerUseCase backgroundSyncWorkerUseCase, androidx.work.Data data, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            data = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.paypal.android.logger.Logger.i$default(log, "New worker enqueue request received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("worker", androidx.work.ListenableWorker.class.getSimpleName()), kotlin.TuplesKt.to("tag", str)), null, 4, null);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        androidx.work.OneTimeWorkRequest.Builder builder = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) androidx.work.ListenableWorker.class);
        if (data != null) {
            builder.setInputData(data);
        }
        if (str != null) {
            builder.addTag(str);
        }
        builder.setConstraints(backgroundSyncWorkerUseCase.getHighResolutionOutputSizeshNQ4ISI);
        builder.setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, 30L, java.util.concurrent.TimeUnit.SECONDS);
        androidx.work.Operation enqueue = backgroundSyncWorkerUseCase.getHighSpeedVideoFpsRangesFor.enqueue(builder.build());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(enqueue, "");
        return enqueue;
    }

    public final /* synthetic */ <T extends androidx.work.ListenableWorker> androidx.work.Operation invoke$tap_to_pay_data_thales_release(androidx.work.Data inputData, java.lang.String tag) {
        com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.paypal.android.logger.Logger.i$default(log, "New worker enqueue request received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("worker", androidx.work.ListenableWorker.class.getSimpleName()), kotlin.TuplesKt.to("tag", tag)), null, 4, null);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        androidx.work.OneTimeWorkRequest.Builder builder = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) androidx.work.ListenableWorker.class);
        if (inputData != null) {
            builder.setInputData(inputData);
        }
        if (tag != null) {
            builder.addTag(tag);
        }
        builder.setConstraints(this.getHighResolutionOutputSizeshNQ4ISI);
        builder.setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, 30L, java.util.concurrent.TimeUnit.SECONDS);
        androidx.work.Operation enqueue = this.getHighSpeedVideoFpsRangesFor.enqueue(builder.build());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(enqueue, "");
        return enqueue;
    }
}
