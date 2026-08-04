package com.google.android.recaptcha.internal;

import W5.AbstractC0486a1;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
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
        int iZzy;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            iZzy = 0;
            while (i7 < size) {
                iZzy += zzjg.zzy(zzktVar.zze(i7));
                i7++;
            }
        } else {
            iZzy = 0;
            while (i7 < size) {
                iZzy += zzjg.zzy(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iZzy;
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
        int iZzy;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            iZzy = 0;
            while (i7 < size) {
                iZzy += zzjg.zzy(zzktVar.zze(i7));
                i7++;
            }
        } else {
            iZzy = 0;
            while (i7 < size) {
                iZzy += zzjg.zzy(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iZzy;
    }

    public static int zzg(List list) {
        int iZzy;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            iZzy = 0;
            while (i7 < size) {
                iZzy += zzjg.zzy(zzlmVar.zze(i7));
                i7++;
            }
        } else {
            iZzy = 0;
            while (i7 < size) {
                iZzy += zzjg.zzy(((Long) list.get(i7)).longValue());
                i7++;
            }
        }
        return iZzy;
    }

    public static int zzh(int i7, Object obj, zzmk zzmkVar) {
        int i8 = i7 << 3;
        if (!(obj instanceof zzli)) {
            return zzjg.zzv((zzlx) obj, zzmkVar) + zzjg.zzx(i8);
        }
        int iZzx = zzjg.zzx(i8);
        int iZza = ((zzli) obj).zza();
        return AbstractC0486a1.r(iZza, iZza, iZzx);
    }

    public static int zzi(List list) {
        int iZzx;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            iZzx = 0;
            while (i7 < size) {
                int iZze = zzktVar.zze(i7);
                iZzx += zzjg.zzx((iZze >> 31) ^ (iZze + iZze));
                i7++;
            }
        } else {
            iZzx = 0;
            while (i7 < size) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                iZzx += zzjg.zzx((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i7++;
            }
        }
        return iZzx;
    }

    public static int zzj(List list) {
        int iZzy;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            iZzy = 0;
            while (i7 < size) {
                long jZze = zzlmVar.zze(i7);
                iZzy += zzjg.zzy((jZze >> 63) ^ (jZze + jZze));
                i7++;
            }
        } else {
            iZzy = 0;
            while (i7 < size) {
                long jLongValue = ((Long) list.get(i7)).longValue();
                iZzy += zzjg.zzy((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i7++;
            }
        }
        return iZzy;
    }

    public static int zzk(List list) {
        int iZzx;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            iZzx = 0;
            while (i7 < size) {
                iZzx += zzjg.zzx(zzktVar.zze(i7));
                i7++;
            }
        } else {
            iZzx = 0;
            while (i7 < size) {
                iZzx += zzjg.zzx(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iZzx;
    }

    public static int zzl(List list) {
        int iZzy;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            iZzy = 0;
            while (i7 < size) {
                iZzy += zzjg.zzy(zzlmVar.zze(i7));
                i7++;
            }
        } else {
            iZzy = 0;
            while (i7 < size) {
                iZzy += zzjg.zzy(((Long) list.get(i7)).longValue());
                i7++;
            }
        }
        return iZzy;
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
                int iIntValue = num.intValue();
                if (zzkwVar.zza(iIntValue)) {
                    if (i9 != i8) {
                        list.set(i8, num);
                    }
                    i8++;
                } else {
                    obj2 = zzp(obj, i7, iIntValue, obj2, zznbVar);
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
                if (!zzkwVar.zza(iIntValue2)) {
                    obj2 = zzp(obj, i7, iIntValue2, obj2, zznbVar);
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
        zzki zzkiVarZzb = zzkeVar.zzb(obj2);
        if (zzkiVarZzb.zza.isEmpty()) {
            return;
        }
        zzkeVar.zzc(obj).zzh(zzkiVarZzb);
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
