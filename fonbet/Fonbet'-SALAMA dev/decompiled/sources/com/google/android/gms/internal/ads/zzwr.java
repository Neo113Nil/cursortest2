package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzwr implements zzwk {
    private final zzwk zza;
    private final long zzb;

    public zzwr(zzwk zzwkVar, long j) {
        this.zza = zzwkVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final int zza(zzkh zzkhVar, zzhg zzhgVar, int i7) {
        int zza = this.zza.zza(zzkhVar, zzhgVar, i7);
        if (zza != -4) {
            return zza;
        }
        zzhgVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zzwk zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final void zzd() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final boolean zze() {
        return this.zza.zze();
    }
}
