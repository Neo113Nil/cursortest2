package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfsy {
    private final com.google.android.gms.internal.ads.zzfsn zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean(false);
    private volatile java.util.concurrent.ScheduledFuture zzc;
    private final com.google.android.gms.internal.ads.zzfub zzd;

    public zzfsy(final com.google.android.gms.internal.ads.zzfsn zzfsnVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, long j, final com.google.android.gms.internal.ads.zzfub zzfubVar) {
        this.zzd = zzfubVar;
        this.zza = zzfsnVar;
        if (j > 0) {
            this.zzc = scheduledExecutorService.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfsx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzfsy.this.zzb(zzfsnVar, zzfubVar);
                }
            }, j, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    public final void zza() {
        if (this.zzb.compareAndSet(false, true)) {
            if (this.zzc != null) {
                this.zzc.cancel(false);
            }
            this.zza.zzc(this.zzd, false);
        }
    }

    final /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzfsn zzfsnVar, com.google.android.gms.internal.ads.zzfub zzfubVar) {
        if (this.zzb.compareAndSet(false, true)) {
            zzfsnVar.zzc(zzfubVar, true);
        }
    }
}
