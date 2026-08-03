package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzk extends com.google.android.gms.internal.measurement.zzai {
    private final com.google.android.gms.internal.measurement.zzab zza;

    public zzk(com.google.android.gms.internal.measurement.zzab zzabVar) {
        super("internal.eventLogger");
        this.zza = zzabVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzh.zza(this.zzd, 3, list);
        java.lang.String zzc = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc();
        long zzi = (long) com.google.android.gms.internal.measurement.zzh.zzi(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzd().doubleValue());
        com.google.android.gms.internal.measurement.zzao zza = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(2));
        this.zza.zze(zzc, zzi, zza instanceof com.google.android.gms.internal.measurement.zzal ? com.google.android.gms.internal.measurement.zzh.zzk((com.google.android.gms.internal.measurement.zzal) zza) : new java.util.HashMap());
        return com.google.android.gms.internal.measurement.zzao.zzf;
    }
}
