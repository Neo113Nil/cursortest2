package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzevx implements com.google.android.gms.internal.ads.zzfck {
    final com.google.android.gms.internal.ads.zzcfd zza;
    com.google.android.gms.appset.AppSetIdClient zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private final com.google.android.gms.internal.ads.zzhcg zzd;
    private final android.content.Context zze;

    zzevx(android.content.Context context, com.google.android.gms.internal.ads.zzcfd zzcfdVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzhcg zzhcgVar) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdT)).booleanValue()) {
            this.zzb = com.google.android.gms.appset.AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcfdVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzhcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdP)).booleanValue()) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdU)).booleanValue()) {
                if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdQ)).booleanValue()) {
                    return com.google.android.gms.internal.ads.zzhbw.zzk(com.google.android.gms.internal.ads.zzgcs.zza(this.zzb.getAppSetIdInfo(), null), com.google.android.gms.internal.ads.zzevw.zza, com.google.android.gms.internal.ads.zzcfr.zzh);
                }
                com.google.android.gms.tasks.Task<com.google.android.gms.appset.AppSetIdInfo> zzb = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdT)).booleanValue() ? com.google.android.gms.internal.ads.zzfmd.zzb(this.zze) : this.zzb.getAppSetIdInfo();
                if (zzb == null) {
                    return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzevy(null, -1));
                }
                com.google.common.util.concurrent.ListenableFuture zzj = com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzgcs.zza(zzb, null), com.google.android.gms.internal.ads.zzevu.zza, com.google.android.gms.internal.ads.zzcfr.zzh);
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdR)).booleanValue()) {
                    zzj = com.google.android.gms.internal.ads.zzhbw.zzi(zzj, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdS)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzc);
                }
                return com.google.android.gms.internal.ads.zzhbw.zzg(zzj, java.lang.Exception.class, new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzevv
                    @Override // com.google.android.gms.internal.ads.zzgta
                    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                        com.google.android.gms.internal.ads.zzevx.this.zza.zzg((java.lang.Exception) obj, "AppSetIdInfoSignal");
                        return new com.google.android.gms.internal.ads.zzevy(null, -1);
                    }
                }, this.zzd);
            }
        }
        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzevy(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 11;
    }
}
