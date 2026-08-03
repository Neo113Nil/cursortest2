package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzsc {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.consent_sdk.zzsp zzb;

    static {
        int i = com.google.android.gms.internal.consent_sdk.zzpc.zza;
        zzb = new com.google.android.gms.internal.consent_sdk.zzsr();
    }

    public static void zzA(int i, java.util.List list, com.google.android.gms.internal.consent_sdk.zztb zztbVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzC(i, list, z);
    }

    public static void zzB(int i, java.util.List list, com.google.android.gms.internal.consent_sdk.zztb zztbVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzE(i, list, z);
    }

    public static void zzC(int i, java.util.List list, com.google.android.gms.internal.consent_sdk.zztb zztbVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzI(i, list, z);
    }

    public static void zzD(int i, java.util.List list, com.google.android.gms.internal.consent_sdk.zztb zztbVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzK(i, list, z);
    }

    static boolean zzE(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @java.lang.Deprecated
    static int zza(int i, com.google.android.gms.internal.consent_sdk.zzrq zzrqVar, com.google.android.gms.internal.consent_sdk.zzsa zzsaVar) {
        int zzC = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i << 3);
        return zzC + zzC + ((com.google.android.gms.internal.consent_sdk.zzpa) zzrqVar).zzj(zzsaVar);
    }

    static int zzb(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.consent_sdk.zzqn) {
            com.google.android.gms.internal.consent_sdk.zzqn zzqnVar = (com.google.android.gms.internal.consent_sdk.zzqn) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.consent_sdk.zzpv.zzD(zzqnVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.consent_sdk.zzpv.zzD(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzc(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.gms.internal.consent_sdk.zzpv.zzC(i << 3) + 4);
    }

    static int zzd(java.util.List list) {
        return list.size() * 4;
    }

    static int zze(int i, java.util.List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (com.google.android.gms.internal.consent_sdk.zzpv.zzC(i << 3) + 8);
    }

    static int zzf(java.util.List list) {
        return list.size() * 8;
    }

    static int zzg(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.consent_sdk.zzqn) {
            com.google.android.gms.internal.consent_sdk.zzqn zzqnVar = (com.google.android.gms.internal.consent_sdk.zzqn) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.consent_sdk.zzpv.zzD(zzqnVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.consent_sdk.zzpv.zzD(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzh(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.consent_sdk.zzre) {
            com.google.android.gms.internal.consent_sdk.zzre zzreVar = (com.google.android.gms.internal.consent_sdk.zzre) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.consent_sdk.zzpv.zzD(zzreVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.consent_sdk.zzpv.zzD(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzi(int i, java.lang.Object obj, com.google.android.gms.internal.consent_sdk.zzsa zzsaVar) {
        int zzC;
        int zzj;
        int zzC2;
        int i2 = i << 3;
        if (obj instanceof com.google.android.gms.internal.consent_sdk.zzra) {
            zzC = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i2);
            zzj = ((com.google.android.gms.internal.consent_sdk.zzra) obj).zza();
            zzC2 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzj);
        } else {
            zzC = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i2);
            zzj = ((com.google.android.gms.internal.consent_sdk.zzpa) obj).zzj(zzsaVar);
            zzC2 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzj);
        }
        return zzC + zzC2 + zzj;
    }

    static int zzj(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.consent_sdk.zzqn) {
            com.google.android.gms.internal.consent_sdk.zzqn zzqnVar = (com.google.android.gms.internal.consent_sdk.zzqn) list;
            i = 0;
            while (i2 < size) {
                int zze = zzqnVar.zze(i2);
                i += com.google.android.gms.internal.consent_sdk.zzpv.zzC((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((java.lang.Integer) list.get(i2)).intValue();
                i += com.google.android.gms.internal.consent_sdk.zzpv.zzC((intValue >> 31) ^ (intValue + intValue));
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
        if (list instanceof com.google.android.gms.internal.consent_sdk.zzre) {
            com.google.android.gms.internal.consent_sdk.zzre zzreVar = (com.google.android.gms.internal.consent_sdk.zzre) list;
            i = 0;
            while (i2 < size) {
                long zze = zzreVar.zze(i2);
                i += com.google.android.gms.internal.consent_sdk.zzpv.zzD((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((java.lang.Long) list.get(i2)).longValue();
                i += com.google.android.gms.internal.consent_sdk.zzpv.zzD((longValue >> 63) ^ (longValue + longValue));
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
        if (list instanceof com.google.android.gms.internal.consent_sdk.zzqn) {
            com.google.android.gms.internal.consent_sdk.zzqn zzqnVar = (com.google.android.gms.internal.consent_sdk.zzqn) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzqnVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.consent_sdk.zzpv.zzC(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzm(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.google.android.gms.internal.consent_sdk.zzre) {
            com.google.android.gms.internal.consent_sdk.zzre zzreVar = (com.google.android.gms.internal.consent_sdk.zzre) list;
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.consent_sdk.zzpv.zzD(zzreVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.google.android.gms.internal.consent_sdk.zzpv.zzD(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static com.google.android.gms.internal.consent_sdk.zzsp zzn() {
        return zzb;
    }

    static void zzo(com.google.android.gms.internal.consent_sdk.zzqb zzqbVar, java.lang.Object obj, java.lang.Object obj2) {
        if (((com.google.android.gms.internal.consent_sdk.zzqk) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzp(com.google.android.gms.internal.consent_sdk.zzsp zzspVar, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.consent_sdk.zzqm zzqmVar = (com.google.android.gms.internal.consent_sdk.zzqm) obj;
        com.google.android.gms.internal.consent_sdk.zzsq zzsqVar = zzqmVar.zzc;
        com.google.android.gms.internal.consent_sdk.zzsq zzsqVar2 = ((com.google.android.gms.internal.consent_sdk.zzqm) obj2).zzc;
        if (!com.google.android.gms.internal.consent_sdk.zzsq.zzc().equals(zzsqVar2)) {
            if (com.google.android.gms.internal.consent_sdk.zzsq.zzc().equals(zzsqVar)) {
                zzsqVar = com.google.android.gms.internal.consent_sdk.zzsq.zze(zzsqVar, zzsqVar2);
            } else {
                zzsqVar.zzd(zzsqVar2);
            }
        }
        zzqmVar.zzc = zzsqVar;
    }

    public static void zzq(int i, java.util.List list, com.google.android.gms.internal.consent_sdk.zztb zztbVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzc(i, list, z);
    }

    public static void zzr(int i, java.util.List list, com.google.android.gms.internal.consent_sdk.zztb zztbVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzg(i, list, z);
    }

    public static void zzs(int i, java.util.List list, com.google.android.gms.internal.consent_sdk.zztb zztbVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzi(i, list, z);
    }

    public static void zzt(int i, java.util.List list, com.google.android.gms.internal.consent_sdk.zztb zztbVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzk(i, list, z);
    }

    public static void zzu(int i, java.util.List list, com.google.android.gms.internal.consent_sdk.zztb zztbVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzm(i, list, z);
    }

    public static void zzv(int i, java.util.List list, com.google.android.gms.internal.consent_sdk.zztb zztbVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzo(i, list, z);
    }

    public static void zzw(int i, java.util.List list, com.google.android.gms.internal.consent_sdk.zztb zztbVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzr(i, list, z);
    }

    public static void zzx(int i, java.util.List list, com.google.android.gms.internal.consent_sdk.zztb zztbVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzt(i, list, z);
    }

    public static void zzy(int i, java.util.List list, com.google.android.gms.internal.consent_sdk.zztb zztbVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzy(i, list, z);
    }

    public static void zzz(int i, java.util.List list, com.google.android.gms.internal.consent_sdk.zztb zztbVar, boolean z) throws java.io.IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzA(i, list, z);
    }
}
