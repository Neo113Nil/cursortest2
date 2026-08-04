package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
final class zzait implements zzadu {
    final /* synthetic */ zzaiv zza;

    public /* synthetic */ zzait(zzaiv zzaivVar, zzaiu zzaiuVar) {
        this.zza = zzaivVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        zzaiv zzaivVar = this.zza;
        return zzaivVar.zzd.zzf(zzaivVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        zzaiv zzaivVar = this.zza;
        long jZzg = zzaivVar.zzd.zzg(j);
        long j3 = zzaivVar.zzb;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(jZzg);
        zzaiv zzaivVar2 = this.zza;
        long jLongValue = bigIntegerValueOf.multiply(BigInteger.valueOf(zzaivVar2.zzc - zzaivVar2.zzb)).divide(BigInteger.valueOf(this.zza.zzf)).longValue() + j3;
        zzaiv zzaivVar3 = this.zza;
        long j7 = zzaivVar3.zzb;
        long j8 = zzaivVar3.zzc - 1;
        int i7 = zzen.zza;
        zzadv zzadvVar = new zzadv(j, Math.max(j7, Math.min(jLongValue - 30000, j8)));
        return new zzads(zzadvVar, zzadvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }
}
