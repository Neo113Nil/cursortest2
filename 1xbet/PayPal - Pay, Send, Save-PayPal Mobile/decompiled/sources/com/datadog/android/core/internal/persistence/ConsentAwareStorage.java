package com.datadog.android.core.internal.persistence;

@kotlin.Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0002WVBa\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001cH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020 2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020 H\u0016¢\u0006\u0004\b*\u0010+J3\u00101\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020 0.\u0012\u0004\u0012\u00020 0.j\u0002`02\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020 2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0011\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010=R\u0014\u0010:\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010?R\u0014\u0010&\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010@R\u0014\u0010(\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010AR\u0014\u0010B\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010\u0011\u001a\u00020\u00108\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010OR\u0014\u0010R\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010\u0007\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bS\u0010IR\u0014\u0010P\u001a\u00020T8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bR\u0010U"}, d2 = {"Lcom/datadog/android/core/internal/persistence/ConsentAwareStorage;", "Lcom/datadog/android/core/internal/persistence/Storage;", "Lcom/datadog/android/core/internal/persistence/BatchWriteEventListener;", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "grantedOrchestrator", "pendingOrchestrator", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;", "batchEventsReaderWriter", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "batchMetadataReaderWriter", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "fileMover", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "filePersistenceConfig", "Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "metricsDispatcher", "", "featureName", "Lcom/datadog/android/core/internal/metrics/BenchmarkUploads;", "benchmarkUploads", "<init>", "(Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;Lcom/datadog/android/core/internal/persistence/file/FileMover;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;Ljava/lang/String;Lcom/datadog/android/core/internal/metrics/BenchmarkUploads;)V", "Lcom/datadog/android/core/internal/persistence/BatchId;", "batchId", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "removalReason", "", "deleteBatch", "", "confirmBatchRead", "(Lcom/datadog/android/core/internal/persistence/BatchId;Lcom/datadog/android/core/internal/metrics/RemovalReason;Z)V", "Ljava/io/File;", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/io/File;Lcom/datadog/android/core/internal/metrics/RemovalReason;)V", "getHighSpeedVideoSizes", "(Ljava/io/File;)V", "dropAll", "()V", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "Lcom/datadog/android/api/feature/EventWriteScope;", "getEventWriteScope", "(Lcom/datadog/android/api/context/DatadogContext;)Lkotlin/jvm/functions/Function1;", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "onWriteEvent", "(J)V", "Lcom/datadog/android/core/internal/persistence/BatchData;", "readNextBatch", "()Lcom/datadog/android/core/internal/persistence/BatchData;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReaderWriter;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/core/internal/metrics/BenchmarkUploads;", "Ljava/util/concurrent/ExecutorService;", "Ljava/lang/String;", "getOutputMinFrameDuration", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "getFilePersistenceConfig$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "getGrantedOrchestrator$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "getInputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "getOutputFormats", "", "Lcom/datadog/android/core/internal/persistence/ConsentAwareStorage$Batch;", "Ljava/util/Set;", "getInputFormats", "Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "getHighSpeedVideoSizesFor", "getPendingOrchestrator$dd_sdk_android_core_release", "", "Ljava/lang/Object;", "Companion", "Batch"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConsentAwareStorage implements com.datadog.android.core.internal.persistence.Storage, com.datadog.android.core.internal.persistence.BatchWriteEventListener {
    public static final java.lang.String WARNING_DELETE_FAILED = "Unable to delete file: %s";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;
    private final com.datadog.android.core.internal.persistence.file.FilePersistenceConfig filePersistenceConfig;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.persistence.file.FileReaderWriter Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.ExecutorService getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.metrics.BenchmarkUploads getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final java.lang.Object getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.metrics.MetricsDispatcher getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final java.util.Set<com.datadog.android.core.internal.persistence.ConsentAwareStorage.Batch> getInputSizeshNQ4ISI;
    private final com.datadog.android.core.internal.persistence.file.FileMover getOutputMinFrameDuration;
    private final com.datadog.android.core.internal.persistence.file.FileOrchestrator grantedOrchestrator;
    private final com.datadog.android.core.internal.persistence.file.FileOrchestrator pendingOrchestrator;

    public ConsentAwareStorage(java.util.concurrent.ExecutorService executorService, com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator, com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator2, com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter batchFileReaderWriter, com.datadog.android.core.internal.persistence.file.FileReaderWriter fileReaderWriter, com.datadog.android.core.internal.persistence.file.FileMover fileMover, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.internal.persistence.file.FilePersistenceConfig filePersistenceConfig, com.datadog.android.core.internal.metrics.MetricsDispatcher metricsDispatcher, java.lang.String str, com.datadog.android.core.internal.metrics.BenchmarkUploads benchmarkUploads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileOrchestrator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileOrchestrator2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchFileReaderWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileReaderWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileMover, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePersistenceConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(benchmarkUploads, "");
        this.getHighSpeedVideoFpsRanges = executorService;
        this.grantedOrchestrator = fileOrchestrator;
        this.pendingOrchestrator = fileOrchestrator2;
        this.getHighSpeedVideoFpsRangesFor = batchFileReaderWriter;
        this.Camera2StreamConfigurationMap = fileReaderWriter;
        this.getOutputMinFrameDuration = fileMover;
        this.getOutputFormats = internalLogger;
        this.filePersistenceConfig = filePersistenceConfig;
        this.getHighSpeedVideoSizesFor = metricsDispatcher;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = benchmarkUploads;
        this.getInputSizeshNQ4ISI = new java.util.LinkedHashSet();
        this.getInputFormats = new java.lang.Object();
    }

    /* renamed from: getGrantedOrchestrator$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.FileOrchestrator getGrantedOrchestrator() {
        return this.grantedOrchestrator;
    }

    /* renamed from: getPendingOrchestrator$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.FileOrchestrator getPendingOrchestrator() {
        return this.pendingOrchestrator;
    }

    /* renamed from: getFilePersistenceConfig$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.FilePersistenceConfig getFilePersistenceConfig() {
        return this.filePersistenceConfig;
    }

    public /* synthetic */ ConsentAwareStorage(java.util.concurrent.ExecutorService executorService, com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator, com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator2, com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter batchFileReaderWriter, com.datadog.android.core.internal.persistence.file.FileReaderWriter fileReaderWriter, com.datadog.android.core.internal.persistence.file.FileMover fileMover, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.internal.persistence.file.FilePersistenceConfig filePersistenceConfig, com.datadog.android.core.internal.metrics.MetricsDispatcher metricsDispatcher, java.lang.String str, com.datadog.android.core.internal.metrics.BenchmarkUploads benchmarkUploads, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(executorService, fileOrchestrator, fileOrchestrator2, batchFileReaderWriter, fileReaderWriter, fileMover, internalLogger, filePersistenceConfig, metricsDispatcher, str, (i & 1024) != 0 ? new com.datadog.android.core.internal.metrics.BenchmarkUploads(null, 1, null) : benchmarkUploads);
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public final com.datadog.android.core.internal.persistence.BatchData readNextBatch() {
        synchronized (this.getInputSizeshNQ4ISI) {
            com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator = this.grantedOrchestrator;
            java.util.Set<com.datadog.android.core.internal.persistence.ConsentAwareStorage.Batch> set = this.getInputSizeshNQ4ISI;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
            java.util.Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.datadog.android.core.internal.persistence.ConsentAwareStorage.Batch) it.next()).Camera2StreamConfigurationMap);
            }
            java.io.File readableFile = fileOrchestrator.getReadableFile(kotlin.collections.CollectionsKt.toSet(arrayList));
            byte[] bArr = null;
            if (readableFile == null) {
                return null;
            }
            java.io.File metadataFile = this.grantedOrchestrator.getMetadataFile(readableFile);
            this.getInputSizeshNQ4ISI.add(new com.datadog.android.core.internal.persistence.ConsentAwareStorage.Batch(readableFile, metadataFile));
            kotlin.Pair pair = kotlin.TuplesKt.to(readableFile, metadataFile);
            java.io.File file = (java.io.File) pair.component1();
            java.io.File file2 = (java.io.File) pair.component2();
            com.datadog.android.core.internal.persistence.BatchId fromFile = com.datadog.android.core.internal.persistence.BatchId.INSTANCE.fromFile(file);
            if (file2 != null && com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(file2, this.getOutputFormats)) {
                bArr = this.Camera2StreamConfigurationMap.readData(file2);
            }
            return new com.datadog.android.core.internal.persistence.BatchData(fromFile, this.getHighSpeedVideoFpsRangesFor.readData(file), bArr);
        }
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public final void confirmBatchRead(com.datadog.android.core.internal.persistence.BatchId batchId, com.datadog.android.core.internal.metrics.RemovalReason removalReason, boolean deleteBatch) {
        java.lang.Object obj;
        com.datadog.android.core.internal.persistence.ConsentAwareStorage.Batch batch;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removalReason, "");
        synchronized (this.getInputSizeshNQ4ISI) {
            java.util.Iterator<T> it = this.getInputSizeshNQ4ISI.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (batchId.matchesFile(((com.datadog.android.core.internal.persistence.ConsentAwareStorage.Batch) obj).Camera2StreamConfigurationMap)) {
                        break;
                    }
                }
            }
            batch = (com.datadog.android.core.internal.persistence.ConsentAwareStorage.Batch) obj;
        }
        if (batch == null) {
            return;
        }
        if (deleteBatch) {
            java.io.File file = batch.Camera2StreamConfigurationMap;
            java.io.File file2 = batch.getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRanges(file, removalReason);
            if (file2 != null && com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(file2, this.getOutputFormats)) {
                getHighSpeedVideoSizes(file2);
            }
        }
        synchronized (this.getInputSizeshNQ4ISI) {
            this.getInputSizeshNQ4ISI.remove(batch);
        }
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public final void dropAll() {
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(this.getHighSpeedVideoFpsRanges, "ConsentAwareStorage.dropAll", this.getOutputFormats, new java.lang.Runnable() { // from class: com.datadog.android.core.internal.persistence.ConsentAwareStorage$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.core.internal.persistence.ConsentAwareStorage.$r8$lambda$aW0Yy1MYC8XweCPHBUM1l6sdCYM(com.datadog.android.core.internal.persistence.ConsentAwareStorage.this);
            }
        });
    }

    @Override // com.datadog.android.core.internal.persistence.BatchWriteEventListener
    public final void onWriteEvent(long bytes) {
        this.getHighResolutionOutputSizeshNQ4ISI.sendBenchmarkBytesWritten$dd_sdk_android_core_release(this.getHighSpeedVideoSizes, bytes);
    }

    private final void getHighSpeedVideoFpsRanges(final java.io.File p0, com.datadog.android.core.internal.metrics.RemovalReason p1) {
        long lengthSafe = com.datadog.android.core.internal.persistence.file.FileExtKt.lengthSafe(p0, this.getOutputFormats);
        if (this.getOutputMinFrameDuration.delete(p0)) {
            this.getHighSpeedVideoSizesFor.sendBatchDeletedMetric(p0, p1, this.grantedOrchestrator.decrementAndGetPendingFilesCount());
            if (!kotlin.jvm.internal.Intrinsics.areEqual(p1, new com.datadog.android.core.internal.metrics.RemovalReason.IntakeCode(202)) || lengthSafe <= 0) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.sendBenchmarkBytesDeleted$dd_sdk_android_core_release(this.getHighSpeedVideoSizes, lengthSafe);
            return;
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputFormats, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.ConsentAwareStorage$deleteBatchFile$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                java.lang.String format = java.lang.String.format(java.util.Locale.US, "Unable to delete file: %s", java.util.Arrays.copyOf(new java.lang.Object[]{p0.getPath()}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                return format;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
    }

    private final void getHighSpeedVideoSizes(final java.io.File p0) {
        if (this.getOutputMinFrameDuration.delete(p0)) {
            return;
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getOutputFormats, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.ConsentAwareStorage$deleteBatchMetadataFile$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                java.lang.String format = java.lang.String.format(java.util.Locale.US, "Unable to delete file: %s", java.util.Arrays.copyOf(new java.lang.Object[]{p0.getPath()}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                return format;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011"}, d2 = {"Lcom/datadog/android/core/internal/persistence/ConsentAwareStorage$Batch;", "", "Ljava/io/File;", "p0", "p1", "<init>", "(Ljava/io/File;Ljava/io/File;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/io/File;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class Batch {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final java.io.File getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        final java.io.File Camera2StreamConfigurationMap;

        public Batch(java.io.File file, java.io.File file2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
            this.Camera2StreamConfigurationMap = file;
            this.getHighSpeedVideoSizes = file2;
        }

        public final java.lang.String toString() {
            java.io.File file = this.Camera2StreamConfigurationMap;
            java.io.File file2 = this.getHighSpeedVideoSizes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Batch(Camera2StreamConfigurationMap=");
            sb.append(file);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(file2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.Camera2StreamConfigurationMap.hashCode();
            java.io.File file = this.getHighSpeedVideoSizes;
            return (hashCode * 31) + (file == null ? 0 : file.hashCode());
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.datadog.android.core.internal.persistence.ConsentAwareStorage.Batch)) {
                return false;
            }
            com.datadog.android.core.internal.persistence.ConsentAwareStorage.Batch batch = (com.datadog.android.core.internal.persistence.ConsentAwareStorage.Batch) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, batch.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, batch.getHighSpeedVideoSizes);
        }
    }

    public static /* synthetic */ void $r8$lambda$aW0Yy1MYC8XweCPHBUM1l6sdCYM(com.datadog.android.core.internal.persistence.ConsentAwareStorage consentAwareStorage) {
        synchronized (consentAwareStorage.getInputSizeshNQ4ISI) {
            for (com.datadog.android.core.internal.persistence.ConsentAwareStorage.Batch batch : consentAwareStorage.getInputSizeshNQ4ISI) {
                com.datadog.android.core.internal.metrics.RemovalReason.Flushed flushed = com.datadog.android.core.internal.metrics.RemovalReason.Flushed.INSTANCE;
                java.io.File file = batch.Camera2StreamConfigurationMap;
                java.io.File file2 = batch.getHighSpeedVideoSizes;
                consentAwareStorage.getHighSpeedVideoFpsRanges(file, flushed);
                if (file2 != null && com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(file2, consentAwareStorage.getOutputFormats)) {
                    consentAwareStorage.getHighSpeedVideoSizes(file2);
                }
            }
            consentAwareStorage.getInputSizeshNQ4ISI.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        com.datadog.android.core.internal.persistence.file.FileOrchestrator[] fileOrchestratorArr = {consentAwareStorage.pendingOrchestrator, consentAwareStorage.grantedOrchestrator};
        for (int i = 0; i < 2; i++) {
            com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator = fileOrchestratorArr[i];
            for (java.io.File file3 : fileOrchestrator.getAllFiles()) {
                java.io.File metadataFile = fileOrchestrator.getMetadataFile(file3);
                consentAwareStorage.getHighSpeedVideoFpsRanges(file3, com.datadog.android.core.internal.metrics.RemovalReason.Flushed.INSTANCE);
                if (metadataFile != null && com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(metadataFile, consentAwareStorage.getOutputFormats)) {
                    consentAwareStorage.getHighSpeedVideoSizes(metadataFile);
                }
            }
        }
    }

    @Override // com.datadog.android.core.internal.persistence.Storage
    public final kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> getEventWriteScope(com.datadog.android.api.context.DatadogContext datadogContext) {
        com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        int i = com.datadog.android.core.internal.persistence.ConsentAwareStorage.WhenMappings.$EnumSwitchMapping$0[datadogContext.getTrackingConsent().ordinal()];
        if (i == 1) {
            fileOrchestrator = this.grantedOrchestrator;
        } else if (i == 2) {
            fileOrchestrator = this.pendingOrchestrator;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            fileOrchestrator = null;
        }
        com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator2 = fileOrchestrator;
        if (fileOrchestrator2 == null) {
            return new com.datadog.android.core.internal.persistence.AsyncEventWriteScope(this.getHighSpeedVideoFpsRanges, new com.datadog.android.core.internal.persistence.NoOpEventBatchWriter(), this.getInputFormats, this.getHighSpeedVideoSizes, this.getOutputFormats);
        }
        return new com.datadog.android.core.internal.persistence.AsyncEventWriteScope(this.getHighSpeedVideoFpsRanges, new com.datadog.android.core.internal.persistence.FileEventBatchWriter(fileOrchestrator2, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.filePersistenceConfig, this, this.getOutputFormats), this.getInputFormats, this.getHighSpeedVideoSizes, this.getOutputFormats);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.datadog.android.privacy.TrackingConsent.values().length];
            try {
                iArr[com.datadog.android.privacy.TrackingConsent.GRANTED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.datadog.android.privacy.TrackingConsent.PENDING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.datadog.android.privacy.TrackingConsent.NOT_GRANTED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
