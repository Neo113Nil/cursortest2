package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public final class zzu {
    private static com.google.android.play.core.splitinstall.zzp zza;

    public static com.google.android.play.core.splitinstall.zzp zza(android.content.Context context) {
        com.google.android.play.core.splitinstall.zzp zzpVar;
        synchronized (com.google.android.play.core.splitinstall.zzu.class) {
            if (zza == null) {
                com.google.android.play.core.splitinstall.zzc zzcVar = new com.google.android.play.core.splitinstall.zzc(null);
                zzcVar.zza(new com.google.android.play.core.splitinstall.zzac(com.google.android.play.core.splitinstall.internal.zzbr.zza(context)));
                zza = zzcVar.zzb();
            }
            zzpVar = zza;
        }
        return zzpVar;
    }
}
