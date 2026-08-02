package com.datadog.android.core.internal.persistence.file.advanced;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/advanced/WipeDataMigrationOperation;", "Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrationOperation;", "Ljava/io/File;", "targetDir", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "fileMover", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "<init>", "(Ljava/io/File;Lcom/datadog/android/core/internal/persistence/file/FileMover;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/internal/time/TimeProvider;)V", "", "run", "()V", "Lcom/datadog/android/core/internal/persistence/file/FileMover;", "getFileMover$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileMover;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_core_release", "()Lcom/datadog/android/api/InternalLogger;", "Ljava/io/File;", "getTargetDir$dd_sdk_android_core_release", "()Ljava/io/File;", "Lcom/datadog/android/internal/time/TimeProvider;", "getTimeProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/internal/time/TimeProvider;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WipeDataMigrationOperation implements com.datadog.android.core.internal.persistence.file.advanced.DataMigrationOperation {
    public static final java.lang.String WARN_NULL_DIR = "Can't wipe data from a null directory";
    private final com.datadog.android.core.internal.persistence.file.FileMover fileMover;
    private final com.datadog.android.api.InternalLogger internalLogger;
    private final java.io.File targetDir;
    private final com.datadog.android.internal.time.TimeProvider timeProvider;
    private static final long getHighSpeedVideoFpsRangesFor = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(500);

    public WipeDataMigrationOperation(java.io.File file, com.datadog.android.core.internal.persistence.file.FileMover fileMover, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.internal.time.TimeProvider timeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileMover, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        this.targetDir = file;
        this.fileMover = fileMover;
        this.internalLogger = internalLogger;
        this.timeProvider = timeProvider;
    }

    /* renamed from: getTargetDir$dd_sdk_android_core_release, reason: from getter */
    public final java.io.File getTargetDir() {
        return this.targetDir;
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
        if (this.targetDir == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.advanced.WipeDataMigrationOperation$run$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.persistence.file.advanced.WipeDataMigrationOperation.WARN_NULL_DIR;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } else {
            com.datadog.android.core.internal.utils.MiscUtilsKt.retryWithDelay(3, getHighSpeedVideoFpsRangesFor, this.internalLogger, this.timeProvider, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: com.datadog.android.core.internal.persistence.file.advanced.WipeDataMigrationOperation$run$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean invoke() {
                    return java.lang.Boolean.valueOf(com.datadog.android.core.internal.persistence.file.advanced.WipeDataMigrationOperation.this.getFileMover().delete(com.datadog.android.core.internal.persistence.file.advanced.WipeDataMigrationOperation.this.getTargetDir()));
                }

                {
                    super(0);
                }
            });
        }
    }
}
