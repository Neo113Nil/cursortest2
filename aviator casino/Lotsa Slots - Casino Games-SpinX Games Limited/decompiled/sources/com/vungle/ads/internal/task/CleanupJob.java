package com.vungle.ads.internal.task;

/* compiled from: CleanupJob.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/task/CleanupJob;", "Lcom/vungle/ads/internal/task/Job;", "context", "Landroid/content/Context;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "(Landroid/content/Context;Lcom/vungle/ads/internal/util/PathProvider;)V", "getContext", "()Landroid/content/Context;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "checkIfSdkUpgraded", "", "dropV6Data", "dropV700Data", "dropV730TempData", "dropV742TpatData", "dropV750Data", "onRunJob", "", "bundle", "Landroid/os/Bundle;", "jobRunner", "Lcom/vungle/ads/internal/task/JobRunner;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release", "filePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class CleanupJob implements com.vungle.ads.internal.task.Job {
    private static final java.lang.String AD_ID_KEY = "AD_ID_KEY";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.internal.task.CleanupJob.Companion INSTANCE = new com.vungle.ads.internal.task.CleanupJob.Companion(null);
    public static final java.lang.String TAG = "CleanupJob";
    private final android.content.Context context;
    private final com.vungle.ads.internal.util.PathProvider pathProvider;

    public CleanupJob(android.content.Context context, com.vungle.ads.internal.util.PathProvider pathProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final com.vungle.ads.internal.util.PathProvider getPathProvider() {
        return this.pathProvider;
    }

    @Override // com.vungle.ads.internal.task.Job
    public int onRunJob(android.os.Bundle bundle, com.vungle.ads.internal.task.JobRunner jobRunner) {
        java.io.File file;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        java.io.File vmDir = this.pathProvider.getVmDir();
        java.lang.String string = bundle.getString(AD_ID_KEY);
        if (string == null || (file = this.pathProvider.getDownloadsDirForAd(string)) == null) {
            file = vmDir;
        }
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "CleanupJob: Current directory snapshot");
        try {
            if (kotlin.jvm.internal.Intrinsics.areEqual(file, vmDir)) {
                checkIfSdkUpgraded();
                com.vungle.ads.internal.util.FileUtility.deleteContents(file, kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{com.vungle.ads.internal.Constants.OM_SDK_JS, com.vungle.ads.internal.Constants.OM_SESSION_JS}));
            } else {
                com.vungle.ads.internal.util.FileUtility.delete$default(file, null, 2, null);
            }
            return 0;
        } catch (java.io.IOException unused) {
            return 1;
        }
    }

    private final void dropV6Data() {
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "CleanupJob: drop old files data");
        java.io.File file = new java.io.File(this.context.getNoBackupFilesDir(), "vungle_db");
        if (file.exists()) {
            com.vungle.ads.internal.util.FileUtility.delete$default(file, null, 2, null);
            com.vungle.ads.internal.util.FileUtility.delete$default(new java.io.File(file.getPath() + "-journal"), null, 2, null);
        } else {
            this.context.deleteDatabase("vungle_db");
        }
        android.content.SharedPreferences sp = this.context.getSharedPreferences("com.vungle.sdk", 0);
        java.lang.String string = sp.getString("cache_path", null);
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            this.context.deleteSharedPreferences("com.vungle.sdk");
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sp, "sp");
            android.content.SharedPreferences.Editor editor = sp.edit();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.clear();
            editor.apply();
        }
        java.io.File noBackupFilesDir = this.context.getNoBackupFilesDir();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
        com.vungle.ads.internal.util.FileUtility.delete$default(new java.io.File(noBackupFilesDir, "vungle_settings"), null, 2, null);
        if (string != null) {
            com.vungle.ads.internal.util.FileUtility.delete$default(new java.io.File(string), null, 2, null);
        }
    }

    private final void dropV700Data() {
        com.vungle.ads.internal.util.FileUtility.delete$default(new java.io.File(this.context.getApplicationInfo().dataDir, "vungle"), null, 2, null);
    }

    private final void dropV730TempData() {
        try {
            com.vungle.ads.internal.util.FileUtility.delete$default(new java.io.File(this.pathProvider.getSharedPrefsDir(), "vungleSettings"), null, 2, null);
            com.vungle.ads.internal.util.FileUtility.delete$default(new java.io.File(this.pathProvider.getSharedPrefsDir(), "failedTpatSet"), null, 2, null);
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to delete temp data", e);
        }
    }

    private final void dropV742TpatData() {
        java.io.File noBackupFilesDir = this.context.getNoBackupFilesDir();
        try {
            com.vungle.ads.internal.util.FileUtility.delete$default(new java.io.File(noBackupFilesDir, "failedTpats"), null, 2, null);
            com.vungle.ads.internal.util.FileUtility.delete$default(new java.io.File(noBackupFilesDir, "failedGenericTpats"), null, 2, null);
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to delete 742 tpat data", e);
        }
    }

    private final void dropV750Data() {
        java.io.File noBackupFilesDir = this.context.getNoBackupFilesDir();
        try {
            com.vungle.ads.internal.util.FileUtility.delete$default(new java.io.File(noBackupFilesDir, "vungle_cache/downloads"), null, 2, null);
            com.vungle.ads.internal.util.FileUtility.delete$default(new java.io.File(noBackupFilesDir, "vungle_cache/js"), null, 2, null);
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to delete 750 data", e);
        }
    }

    private final void checkIfSdkUpgraded() {
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        final android.content.Context context = this.context;
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.persistence.FilePreferences>() { // from class: com.vungle.ads.internal.task.CleanupJob$checkIfSdkUpgraded$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.persistence.FilePreferences invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.persistence.FilePreferences.class);
            }
        });
        int i = m10469checkIfSdkUpgraded$lambda4(lazy).getInt("VERSION_CODE", -1);
        if (i < 70702) {
            if (i < 70000) {
                dropV6Data();
            }
            if (i < 70100) {
                dropV700Data();
            }
            if (i < 70301) {
                dropV730TempData();
            }
            if (i < 70500) {
                dropV742TpatData();
            }
            if (i < 70600) {
                dropV750Data();
            }
            m10469checkIfSdkUpgraded$lambda4(lazy).put("VERSION_CODE", com.vungle.ads.BuildConfig.VERSION_CODE).apply();
        }
    }

    /* renamed from: checkIfSdkUpgraded$lambda-4, reason: not valid java name */
    private static final com.vungle.ads.internal.persistence.FilePreferences m10469checkIfSdkUpgraded$lambda4(kotlin.Lazy<com.vungle.ads.internal.persistence.FilePreferences> lazy) {
        return lazy.getValue();
    }

    /* compiled from: CleanupJob.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/task/CleanupJob$Companion;", "", "()V", com.vungle.ads.internal.task.CleanupJob.AD_ID_KEY, "", "TAG", "makeJobInfo", "Lcom/vungle/ads/internal/task/JobInfo;", com.ironsource.sdk.controller.f.b.c, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ com.vungle.ads.internal.task.JobInfo makeJobInfo$default(com.vungle.ads.internal.task.CleanupJob.Companion companion, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return companion.makeJobInfo(str);
        }

        public final com.vungle.ads.internal.task.JobInfo makeJobInfo(java.lang.String adId) {
            com.vungle.ads.internal.task.JobInfo priority = new com.vungle.ads.internal.task.JobInfo(com.vungle.ads.internal.task.CleanupJob.TAG).setPriority(0);
            android.os.Bundle bundle = new android.os.Bundle();
            if (adId != null) {
                bundle.putString(com.vungle.ads.internal.task.CleanupJob.AD_ID_KEY, adId);
            }
            return priority.setExtras(bundle).setUpdateCurrent(adId == null);
        }
    }
}
