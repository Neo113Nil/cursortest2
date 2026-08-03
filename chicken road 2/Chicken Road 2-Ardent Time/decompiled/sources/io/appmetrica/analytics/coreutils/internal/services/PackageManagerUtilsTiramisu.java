package io.appmetrica.analytics.coreutils.internal.services;

@io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline
@android.annotation.TargetApi(33)
/* loaded from: classes.dex */
public final class PackageManagerUtilsTiramisu {
    public static final io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtilsTiramisu INSTANCE = new io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtilsTiramisu();

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f3771a = "[PackageManagerUtilsTiramisu]";

    private PackageManagerUtilsTiramisu() {
    }

    public final android.content.pm.ProviderInfo resolveContentProvider(android.content.pm.PackageManager packageManager, java.lang.String str) {
        android.content.pm.PackageManager.ComponentInfoFlags of;
        android.content.pm.ProviderInfo resolveContentProvider;
        try {
            of = android.content.pm.PackageManager.ComponentInfoFlags.of(8L);
            resolveContentProvider = packageManager.resolveContentProvider(str, of);
            return resolveContentProvider;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
