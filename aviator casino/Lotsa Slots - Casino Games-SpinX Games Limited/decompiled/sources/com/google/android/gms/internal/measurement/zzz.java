package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzz {
    final java.util.TreeMap zza = new java.util.TreeMap();
    final java.util.TreeMap zzb = new java.util.TreeMap();

    private static final int zzc(com.google.android.gms.internal.measurement.zzg zzgVar, com.google.android.gms.internal.measurement.zzan zzanVar, com.google.android.gms.internal.measurement.zzao zzaoVar) {
        com.google.android.gms.internal.measurement.zzao zza = zzanVar.zza(zzgVar, java.util.Collections.singletonList(zzaoVar));
        if (zza instanceof com.google.android.gms.internal.measurement.zzah) {
            return com.google.android.gms.internal.measurement.zzh.zzg(zza.zzd().doubleValue());
        }
        return -1;
    }

    public final void zza(java.lang.String str, int i, com.google.android.gms.internal.measurement.zzan zzanVar, java.lang.String str2) {
        java.util.TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.zzb;
        } else {
            if (!"edit".equals(str2)) {
                java.lang.String.valueOf(str2);
                throw new java.lang.IllegalStateException("Unknown callback type: ".concat(java.lang.String.valueOf(str2)));
            }
            treeMap = this.zza;
        }
        if (treeMap.containsKey(java.lang.Integer.valueOf(i))) {
            i = ((java.lang.Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(java.lang.Integer.valueOf(i), zzanVar);
    }

    public final void zzb(com.google.android.gms.internal.measurement.zzg zzgVar, com.google.android.gms.internal.measurement.zzab zzabVar) {
        com.google.android.gms.internal.measurement.zzl zzlVar = new com.google.android.gms.internal.measurement.zzl(zzabVar);
        java.util.TreeMap treeMap = this.zza;
        for (java.lang.Integer num : treeMap.keySet()) {
            com.google.android.gms.internal.measurement.zzaa clone = zzabVar.zzc().clone();
            int zzc = zzc(zzgVar, (com.google.android.gms.internal.measurement.zzan) treeMap.get(num), zzlVar);
            if (zzc == 2 || zzc == -1) {
                zzabVar.zzd(clone);
            }
        }
        java.util.TreeMap treeMap2 = this.zzb;
        java.util.Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            zzc(zzgVar, (com.google.android.gms.internal.measurement.zzan) treeMap2.get((java.lang.Integer) it.next()), zzlVar);
        }
    }
}
