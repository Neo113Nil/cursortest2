package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzafm extends zzadh {
    private final long zza;

    public zzafm(zzacw zzacwVar, long j) {
        super(zzacwVar);
        zzcv.zzd(zzacwVar.zzf() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadh, com.google.android.gms.internal.ads.zzacw
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadh, com.google.android.gms.internal.ads.zzacw
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadh, com.google.android.gms.internal.ads.zzacw
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
