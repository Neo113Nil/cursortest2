package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzwc implements zzyq {
    public long zza;
    public long zzb;
    public zzyp zzc;
    public zzwc zzd;

    public zzwc(long j, int i7) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j3 = j - this.zza;
        int i7 = this.zzc.zzb;
        return (int) j3;
    }

    public final zzwc zzb() {
        this.zzc = null;
        zzwc zzwcVar = this.zzd;
        this.zzd = null;
        return zzwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyq
    public final zzyp zzc() {
        zzyp zzypVar = this.zzc;
        zzypVar.getClass();
        return zzypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyq
    public final zzyq zzd() {
        zzwc zzwcVar = this.zzd;
        if (zzwcVar == null || zzwcVar.zzc == null) {
            return null;
        }
        return zzwcVar;
    }

    public final void zze(long j, int i7) {
        zzcv.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + 65536;
    }
}
