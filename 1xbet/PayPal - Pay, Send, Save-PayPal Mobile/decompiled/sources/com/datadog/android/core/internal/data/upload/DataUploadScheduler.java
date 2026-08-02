package com.datadog.android.core.internal.data.upload;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\u00020!8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010&"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/DataUploadScheduler;", "Lcom/datadog/android/core/internal/data/upload/UploadScheduler;", "", "featureName", "Lcom/datadog/android/core/internal/persistence/Storage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "Lcom/datadog/android/core/internal/data/upload/DataUploader;", "dataUploader", "Lcom/datadog/android/core/internal/ContextProvider;", "contextProvider", "Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "networkInfoProvider", "Lcom/datadog/android/core/internal/system/SystemInfoProvider;", "systemInfoProvider", "Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "uploadSchedulerStrategy", "", "maxBatchesPerJob", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "scheduledThreadPoolExecutor", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Ljava/lang/String;Lcom/datadog/android/core/internal/persistence/Storage;Lcom/datadog/android/core/internal/data/upload/DataUploader;Lcom/datadog/android/core/internal/ContextProvider;Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;Lcom/datadog/android/core/internal/system/SystemInfoProvider;Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;ILjava/util/concurrent/ScheduledThreadPoolExecutor;Lcom/datadog/android/api/InternalLogger;)V", "", "startScheduling", "()V", "stopScheduling", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/datadog/android/api/InternalLogger;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/core/internal/data/upload/DataUploadRunnable;", "runnable", "Lcom/datadog/android/core/internal/data/upload/DataUploadRunnable;", "getRunnable$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/data/upload/DataUploadRunnable;", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataUploadScheduler implements com.datadog.android.core.internal.data.upload.UploadScheduler {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.ScheduledThreadPoolExecutor getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap;
    private final com.datadog.android.core.internal.data.upload.DataUploadRunnable runnable;

    public DataUploadScheduler(java.lang.String str, com.datadog.android.core.internal.persistence.Storage storage, com.datadog.android.core.internal.data.upload.DataUploader dataUploader, com.datadog.android.core.internal.ContextProvider contextProvider, com.datadog.android.core.internal.net.info.NetworkInfoProvider networkInfoProvider, com.datadog.android.core.internal.system.SystemInfoProvider systemInfoProvider, com.datadog.android.core.configuration.UploadSchedulerStrategy uploadSchedulerStrategy, int i, java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataUploader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfoProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemInfoProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadSchedulerStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduledThreadPoolExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = scheduledThreadPoolExecutor;
        this.Camera2StreamConfigurationMap = internalLogger;
        this.runnable = new com.datadog.android.core.internal.data.upload.DataUploadRunnable(str, scheduledThreadPoolExecutor, storage, dataUploader, contextProvider, networkInfoProvider, systemInfoProvider, uploadSchedulerStrategy, i, internalLogger, null, 1024, null);
    }

    /* renamed from: getRunnable$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.data.upload.DataUploadRunnable getRunnable() {
        return this.runnable;
    }

    @Override // com.datadog.android.core.internal.data.upload.UploadScheduler
    public final void startScheduling() {
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": data upload");
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(scheduledThreadPoolExecutor, sb.toString(), this.Camera2StreamConfigurationMap, this.runnable);
    }

    @Override // com.datadog.android.core.internal.data.upload.UploadScheduler
    public final void stopScheduling() {
        this.getHighResolutionOutputSizeshNQ4ISI.remove(this.runnable);
    }
}
