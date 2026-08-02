package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
final class zzmg {
    private static final zzmu<?, ?> zza = new zzmw();

    static int zza(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjn.zza(i, true);
    }

    static int zza(List<?> list) {
        return list.size();
    }

    static int zza(int i, List<zziy> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzf = size * zzjn.zzf(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzf += zzjn.zza(list.get(i2));
        }
        return zzf;
    }

    static int zzb(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzjn.zzf(i));
    }

    static int zzb(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkh)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzjn.zza(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        zzkh zzkhVar = (zzkh) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzjn.zza(zzkhVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zzc(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjn.zzb(i, 0);
    }

    static int zzc(List<?> list) {
        return list.size() << 2;
    }

    static int zzd(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzjn.zza(i, 0L);
    }

    static int zzd(List<?> list) {
        return list.size() << 3;
    }

    static int zza(int i, List<zzlm> list, zzme<?> zzmeVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzjn.zza(i, list.get(i3), zzmeVar);
        }
        return i2;
    }

    static int zze(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzjn.zzf(i));
    }

    static int zze(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkh)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzjn.zzc(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        zzkh zzkhVar = (zzkh) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzjn.zzc(zzkhVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zzf(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzjn.zzf(i));
    }

    static int zzf(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlb)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzjn.zzb(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        zzlb zzlbVar = (zzlb) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzjn.zzb(zzlbVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zza(int i, Object obj, zzme<?> zzmeVar) {
        if (obj instanceof zzku) {
            return zzjn.zzb(i, (zzku) obj);
        }
        return zzjn.zzb(i, (zzlm) obj, zzmeVar);
    }

    static int zzb(int i, List<?> list, zzme<?> zzmeVar) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzf = zzjn.zzf(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzku) {
                zza2 = zzjn.zza((zzku) obj);
            } else {
                zza2 = zzjn.zza((zzlm) obj, zzmeVar);
            }
            zzf += zza2;
        }
        return zzf;
    }

    static int zzg(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzjn.zzf(i));
    }

    static int zzg(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkh)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzjn.zze(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        zzkh zzkhVar = (zzkh) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzjn.zze(zzkhVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zzh(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzjn.zzf(i));
    }

    static int zzh(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlb)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzjn.zzd(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        zzlb zzlbVar = (zzlb) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzjn.zzd(zzlbVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zzb(int i, List<?> list) {
        int zza2;
        int zza3;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzf = zzjn.zzf(i) * size;
        if (!(list instanceof zzkx)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zziy) {
                    zza2 = zzjn.zza((zziy) obj);
                } else {
                    zza2 = zzjn.zza((String) obj);
                }
                zzf += zza2;
                i2++;
            }
            return zzf;
        }
        zzkx zzkxVar = (zzkx) list;
        while (i2 < size) {
            Object zza4 = zzkxVar.zza(i2);
            if (zza4 instanceof zziy) {
                zza3 = zzjn.zza((zziy) zza4);
            } else {
                zza3 = zzjn.zza((String) zza4);
            }
            zzf += zza3;
            i2++;
        }
        return zzf;
    }

    static int zzi(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzjn.zzf(i));
    }

    static int zzi(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkh)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzjn.zzg(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        zzkh zzkhVar = (zzkh) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzjn.zzg(zzkhVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zzj(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzjn.zzf(i));
    }

    static int zzj(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlb)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzjn.zze(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        zzlb zzlbVar = (zzlb) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzjn.zze(zzlbVar.zzb(i));
            i++;
        }
        return i3;
    }

    public static zzmu<?, ?> zza() {
        return zza;
    }

    static <UT, UB> UB zza(Object obj, int i, List<Integer> list, zzkl zzklVar, UB ub, zzmu<UT, UB> zzmuVar) {
        if (zzklVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzklVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(obj, i, intValue, ub, zzmuVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int intValue2 = it.next().intValue();
            if (!zzklVar.zza(intValue2)) {
                ub = (UB) zza(obj, i, intValue2, ub, zzmuVar);
                it.remove();
            }
        }
        return ub;
    }

    static <UT, UB> UB zza(Object obj, int i, int i2, UB ub, zzmu<UT, UB> zzmuVar) {
        if (ub == null) {
            ub = zzmuVar.zzc(obj);
        }
        zzmuVar.zzb(ub, i, i2);
        return ub;
    }

    static <T, FT extends zzjy<FT>> void zza(zzjv<FT> zzjvVar, T t, T t2) {
        zzjw<FT> zza2 = zzjvVar.zza(t2);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzjvVar.zzb(t).zza(zza2);
    }

    static <T> void zza(zzlj zzljVar, T t, T t2, long j) {
        zzmz.zza(t, j, zzljVar.zza(zzmz.zze(t, j), zzmz.zze(t2, j)));
    }

    static <T, UT, UB> void zza(zzmu<UT, UB> zzmuVar, T t, T t2) {
        zzmuVar.zzc(t, zzmuVar.zza(zzmuVar.zzd(t), zzmuVar.zzd(t2)));
    }

    public static void zza(Class<?> cls) {
        zzkg.class.isAssignableFrom(cls);
    }

    public static void zza(int i, List<Boolean> list, zznl zznlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zza(i, list, z);
    }

    public static void zza(int i, List<zziy> list, zznl zznlVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zza(i, list);
    }

    public static void zzb(int i, List<Double> list, zznl zznlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzb(i, list, z);
    }

    public static void zzc(int i, List<Integer> list, zznl zznlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzc(i, list, z);
    }

    public static void zzd(int i, List<Integer> list, zznl zznlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzd(i, list, z);
    }

    public static void zze(int i, List<Long> list, zznl zznlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zze(i, list, z);
    }

    public static void zzf(int i, List<Float> list, zznl zznlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzf(i, list, z);
    }

    public static void zza(int i, List<?> list, zznl zznlVar, zzme<?> zzmeVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zza(i, list, (zzme) zzmeVar);
    }

    public static void zzg(int i, List<Integer> list, zznl zznlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzg(i, list, z);
    }

    public static void zzh(int i, List<Long> list, zznl zznlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzh(i, list, z);
    }

    public static void zzb(int i, List<?> list, zznl zznlVar, zzme<?> zzmeVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzb(i, list, (zzme) zzmeVar);
    }

    public static void zzi(int i, List<Integer> list, zznl zznlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzi(i, list, z);
    }

    public static void zzj(int i, List<Long> list, zznl zznlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzj(i, list, z);
    }

    public static void zzk(int i, List<Integer> list, zznl zznlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzk(i, list, z);
    }

    public static void zzl(int i, List<Long> list, zznl zznlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzl(i, list, z);
    }

    public static void zzb(int i, List<String> list, zznl zznlVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzb(i, list);
    }

    public static void zzm(int i, List<Integer> list, zznl zznlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzm(i, list, z);
    }

    public static void zzn(int i, List<Long> list, zznl zznlVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznlVar.zzn(i, list, z);
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
