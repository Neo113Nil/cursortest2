package io.appmetrica.analytics.coreutils.internal.services;

@io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline
@android.annotation.TargetApi(30)
/* loaded from: classes.dex */
public final class SafePackageManagerHelperForR {
    public static final io.appmetrica.analytics.coreutils.internal.services.SafePackageManagerHelperForR INSTANCE = new io.appmetrica.analytics.coreutils.internal.services.SafePackageManagerHelperForR();

    private SafePackageManagerHelperForR() {
    }

    public static final java.lang.String extractPackageInstaller(android.content.pm.PackageManager packageManager, java.lang.String str) {
        android.content.pm.InstallSourceInfo installSourceInfo;
        java.lang.String installingPackageName;
        installSourceInfo = packageManager.getInstallSourceInfo(str);
        installingPackageName = installSourceInfo.getInstallingPackageName();
        return installingPackageName;
    }
}
