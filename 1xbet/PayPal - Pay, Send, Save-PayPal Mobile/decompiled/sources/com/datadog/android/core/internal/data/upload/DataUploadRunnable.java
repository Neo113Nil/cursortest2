package com.datadog.android.core.internal.data.upload;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0000\u0018\u0000 62\u00020\u0001:\u00016Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u001d\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u001a\u0010\u0013\u001a\u00020\u00128\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\u0011\u001a\u00020\u00108\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b4\u00105"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/DataUploadRunnable;", "Lcom/datadog/android/core/internal/data/upload/UploadRunnable;", "", "featureName", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "threadPoolExecutor", "Lcom/datadog/android/core/internal/persistence/Storage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "Lcom/datadog/android/core/internal/data/upload/DataUploader;", "dataUploader", "Lcom/datadog/android/core/internal/ContextProvider;", "contextProvider", "Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "networkInfoProvider", "Lcom/datadog/android/core/internal/system/SystemInfoProvider;", "systemInfoProvider", "Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "uploadSchedulerStrategy", "", "maxBatchesPerJob", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/metrics/BenchmarkUploads;", "benchmarkUploads", "<init>", "(Ljava/lang/String;Ljava/util/concurrent/ScheduledThreadPoolExecutor;Lcom/datadog/android/core/internal/persistence/Storage;Lcom/datadog/android/core/internal/data/upload/DataUploader;Lcom/datadog/android/core/internal/ContextProvider;Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;Lcom/datadog/android/core/internal/system/SystemInfoProvider;Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;ILcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/metrics/BenchmarkUploads;)V", "", "run", "()V", "Camera2StreamConfigurationMap", "Lcom/datadog/android/core/internal/metrics/BenchmarkUploads;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/core/internal/ContextProvider;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/core/internal/data/upload/DataUploader;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Lcom/datadog/android/api/InternalLogger;", com.visa.cbp.getEncExpo.warmup, "getMaxBatchesPerJob$dd_sdk_android_core_release", "()I", "getInputSizeshNQ4ISI", "Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "getInputFormats", "getOutputMinFrameDuration", "Lcom/datadog/android/core/internal/persistence/Storage;", "getOutputFormats", "Lcom/datadog/android/core/internal/system/SystemInfoProvider;", "getHighSpeedVideoSizesFor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "getUploadSchedulerStrategy$dd_sdk_android_core_release", "()Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataUploadRunnable implements com.datadog.android.core.internal.data.upload.UploadRunnable {
    public static final int LOW_BATTERY_THRESHOLD = 10;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.metrics.BenchmarkUploads getHighSpeedVideoSizes;
    private final com.datadog.android.core.internal.ContextProvider getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.android.core.internal.data.upload.DataUploader getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final java.util.concurrent.ScheduledThreadPoolExecutor getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.net.info.NetworkInfoProvider getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.system.SystemInfoProvider getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.persistence.Storage getInputSizeshNQ4ISI;
    private final int maxBatchesPerJob;
    private final com.datadog.android.core.configuration.UploadSchedulerStrategy uploadSchedulerStrategy;

    public DataUploadRunnable(java.lang.String str, java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, com.datadog.android.core.internal.persistence.Storage storage, com.datadog.android.core.internal.data.upload.DataUploader dataUploader, com.datadog.android.core.internal.ContextProvider contextProvider, com.datadog.android.core.internal.net.info.NetworkInfoProvider networkInfoProvider, com.datadog.android.core.internal.system.SystemInfoProvider systemInfoProvider, com.datadog.android.core.configuration.UploadSchedulerStrategy uploadSchedulerStrategy, int i, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.internal.metrics.BenchmarkUploads benchmarkUploads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduledThreadPoolExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataUploader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfoProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemInfoProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadSchedulerStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benchmarkUploads, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getOutputFormats = scheduledThreadPoolExecutor;
        this.getInputSizeshNQ4ISI = storage;
        this.getHighSpeedVideoFpsRanges = dataUploader;
        this.getHighResolutionOutputSizeshNQ4ISI = contextProvider;
        this.getInputFormats = networkInfoProvider;
        this.getHighSpeedVideoSizesFor = systemInfoProvider;
        this.uploadSchedulerStrategy = uploadSchedulerStrategy;
        this.maxBatchesPerJob = i;
        this.Camera2StreamConfigurationMap = internalLogger;
        this.getHighSpeedVideoSizes = benchmarkUploads;
    }

    /* renamed from: getUploadSchedulerStrategy$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.configuration.UploadSchedulerStrategy getUploadSchedulerStrategy() {
        return this.uploadSchedulerStrategy;
    }

    /* renamed from: getMaxBatchesPerJob$dd_sdk_android_core_release, reason: from getter */
    public final int getMaxBatchesPerJob() {
        return this.maxBatchesPerJob;
    }

    public /* synthetic */ DataUploadRunnable(java.lang.String str, java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, com.datadog.android.core.internal.persistence.Storage storage, com.datadog.android.core.internal.data.upload.DataUploader dataUploader, com.datadog.android.core.internal.ContextProvider contextProvider, com.datadog.android.core.internal.net.info.NetworkInfoProvider networkInfoProvider, com.datadog.android.core.internal.system.SystemInfoProvider systemInfoProvider, com.datadog.android.core.configuration.UploadSchedulerStrategy uploadSchedulerStrategy, int i, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.internal.metrics.BenchmarkUploads benchmarkUploads, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, scheduledThreadPoolExecutor, storage, dataUploader, contextProvider, networkInfoProvider, systemInfoProvider, uploadSchedulerStrategy, i, internalLogger, (i2 & 1024) != 0 ? new com.datadog.android.core.internal.metrics.BenchmarkUploads(null, 1, null) : benchmarkUploads);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        com.datadog.android.core.internal.data.upload.UploadStatus uploadStatus;
        com.datadog.android.core.internal.metrics.RemovalReason.IntakeCode intakeCode;
        int i = 0;
        if (this.getInputFormats.getCamera2StreamConfigurationMap().getConnectivity() != com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED) {
            com.datadog.android.core.internal.system.SystemInfo getHighSpeedVideoSizes = this.getHighSpeedVideoSizesFor.getGetHighSpeedVideoSizes();
            if ((getHighSpeedVideoSizes.getBatteryFullOrCharging() || getHighSpeedVideoSizes.getOnExternalPowerSource() || getHighSpeedVideoSizes.getBatteryLevel() > 10) && !getHighSpeedVideoSizes.getPowerSaveMode()) {
                com.datadog.android.api.context.DatadogContext context = this.getHighResolutionOutputSizeshNQ4ISI.getContext(kotlin.collections.SetsKt.emptySet());
                int i2 = this.maxBatchesPerJob;
                int i3 = 0;
                do {
                    this.getHighSpeedVideoSizes.incrementBenchmarkUploadsCount$dd_sdk_android_core_release(this.getHighSpeedVideoFpsRangesFor);
                    i2--;
                    com.datadog.android.core.internal.persistence.BatchData readNextBatch = this.getInputSizeshNQ4ISI.readNextBatch();
                    if (readNextBatch != null) {
                        com.datadog.android.core.internal.persistence.BatchId id = readNextBatch.getId();
                        java.util.List<com.datadog.android.api.storage.RawBatchEvent> data = readNextBatch.getData();
                        uploadStatus = this.getHighSpeedVideoFpsRanges.upload(context, data, readNextBatch.getMetadata(), id);
                        if (uploadStatus instanceof com.datadog.android.core.internal.data.upload.UploadStatus.Success) {
                            java.util.Iterator<T> it = data.iterator();
                            int i4 = 0;
                            while (it.hasNext()) {
                                i4 += ((com.datadog.android.api.storage.RawBatchEvent) it.next()).getData().length;
                            }
                            this.getHighSpeedVideoSizes.sendBenchmarkBytesUploaded$dd_sdk_android_core_release(this.getHighSpeedVideoFpsRangesFor, i4);
                        }
                        if (uploadStatus instanceof com.datadog.android.core.internal.data.upload.UploadStatus.RequestCreationError) {
                            intakeCode = com.datadog.android.core.internal.metrics.RemovalReason.Invalid.INSTANCE;
                        } else {
                            intakeCode = new com.datadog.android.core.internal.metrics.RemovalReason.IntakeCode(uploadStatus.getCode());
                        }
                        this.getInputSizeshNQ4ISI.confirmBatchRead(id, intakeCode, !uploadStatus.getShouldRetry());
                    } else {
                        uploadStatus = null;
                    }
                    if (uploadStatus != null) {
                        i3++;
                    }
                    if (i2 <= 0) {
                        break;
                    }
                } while (uploadStatus instanceof com.datadog.android.core.internal.data.upload.UploadStatus.Success);
                i = i3;
                long msDelayUntilNextUpload = this.uploadSchedulerStrategy.getMsDelayUntilNextUpload(this.getHighSpeedVideoFpsRangesFor, i, uploadStatus == null ? java.lang.Integer.valueOf(uploadStatus.getCode()) : null, uploadStatus != null ? uploadStatus.getThrowable() : null);
                com.datadog.android.core.internal.data.upload.DataUploadRunnable dataUploadRunnable = this;
                this.getOutputFormats.remove(dataUploadRunnable);
                java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.getOutputFormats;
                java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(": data upload");
                com.datadog.android.core.internal.utils.ConcurrencyExtKt.scheduleSafe(scheduledThreadPoolExecutor, sb.toString(), msDelayUntilNextUpload, java.util.concurrent.TimeUnit.MILLISECONDS, this.Camera2StreamConfigurationMap, dataUploadRunnable);
            }
        }
        uploadStatus = null;
        long msDelayUntilNextUpload2 = this.uploadSchedulerStrategy.getMsDelayUntilNextUpload(this.getHighSpeedVideoFpsRangesFor, i, uploadStatus == null ? java.lang.Integer.valueOf(uploadStatus.getCode()) : null, uploadStatus != null ? uploadStatus.getThrowable() : null);
        com.datadog.android.core.internal.data.upload.DataUploadRunnable dataUploadRunnable2 = this;
        this.getOutputFormats.remove(dataUploadRunnable2);
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = this.getOutputFormats;
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str2);
        sb2.append(": data upload");
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.scheduleSafe(scheduledThreadPoolExecutor2, sb2.toString(), msDelayUntilNextUpload2, java.util.concurrent.TimeUnit.MILLISECONDS, this.Camera2StreamConfigurationMap, dataUploadRunnable2);
    }
}
