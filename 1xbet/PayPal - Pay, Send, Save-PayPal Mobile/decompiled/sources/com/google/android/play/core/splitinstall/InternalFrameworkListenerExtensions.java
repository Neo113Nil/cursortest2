package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public final class InternalFrameworkListenerExtensions {
    public static void registerFrameworkListener(android.content.Context context, com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        com.google.android.play.core.splitinstall.zzu.zza(context).zza().zza(splitInstallStateUpdatedListener);
    }

    public static void unregisterFrameworkListener(android.content.Context context, com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        com.google.android.play.core.splitinstall.zzu.zza(context).zza().zzb(splitInstallStateUpdatedListener);
    }

    private InternalFrameworkListenerExtensions() {
    }
}
