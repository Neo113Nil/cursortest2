package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzaiy implements zzacv {
    private zzacy zza;
    private zzajg zzb;
    private boolean zzc;

    private final boolean zza(zzacw zzacwVar) {
        zzaja zzajaVar = new zzaja();
        if (zzajaVar.zzb(zzacwVar, true) && (zzajaVar.zza & 2) == 2) {
            int min = Math.min(zzajaVar.zze, 8);
            zzed zzedVar = new zzed(min);
            zzacwVar.zzh(zzedVar.zzN(), 0, min);
            zzedVar.zzL(0);
            if (zzedVar.zzb() >= 5 && zzedVar.zzm() == 127 && zzedVar.zzu() == 1179402563) {
                this.zzb = new zzaix();
            } else {
                zzedVar.zzL(0);
                try {
                    if (zzaeh.zzd(1, zzedVar, true)) {
                        this.zzb = new zzaji();
                    }
                } catch (zzaz unused) {
                }
                zzedVar.zzL(0);
                if (zzajc.zzd(zzedVar)) {
                    this.zzb = new zzajc();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        zzcv.zzb(this.zza);
        if (this.zzb == null) {
            if (!zza(zzacwVar)) {
                throw zzaz.zza("Failed to determine bitstream type", null);
            }
            zzacwVar.zzj();
        }
        if (!this.zzc) {
            zzaeb zzw = this.zza.zzw(0, 1);
            this.zza.zzG();
            this.zzb.zzh(this.zza, zzw);
            this.zzc = true;
        }
        return this.zzb.zze(zzacwVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ zzacv zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ List zzd() {
        return zzfwh.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zze(zzacy zzacyVar) {
        this.zza = zzacyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        zzajg zzajgVar = this.zzb;
        if (zzajgVar != null) {
            zzajgVar.zzj(j, j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) {
        try {
            return zza(zzacwVar);
        } catch (zzaz unused) {
            return false;
        }
    }
}
