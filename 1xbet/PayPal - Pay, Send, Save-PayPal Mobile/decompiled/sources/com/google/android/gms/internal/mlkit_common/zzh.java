package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public final class zzh {
    public static final com.google.android.gms.internal.mlkit_common.zzh zza;
    private final boolean zzb;
    private final boolean zzc = false;
    private final com.google.android.gms.internal.mlkit_common.zzaf zzd;

    static {
        com.google.android.gms.internal.mlkit_common.zze zzeVar = null;
        com.google.android.gms.internal.mlkit_common.zzf zzfVar = new com.google.android.gms.internal.mlkit_common.zzf(zzeVar);
        zzfVar.zzb();
        zza = zzfVar.zzd();
        com.google.android.gms.internal.mlkit_common.zzf zzfVar2 = new com.google.android.gms.internal.mlkit_common.zzf(zzeVar);
        zzfVar2.zzb();
        zzfVar2.zza(new com.google.android.gms.internal.mlkit_common.zzd());
        zzfVar2.zzd();
        com.google.android.gms.internal.mlkit_common.zzf zzfVar3 = new com.google.android.gms.internal.mlkit_common.zzf(zzeVar);
        zzfVar3.zzc();
        zzfVar3.zzd();
    }

    static /* synthetic */ int zzc(com.google.android.gms.internal.mlkit_common.zzh zzhVar, android.content.Context context, com.google.android.gms.internal.mlkit_common.zzj zzjVar) {
        com.google.android.gms.internal.mlkit_common.zzaf zzafVar = zzhVar.zzd;
        int size = zzafVar.size();
        int i = 0;
        while (i < size) {
            int zza2 = ((com.google.android.gms.internal.mlkit_common.zzk) zzafVar.get(i)).zza(context, zzjVar, zzhVar.zzb);
            i++;
            if (zza2 - 1 == 1) {
                return 2;
            }
        }
        return 3;
    }

    static /* bridge */ /* synthetic */ boolean zza(com.google.android.gms.internal.mlkit_common.zzh zzhVar) {
        boolean z = zzhVar.zzc;
        return false;
    }

    /* synthetic */ zzh(boolean z, boolean z2, com.google.android.gms.internal.mlkit_common.zzaf zzafVar, com.google.android.gms.internal.mlkit_common.zzg zzgVar) {
        this.zzb = z;
        this.zzd = zzafVar;
    }
}
