package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzex {
    private static final Class<?> zzug = zzfm();
    private static final zzfp<?, ?> zzuh = zzi(false);
    private static final zzfp<?, ?> zzui = zzi(true);
    private static final zzfp<?, ?> zzuj = new zzfr();

    static <UT, UB> UB zza(int i, int i2, UB ub, zzfp<UT, UB> zzfpVar) {
        if (ub == null) {
            ub = zzfpVar.zzfy();
        }
        zzfpVar.zza((zzfp<UT, UB>) ub, i, i2);
        return ub;
    }

    static <UT, UB> UB zza(int i, List<Integer> list, zzdf<?> zzdfVar, UB ub, zzfp<UT, UB> zzfpVar) {
        UB ub2;
        int intValue;
        if (zzdfVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            ub2 = ub;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = list.get(i3).intValue();
                if (zzdfVar.zzam(intValue2) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = (UB) zza(i, intValue2, ub2, zzfpVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            loop1: while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    intValue = it.next().intValue();
                    if (zzdfVar.zzam(intValue) == null) {
                        break;
                    }
                }
                ub = (UB) zza(i, intValue, ub2, zzfpVar);
                it.remove();
            }
        }
        return ub2;
    }

    public static void zza(int i, List<String> list, zzgj zzgjVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zza(i, list);
    }

    public static void zza(int i, List<?> list, zzgj zzgjVar, zzev zzevVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zza(i, list, zzevVar);
    }

    public static void zza(int i, List<Double> list, zzgj zzgjVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zzg(i, list, z);
    }

    static <T, FT extends zzcu<FT>> void zza(zzcp<FT> zzcpVar, T t, T t2) {
        zzcs<FT> zzc = zzcpVar.zzc(t2);
        if (zzc.isEmpty()) {
            return;
        }
        zzcpVar.zzd(t).zza(zzc);
    }

    static <T> void zza(zzec zzecVar, T t, T t2, long j) {
        zzfv.zza(t, j, zzecVar.zzb(zzfv.zzp(t, j), zzfv.zzp(t2, j)));
    }

    static <T, UT, UB> void zza(zzfp<UT, UB> zzfpVar, T t, T t2) {
        zzfpVar.zze(t, zzfpVar.zzg(zzfpVar.zzr(t), zzfpVar.zzr(t2)));
    }

    static int zzaa(List<?> list) {
        return list.size() << 3;
    }

    static int zzab(List<?> list) {
        return list.size();
    }

    public static void zzb(int i, List<zzbu> list, zzgj zzgjVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zzb(i, list);
    }

    public static void zzb(int i, List<?> list, zzgj zzgjVar, zzev zzevVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zzb(i, list, zzevVar);
    }

    public static void zzb(int i, List<Float> list, zzgj zzgjVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zzf(i, list, z);
    }

    static int zzc(int i, Object obj, zzev zzevVar) {
        return obj instanceof zzdo ? zzci.zza(i, (zzdo) obj) : zzci.zzb(i, (zzeh) obj, zzevVar);
    }

    static int zzc(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzaa = zzci.zzaa(i) * size;
        if (list instanceof zzdq) {
            zzdq zzdqVar = (zzdq) list;
            while (i2 < size) {
                Object raw = zzdqVar.getRaw(i2);
                zzaa += raw instanceof zzbu ? zzci.zzb((zzbu) raw) : zzci.zzam((String) raw);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                zzaa += obj instanceof zzbu ? zzci.zzb((zzbu) obj) : zzci.zzam((String) obj);
                i2++;
            }
        }
        return zzaa;
    }

    static int zzc(int i, List<?> list, zzev zzevVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzaa = zzci.zzaa(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            zzaa += obj instanceof zzdo ? zzci.zza((zzdo) obj) : zzci.zzb((zzeh) obj, zzevVar);
        }
        return zzaa;
    }

    public static void zzc(int i, List<Long> list, zzgj zzgjVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zzc(i, list, z);
    }

    static int zzd(int i, List<zzbu> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzaa = size * zzci.zzaa(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzaa += zzci.zzb(list.get(i2));
        }
        return zzaa;
    }

    static int zzd(int i, List<zzeh> list, zzev zzevVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzci.zzc(i, list.get(i3), zzevVar);
        }
        return i2;
    }

    public static void zzd(int i, List<Long> list, zzgj zzgjVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zzd(i, list, z);
    }

    static boolean zzd(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zze(int i, List<Long> list, zzgj zzgjVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zzn(i, list, z);
    }

    public static void zzf(int i, List<Long> list, zzgj zzgjVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zze(i, list, z);
    }

    public static zzfp<?, ?> zzfj() {
        return zzuh;
    }

    public static zzfp<?, ?> zzfk() {
        return zzui;
    }

    public static zzfp<?, ?> zzfl() {
        return zzuj;
    }

    private static Class<?> zzfm() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzfn() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzg(int i, List<Long> list, zzgj zzgjVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zzl(i, list, z);
    }

    public static void zzg(Class<?> cls) {
        Class<?> cls2;
        if (!zzdb.class.isAssignableFrom(cls) && (cls2 = zzug) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzh(int i, List<Integer> list, zzgj zzgjVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zza(i, list, z);
    }

    private static zzfp<?, ?> zzi(boolean z) {
        try {
            Class<?> zzfn = zzfn();
            if (zzfn == null) {
                return null;
            }
            return (zzfp) zzfn.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzi(int i, List<Integer> list, zzgj zzgjVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zzj(i, list, z);
    }

    public static void zzj(int i, List<Integer> list, zzgj zzgjVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zzm(i, list, z);
    }

    public static void zzk(int i, List<Integer> list, zzgj zzgjVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zzb(i, list, z);
    }

    public static void zzl(int i, List<Integer> list, zzgj zzgjVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zzk(i, list, z);
    }

    public static void zzm(int i, List<Integer> list, zzgj zzgjVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zzh(i, list, z);
    }

    public static void zzn(int i, List<Boolean> list, zzgj zzgjVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjVar.zzi(i, list, z);
    }

    static int zzo(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzs(list) + (list.size() * zzci.zzaa(i));
    }

    static int zzp(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzci.zzaa(i));
    }

    static int zzq(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzu(list) + (size * zzci.zzaa(i));
    }

    static int zzr(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzv(list) + (size * zzci.zzaa(i));
    }

    static int zzs(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzci.zzaa(i));
    }

    static int zzs(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdv) {
            zzdv zzdvVar = (zzdv) list;
            i = 0;
            while (i2 < size) {
                i += zzci.zzd(zzdvVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzci.zzd(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzt(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzx(list) + (size * zzci.zzaa(i));
    }

    static int zzt(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdv) {
            zzdv zzdvVar = (zzdv) list;
            i = 0;
            while (i2 < size) {
                i += zzci.zze(zzdvVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzci.zze(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzu(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzci.zzaa(i));
    }

    static int zzu(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdv) {
            zzdv zzdvVar = (zzdv) list;
            i = 0;
            while (i2 < size) {
                i += zzci.zzf(zzdvVar.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzci.zzf(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzv(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzci.zzj(i, 0);
    }

    static int zzv(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdc) {
            zzdc zzdcVar = (zzdc) list;
            i = 0;
            while (i2 < size) {
                i += zzci.zzag(zzdcVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzci.zzag(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzw(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzci.zzg(i, 0L);
    }

    static int zzw(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdc) {
            zzdc zzdcVar = (zzdc) list;
            i = 0;
            while (i2 < size) {
                i += zzci.zzab(zzdcVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzci.zzab(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzx(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzci.zzc(i, true);
    }

    static int zzx(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdc) {
            zzdc zzdcVar = (zzdc) list;
            i = 0;
            while (i2 < size) {
                i += zzci.zzac(zzdcVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzci.zzac(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzy(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdc) {
            zzdc zzdcVar = (zzdc) list;
            i = 0;
            while (i2 < size) {
                i += zzci.zzad(zzdcVar.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzci.zzad(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzz(List<?> list) {
        return list.size() << 2;
    }
}
