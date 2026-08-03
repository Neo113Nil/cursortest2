package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzi {
    public static com.google.android.gms.internal.measurement.zzao zza(java.lang.Object obj) {
        if (obj == null) {
            return com.google.android.gms.internal.measurement.zzao.zzg;
        }
        if (obj instanceof java.lang.String) {
            return new com.google.android.gms.internal.measurement.zzas((java.lang.String) obj);
        }
        if (obj instanceof java.lang.Double) {
            return new com.google.android.gms.internal.measurement.zzah((java.lang.Double) obj);
        }
        if (obj instanceof java.lang.Long) {
            return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(((java.lang.Long) obj).doubleValue()));
        }
        if (obj instanceof java.lang.Integer) {
            return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(((java.lang.Integer) obj).doubleValue()));
        }
        if (obj instanceof java.lang.Boolean) {
            return new com.google.android.gms.internal.measurement.zzaf((java.lang.Boolean) obj);
        }
        if (!(obj instanceof java.util.Map)) {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Invalid value type");
            }
            com.google.android.gms.internal.measurement.zzae zzaeVar = new com.google.android.gms.internal.measurement.zzae();
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                zzaeVar.zzn(zzaeVar.zzh(), zza(it.next()));
            }
            return zzaeVar;
        }
        com.google.android.gms.internal.measurement.zzal zzalVar = new com.google.android.gms.internal.measurement.zzal();
        java.util.Map map = (java.util.Map) obj;
        for (java.lang.Object obj2 : map.keySet()) {
            com.google.android.gms.internal.measurement.zzao zza = zza(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof java.lang.String)) {
                    obj2 = obj2.toString();
                }
                zzalVar.zzm((java.lang.String) obj2, zza);
            }
        }
        return zzalVar;
    }

    public static com.google.android.gms.internal.measurement.zzao zzb(com.google.android.gms.internal.measurement.zzje zzjeVar) {
        if (zzjeVar == null) {
            return com.google.android.gms.internal.measurement.zzao.zzf;
        }
        int zzj = zzjeVar.zzj() - 1;
        if (zzj == 1) {
            return zzjeVar.zzc() ? new com.google.android.gms.internal.measurement.zzas(zzjeVar.zzd()) : com.google.android.gms.internal.measurement.zzao.zzm;
        }
        if (zzj == 2) {
            return zzjeVar.zzg() ? new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(zzjeVar.zzh())) : new com.google.android.gms.internal.measurement.zzah(null);
        }
        if (zzj == 3) {
            return zzjeVar.zze() ? new com.google.android.gms.internal.measurement.zzaf(java.lang.Boolean.valueOf(zzjeVar.zzf())) : new com.google.android.gms.internal.measurement.zzaf(null);
        }
        if (zzj != 4) {
            throw new java.lang.IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        java.util.List zza = zzjeVar.zza();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = zza.iterator();
        while (it.hasNext()) {
            arrayList.add(zzb((com.google.android.gms.internal.measurement.zzje) it.next()));
        }
        return new com.google.android.gms.internal.measurement.zzap(zzjeVar.zzb(), arrayList);
    }
}
