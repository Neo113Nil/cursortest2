package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzh {
    public static void zza(java.lang.String str, int i, java.util.List list) {
        if (list.size() != i) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%s operation requires %s parameters found %s", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(list.size())));
        }
    }

    public static void zzb(java.lang.String str, int i, java.util.List list) {
        if (list.size() < i) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%s operation requires at least %s parameters found %s", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(list.size())));
        }
    }

    public static void zzc(java.lang.String str, int i, java.util.List list) {
        if (list.size() > i) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%s operation requires at most %s parameters found %s", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(list.size())));
        }
    }

    public static boolean zzd(com.google.android.gms.internal.measurement.zzao zzaoVar) {
        if (zzaoVar == null) {
            return false;
        }
        java.lang.Double zzd = zzaoVar.zzd();
        return !zzd.isNaN() && zzd.doubleValue() >= 0.0d && zzd.equals(java.lang.Double.valueOf(java.lang.Math.floor(zzd.doubleValue())));
    }

    public static com.google.android.gms.internal.measurement.zzbk zze(java.lang.String str) {
        com.google.android.gms.internal.measurement.zzbk zzbkVar = null;
        if (str != null && !str.isEmpty()) {
            zzbkVar = com.google.android.gms.internal.measurement.zzbk.zza(java.lang.Integer.parseInt(str));
        }
        if (zzbkVar != null) {
            return zzbkVar;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Unsupported commandId %s", str));
    }

    public static boolean zzf(com.google.android.gms.internal.measurement.zzao zzaoVar, com.google.android.gms.internal.measurement.zzao zzaoVar2) {
        if (!zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            return false;
        }
        if ((zzaoVar instanceof com.google.android.gms.internal.measurement.zzat) || (zzaoVar instanceof com.google.android.gms.internal.measurement.zzam)) {
            return true;
        }
        if (!(zzaoVar instanceof com.google.android.gms.internal.measurement.zzah)) {
            return zzaoVar instanceof com.google.android.gms.internal.measurement.zzas ? zzaoVar.zzc().equals(zzaoVar2.zzc()) : zzaoVar instanceof com.google.android.gms.internal.measurement.zzaf ? zzaoVar.zze().equals(zzaoVar2.zze()) : zzaoVar == zzaoVar2;
        }
        if (java.lang.Double.isNaN(zzaoVar.zzd().doubleValue()) || java.lang.Double.isNaN(zzaoVar2.zzd().doubleValue())) {
            return false;
        }
        return zzaoVar.zzd().equals(zzaoVar2.zzd());
    }

    public static int zzg(double d) {
        if (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) (((d > 0.0d ? 1 : -1) * java.lang.Math.floor(java.lang.Math.abs(d))) % 4.294967296E9d);
    }

    public static long zzh(double d) {
        return zzg(d) & 4294967295L;
    }

    public static double zzi(double d) {
        if (java.lang.Double.isNaN(d)) {
            return 0.0d;
        }
        if (java.lang.Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return (d > 0.0d ? 1 : -1) * java.lang.Math.floor(java.lang.Math.abs(d));
    }

    public static java.lang.Object zzj(com.google.android.gms.internal.measurement.zzao zzaoVar) {
        if (com.google.android.gms.internal.measurement.zzao.zzg.equals(zzaoVar)) {
            return null;
        }
        if (com.google.android.gms.internal.measurement.zzao.zzf.equals(zzaoVar)) {
            return "";
        }
        if (zzaoVar instanceof com.google.android.gms.internal.measurement.zzal) {
            return zzk((com.google.android.gms.internal.measurement.zzal) zzaoVar);
        }
        if (!(zzaoVar instanceof com.google.android.gms.internal.measurement.zzae)) {
            return !zzaoVar.zzd().isNaN() ? zzaoVar.zzd() : zzaoVar.zzc();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((com.google.android.gms.internal.measurement.zzae) zzaoVar).iterator();
        while (it.hasNext()) {
            java.lang.Object zzj = zzj((com.google.android.gms.internal.measurement.zzao) it.next());
            if (zzj != null) {
                arrayList.add(zzj);
            }
        }
        return arrayList;
    }

    public static java.util.Map zzk(com.google.android.gms.internal.measurement.zzal zzalVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : zzalVar.zzb()) {
            java.lang.Object zzj = zzj(zzalVar.zzk(str));
            if (zzj != null) {
                hashMap.put(str, zzj);
            }
        }
        return hashMap;
    }

    public static int zzl(com.google.android.gms.internal.measurement.zzg zzgVar) {
        int zzg = zzg(zzgVar.zzh("runtime.counter").zzd().doubleValue() + 1.0d);
        if (zzg > 1000000) {
            throw new java.lang.IllegalStateException("Instructions allowed exceeded");
        }
        zzgVar.zze("runtime.counter", new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(zzg)));
        return zzg;
    }
}
