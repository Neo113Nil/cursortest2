package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzbb extends com.google.android.gms.internal.measurement.zzav {
    protected zzbb() {
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.AND);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.NOT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final com.google.android.gms.internal.measurement.zzao zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzbk zzbkVar = com.google.android.gms.internal.measurement.zzbk.ADD;
        int ordinal = com.google.android.gms.internal.measurement.zzh.zze(str).ordinal();
        if (ordinal == 1) {
            com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.AND.name(), 2, list);
            com.google.android.gms.internal.measurement.zzao zza = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
            return zza.zze().booleanValue() ? zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)) : zza;
        }
        if (ordinal == 47) {
            com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.NOT.name(), 1, list);
            return new com.google.android.gms.internal.measurement.zzaf(java.lang.Boolean.valueOf(!zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zze().booleanValue()));
        }
        if (ordinal != 50) {
            return super.zzb(str);
        }
        com.google.android.gms.internal.measurement.zzh.zza(com.google.android.gms.internal.measurement.zzbk.OR.name(), 2, list);
        com.google.android.gms.internal.measurement.zzao zza2 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
        return !zza2.zze().booleanValue() ? zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)) : zza2;
    }
}
