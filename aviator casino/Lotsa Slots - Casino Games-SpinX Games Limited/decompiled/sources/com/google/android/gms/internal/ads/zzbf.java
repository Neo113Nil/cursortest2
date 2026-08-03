package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbf {
    public static final com.google.android.gms.internal.ads.zzbf zza = new com.google.android.gms.internal.ads.zzbc();

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.lang.Integer.toString(0, 36);
        java.lang.Integer.toString(1, 36);
        java.lang.Integer.toString(2, 36);
    }

    protected zzbf() {
    }

    public final boolean equals(java.lang.Object obj) {
        int zzj;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzbf)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzbf zzbfVar = (com.google.android.gms.internal.ads.zzbf) obj;
        if (zzbfVar.zza() == zza() && zzbfVar.zzc() == zzc()) {
            com.google.android.gms.internal.ads.zzbe zzbeVar = new com.google.android.gms.internal.ads.zzbe();
            com.google.android.gms.internal.ads.zzbd zzbdVar = new com.google.android.gms.internal.ads.zzbd();
            com.google.android.gms.internal.ads.zzbe zzbeVar2 = new com.google.android.gms.internal.ads.zzbe();
            com.google.android.gms.internal.ads.zzbd zzbdVar2 = new com.google.android.gms.internal.ads.zzbd();
            for (int i = 0; i < zza(); i++) {
                if (!zzb(i, zzbeVar, 0L).equals(zzbfVar.zzb(i, zzbeVar2, 0L))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < zzc(); i2++) {
                if (!zzd(i2, zzbdVar, true).equals(zzbfVar.zzd(i2, zzbdVar2, true))) {
                    return false;
                }
            }
            int zzk = zzk(true);
            if (zzk == zzbfVar.zzk(true) && (zzj = zzj(true)) == zzbfVar.zzj(true)) {
                while (zzk != zzj) {
                    int zzh = zzh(zzk, 0, true);
                    if (zzh != zzbfVar.zzh(zzk, 0, true)) {
                        return false;
                    }
                    zzk = zzh;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        com.google.android.gms.internal.ads.zzbe zzbeVar = new com.google.android.gms.internal.ads.zzbe();
        com.google.android.gms.internal.ads.zzbd zzbdVar = new com.google.android.gms.internal.ads.zzbd();
        int zza2 = zza() + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        int i2 = 0;
        while (true) {
            i = zza2 * 31;
            if (i2 >= zza()) {
                break;
            }
            zza2 = i + zzb(i2, zzbeVar, 0L).hashCode();
            i2++;
        }
        int zzc = i + zzc();
        for (int i3 = 0; i3 < zzc(); i3++) {
            zzc = (zzc * 31) + zzd(i3, zzbdVar, true).hashCode();
        }
        int zzk = zzk(true);
        while (zzk != -1) {
            zzc = (zzc * 31) + zzk;
            zzk = zzh(zzk, 0, true);
        }
        return zzc;
    }

    public abstract int zza();

    public abstract com.google.android.gms.internal.ads.zzbe zzb(int i, com.google.android.gms.internal.ads.zzbe zzbeVar, long j);

    public abstract int zzc();

    public abstract com.google.android.gms.internal.ads.zzbd zzd(int i, com.google.android.gms.internal.ads.zzbd zzbdVar, boolean z);

    public abstract int zze(java.lang.Object obj);

    public abstract java.lang.Object zzf(int i);

    public final boolean zzg() {
        return zza() == 0;
    }

    public int zzh(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == zzj(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == zzj(z) ? zzk(z) : i + 1;
        }
        throw new java.lang.IllegalStateException();
    }

    public int zzi(int i, int i2, boolean z) {
        if (i == zzk(false)) {
            return -1;
        }
        return i - 1;
    }

    public int zzj(boolean z) {
        if (zzg()) {
            return -1;
        }
        return zza() - 1;
    }

    public int zzk(boolean z) {
        return zzg() ? -1 : 0;
    }

    public final int zzl(int i, com.google.android.gms.internal.ads.zzbd zzbdVar, com.google.android.gms.internal.ads.zzbe zzbeVar, int i2, boolean z) {
        int i3 = zzd(i, zzbdVar, false).zzc;
        if (zzb(i3, zzbeVar, 0L).zzo != i) {
            return i + 1;
        }
        int zzh = zzh(i3, i2, z);
        if (zzh == -1) {
            return -1;
        }
        return zzb(zzh, zzbeVar, 0L).zzn;
    }

    public final android.util.Pair zzm(com.google.android.gms.internal.ads.zzbe zzbeVar, com.google.android.gms.internal.ads.zzbd zzbdVar, int i, long j) {
        android.util.Pair zzn = zzn(zzbeVar, zzbdVar, i, j, 0L);
        zzn.getClass();
        return zzn;
    }

    public final android.util.Pair zzn(com.google.android.gms.internal.ads.zzbe zzbeVar, com.google.android.gms.internal.ads.zzbd zzbdVar, int i, long j, long j2) {
        com.google.android.gms.internal.ads.zzgtj.zzm(i, zza(), com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        zzb(i, zzbeVar, j2);
        if (j == -9223372036854775807L) {
            long j3 = zzbeVar.zzl;
            j = 0;
        }
        int i2 = zzbeVar.zzn;
        zzd(i2, zzbdVar, false);
        while (i2 < zzbeVar.zzo) {
            long j4 = zzbdVar.zze;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = zzd(i3, zzbdVar, false).zze;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        zzd(i2, zzbdVar, true);
        long j6 = zzbdVar.zze;
        long j7 = zzbdVar.zzd;
        if (j7 != -9223372036854775807L) {
            j = java.lang.Math.min(j, j7 - 1);
        }
        long max = java.lang.Math.max(0L, j);
        java.lang.Object obj = zzbdVar.zzb;
        obj.getClass();
        return android.util.Pair.create(obj, java.lang.Long.valueOf(max));
    }

    public com.google.android.gms.internal.ads.zzbd zzo(java.lang.Object obj, com.google.android.gms.internal.ads.zzbd zzbdVar) {
        return zzd(zze(obj), zzbdVar, true);
    }
}
