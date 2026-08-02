package com.datadog.android.core.internal.persistence.file;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/FileMover;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "Ljava/io/File;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Ljava/io/File;)Z", "srcDir", "destDir", "moveFiles", "(Ljava/io/File;Ljava/io/File;)Z", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FileMover {
    public static final java.lang.String ERROR_DELETE = "Unable to delete file: %s";
    public static final java.lang.String ERROR_MOVE_NOT_DIR = "Unable to move files; file is not a directory: %s";
    public static final java.lang.String ERROR_MOVE_NO_DST = "Unable to move files; could not create directory: %s";
    public static final java.lang.String INFO_MOVE_NO_SRC = "Unable to move files; source directory does not exist: %s";
    private final com.datadog.android.api.InternalLogger internalLogger;

    public FileMover(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.internalLogger = internalLogger;
    }

    public final com.datadog.android.api.InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    public final boolean delete(final java.io.File target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        try {
            return kotlin.io.FilesKt.deleteRecursively(target);
        } catch (java.io.FileNotFoundException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$delete$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "Unable to delete file: %s", java.util.Arrays.copyOf(new java.lang.Object[]{target.getPath()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return false;
        } catch (java.lang.SecurityException e2) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$delete$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "Unable to delete file: %s", java.util.Arrays.copyOf(new java.lang.Object[]{target.getPath()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return false;
        }
    }

    public final boolean moveFiles(final java.io.File srcDir, final java.io.File destDir) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(srcDir, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destDir, "");
        if (!com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(srcDir, this.internalLogger)) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$moveFiles$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.internal.persistence.file.FileMover.INFO_MOVE_NO_SRC, java.util.Arrays.copyOf(new java.lang.Object[]{srcDir.getPath()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return true;
        }
        if (!com.datadog.android.core.internal.persistence.file.FileExtKt.isDirectorySafe(srcDir, this.internalLogger)) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$moveFiles$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.internal.persistence.file.FileMover.ERROR_MOVE_NOT_DIR, java.util.Arrays.copyOf(new java.lang.Object[]{srcDir.getPath()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return false;
        }
        if (!com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(destDir, this.internalLogger)) {
            if (!com.datadog.android.core.internal.persistence.file.FileExtKt.mkdirsSafe(destDir, this.internalLogger)) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$moveFiles$3
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.internal.persistence.file.FileMover.ERROR_MOVE_NO_DST, java.util.Arrays.copyOf(new java.lang.Object[]{srcDir.getPath()}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        return format;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                return false;
            }
        } else if (!com.datadog.android.core.internal.persistence.file.FileExtKt.isDirectorySafe(destDir, this.internalLogger)) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.FileMover$moveFiles$4
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.internal.persistence.file.FileMover.ERROR_MOVE_NOT_DIR, java.util.Arrays.copyOf(new java.lang.Object[]{destDir.getPath()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return false;
        }
        java.io.File[] listFilesSafe = com.datadog.android.core.internal.persistence.file.FileExtKt.listFilesSafe(srcDir, this.internalLogger);
        if (listFilesSafe == null) {
            listFilesSafe = new java.io.File[0];
        }
        for (java.io.File file : listFilesSafe) {
            if (!com.datadog.android.core.internal.persistence.file.FileExtKt.renameToSafe(file, new java.io.File(destDir, file.getName()), this.internalLogger)) {
                return false;
            }
        }
        return true;
    }
}
