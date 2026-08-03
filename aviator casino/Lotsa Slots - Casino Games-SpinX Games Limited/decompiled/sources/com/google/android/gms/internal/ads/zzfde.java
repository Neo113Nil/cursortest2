package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfde implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzhcg zzc;
    private final java.util.concurrent.ScheduledExecutorService zzd;
    private final com.google.android.gms.internal.ads.zzelq zze;
    private final com.google.android.gms.internal.ads.zzfky zzf;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzg;

    zzfde(com.google.android.gms.ads.internal.util.zzg zzgVar, android.content.Context context, com.google.android.gms.internal.ads.zzhcg zzhcgVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzelq zzelqVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzhcgVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzelqVar;
        this.zzf = zzfkyVar;
        this.zzg = versionInfoParcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r5.zzf.zzd.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L10;
     */
    @Override // com.google.android.gms.internal.ads.zzfck
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        com.google.common.util.concurrent.ListenableFuture zzc;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlP)).booleanValue() && this.zza.zzz()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlT)).booleanValue()) {
            }
            if (this.zzg.clientJarVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlN)).intValue()) {
                if (android.os.Build.VERSION.SDK_INT >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlO)).intValue()) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlL)).booleanValue()) {
                        java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlM);
                        if (!android.text.TextUtils.isEmpty(str)) {
                        }
                    }
                    try {
                        zzc = com.google.android.gms.internal.ads.zzhbw.zzi(this.zze.zza(false), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlR)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzd);
                    } catch (java.lang.Exception e) {
                        zzc = com.google.android.gms.internal.ads.zzhbw.zzc(e);
                    }
                    com.google.android.gms.internal.ads.zzhcg zzhcgVar = this.zzc;
                    return com.google.android.gms.internal.ads.zzhbw.zzi((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzh((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbo.zzw(zzc), com.google.android.gms.internal.ads.zzfdd.zza, zzhcgVar), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzfdb
                        @Override // com.google.android.gms.internal.ads.zzhbe
                        public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                            return com.google.android.gms.internal.ads.zzfde.this.zzc((java.lang.Throwable) obj);
                        }
                    }, zzhcgVar), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlR)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzd);
                }
            }
        }
        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzfdf("", -1, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 56;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(final java.lang.Throwable th) {
        this.zzc.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfdc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean booleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlQ)).booleanValue();
                java.lang.Throwable th2 = th;
                if (booleanValue) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzi(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return com.google.android.gms.internal.ads.zzhbw.zza(th instanceof java.lang.SecurityException ? new com.google.android.gms.internal.ads.zzfdf("", 2, null) : th instanceof java.lang.IllegalStateException ? new com.google.android.gms.internal.ads.zzfdf("", 3, null) : th instanceof java.lang.IllegalArgumentException ? new com.google.android.gms.internal.ads.zzfdf("", 4, null) : th instanceof java.util.concurrent.TimeoutException ? new com.google.android.gms.internal.ads.zzfdf("", 5, null) : new com.google.android.gms.internal.ads.zzfdf("", 0, null));
    }
}
