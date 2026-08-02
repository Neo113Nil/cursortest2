package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzmz {
    public static com.google.android.libraries.places.internal.zzmx zzd(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        com.google.android.libraries.places.internal.zzmv zzmvVar = new com.google.android.libraries.places.internal.zzmv();
        zzmvVar.zza(packageName);
        zzmvVar.zzb(i);
        zzmvVar.zzc(com.google.android.libraries.places.internal.zzmy.PROGRAMMATIC_API);
        return zzmvVar;
    }

    public abstract java.lang.String zza();

    public abstract int zzb();

    public abstract com.google.android.libraries.places.internal.zzmy zzc();
}
