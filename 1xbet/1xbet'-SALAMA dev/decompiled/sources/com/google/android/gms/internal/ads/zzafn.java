package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
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
        zzads zzadsVarZzg = this.zza.zzg(j);
        zzadv zzadvVar = zzadsVarZzg.zza;
        zzadv zzadvVar2 = new zzadv(zzadvVar.zzb, this.zzb.zzb + zzadvVar.zzc);
        zzadv zzadvVar3 = zzadsVarZzg.zzb;
        return new zzads(zzadvVar2, new zzadv(zzadvVar3.zzb, this.zzb.zzb + zzadvVar3.zzc));
    }
}
