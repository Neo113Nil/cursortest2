package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzfub {
    protected final com.google.android.gms.ads.internal.ClientApi zza;
    protected final android.content.Context zzb;
    protected final int zzc;
    protected final com.google.android.gms.internal.ads.zzflu zzd;
    protected java.util.concurrent.atomic.AtomicReference zze;
    protected final com.google.android.gms.internal.ads.zzfsn zzf;
    protected java.util.concurrent.atomic.AtomicBoolean zzg;
    protected com.google.android.gms.ads.internal.client.zzce zzh;
    protected final java.util.concurrent.ScheduledExecutorService zzi;
    private com.google.android.gms.ads.internal.client.zzcb zzj;
    private final java.util.Queue zzk;
    private final com.google.android.gms.internal.ads.zzfsw zzl;
    private final java.lang.String zzm;
    private java.util.concurrent.atomic.AtomicBoolean zzn;
    private final com.google.android.gms.internal.ads.zzfoo zzo;
    private java.util.concurrent.atomic.AtomicBoolean zzp;
    private java.util.concurrent.atomic.AtomicBoolean zzq;
    private com.google.android.gms.internal.ads.zzftd zzr;
    private final com.google.android.gms.common.util.Clock zzs;
    private final com.google.android.gms.internal.ads.zzftk zzt;

    public zzfub(com.google.android.gms.ads.internal.ClientApi clientApi, android.content.Context context, int i, com.google.android.gms.internal.ads.zzflu zzfluVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzfoo zzfooVar, com.google.android.gms.internal.ads.zzfsw zzfswVar, com.google.android.gms.common.util.Clock clock) {
        this("none", clientApi, context, i, zzfluVar, zzfpVar, scheduledExecutorService, zzfooVar, zzfswVar, clock, null);
        this.zzj = zzcbVar;
    }

    private final boolean zzR() {
        boolean isEmpty;
        java.util.Queue queue = this.zzk;
        synchronized (queue) {
            isEmpty = queue.isEmpty();
        }
        return isEmpty;
    }

    private final void zzS(boolean z) {
        com.google.android.gms.internal.ads.zzfsn zzfsnVar = this.zzf;
        if (zzfsnVar != null) {
            if (z) {
                this.zzl.zzc();
            }
            zzfsnVar.zza(this);
        } else {
            com.google.android.gms.internal.ads.zzfsw zzfswVar = this.zzl;
            if (zzfswVar.zze()) {
                return;
            }
            if (z) {
                zzfswVar.zzc();
            }
            this.zzi.schedule(new com.google.android.gms.internal.ads.zzftp(this), zzfswVar.zzb(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzT, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzF() {
        int i;
        int i2;
        java.util.Queue queue = this.zzk;
        synchronized (queue) {
            java.util.Iterator it = queue.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((com.google.android.gms.internal.ads.zzftm) it.next()).zzb()) {
                    it.remove();
                    i++;
                }
            }
            i2 = (i <= 0 || !queue.isEmpty()) ? i : i - 1;
        }
        com.google.android.gms.internal.ads.zzfsn zzfsnVar = this.zzf;
        if (zzfsnVar == null || i <= 0) {
            return;
        }
        zzfsnVar.zzd(this, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzU, reason: merged with bridge method [inline-methods] */
    public final java.lang.String zzM() {
        return true != "none".equals(this.zzm) ? "2" : "1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String zzV(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        if (zzdxVar instanceof com.google.android.gms.internal.ads.zzdck) {
            return ((com.google.android.gms.internal.ads.zzdck) zzdxVar).zzk();
        }
        return null;
    }

    protected final void zzA(final int i) {
        int size;
        com.google.android.gms.internal.ads.zzfsn zzfsnVar;
        boolean z = true;
        int i2 = 0;
        com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0);
        com.google.android.gms.ads.internal.client.zzfp zzfpVar = (com.google.android.gms.ads.internal.client.zzfp) this.zze.getAndUpdate(new java.util.function.UnaryOperator() { // from class: com.google.android.gms.internal.ads.zzftw
            @Override // java.util.function.Function
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return ((com.google.android.gms.ads.internal.client.zzfp) obj).zza(i);
            }
        });
        com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.getAdFormat(zzfpVar.zzb);
        int i3 = zzfpVar.zzd;
        java.util.Queue queue = this.zzk;
        synchronized (queue) {
            size = queue.size();
            if (queue.size() > i) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzx)).booleanValue()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (i2 < i) {
                        com.google.android.gms.internal.ads.zzftm zzftmVar = (com.google.android.gms.internal.ads.zzftm) queue.poll();
                        if (zzftmVar != null) {
                            arrayList.add(zzftmVar);
                        }
                        i2++;
                    }
                    queue.clear();
                    queue.addAll(arrayList);
                    i2 = arrayList.size();
                }
            }
            z = false;
        }
        if (z && size > i2 && (zzfsnVar = this.zzf) != null) {
            int i4 = size - i2;
            if (i2 == 0) {
                i4--;
            }
            zzfsnVar.zzd(this, i4);
        }
        com.google.android.gms.internal.ads.zzftd zzftdVar = this.zzr;
        if (zzftdVar == null || adFormat == null) {
            return;
        }
        zzftdVar.zzc(i3, i, this.zzs.currentTimeMillis(), new com.google.android.gms.internal.ads.zzftk(new com.google.android.gms.internal.ads.zzftj(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza, adFormat), null));
    }

    protected final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzC)).booleanValue()) {
            android.os.Bundle bundle = zzmVar.zzB;
            bundle.putInt("plcs", zzt());
            bundle.putInt("plbs", zzs());
            bundle.putString("plid", this.zzm);
        }
    }

    final long zzC() {
        long zzb = zzb();
        if (zzb >= 0) {
            return zzb;
        }
        return ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzP)).longValue();
    }

    final /* synthetic */ void zzD(int i, com.google.android.gms.internal.ads.zzftm zzftmVar, com.google.android.gms.internal.ads.zzftm zzftmVar2, long j, int i2, int i3) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzL)).booleanValue()) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzK)).booleanValue()) {
                this.zzl.zza();
            } else if (i == 1) {
                this.zzl.zza();
            }
        }
        if (zzftmVar != null && zzftmVar2 != null) {
            com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.getAdFormat(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb);
            java.lang.String zzV = zzV(zzc(zzftmVar.zza()));
            if (adFormat != null && zzV != null && zzftmVar2.zzd() < zzftmVar.zzd()) {
                this.zzr.zzg(j, i2, i3, zzV, this.zzt, zzM());
            }
        }
        com.google.android.gms.internal.ads.zzfsn zzfsnVar = this.zzf;
        if (zzfsnVar != null) {
            zzfsnVar.zzb(this);
            return;
        }
        long zzC = zzC();
        if (zzC > 0) {
            this.zzi.schedule(new com.google.android.gms.internal.ads.zzftp(this), zzC, java.util.concurrent.TimeUnit.MILLISECONDS);
        } else {
            zzy();
        }
    }

    final /* synthetic */ void zzG(java.lang.Object obj) {
        if (obj != null) {
            this.zzl.zza();
            this.zzq.set(true);
            com.google.android.gms.ads.internal.client.zzdx zzc = zzc(obj);
            double zzl = !(zzc instanceof com.google.android.gms.internal.ads.zzdck) ? 0.0d : ((com.google.android.gms.internal.ads.zzdck) zzc).zzl();
            com.google.android.gms.ads.internal.client.zzdx zzc2 = zzc(obj);
            com.google.android.gms.internal.ads.zzftm zzftmVar = new com.google.android.gms.internal.ads.zzftm(obj, this.zzs, zzl, zzc2 instanceof com.google.android.gms.internal.ads.zzdck ? ((com.google.android.gms.internal.ads.zzdck) zzc2).zzm() : 2);
            java.util.Queue queue = this.zzk;
            synchronized (queue) {
                queue.add(zzftmVar);
            }
            com.google.android.gms.ads.internal.client.zzdx zzc3 = zzc(obj);
            long currentTimeMillis = this.zzs.currentTimeMillis();
            if (this.zzp.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzftq(this, zzc3));
            }
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.zzi;
            scheduledExecutorService.execute(new com.google.android.gms.internal.ads.zzftr(this, currentTimeMillis, zzc3));
            if (this.zzf != null) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzE)).booleanValue()) {
                    this.zzo.zzb(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzftz
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzfub.this.zzF();
                        }
                    }, zzftmVar.zzc(), java.util.concurrent.TimeUnit.MILLISECONDS);
                } else {
                    scheduledExecutorService.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfty
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzfub.this.zzE();
                        }
                    }, zzftmVar.zzc(), java.util.concurrent.TimeUnit.MILLISECONDS);
                }
            } else {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzE)).booleanValue()) {
                    this.zzo.zzb(new com.google.android.gms.internal.ads.zzftp(this), zzftmVar.zzc(), java.util.concurrent.TimeUnit.MILLISECONDS);
                } else {
                    scheduledExecutorService.schedule(new com.google.android.gms.internal.ads.zzftp(this), zzftmVar.zzc(), java.util.concurrent.TimeUnit.MILLISECONDS);
                }
            }
        }
        this.zzn.set(false);
        if (obj == null || this.zzf == null) {
            zzS(obj == null);
        }
    }

    final /* synthetic */ void zzH(java.lang.Throwable th) {
        this.zzn.set(false);
        if ((th instanceof com.google.android.gms.internal.ads.zzfso) && ((com.google.android.gms.internal.ads.zzfso) th).zza() == 0) {
            throw null;
        }
        zzS(true);
    }

    final /* synthetic */ void zzI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zzp.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzfts(this, zzeVar));
        }
        this.zzn.set(false);
        int i = zzeVar.zza;
        if (i != 1 && i != 8 && i != 10 && i != 11) {
            zzS(true);
            return;
        }
        int i2 = ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb;
        java.lang.String str = ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 26 + java.lang.String.valueOf(str).length() + 61);
        sb.append("Preloading ");
        sb.append(i2);
        sb.append(", for adUnitId:");
        sb.append(str);
        sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
        java.lang.String sb2 = sb.toString();
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(sb2);
        this.zzg.set(false);
        com.google.android.gms.internal.ads.zzfsn zzfsnVar = this.zzf;
        if (zzfsnVar != null) {
            zzfsnVar.zza(this);
        }
        com.google.android.gms.internal.ads.zzftj zzftjVar = new com.google.android.gms.internal.ads.zzftj(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza, zzq());
        zzftjVar.zza(this.zzm);
        this.zzr.zzk(this.zzs.currentTimeMillis(), new com.google.android.gms.internal.ads.zzftk(zzftjVar, null), zzeVar, zzs(), zzt(), zzM());
    }

    final /* synthetic */ void zzJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zzg(this.zzm, zzeVar);
            } catch (android.os.RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdFailedToPreload");
            }
        }
    }

    final /* synthetic */ void zzK(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = this.zzj;
        if (zzcbVar != null) {
            try {
                zzcbVar.zze((com.google.android.gms.ads.internal.client.zzfp) this.zze.get());
            } catch (android.os.RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsAvailable");
            }
        }
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zze(this.zzm, zzdxVar);
            } catch (android.os.RemoteException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdPreloaded");
            }
        }
    }

    final /* synthetic */ void zzL() {
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = this.zzj;
        if (zzcbVar != null) {
            try {
                zzcbVar.zzf((com.google.android.gms.ads.internal.client.zzfp) this.zze.get());
            } catch (android.os.RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zzf(this.zzm);
            } catch (android.os.RemoteException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzftd zzN() {
        return this.zzr;
    }

    final /* synthetic */ com.google.android.gms.common.util.Clock zzO() {
        return this.zzs;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzftk zzP() {
        return this.zzt;
    }

    protected abstract com.google.common.util.concurrent.ListenableFuture zza(android.content.Context context);

    protected long zzb() {
        throw null;
    }

    protected abstract com.google.android.gms.ads.internal.client.zzdx zzc(java.lang.Object obj);

    public final com.google.android.gms.internal.ads.zzfub zzd() {
        this.zzi.submit(new com.google.android.gms.internal.ads.zzftp(this));
        return this;
    }

    public final void zze() {
        if (this.zzn.compareAndSet(false, true)) {
            if (!this.zzg.get() || zzt() >= ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzd) {
                this.zzn.set(false);
            } else {
                this.zzi.submit(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfua
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzfub.this.zzz();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzJ)).booleanValue()) {
            this.zzl.zza();
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzD)).booleanValue() && this.zzf == null) {
            zzy();
        } else {
            zzF();
        }
        return !zzR();
    }

    public final java.lang.Object zzg() {
        final com.google.android.gms.internal.ads.zzftm zzftmVar;
        com.google.android.gms.internal.ads.zzftm zzftmVar2;
        java.util.Queue queue = this.zzk;
        final int zzt = zzt();
        synchronized (queue) {
            com.google.android.gms.internal.ads.zzftm zzftmVar3 = (com.google.android.gms.internal.ads.zzftm) queue.poll();
            this.zzq.set(zzftmVar3 != null);
            if (zzftmVar3 == null) {
                zzftmVar = null;
                zzftmVar2 = null;
            } else if (queue.isEmpty()) {
                zzftmVar2 = zzftmVar3;
                zzftmVar = null;
            } else {
                zzftmVar2 = zzftmVar3;
                zzftmVar = (com.google.android.gms.internal.ads.zzftm) queue.peek();
            }
        }
        final long currentTimeMillis = this.zzs.currentTimeMillis();
        final int zzs = zzs();
        final int zzt2 = zzt();
        final com.google.android.gms.internal.ads.zzftm zzftmVar4 = zzftmVar2;
        this.zzi.submit(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzftv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzfub.this.zzD(zzt, zzftmVar4, zzftmVar, currentTimeMillis, zzs, zzt2);
            }
        });
        if (zzftmVar2 == null) {
            return null;
        }
        return zzftmVar2.zza();
    }

    public final void zzh() {
        this.zzg.set(false);
        this.zzp.set(false);
    }

    public final void zzi() {
        this.zzg.set(false);
    }

    public final void zzj() {
        this.zzg.set(true);
        this.zzp.set(true);
        if (this.zzf == null) {
            this.zzi.submit(new com.google.android.gms.internal.ads.zzftp(this));
        }
    }

    public final boolean zzk(com.google.android.gms.ads.internal.client.zzfp zzfpVar) {
        return ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).equals(zzfpVar);
    }

    public final java.lang.String zzl() {
        com.google.android.gms.internal.ads.zzftm zzftmVar;
        java.util.Queue queue = this.zzk;
        synchronized (queue) {
            zzftmVar = (com.google.android.gms.internal.ads.zzftm) queue.peek();
        }
        java.lang.Object zza = zzftmVar == null ? null : zzftmVar.zza();
        return zzV(zza != null ? zzc(zza) : null);
    }

    public final void zzm(com.google.android.gms.internal.ads.zzftd zzftdVar) {
        this.zzr = zzftdVar;
    }

    public final void zzn(int i) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(i >= 5);
        this.zzl.zzf(i);
    }

    protected final com.google.android.gms.ads.internal.client.zzfp zzo() {
        return (com.google.android.gms.ads.internal.client.zzfp) this.zze.get();
    }

    protected final java.lang.String zzp() {
        return this.zzm;
    }

    protected final com.google.android.gms.ads.AdFormat zzq() {
        return com.google.android.gms.ads.AdFormat.getAdFormat(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb);
    }

    protected final java.lang.String zzr() {
        return ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza;
    }

    protected final int zzs() {
        return ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzd;
    }

    protected final int zzt() {
        int size;
        java.util.Queue queue = this.zzk;
        synchronized (queue) {
            size = queue.size();
        }
        return size;
    }

    protected final boolean zzu() {
        if (!this.zzg.get() || this.zzn.get() || zzt() >= zzs()) {
            return false;
        }
        com.google.android.gms.internal.ads.zzfsw zzfswVar = this.zzl;
        return (zzfswVar.zzd() || zzfswVar.zze()) ? false : true;
    }

    protected final void zzv() {
        java.util.Queue queue = this.zzk;
        synchronized (queue) {
            queue.clear();
        }
    }

    protected final boolean zzw() {
        return this.zzn.get();
    }

    protected final int zzx() {
        int zzt = zzt();
        int i = zzt - 1;
        if (!this.zzn.get()) {
            zzt = i;
        }
        return java.lang.Math.max(zzt, 0);
    }

    protected final void zzy() {
        zzF();
        if (zzR() && this.zzq.compareAndSet(true, false)) {
            if (this.zzp.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzftt(this));
            }
            this.zzi.execute(new com.google.android.gms.internal.ads.zzftu(this));
        }
        if (this.zzn.compareAndSet(false, true)) {
            if (!this.zzg.get() || zzt() >= ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzd) {
                this.zzn.set(false);
            } else {
                zzz();
            }
        }
    }

    protected final void zzz() {
        com.google.common.util.concurrent.ListenableFuture zza;
        android.app.Activity zzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
        if (zzd == null) {
            java.lang.String str = ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza;
            java.lang.String.valueOf(str);
            java.lang.String valueOf = java.lang.String.valueOf(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Empty activity context at preloading: ".concat(valueOf));
            zza = zza(this.zzb);
        } else {
            zza = zza(zzd);
        }
        com.google.android.gms.internal.ads.zzhbw.zzr(zza, new com.google.android.gms.internal.ads.zzftn(this), this.zzi);
    }

    public zzfub(java.lang.String str, com.google.android.gms.ads.internal.ClientApi clientApi, android.content.Context context, int i, com.google.android.gms.internal.ads.zzflu zzfluVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzfoo zzfooVar, com.google.android.gms.internal.ads.zzfsw zzfswVar, com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzfsn zzfsnVar) {
        this(str, clientApi, context, i, zzfluVar, zzfpVar, scheduledExecutorService, zzfooVar, zzfswVar, clock, zzfsnVar);
        this.zzh = zzceVar;
    }

    private zzfub(java.lang.String str, com.google.android.gms.ads.internal.ClientApi clientApi, android.content.Context context, int i, com.google.android.gms.internal.ads.zzflu zzfluVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzfoo zzfooVar, com.google.android.gms.internal.ads.zzfsw zzfswVar, com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzfsn zzfsnVar) {
        java.util.Queue priorityQueue;
        this.zzm = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i;
        this.zzd = zzfluVar;
        this.zze = new java.util.concurrent.atomic.AtomicReference(zzfpVar);
        int max = java.lang.Math.max(1, zzfpVar.zzd);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzab)).booleanValue()) {
            priorityQueue = new com.google.android.gms.internal.ads.zzfue();
        } else {
            priorityQueue = new java.util.PriorityQueue(max, com.google.android.gms.internal.ads.zzftx.zza);
        }
        this.zzk = priorityQueue;
        this.zzg = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.zzn = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.zzi = scheduledExecutorService;
        this.zzo = zzfooVar;
        this.zzl = zzfswVar;
        this.zzp = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.zzq = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.zzs = clock;
        com.google.android.gms.internal.ads.zzftj zzftjVar = new com.google.android.gms.internal.ads.zzftj(zzfpVar.zza, com.google.android.gms.ads.AdFormat.getAdFormat(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzb));
        zzftjVar.zza(str);
        this.zzt = new com.google.android.gms.internal.ads.zzftk(zzftjVar, null);
        this.zzf = zzfsnVar;
    }
}
