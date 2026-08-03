package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfsn {
    final java.util.concurrent.atomic.AtomicBoolean zza = new java.util.concurrent.atomic.AtomicBoolean(false);
    final java.util.Map zzb = new java.util.LinkedHashMap();
    final java.util.concurrent.atomic.AtomicBoolean zzc = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private java.util.concurrent.ScheduledFuture zze;
    private final java.util.concurrent.ScheduledExecutorService zzf;
    private final com.google.android.gms.internal.ads.zzftd zzg;
    private final com.google.android.gms.common.util.Clock zzh;

    public zzfsn(com.google.android.gms.ads.internal.util.zzg zzgVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzftd zzftdVar, com.google.android.gms.common.util.Clock clock) {
        this.zzd = zzgVar;
        this.zzf = scheduledExecutorService;
        this.zzg = zzftdVar;
        this.zzh = clock;
    }

    private final boolean zzA(com.google.android.gms.internal.ads.zzfub zzfubVar) {
        if (this.zza.get() || zzfubVar.zzt() != 0 || !zzfubVar.zzu()) {
            return false;
        }
        zzfubVar.zze();
        return true;
    }

    private final int zzq() {
        int zzR = this.zzd.zzR();
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzN)).booleanValue() && zzR > 0) {
            return zzR;
        }
        return ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzX)).intValue();
    }

    private static java.lang.String zzr(java.lang.String str, com.google.android.gms.ads.AdFormat adFormat) {
        return java.lang.String.format(com.unity3d.services.ads.gmascar.utils.ScarConstants.TOKEN_WITH_SCAR_FORMAT, str, adFormat);
    }

    private final void zzs(final com.google.android.gms.internal.ads.zzfub zzfubVar) {
        if (zzfubVar.zzt() > 0 || zzfubVar.zzw()) {
            this.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfse
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzfsn.this.zzi(zzfubVar);
                }
            });
        }
        this.zza.set(true);
        synchronized (this) {
            java.util.concurrent.ScheduledFuture scheduledFuture = this.zze;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zze = null;
        }
        this.zzc.set(true);
    }

    private final boolean zzt(com.google.android.gms.internal.ads.zzfub zzfubVar) {
        boolean z;
        com.google.android.gms.ads.AdFormat zzq = zzfubVar.zzq();
        if (zzq == null) {
            return true;
        }
        java.util.Map map = this.zzb;
        synchronized (map) {
            z = !map.containsKey(zzr(zzfubVar.zzp(), zzq));
        }
        return z;
    }

    private final boolean zzu() {
        com.google.android.gms.internal.ads.zzgwm zzq;
        java.util.Map map = this.zzb;
        synchronized (map) {
            zzq = com.google.android.gms.internal.ads.zzgwm.zzq(map.values());
        }
        int size = zzq.size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.internal.ads.zzfub zzfubVar = (com.google.android.gms.internal.ads.zzfub) zzq.get(i);
            if (zzfubVar.zzt() == 0 && zzfubVar.zzu()) {
                return true;
            }
        }
        return false;
    }

    private final void zzv(long j) {
        if (this.zzc.compareAndSet(false, true)) {
            synchronized (this) {
                if (j > 0) {
                    this.zze = this.zzf.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfsh
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzfsn.this.zzl();
                        }
                    }, j, java.util.concurrent.TimeUnit.MILLISECONDS);
                } else {
                    this.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfsg
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzfsn.this.zzk();
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzw, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzn() {
        com.google.android.gms.internal.ads.zzfub zzfubVar;
        com.google.android.gms.internal.ads.zzgwm zzq;
        if (this.zza.get()) {
            return;
        }
        synchronized (this) {
            zzfubVar = null;
            this.zze = null;
        }
        int zzq2 = zzq();
        if (zzg() < zzq2 || zzu()) {
            java.util.Map map = this.zzb;
            synchronized (map) {
                zzq = com.google.android.gms.internal.ads.zzgwm.zzq(map.values());
            }
            int size = zzq.size();
            double d = Double.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                com.google.android.gms.internal.ads.zzfub zzfubVar2 = (com.google.android.gms.internal.ads.zzfub) zzq.get(i);
                if (zzfubVar2.zzu()) {
                    double zzt = zzfubVar2.zzt() / zzfubVar2.zzs();
                    if (zzt < d) {
                        d = zzt;
                    }
                    if (zzt < d) {
                        zzfubVar = zzfubVar2;
                    }
                }
            }
            if (zzfubVar != null) {
                zzfubVar.zze();
                if (zzfubVar.zzt() > 0) {
                    this.zzg.zzq(this.zzh.currentTimeMillis(), zzfubVar.zzp(), zzfubVar.zzr(), zzfubVar.zzq(), zzfubVar.zzs(), zzfubVar.zzt(), zzg(), zzq2);
                }
            }
            if (zzg() >= zzq2) {
                zzy();
            }
            if (zzg() < zzq2 || zzu()) {
                if (zzu()) {
                    this.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfsi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzfsn.this.zzm();
                        }
                    });
                    return;
                }
                synchronized (this) {
                    this.zze = this.zzf.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfsj
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzfsn.this.zzn();
                        }
                    }, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzZ)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
                }
                return;
            }
        } else {
            zzy();
        }
        this.zzc.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzx, reason: merged with bridge method [inline-methods] */
    public final void zzh() {
        this.zza.set(false);
        zzn();
    }

    private final void zzy() {
        int size;
        java.util.Map map = this.zzb;
        synchronized (map) {
            size = map.size();
        }
        this.zzg.zzs(this.zzh.currentTimeMillis(), zzq(), size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final void zzj(com.google.android.gms.internal.ads.zzfub zzfubVar, int i) {
        this.zzg.zzr(this.zzh.currentTimeMillis(), zzfubVar.zzp(), zzfubVar.zzr(), zzfubVar.zzq(), zzfubVar.zzs(), zzfubVar.zzt(), i, zzg(), zzq());
    }

    public final void zza(com.google.android.gms.internal.ads.zzfub zzfubVar) {
        int i = 1;
        if (zzfubVar.zzt() <= 0 && !zzfubVar.zzw()) {
            i = 0;
        }
        zzd(zzfubVar, i);
    }

    public final void zzb(com.google.android.gms.internal.ads.zzfub zzfubVar) {
        if (zzt(zzfubVar)) {
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzT)).booleanValue()) {
            zzs(zzfubVar);
            return;
        }
        long zzC = zzfubVar.zzC();
        if (zzC <= 0) {
            zza(zzfubVar);
            return;
        }
        zzs(zzfubVar);
        synchronized (this) {
            this.zze = this.zzf.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfsm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzfsn.this.zzh();
                }
            }, zzC, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    public final void zzc(com.google.android.gms.internal.ads.zzfub zzfubVar, boolean z) {
        if (z) {
            this.zzg.zzt(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzU)).longValue(), zzfubVar.zzq(), zzfubVar.zzp(), zzfubVar.zzr());
        } else {
            this.zzg.zzu(this.zzh.currentTimeMillis(), zzfubVar.zzq(), zzfubVar.zzp(), zzfubVar.zzr());
        }
        zzh();
    }

    public final void zzd(final com.google.android.gms.internal.ads.zzfub zzfubVar, final int i) {
        if (zzt(zzfubVar)) {
            return;
        }
        if (i > 0) {
            this.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfsf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzfsn.this.zzj(zzfubVar, i);
                }
            });
        }
        if (!zzA(zzfubVar)) {
            zzv(0L);
        } else {
            zzv(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzY)).longValue());
        }
    }

    public final void zze(java.lang.String str, com.google.android.gms.ads.AdFormat adFormat, final com.google.android.gms.internal.ads.zzfub zzfubVar) {
        java.util.Map map = this.zzb;
        java.lang.String zzr = zzr(str, adFormat);
        synchronized (map) {
            if (map.containsKey(zzr)) {
                return;
            }
            map.put(zzr, zzfubVar);
            this.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfsk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzfsn.this.zzo(zzfubVar);
                }
            });
        }
    }

    public final void zzf(final com.google.android.gms.internal.ads.zzfub zzfubVar) {
        com.google.android.gms.ads.AdFormat zzq = zzfubVar.zzq();
        if (zzq == null) {
            return;
        }
        java.lang.String zzr = zzr(zzfubVar.zzp(), zzq);
        java.util.Map map = this.zzb;
        synchronized (map) {
            if (map.containsKey(zzr)) {
                map.remove(zzr);
                final int zzx = zzfubVar.zzx();
                this.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfsl
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzfsn.this.zzp(zzx, zzfubVar);
                    }
                });
            }
        }
    }

    final int zzg() {
        com.google.android.gms.internal.ads.zzgwm zzq;
        java.util.Map map = this.zzb;
        synchronized (map) {
            zzq = com.google.android.gms.internal.ads.zzgwm.zzq(map.values());
        }
        int size = zzq.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((com.google.android.gms.internal.ads.zzfub) zzq.get(i2)).zzx();
        }
        return i;
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzfub zzfubVar) {
        zzj(zzfubVar, 1);
    }

    final /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzfub zzfubVar) {
        zzA(zzfubVar);
        zzv(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzY)).longValue());
    }

    final /* synthetic */ void zzp(int i, com.google.android.gms.internal.ads.zzfub zzfubVar) {
        if (i > 0) {
            zzj(zzfubVar, i);
        }
        zzv(0L);
    }
}
