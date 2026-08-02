package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
final class zzahd implements zzahg {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzahd(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzen.zzs(jArr2[jArr2.length - 1]) : j;
    }

    public static zzahd zzb(long j, zzagi zzagiVar, long j3) {
        int length = zzagiVar.zzd.length;
        int i7 = length + 1;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        jArr[0] = j;
        long j7 = 0;
        jArr2[0] = 0;
        for (int i8 = 1; i8 <= length; i8++) {
            int i9 = i8 - 1;
            j += zzagiVar.zzb + zzagiVar.zzd[i9];
            j7 += zzagiVar.zzc + zzagiVar.zze[i9];
            jArr[i8] = j;
            jArr2[i8] = j7;
        }
        return new zzahd(jArr, jArr2, j3);
    }

    private static Pair zzf(long j, long[] jArr, long[] jArr2) {
        int zzd = zzen.zzd(jArr, j, true, true);
        long j3 = jArr[zzd];
        long j7 = jArr2[zzd];
        int i7 = zzd + 1;
        if (i7 == jArr.length) {
            return Pair.create(Long.valueOf(j3), Long.valueOf(j7));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i7] == j3 ? 0.0d : (j - j3) / (r6 - j3)) * (jArr2[i7] - j7))) + j7));
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahg
    public final int zzc() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.zzahg
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahg
    public final long zze(long j) {
        return zzen.zzs(((Long) zzf(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        int i7 = zzen.zza;
        Pair zzf = zzf(zzen.zzv(Math.max(0L, Math.min(j, this.zzc))), this.zzb, this.zza);
        zzadv zzadvVar = new zzadv(zzen.zzs(((Long) zzf.first).longValue()), ((Long) zzf.second).longValue());
        return new zzads(zzadvVar, zzadvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }
}
