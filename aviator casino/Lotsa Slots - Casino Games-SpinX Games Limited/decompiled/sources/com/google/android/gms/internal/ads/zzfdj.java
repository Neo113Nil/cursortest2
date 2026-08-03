package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfdj implements com.google.android.gms.internal.ads.zzfck {
    private final android.content.Context zza;
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private final java.util.concurrent.Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final com.google.android.gms.internal.ads.zzcev zzg;

    zzfdj(com.google.android.gms.internal.ads.zzcev zzcevVar, android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.util.concurrent.Executor executor, int i, boolean z, boolean z2) {
        this.zzg = zzcevVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        com.google.android.gms.internal.ads.zzhbo zzw = com.google.android.gms.internal.ads.zzhbo.zzw(this.zzg.zza(this.zza, this.zzd));
        com.google.android.gms.internal.ads.zzgta zzgtaVar = new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzfdi
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzfdj.this.zzc((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) obj);
            }
        };
        java.util.concurrent.Executor executor = this.zzc;
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzi((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzk(zzw, zzgtaVar, executor), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbH)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzb), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzfdh
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzfdj.this.zzd((java.lang.Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 40;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzec)).booleanValue() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeb)).booleanValue() == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ com.google.android.gms.internal.ads.zzfdk zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info) {
        com.google.android.gms.internal.ads.zzgcg zzgcgVar = new com.google.android.gms.internal.ads.zzgcg();
        if (this.zze) {
        }
        try {
            android.content.Context context = this.zza;
            zzgcgVar = com.google.android.gms.internal.ads.zzgck.zzh(context).zzj((java.lang.String) java.util.Objects.requireNonNull(((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) java.util.Objects.requireNonNull(info)).getId()), context.getPackageName(), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeh)).longValue(), this.zzf);
        } catch (java.io.IOException | java.lang.IllegalArgumentException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdIdInfoSignalSource.getPaidV1");
            zzgcgVar = new com.google.android.gms.internal.ads.zzgcg();
        }
        return new com.google.android.gms.internal.ads.zzfdk(info, null, zzgcgVar);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfdk zzd(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        android.content.ContentResolver contentResolver = this.zza.getContentResolver();
        return new com.google.android.gms.internal.ads.zzfdk(null, contentResolver == null ? null : android.provider.Settings.Secure.getString(contentResolver, "android_id"), new com.google.android.gms.internal.ads.zzgcg());
    }
}
