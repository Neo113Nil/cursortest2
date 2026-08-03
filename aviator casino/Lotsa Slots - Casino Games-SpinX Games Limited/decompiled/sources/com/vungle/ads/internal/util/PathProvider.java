package com.vungle.ads.internal.util;

/* compiled from: PathProvider.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0006J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000eJ\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/vungle/ads/internal/util/PathProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cleverCacheDir", "Ljava/io/File;", "getContext", "()Landroid/content/Context;", "vmDir", "vungleDir", "getAvailableBytes", "", "path", "", "getCleverCacheDir", "getDownloadsDirForAd", com.ironsource.sdk.controller.f.b.c, "getSharedPrefsDir", "getUnclosedAdFile", "name", "getVmDir", "getVungleDir", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class PathProvider {
    private static final java.lang.String CLEVER_CACHE_FOLDER = "clever_cache";
    private static final long UNKNOWN_SIZE = -1;
    private static final java.lang.String VM_FOLDER = "adAssets";
    private static final java.lang.String VUNGLE_FOLDER = "vungle_cache";
    private final java.io.File cleverCacheDir;
    private final android.content.Context context;
    private final java.io.File vmDir;
    private final java.io.File vungleDir;

    public PathProvider(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        java.io.File file = new java.io.File(context.getNoBackupFilesDir(), VUNGLE_FOLDER);
        this.vungleDir = file;
        java.io.File file2 = new java.io.File(file, VM_FOLDER);
        this.vmDir = file2;
        java.io.File file3 = new java.io.File(file, CLEVER_CACHE_FOLDER);
        this.cleverCacheDir = file3;
        for (java.io.File file4 : kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.io.File[]{file, file2, file3})) {
            if (!file4.exists()) {
                file4.mkdirs();
            }
        }
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final java.io.File getVungleDir() {
        if (!this.vungleDir.exists()) {
            this.vungleDir.mkdirs();
        }
        return this.vungleDir;
    }

    public final java.io.File getCleverCacheDir() {
        if (!this.cleverCacheDir.exists()) {
            this.cleverCacheDir.mkdirs();
        }
        return this.cleverCacheDir;
    }

    public final java.io.File getVmDir() {
        if (!this.vmDir.exists()) {
            this.vmDir.mkdirs();
        }
        return this.vmDir;
    }

    public final java.io.File getDownloadsDirForAd(java.lang.String adId) {
        java.lang.String str = adId;
        if (str == null || str.length() == 0) {
            return null;
        }
        java.io.File file = new java.io.File(getVmDir(), adId);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final java.io.File getSharedPrefsDir() {
        java.io.File noBackupFilesDir = this.context.getNoBackupFilesDir();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }

    public final java.io.File getUnclosedAdFile(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new java.io.File(getSharedPrefsDir(), name);
    }

    public final long getAvailableBytes(java.lang.String path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        try {
            return new android.os.StatFs(path).getAvailableBytes();
        } catch (java.lang.IllegalArgumentException e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.w("PathProvider", "Failed to get available bytes " + e.getMessage());
            return -1L;
        }
    }
}
