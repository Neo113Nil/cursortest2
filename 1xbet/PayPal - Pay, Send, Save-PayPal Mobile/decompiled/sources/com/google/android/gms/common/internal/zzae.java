package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
public final class zzae {
    private static final java.lang.Object zza = new java.lang.Object();
    private static boolean zzb;
    private static java.lang.String zzc;
    private static int zzd;

    public static java.lang.String zza(android.content.Context context) {
        zzc(context);
        return zzc;
    }

    public static int zzb(android.content.Context context) {
        zzc(context);
        return zzd;
    }

    private static void zzc(android.content.Context context) {
        android.os.Bundle bundle;
        synchronized (zza) {
            if (zzb) {
                return;
            }
            zzb = true;
            try {
                bundle = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
            if (bundle == null) {
                return;
            }
            zzc = bundle.getString("com.google.app.id");
            zzd = bundle.getInt("com.google.android.gms.version");
        }
    }
}
