package com.google.android.gms.common.wrappers;

/* loaded from: classes4.dex */
public class InstantApps {
    private static android.content.Context zza;
    private static java.lang.Boolean zzb;

    public static boolean isInstantApp(android.content.Context context) {
        java.lang.Boolean bool;
        synchronized (com.google.android.gms.common.wrappers.InstantApps.class) {
            android.content.Context applicationContext = context.getApplicationContext();
            android.content.Context context2 = zza;
            if (context2 != null && (bool = zzb) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            zzb = null;
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
                zzb = java.lang.Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    zzb = java.lang.Boolean.TRUE;
                } catch (java.lang.ClassNotFoundException unused) {
                    zzb = java.lang.Boolean.FALSE;
                }
            }
            zza = applicationContext;
            return zzb.booleanValue();
        }
    }
}
