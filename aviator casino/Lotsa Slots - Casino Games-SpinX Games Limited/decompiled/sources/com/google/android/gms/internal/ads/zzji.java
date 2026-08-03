package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzji implements com.google.android.gms.internal.ads.zzmb {
    private final com.google.android.gms.internal.ads.zznl zza;
    private final com.google.android.gms.internal.ads.zzjh zzb;
    private com.google.android.gms.internal.ads.zzna zzc;
    private com.google.android.gms.internal.ads.zzmb zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzji(com.google.android.gms.internal.ads.zzjh zzjhVar, com.google.android.gms.internal.ads.zzdo zzdoVar) {
        this.zzb = zzjhVar;
        this.zza = new com.google.android.gms.internal.ads.zznl(zzdoVar);
    }

    public final void zza() {
        this.zzf = true;
        this.zza.zza();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zzb();
    }

    public final void zzc(long j) {
        this.zza.zzc(j);
    }

    public final void zzd(com.google.android.gms.internal.ads.zzna zznaVar) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzmb zzmbVar;
        com.google.android.gms.internal.ads.zzmb zzd = zznaVar.zzd();
        if (zzd == null || zzd == (zzmbVar = this.zzd)) {
            return;
        }
        if (zzmbVar != null) {
            throw com.google.android.gms.internal.ads.zzjk.zzc(new java.lang.IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzd;
        this.zzc = zznaVar;
        zzd.zzi(this.zza.zzj());
    }

    public final void zze(com.google.android.gms.internal.ads.zzna zznaVar) {
        if (zznaVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final long zzf(boolean z) {
        com.google.android.gms.internal.ads.zzna zznaVar = this.zzc;
        if (zznaVar == null || zznaVar.zzab() || ((z && this.zzc.zze() != 2) || (!this.zzc.zzaa() && (z || this.zzc.zzcW())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zza();
            }
        } else {
            com.google.android.gms.internal.ads.zzmb zzmbVar = this.zzd;
            zzmbVar.getClass();
            long zzg = zzmbVar.zzg();
            if (this.zze) {
                com.google.android.gms.internal.ads.zznl zznlVar = this.zza;
                if (zzg < zznlVar.zzg()) {
                    zznlVar.zzb();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        zznlVar.zza();
                    }
                }
            }
            com.google.android.gms.internal.ads.zznl zznlVar2 = this.zza;
            zznlVar2.zzc(zzg);
            com.google.android.gms.internal.ads.zzav zzj = zzmbVar.zzj();
            if (!zzj.equals(zznlVar2.zzj())) {
                zznlVar2.zzi(zzj);
                this.zzb.zzc(zzj);
            }
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final long zzg() {
        if (this.zze) {
            return this.zza.zzg();
        }
        com.google.android.gms.internal.ads.zzmb zzmbVar = this.zzd;
        zzmbVar.getClass();
        return zzmbVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzi(com.google.android.gms.internal.ads.zzav zzavVar) {
        com.google.android.gms.internal.ads.zzmb zzmbVar = this.zzd;
        if (zzmbVar != null) {
            zzmbVar.zzi(zzavVar);
            zzavVar = this.zzd.zzj();
        }
        this.zza.zzi(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final com.google.android.gms.internal.ads.zzav zzj() {
        com.google.android.gms.internal.ads.zzmb zzmbVar = this.zzd;
        return zzmbVar != null ? zzmbVar.zzj() : this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final boolean zzh() {
        if (this.zze) {
            return false;
        }
        com.google.android.gms.internal.ads.zzmb zzmbVar = this.zzd;
        zzmbVar.getClass();
        return zzmbVar.zzh();
    }
}
