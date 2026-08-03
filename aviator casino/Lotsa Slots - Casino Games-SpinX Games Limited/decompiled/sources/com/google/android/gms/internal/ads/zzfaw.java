package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfaw implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzfck zza;
    private final long zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;

    public zzfaw(com.google.android.gms.internal.ads.zzfck zzfckVar, long j, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfckVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        com.google.common.util.concurrent.ListenableFuture zza = this.zza.zza();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzde)).booleanValue()) {
            timeUnit = java.util.concurrent.TimeUnit.MICROSECONDS;
        }
        long j = this.zzb;
        if (j > 0) {
            zza = com.google.android.gms.internal.ads.zzhbw.zzi(zza, j, timeUnit, this.zzc);
        }
        return com.google.android.gms.internal.ads.zzhbw.zzh(zza, java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzfav
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzfaw.this.zzc((java.lang.Throwable) obj);
            }
        }, com.google.android.gms.internal.ads.zzcfr.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return this.zza.zzb();
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(java.lang.Throwable th) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdc)).booleanValue()) {
            com.google.android.gms.internal.ads.zzfck zzfckVar = this.zza;
            com.google.android.gms.internal.ads.zzcfd zzh = com.google.android.gms.ads.internal.zzt.zzh();
            int zzb = zzfckVar.zzb();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzb).length() + 22);
            sb.append("OptionalSignalTimeout:");
            sb.append(zzb);
            zzh.zzg(th, sb.toString());
        }
        return com.google.android.gms.internal.ads.zzhbw.zza(null);
    }
}
