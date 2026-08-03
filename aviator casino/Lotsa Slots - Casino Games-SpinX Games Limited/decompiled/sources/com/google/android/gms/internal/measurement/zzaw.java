package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzaw {
    final java.util.Map zza = new java.util.HashMap();
    final com.google.android.gms.internal.measurement.zzbi zzb = new com.google.android.gms.internal.measurement.zzbi();

    public zzaw() {
        zza(new com.google.android.gms.internal.measurement.zzau());
        zza(new com.google.android.gms.internal.measurement.zzax());
        zza(new com.google.android.gms.internal.measurement.zzay());
        zza(new com.google.android.gms.internal.measurement.zzbb());
        zza(new com.google.android.gms.internal.measurement.zzbg());
        zza(new com.google.android.gms.internal.measurement.zzbh());
        zza(new com.google.android.gms.internal.measurement.zzbj());
    }

    final void zza(com.google.android.gms.internal.measurement.zzav zzavVar) {
        java.util.Iterator it = zzavVar.zza.iterator();
        while (it.hasNext()) {
            this.zza.put(((com.google.android.gms.internal.measurement.zzbk) it.next()).zzb().toString(), zzavVar);
        }
    }

    public final com.google.android.gms.internal.measurement.zzao zzb(com.google.android.gms.internal.measurement.zzg zzgVar, com.google.android.gms.internal.measurement.zzao zzaoVar) {
        com.google.android.gms.internal.measurement.zzh.zzl(zzgVar);
        if (!(zzaoVar instanceof com.google.android.gms.internal.measurement.zzap)) {
            return zzaoVar;
        }
        com.google.android.gms.internal.measurement.zzap zzapVar = (com.google.android.gms.internal.measurement.zzap) zzaoVar;
        java.util.ArrayList zzg = zzapVar.zzg();
        java.lang.String zzb = zzapVar.zzb();
        java.util.Map map = this.zza;
        return (map.containsKey(zzb) ? (com.google.android.gms.internal.measurement.zzav) map.get(zzb) : this.zzb).zza(zzb, zzgVar, zzg);
    }
}
