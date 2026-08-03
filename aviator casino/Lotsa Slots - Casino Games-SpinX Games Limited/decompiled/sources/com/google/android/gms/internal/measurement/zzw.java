package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzw extends com.google.android.gms.internal.measurement.zzai {
    final java.util.Map zza;
    private final com.google.android.gms.internal.measurement.zzj zzb;

    public zzw(com.google.android.gms.internal.measurement.zzj zzjVar) {
        super("require");
        this.zza = new java.util.HashMap();
        this.zzb = zzjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzao zzaoVar;
        com.google.android.gms.internal.measurement.zzh.zza("require", 1, list);
        java.lang.String zzc = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc();
        java.util.Map map = this.zza;
        if (map.containsKey(zzc)) {
            return (com.google.android.gms.internal.measurement.zzao) map.get(zzc);
        }
        java.util.Map map2 = this.zzb.zza;
        if (map2.containsKey(zzc)) {
            try {
                zzaoVar = (com.google.android.gms.internal.measurement.zzao) ((java.util.concurrent.Callable) map2.get(zzc)).call();
            } catch (java.lang.Exception unused) {
                java.lang.String.valueOf(zzc);
                throw new java.lang.IllegalStateException("Failed to create API implementation: ".concat(java.lang.String.valueOf(zzc)));
            }
        } else {
            zzaoVar = com.google.android.gms.internal.measurement.zzao.zzf;
        }
        if (zzaoVar instanceof com.google.android.gms.internal.measurement.zzai) {
            this.zza.put(zzc, (com.google.android.gms.internal.measurement.zzai) zzaoVar);
        }
        return zzaoVar;
    }
}
