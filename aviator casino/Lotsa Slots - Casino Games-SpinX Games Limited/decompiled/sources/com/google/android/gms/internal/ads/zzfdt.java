package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfdt implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzcfd zza;
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private final com.google.android.gms.internal.ads.zzhcg zzc;

    zzfdt(java.lang.String str, com.google.android.gms.internal.ads.zzbgs zzbgsVar, com.google.android.gms.internal.ads.zzcfd zzcfdVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzhcg zzhcgVar) {
        this.zza = zzcfdVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzhcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdP)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdU)).booleanValue()) {
                com.google.common.util.concurrent.ListenableFuture zza = com.google.android.gms.internal.ads.zzgcs.zza(com.google.android.gms.tasks.Tasks.forResult(null), null);
                com.google.android.gms.internal.ads.zzhcg zzhcgVar = this.zzc;
                com.google.common.util.concurrent.ListenableFuture zzj = com.google.android.gms.internal.ads.zzhbw.zzj(zza, com.google.android.gms.internal.ads.zzfds.zza, zzhcgVar);
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkd.zza.zze()).booleanValue()) {
                    zzj = com.google.android.gms.internal.ads.zzhbw.zzi(zzj, ((java.lang.Long) com.google.android.gms.internal.ads.zzbkd.zzb.zze()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzb);
                }
                return com.google.android.gms.internal.ads.zzhbw.zzg(zzj, java.lang.Exception.class, new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzfdr
                    @Override // com.google.android.gms.internal.ads.zzgta
                    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                        return com.google.android.gms.internal.ads.zzfdt.this.zzc((java.lang.Exception) obj);
                    }
                }, zzhcgVar);
            }
        }
        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzfdu(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 43;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfdu zzc(java.lang.Exception exc) {
        this.zza.zzg(exc, "AppSetIdInfoGmscoreSignal");
        return new com.google.android.gms.internal.ads.zzfdu(null, -1);
    }
}
