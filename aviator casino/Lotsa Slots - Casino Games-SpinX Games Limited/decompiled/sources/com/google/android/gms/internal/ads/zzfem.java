package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfem implements com.google.android.gms.internal.ads.zzfck {
    final java.util.concurrent.ScheduledExecutorService zza;

    public zzfem(com.google.android.gms.internal.ads.zzbzf zzbzfVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, android.content.Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return com.google.android.gms.internal.ads.zzhbw.zzk(com.google.android.gms.internal.ads.zzhbw.zzi(com.google.android.gms.internal.ads.zzhbw.zza(new android.os.Bundle()), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfe)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zza), com.google.android.gms.internal.ads.zzfel.zza, com.google.android.gms.internal.ads.zzcfr.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 49;
    }
}
