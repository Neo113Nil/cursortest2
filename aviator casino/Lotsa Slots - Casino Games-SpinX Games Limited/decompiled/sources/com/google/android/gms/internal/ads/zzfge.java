package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfge implements com.google.android.gms.internal.ads.zzdcu, com.google.android.gms.internal.ads.zzdeq, com.google.android.gms.internal.ads.zzfht, com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzdfi, com.google.android.gms.internal.ads.zzddh, com.google.android.gms.internal.ads.zzdky {
    private final com.google.android.gms.internal.ads.zzfmj zza;
    private final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zze = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzf = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzg = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzh = new java.util.concurrent.atomic.AtomicReference();
    private com.google.android.gms.internal.ads.zzfge zzi = null;

    public zzfge(com.google.android.gms.internal.ads.zzfmj zzfmjVar) {
        this.zza = zzfmjVar;
    }

    public static com.google.android.gms.internal.ads.zzfge zzn(com.google.android.gms.internal.ads.zzfge zzfgeVar) {
        com.google.android.gms.internal.ads.zzfge zzfgeVar2 = new com.google.android.gms.internal.ads.zzfge(zzfgeVar.zza);
        zzfgeVar2.zzi = zzfgeVar;
        return zzfgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzdR() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
        com.google.android.gms.internal.ads.zzfge zzfgeVar = this.zzi;
        if (zzfgeVar != null) {
            zzfgeVar.zzdT();
        } else {
            com.google.android.gms.internal.ads.zzfhl.zza(this.zzf, com.google.android.gms.internal.ads.zzffp.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(final int i) {
        com.google.android.gms.internal.ads.zzfge zzfgeVar = this.zzi;
        if (zzfgeVar != null) {
            zzfgeVar.zzdU(i);
        } else {
            com.google.android.gms.internal.ads.zzfhl.zza(this.zzf, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzffv
                @Override // com.google.android.gms.internal.ads.zzfhk
                public final /* synthetic */ void zza(java.lang.Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdU(i);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzdu() {
        com.google.android.gms.internal.ads.zzfge zzfgeVar = this.zzi;
        if (zzfgeVar != null) {
            zzfgeVar.zzdu();
        } else {
            com.google.android.gms.internal.ads.zzfhl.zza(this.zzd, com.google.android.gms.internal.ads.zzfgb.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        com.google.android.gms.internal.ads.zzfge zzfgeVar = this.zzi;
        if (zzfgeVar != null) {
            zzfgeVar.zzdv();
        } else {
            com.google.android.gms.internal.ads.zzfhl.zza(this.zzf, com.google.android.gms.internal.ads.zzffq.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        com.google.android.gms.internal.ads.zzfge zzfgeVar = this.zzi;
        if (zzfgeVar != null) {
            zzfgeVar.zzh();
            return;
        }
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzf, com.google.android.gms.internal.ads.zzffr.zza);
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzd;
        com.google.android.gms.internal.ads.zzfhl.zza(atomicReference, com.google.android.gms.internal.ads.zzffz.zza);
        com.google.android.gms.internal.ads.zzfhl.zza(atomicReference, com.google.android.gms.internal.ads.zzfga.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzfge zzfgeVar = this.zzi;
        if (zzfgeVar != null) {
            zzfgeVar.zzj(zzeVar);
        } else {
            com.google.android.gms.internal.ads.zzfhl.zza(this.zzd, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzffw
                @Override // com.google.android.gms.internal.ads.zzfhk
                public final /* synthetic */ void zza(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.zzbgq) obj).zze(com.google.android.gms.ads.internal.client.zze.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzl() {
        com.google.android.gms.internal.ads.zzfge zzfgeVar = this.zzi;
        if (zzfgeVar != null) {
            zzfgeVar.zzl();
        } else {
            com.google.android.gms.internal.ads.zzfhl.zza(this.zze, com.google.android.gms.internal.ads.zzffo.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfi
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        com.google.android.gms.internal.ads.zzfge zzfgeVar = this.zzi;
        if (zzfgeVar != null) {
            zzfgeVar.zzm(zztVar);
        } else {
            com.google.android.gms.internal.ads.zzfhl.zza(this.zzg, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzffx
                @Override // com.google.android.gms.internal.ads.zzfhk
                public final /* synthetic */ void zza(java.lang.Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(com.google.android.gms.ads.internal.client.zzt.this);
                }
            });
        }
    }

    public final void zzo(com.google.android.gms.internal.ads.zzbgm zzbgmVar) {
        this.zzb.set(zzbgmVar);
    }

    public final void zzp(com.google.android.gms.internal.ads.zzbgq zzbgqVar) {
        this.zzd.set(zzbgqVar);
    }

    public final void zzq(com.google.android.gms.ads.internal.overlay.zzr zzrVar) {
        this.zzf.set(zzrVar);
    }

    public final void zzr(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzg.set(zzdqVar);
    }

    public final void zzs(com.google.android.gms.internal.ads.zzfsy zzfsyVar) {
        this.zzh.set(zzfsyVar);
    }

    public final void zzu() {
        com.google.android.gms.internal.ads.zzfge zzfgeVar = this.zzi;
        if (zzfgeVar != null) {
            zzfgeVar.zzu();
            return;
        }
        this.zza.zzb();
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzc, com.google.android.gms.internal.ads.zzffy.zza);
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzd, com.google.android.gms.internal.ads.zzfgc.zza);
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzh, com.google.android.gms.internal.ads.zzfgd.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfht
    public final void zzv(com.google.android.gms.internal.ads.zzfht zzfhtVar) {
        this.zzi = (com.google.android.gms.internal.ads.zzfge) zzfhtVar;
    }

    public final void zzt(final com.google.android.gms.internal.ads.zzbgj zzbgjVar) {
        com.google.android.gms.internal.ads.zzfge zzfgeVar = this.zzi;
        if (zzfgeVar != null) {
            zzfgeVar.zzt(zzbgjVar);
        } else {
            com.google.android.gms.internal.ads.zzfhl.zza(this.zzb, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzffs
                @Override // com.google.android.gms.internal.ads.zzfhk
                public final /* synthetic */ void zza(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.zzbgm) obj).zzb(com.google.android.gms.internal.ads.zzbgj.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzdJ(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzfge zzfgeVar = this.zzi;
        if (zzfgeVar != null) {
            zzfgeVar.zzdJ(zzeVar);
            return;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzb;
        com.google.android.gms.internal.ads.zzfhl.zza(atomicReference, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzfft
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzbgm) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        com.google.android.gms.internal.ads.zzfhl.zza(atomicReference, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzffu
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzbgm) obj).zzc(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
    }
}
