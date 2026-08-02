package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
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
        int zzi = zzajg.zzi(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            zzi += zzajg.zza(list.get(i8));
        }
        return zzi;
    }

    public static int zzb(List<Integer> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzajg.zzc(zzajzVar.zzb(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzajg.zzc(list.get(i8).intValue());
                i8++;
            }
        }
        return i7;
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
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzajg.zze(zzajzVar.zzb(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzajg.zze(list.get(i8).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzf(List<Long> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzajg.zzd(zzakrVar.zzb(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzajg.zzd(list.get(i8).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzg(List<Integer> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzajg.zzh(zzajzVar.zzb(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzajg.zzh(list.get(i8).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzh(List<Long> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzajg.zzf(zzakrVar.zzb(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzajg.zzf(list.get(i8).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzi(List<Integer> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzajg.zzj(zzajzVar.zzb(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzajg.zzj(list.get(i8).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzj(List<Long> list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzajg.zzg(zzakrVar.zzb(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzajg.zzg(list.get(i8).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zza(int i7, List<zzalc> list, zzalv<?> zzalvVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += zzajg.zza(i7, list.get(i9), zzalvVar);
        }
        return i8;
    }

    public static int zzb(int i7, List<?> list, zzalv<?> zzalvVar) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzajg.zzi(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            if (obj instanceof zzakk) {
                zza2 = zzajg.zza((zzakk) obj);
            } else {
                zza2 = zzajg.zza((zzalc) obj, zzalvVar);
            }
            zzi = zza2 + zzi;
        }
        return zzi;
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
                int intValue = num.intValue();
                if (zzakdVar.zza(intValue)) {
                    if (i9 != i8) {
                        list.set(i8, num);
                    }
                    i8++;
                } else {
                    ub = (UB) zza(obj, i7, intValue, ub, zzamoVar);
                }
            }
            if (i8 != size) {
                list.subList(i8, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzakdVar.zza(intValue2)) {
                    ub = (UB) zza(obj, i7, intValue2, ub, zzamoVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static int zzb(int i7, List<?> list) {
        int zza2;
        int zza3;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int zzi = zzajg.zzi(i7) * size;
        if (list instanceof zzakn) {
            zzakn zzaknVar = (zzakn) list;
            while (i8 < size) {
                Object zza4 = zzaknVar.zza(i8);
                if (zza4 instanceof zzaip) {
                    zza3 = zzajg.zza((zzaip) zza4);
                } else {
                    zza3 = zzajg.zza((String) zza4);
                }
                zzi = zza3 + zzi;
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                if (obj instanceof zzaip) {
                    zza2 = zzajg.zza((zzaip) obj);
                } else {
                    zza2 = zzajg.zza((String) obj);
                }
                zzi = zza2 + zzi;
                i8++;
            }
        }
        return zzi;
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
        zzajr<FT> zza2 = zzajmVar.zza(t8);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzajmVar.zzb(t7).zza(zza2);
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
