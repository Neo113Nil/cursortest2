package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzaiw implements zzajb {
    private final zzadg zza;
    private final zzadf zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzaiw(zzadg zzadgVar, zzadf zzadfVar) {
        this.zza = zzadgVar;
        this.zzb = zzadfVar;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final long zzd(zzacw zzacwVar) {
        long j = this.zzd;
        if (j < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final zzadu zze() {
        zzcv.zzf(this.zzc != -1);
        return new zzade(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzen.zzd(jArr, j, true, true)];
    }
}
