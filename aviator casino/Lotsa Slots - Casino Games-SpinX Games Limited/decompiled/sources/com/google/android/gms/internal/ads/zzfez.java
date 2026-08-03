package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfez implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzcfd zza;
    private final boolean zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private final com.google.android.gms.internal.ads.zzhcg zzd;
    private final int zze;

    zzfez(com.google.android.gms.internal.ads.zzcfd zzcfdVar, boolean z, com.google.android.gms.internal.ads.zzcet zzcetVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar, java.lang.String str, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, int i) {
        this.zza = zzcfdVar;
        this.zzb = z;
        this.zzd = zzhcgVar;
        this.zzc = scheduledExecutorService;
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhX)).booleanValue() && this.zzb) {
            return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzffa(null));
        }
        if (!java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhZ)).split(",")).contains(java.lang.String.valueOf(this.zze))) {
            return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzffa(null));
        }
        com.google.common.util.concurrent.ListenableFuture zza = com.google.android.gms.internal.ads.zzhbw.zza(null);
        com.google.android.gms.internal.ads.zzhcg zzhcgVar = this.zzd;
        return com.google.android.gms.internal.ads.zzhbw.zzg(com.google.android.gms.internal.ads.zzhbw.zzi(com.google.android.gms.internal.ads.zzhbw.zzk(zza, com.google.android.gms.internal.ads.zzfey.zza, zzhcgVar), ((java.lang.Long) com.google.android.gms.internal.ads.zzblf.zzb.zze()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzc), java.lang.Exception.class, new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzfex
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzfez.this.zzc((java.lang.Exception) obj);
            }
        }, zzhcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 50;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzffa zzc(java.lang.Exception exc) {
        this.zza.zzg(exc, "TrustlessTokenSignal");
        return new com.google.android.gms.internal.ads.zzffa(null);
    }
}
