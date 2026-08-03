package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzs extends com.google.android.gms.internal.measurement.zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(com.google.android.gms.internal.measurement.zzt zztVar, boolean z, boolean z2) {
        super("log");
        java.util.Objects.requireNonNull(zztVar);
        this.zzc = zztVar;
        this.zza = z;
        this.zzb = z2;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzh.zzb("log", 1, list);
        if (list.size() == 1) {
            this.zzc.zzb().zza(3, zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc(), java.util.Collections.emptyList(), this.zza, this.zzb);
            return zzf;
        }
        int zzg = com.google.android.gms.internal.measurement.zzh.zzg(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzd().doubleValue());
        int i = zzg != 2 ? zzg != 3 ? zzg != 5 ? zzg != 6 ? 3 : 2 : 5 : 1 : 4;
        java.lang.String zzc = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzc();
        if (list.size() == 2) {
            this.zzc.zzb().zza(i, zzc, java.util.Collections.emptyList(), this.zza, this.zzb);
            return zzf;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 2; i2 < java.lang.Math.min(list.size(), 5); i2++) {
            arrayList.add(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(i2)).zzc());
        }
        this.zzc.zzb().zza(i, zzc, arrayList, this.zza, this.zzb);
        return zzf;
    }
}
