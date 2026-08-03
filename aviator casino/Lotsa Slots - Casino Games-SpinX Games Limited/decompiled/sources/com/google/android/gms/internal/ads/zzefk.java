package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzefk implements com.google.android.gms.internal.ads.zzegq {
    private static final java.util.regex.Pattern zzh = java.util.regex.Pattern.compile("Received error HTTP response code: (.*)");
    private final com.google.android.gms.internal.ads.zzeel zza;
    private final com.google.android.gms.internal.ads.zzhcg zzb;
    private final com.google.android.gms.internal.ads.zzfky zzc;
    private final java.util.concurrent.ScheduledExecutorService zzd;
    private final com.google.android.gms.internal.ads.zzejd zze;
    private final com.google.android.gms.internal.ads.zzfqg zzf;
    private final android.content.Context zzg;

    zzefk(android.content.Context context, com.google.android.gms.internal.ads.zzfky zzfkyVar, com.google.android.gms.internal.ads.zzeel zzeelVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzejd zzejdVar, com.google.android.gms.internal.ads.zzfqg zzfqgVar) {
        this.zzg = context;
        this.zzc = zzfkyVar;
        this.zza = zzeelVar;
        this.zzb = zzhcgVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzejdVar;
        this.zzf = zzfqgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegq
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        android.content.Context context = this.zzg;
        com.google.common.util.concurrent.ListenableFuture zza = this.zza.zza(zzcbdVar);
        com.google.android.gms.internal.ads.zzfpw zzn = com.google.android.gms.internal.ads.zzfpw.CC.zzn(context, 11);
        com.google.android.gms.internal.ads.zzfqf.zzb(zza, zzn);
        com.google.common.util.concurrent.ListenableFuture zzj = com.google.android.gms.internal.ads.zzhbw.zzj(zza, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzefj
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzefk.this.zzb((com.google.android.gms.internal.ads.zzegs) obj);
            }
        }, this.zzb);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgC)).booleanValue()) {
            zzj = com.google.android.gms.internal.ads.zzhbw.zzh(com.google.android.gms.internal.ads.zzhbw.zzi(zzj, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgD)).intValue(), java.util.concurrent.TimeUnit.SECONDS, this.zzd), java.util.concurrent.TimeoutException.class, com.google.android.gms.internal.ads.zzefi.zza, com.google.android.gms.internal.ads.zzcfr.zzh);
        }
        com.google.android.gms.internal.ads.zzfqf.zzd(zzj, this.zzf, zzn);
        com.google.android.gms.internal.ads.zzhbw.zzr(zzj, new com.google.android.gms.internal.ads.zzefh(this), com.google.android.gms.internal.ads.zzcfr.zzh);
        return zzj;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzegs zzegsVar) {
        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzfkq(new com.google.android.gms.internal.ads.zzfkn(this.zzc), com.google.android.gms.internal.ads.zzfkp.zza(new java.io.InputStreamReader(zzegsVar.zza()), zzegsVar.zzb().zzm)));
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzejd zzc() {
        return this.zze;
    }
}
