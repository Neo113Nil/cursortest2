package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcya implements zzdfd, zzbfg, zzdir {
    private final zzfld zza;
    private final zzdeh zzb;
    private final zzdfm zzc;
    private final zzdgi zzf;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();
    private final AtomicBoolean zzg = new AtomicBoolean();

    public zzcya(zzfld zzfldVar, zzdeh zzdehVar, zzdfm zzdfmVar, zzdgi zzdgiVar) {
        this.zza = zzfldVar;
        this.zzb = zzdehVar;
        this.zzc = zzdfmVar;
        this.zzf = zzdgiVar;
    }

    private final void zzd() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdH() {
        if (this.zza.zze == 4) {
            zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdI() {
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final synchronized void zzg() {
        int i = this.zza.zze;
        if (i == 1 || i == 4) {
            return;
        }
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzdj(zzbff zzbffVar) {
        int i = this.zza.zze;
        if (i == 1) {
            if (zzbffVar.zzj) {
                zzd();
            }
        } else if (i == 4 && zzbffVar.zzj && this.zzg.compareAndSet(false, true)) {
            this.zzf.zza();
        }
        if (zzbffVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }
}
