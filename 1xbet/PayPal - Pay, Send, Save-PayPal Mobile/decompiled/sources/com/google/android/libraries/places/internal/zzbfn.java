package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbfn {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.libraries.places.internal.zzbfy zzb = new com.google.android.libraries.places.internal.zzbga();

    @java.lang.Deprecated
    static int zzA(int i, com.google.android.libraries.places.internal.zzbex zzbexVar, com.google.android.libraries.places.internal.zzbfl zzbflVar) {
        int zzy = com.google.android.libraries.places.internal.zzbcu.zzy(i << 3);
        return zzy + zzy + ((com.google.android.libraries.places.internal.zzbby) zzbexVar).zzbn(zzbflVar);
    }

    static boolean zzC(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzD(com.google.android.libraries.places.internal.zzbdc zzbdcVar, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbdg zzbdgVar = ((com.google.android.libraries.places.internal.zzbdn) obj2).zzb;
        if (zzbdgVar.zza.isEmpty()) {
            return;
        }
        zzbdcVar.zza(obj).zzh(zzbdgVar);
    }

    static void zzE(com.google.android.libraries.places.internal.zzbfy zzbfyVar, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbdq zzbdqVar = (com.google.android.libraries.places.internal.zzbdq) obj;
        com.google.android.libraries.places.internal.zzbfz zzbfzVar = zzbdqVar.zzc;
        com.google.android.libraries.places.internal.zzbfz zzbfzVar2 = ((com.google.android.libraries.places.internal.zzbdq) obj2).zzc;
        if (!com.google.android.libraries.places.internal.zzbfz.zza().equals(zzbfzVar2)) {
            if (com.google.android.libraries.places.internal.zzbfz.zza().equals(zzbfzVar)) {
                zzbfzVar = com.google.android.libraries.places.internal.zzbfz.zzc(zzbfzVar, zzbfzVar2);
            } else {
                zzbfzVar.zzl(zzbfzVar2);
            }
        }
        zzbdqVar.zzc = zzbfzVar;
    }

    static java.lang.Object zzF(java.lang.Object obj, int i, java.util.List list, com.google.android.libraries.places.internal.zzbdw zzbdwVar, java.lang.Object obj2, com.google.android.libraries.places.internal.zzbfy zzbfyVar) {
        if (zzbdwVar == null) {
            return obj2;
        }
        if (!(list instanceof java.util.RandomAccess)) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Integer) it.next()).intValue();
                if (!zzbdwVar.zza(intValue)) {
                    obj2 = zzG(obj, i, intValue, obj2, zzbfyVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue2 = ((java.lang.Integer) list.get(i3)).intValue();
            if (zzbdwVar.zza(intValue2)) {
                if (i3 != i2) {
                    list.set(i2, java.lang.Integer.valueOf(intValue2));
                }
                i2++;
            } else {
                obj2 = zzG(obj, i, intValue2, obj2, zzbfyVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static java.lang.Object zzG(java.lang.Object obj, int i, int i2, java.lang.Object obj2, com.google.android.libraries.places.internal.zzbfy zzbfyVar) {
        if (obj2 == null) {
            obj2 = zzbfyVar.zzh(obj);
        }
        zzbfyVar.zza(obj2, i, i2);
        return obj2;
    }

    public static void zza(int i, java.util.List list, com.google.android.libraries.places.internal.zzbgl zzbglVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbglVar.zzC(i, list, z);
    }

    public static void zzb(int i, java.util.List list, com.google.android.libraries.places.internal.zzbgl zzbglVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbglVar.zzB(i, list, z);
    }

    public static void zzc(int i, java.util.List list, com.google.android.libraries.places.internal.zzbgl zzbglVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbglVar.zzy(i, list, z);
    }

    public static void zzd(int i, java.util.List list, com.google.android.libraries.places.internal.zzbgl zzbglVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbglVar.zzz(i, list, z);
    }

    public static void zze(int i, java.util.List list, com.google.android.libraries.places.internal.zzbgl zzbglVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbglVar.zzL(i, list, z);
    }

    public static void zzf(int i, java.util.List list, com.google.android.libraries.places.internal.zzbgl zzbglVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbglVar.zzA(i, list, z);
    }

    public static void zzg(int i, java.util.List list, com.google.android.libraries.places.internal.zzbgl zzbglVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbglVar.zzJ(i, list, z);
    }

    public static void zzh(int i, java.util.List list, com.google.android.libraries.places.internal.zzbgl zzbglVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbglVar.zzw(i, list, z);
    }

    public static void zzi(int i, java.util.List list, com.google.android.libraries.places.internal.zzbgl zzbglVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbglVar.zzH(i, list, z);
    }

    public static void zzj(int i, java.util.List list, com.google.android.libraries.places.internal.zzbgl zzbglVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbglVar.zzK(i, list, z);
    }

    public static void zzk(int i, java.util.List list, com.google.android.libraries.places.internal.zzbgl zzbglVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbglVar.zzx(i, list, z);
    }

    public static void zzl(int i, java.util.List list, com.google.android.libraries.places.internal.zzbgl zzbglVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbglVar.zzI(i, list, z);
    }

    public static void zzm(int i, java.util.List list, com.google.android.libraries.places.internal.zzbgl zzbglVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbglVar.zzD(i, list, z);
    }

    public static void zzn(int i, java.util.List list, com.google.android.libraries.places.internal.zzbgl zzbglVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbglVar.zzE(i, list, z);
    }

    static int zzo(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.libraries.places.internal.zzbem)) {
            int i2 = 0;
            while (i < size) {
                i2 += com.google.android.libraries.places.internal.zzbcu.zzz(((java.lang.Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        com.google.android.libraries.places.internal.zzbem zzbemVar = (com.google.android.libraries.places.internal.zzbem) list;
        int i3 = 0;
        while (i < size) {
            i3 += com.google.android.libraries.places.internal.zzbcu.zzz(zzbemVar.zze(i));
            i++;
        }
        return i3;
    }

    static int zzp(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.libraries.places.internal.zzbem)) {
            int i2 = 0;
            while (i < size) {
                i2 += com.google.android.libraries.places.internal.zzbcu.zzz(((java.lang.Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        com.google.android.libraries.places.internal.zzbem zzbemVar = (com.google.android.libraries.places.internal.zzbem) list;
        int i3 = 0;
        while (i < size) {
            i3 += com.google.android.libraries.places.internal.zzbcu.zzz(zzbemVar.zze(i));
            i++;
        }
        return i3;
    }

    static int zzq(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.libraries.places.internal.zzbem)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((java.lang.Long) list.get(i)).longValue();
                i2 += com.google.android.libraries.places.internal.zzbcu.zzz((longValue + longValue) ^ (longValue >> 63));
                i++;
            }
            return i2;
        }
        com.google.android.libraries.places.internal.zzbem zzbemVar = (com.google.android.libraries.places.internal.zzbem) list;
        int i3 = 0;
        while (i < size) {
            long zze = zzbemVar.zze(i);
            i3 += com.google.android.libraries.places.internal.zzbcu.zzz((zze + zze) ^ (zze >> 63));
            i++;
        }
        return i3;
    }

    static int zzr(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.libraries.places.internal.zzbdr)) {
            int i2 = 0;
            while (i < size) {
                i2 += com.google.android.libraries.places.internal.zzbcu.zzz(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) list;
        int i3 = 0;
        while (i < size) {
            i3 += com.google.android.libraries.places.internal.zzbcu.zzz(zzbdrVar.zzf(i));
            i++;
        }
        return i3;
    }

    static int zzs(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.libraries.places.internal.zzbdr)) {
            int i2 = 0;
            while (i < size) {
                i2 += com.google.android.libraries.places.internal.zzbcu.zzz(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) list;
        int i3 = 0;
        while (i < size) {
            i3 += com.google.android.libraries.places.internal.zzbcu.zzz(zzbdrVar.zzf(i));
            i++;
        }
        return i3;
    }

    static int zzt(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.libraries.places.internal.zzbdr)) {
            int i2 = 0;
            while (i < size) {
                i2 += com.google.android.libraries.places.internal.zzbcu.zzy(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) list;
        int i3 = 0;
        while (i < size) {
            i3 += com.google.android.libraries.places.internal.zzbcu.zzy(zzbdrVar.zzf(i));
            i++;
        }
        return i3;
    }

    static int zzu(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof com.google.android.libraries.places.internal.zzbdr)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((java.lang.Integer) list.get(i)).intValue();
                i2 += com.google.android.libraries.places.internal.zzbcu.zzy((intValue + intValue) ^ (intValue >> 31));
                i++;
            }
            return i2;
        }
        com.google.android.libraries.places.internal.zzbdr zzbdrVar = (com.google.android.libraries.places.internal.zzbdr) list;
        int i3 = 0;
        while (i < size) {
            int zzf = zzbdrVar.zzf(i);
            i3 += com.google.android.libraries.places.internal.zzbcu.zzy((zzf + zzf) ^ (zzf >> 31));
            i++;
        }
        return i3;
    }

    static int zzv(java.util.List list) {
        return list.size() * 4;
    }

    static int zzw(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.libraries.places.internal.zzbcu.zzy(i << 3) + 4);
    }

    static int zzx(java.util.List list) {
        return list.size() * 8;
    }

    static int zzy(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.libraries.places.internal.zzbcu.zzy(i << 3) + 8);
    }

    static int zzz(int i, java.lang.Object obj, com.google.android.libraries.places.internal.zzbfl zzbflVar) {
        int zzy;
        int zzbn;
        int zzy2;
        int i2 = i << 3;
        if (obj instanceof com.google.android.libraries.places.internal.zzbei) {
            zzy = com.google.android.libraries.places.internal.zzbcu.zzy(i2);
            zzbn = ((com.google.android.libraries.places.internal.zzbei) obj).zzb();
            zzy2 = com.google.android.libraries.places.internal.zzbcu.zzy(zzbn);
        } else {
            zzy = com.google.android.libraries.places.internal.zzbcu.zzy(i2);
            zzbn = ((com.google.android.libraries.places.internal.zzbby) obj).zzbn(zzbflVar);
            zzy2 = com.google.android.libraries.places.internal.zzbcu.zzy(zzbn);
        }
        return zzy + zzy2 + zzbn;
    }

    public static com.google.android.libraries.places.internal.zzbfy zzB() {
        return zzb;
    }
}
