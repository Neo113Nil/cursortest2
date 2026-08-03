package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzv extends com.google.android.gms.internal.measurement.zzai {
    private final com.google.android.gms.internal.measurement.zzz zza;

    public zzv(com.google.android.gms.internal.measurement.zzz zzzVar) {
        super("internal.registerCallback");
        this.zza = zzzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzh.zza(this.zzd, 3, list);
        java.lang.String zzc = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc();
        com.google.android.gms.internal.measurement.zzao zza = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1));
        if (!(zza instanceof com.google.android.gms.internal.measurement.zzan)) {
            throw new java.lang.IllegalArgumentException("Invalid callback type");
        }
        com.google.android.gms.internal.measurement.zzao zza2 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(2));
        if (!(zza2 instanceof com.google.android.gms.internal.measurement.zzal)) {
            throw new java.lang.IllegalArgumentException("Invalid callback params");
        }
        com.google.android.gms.internal.measurement.zzal zzalVar = (com.google.android.gms.internal.measurement.zzal) zza2;
        if (!zzalVar.zzj("type")) {
            throw new java.lang.IllegalArgumentException("Undefined rule type");
        }
        this.zza.zza(zzc, zzalVar.zzj("priority") ? com.google.android.gms.internal.measurement.zzh.zzg(zzalVar.zzk("priority").zzd().doubleValue()) : 1000, (com.google.android.gms.internal.measurement.zzan) zza, zzalVar.zzk("type").zzc());
        return com.google.android.gms.internal.measurement.zzao.zzf;
    }
}
