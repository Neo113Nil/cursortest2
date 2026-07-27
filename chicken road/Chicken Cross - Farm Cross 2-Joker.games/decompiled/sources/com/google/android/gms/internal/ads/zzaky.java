package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzaky implements zzalf {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzaky(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzfm.zzt(jArr2[jArr2.length - 1]) : j;
    }

    public static zzaky zze(long j, zzakc zzakcVar, long j2) {
        int length = zzakcVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzakcVar.zzb + r0[i3];
            j3 += zzakcVar.zzc + zzakcVar.zze[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzaky(jArr, jArr2, j2);
    }

    private static Pair zzi(long j, long[] jArr, long[] jArr2) {
        int zzo = zzfm.zzo(jArr, j, true, true);
        long j2 = jArr[zzo];
        long j3 = jArr2[zzo];
        int i = zzo + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j) {
        String str = zzfm.zza;
        Pair zzi = zzi(zzfm.zzs(Math.max(0L, Math.min(j, this.zzc))), this.zzb, this.zza);
        zzahl zzahlVar = new zzahl(zzfm.zzt(((Long) zzi.first).longValue()), ((Long) zzi.second).longValue());
        return new zzahi(zzahlVar, zzahlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final long zzf(long j) {
        return zzfm.zzt(((Long) zzi(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final long zzg() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final int zzh() {
        return -2147483647;
    }
}
