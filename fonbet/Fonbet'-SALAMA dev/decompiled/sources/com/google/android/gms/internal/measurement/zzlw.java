package com.google.android.gms.internal.measurement;

import W5.AbstractC0486a1;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzlw {
    private static final Class zza;
    private static final zzml zzb;
    private static final zzml zzc;
    private static final zzml zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzmn();
    }

    public static zzml zzA() {
        return zzc;
    }

    public static zzml zzB() {
        return zzd;
    }

    public static Object zzC(int i7, List list, zzkg zzkgVar, Object obj, zzml zzmlVar) {
        if (zzkgVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Integer num = (Integer) list.get(i9);
                int intValue = num.intValue();
                if (zzkgVar.zza(intValue)) {
                    if (i9 != i8) {
                        list.set(i8, num);
                    }
                    i8++;
                } else {
                    obj = zzD(i7, intValue, obj, zzmlVar);
                }
            }
            if (i8 != size) {
                list.subList(i8, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzkgVar.zza(intValue2)) {
                    obj = zzD(i7, intValue2, obj, zzmlVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static Object zzD(int i7, int i8, Object obj, zzml zzmlVar) {
        if (obj == null) {
            obj = zzmlVar.zze();
        }
        zzmlVar.zzf(obj, i7, i8);
        return obj;
    }

    public static void zzE(zzjp zzjpVar, Object obj, Object obj2) {
        zzjpVar.zza(obj2);
        throw null;
    }

    public static void zzF(zzml zzmlVar, Object obj, Object obj2) {
        zzmlVar.zzh(obj, zzmlVar.zzd(zzmlVar.zzc(obj), zzmlVar.zzc(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzkc.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzH(int i7, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzc(i7, list, z4);
    }

    public static void zzI(int i7, List list, zznd zzndVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zze(i7, list);
    }

    public static void zzJ(int i7, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzg(i7, list, z4);
    }

    public static void zzK(int i7, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzj(i7, list, z4);
    }

    public static void zzL(int i7, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzl(i7, list, z4);
    }

    public static void zzM(int i7, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzn(i7, list, z4);
    }

    public static void zzN(int i7, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzp(i7, list, z4);
    }

    public static void zzO(int i7, List list, zznd zzndVar, zzlu zzluVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((zzjk) zzndVar).zzq(i7, list.get(i8), zzluVar);
        }
    }

    public static void zzP(int i7, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzs(i7, list, z4);
    }

    public static void zzQ(int i7, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzu(i7, list, z4);
    }

    public static void zzR(int i7, List list, zznd zzndVar, zzlu zzluVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((zzjk) zzndVar).zzv(i7, list.get(i8), zzluVar);
        }
    }

    public static void zzS(int i7, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzx(i7, list, z4);
    }

    public static void zzT(int i7, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzz(i7, list, z4);
    }

    public static void zzU(int i7, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzB(i7, list, z4);
    }

    public static void zzV(int i7, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzD(i7, list, z4);
    }

    public static void zzW(int i7, List list, zznd zzndVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzG(i7, list);
    }

    public static void zzX(int i7, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzI(i7, list, z4);
    }

    public static void zzY(int i7, List list, zznd zzndVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzK(i7, list, z4);
    }

    public static boolean zzZ(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(int i7, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzA(i7 << 3) + 1) * size;
    }

    public static void zzaa(zzle zzleVar, Object obj, Object obj2, long j) {
        zzmv.zzs(obj, j, zzle.zzb(zzmv.zzf(obj, j), zzmv.zzf(obj2, j)));
    }

    private static zzml zzab(boolean z4) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzml) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z4));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List list) {
        return list.size();
    }

    public static int zzc(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzjj.zzz(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            zzz += zzjj.zzt((zzjb) list.get(i8));
        }
        return zzz;
    }

    public static int zzd(int i7, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i7) * size) + zze(list);
    }

    public static int zze(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkd) {
            zzkd zzkdVar = (zzkd) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzjj.zzv(zzkdVar.zze(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzjj.zzv(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzf(int i7, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzA(i7 << 3) + 4) * size;
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i7, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzA(i7 << 3) + 8) * size;
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i7, List list, zzlu zzluVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += zzjj.zzu(i7, (zzlj) list.get(i9), zzluVar);
        }
        return i8;
    }

    public static int zzk(int i7, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i7) * size) + zzl(list);
    }

    public static int zzl(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkd) {
            zzkd zzkdVar = (zzkd) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzjj.zzv(zzkdVar.zze(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzjj.zzv(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzm(int i7, List list, boolean z4) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzjj.zzz(i7) * list.size()) + zzn(list);
    }

    public static int zzn(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzky) {
            zzky zzkyVar = (zzky) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzjj.zzB(zzkyVar.zza(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzjj.zzB(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzo(int i7, Object obj, zzlu zzluVar) {
        if (!(obj instanceof zzkp)) {
            return zzjj.zzx((zzlj) obj, zzluVar) + zzjj.zzA(i7 << 3);
        }
        int zzA = zzjj.zzA(i7 << 3);
        int zza2 = ((zzkp) obj).zza();
        return AbstractC0486a1.p(zza2, zza2, zzA);
    }

    public static int zzp(int i7, List list, zzlu zzluVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzjj.zzz(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            zzz = (obj instanceof zzkp ? zzjj.zzw((zzkp) obj) : zzjj.zzx((zzlj) obj, zzluVar)) + zzz;
        }
        return zzz;
    }

    public static int zzq(int i7, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i7) * size) + zzr(list);
    }

    public static int zzr(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkd) {
            zzkd zzkdVar = (zzkd) list;
            i7 = 0;
            while (i8 < size) {
                int zze = zzkdVar.zze(i8);
                i7 += zzjj.zzA((zze >> 31) ^ (zze + zze));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                int intValue = ((Integer) list.get(i8)).intValue();
                i7 += zzjj.zzA((intValue >> 31) ^ (intValue + intValue));
                i8++;
            }
        }
        return i7;
    }

    public static int zzs(int i7, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i7) * size) + zzt(list);
    }

    public static int zzt(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzky) {
            zzky zzkyVar = (zzky) list;
            i7 = 0;
            while (i8 < size) {
                long zza2 = zzkyVar.zza(i8);
                i7 += zzjj.zzB((zza2 >> 63) ^ (zza2 + zza2));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                long longValue = ((Long) list.get(i8)).longValue();
                i7 += zzjj.zzB((longValue >> 63) ^ (longValue + longValue));
                i8++;
            }
        }
        return i7;
    }

    public static int zzu(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int zzz = zzjj.zzz(i7) * size;
        if (list instanceof zzkr) {
            zzkr zzkrVar = (zzkr) list;
            while (i8 < size) {
                Object zzf = zzkrVar.zzf(i8);
                zzz = (zzf instanceof zzjb ? zzjj.zzt((zzjb) zzf) : zzjj.zzy((String) zzf)) + zzz;
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                zzz = (obj instanceof zzjb ? zzjj.zzt((zzjb) obj) : zzjj.zzy((String) obj)) + zzz;
                i8++;
            }
        }
        return zzz;
    }

    public static int zzv(int i7, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i7) * size) + zzw(list);
    }

    public static int zzw(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkd) {
            zzkd zzkdVar = (zzkd) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzjj.zzA(zzkdVar.zze(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzjj.zzA(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzx(int i7, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjj.zzz(i7) * size) + zzy(list);
    }

    public static int zzy(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzky) {
            zzky zzkyVar = (zzky) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzjj.zzB(zzkyVar.zza(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzjj.zzB(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static zzml zzz() {
        return zzb;
    }
}
