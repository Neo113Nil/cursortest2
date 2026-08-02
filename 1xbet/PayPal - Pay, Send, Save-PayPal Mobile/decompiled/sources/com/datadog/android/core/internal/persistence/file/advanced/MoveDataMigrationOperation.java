package com.datadog.android.core.internal.persistence.file.advanced;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/advanced/MoveDataMigrationOperation;", "Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrationOperation;", "Ljava/io/File;", "fromDir", "toDir", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "fileMover", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "<init>", "(Ljava/io/File;Ljava/io/File;Lcom/datadog/android/core/internal/persistence/file/FileMover;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/internal/time/TimeProvider;)V", "", "run", "()V", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "getFileMover$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileMover;", "Ljava/io/File;", "getFromDir$dd_sdk_android_core_release", "()Ljava/io/File;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_core_release", "()Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/internal/time/TimeProvider;", "getTimeProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/internal/time/TimeProvider;", "getToDir$dd_sdk_android_core_release", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MoveDataMigrationOperation implements com.datadog.android.core.internal.persistence.file.advanced.DataMigrationOperation {
    public static final java.lang.String WARN_NULL_DEST_DIR = "Can't move data to a null directory";
    public static final java.lang.String WARN_NULL_SOURCE_DIR = "Can't move data from a null directory";
    private final com.datadog.android.core.internal.persistence.file.FileMover fileMover;
    private final java.io.File fromDir;
    private final com.datadog.android.api.InternalLogger internalLogger;
    private final com.datadog.android.internal.time.TimeProvider timeProvider;
    private final java.io.File toDir;
    private static final long Camera2StreamConfigurationMap = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(500);

    public MoveDataMigrationOperation(java.io.File file, java.io.File file2, com.datadog.android.core.internal.persistence.file.FileMover fileMover, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.internal.time.TimeProvider timeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileMover, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        this.fromDir = file;
        this.toDir = file2;
        this.fileMover = fileMover;
        this.internalLogger = internalLogger;
        this.timeProvider = timeProvider;
    }

    /* renamed from: getFromDir$dd_sdk_android_core_release, reason: from getter */
    public final java.io.File getFromDir() {
        return this.fromDir;
    }

    /* renamed from: getToDir$dd_sdk_android_core_release, reason: from getter */
    public final java.io.File getToDir() {
        return this.toDir;
    }

    /* renamed from: getFileMover$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.FileMover getFileMover() {
        return this.fileMover;
    }

    /* renamed from: getInternalLogger$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.api.InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    /* renamed from: getTimeProvider$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.internal.time.TimeProvider getTimeProvider() {
        return this.timeProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.fromDir == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation$run$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation.WARN_NULL_SOURCE_DIR;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } else if (this.toDir == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation$run$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation.WARN_NULL_DEST_DIR;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } else {
            com.datadog.android.core.internal.utils.MiscUtilsKt.retryWithDelay(3, Camera2StreamConfigurationMap, this.internalLogger, this.timeProvider, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation$run$3
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean invoke() {
                    return java.lang.Boolean.valueOf(com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation.this.getFileMover().moveFiles(com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation.this.getFromDir(), com.datadog.android.core.internal.persistence.file.advanced.MoveDataMigrationOperation.this.getToDir()));
                }

                {
                    super(0);
                }
            });
        }
    }
}
