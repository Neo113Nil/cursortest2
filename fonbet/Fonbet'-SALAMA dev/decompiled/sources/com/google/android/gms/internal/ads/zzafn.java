package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzafn extends zzadi {
    final /* synthetic */ zzadu zza;
    final /* synthetic */ zzafo zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzafn(zzafo zzafoVar, zzadu zzaduVar, zzadu zzaduVar2) {
        super(zzaduVar);
        this.zza = zzaduVar2;
        this.zzb = zzafoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadi, com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        long j3;
        long j7;
        zzads zzg = this.zza.zzg(j);
        zzadv zzadvVar = zzg.zza;
        long j8 = zzadvVar.zzc;
        j3 = this.zzb.zzb;
        zzadv zzadvVar2 = new zzadv(zzadvVar.zzb, j3 + j8);
        zzadv zzadvVar3 = zzg.zzb;
        long j9 = zzadvVar3.zzc;
        j7 = this.zzb.zzb;
        return new zzads(zzadvVar2, new zzadv(zzadvVar3.zzb, j7 + j9));
    }
}
