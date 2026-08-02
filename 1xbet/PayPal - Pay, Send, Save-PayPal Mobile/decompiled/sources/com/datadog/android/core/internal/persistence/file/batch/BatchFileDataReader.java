package com.datadog.android.core.internal.persistence.file.batch;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\u0002\b\u0000\u0018\u0000 62\u00020\u0001:\u00016B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u0016J\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u000b\u001a\u00020\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u00105"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileDataReader;", "Lcom/datadog/android/core/internal/persistence/DataReader;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "fileOrchestrator", "Lcom/datadog/android/core/internal/persistence/PayloadDecoration;", "decoration", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReader;", "fileReader", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "fileMover", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/PayloadDecoration;Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReader;Lcom/datadog/android/core/internal/persistence/file/FileMover;Lcom/datadog/android/api/InternalLogger;)V", "Ljava/io/File;", "p0", "", "getHighSpeedVideoFpsRanges", "(Ljava/io/File;)V", "Lcom/datadog/android/core/internal/persistence/Batch;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.datadog.trace.bootstrap.instrumentation.api.SamplerConstants.DROP, "(Lcom/datadog/android/core/internal/persistence/Batch;)V", "dropAll", "()V", "Camera2StreamConfigurationMap", "()Ljava/io/File;", "lockAndReadNext", "()Lcom/datadog/android/core/internal/persistence/Batch;", "release", "", "p1", "getHighSpeedVideoFpsRangesFor", "(Ljava/io/File;Z)V", "", "getHighSpeedVideoSizes", "(Ljava/lang/String;Z)V", "Lcom/datadog/android/core/internal/persistence/PayloadDecoration;", "getDecoration$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/PayloadDecoration;", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "getFileMover$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileMover;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "getFileOrchestrator$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReader;", "getFileReader$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/batch/BatchFileReader;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_core_release", "()Lcom/datadog/android/api/InternalLogger;", "", "Ljava/util/List;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BatchFileDataReader implements com.datadog.android.core.internal.persistence.DataReader {
    public static final java.lang.String WARNING_DELETE_FAILED = "Unable to delete file: %s";
    public static final java.lang.String WARNING_UNKNOWN_BATCH_ID = "Attempting to unlock or delete an unknown file: %s";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<java.io.File> getHighSpeedVideoFpsRangesFor;
    private final com.datadog.android.core.internal.persistence.PayloadDecoration decoration;
    private final com.datadog.android.core.internal.persistence.file.FileMover fileMover;
    private final com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator;
    private final com.datadog.android.core.internal.persistence.file.batch.BatchFileReader fileReader;
    private final com.datadog.android.api.InternalLogger internalLogger;

    public BatchFileDataReader(com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator, com.datadog.android.core.internal.persistence.PayloadDecoration payloadDecoration, com.datadog.android.core.internal.persistence.file.batch.BatchFileReader batchFileReader, com.datadog.android.core.internal.persistence.file.FileMover fileMover, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileOrchestrator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payloadDecoration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchFileReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileMover, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.fileOrchestrator = fileOrchestrator;
        this.decoration = payloadDecoration;
        this.fileReader = batchFileReader;
        this.fileMover = fileMover;
        this.internalLogger = internalLogger;
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
    }

    /* renamed from: getFileOrchestrator$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.FileOrchestrator getFileOrchestrator() {
        return this.fileOrchestrator;
    }

    /* renamed from: getDecoration$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.PayloadDecoration getDecoration() {
        return this.decoration;
    }

    /* renamed from: getFileReader$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.batch.BatchFileReader getFileReader() {
        return this.fileReader;
    }

    /* renamed from: getFileMover$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.FileMover getFileMover() {
        return this.fileMover;
    }

    /* renamed from: getInternalLogger$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.api.InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    @Override // com.datadog.android.core.internal.persistence.DataReader
    public final com.datadog.android.core.internal.persistence.Batch lockAndReadNext() {
        java.io.File Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        if (Camera2StreamConfigurationMap == null) {
            return null;
        }
        java.util.List<com.datadog.android.api.storage.RawBatchEvent> readData = this.fileReader.readData(Camera2StreamConfigurationMap);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(readData, 10));
        java.util.Iterator<T> it = readData.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.datadog.android.api.storage.RawBatchEvent) it.next()).getData());
        }
        byte[] join = com.datadog.android.core.internal.utils.ByteArrayExtKt.join(arrayList, this.decoration.getSeparatorBytes(), this.decoration.getPrefixBytes(), this.decoration.getSuffixBytes(), this.internalLogger);
        java.lang.String name2 = Camera2StreamConfigurationMap.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        return new com.datadog.android.core.internal.persistence.Batch(name2, join);
    }

    @Override // com.datadog.android.core.internal.persistence.DataReader
    public final void release(com.datadog.android.core.internal.persistence.Batch data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        getHighSpeedVideoSizes(data.getId(), false);
    }

    @Override // com.datadog.android.core.internal.persistence.DataReader
    public final void drop(com.datadog.android.core.internal.persistence.Batch data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        getHighSpeedVideoSizes(data.getId(), true);
    }

    @Override // com.datadog.android.core.internal.persistence.DataReader
    public final void dropAll() {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            for (java.lang.Object obj : this.getHighSpeedVideoFpsRangesFor.toArray(new java.io.File[0])) {
                getHighSpeedVideoFpsRangesFor((java.io.File) obj, true);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        for (java.io.File file : this.fileOrchestrator.getAllFiles()) {
            java.io.File metadataFile = this.fileOrchestrator.getMetadataFile(file);
            getHighSpeedVideoFpsRanges(file);
            if (metadataFile != null && com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(metadataFile, this.internalLogger)) {
                getHighSpeedVideoFpsRanges(metadataFile);
            }
        }
    }

    private final java.io.File Camera2StreamConfigurationMap() {
        java.io.File readableFile;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            readableFile = this.fileOrchestrator.getReadableFile(kotlin.collections.CollectionsKt.toSet(this.getHighSpeedVideoFpsRangesFor));
            if (readableFile != null) {
                this.getHighSpeedVideoFpsRangesFor.add(readableFile);
            }
        }
        return readableFile;
    }

    private final void getHighSpeedVideoSizes(final java.lang.String p0, boolean p1) {
        java.lang.Object obj;
        java.io.File file;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            java.util.Iterator<T> it = this.getHighSpeedVideoFpsRangesFor.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((java.io.File) obj).getName(), p0)) {
                        break;
                    }
                }
            }
            file = (java.io.File) obj;
        }
        if (file != null) {
            getHighSpeedVideoFpsRangesFor(file, p1);
        } else {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileDataReader$releaseFile$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.internal.persistence.file.batch.BatchFileDataReader.WARNING_UNKNOWN_BATCH_ID, java.util.Arrays.copyOf(new java.lang.Object[]{p0}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(java.io.File p0, boolean p1) {
        if (p1) {
            java.io.File metadataFile = this.fileOrchestrator.getMetadataFile(p0);
            getHighSpeedVideoFpsRanges(p0);
            if (metadataFile != null && com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(metadataFile, this.internalLogger)) {
                getHighSpeedVideoFpsRanges(metadataFile);
            }
        }
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRangesFor.remove(p0);
        }
    }

    private final void getHighSpeedVideoFpsRanges(final java.io.File p0) {
        if (this.fileMover.delete(p0)) {
            return;
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileDataReader$deleteFile$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
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
}
