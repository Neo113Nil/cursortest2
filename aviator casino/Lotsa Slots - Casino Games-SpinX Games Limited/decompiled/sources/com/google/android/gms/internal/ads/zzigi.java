package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzigi {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzigt zzb;

    static {
        int i = com.google.android.gms.internal.ads.zzicn.zza;
        zzb = new com.google.android.gms.internal.ads.zzigv();
    }

    static int zzA(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.gms.internal.ads.zzidj.zzF(i << 3) + 4);
    }

    static int zzB(java.util.List list) {
        return list.size() * 8;
    }

    static int zzC(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.gms.internal.ads.zzidj.zzF(i << 3) + 8);
    }

    static int zzD(int i, java.lang.Object obj, com.google.android.gms.internal.ads.zzigh zzighVar) {
        int zzF;
        int zzaT;
        int zzF2;
        int i2 = i << 3;
        if (obj instanceof com.google.android.gms.internal.ads.zziez) {
            zzF = com.google.android.gms.internal.ads.zzidj.zzF(i2);
            zzaT = ((com.google.android.gms.internal.ads.zziez) obj).zzb();
            zzF2 = com.google.android.gms.internal.ads.zzidj.zzF(zzaT);
        } else {
            zzF = com.google.android.gms.internal.ads.zzidj.zzF(i2);
            zzaT = ((com.google.android.gms.internal.ads.zzicj) obj).zzaT(zzighVar);
            zzF2 = com.google.android.gms.internal.ads.zzidj.zzF(zzaT);
        }
        return zzF + zzF2 + zzaT;
    }

    @java.lang.Deprecated
    static int zzE(int i, com.google.android.gms.internal.ads.zzifp zzifpVar, com.google.android.gms.internal.ads.zzigh zzighVar) {
        int zzF = com.google.android.gms.internal.ads.zzidj.zzF(i << 3);
        return zzF + zzF + ((com.google.android.gms.internal.ads.zzicj) zzifpVar).zzaT(zzighVar);
    }

    public static com.google.android.gms.internal.ads.zzigt zzF() {
        return zzb;
    }

    static boolean zzG(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzH(com.google.android.gms.internal.ads.zzidp zzidpVar, java.lang.Object obj, java.lang.Object obj2) {
        if (((com.google.android.gms.internal.ads.zziea) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzI(com.google.android.gms.internal.ads.zzigt zzigtVar, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.zziee zzieeVar = (com.google.android.gms.internal.ads.zziee) obj;
        com.google.android.gms.internal.ads.zzigu zziguVar = zzieeVar.zzt;
        com.google.android.gms.internal.ads.zzigu zziguVar2 = ((com.google.android.gms.internal.ads.zziee) obj2).zzt;
        if (!com.google.android.gms.internal.ads.zzigu.zza().equals(zziguVar2)) {
            if (com.google.android.gms.internal.ads.zzigu.zza().equals(zziguVar)) {
                zziguVar = com.google.android.gms.internal.ads.zzigu.zzc(zziguVar, zziguVar2);
            } else {
                zziguVar.zzm(zziguVar2);
            }
        }
        zzieeVar.zzt = zziguVar;
    }

    static java.lang.Object zzJ(java.lang.Object obj, int i, java.util.List list, com.google.android.gms.internal.ads.zziek zziekVar, java.lang.Object obj2, com.google.android.gms.internal.ads.zzigt zzigtVar) {
        if (zziekVar == null) {
            return obj2;
        }
        if (list instanceof java.util.RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                java.lang.Integer num = (java.lang.Integer) list.get(i3);
                int intValue = num.intValue();
                if (zziekVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = zzK(obj, i, intValue, obj2, zzigtVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((java.lang.Integer) it.next()).intValue();
                if (!zziekVar.zza(intValue2)) {
                    obj2 = zzK(obj, i, intValue2, obj2, zzigtVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static java.lang.Object zzK(java.lang.Object obj, int i, int i2, java.lang.Object obj2, com.google.android.gms.internal.ads.zzigt zzigtVar) {
        if (obj2 == null) {
            obj2 = zzigtVar.zzh(obj);
        }
        zzigtVar.zza(obj2, i, i2);
        return obj2;
    }

    public static void zza(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzC(i, list, z);
    }

    public static void zzb(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzB(i, list, z);
    }

    public static void zzc(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzy(i, list, z);
    }

    public static void zzd(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzz(i, list, z);
    }

    public static void zze(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzL(i, list, z);
    }

    public static void zzf(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzA(i, list, z);
    }

    public static void zzg(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzJ(i, list, z);
    }

    public static void zzh(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzw(i, list, z);
    }

    public static void zzi(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzH(i, list, z);
    }

    public static void zzj(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzK(i, list, z);
    }

    public static void zzk(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzx(i, list, z);
    }

    public static void zzl(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzI(i, list, z);
    }

    public static void zzm(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzD(i, list, z);
    }

    public static void zzn(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzE(i, list, z);
    }

    public static void zzo(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzF(i, list);
    }

    public static void zzp(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihiVar.zzG(i, list);
    }

    public static void zzq(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar, com.google.android.gms.internal.ads.zzigh zzighVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((com.google.android.gms.internal.ads.zzidk) zzihiVar).zzr(i, list.get(i2), zzighVar);
        }
    }

    public static void zzr(int i, java.util.List list, com.google.android.gms.internal.ads.zzihi zzihiVar, com.google.android.gms.internal.ads.zzigh zzighVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((com.google.android.gms.internal.ads.zzidk) zzihiVar).zzs(i, list.get(i2), zzighVar);
        }
    }

    static int zzs(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.ads.zzifd) {
            com.google.android.gms.internal.ads.zzifd zzifdVar = (com.google.android.gms.internal.ads.zzifd) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.ads.zzidj.zzG(zzifdVar.zzc(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.ads.zzidj.zzG(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzt(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.ads.zzifd) {
            com.google.android.gms.internal.ads.zzifd zzifdVar = (com.google.android.gms.internal.ads.zzifd) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.ads.zzidj.zzG(zzifdVar.zzc(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.ads.zzidj.zzG(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzu(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.ads.zzifd) {
            com.google.android.gms.internal.ads.zzifd zzifdVar = (com.google.android.gms.internal.ads.zzifd) list;
            i = 0;
            while (i2 < size) {
                long zzc = zzifdVar.zzc(i2);
                i += com.google.android.gms.internal.ads.zzidj.zzG((zzc >> 63) ^ (zzc + zzc));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((java.lang.Long) list.get(i2)).longValue();
                i += com.google.android.gms.internal.ads.zzidj.zzG((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    static int zzv(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.ads.zzief) {
            com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.ads.zzidj.zzG(zziefVar.zzf(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.ads.zzidj.zzG(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzw(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.ads.zzief) {
            com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.ads.zzidj.zzG(zziefVar.zzf(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.ads.zzidj.zzG(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzx(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.ads.zzief) {
            com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.ads.zzidj.zzF(zziefVar.zzf(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.ads.zzidj.zzF(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzy(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.ads.zzief) {
            com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) list;
            i = 0;
            while (i2 < size) {
                int zzf = zziefVar.zzf(i2);
                i += com.google.android.gms.internal.ads.zzidj.zzF((zzf >> 31) ^ (zzf + zzf));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((java.lang.Integer) list.get(i2)).intValue();
                i += com.google.android.gms.internal.ads.zzidj.zzF((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    static int zzz(java.util.List list) {
        return list.size() * 4;
    }
}
