package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzjl implements zzmf {
    private final zznp zza;
    private final zzjk zzb;
    private zzne zzc;
    private zzmf zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzjl(zzjk zzjkVar, zzdp zzdpVar) {
        this.zzb = zzjkVar;
        this.zza = new zznp(zzdpVar);
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

    public final void zzd(zzne zzneVar) throws zzjn {
        zzmf zzmfVar;
        zzmf zzd = zzneVar.zzd();
        if (zzd == null || zzd == (zzmfVar = this.zzd)) {
            return;
        }
        if (zzmfVar != null) {
            throw zzjn.zzc(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzd;
        this.zzc = zzneVar;
        zzd.zzi(this.zza.zzj());
    }

    public final void zze(zzne zzneVar) {
        if (zzneVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final long zzf(boolean z) {
        zzne zzneVar = this.zzc;
        if (zzneVar == null || zzneVar.zzac() || ((z && this.zzc.zze() != 2) || (!this.zzc.zzab() && (z || this.zzc.zzcW())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zza();
            }
        } else {
            zzmf zzmfVar = this.zzd;
            zzmfVar.getClass();
            long zzg = zzmfVar.zzg();
            if (this.zze) {
                zznp zznpVar = this.zza;
                if (zzg < zznpVar.zzg()) {
                    zznpVar.zzb();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        zznpVar.zza();
                    }
                }
            }
            zznp zznpVar2 = this.zza;
            zznpVar2.zzc(zzg);
            zzav zzj = zzmfVar.zzj();
            if (!zzj.equals(zznpVar2.zzj())) {
                zznpVar2.zzi(zzj);
                this.zzb.zzc(zzj);
            }
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final long zzg() {
        if (this.zze) {
            return this.zza.zzg();
        }
        zzmf zzmfVar = this.zzd;
        zzmfVar.getClass();
        return zzmfVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzi(zzav zzavVar) {
        zzmf zzmfVar = this.zzd;
        if (zzmfVar != null) {
            zzmfVar.zzi(zzavVar);
            zzavVar = this.zzd.zzj();
        }
        this.zza.zzi(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final zzav zzj() {
        zzmf zzmfVar = this.zzd;
        return zzmfVar != null ? zzmfVar.zzj() : this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final boolean zzh() {
        if (this.zze) {
            return false;
        }
        zzmf zzmfVar = this.zzd;
        zzmfVar.getClass();
        return zzmfVar.zzh();
    }
}
