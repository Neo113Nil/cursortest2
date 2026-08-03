package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzetc implements com.google.android.gms.ads.admanager.AppEventListener, com.google.android.gms.internal.ads.zzdfx, com.google.android.gms.internal.ads.zzdef, com.google.android.gms.internal.ads.zzdcu, com.google.android.gms.internal.ads.zzddl, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzdcr, com.google.android.gms.internal.ads.zzdfi, com.google.android.gms.internal.ads.zzddh, com.google.android.gms.internal.ads.zzdky {
    final com.google.android.gms.internal.ads.zzdzl zza;
    private final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zze = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzf = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzg = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicBoolean zzh = new java.util.concurrent.atomic.AtomicBoolean(true);
    private final java.util.concurrent.atomic.AtomicBoolean zzi = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean zzj = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicReference zzk = new java.util.concurrent.atomic.AtomicReference();
    final java.util.concurrent.BlockingQueue zzb = new java.util.concurrent.ArrayBlockingQueue(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkl)).intValue());

    public zzetc(com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = zzdzlVar;
    }

    private final void zzs() {
        if (this.zzi.get() && this.zzj.get()) {
            java.util.concurrent.BlockingQueue<android.util.Pair> blockingQueue = this.zzb;
            for (final android.util.Pair pair : blockingQueue) {
                com.google.android.gms.internal.ads.zzfhl.zza(this.zzd, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzesm
                    @Override // com.google.android.gms.internal.ads.zzfhk
                    public final /* synthetic */ void zza(java.lang.Object obj) {
                        android.util.Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzcl) obj).zzb((java.lang.String) pair2.first, (java.lang.String) pair2.second);
                    }
                });
            }
            blockingQueue.clear();
            this.zzh.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmh)).booleanValue()) {
            return;
        }
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzc, com.google.android.gms.internal.ads.zzesr.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final java.lang.String str, final java.lang.String str2) {
        if (!this.zzh.get()) {
            com.google.android.gms.internal.ads.zzfhl.zza(this.zzd, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzesk
                @Override // com.google.android.gms.internal.ads.zzfhk
                public final /* synthetic */ void zza(java.lang.Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzcl) obj).zzb(str, str2);
                }
            });
            return;
        }
        if (!this.zzb.offer(new android.util.Pair(str, str2))) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("The queue for app events is full, dropping the new event.");
            com.google.android.gms.internal.ads.zzdzl zzdzlVar = this.zza;
            if (zzdzlVar != null) {
                com.google.android.gms.internal.ads.zzdzk zza = zzdzlVar.zza();
                zza.zzc("action", "dae_action");
                zza.zzc("dae_name", str);
                zza.zzc("dae_data", str2);
                zza.zzd();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzd(com.google.android.gms.internal.ads.zzcbp zzcbpVar, java.lang.String str, java.lang.String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzdJ(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzfhk zzfhkVar = new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzesn
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
            }
        };
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzc;
        com.google.android.gms.internal.ads.zzfhl.zza(atomicReference, zzfhkVar);
        com.google.android.gms.internal.ads.zzfhl.zza(atomicReference, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzesh
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzc(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzf, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzesi
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzc(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzdK() {
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzc, com.google.android.gms.internal.ads.zzeso.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdP(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdQ(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzdR() {
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzc, com.google.android.gms.internal.ads.zzess.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddl
    public final void zzdr() {
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzc, com.google.android.gms.internal.ads.zzesu.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzds() {
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzc, com.google.android.gms.internal.ads.zzesv.zza);
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzg, com.google.android.gms.internal.ads.zzeta.zza);
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzk, com.google.android.gms.internal.ads.zzetb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzdt() {
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzc, com.google.android.gms.internal.ads.zzesq.zza);
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzg;
        com.google.android.gms.internal.ads.zzfhl.zza(atomicReference, com.google.android.gms.internal.ads.zzesx.zza);
        com.google.android.gms.internal.ads.zzfhl.zza(atomicReference, com.google.android.gms.internal.ads.zzesy.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzdu() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmh)).booleanValue()) {
            com.google.android.gms.internal.ads.zzfhl.zza(this.zzc, com.google.android.gms.internal.ads.zzest.zza);
        }
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzg, com.google.android.gms.internal.ads.zzesz.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final synchronized void zzg() {
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzc, com.google.android.gms.internal.ads.zzesp.zza);
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzf, com.google.android.gms.internal.ads.zzesw.zza);
        this.zzj.set(true);
        zzs();
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbh zzi() {
        return (com.google.android.gms.ads.internal.client.zzbh) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzfhl.zza(this.zzg, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzesl
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).zzb(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzcl zzk() {
        return (com.google.android.gms.ads.internal.client.zzcl) this.zzd.get();
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzc.set(zzbhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdfi
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        com.google.android.gms.internal.ads.zzfhl.zza(this.zze, new com.google.android.gms.internal.ads.zzfhk() { // from class: com.google.android.gms.internal.ads.zzesj
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(com.google.android.gms.ads.internal.client.zzt.this);
            }
        });
    }

    public final void zzn(com.google.android.gms.internal.ads.zzfsy zzfsyVar) {
        this.zzk.set(zzfsyVar);
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzd.set(zzclVar);
        this.zzi.set(true);
        zzs();
    }

    public final void zzp(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zze.set(zzdqVar);
    }

    public final void zzq(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzf.set(zzbkVar);
    }

    public final void zzr(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzg.set(zzcsVar);
    }
}
