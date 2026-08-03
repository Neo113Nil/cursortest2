package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzakv {
    public final com.google.android.gms.internal.ads.zzagv zza;
    public final long zzb;
    public final long zzc;
    public final com.google.android.gms.internal.ads.zzakr zzd;
    public final int zze;
    public final int zzf;
    public final long[] zzg;

    private zzakv(com.google.android.gms.internal.ads.zzagv zzagvVar, long j, long j2, long[] jArr, com.google.android.gms.internal.ads.zzakr zzakrVar, int i, int i2) {
        this.zza = new com.google.android.gms.internal.ads.zzagv(zzagvVar);
        this.zzb = j;
        this.zzc = j2;
        this.zzg = jArr;
        this.zzd = zzakrVar;
        this.zze = i;
        this.zzf = i2;
    }

    public static com.google.android.gms.internal.ads.zzakv zza(com.google.android.gms.internal.ads.zzagv zzagvVar, com.google.android.gms.internal.ads.zzet zzetVar) {
        long[] jArr;
        com.google.android.gms.internal.ads.zzakr zzakrVar;
        int i;
        int i2;
        int zzB = zzetVar.zzB();
        int zzH = (zzB & 1) != 0 ? zzetVar.zzH() : -1;
        long zzz = (zzB & 2) != 0 ? zzetVar.zzz() : -1L;
        if ((zzB & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = zzetVar.zzs();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((zzB & 8) != 0) {
            zzetVar.zzk(4);
        }
        if (zzetVar.zzd() >= 24) {
            zzetVar.zzk(11);
            com.google.android.gms.internal.ads.zzakr zzb = com.google.android.gms.internal.ads.zzakr.zzb(java.lang.Float.intBitsToFloat(zzetVar.zzB()), zzetVar.zzt(), zzetVar.zzt());
            zzetVar.zzk(2);
            int zzx = zzetVar.zzx();
            i2 = zzx & 4095;
            zzakrVar = zzb;
            i = zzx >> 12;
        } else {
            zzakrVar = null;
            i = -1;
            i2 = -1;
        }
        return new com.google.android.gms.internal.ads.zzakv(zzagvVar, zzH, zzz, jArr, zzakrVar, i, i2);
    }

    public final long zzb() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        return com.google.android.gms.internal.ads.zzfl.zzt((j * r4.zzg) - 1, this.zza.zzd);
    }
}
