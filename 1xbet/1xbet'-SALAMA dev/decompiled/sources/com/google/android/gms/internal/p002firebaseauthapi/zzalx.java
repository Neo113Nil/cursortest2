package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzalx {
    private static final zzamo<?, ?> zza = new zzamq();

    public static int zza(int i7, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzajg.zza(i7, true) * size;
    }

    public static int zzb(int i7, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajg.zzi(i7) * size) + zzb(list);
    }

    public static int zzc(int i7, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzajg.zzc(i7, 0) * size;
    }

    public static int zzd(int i7, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzajg.zza(i7, 0L) * size;
    }

    public static int zze(int i7, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajg.zzi(i7) * size) + zze(list);
    }

    public static int zzf(int i7, List<Long> list, boolean z4) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzajg.zzi(i7) * list.size()) + zzf(list);
    }

    public static int zzg(int i7, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajg.zzi(i7) * size) + zzg(list);
    }

    public static int zzh(int i7, List<Long> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajg.zzi(i7) * size) + zzh(list);
    }

    public static int zzi(int i7, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajg.zzi(i7) * size) + zzi(list);
    }

    public static int zzj(int i7, List<Long> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajg.zzi(i7) * size) + zzj(list);
    }

    public static void zzk(int i7, List<Integer> list, zzanf zzanfVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzk(i7, list, z4);
    }

    public static void zzl(int i7, List<Long> list, zzanf zzanfVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzl(i7, list, z4);
    }

    public static void zzm(int i7, List<Integer> list, zzanf zzanfVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzm(i7, list, z4);
    }

    public static void zzn(int i7, List<Long> list, zzanf zzanfVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzn(i7, list, z4);
    }

    public static int zza(List<?> list) {
        return list.size();
    }

    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    public static int zza(int i7, List<zzaip> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = zzajg.zzi(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            iZzi += zzajg.zza(list.get(i8));
        }
        return iZzi;
    }

    public static int zzb(List<Integer> list) {
        int iZzc;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            iZzc = 0;
            while (i7 < size) {
                iZzc += zzajg.zzc(zzajzVar.zzb(i7));
                i7++;
            }
        } else {
            iZzc = 0;
            while (i7 < size) {
                iZzc += zzajg.zzc(list.get(i7).intValue());
                i7++;
            }
        }
        return iZzc;
    }

    public static void zzc(int i7, List<Integer> list, zzanf zzanfVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzc(i7, list, z4);
    }

    public static void zzd(int i7, List<Integer> list, zzanf zzanfVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzd(i7, list, z4);
    }

    public static int zze(List<Integer> list) {
        int iZze;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            iZze = 0;
            while (i7 < size) {
                iZze += zzajg.zze(zzajzVar.zzb(i7));
                i7++;
            }
        } else {
            iZze = 0;
            while (i7 < size) {
                iZze += zzajg.zze(list.get(i7).intValue());
                i7++;
            }
        }
        return iZze;
    }

    public static int zzf(List<Long> list) {
        int iZzd;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            iZzd = 0;
            while (i7 < size) {
                iZzd += zzajg.zzd(zzakrVar.zzb(i7));
                i7++;
            }
        } else {
            iZzd = 0;
            while (i7 < size) {
                iZzd += zzajg.zzd(list.get(i7).longValue());
                i7++;
            }
        }
        return iZzd;
    }

    public static int zzg(List<Integer> list) {
        int iZzh;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            iZzh = 0;
            while (i7 < size) {
                iZzh += zzajg.zzh(zzajzVar.zzb(i7));
                i7++;
            }
        } else {
            iZzh = 0;
            while (i7 < size) {
                iZzh += zzajg.zzh(list.get(i7).intValue());
                i7++;
            }
        }
        return iZzh;
    }

    public static int zzh(List<Long> list) {
        int iZzf;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            iZzf = 0;
            while (i7 < size) {
                iZzf += zzajg.zzf(zzakrVar.zzb(i7));
                i7++;
            }
        } else {
            iZzf = 0;
            while (i7 < size) {
                iZzf += zzajg.zzf(list.get(i7).longValue());
                i7++;
            }
        }
        return iZzf;
    }

    public static int zzi(List<Integer> list) {
        int iZzj;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            iZzj = 0;
            while (i7 < size) {
                iZzj += zzajg.zzj(zzajzVar.zzb(i7));
                i7++;
            }
        } else {
            iZzj = 0;
            while (i7 < size) {
                iZzj += zzajg.zzj(list.get(i7).intValue());
                i7++;
            }
        }
        return iZzj;
    }

    public static int zzj(List<Long> list) {
        int iZzg;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            iZzg = 0;
            while (i7 < size) {
                iZzg += zzajg.zzg(zzakrVar.zzb(i7));
                i7++;
            }
        } else {
            iZzg = 0;
            while (i7 < size) {
                iZzg += zzajg.zzg(list.get(i7).longValue());
                i7++;
            }
        }
        return iZzg;
    }

    public static int zza(int i7, List<zzalc> list, zzalv<?> zzalvVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZza = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iZza += zzajg.zza(i7, list.get(i8), zzalvVar);
        }
        return iZza;
    }

    public static int zzb(int i7, List<?> list, zzalv<?> zzalvVar) {
        int iZza;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = zzajg.zzi(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            if (obj instanceof zzakk) {
                iZza = zzajg.zza((zzakk) obj);
            } else {
                iZza = zzajg.zza((zzalc) obj, zzalvVar);
            }
            iZzi = iZza + iZzi;
        }
        return iZzi;
    }

    public static void zze(int i7, List<Long> list, zzanf zzanfVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zze(i7, list, z4);
    }

    public static void zzf(int i7, List<Float> list, zzanf zzanfVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzf(i7, list, z4);
    }

    public static void zzg(int i7, List<Integer> list, zzanf zzanfVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzg(i7, list, z4);
    }

    public static void zzh(int i7, List<Long> list, zzanf zzanfVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzh(i7, list, z4);
    }

    public static void zzi(int i7, List<Integer> list, zzanf zzanfVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzi(i7, list, z4);
    }

    public static void zzj(int i7, List<Long> list, zzanf zzanfVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzj(i7, list, z4);
    }

    public static int zza(int i7, Object obj, zzalv<?> zzalvVar) {
        if (obj instanceof zzakk) {
            return zzajg.zzb(i7, (zzakk) obj);
        }
        return zzajg.zzb(i7, (zzalc) obj, zzalvVar);
    }

    public static zzamo<?, ?> zza() {
        return zza;
    }

    public static <UT, UB> UB zza(Object obj, int i7, List<Integer> list, zzakd zzakdVar, UB ub, zzamo<UT, UB> zzamoVar) {
        if (zzakdVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Integer num = list.get(i9);
                int iIntValue = num.intValue();
                if (zzakdVar.zza(iIntValue)) {
                    if (i9 != i8) {
                        list.set(i8, num);
                    }
                    i8++;
                } else {
                    ub = (UB) zza(obj, i7, iIntValue, ub, zzamoVar);
                }
            }
            if (i8 != size) {
                list.subList(i8, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!zzakdVar.zza(iIntValue2)) {
                    ub = (UB) zza(obj, i7, iIntValue2, ub, zzamoVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static int zzb(int i7, List<?> list) {
        int iZza;
        int iZza2;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzi = zzajg.zzi(i7) * size;
        if (list instanceof zzakn) {
            zzakn zzaknVar = (zzakn) list;
            while (i8 < size) {
                Object objZza = zzaknVar.zza(i8);
                if (objZza instanceof zzaip) {
                    iZza2 = zzajg.zza((zzaip) objZza);
                } else {
                    iZza2 = zzajg.zza((String) objZza);
                }
                iZzi = iZza2 + iZzi;
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                if (obj instanceof zzaip) {
                    iZza = zzajg.zza((zzaip) obj);
                } else {
                    iZza = zzajg.zza((String) obj);
                }
                iZzi = iZza + iZzi;
                i8++;
            }
        }
        return iZzi;
    }

    public static <UT, UB> UB zza(Object obj, int i7, int i8, UB ub, zzamo<UT, UB> zzamoVar) {
        if (ub == null) {
            ub = zzamoVar.zzc(obj);
        }
        zzamoVar.zzb(ub, i7, i8);
        return ub;
    }

    public static void zzb(int i7, List<Double> list, zzanf zzanfVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzb(i7, list, z4);
    }

    public static <T, FT extends zzajt<FT>> void zza(zzajm<FT> zzajmVar, T t7, T t8) {
        zzajr<T> zzajrVarZza = zzajmVar.zza(t8);
        if (zzajrVarZza.zza.isEmpty()) {
            return;
        }
        zzajmVar.zzb(t7).zza((zzajr) zzajrVarZza);
    }

    public static void zzb(int i7, List<?> list, zzanf zzanfVar, zzalv<?> zzalvVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzb(i7, list, (zzalv) zzalvVar);
    }

    public static void zzb(int i7, List<String> list, zzanf zzanfVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzb(i7, list);
    }

    public static <T> void zza(zzakz zzakzVar, T t7, T t8, long j) {
        zzamp.zza(t7, j, zzakzVar.zza(zzamp.zze(t7, j), zzamp.zze(t8, j)));
    }

    public static <T, UT, UB> void zza(zzamo<UT, UB> zzamoVar, T t7, T t8) {
        zzamoVar.zzc(t7, zzamoVar.zza(zzamoVar.zzd(t7), zzamoVar.zzd(t8)));
    }

    public static void zza(Class<?> cls) {
        zzajy.class.isAssignableFrom(cls);
    }

    public static void zza(int i7, List<Boolean> list, zzanf zzanfVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zza(i7, list, z4);
    }

    public static void zza(int i7, List<zzaip> list, zzanf zzanfVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zza(i7, list);
    }

    public static void zza(int i7, List<?> list, zzanf zzanfVar, zzalv<?> zzalvVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zza(i7, list, (zzalv) zzalvVar);
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
