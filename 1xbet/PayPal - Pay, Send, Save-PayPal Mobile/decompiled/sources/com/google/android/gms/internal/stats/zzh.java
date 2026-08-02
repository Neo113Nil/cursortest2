package com.google.android.gms.internal.stats;

/* loaded from: classes4.dex */
public final class zzh {
    private static final com.google.android.gms.internal.stats.zze zza;
    private static volatile com.google.android.gms.internal.stats.zze zzb;

    public static com.google.android.gms.internal.stats.zze zza() {
        return zzb;
    }

    static {
        com.google.android.gms.internal.stats.zzg zzgVar = new com.google.android.gms.internal.stats.zzg(null);
        zza = zzgVar;
        zzb = zzgVar;
    }
}
