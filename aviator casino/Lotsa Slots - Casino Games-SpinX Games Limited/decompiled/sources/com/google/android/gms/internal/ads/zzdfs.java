package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdfs extends com.google.android.gms.internal.ads.zzdip {
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private final com.google.android.gms.common.util.Clock zzc;
    private final com.google.android.gms.internal.ads.zzdzl zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private java.util.concurrent.ScheduledFuture zzj;
    private java.util.concurrent.ScheduledFuture zzk;

    public zzdfs(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        super(java.util.Collections.emptySet());
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzi = false;
        this.zzb = scheduledExecutorService;
        this.zzc = clock;
        this.zzd = zzdzlVar;
    }

    private final synchronized void zzf(long j) {
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zzj;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.zzj.cancel(false);
        }
        this.zze = this.zzc.elapsedRealtime() + j;
        this.zzj = this.zzb.schedule(new com.google.android.gms.internal.ads.zzdfq(this, null), j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    private final synchronized void zzg(long j) {
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zzk;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.zzk.cancel(false);
        }
        this.zzf = this.zzc.elapsedRealtime() + j;
        this.zzk = this.zzb.schedule(new com.google.android.gms.internal.ads.zzdfr(this, null), j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public final synchronized void zza() {
        if (this.zzi) {
            return;
        }
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zzj;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            this.zzg = -1L;
        } else {
            this.zzj.cancel(false);
            this.zzg = this.zze - this.zzc.elapsedRealtime();
        }
        java.util.concurrent.ScheduledFuture scheduledFuture2 = this.zzk;
        if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
            this.zzh = -1L;
        } else {
            this.zzk.cancel(false);
            this.zzh = this.zzf - this.zzc.elapsedRealtime();
        }
        this.zzi = true;
    }

    public final synchronized void zzb() {
        java.util.concurrent.ScheduledFuture scheduledFuture;
        java.util.concurrent.ScheduledFuture scheduledFuture2;
        if (this.zzi) {
            if (this.zzg > 0 && (scheduledFuture2 = this.zzj) != null && scheduledFuture2.isCancelled()) {
                zzf(this.zzg);
            }
            if (this.zzh > 0 && (scheduledFuture = this.zzk) != null && scheduledFuture.isCancelled()) {
                zzg(this.zzh);
            }
            this.zzi = false;
        }
    }

    public final synchronized void zzc() {
        this.zzi = false;
        zzf(0L);
    }

    public final synchronized void zzd(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 20);
        sb.append("In scheduleRefresh: ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        if (i > 0) {
            long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(i);
            if (this.zzi) {
                long j = this.zzg;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.zzg = millis;
                return;
            }
            long elapsedRealtime = this.zzc.elapsedRealtime();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoK)).booleanValue()) {
                long j2 = this.zze;
                if (elapsedRealtime >= j2 || j2 - elapsedRealtime > millis) {
                    zzf(millis);
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzph)).booleanValue()) {
                        com.google.android.gms.internal.ads.zzdzk zza = this.zzd.zza();
                        zza.zzc("action", "rtnc");
                        zza.zzf();
                    }
                }
            } else {
                long j3 = this.zze;
                if (elapsedRealtime > j3 || j3 - elapsedRealtime > millis) {
                    zzf(millis);
                }
            }
        }
    }

    public final synchronized void zze(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 28);
        sb.append("In scheduleShowRefreshedAd: ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        if (i > 0) {
            long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(i);
            if (this.zzi) {
                long j = this.zzh;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.zzh = millis;
                return;
            }
            long elapsedRealtime = this.zzc.elapsedRealtime();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoK)).booleanValue()) {
                if (elapsedRealtime == this.zzf) {
                    com.google.android.gms.ads.internal.util.zze.zza("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j2 = this.zzf;
                if (elapsedRealtime >= j2 || j2 - elapsedRealtime > millis) {
                    zzg(millis);
                }
            } else {
                long j3 = this.zzf;
                if (elapsedRealtime > j3 || j3 - elapsedRealtime > millis) {
                    zzg(millis);
                }
            }
        }
    }
}
