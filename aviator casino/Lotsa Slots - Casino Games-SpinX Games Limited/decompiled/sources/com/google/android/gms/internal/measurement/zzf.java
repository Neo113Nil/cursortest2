package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzf {
    final com.google.android.gms.internal.measurement.zzaw zza;
    final com.google.android.gms.internal.measurement.zzg zzb;
    final com.google.android.gms.internal.measurement.zzg zzc;
    final com.google.android.gms.internal.measurement.zzj zzd;

    public zzf() {
        com.google.android.gms.internal.measurement.zzaw zzawVar = new com.google.android.gms.internal.measurement.zzaw();
        this.zza = zzawVar;
        com.google.android.gms.internal.measurement.zzg zzgVar = new com.google.android.gms.internal.measurement.zzg(null, zzawVar);
        this.zzc = zzgVar;
        this.zzb = zzgVar.zzc();
        com.google.android.gms.internal.measurement.zzj zzjVar = new com.google.android.gms.internal.measurement.zzj();
        this.zzd = zzjVar;
        zzgVar.zze("require", new com.google.android.gms.internal.measurement.zzw(zzjVar));
        zzjVar.zza("internal.platform", com.google.android.gms.internal.measurement.zze.zza);
        zzgVar.zze("runtime.counter", new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(0.0d)));
    }

    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg zzgVar, com.google.android.gms.internal.measurement.zzje... zzjeVarArr) {
        com.google.android.gms.internal.measurement.zzao zzaoVar = com.google.android.gms.internal.measurement.zzao.zzf;
        for (com.google.android.gms.internal.measurement.zzje zzjeVar : zzjeVarArr) {
            zzaoVar = com.google.android.gms.internal.measurement.zzi.zzb(zzjeVar);
            com.google.android.gms.internal.measurement.zzh.zzl(this.zzc);
            if ((zzaoVar instanceof com.google.android.gms.internal.measurement.zzap) || (zzaoVar instanceof com.google.android.gms.internal.measurement.zzan)) {
                zzaoVar = this.zza.zzb(zzgVar, zzaoVar);
            }
        }
        return zzaoVar;
    }
}
