package com.datadog.android.core.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\b\"\u0014\u0010\n\u001a\u00020\u00028\u0000X\u0081T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\u00028\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b\"\u0014\u0010\u0010\u001a\u00020\u00028\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b\"\u0014\u0010\u0011\u001a\u00020\u00028\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000b\"\u0014\u0010\u0012\u001a\u00020\u00028\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000b"}, d2 = {"Landroid/content/Context;", "context", "", "instanceName", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "cancelUploadWorker", "(Landroid/content/Context;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)V", "triggerUploadWorker", "CANCEL_ERROR_MESSAGE", "Ljava/lang/String;", "", "DELAY_MS", "J", "SETUP_ERROR_MESSAGE", "TAG_DATADOG_UPLOAD", "UPLOAD_WORKER_NAME", "UPLOAD_WORKER_WAS_SCHEDULED"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WorkManagerUtilsKt {
    public static final java.lang.String CANCEL_ERROR_MESSAGE = "Error cancelling the UploadWorker";
    public static final long DELAY_MS = 5000;
    public static final java.lang.String SETUP_ERROR_MESSAGE = "Error while trying to setup the UploadWorker";
    public static final java.lang.String TAG_DATADOG_UPLOAD = "DatadogBackgroundUpload";
    public static final java.lang.String UPLOAD_WORKER_NAME = "DatadogUploadWorker";
    public static final java.lang.String UPLOAD_WORKER_WAS_SCHEDULED = "UploadWorker was scheduled.";

    public static final void cancelUploadWorker(android.content.Context context, java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            androidx.work.WorkManager workManager = androidx.work.WorkManager.getInstance(context);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workManager, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DatadogBackgroundUpload/");
            sb.append(str);
            workManager.cancelAllWorkByTag(sb.toString());
        } catch (java.lang.IllegalStateException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.utils.WorkManagerUtilsKt$cancelUploadWorker$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.utils.WorkManagerUtilsKt.CANCEL_ERROR_MESSAGE;
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
        }
    }

    public static final void triggerUploadWorker(android.content.Context context, java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            androidx.work.WorkManager workManager = androidx.work.WorkManager.getInstance(context);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(workManager, "");
            androidx.work.OneTimeWorkRequest.Builder constraints = new androidx.work.OneTimeWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.datadog.android.core.UploadWorker.class).setConstraints(new androidx.work.Constraints.Builder().setRequiredNetworkType(androidx.work.NetworkType.NOT_ROAMING).build());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DatadogBackgroundUpload/");
            sb.append(str);
            androidx.work.OneTimeWorkRequest.Builder initialDelay = constraints.addTag(sb.toString()).setInitialDelay(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            androidx.work.Data build = new androidx.work.Data.Builder().putString(com.datadog.android.core.UploadWorker.DATADOG_INSTANCE_NAME, str).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            workManager.enqueueUniqueWork(UPLOAD_WORKER_NAME, androidx.work.ExistingWorkPolicy.REPLACE, initialDelay.setInputData(build).build());
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.utils.WorkManagerUtilsKt$triggerUploadWorker$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.utils.WorkManagerUtilsKt.UPLOAD_WORKER_WAS_SCHEDULED;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } catch (java.lang.Exception e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.utils.WorkManagerUtilsKt$triggerUploadWorker$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.utils.WorkManagerUtilsKt.SETUP_ERROR_MESSAGE;
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
        }
    }
}
