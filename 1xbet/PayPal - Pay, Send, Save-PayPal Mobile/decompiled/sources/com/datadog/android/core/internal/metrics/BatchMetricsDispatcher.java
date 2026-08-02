package com.datadog.android.core.internal.metrics;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u0004\u0018\u00010\"*\u00020\u00152\u0006\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u0004\u0018\u00010\u0003*\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010'\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010#\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010,\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010.R\u0016\u0010%\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010/R\u0016\u00102\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101"}, d2 = {"Lcom/datadog/android/core/internal/metrics/BatchMetricsDispatcher;", "Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "Lcom/datadog/android/core/internal/lifecycle/ProcessLifecycleMonitor$Callback;", "", "featureName", "Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;", "uploadConfiguration", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "filePersistenceConfig", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "<init>", "(Ljava/lang/String;Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/internal/time/TimeProvider;)V", "", "onPaused", "()V", "onResumed", "onStarted", "onStopped", "Ljava/io/File;", "batchFile", "Lcom/datadog/android/core/internal/metrics/BatchClosedMetadata;", "batchMetadata", "sendBatchClosedMetric", "(Ljava/io/File;Lcom/datadog/android/core/internal/metrics/BatchClosedMetadata;)V", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "removalReason", "", "numPendingBatches", "sendBatchDeletedMetric", "(Ljava/io/File;Lcom/datadog/android/core/internal/metrics/RemovalReason;I)V", "p0", "", "getHighSpeedVideoSizes", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)Ljava/lang/Long;", "Camera2StreamConfigurationMap", "(Ljava/io/File;)Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/InternalLogger;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/datadog/android/internal/time/TimeProvider;", "Ljava/lang/String;", "getOutputFormats", "Lcom/datadog/android/core/internal/configuration/DataUploadConfiguration;", "getHighSpeedVideoSizesFor", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BatchMetricsDispatcher implements com.datadog.android.core.internal.metrics.MetricsDispatcher, com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback {
    public static final java.lang.String BATCH_AGE_KEY = "batch_age";
    public static final java.lang.String BATCH_CLOSED_MESSAGE = "[Mobile Metric] Batch Closed";
    public static final java.lang.String BATCH_CLOSED_TYPE_VALUE = "batch closed";
    public static final java.lang.String BATCH_DELETED_MESSAGE = "[Mobile Metric] Batch Deleted";
    public static final java.lang.String BATCH_DELETED_TYPE_VALUE = "batch deleted";
    public static final java.lang.String BATCH_DURATION_KEY = "batch_duration";
    public static final java.lang.String BATCH_EVENTS_COUNT_KEY = "batch_events_count";
    public static final java.lang.String BATCH_REMOVAL_KEY = "batch_removal_reason";
    public static final java.lang.String BATCH_SIZE_KEY = "batch_size";
    public static final java.lang.String FILE_NAME = "filename";
    public static final java.lang.String IN_BACKGROUND_KEY = "in_background";
    public static final java.lang.String LOGS_TRACK_NAME = "logs";
    public static final java.lang.String PENDING_BATCHES = "pending_batches";
    public static final java.lang.String RUM_TRACK_NAME = "rum";
    public static final java.lang.String SR_RESOURCES_TRACK_NAME = "sr-resources";
    public static final java.lang.String SR_TRACK_NAME = "sr";
    public static final java.lang.String THREAD_NAME = "thread";
    public static final java.lang.String TRACE_TRACK_NAME = "trace";
    public static final java.lang.String TRACKING_CONSENT_KEY = "consent";
    public static final java.lang.String TRACK_KEY = "track";
    public static final java.lang.String TYPE_KEY = "metric_type";
    public static final java.lang.String UPLOADER_DELAY_KEY = "uploader_delay";
    public static final java.lang.String UPLOADER_DELAY_MAX_KEY = "max";
    public static final java.lang.String UPLOADER_DELAY_MIN_KEY = "min";
    public static final java.lang.String UPLOADER_WINDOW_KEY = "uploader_window";
    public static final java.lang.String WRONG_FILE_NAME_MESSAGE_FORMAT = "Unable to parse the file name as a timestamp: %s";
    private final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.persistence.file.FilePersistenceConfig getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.internal.time.TimeProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.configuration.DataUploadConfiguration getHighSpeedVideoSizesFor;

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public final void onStarted() {
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public final void onStopped() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r2.equals("logs") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r2.equals("rum") != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BatchMetricsDispatcher(java.lang.String str, com.datadog.android.core.internal.configuration.DataUploadConfiguration dataUploadConfiguration, com.datadog.android.core.internal.persistence.file.FilePersistenceConfig filePersistenceConfig, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.internal.time.TimeProvider timeProvider) {
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePersistenceConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        this.getHighSpeedVideoSizesFor = dataUploadConfiguration;
        this.getHighSpeedVideoFpsRanges = filePersistenceConfig;
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
        this.getHighSpeedVideoFpsRangesFor = timeProvider;
        switch (str.hashCode()) {
            case -1067396926:
                if (str.equals("tracing")) {
                    str2 = "trace";
                    break;
                }
                str2 = null;
                break;
            case 113290:
                str3 = "rum";
                break;
            case 3327407:
                str3 = "logs";
                break;
            case 456014590:
                if (str.equals("session-replay")) {
                    str2 = SR_TRACK_NAME;
                    break;
                }
                str2 = null;
                break;
            case 2144122390:
                if (str.equals("session-replay-resources")) {
                    str2 = SR_RESOURCES_TRACK_NAME;
                    break;
                }
                str2 = null;
                break;
            default:
                str2 = null;
                break;
        }
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean(true);
    }

    @Override // com.datadog.android.core.internal.metrics.MetricsDispatcher
    public final void sendBatchDeletedMetric(java.io.File batchFile, com.datadog.android.core.internal.metrics.RemovalReason removalReason, int numPendingBatches) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchFile, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removalReason, "");
        if (!removalReason.includeInMetrics$dd_sdk_android_core_release() || this.Camera2StreamConfigurationMap == null) {
            return;
        }
        java.lang.Long highSpeedVideoSizes = getHighSpeedVideoSizes(batchFile, this.getHighResolutionOutputSizeshNQ4ISI);
        java.util.Map map = null;
        map = null;
        if (highSpeedVideoSizes != null) {
            long deviceTimestampMillis = this.getHighSpeedVideoFpsRangesFor.getDeviceTimestampMillis() - highSpeedVideoSizes.longValue();
            if (deviceTimestampMillis >= 0) {
                kotlin.Pair[] pairArr = new kotlin.Pair[11];
                pairArr[0] = kotlin.TuplesKt.to("track", this.Camera2StreamConfigurationMap);
                pairArr[1] = kotlin.TuplesKt.to("metric_type", BATCH_DELETED_TYPE_VALUE);
                pairArr[2] = kotlin.TuplesKt.to(BATCH_AGE_KEY, java.lang.Long.valueOf(deviceTimestampMillis));
                kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                com.datadog.android.core.internal.configuration.DataUploadConfiguration dataUploadConfiguration = this.getHighSpeedVideoSizesFor;
                pairArr2[0] = kotlin.TuplesKt.to(UPLOADER_DELAY_MIN_KEY, dataUploadConfiguration != null ? java.lang.Long.valueOf(dataUploadConfiguration.getMinDelayMs()) : null);
                com.datadog.android.core.internal.configuration.DataUploadConfiguration dataUploadConfiguration2 = this.getHighSpeedVideoSizesFor;
                pairArr2[1] = kotlin.TuplesKt.to(UPLOADER_DELAY_MAX_KEY, dataUploadConfiguration2 != null ? java.lang.Long.valueOf(dataUploadConfiguration2.getMaxDelayMs()) : null);
                pairArr[3] = kotlin.TuplesKt.to(UPLOADER_DELAY_KEY, kotlin.collections.MapsKt.mapOf(pairArr2));
                pairArr[4] = kotlin.TuplesKt.to(UPLOADER_WINDOW_KEY, java.lang.Long.valueOf(this.getHighSpeedVideoFpsRanges.getRecentDelayMs()));
                pairArr[5] = kotlin.TuplesKt.to(BATCH_REMOVAL_KEY, removalReason.toString());
                pairArr[6] = kotlin.TuplesKt.to(IN_BACKGROUND_KEY, java.lang.Boolean.valueOf(this.getHighSpeedVideoSizes.get()));
                pairArr[7] = kotlin.TuplesKt.to(TRACKING_CONSENT_KEY, Camera2StreamConfigurationMap(batchFile));
                pairArr[8] = kotlin.TuplesKt.to("filename", batchFile.getName());
                pairArr[9] = kotlin.TuplesKt.to(PENDING_BATCHES, java.lang.Integer.valueOf(numPendingBatches));
                pairArr[10] = kotlin.TuplesKt.to(THREAD_NAME, java.lang.Thread.currentThread().getName());
                map = kotlin.collections.MapsKt.mapOf(pairArr);
            }
        }
        java.util.Map map2 = map;
        if (map2 != null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.logMetric$default(this.getHighResolutionOutputSizeshNQ4ISI, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.metrics.BatchMetricsDispatcher$sendBatchDeletedMetric$1$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.BATCH_DELETED_MESSAGE;
                }
            }, map2, 1.5f, null, 8, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // com.datadog.android.core.internal.metrics.MetricsDispatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendBatchClosedMetric(java.io.File batchFile, com.datadog.android.core.internal.metrics.BatchClosedMetadata batchMetadata) {
        java.util.Map map;
        java.util.Map map2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchFile, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchMetadata, "");
        if (this.Camera2StreamConfigurationMap == null || !com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(batchFile, this.getHighResolutionOutputSizeshNQ4ISI)) {
            return;
        }
        java.lang.Long highSpeedVideoSizes = getHighSpeedVideoSizes(batchFile, this.getHighResolutionOutputSizeshNQ4ISI);
        if (highSpeedVideoSizes != null) {
            long lastTimeWasUsedInMs$dd_sdk_android_core_release = batchMetadata.getLastTimeWasUsedInMs$dd_sdk_android_core_release() - highSpeedVideoSizes.longValue();
            if (lastTimeWasUsedInMs$dd_sdk_android_core_release >= 0) {
                map = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("track", this.Camera2StreamConfigurationMap), kotlin.TuplesKt.to("metric_type", BATCH_CLOSED_TYPE_VALUE), kotlin.TuplesKt.to(BATCH_DURATION_KEY, java.lang.Long.valueOf(lastTimeWasUsedInMs$dd_sdk_android_core_release)), kotlin.TuplesKt.to(UPLOADER_WINDOW_KEY, java.lang.Long.valueOf(this.getHighSpeedVideoFpsRanges.getRecentDelayMs())), kotlin.TuplesKt.to(BATCH_SIZE_KEY, java.lang.Long.valueOf(com.datadog.android.core.internal.persistence.file.FileExtKt.lengthSafe(batchFile, this.getHighResolutionOutputSizeshNQ4ISI))), kotlin.TuplesKt.to(BATCH_EVENTS_COUNT_KEY, java.lang.Long.valueOf(batchMetadata.getEventsCount$dd_sdk_android_core_release())), kotlin.TuplesKt.to(TRACKING_CONSENT_KEY, Camera2StreamConfigurationMap(batchFile)), kotlin.TuplesKt.to("filename", batchFile.getName()), kotlin.TuplesKt.to(THREAD_NAME, java.lang.Thread.currentThread().getName()));
                map2 = map;
                if (map2 == null) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.logMetric$default(this.getHighResolutionOutputSizeshNQ4ISI, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.metrics.BatchMetricsDispatcher$sendBatchClosedMetric$1$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.BATCH_CLOSED_MESSAGE;
                        }
                    }, map2, 1.5f, null, 8, null);
                    return;
                }
                return;
            }
        }
        map = null;
        map2 = map;
        if (map2 == null) {
        }
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public final void onResumed() {
        this.getHighSpeedVideoSizes.set(false);
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public final void onPaused() {
        this.getHighSpeedVideoSizes.set(true);
    }

    private static java.lang.Long getHighSpeedVideoSizes(final java.io.File file, com.datadog.android.api.InternalLogger internalLogger) {
        java.lang.String name2 = file.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(name2);
        if (longOrNull == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.metrics.BatchMetricsDispatcher$nameAsTimestampSafe$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.WRONG_FILE_NAME_MESSAGE_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{file.getName()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
        return longOrNull;
    }

    private static java.lang.String Camera2StreamConfigurationMap(java.io.File file) {
        java.io.File parentFile = file.getParentFile();
        java.lang.String name2 = parentFile != null ? parentFile.getName() : null;
        if (name2 == null) {
            return null;
        }
        java.lang.String str = name2;
        if (com.datadog.android.core.internal.persistence.file.advanced.FeatureFileOrchestrator.INSTANCE.getIS_PENDING_DIR_REG_EX$dd_sdk_android_core_release().matches(str)) {
            java.lang.String obj = com.datadog.android.privacy.TrackingConsent.PENDING.toString();
            java.util.Locale locale = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = obj.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return lowerCase;
        }
        if (!com.datadog.android.core.internal.persistence.file.advanced.FeatureFileOrchestrator.INSTANCE.getIS_GRANTED_DIR_REG_EX$dd_sdk_android_core_release().matches(str)) {
            return null;
        }
        java.lang.String obj2 = com.datadog.android.privacy.TrackingConsent.GRANTED.toString();
        java.util.Locale locale2 = java.util.Locale.US;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
        java.lang.String lowerCase2 = obj2.toLowerCase(locale2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return lowerCase2;
    }
}
