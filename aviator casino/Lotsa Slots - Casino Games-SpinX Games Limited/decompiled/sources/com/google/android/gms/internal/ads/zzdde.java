package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdde extends com.google.android.gms.internal.ads.zzdip implements com.google.android.gms.internal.ads.zzdcv {
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private java.util.concurrent.ScheduledFuture zzc;
    private boolean zzd;

    public zzdde(com.google.android.gms.internal.ads.zzdda zzddaVar, java.util.Set set, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        super.zzq(zzddaVar, executor);
    }

    public final synchronized void zza() {
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzb() {
        this.zzc = this.zzb.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzddc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzdde.this.zzf();
            }
        }, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzme)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzc(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(new com.google.android.gms.internal.ads.zzdio() { // from class: com.google.android.gms.internal.ads.zzddd
            @Override // com.google.android.gms.internal.ads.zzdio
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzdcv) obj).zzc(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzd(final com.google.android.gms.internal.ads.zzdnn zzdnnVar) {
        if (this.zzd) {
            return;
        }
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzs(new com.google.android.gms.internal.ads.zzdio() { // from class: com.google.android.gms.internal.ads.zzddb
            @Override // com.google.android.gms.internal.ads.zzdio
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzdcv) obj).zzd(com.google.android.gms.internal.ads.zzdnn.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zze() {
        zzs(com.google.android.gms.internal.ads.zzdcw.zza);
    }

    final /* synthetic */ void zzf() {
        synchronized (this) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Timeout waiting for show call succeed to be called.");
            zzd(new com.google.android.gms.internal.ads.zzdnn("Timeout for show call succeed."));
            this.zzd = true;
        }
    }
}
