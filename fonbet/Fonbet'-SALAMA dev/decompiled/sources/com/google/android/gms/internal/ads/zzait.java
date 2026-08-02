package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes.dex */
final class zzait implements zzadu {
    final /* synthetic */ zzaiv zza;

    public /* synthetic */ zzait(zzaiv zzaivVar, zzaiu zzaiuVar) {
        this.zza = zzaivVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        zzajg zzajgVar;
        long j;
        zzaiv zzaivVar = this.zza;
        zzajgVar = zzaivVar.zzd;
        j = zzaivVar.zzf;
        return zzajgVar.zzf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        zzajg zzajgVar;
        long j3;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        zzaiv zzaivVar = this.zza;
        zzajgVar = zzaivVar.zzd;
        long zzg = zzajgVar.zzg(j);
        j3 = zzaivVar.zzb;
        BigInteger valueOf = BigInteger.valueOf(zzg);
        zzaiv zzaivVar2 = this.zza;
        j7 = zzaivVar2.zzc;
        j8 = zzaivVar2.zzb;
        BigInteger multiply = valueOf.multiply(BigInteger.valueOf(j7 - j8));
        j9 = this.zza.zzf;
        long longValue = multiply.divide(BigInteger.valueOf(j9)).longValue() + j3;
        zzaiv zzaivVar3 = this.zza;
        j10 = zzaivVar3.zzb;
        j11 = zzaivVar3.zzc;
        int i7 = zzen.zza;
        zzadv zzadvVar = new zzadv(j, Math.max(j10, Math.min(longValue - 30000, j11 - 1)));
        return new zzads(zzadvVar, zzadvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }
}
