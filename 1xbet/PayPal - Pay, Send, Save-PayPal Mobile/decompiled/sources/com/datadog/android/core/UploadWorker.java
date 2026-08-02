package com.datadog.android.core;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/datadog/android/core/UploadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "()Landroidx/work/ListenableWorker$Result;", "Companion", "UploadNextBatchTask"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UploadWorker extends androidx.work.Worker {
    public static final java.lang.String DATADOG_INSTANCE_NAME = "_dd.sdk.instanceName";
    public static final java.lang.String MESSAGE_NOT_INITIALIZED = "Datadog has not been initialized.";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
    }

    @Override // androidx.work.Worker
    public final androidx.work.ListenableWorker.Result doWork() {
        com.datadog.android.api.SdkCore datadog = com.datadog.android.Datadog.getInstance(getInputData().getString(DATADOG_INSTANCE_NAME));
        com.datadog.android.core.InternalSdkCore internalSdkCore = datadog instanceof com.datadog.android.core.InternalSdkCore ? (com.datadog.android.core.InternalSdkCore) datadog : null;
        if (internalSdkCore == null || (internalSdkCore instanceof com.datadog.android.core.internal.NoOpInternalSdkCore)) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(com.datadog.android.core.internal.utils.RuntimeUtilsKt.getUnboundInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.UploadWorker$doWork$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.UploadWorker.MESSAGE_NOT_INITIALIZED;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            androidx.work.ListenableWorker.Result success = androidx.work.ListenableWorker.Result.success();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success, "");
            return success;
        }
        java.util.List<com.datadog.android.api.feature.FeatureScope> allFeatures = internalSdkCore.getAllFeatures();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.datadog.android.api.feature.FeatureScope featureScope : allFeatures) {
            com.datadog.android.core.internal.SdkFeature sdkFeature = featureScope instanceof com.datadog.android.core.internal.SdkFeature ? (com.datadog.android.core.internal.SdkFeature) featureScope : null;
            if (sdkFeature != null) {
                arrayList.add(sdkFeature);
            }
        }
        java.util.List shuffled = kotlin.collections.CollectionsKt.shuffled(arrayList);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = shuffled.iterator();
        while (it.hasNext()) {
            linkedList.offer(new com.datadog.android.core.UploadWorker.UploadNextBatchTask(linkedList, internalSdkCore, (com.datadog.android.core.internal.SdkFeature) it.next()));
        }
        while (!linkedList.isEmpty()) {
            com.datadog.android.core.UploadWorker.UploadNextBatchTask uploadNextBatchTask = (com.datadog.android.core.UploadWorker.UploadNextBatchTask) linkedList.poll();
            if (uploadNextBatchTask != null) {
                uploadNextBatchTask.run();
            }
        }
        androidx.work.ListenableWorker.Result success2 = androidx.work.ListenableWorker.Result.success();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(success2, "");
        return success2;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/core/UploadWorker$UploadNextBatchTask;", "Ljava/lang/Runnable;", "Ljava/util/Queue;", "taskQueue", "Lcom/datadog/android/core/InternalSdkCore;", "sdkCore", "Lcom/datadog/android/core/internal/SdkFeature;", "feature", "<init>", "(Ljava/util/Queue;Lcom/datadog/android/core/InternalSdkCore;Lcom/datadog/android/core/internal/SdkFeature;)V", "", "run", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/core/internal/SdkFeature;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/core/InternalSdkCore;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Ljava/util/Queue;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UploadNextBatchTask implements java.lang.Runnable {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final com.datadog.android.core.internal.SdkFeature getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final com.datadog.android.core.InternalSdkCore Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.util.Queue<com.datadog.android.core.UploadWorker.UploadNextBatchTask> getHighResolutionOutputSizeshNQ4ISI;

        public UploadNextBatchTask(java.util.Queue<com.datadog.android.core.UploadWorker.UploadNextBatchTask> queue, com.datadog.android.core.InternalSdkCore internalSdkCore, com.datadog.android.core.internal.SdkFeature sdkFeature) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queue, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalSdkCore, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkFeature, "");
            this.getHighResolutionOutputSizeshNQ4ISI = queue;
            this.Camera2StreamConfigurationMap = internalSdkCore;
            this.getHighSpeedVideoFpsRangesFor = sdkFeature;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.datadog.android.api.context.DatadogContext datadogContext$default = com.datadog.android.core.InternalSdkCore.DefaultImpls.getDatadogContext$default(this.Camera2StreamConfigurationMap, null, 1, null);
            if (datadogContext$default == null) {
                return;
            }
            com.datadog.android.core.internal.persistence.Storage storage = this.getHighSpeedVideoFpsRangesFor.getStorage();
            com.datadog.android.core.internal.data.upload.DataUploader uploader = this.getHighSpeedVideoFpsRangesFor.getUploader();
            com.datadog.android.core.internal.persistence.BatchData readNextBatch = storage.readNextBatch();
            if (readNextBatch != null) {
                com.datadog.android.core.internal.data.upload.UploadStatus upload = uploader.upload(datadogContext$default, readNextBatch.getData(), readNextBatch.getMetadata(), readNextBatch.getId());
                storage.confirmBatchRead(readNextBatch.getId(), new com.datadog.android.core.internal.metrics.RemovalReason.IntakeCode(upload.getCode()), true ^ upload.getShouldRetry());
                if (upload instanceof com.datadog.android.core.internal.data.upload.UploadStatus.Success) {
                    java.util.Queue<com.datadog.android.core.UploadWorker.UploadNextBatchTask> queue = this.getHighResolutionOutputSizeshNQ4ISI;
                    queue.offer(new com.datadog.android.core.UploadWorker.UploadNextBatchTask(queue, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor));
                }
            }
        }
    }
}
