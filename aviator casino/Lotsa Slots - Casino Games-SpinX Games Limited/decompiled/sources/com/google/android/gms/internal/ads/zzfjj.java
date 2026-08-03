package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfjj implements com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener, com.google.android.gms.internal.ads.zzdef, com.google.android.gms.internal.ads.zzdcu, com.google.android.gms.internal.ads.zzdcr, com.google.android.gms.internal.ads.zzddh, com.google.android.gms.internal.ads.zzdfi, com.google.android.gms.internal.ads.zzfht, com.google.android.gms.internal.ads.zzdky {
    private final com.google.android.gms.internal.ads.zzfmj zza;
    private final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zze = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzf = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzg = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzh = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzi = new java.util.concurrent.atomic.AtomicReference();
    private com.google.android.gms.internal.ads.zzfjj zzj = null;

    public zzfjj(com.google.android.gms.internal.ads.zzfmj zzfmjVar) {
        this.zza = zzfmjVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        com.google.android.gms.internal.ads.zzfjj zzfjjVar = this.zzj;
        if (zzfjjVar != null) {
            zzfjjVar.onAdMetadataChanged();
        } else {
            com.google.android.gms.internal.ads.zzfhl.zza(this.zzb, com.google.android.gms.internal.ads.zzfji.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzdR() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzds() {
        com.google.android.gms.internal.ads.zzfjj zzfjjVar = this.zzj;
        if (zzfjjVar != null) {
            zzfjjVar.zzds();
            return;
        }
        this.zza.zzb();
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzd, com.google.android.gms.internal.ads.zzfix.zza);
        com.google.android.gms.internal.ads.zzfhl.zza(this.zze, com.google.android.gms.internal.ads.zzfjc.zza);
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzi, com.google.android.gms.internal.ads.zzfjh.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzdu() {
        com.google.android.gms.internal.ads.zzfjj zzfjjVar = this.zzj;
        if (zzfjjVar != null) {
            zzfjjVar.zzdu();
        } else {
            com.google.android.gms.internal.ads.zzfhl.zza(this.zzd, com.google.android.gms.internal.ads.zzfiy.zza);
        }
    }

    public final void zzh(com.google.android.gms.internal.ads.zzccp zzccpVar) {
        this.zzc.set(zzccpVar);
    }

    public final void zzi(com.google.android.gms.internal.ads.zzccl zzcclVar) {
        this.zzd.set(zzcclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzfjj zzfjjVar = this.zzj;
        if (zzfjjVar != null) {
            zzfjjVar.zzj(zzeVar);
            return;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzd;
        com.google.android.gms.internal.ads.zzfhl.zza(atomicReference, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzfis
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzccl) obj).zzi(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        com.google.android.gms.internal.ads.zzfhl.zza(atomicReference, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzfit
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzccl) obj).zzh(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
    }

    public final void zzk(com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzh.set(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdfi
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        com.google.android.gms.internal.ads.zzfjj zzfjjVar = this.zzj;
        if (zzfjjVar != null) {
            zzfjjVar.zzm(zztVar);
        } else {
            com.google.android.gms.internal.ads.zzfhl.zza(this.zzh, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzfiu
                @Override // com.google.android.gms.internal.ads.zzfhk
                public final /* synthetic */ void zza(java.lang.Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(com.google.android.gms.ads.internal.client.zzt.this);
                }
            });
        }
    }

    @java.lang.Deprecated
    public final void zzn(com.google.android.gms.internal.ads.zzcbv zzcbvVar) {
        this.zze.set(zzcbvVar);
    }

    public final void zzo(com.google.android.gms.internal.ads.zzfsy zzfsyVar) {
        this.zzi.set(zzfsyVar);
    }

    public final void zzp(com.google.android.gms.internal.ads.zzccq zzccqVar) {
        this.zzf.set(zzccqVar);
    }

    @java.lang.Deprecated
    public final void zzq(com.google.android.gms.internal.ads.zzcbq zzcbqVar) {
        this.zzg.set(zzcbqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfht
    public final void zzv(com.google.android.gms.internal.ads.zzfht zzfhtVar) {
        this.zzj = (com.google.android.gms.internal.ads.zzfjj) zzfhtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzdK() {
        com.google.android.gms.internal.ads.zzfjj zzfjjVar = this.zzj;
        if (zzfjjVar != null) {
            zzfjjVar.zzdK();
        } else {
            com.google.android.gms.internal.ads.zzfhl.zza(this.zze, com.google.android.gms.internal.ads.zzfjd.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zze() {
        com.google.android.gms.internal.ads.zzfjj zzfjjVar = this.zzj;
        if (zzfjjVar != null) {
            zzfjjVar.zze();
        } else {
            com.google.android.gms.internal.ads.zzfhl.zza(this.zze, com.google.android.gms.internal.ads.zzfje.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzf() {
        com.google.android.gms.internal.ads.zzfjj zzfjjVar = this.zzj;
        if (zzfjjVar != null) {
            zzfjjVar.zzf();
        } else {
            com.google.android.gms.internal.ads.zzfhl.zza(this.zze, com.google.android.gms.internal.ads.zzfjf.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzg() {
        com.google.android.gms.internal.ads.zzfjj zzfjjVar = this.zzj;
        if (zzfjjVar != null) {
            zzfjjVar.zzg();
        } else {
            com.google.android.gms.internal.ads.zzfhl.zza(this.zzc, com.google.android.gms.internal.ads.zzfja.zza);
            com.google.android.gms.internal.ads.zzfhl.zza(this.zze, com.google.android.gms.internal.ads.zzfjg.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzdt() {
        com.google.android.gms.internal.ads.zzfjj zzfjjVar = this.zzj;
        if (zzfjjVar != null) {
            zzfjjVar.zzdt();
            return;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzd;
        com.google.android.gms.internal.ads.zzfhl.zza(atomicReference, com.google.android.gms.internal.ads.zzfiz.zza);
        com.google.android.gms.internal.ads.zzfhl.zza(this.zze, com.google.android.gms.internal.ads.zzfjb.zza);
        com.google.android.gms.internal.ads.zzfhl.zza(atomicReference, com.google.android.gms.internal.ads.zzfiw.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzd(final com.google.android.gms.internal.ads.zzcbp zzcbpVar, final java.lang.String str, final java.lang.String str2) {
        com.google.android.gms.internal.ads.zzfjj zzfjjVar = this.zzj;
        if (zzfjjVar != null) {
            zzfjjVar.zzd(zzcbpVar, str, str2);
            return;
        }
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzd, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzfio
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzcbp zzcbpVar2 = com.google.android.gms.internal.ads.zzcbp.this;
                ((com.google.android.gms.internal.ads.zzccl) obj).zzg(new com.google.android.gms.internal.ads.zzccz(zzcbpVar2.zzb(), zzcbpVar2.zzc()));
            }
        });
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzf, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzfip
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzcbp zzcbpVar2 = com.google.android.gms.internal.ads.zzcbp.this;
                ((com.google.android.gms.internal.ads.zzccq) obj).zze(new com.google.android.gms.internal.ads.zzccz(zzcbpVar2.zzb(), zzcbpVar2.zzc()), str, str2);
            }
        });
        com.google.android.gms.internal.ads.zzfhl.zza(this.zze, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzfiq
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzcbv) obj).zzi(com.google.android.gms.internal.ads.zzcbp.this);
            }
        });
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzg, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzfir
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzcbq) obj).zze(com.google.android.gms.internal.ads.zzcbp.this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzdJ(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzfjj zzfjjVar = this.zzj;
        if (zzfjjVar != null) {
            zzfjjVar.zzdJ(zzeVar);
            return;
        }
        final int i = zzeVar.zza;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzc;
        com.google.android.gms.internal.ads.zzfhl.zza(atomicReference, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzfiv
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzccp) obj).zzg(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        com.google.android.gms.internal.ads.zzfhl.zza(atomicReference, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzfim
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzccp) obj).zzf(i);
            }
        });
        com.google.android.gms.internal.ads.zzfhl.zza(this.zze, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzfin
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzcbv) obj).zzk(i);
            }
        });
    }
}
