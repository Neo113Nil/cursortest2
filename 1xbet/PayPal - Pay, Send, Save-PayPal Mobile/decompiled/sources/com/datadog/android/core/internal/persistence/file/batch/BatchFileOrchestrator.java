package com.datadog.android.core.internal.persistence.file.batch;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 A2\u00020\u0001:\u0002BAB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0002¢\u0006\u0004\b\u0017\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u0004\u0018\u00010\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u0011\u0010'\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0002¢\u0006\u0004\b,\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010/R\u0018\u0010*\u001a\u000600R\u00020\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u00101R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u00102R\u0016\u00104\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u00103R\u0016\u0010,\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u00105R\u0014\u00108\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00106\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u00103R\u0014\u0010:\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u00103R\u0014\u0010<\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u00103R\u0014\u0010=\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u00109R\u0014\u0010@\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010>\u001a\u00020\u0002*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010 "}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileOrchestrator;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "Ljava/io/File;", "rootDir", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "config", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "metricsDispatcher", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "Ljava/util/concurrent/atomic/AtomicInteger;", "pendingFiles", "<init>", "(Ljava/io/File;Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;Lcom/datadog/android/internal/time/TimeProvider;Ljava/util/concurrent/atomic/AtomicInteger;)V", "", "decrementAndGetPendingFilesCount", "()I", "p0", "", "p1", "", "getHighSpeedVideoSizes", "(Ljava/io/File;Z)J", "", "(Ljava/util/List;)Ljava/util/List;", "getAllFiles", "()Ljava/util/List;", "getFlushableFiles", "file", "getMetadataFile", "(Ljava/io/File;)Ljava/io/File;", "", "excludeFiles", "getReadableFile", "(Ljava/util/Set;)Ljava/io/File;", "getRootDir", "()Ljava/io/File;", "getWritableFile", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/io/File;J)Z", "getHighSpeedVideoFpsRangesFor", "()Z", "Camera2StreamConfigurationMap", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "getConfig$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileOrchestrator$BatchFileFilter;", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileOrchestrator$BatchFileFilter;", "Lcom/datadog/android/api/InternalLogger;", "J", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "getInputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicInteger;", "getOutputFormats", "Ljava/io/File;", "getOutputMinFrameDuration", "getInputFormats", "getHighSpeedVideoSizesFor", "getOutputMinFrameDurationlomOqCM", "getOutputSizes", "Lcom/datadog/android/internal/time/TimeProvider;", "getOutputStallDuration", "Companion", "BatchFileFilter"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BatchFileOrchestrator implements com.datadog.android.core.internal.persistence.file.FileOrchestrator {
    public static final java.lang.String DEBUG_DIFFERENT_ROOT = "The file provided (%s) doesn't belong to the current folder (%s)";
    public static final double DECREASE_PERCENT = 0.95d;
    public static final java.lang.String ERROR_CANT_CREATE_ROOT = "The provided root dir can't be created: %s";
    public static final java.lang.String ERROR_DISK_FULL = "Too much disk space used (%d/%d): cleaning up to free %d bytes…";
    public static final java.lang.String ERROR_NOT_BATCH_FILE = "The file provided is not a batch file: %s";
    public static final java.lang.String ERROR_ROOT_NOT_DIR = "The provided root file is not a directory: %s";
    public static final java.lang.String ERROR_ROOT_NOT_WRITABLE = "The provided root dir is not writable: %s";
    public static final double INCREASE_PERCENT = 1.05d;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.metrics.MetricsDispatcher getHighSpeedVideoSizes;
    private final com.datadog.android.core.internal.persistence.file.FilePersistenceConfig config;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator.BatchFileFilter getHighSpeedVideoFpsRangesFor;
    private final long getHighSpeedVideoSizesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final long getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicInteger getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private java.io.File getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private long getInputFormats;
    private final java.io.File getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final com.datadog.android.internal.time.TimeProvider getOutputStallDuration;

    public BatchFileOrchestrator(java.io.File file, com.datadog.android.core.internal.persistence.file.FilePersistenceConfig filePersistenceConfig, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.internal.metrics.MetricsDispatcher metricsDispatcher, com.datadog.android.internal.time.TimeProvider timeProvider, java.util.concurrent.atomic.AtomicInteger atomicInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePersistenceConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicInteger, "");
        this.getOutputMinFrameDurationlomOqCM = file;
        this.config = filePersistenceConfig;
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
        this.getHighSpeedVideoSizes = metricsDispatcher;
        this.getOutputStallDuration = timeProvider;
        this.getOutputFormats = atomicInteger;
        this.getHighSpeedVideoFpsRangesFor = new com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator.BatchFileFilter();
        this.getOutputMinFrameDuration = kotlin.math.MathKt.roundToLong(filePersistenceConfig.getRecentDelayMs() * 1.05d);
        this.getHighSpeedVideoSizesFor = kotlin.math.MathKt.roundToLong(filePersistenceConfig.getRecentDelayMs() * 0.95d);
    }

    /* renamed from: getConfig$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.FilePersistenceConfig getConfig() {
        return this.config;
    }

    public /* synthetic */ BatchFileOrchestrator(java.io.File file, com.datadog.android.core.internal.persistence.file.FilePersistenceConfig filePersistenceConfig, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.internal.metrics.MetricsDispatcher metricsDispatcher, com.datadog.android.internal.time.TimeProvider timeProvider, java.util.concurrent.atomic.AtomicInteger atomicInteger, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(file, filePersistenceConfig, internalLogger, metricsDispatcher, timeProvider, (i & 32) != 0 ? new java.util.concurrent.atomic.AtomicInteger(0) : atomicInteger);
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.io.File getWritableFile() {
        java.io.File file = null;
        if (!getHighSpeedVideoFpsRangesFor()) {
            return null;
        }
        if (this.getOutputStallDuration.getDeviceTimestampMillis() - this.getHighSpeedVideoFpsRanges > this.config.getCleanupFrequencyThreshold()) {
            java.util.List<java.io.File> highSpeedVideoSizes = getHighSpeedVideoSizes(Camera2StreamConfigurationMap());
            java.util.Iterator<T> it = highSpeedVideoSizes.iterator();
            final long j = 0;
            while (it.hasNext()) {
                j += com.datadog.android.core.internal.persistence.file.FileExtKt.lengthSafe((java.io.File) it.next(), this.getHighResolutionOutputSizeshNQ4ISI);
            }
            final long maxDiskSpace = this.config.getMaxDiskSpace();
            final long j2 = j - maxDiskSpace;
            if (j2 > 0) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$freeSpaceIfNeeded$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator.ERROR_DISK_FULL, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j), java.lang.Long.valueOf(maxDiskSpace), java.lang.Long.valueOf(j2)}, 3));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        return format;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                for (java.io.File file2 : kotlin.collections.CollectionsKt.sorted(highSpeedVideoSizes)) {
                    if (j2 > 0) {
                        j2 = (j2 - getHighSpeedVideoSizes(file2, true)) - getHighSpeedVideoSizes(getHighResolutionOutputSizeshNQ4ISI(file2), false);
                    }
                }
            }
            this.getHighSpeedVideoFpsRanges = this.getOutputStallDuration.getDeviceTimestampMillis();
        }
        java.io.File file3 = (java.io.File) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) Camera2StreamConfigurationMap());
        if (file3 != null) {
            java.io.File file4 = this.getInputSizeshNQ4ISI;
            long j3 = this.getInputFormats;
            if (kotlin.jvm.internal.Intrinsics.areEqual(file4, file3)) {
                boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(file3, this.getHighSpeedVideoSizesFor);
                boolean z = com.datadog.android.core.internal.persistence.file.FileExtKt.lengthSafe(file3, this.getHighResolutionOutputSizeshNQ4ISI) < this.config.getMaxBatchSize();
                boolean z2 = j3 < ((long) this.config.getMaxItemsPerBatch());
                if (highResolutionOutputSizeshNQ4ISI && z && z2) {
                    this.getInputFormats = j3 + 1;
                    this.Camera2StreamConfigurationMap = this.getOutputStallDuration.getDeviceTimestampMillis();
                    file = file3;
                }
            }
        }
        if (file != null) {
            return file;
        }
        java.io.File file5 = new java.io.File(this.getOutputMinFrameDurationlomOqCM, java.lang.String.valueOf(this.getOutputStallDuration.getDeviceTimestampMillis()));
        java.io.File file6 = this.getInputSizeshNQ4ISI;
        long j4 = this.Camera2StreamConfigurationMap;
        if (file6 != null) {
            this.getHighSpeedVideoSizes.sendBatchClosedMetric(file6, new com.datadog.android.core.internal.metrics.BatchClosedMetadata(j4, this.getInputFormats));
        }
        this.getInputSizeshNQ4ISI = file5;
        this.getInputFormats = 1L;
        this.Camera2StreamConfigurationMap = this.getOutputStallDuration.getDeviceTimestampMillis();
        this.getOutputFormats.incrementAndGet();
        return file5;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.io.File getReadableFile(java.util.Set<? extends java.io.File> excludeFiles) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(excludeFiles, "");
        java.lang.Object obj = null;
        if (!getHighSpeedVideoFpsRangesFor()) {
            return null;
        }
        java.util.List<java.io.File> highSpeedVideoSizes = getHighSpeedVideoSizes(kotlin.collections.CollectionsKt.sorted(Camera2StreamConfigurationMap()));
        this.getHighSpeedVideoFpsRanges = this.getOutputStallDuration.getDeviceTimestampMillis();
        this.getOutputFormats.set(highSpeedVideoSizes.size());
        java.util.Iterator<T> it = highSpeedVideoSizes.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.io.File file = (java.io.File) next;
            if (!excludeFiles.contains(file) && !getHighResolutionOutputSizeshNQ4ISI(file, this.getOutputMinFrameDuration)) {
                obj = next;
                break;
            }
        }
        return (java.io.File) obj;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.util.List<java.io.File> getAllFiles() {
        if (!getHighSpeedVideoFpsRangesFor()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        return kotlin.collections.CollectionsKt.sorted(Camera2StreamConfigurationMap());
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.util.List<java.io.File> getFlushableFiles() {
        return getAllFiles();
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.io.File getRootDir() {
        if (getHighSpeedVideoFpsRangesFor()) {
            return this.getOutputMinFrameDurationlomOqCM;
        }
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final java.io.File getMetadataFile(final java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(file.getParent(), this.getOutputMinFrameDurationlomOqCM.getPath())) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.DEBUG, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$getMetadataFile$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.io.File file2;
                    java.util.Locale locale = java.util.Locale.US;
                    java.lang.String path = file.getPath();
                    file2 = this.getOutputMinFrameDurationlomOqCM;
                    java.lang.String format = java.lang.String.format(locale, com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator.DEBUG_DIFFERENT_ROOT, java.util.Arrays.copyOf(new java.lang.Object[]{path, file2.getPath()}, 2));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
        java.lang.String name2 = file.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        if (kotlin.text.StringsKt.toLongOrNull(name2) != null) {
            return getHighResolutionOutputSizeshNQ4ISI(file);
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$getMetadataFile$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator.ERROR_NOT_BATCH_FILE, java.util.Arrays.copyOf(new java.lang.Object[]{file.getPath()}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                return format;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        return null;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public final int decrementAndGetPendingFilesCount() {
        return this.getOutputFormats.decrementAndGet();
    }

    private final boolean getHighSpeedVideoFpsRangesFor() {
        if (com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(this.getOutputMinFrameDurationlomOqCM, this.getHighResolutionOutputSizeshNQ4ISI)) {
            if (this.getOutputMinFrameDurationlomOqCM.isDirectory()) {
                if (com.datadog.android.core.internal.persistence.file.FileExtKt.canWriteSafe(this.getOutputMinFrameDurationlomOqCM, this.getHighResolutionOutputSizeshNQ4ISI)) {
                    return true;
                }
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$isRootDirValid$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.io.File file;
                        java.util.Locale locale = java.util.Locale.US;
                        file = com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator.this.getOutputMinFrameDurationlomOqCM;
                        java.lang.String format = java.lang.String.format(locale, com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator.ERROR_ROOT_NOT_WRITABLE, java.util.Arrays.copyOf(new java.lang.Object[]{file.getPath()}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        return format;
                    }

                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                return false;
            }
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$isRootDirValid$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.io.File file;
                    java.util.Locale locale = java.util.Locale.US;
                    file = com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator.this.getOutputMinFrameDurationlomOqCM;
                    java.lang.String format = java.lang.String.format(locale, com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator.ERROR_ROOT_NOT_DIR, java.util.Arrays.copyOf(new java.lang.Object[]{file.getPath()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return false;
        }
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            if (com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(this.getOutputMinFrameDurationlomOqCM, this.getHighResolutionOutputSizeshNQ4ISI)) {
                return true;
            }
            if (com.datadog.android.core.internal.persistence.file.FileExtKt.mkdirsSafe(this.getOutputMinFrameDurationlomOqCM, this.getHighResolutionOutputSizeshNQ4ISI)) {
                return true;
            }
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$isRootDirValid$3$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.io.File file;
                    java.util.Locale locale = java.util.Locale.US;
                    file = com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator.this.getOutputMinFrameDurationlomOqCM;
                    java.lang.String format = java.lang.String.format(locale, com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator.ERROR_CANT_CREATE_ROOT, java.util.Arrays.copyOf(new java.lang.Object[]{file.getPath()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return false;
        }
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(java.io.File p0, long p1) {
        long deviceTimestampMillis = this.getOutputStallDuration.getDeviceTimestampMillis();
        java.lang.String name2 = p0.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(name2);
        return (longOrNull != null ? longOrNull.longValue() : 0L) >= deviceTimestampMillis - p1;
    }

    private final java.util.List<java.io.File> getHighSpeedVideoSizes(java.util.List<? extends java.io.File> p0) {
        long deviceTimestampMillis = this.getOutputStallDuration.getDeviceTimestampMillis();
        long oldFileThreshold = this.config.getOldFileThreshold();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.io.File file : p0) {
            java.lang.String name2 = file.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(name2);
            if ((longOrNull != null ? longOrNull.longValue() : 0L) < deviceTimestampMillis - oldFileThreshold) {
                if (com.datadog.android.core.internal.persistence.file.FileExtKt.deleteSafe(file, this.getHighResolutionOutputSizeshNQ4ISI)) {
                    this.getHighSpeedVideoSizes.sendBatchDeletedMetric(file, com.datadog.android.core.internal.metrics.RemovalReason.Obsolete.INSTANCE, this.getOutputFormats.decrementAndGet());
                }
                if (com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(getHighResolutionOutputSizeshNQ4ISI(file), this.getHighResolutionOutputSizeshNQ4ISI)) {
                    com.datadog.android.core.internal.persistence.file.FileExtKt.deleteSafe(getHighResolutionOutputSizeshNQ4ISI(file), this.getHighResolutionOutputSizeshNQ4ISI);
                }
                file = null;
            }
            if (file != null) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    private final long getHighSpeedVideoSizes(java.io.File p0, boolean p1) {
        if (!com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(p0, this.getHighResolutionOutputSizeshNQ4ISI)) {
            return 0L;
        }
        long lengthSafe = com.datadog.android.core.internal.persistence.file.FileExtKt.lengthSafe(p0, this.getHighResolutionOutputSizeshNQ4ISI);
        if (!com.datadog.android.core.internal.persistence.file.FileExtKt.deleteSafe(p0, this.getHighResolutionOutputSizeshNQ4ISI)) {
            return 0L;
        }
        if (p1) {
            this.getHighSpeedVideoSizes.sendBatchDeletedMetric(p0, com.datadog.android.core.internal.metrics.RemovalReason.Purged.INSTANCE, this.getOutputFormats.decrementAndGet());
        }
        return lengthSafe;
    }

    private final java.util.List<java.io.File> Camera2StreamConfigurationMap() {
        java.io.File[] listFilesSafe = com.datadog.android.core.internal.persistence.file.FileExtKt.listFilesSafe(this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        if (listFilesSafe == null) {
            listFilesSafe = new java.io.File[0];
        }
        return kotlin.collections.ArraysKt.toList(listFilesSafe);
    }

    private static java.io.File getHighResolutionOutputSizeshNQ4ISI(java.io.File file) {
        java.lang.String path = file.getPath();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(path);
        sb.append("_metadata");
        return new java.io.File(sb.toString());
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileOrchestrator$BatchFileFilter;", "Ljava/io/FileFilter;", "<init>", "(Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileOrchestrator;)V", "Ljava/io/File;", "file", "", "accept", "(Ljava/io/File;)Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class BatchFileFilter implements java.io.FileFilter {
        public BatchFileFilter() {
        }

        @Override // java.io.FileFilter
        public final boolean accept(java.io.File file) {
            if (file == null) {
                return false;
            }
            return com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator.access$isBatchFile(com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator.this, file);
        }
    }

    public static final /* synthetic */ boolean access$isBatchFile(com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator batchFileOrchestrator, java.io.File file) {
        java.lang.String name2 = file.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        return kotlin.text.StringsKt.toLongOrNull(name2) != null;
    }
}
