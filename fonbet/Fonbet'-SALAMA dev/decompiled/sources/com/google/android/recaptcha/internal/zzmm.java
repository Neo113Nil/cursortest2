package com.google.android.recaptcha.internal;

import W5.AbstractC0486a1;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzmm {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zznb zzc;
    private static final zznb zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zznb zznbVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zznbVar = (zznb) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        zzc = zznbVar;
        zzd = new zznd();
    }

    public static void zzA(int i7, List list, zzno zznoVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzu(i7, list, z4);
    }

    public static void zzB(int i7, List list, zzno zznoVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzy(i7, list, z4);
    }

    public static void zzC(int i7, List list, zzno zznoVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzA(i7, list, z4);
    }

    public static void zzD(int i7, List list, zzno zznoVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzC(i7, list, z4);
    }

    public static void zzE(int i7, List list, zzno zznoVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzE(i7, list, z4);
    }

    public static void zzF(int i7, List list, zzno zznoVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzJ(i7, list, z4);
    }

    public static void zzG(int i7, List list, zzno zznoVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzL(i7, list, z4);
    }

    public static boolean zzH(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzjg.zzy(zzktVar.zze(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzjg.zzy(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzb(int i7, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjg.zzx(i7 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i7, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjg.zzx(i7 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzjg.zzy(zzktVar.zze(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzjg.zzy(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzg(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzjg.zzy(zzlmVar.zze(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzjg.zzy(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzh(int i7, Object obj, zzmk zzmkVar) {
        int i8 = i7 << 3;
        if (!(obj instanceof zzli)) {
            return zzjg.zzv((zzlx) obj, zzmkVar) + zzjg.zzx(i8);
        }
        int zzx = zzjg.zzx(i8);
        int zza2 = ((zzli) obj).zza();
        return AbstractC0486a1.r(zza2, zza2, zzx);
    }

    public static int zzi(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            i7 = 0;
            while (i8 < size) {
                int zze = zzktVar.zze(i8);
                i7 += zzjg.zzx((zze >> 31) ^ (zze + zze));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                int intValue = ((Integer) list.get(i8)).intValue();
                i7 += zzjg.zzx((intValue >> 31) ^ (intValue + intValue));
                i8++;
            }
        }
        return i7;
    }

    public static int zzj(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            i7 = 0;
            while (i8 < size) {
                long zze = zzlmVar.zze(i8);
                i7 += zzjg.zzy((zze >> 63) ^ (zze + zze));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                long longValue = ((Long) list.get(i8)).longValue();
                i7 += zzjg.zzy((longValue >> 63) ^ (longValue + longValue));
                i8++;
            }
        }
        return i7;
    }

    public static int zzk(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzjg.zzx(zzktVar.zze(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzjg.zzx(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int zzl(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            i7 = 0;
            while (i8 < size) {
                i7 += zzjg.zzy(zzlmVar.zze(i8));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += zzjg.zzy(((Long) list.get(i8)).longValue());
                i8++;
            }
        }
        return i7;
    }

    public static zznb zzm() {
        return zzc;
    }

    public static zznb zzn() {
        return zzd;
    }

    public static Object zzo(Object obj, int i7, List list, zzkw zzkwVar, Object obj2, zznb zznbVar) {
        if (zzkwVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Integer num = (Integer) list.get(i9);
                int intValue = num.intValue();
                if (zzkwVar.zza(intValue)) {
                    if (i9 != i8) {
                        list.set(i8, num);
                    }
                    i8++;
                } else {
                    obj2 = zzp(obj, i7, intValue, obj2, zznbVar);
                }
            }
            if (i8 != size) {
                list.subList(i8, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzkwVar.zza(intValue2)) {
                    obj2 = zzp(obj, i7, intValue2, obj2, zznbVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzp(Object obj, int i7, int i8, Object obj2, zznb zznbVar) {
        if (obj2 == null) {
            obj2 = zznbVar.zzc(obj);
        }
        zznbVar.zzl(obj2, i7, i8);
        return obj2;
    }

    public static void zzq(zzke zzkeVar, Object obj, Object obj2) {
        zzki zzb2 = zzkeVar.zzb(obj2);
        if (zzb2.zza.isEmpty()) {
            return;
        }
        zzkeVar.zzc(obj).zzh(zzb2);
    }

    public static void zzr(zznb zznbVar, Object obj, Object obj2) {
        zznbVar.zzo(obj, zznbVar.zze(zznbVar.zzd(obj), zznbVar.zzd(obj2)));
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!zzks.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzt(int i7, List list, zzno zznoVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzc(i7, list, z4);
    }

    public static void zzu(int i7, List list, zzno zznoVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzg(i7, list, z4);
    }

    public static void zzv(int i7, List list, zzno zznoVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzj(i7, list, z4);
    }

    public static void zzw(int i7, List list, zzno zznoVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzl(i7, list, z4);
    }

    public static void zzx(int i7, List list, zzno zznoVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzn(i7, list, z4);
    }

    public static void zzy(int i7, List list, zzno zznoVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzp(i7, list, z4);
    }

    public static void zzz(int i7, List list, zzno zznoVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzs(i7, list, z4);
    }
}
