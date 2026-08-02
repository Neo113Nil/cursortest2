package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbd;

/* loaded from: classes.dex */
final class zzhy implements zzkn {
    private final zzlv zza;
    private final zzhx zzb;
    private zzlm zzc;
    private zzkn zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzhy(zzhx zzhxVar, zzcz zzczVar) {
        this.zzb = zzhxVar;
        this.zza = new zzlv(zzczVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final long zza() {
        if (this.zze) {
            return this.zza.zza();
        }
        zzkn zzknVar = this.zzd;
        zzknVar.getClass();
        return zzknVar.zza();
    }

    public final long zzb(boolean z4) {
        zzlm zzlmVar = this.zzc;
        if (zzlmVar == null || zzlmVar.zzW() || ((z4 && this.zzc.zzcT() != 2) || (!this.zzc.zzX() && (z4 || this.zzc.zzQ())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzkn zzknVar = this.zzd;
            zzknVar.getClass();
            long zza = zzknVar.zza();
            if (this.zze) {
                if (zza < this.zza.zza()) {
                    this.zza.zze();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zzd();
                    }
                }
            }
            this.zza.zzb(zza);
            zzbb zzc = zzknVar.zzc();
            if (!zzc.equals(this.zza.zzc())) {
                this.zza.zzg(zzc);
                this.zzb.zza(zzc);
            }
        }
        return zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final zzbb zzc() {
        zzkn zzknVar = this.zzd;
        return zzknVar != null ? zzknVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzlm zzlmVar) {
        if (zzlmVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzlm zzlmVar) {
        zzkn zzknVar;
        zzkn zzl = zzlmVar.zzl();
        if (zzl == null || zzl == (zzknVar = this.zzd)) {
            return;
        }
        if (zzknVar != null) {
            throw zzia.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), zzbbd.zzq.zzf);
        }
        this.zzd = zzl;
        this.zzc = zzlmVar;
        zzl.zzg(this.zza.zzc());
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zzg(zzbb zzbbVar) {
        zzkn zzknVar = this.zzd;
        if (zzknVar != null) {
            zzknVar.zzg(zzbbVar);
            zzbbVar = this.zzd.zzc();
        }
        this.zza.zzg(zzbbVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final boolean zzj() {
        if (this.zze) {
            return false;
        }
        zzkn zzknVar = this.zzd;
        zzknVar.getClass();
        return zzknVar.zzj();
    }
}
