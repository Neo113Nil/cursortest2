package com.datadog.android.core.internal.persistence.file.advanced;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0010\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u0004\u0018\u00010\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010!\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b!\u0010 J!\u0010%\u001a\u00020$2\b\u0010\"\u001a\u0004\u0018\u00010\b2\u0006\u0010#\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020$2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010&J\u0019\u0010*\u001a\u00020\u00012\b\u0010\"\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b*\u0010+R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R\u0016\u0010%\u001a\u00020\u00018\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b%\u0010/R\u001a\u0010\u000b\u001a\u00020\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u0006\u001a\u00020\u00018\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u00104R\u001a\u0010\r\u001a\u00020\f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0005\u001a\u00020\u00018\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b8\u00104"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/advanced/ConsentAwareFileOrchestrator;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "Lcom/datadog/android/privacy/TrackingConsentProviderCallback;", "Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "consentProvider", "pendingOrchestrator", "grantedOrchestrator", "Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrator;", "Lcom/datadog/android/privacy/TrackingConsent;", "dataMigrator", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/core/internal/privacy/ConsentProvider;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrator;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/api/InternalLogger;)V", "", "decrementAndGetPendingFilesCount", "()I", "", "Ljava/io/File;", "getAllFiles", "()Ljava/util/List;", "getFlushableFiles", "file", "getMetadataFile", "(Ljava/io/File;)Ljava/io/File;", "", "excludeFiles", "getReadableFile", "(Ljava/util/Set;)Ljava/io/File;", "getRootDir", "()Ljava/io/File;", "getWritableFile", "p0", "p1", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/datadog/android/privacy/TrackingConsent;Lcom/datadog/android/privacy/TrackingConsent;)V", "previousConsent", "newConsent", "onConsentUpdated", "getHighSpeedVideoFpsRanges", "(Lcom/datadog/android/privacy/TrackingConsent;)Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrator;", "getDataMigrator$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/advanced/DataMigrator;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "Ljava/util/concurrent/ExecutorService;", "getExecutorService$dd_sdk_android_core_release", "()Ljava/util/concurrent/ExecutorService;", "getGrantedOrchestrator$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_core_release", "()Lcom/datadog/android/api/InternalLogger;", "getPendingOrchestrator$dd_sdk_android_core_release", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class ConsentAwareFileOrchestrator implements com.datadog.android.core.internal.persistence.file.FileOrchestrator, com.datadog.android.privacy.TrackingConsentProviderCallback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileOrchestrator.Companion INSTANCE = new com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileOrchestrator.Companion(null);
    private static final com.datadog.android.core.internal.persistence.file.FileOrchestrator NO_OP_ORCHESTRATOR = new com.datadog.android.core.internal.persistence.file.NoOpFileOrchestrator();
    private final com.datadog.android.core.internal.persistence.file.advanced.DataMigrator<com.datadog.android.privacy.TrackingConsent> dataMigrator;
    private final java.util.concurrent.ExecutorService executorService;
    private volatile com.datadog.android.core.internal.persistence.file.FileOrchestrator getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.android.core.internal.persistence.file.FileOrchestrator grantedOrchestrator;
    private final com.datadog.android.api.InternalLogger internalLogger;
    private final com.datadog.android.core.internal.persistence.file.FileOrchestrator pendingOrchestrator;

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public java.io.File getRootDir() {
        return null;
    }

    public ConsentAwareFileOrchestrator(com.datadog.android.core.internal.privacy.ConsentProvider consentProvider, com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator, com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator2, com.datadog.android.core.internal.persistence.file.advanced.DataMigrator<com.datadog.android.privacy.TrackingConsent> dataMigrator, java.util.concurrent.ExecutorService executorService, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileOrchestrator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileOrchestrator2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataMigrator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.pendingOrchestrator = fileOrchestrator;
        this.grantedOrchestrator = fileOrchestrator2;
        this.dataMigrator = dataMigrator;
        this.executorService = executorService;
        this.internalLogger = internalLogger;
        getHighResolutionOutputSizeshNQ4ISI(null, consentProvider.getGetHighSpeedVideoFpsRanges());
        consentProvider.registerCallback(this);
    }

    /* renamed from: getPendingOrchestrator$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.FileOrchestrator getPendingOrchestrator() {
        return this.pendingOrchestrator;
    }

    /* renamed from: getGrantedOrchestrator$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.FileOrchestrator getGrantedOrchestrator() {
        return this.grantedOrchestrator;
    }

    public final com.datadog.android.core.internal.persistence.file.advanced.DataMigrator<com.datadog.android.privacy.TrackingConsent> getDataMigrator$dd_sdk_android_core_release() {
        return this.dataMigrator;
    }

    /* renamed from: getExecutorService$dd_sdk_android_core_release, reason: from getter */
    public final java.util.concurrent.ExecutorService getExecutorService() {
        return this.executorService;
    }

    /* renamed from: getInternalLogger$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.api.InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public java.io.File getWritableFile() {
        com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator = this.getHighResolutionOutputSizeshNQ4ISI;
        if (fileOrchestrator == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            fileOrchestrator = null;
        }
        return fileOrchestrator.getWritableFile();
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public java.io.File getReadableFile(java.util.Set<? extends java.io.File> excludeFiles) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(excludeFiles, "");
        return this.grantedOrchestrator.getReadableFile(excludeFiles);
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public java.util.List<java.io.File> getAllFiles() {
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) this.pendingOrchestrator.getAllFiles(), (java.lang.Iterable) this.grantedOrchestrator.getAllFiles());
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public java.util.List<java.io.File> getFlushableFiles() {
        return this.grantedOrchestrator.getFlushableFiles();
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public java.io.File getMetadataFile(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator = this.getHighResolutionOutputSizeshNQ4ISI;
        if (fileOrchestrator == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            fileOrchestrator = null;
        }
        return fileOrchestrator.getMetadataFile(file);
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileOrchestrator
    public int decrementAndGetPendingFilesCount() {
        com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator = this.getHighResolutionOutputSizeshNQ4ISI;
        if (fileOrchestrator == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            fileOrchestrator = null;
        }
        return fileOrchestrator.decrementAndGetPendingFilesCount();
    }

    @Override // com.datadog.android.privacy.TrackingConsentProviderCallback
    public void onConsentUpdated(com.datadog.android.privacy.TrackingConsent previousConsent, com.datadog.android.privacy.TrackingConsent newConsent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(previousConsent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newConsent, "");
        getHighResolutionOutputSizeshNQ4ISI(previousConsent, newConsent);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(final com.datadog.android.privacy.TrackingConsent p0, final com.datadog.android.privacy.TrackingConsent p1) {
        final com.datadog.android.core.internal.persistence.file.FileOrchestrator highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0);
        final com.datadog.android.core.internal.persistence.file.FileOrchestrator highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(p1);
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(this.executorService, "Data migration", this.internalLogger, new java.lang.Runnable() { // from class: com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileOrchestrator$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileOrchestrator.$r8$lambda$iHuoa3IouspNgrkVx5vc3UUxU1Y(com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileOrchestrator.this, p0, highSpeedVideoFpsRanges, p1, highSpeedVideoFpsRanges2);
            }
        });
    }

    private final com.datadog.android.core.internal.persistence.file.FileOrchestrator getHighSpeedVideoFpsRanges(com.datadog.android.privacy.TrackingConsent p0) {
        int i = p0 == null ? -1 : com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileOrchestrator.WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i == -1 || i == 1) {
            return this.pendingOrchestrator;
        }
        if (i == 2) {
            return this.grantedOrchestrator;
        }
        if (i == 3) {
            return NO_OP_ORCHESTRATOR;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/advanced/ConsentAwareFileOrchestrator$Companion;", "", "<init>", "()V", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "NO_OP_ORCHESTRATOR", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "getNO_OP_ORCHESTRATOR$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.core.internal.persistence.file.FileOrchestrator getNO_OP_ORCHESTRATOR$dd_sdk_android_core_release() {
            return com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileOrchestrator.NO_OP_ORCHESTRATOR;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void $r8$lambda$iHuoa3IouspNgrkVx5vc3UUxU1Y(com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileOrchestrator consentAwareFileOrchestrator, com.datadog.android.privacy.TrackingConsent trackingConsent, com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator, com.datadog.android.privacy.TrackingConsent trackingConsent2, com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator2) {
        consentAwareFileOrchestrator.dataMigrator.migrateData(trackingConsent, fileOrchestrator, trackingConsent2, fileOrchestrator2);
        consentAwareFileOrchestrator.getHighResolutionOutputSizeshNQ4ISI = fileOrchestrator2;
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.datadog.android.privacy.TrackingConsent.values().length];
            try {
                iArr[com.datadog.android.privacy.TrackingConsent.PENDING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.datadog.android.privacy.TrackingConsent.GRANTED.ordinal()] = 2;
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
