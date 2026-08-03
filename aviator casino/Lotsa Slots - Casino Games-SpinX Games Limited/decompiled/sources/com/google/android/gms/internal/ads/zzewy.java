package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzewy implements com.google.android.gms.internal.ads.zzfck {
    private final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference(false);
    private final com.google.android.gms.common.util.Clock zzc;
    private final java.util.concurrent.Executor zzd;
    private final com.google.android.gms.internal.ads.zzfck zze;
    private final long zzf;
    private final com.google.android.gms.internal.ads.zzdzl zzg;

    public zzewy(com.google.android.gms.internal.ads.zzfck zzfckVar, long j, com.google.android.gms.common.util.Clock clock, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zzc = clock;
        this.zze = zzfckVar;
        this.zzf = j;
        this.zzd = executor;
        this.zzg = zzdzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        com.google.android.gms.internal.ads.zzewv zzewvVar;
        com.google.android.gms.internal.ads.zzewv zzewvVar2;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznl)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznk)).booleanValue() && !((java.lang.Boolean) this.zzb.getAndSet(true)).booleanValue()) {
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = com.google.android.gms.internal.ads.zzcfr.zzd;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzewx
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzewy.this.zzc();
                    }
                };
                long j = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                java.util.concurrent.atomic.AtomicReference atomicReference = this.zza;
                zzewvVar = (com.google.android.gms.internal.ads.zzewv) atomicReference.get();
                if (zzewvVar == null) {
                    com.google.android.gms.internal.ads.zzewv zzewvVar3 = new com.google.android.gms.internal.ads.zzewv(this.zze.zza(), this.zzf, this.zzc);
                    atomicReference.set(zzewvVar3);
                    return zzewvVar3.zza;
                }
                if (!((java.lang.Boolean) this.zzb.get()).booleanValue() && zzewvVar.zza()) {
                    com.google.common.util.concurrent.ListenableFuture listenableFuture = zzewvVar.zza;
                    com.google.android.gms.internal.ads.zzfck zzfckVar = this.zze;
                    zzewvVar2 = new com.google.android.gms.internal.ads.zzewv(zzfckVar.zza(), this.zzf, this.zzc);
                    this.zza.set(zzewvVar2);
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznm)).booleanValue()) {
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznn)).booleanValue()) {
                            com.google.android.gms.internal.ads.zzdzk zza = this.zzg.zza();
                            zza.zzc("action", "scs");
                            zza.zzc("sid", java.lang.String.valueOf(zzfckVar.zzb()));
                            zza.zzd();
                        }
                        return listenableFuture;
                    }
                    zzewvVar = zzewvVar2;
                }
            }
        } else {
            java.util.concurrent.atomic.AtomicReference atomicReference2 = this.zza;
            zzewvVar = (com.google.android.gms.internal.ads.zzewv) atomicReference2.get();
            if (zzewvVar == null || zzewvVar.zza()) {
                com.google.android.gms.internal.ads.zzfck zzfckVar2 = this.zze;
                zzewvVar2 = new com.google.android.gms.internal.ads.zzewv(zzfckVar2.zza(), this.zzf, this.zzc);
                atomicReference2.set(zzewvVar2);
                zzewvVar = zzewvVar2;
            }
        }
        return zzewvVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return this.zze.zzb();
    }

    final /* synthetic */ void zzc() {
        this.zzd.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzeww
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzewy.this.zzd();
            }
        });
    }

    final /* synthetic */ void zzd() {
        this.zza.set(new com.google.android.gms.internal.ads.zzewv(this.zze.zza(), this.zzf, this.zzc));
    }
}
