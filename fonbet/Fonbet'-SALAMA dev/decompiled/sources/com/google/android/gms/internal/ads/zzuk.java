package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzuk extends zzbn {
    private final zzap zzb;

    public zzuk(zzap zzapVar) {
        this.zzb = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zza(Object obj) {
        return obj == zzuj.zzc ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final zzbl zzd(int i7, zzbl zzblVar, boolean z4) {
        zzblVar.zzi(z4 ? 0 : null, z4 ? zzuj.zzc : null, 0, -9223372036854775807L, 0L, zzb.zza, true);
        return zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final zzbm zze(int i7, zzbm zzbmVar, long j) {
        zzbmVar.zza(zzbm.zza, this.zzb, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzbmVar.zzk = true;
        return zzbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final Object zzf(int i7) {
        return zzuj.zzc;
    }
}
