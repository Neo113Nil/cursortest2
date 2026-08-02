package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public abstract class zzsj {
    public static com.google.android.gms.internal.mlkit_common.zzsi zzh() {
        com.google.android.gms.internal.mlkit_common.zzrv zzrvVar = new com.google.android.gms.internal.mlkit_common.zzrv();
        zzrvVar.zzg("NA");
        zzrvVar.zzf(false);
        zzrvVar.zze(false);
        zzrvVar.zzd(com.google.mlkit.common.sdkinternal.ModelType.UNKNOWN);
        zzrvVar.zzb(com.google.android.gms.internal.mlkit_common.zzmu.NO_ERROR);
        zzrvVar.zza(com.google.android.gms.internal.mlkit_common.zzna.UNKNOWN_STATUS);
        zzrvVar.zzc(0);
        return zzrvVar;
    }

    public abstract int zza();

    public abstract com.google.mlkit.common.sdkinternal.ModelType zzb();

    public abstract com.google.android.gms.internal.mlkit_common.zzmu zzc();

    public abstract com.google.android.gms.internal.mlkit_common.zzna zzd();

    public abstract java.lang.String zze();

    public abstract boolean zzf();

    public abstract boolean zzg();
}
