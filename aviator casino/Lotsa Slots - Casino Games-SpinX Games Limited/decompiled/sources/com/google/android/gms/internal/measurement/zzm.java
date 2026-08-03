package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzm extends com.google.android.gms.internal.measurement.zzai {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzm(com.google.android.gms.internal.measurement.zzn zznVar, java.lang.String str, com.google.android.gms.internal.measurement.zzo zzoVar) {
        super("getValue");
        this.zza = zzoVar;
        java.util.Objects.requireNonNull(zznVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzh.zza("getValue", 2, list);
        com.google.android.gms.internal.measurement.zzao zza = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
        com.google.android.gms.internal.measurement.zzao zza2 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1));
        java.lang.String zza3 = this.zza.zza(zza.zzc());
        return zza3 != null ? new com.google.android.gms.internal.measurement.zzas(zza3) : zza2;
    }
}
