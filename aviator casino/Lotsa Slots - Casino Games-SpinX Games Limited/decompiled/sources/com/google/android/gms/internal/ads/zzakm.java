package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzakm implements com.google.android.gms.internal.ads.zzakt {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzakm(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? com.google.android.gms.internal.ads.zzfl.zzs(jArr2[jArr2.length - 1]) : j;
    }

    public static com.google.android.gms.internal.ads.zzakm zze(long j, com.google.android.gms.internal.ads.zzajr zzajrVar, long j2) {
        int length = zzajrVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzajrVar.zzb + r0[i3];
            j3 += zzajrVar.zzc + zzajrVar.zze[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new com.google.android.gms.internal.ads.zzakm(jArr, jArr2, j2);
    }

    private static android.util.Pair zzi(long j, long[] jArr, long[] jArr2) {
        int zzo = com.google.android.gms.internal.ads.zzfl.zzo(jArr, j, true, true);
        long j2 = jArr[zzo];
        long j3 = jArr2[zzo];
        int i = zzo + 1;
        if (i == jArr.length) {
            return android.util.Pair.create(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3));
        }
        return android.util.Pair.create(java.lang.Long.valueOf(j), java.lang.Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final com.google.android.gms.internal.ads.zzagz zzc(long j) {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        android.util.Pair zzi = zzi(com.google.android.gms.internal.ads.zzfl.zzr(java.lang.Math.max(0L, java.lang.Math.min(j, this.zzc))), this.zzb, this.zza);
        com.google.android.gms.internal.ads.zzahc zzahcVar = new com.google.android.gms.internal.ads.zzahc(com.google.android.gms.internal.ads.zzfl.zzs(((java.lang.Long) zzi.first).longValue()), ((java.lang.Long) zzi.second).longValue());
        return new com.google.android.gms.internal.ads.zzagz(zzahcVar, zzahcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final long zzf(long j) {
        return com.google.android.gms.internal.ads.zzfl.zzs(((java.lang.Long) zzi(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final long zzg() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final int zzh() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ boolean zzj() {
        return com.google.android.gms.internal.ads.zzahb.CC.$default$zzj(this);
    }
}
