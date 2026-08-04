package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzlj extends zzue {
    private final zzbm zzc;

    public zzlj(zzlk zzlkVar, zzbn zzbnVar) {
        super(zzbnVar);
        this.zzc = new zzbm();
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzbn
    public final zzbl zzd(int i7, zzbl zzblVar, boolean z4) {
        zzbl zzblVarZzd = this.zzb.zzd(i7, zzblVar, z4);
        if (this.zzb.zze(zzblVarZzd.zzc, this.zzc, 0L).zzb()) {
            zzblVarZzd.zzi(zzblVar.zza, zzblVar.zzb, zzblVar.zzc, zzblVar.zzd, 0L, zzb.zza, true);
        } else {
            zzblVarZzd.zzf = true;
        }
        return zzblVarZzd;
    }
}
