package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzgr {
    private static final java.lang.Class zza;
    private static final com.google.android.gms.internal.play_games_inputmapping.zzhd zzb;
    private static final com.google.android.gms.internal.play_games_inputmapping.zzhd zzc;
    private static final com.google.android.gms.internal.play_games_inputmapping.zzhd zzd;

    static {
        java.lang.Class<?> cls;
        try {
            cls = java.lang.Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzZ(false);
        zzc = zzZ(true);
        zzd = new com.google.android.gms.internal.play_games_inputmapping.zzhf();
    }

    static int zzA(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzz(list) + (size * com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i));
    }

    static int zzB(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_games_inputmapping.zzfd) {
            com.google.android.gms.internal.play_games_inputmapping.zzfd zzfdVar = (com.google.android.gms.internal.play_games_inputmapping.zzfd) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_games_inputmapping.zzep.zzv(zzfdVar.zzf(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_games_inputmapping.zzep.zzv(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzC(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzB(list) + (size * com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i));
    }

    static int zzD(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_games_inputmapping.zzfd) {
            com.google.android.gms.internal.play_games_inputmapping.zzfd zzfdVar = (com.google.android.gms.internal.play_games_inputmapping.zzfd) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzfdVar.zzf(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzE(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzD(list) + (size * com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i));
    }

    static int zzF(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_games_inputmapping.zzfd) {
            com.google.android.gms.internal.play_games_inputmapping.zzfd zzfdVar = (com.google.android.gms.internal.play_games_inputmapping.zzfd) list;
            i = 0;
            while (i2 < size) {
                int zzf = zzfdVar.zzf(i2);
                i += com.google.android.gms.internal.play_games_inputmapping.zzep.zzw((zzf >> 31) ^ (zzf + zzf));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((java.lang.Integer) list.get(i2)).intValue();
                i += com.google.android.gms.internal.play_games_inputmapping.zzep.zzw((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    static int zzG(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzF(list) + (size * com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i));
    }

    static int zzH(java.util.List list) {
        return list.size() * 4;
    }

    static int zzI(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i << 3) + 4);
    }

    static int zzJ(java.util.List list) {
        return list.size() * 8;
    }

    static int zzK(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i << 3) + 8);
    }

    static int zzL(java.util.List list) {
        return list.size();
    }

    static int zzM(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i << 3) + 1);
    }

    static int zzN(int i, java.util.List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i) * size;
        if (list instanceof com.google.android.gms.internal.play_games_inputmapping.zzfp) {
            com.google.android.gms.internal.play_games_inputmapping.zzfp zzfpVar = (com.google.android.gms.internal.play_games_inputmapping.zzfp) list;
            while (i2 < size) {
                java.lang.Object zze = zzfpVar.zze(i2);
                zzu += zze instanceof com.google.android.gms.internal.play_games_inputmapping.zzek ? com.google.android.gms.internal.play_games_inputmapping.zzep.zzA((com.google.android.gms.internal.play_games_inputmapping.zzek) zze) : com.google.android.gms.internal.play_games_inputmapping.zzep.zzy((java.lang.String) zze);
                i2++;
            }
        } else {
            while (i2 < size) {
                java.lang.Object obj = list.get(i2);
                zzu += obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzek ? com.google.android.gms.internal.play_games_inputmapping.zzep.zzA((com.google.android.gms.internal.play_games_inputmapping.zzek) obj) : com.google.android.gms.internal.play_games_inputmapping.zzep.zzy((java.lang.String) obj);
                i2++;
            }
        }
        return zzu;
    }

    static int zzO(int i, java.lang.Object obj, com.google.android.gms.internal.play_games_inputmapping.zzgp zzgpVar) {
        if (!(obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzfn)) {
            return com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i << 3) + com.google.android.gms.internal.play_games_inputmapping.zzep.zzB((com.google.android.gms.internal.play_games_inputmapping.zzge) obj, zzgpVar);
        }
        int zzw = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i << 3);
        int zza2 = ((com.google.android.gms.internal.play_games_inputmapping.zzfn) obj).zza();
        return zzw + com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zza2) + zza2;
    }

    static int zzP(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzgp zzgpVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = list.get(i2);
            zzu += obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzfn ? com.google.android.gms.internal.play_games_inputmapping.zzep.zzz((com.google.android.gms.internal.play_games_inputmapping.zzfn) obj) : com.google.android.gms.internal.play_games_inputmapping.zzep.zzB((com.google.android.gms.internal.play_games_inputmapping.zzge) obj, zzgpVar);
        }
        return zzu;
    }

    static int zzQ(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzu = size * com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzu += com.google.android.gms.internal.play_games_inputmapping.zzep.zzA((com.google.android.gms.internal.play_games_inputmapping.zzek) list.get(i2));
        }
        return zzu;
    }

    static int zzR(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzgp zzgpVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += com.google.android.gms.internal.play_games_inputmapping.zzep.zzE(i, (com.google.android.gms.internal.play_games_inputmapping.zzge) list.get(i3), zzgpVar);
        }
        return i2;
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzhd zzS() {
        return zzb;
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzhd zzT() {
        return zzc;
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzhd zzU() {
        return zzd;
    }

    static boolean zzV(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzW(com.google.android.gms.internal.play_games_inputmapping.zzes zzesVar, java.lang.Object obj, java.lang.Object obj2) {
        zzesVar.zzb(obj2);
        throw null;
    }

    static void zzX(com.google.android.gms.internal.play_games_inputmapping.zzhd zzhdVar, java.lang.Object obj, java.lang.Object obj2) {
        zzhdVar.zza(obj, zzhdVar.zze(zzhdVar.zzb(obj), zzhdVar.zzb(obj2)));
    }

    static void zzY(com.google.android.gms.internal.play_games_inputmapping.zzfz zzfzVar, java.lang.Object obj, java.lang.Object obj2, long j) {
        com.google.android.gms.internal.play_games_inputmapping.zzfy zzfyVar = (com.google.android.gms.internal.play_games_inputmapping.zzfy) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j);
        com.google.android.gms.internal.play_games_inputmapping.zzfy zzfyVar2 = (com.google.android.gms.internal.play_games_inputmapping.zzfy) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj2, j);
        if (!zzfyVar2.isEmpty()) {
            if (!zzfyVar.zzd()) {
                zzfyVar = zzfyVar.zzb();
            }
            zzfyVar.zza(zzfyVar2);
        }
        com.google.android.gms.internal.play_games_inputmapping.zzhn.zzo(obj, j, zzfyVar);
    }

    private static com.google.android.gms.internal.play_games_inputmapping.zzhd zzZ(boolean z) {
        java.lang.Class<?> cls;
        try {
            cls = java.lang.Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (com.google.android.gms.internal.play_games_inputmapping.zzhd) cls.getConstructor(java.lang.Boolean.TYPE).newInstance(java.lang.Boolean.valueOf(z));
        } catch (java.lang.Throwable unused2) {
            return null;
        }
    }

    public static void zza(java.lang.Class cls) {
        java.lang.Class cls2;
        if (!com.google.android.gms.internal.play_games_inputmapping.zzfc.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzb(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzz(i, list, z);
    }

    public static void zzc(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzy(i, list, z);
    }

    public static void zzd(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzv(i, list, z);
    }

    public static void zze(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzw(i, list, z);
    }

    public static void zzf(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzI(i, list, z);
    }

    public static void zzg(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzx(i, list, z);
    }

    public static void zzh(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzG(i, list, z);
    }

    public static void zzi(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzt(i, list, z);
    }

    public static void zzj(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzE(i, list, z);
    }

    public static void zzk(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzH(i, list, z);
    }

    public static void zzl(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzu(i, list, z);
    }

    public static void zzm(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzF(i, list, z);
    }

    public static void zzn(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzA(i, list, z);
    }

    public static void zzo(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzB(i, list, z);
    }

    public static void zzp(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzC(i, list);
    }

    public static void zzq(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhuVar.zzD(i, list);
    }

    public static void zzr(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar, com.google.android.gms.internal.play_games_inputmapping.zzgp zzgpVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((com.google.android.gms.internal.play_games_inputmapping.zzeq) zzhuVar).zzr(i, list.get(i2), zzgpVar);
        }
    }

    public static void zzs(int i, java.util.List list, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar, com.google.android.gms.internal.play_games_inputmapping.zzgp zzgpVar) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((com.google.android.gms.internal.play_games_inputmapping.zzeq) zzhuVar).zzs(i, list.get(i2), zzgpVar);
        }
    }

    static int zzt(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_games_inputmapping.zzft) {
            com.google.android.gms.internal.play_games_inputmapping.zzft zzftVar = (com.google.android.gms.internal.play_games_inputmapping.zzft) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_games_inputmapping.zzep.zzx(zzftVar.zzd(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_games_inputmapping.zzep.zzx(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzu(int i, java.util.List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzt(list) + (list.size() * com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i));
    }

    static int zzv(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_games_inputmapping.zzft) {
            com.google.android.gms.internal.play_games_inputmapping.zzft zzftVar = (com.google.android.gms.internal.play_games_inputmapping.zzft) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_games_inputmapping.zzep.zzx(zzftVar.zzd(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_games_inputmapping.zzep.zzx(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzw(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzv(list) + (size * com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i));
    }

    static int zzx(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_games_inputmapping.zzft) {
            com.google.android.gms.internal.play_games_inputmapping.zzft zzftVar = (com.google.android.gms.internal.play_games_inputmapping.zzft) list;
            i = 0;
            while (i2 < size) {
                long zzd2 = zzftVar.zzd(i2);
                i += com.google.android.gms.internal.play_games_inputmapping.zzep.zzx((zzd2 >> 63) ^ (zzd2 + zzd2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((java.lang.Long) list.get(i2)).longValue();
                i += com.google.android.gms.internal.play_games_inputmapping.zzep.zzx((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    static int zzy(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzx(list) + (size * com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i));
    }

    static int zzz(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.play_games_inputmapping.zzfd) {
            com.google.android.gms.internal.play_games_inputmapping.zzfd zzfdVar = (com.google.android.gms.internal.play_games_inputmapping.zzfd) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_games_inputmapping.zzep.zzv(zzfdVar.zzf(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.play_games_inputmapping.zzep.zzv(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }
}
