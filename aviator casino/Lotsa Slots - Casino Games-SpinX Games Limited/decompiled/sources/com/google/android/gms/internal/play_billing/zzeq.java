package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzeq {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.Class zzb;
    private static final com.google.android.gms.internal.play_billing.zzff zzc;
    private static final com.google.android.gms.internal.play_billing.zzff zzd;

    static {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2;
        com.google.android.gms.internal.play_billing.zzff zzffVar = null;
        try {
            cls = java.lang.Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = java.lang.Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (java.lang.Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzffVar = (com.google.android.gms.internal.play_billing.zzff) cls2.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.Throwable unused3) {
            }
        }
        zzc = zzffVar;
        zzd = new com.google.android.gms.internal.play_billing.zzfh();
    }

    public static void zzA(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzfx zzfxVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzy(i, list, z);
    }

    public static void zzB(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzfx zzfxVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzA(i, list, z);
    }

    public static void zzC(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzfx zzfxVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzC(i, list, z);
    }

    public static void zzD(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzfx zzfxVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzE(i, list, z);
    }

    public static void zzE(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzfx zzfxVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzJ(i, list, z);
    }

    public static void zzF(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzfx zzfxVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzL(i, list, z);
    }

    static boolean zzG(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.zzct) {
            com.google.android.gms.internal.play_billing.zzct zzctVar = (com.google.android.gms.internal.play_billing.zzct) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_billing.zzby.zzx(zzctVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_billing.zzby.zzx(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzb(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.gms.internal.play_billing.zzby.zzw(i << 3) + 4);
    }

    static int zzc(java.util.List list) {
        return list.size() * 4;
    }

    static int zzd(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.gms.internal.play_billing.zzby.zzw(i << 3) + 8);
    }

    static int zze(java.util.List list) {
        return list.size() * 8;
    }

    static int zzf(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.zzct) {
            com.google.android.gms.internal.play_billing.zzct zzctVar = (com.google.android.gms.internal.play_billing.zzct) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_billing.zzby.zzx(zzctVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_billing.zzby.zzx(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzg(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.zzdr) {
            com.google.android.gms.internal.play_billing.zzdr zzdrVar = (com.google.android.gms.internal.play_billing.zzdr) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_billing.zzby.zzx(zzdrVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_billing.zzby.zzx(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzh(int i, java.lang.Object obj, com.google.android.gms.internal.play_billing.zzeo zzeoVar) {
        int i2 = i << 3;
        if (!(obj instanceof com.google.android.gms.internal.play_billing.zzdi)) {
            return com.google.android.gms.internal.play_billing.zzby.zzw(i2) + com.google.android.gms.internal.play_billing.zzby.zzu((com.google.android.gms.internal.play_billing.zzec) obj, zzeoVar);
        }
        int zzw = com.google.android.gms.internal.play_billing.zzby.zzw(i2);
        int zza2 = ((com.google.android.gms.internal.play_billing.zzdi) obj).zza();
        return zzw + com.google.android.gms.internal.play_billing.zzby.zzw(zza2) + zza2;
    }

    static int zzi(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.zzct) {
            com.google.android.gms.internal.play_billing.zzct zzctVar = (com.google.android.gms.internal.play_billing.zzct) list;
            i = 0;
            while (i2 < size) {
                int zze = zzctVar.zze(i2);
                i += com.google.android.gms.internal.play_billing.zzby.zzw((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((java.lang.Integer) list.get(i2)).intValue();
                i += com.google.android.gms.internal.play_billing.zzby.zzw((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    static int zzj(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.zzdr) {
            com.google.android.gms.internal.play_billing.zzdr zzdrVar = (com.google.android.gms.internal.play_billing.zzdr) list;
            i = 0;
            while (i2 < size) {
                long zze = zzdrVar.zze(i2);
                i += com.google.android.gms.internal.play_billing.zzby.zzx((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((java.lang.Long) list.get(i2)).longValue();
                i += com.google.android.gms.internal.play_billing.zzby.zzx((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    static int zzk(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.zzct) {
            com.google.android.gms.internal.play_billing.zzct zzctVar = (com.google.android.gms.internal.play_billing.zzct) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_billing.zzby.zzw(zzctVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_billing.zzby.zzw(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzl(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_billing.zzdr) {
            com.google.android.gms.internal.play_billing.zzdr zzdrVar = (com.google.android.gms.internal.play_billing.zzdr) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_billing.zzby.zzx(zzdrVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_billing.zzby.zzx(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static com.google.android.gms.internal.play_billing.zzff zzm() {
        return zzc;
    }

    public static com.google.android.gms.internal.play_billing.zzff zzn() {
        return zzd;
    }

    static java.lang.Object zzo(java.lang.Object obj, int i, int i2, java.lang.Object obj2, com.google.android.gms.internal.play_billing.zzff zzffVar) {
        if (obj2 == null) {
            obj2 = zzffVar.zzc(obj);
        }
        zzffVar.zzf(obj2, i, i2);
        return obj2;
    }

    static void zzp(com.google.android.gms.internal.play_billing.zzce zzceVar, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_billing.zzci zzb2 = zzceVar.zzb(obj2);
        if (zzb2.zza.isEmpty()) {
            return;
        }
        zzceVar.zzc(obj).zzh(zzb2);
    }

    static void zzq(com.google.android.gms.internal.play_billing.zzff zzffVar, java.lang.Object obj, java.lang.Object obj2) {
        zzffVar.zzh(obj, zzffVar.zze(zzffVar.zzd(obj), zzffVar.zzd(obj2)));
    }

    public static void zzr(java.lang.Class cls) {
        java.lang.Class cls2;
        if (!com.google.android.gms.internal.play_billing.zzcs.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzs(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzfx zzfxVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzc(i, list, z);
    }

    public static void zzt(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzfx zzfxVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzg(i, list, z);
    }

    public static void zzu(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzfx zzfxVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzj(i, list, z);
    }

    public static void zzv(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzfx zzfxVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzl(i, list, z);
    }

    public static void zzw(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzfx zzfxVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzn(i, list, z);
    }

    public static void zzx(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzfx zzfxVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzp(i, list, z);
    }

    public static void zzy(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzfx zzfxVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzs(i, list, z);
    }

    public static void zzz(int i, java.util.List list, com.google.android.gms.internal.play_billing.zzfx zzfxVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzu(i, list, z);
    }
}
