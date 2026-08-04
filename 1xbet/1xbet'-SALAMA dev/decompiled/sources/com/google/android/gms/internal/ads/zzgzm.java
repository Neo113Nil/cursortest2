package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzgzm {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzw zzb;

    static {
        int i7 = zzgzb.zza;
        zzb = new zzgzy();
    }

    public static void zzA(int i7, List list, zzhal zzhalVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhalVar.zzu(i7, list, z4);
    }

    public static void zzB(int i7, List list, zzhal zzhalVar, zzgzk zzgzkVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((zzgwm) zzhalVar).zzv(i7, list.get(i8), zzgzkVar);
        }
    }

    public static void zzC(int i7, List list, zzhal zzhalVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhalVar.zzy(i7, list, z4);
    }

    public static void zzD(int i7, List list, zzhal zzhalVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhalVar.zzA(i7, list, z4);
    }

    public static void zzE(int i7, List list, zzhal zzhalVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhalVar.zzC(i7, list, z4);
    }

    public static void zzF(int i7, List list, zzhal zzhalVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhalVar.zzE(i7, list, z4);
    }

    public static void zzG(int i7, List list, zzhal zzhalVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhalVar.zzH(i7, list);
    }

    public static void zzH(int i7, List list, zzhal zzhalVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhalVar.zzJ(i7, list, z4);
    }

    public static void zzI(int i7, List list, zzhal zzhalVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhalVar.zzL(i7, list, z4);
    }

    public static boolean zzJ(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int iZzE;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) list;
            iZzE = 0;
            while (i7 < size) {
                iZzE += zzgwl.zzE(zzgxhVar.zzd(i7));
                i7++;
            }
        } else {
            iZzE = 0;
            while (i7 < size) {
                iZzE += zzgwl.zzE(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iZzE;
    }

    public static int zzb(int i7, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgwl.zzD(i7 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i7, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgwl.zzD(i7 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int iZzE;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) list;
            iZzE = 0;
            while (i7 < size) {
                iZzE += zzgwl.zzE(zzgxhVar.zzd(i7));
                i7++;
            }
        } else {
            iZzE = 0;
            while (i7 < size) {
                iZzE += zzgwl.zzE(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iZzE;
    }

    public static int zzg(List list) {
        int iZzE;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyg) {
            zzgyg zzgygVar = (zzgyg) list;
            iZzE = 0;
            while (i7 < size) {
                iZzE += zzgwl.zzE(zzgygVar.zza(i7));
                i7++;
            }
        } else {
            iZzE = 0;
            while (i7 < size) {
                iZzE += zzgwl.zzE(((Long) list.get(i7)).longValue());
                i7++;
            }
        }
        return iZzE;
    }

    public static int zzh(int i7, Object obj, zzgzk zzgzkVar) {
        int i8 = i7 << 3;
        if (!(obj instanceof zzgyc)) {
            return zzgwl.zzA((zzgyr) obj, zzgzkVar) + zzgwl.zzD(i8);
        }
        int iZzD = zzgwl.zzD(i8);
        int iZza = ((zzgyc) obj).zza();
        return AbstractC0486a1.c(iZza, iZza, iZzD);
    }

    public static int zzi(List list) {
        int iZzD;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) list;
            iZzD = 0;
            while (i7 < size) {
                int iZzd = zzgxhVar.zzd(i7);
                iZzD += zzgwl.zzD((iZzd >> 31) ^ (iZzd + iZzd));
                i7++;
            }
        } else {
            iZzD = 0;
            while (i7 < size) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                iZzD += zzgwl.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i7++;
            }
        }
        return iZzD;
    }

    public static int zzj(List list) {
        int iZzE;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyg) {
            zzgyg zzgygVar = (zzgyg) list;
            iZzE = 0;
            while (i7 < size) {
                long jZza = zzgygVar.zza(i7);
                iZzE += zzgwl.zzE((jZza >> 63) ^ (jZza + jZza));
                i7++;
            }
        } else {
            iZzE = 0;
            while (i7 < size) {
                long jLongValue = ((Long) list.get(i7)).longValue();
                iZzE += zzgwl.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i7++;
            }
        }
        return iZzE;
    }

    public static int zzk(List list) {
        int iZzD;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxh) {
            zzgxh zzgxhVar = (zzgxh) list;
            iZzD = 0;
            while (i7 < size) {
                iZzD += zzgwl.zzD(zzgxhVar.zzd(i7));
                i7++;
            }
        } else {
            iZzD = 0;
            while (i7 < size) {
                iZzD += zzgwl.zzD(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iZzD;
    }

    public static int zzl(List list) {
        int iZzE;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyg) {
            zzgyg zzgygVar = (zzgyg) list;
            iZzE = 0;
            while (i7 < size) {
                iZzE += zzgwl.zzE(zzgygVar.zza(i7));
                i7++;
            }
        } else {
            iZzE = 0;
            while (i7 < size) {
                iZzE += zzgwl.zzE(((Long) list.get(i7)).longValue());
                i7++;
            }
        }
        return iZzE;
    }

    public static zzgzw zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i7, List list, zzgxm zzgxmVar, Object obj2, zzgzw zzgzwVar) {
        if (zzgxmVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Integer num = (Integer) list.get(i9);
                int iIntValue = num.intValue();
                if (zzgxmVar.zza(iIntValue)) {
                    if (i9 != i8) {
                        list.set(i8, num);
                    }
                    i8++;
                } else {
                    obj2 = zzo(obj, i7, iIntValue, obj2, zzgzwVar);
                }
            }
            if (i8 != size) {
                list.subList(i8, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzgxmVar.zza(iIntValue2)) {
                    obj2 = zzo(obj, i7, iIntValue2, obj2, zzgzwVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i7, int i8, Object obj2, zzgzw zzgzwVar) {
        if (obj2 == null) {
            obj2 = zzgzwVar.zza(obj);
        }
        zzgzwVar.zzh(obj2, i7, i8);
        return obj2;
    }

    public static void zzp(zzgwr zzgwrVar, Object obj, Object obj2) {
        if (((zzgxc) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzq(zzgzw zzgzwVar, Object obj, Object obj2) {
        zzgxg zzgxgVar = (zzgxg) obj;
        zzgzx zzgzxVarZze = zzgxgVar.zzt;
        zzgzx zzgzxVar = ((zzgxg) obj2).zzt;
        if (!zzgzx.zzc().equals(zzgzxVar)) {
            if (zzgzx.zzc().equals(zzgzxVarZze)) {
                zzgzxVarZze = zzgzx.zze(zzgzxVarZze, zzgzxVar);
            } else {
                zzgzxVarZze.zzd(zzgzxVar);
            }
        }
        zzgxgVar.zzt = zzgzxVarZze;
    }

    public static void zzr(int i7, List list, zzhal zzhalVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhalVar.zzc(i7, list, z4);
    }

    public static void zzs(int i7, List list, zzhal zzhalVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhalVar.zze(i7, list);
    }

    public static void zzt(int i7, List list, zzhal zzhalVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhalVar.zzg(i7, list, z4);
    }

    public static void zzu(int i7, List list, zzhal zzhalVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhalVar.zzj(i7, list, z4);
    }

    public static void zzv(int i7, List list, zzhal zzhalVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhalVar.zzl(i7, list, z4);
    }

    public static void zzw(int i7, List list, zzhal zzhalVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhalVar.zzn(i7, list, z4);
    }

    public static void zzx(int i7, List list, zzhal zzhalVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhalVar.zzp(i7, list, z4);
    }

    public static void zzy(int i7, List list, zzhal zzhalVar, zzgzk zzgzkVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((zzgwm) zzhalVar).zzq(i7, list.get(i8), zzgzkVar);
        }
    }

    public static void zzz(int i7, List list, zzhal zzhalVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhalVar.zzs(i7, list, z4);
    }
}
