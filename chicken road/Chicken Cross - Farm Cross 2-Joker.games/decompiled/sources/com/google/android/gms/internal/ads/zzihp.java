package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzihp {
    public static final /* synthetic */ int zza = 0;
    private static final zziia zzb;

    static {
        int i = zzidv.zza;
        zzb = new zziic();
    }

    static int zzA(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzier.zzF(i << 3) + 4);
    }

    static int zzB(List list) {
        return list.size() * 8;
    }

    static int zzC(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzier.zzF(i << 3) + 8);
    }

    @Deprecated
    static int zzD(int i, zzigw zzigwVar, zziho zzihoVar) {
        int zzF = zzier.zzF(i << 3);
        return zzF + zzF + ((zzidr) zzigwVar).zzaT(zzihoVar);
    }

    public static zziia zzE() {
        return zzb;
    }

    static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzG(zziex zziexVar, Object obj, Object obj2) {
        if (((zzifi) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzH(zziia zziiaVar, Object obj, Object obj2) {
        zzifm zzifmVar = (zzifm) obj;
        zziib zziibVar = zzifmVar.zzt;
        zziib zziibVar2 = ((zzifm) obj2).zzt;
        if (!zziib.zza().equals(zziibVar2)) {
            if (zziib.zza().equals(zziibVar)) {
                zziibVar = zziib.zzc(zziibVar, zziibVar2);
            } else {
                zziibVar.zzm(zziibVar2);
            }
        }
        zzifmVar.zzt = zziibVar;
    }

    static Object zzI(Object obj, int i, List list, zzifs zzifsVar, Object obj2, zziia zziiaVar) {
        if (zzifsVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzifsVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj2 = zzJ(obj, i, intValue, obj2, zziiaVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzifsVar.zza(intValue2)) {
                    obj2 = zzJ(obj, i, intValue2, obj2, zziiaVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzJ(Object obj, int i, int i2, Object obj2, zziia zziiaVar) {
        if (obj2 == null) {
            obj2 = zziic.zzk(obj);
        }
        zziic.zzj((zziib) obj2, i, i2);
        return obj2;
    }

    public static void zza(int i, List list, zziip zziipVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziipVar.zzC(i, list, z);
    }

    public static void zzb(int i, List list, zziip zziipVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziipVar.zzB(i, list, z);
    }

    public static void zzc(int i, List list, zziip zziipVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziipVar.zzy(i, list, z);
    }

    public static void zzd(int i, List list, zziip zziipVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziipVar.zzz(i, list, z);
    }

    public static void zze(int i, List list, zziip zziipVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziipVar.zzL(i, list, z);
    }

    public static void zzf(int i, List list, zziip zziipVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziipVar.zzA(i, list, z);
    }

    public static void zzg(int i, List list, zziip zziipVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziipVar.zzJ(i, list, z);
    }

    public static void zzh(int i, List list, zziip zziipVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziipVar.zzw(i, list, z);
    }

    public static void zzi(int i, List list, zziip zziipVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziipVar.zzH(i, list, z);
    }

    public static void zzj(int i, List list, zziip zziipVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziipVar.zzK(i, list, z);
    }

    public static void zzk(int i, List list, zziip zziipVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziipVar.zzx(i, list, z);
    }

    public static void zzl(int i, List list, zziip zziipVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziipVar.zzI(i, list, z);
    }

    public static void zzm(int i, List list, zziip zziipVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziipVar.zzD(i, list, z);
    }

    public static void zzn(int i, List list, zziip zziipVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziipVar.zzE(i, list, z);
    }

    public static void zzo(int i, List list, zziip zziipVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziipVar.zzF(i, list);
    }

    public static void zzp(int i, List list, zziip zziipVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zziipVar.zzG(i, list);
    }

    public static void zzq(int i, List list, zziip zziipVar, zziho zzihoVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzies) zziipVar).zzr(i, list.get(i2), zzihoVar);
        }
    }

    public static void zzr(int i, List list, zziip zziipVar, zziho zzihoVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzies) zziipVar).zzs(i, list.get(i2), zzihoVar);
        }
    }

    static int zzs(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzigk) {
            zzigk zzigkVar = (zzigk) list;
            i = 0;
            while (i2 < size) {
                i += zzier.zzG(zzigkVar.zzc(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzier.zzG(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzt(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzigk) {
            zzigk zzigkVar = (zzigk) list;
            i = 0;
            while (i2 < size) {
                i += zzier.zzG(zzigkVar.zzc(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzier.zzG(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzu(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzigk) {
            zzigk zzigkVar = (zzigk) list;
            i = 0;
            while (i2 < size) {
                long zzc = zzigkVar.zzc(i2);
                i += zzier.zzG((zzc >> 63) ^ (zzc + zzc));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzier.zzG((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    static int zzv(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            i = 0;
            while (i2 < size) {
                i += zzier.zzG(zzifnVar.zzf(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzier.zzG(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzw(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            i = 0;
            while (i2 < size) {
                i += zzier.zzG(zzifnVar.zzf(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzier.zzG(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzx(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            i = 0;
            while (i2 < size) {
                i += zzier.zzF(zzifnVar.zzf(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzier.zzF(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzy(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            i = 0;
            while (i2 < size) {
                int zzf = zzifnVar.zzf(i2);
                i += zzier.zzF((zzf >> 31) ^ (zzf + zzf));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzier.zzF((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    static int zzz(List list) {
        return list.size() * 4;
    }
}
