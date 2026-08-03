package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdbk implements com.google.android.gms.internal.ads.zzdcr, com.google.android.gms.internal.ads.zzdkd, com.google.android.gms.internal.ads.zzdht, com.google.android.gms.internal.ads.zzddh, com.google.android.gms.internal.ads.zzbeq {
    private final com.google.android.gms.internal.ads.zzddj zza;
    private final com.google.android.gms.internal.ads.zzdfk zzb;
    private final com.google.android.gms.internal.ads.zzfkf zzc;
    private final java.util.concurrent.ScheduledExecutorService zzd;
    private final java.util.concurrent.Executor zze;
    private java.util.concurrent.ScheduledFuture zzg;
    private final java.lang.String zzi;
    private final com.google.android.gms.internal.ads.zzhcp zzf = com.google.android.gms.internal.ads.zzhcp.zze();
    private final java.util.concurrent.atomic.AtomicBoolean zzh = new java.util.concurrent.atomic.AtomicBoolean();

    zzdbk(com.google.android.gms.internal.ads.zzddj zzddjVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.concurrent.Executor executor, java.lang.String str, com.google.android.gms.internal.ads.zzdfk zzdfkVar) {
        this.zza = zzddjVar;
        this.zzc = zzfkfVar;
        this.zzd = scheduledExecutorService;
        this.zze = executor;
        this.zzi = str;
        this.zzb = zzdfkVar;
    }

    private final boolean zzl() {
        return this.zzi.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzd(com.google.android.gms.internal.ads.zzcbp zzcbpVar, java.lang.String str, java.lang.String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdht
    public final synchronized void zzdH() {
        if (this.zzc.zze == 4) {
            this.zza.zza();
            return;
        }
        com.google.android.gms.internal.ads.zzhcp zzhcpVar = this.zzf;
        if (zzhcpVar.isDone()) {
            return;
        }
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzhcpVar.zza((java.lang.Object) true);
    }

    @Override // com.google.android.gms.internal.ads.zzdht
    public final void zzdI() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final void zzdj(com.google.android.gms.internal.ads.zzbep zzbepVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmV)).booleanValue() && zzl() && zzbepVar.zzj && this.zzh.compareAndSet(false, true) && this.zzc.zze != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzds() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzdt() {
        com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzc;
        if (zzfkfVar.zze == 3) {
            return;
        }
        int i = zzfkfVar.zzY;
        if (i == 0 || i == 1) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmV)).booleanValue() && zzl()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final void zzg() {
        com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzc;
        int i = zzfkfVar.zze;
        if (i == 3) {
            return;
        }
        if (i == 4) {
            this.zzb.zza();
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzch)).booleanValue() && zzfkfVar.zzY == 2) {
            int i2 = zzfkfVar.zzq;
            if (i2 == 0) {
                this.zza.zza();
            } else {
                com.google.android.gms.internal.ads.zzhbw.zzr(this.zzf, new com.google.android.gms.internal.ads.zzdbi(this), this.zze);
                this.zzg = this.zzd.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdbj
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzdbk.this.zzi();
                    }
                }, i2, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final void zzh() {
    }

    final /* synthetic */ void zzi() {
        synchronized (this) {
            com.google.android.gms.internal.ads.zzhcp zzhcpVar = this.zzf;
            if (zzhcpVar.isDone()) {
                return;
            }
            zzhcpVar.zza((java.lang.Object) true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzhcp zzhcpVar = this.zzf;
        if (zzhcpVar.isDone()) {
            return;
        }
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzhcpVar.zzb(new java.lang.Exception());
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzddj zzk() {
        return this.zza;
    }
}
