package com.datadog.android.core.internal.persistence.file.advanced;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bBI\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u001a"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/advanced/FeatureFileOrchestrator;", "Lcom/datadog/android/core/internal/persistence/file/advanced/ConsentAwareFileOrchestrator;", "Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "consentProvider", "Ljava/io/File;", "storageDir", "", "featureName", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "filePersistenceConfig", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;", "metricsDispatcher", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "<init>", "(Lcom/datadog/android/core/internal/privacy/ConsentProvider;Ljava/io/File;Ljava/lang/String;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/metrics/MetricsDispatcher;Lcom/datadog/android/internal/time/TimeProvider;)V", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "pendingOrchestrator", "grantedOrchestrator", "Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrator;", "Lcom/datadog/android/privacy/TrackingConsent;", "dataMigrator", "(Lcom/datadog/android/core/internal/privacy/ConsentProvider;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrator;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/api/InternalLogger;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FeatureFileOrchestrator extends com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileOrchestrator {
    public static final java.lang.String GRANTED_DIR = "%s-v2";
    public static final java.lang.String PENDING_DIR = "%s-pending-v2";
    public static final int VERSION = 2;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.core.internal.persistence.file.advanced.FeatureFileOrchestrator.Companion INSTANCE = new com.datadog.android.core.internal.persistence.file.advanced.FeatureFileOrchestrator.Companion(null);
    private static final kotlin.text.Regex IS_GRANTED_DIR_REG_EX = new kotlin.text.Regex("([a-z]+-)+v[0-9]+");
    private static final kotlin.text.Regex IS_PENDING_DIR_REG_EX = new kotlin.text.Regex("([a-z]+-)+pending-v[0-9]+");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureFileOrchestrator(com.datadog.android.core.internal.privacy.ConsentProvider consentProvider, com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator, com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator2, com.datadog.android.core.internal.persistence.file.advanced.DataMigrator<com.datadog.android.privacy.TrackingConsent> dataMigrator, java.util.concurrent.ExecutorService executorService, com.datadog.android.api.InternalLogger internalLogger) {
        super(consentProvider, fileOrchestrator, fileOrchestrator2, dataMigrator, executorService, internalLogger);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileOrchestrator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileOrchestrator2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataMigrator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FeatureFileOrchestrator(com.datadog.android.core.internal.privacy.ConsentProvider consentProvider, java.io.File file, java.lang.String str, java.util.concurrent.ExecutorService executorService, com.datadog.android.core.internal.persistence.file.FilePersistenceConfig filePersistenceConfig, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.internal.metrics.MetricsDispatcher metricsDispatcher, com.datadog.android.internal.time.TimeProvider timeProvider) {
        this(consentProvider, r9, new com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator(new java.io.File(file, r1), filePersistenceConfig, internalLogger, metricsDispatcher, timeProvider, null, 32, null), new com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileMigrator(new com.datadog.android.core.internal.persistence.file.FileMover(internalLogger), internalLogger, timeProvider), executorService, internalLogger);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePersistenceConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        java.lang.String format = java.lang.String.format(java.util.Locale.US, PENDING_DIR, java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator batchFileOrchestrator = new com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator(new java.io.File(file, format), filePersistenceConfig, internalLogger, metricsDispatcher, timeProvider, null, 32, null);
        java.lang.String format2 = java.lang.String.format(java.util.Locale.US, GRANTED_DIR, java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/advanced/FeatureFileOrchestrator$Companion;", "", "<init>", "()V", "", "GRANTED_DIR", "Ljava/lang/String;", "Lkotlin/text/Regex;", "IS_GRANTED_DIR_REG_EX", "Lkotlin/text/Regex;", "getIS_GRANTED_DIR_REG_EX$dd_sdk_android_core_release", "()Lkotlin/text/Regex;", "IS_PENDING_DIR_REG_EX", "getIS_PENDING_DIR_REG_EX$dd_sdk_android_core_release", "PENDING_DIR", "", "VERSION", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.text.Regex getIS_GRANTED_DIR_REG_EX$dd_sdk_android_core_release() {
            return com.datadog.android.core.internal.persistence.file.advanced.FeatureFileOrchestrator.IS_GRANTED_DIR_REG_EX;
        }

        public final kotlin.text.Regex getIS_PENDING_DIR_REG_EX$dd_sdk_android_core_release() {
            return com.datadog.android.core.internal.persistence.file.advanced.FeatureFileOrchestrator.IS_PENDING_DIR_REG_EX;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
