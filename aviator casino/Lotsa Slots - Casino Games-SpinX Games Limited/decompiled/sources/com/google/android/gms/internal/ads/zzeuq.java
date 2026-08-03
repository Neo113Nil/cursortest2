package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeuq implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.common.util.concurrent.ListenableFuture zza;
    private final java.util.concurrent.Executor zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;

    zzeuq(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zza = listenableFuture;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zza;
        com.google.android.gms.internal.ads.zzeup zzeupVar = com.google.android.gms.internal.ads.zzeup.zza;
        java.util.concurrent.Executor executor = this.zzb;
        com.google.common.util.concurrent.ListenableFuture zzj = com.google.android.gms.internal.ads.zzhbw.zzj(listenableFuture, zzeupVar, executor);
        if (((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznW)).intValue() > 0) {
            zzj = com.google.android.gms.internal.ads.zzhbw.zzi(zzj, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(r1)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzc);
        }
        return com.google.android.gms.internal.ads.zzhbw.zzh(zzj, java.lang.Throwable.class, com.google.android.gms.internal.ads.zzeuo.zza, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 6;
    }
}
