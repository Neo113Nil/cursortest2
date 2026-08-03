package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhcm extends com.google.android.gms.internal.ads.zzhci implements com.google.android.gms.internal.ads.zzhch {
    final java.util.concurrent.ScheduledExecutorService zza;

    zzhcm(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzhcf schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.zza;
        com.google.android.gms.internal.ads.zzhcv zze = com.google.android.gms.internal.ads.zzhcv.zze(runnable, null);
        return new com.google.android.gms.internal.ads.zzhck(zze, scheduledExecutorService.schedule(zze, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzhcf schedule(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.internal.ads.zzhcv zzhcvVar = new com.google.android.gms.internal.ads.zzhcv(callable);
        return new com.google.android.gms.internal.ads.zzhck(zzhcvVar, this.zza.schedule(zzhcvVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzhcf scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.internal.ads.zzhcl zzhclVar = new com.google.android.gms.internal.ads.zzhcl(runnable);
        return new com.google.android.gms.internal.ads.zzhck(zzhclVar, this.zza.scheduleAtFixedRate(zzhclVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzhcf scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.internal.ads.zzhcl zzhclVar = new com.google.android.gms.internal.ads.zzhcl(runnable);
        return new com.google.android.gms.internal.ads.zzhck(zzhclVar, this.zza.scheduleWithFixedDelay(zzhclVar, j, j2, timeUnit));
    }
}
