package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeff {
    private final java.util.concurrent.ScheduledExecutorService zza;
    private final com.google.android.gms.internal.ads.zzhcg zzb;
    private final com.google.android.gms.internal.ads.zzhcg zzc;
    private final com.google.android.gms.internal.ads.zzege zzd;
    private final com.google.android.gms.internal.ads.zzimo zze;

    public zzeff(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar2, com.google.android.gms.internal.ads.zzege zzegeVar, com.google.android.gms.internal.ads.zzimo zzimoVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzhcgVar;
        this.zzc = zzhcgVar2;
        this.zzd = zzegeVar;
        this.zze = zzimoVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(final com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        com.google.common.util.concurrent.ListenableFuture zzc;
        java.lang.String str = zzcbdVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(str)) {
            zzc = com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzegr(1));
        } else {
            zzc = (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzix)).booleanValue() || ((java.lang.Boolean) com.google.android.gms.internal.ads.zzblb.zza.zze()).booleanValue()) ? this.zzc.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzefc
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return com.google.android.gms.internal.ads.zzeff.this.zzc(zzcbdVar);
                }
            }) : this.zzd.zza(zzcbdVar);
        }
        final int callingUid = android.os.Binder.getCallingUid();
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzh((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzi(com.google.android.gms.internal.ads.zzhbo.zzw(zzc), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgD)).intValue(), java.util.concurrent.TimeUnit.SECONDS, this.zza), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzefe
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzeff.this.zzb(zzcbdVar, callingUid, (java.lang.Throwable) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(final com.google.android.gms.internal.ads.zzcbd zzcbdVar, int i, java.lang.Throwable th) {
        android.os.Bundle bundle;
        if (zzcbdVar != null && (bundle = zzcbdVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return com.google.android.gms.internal.ads.zzhbw.zzj(((com.google.android.gms.internal.ads.zzeii) this.zze.zzb()).zzk(zzcbdVar, i), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzefd
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzegs((java.io.InputStream) obj, com.google.android.gms.internal.ads.zzcbd.this));
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.android.gms.internal.ads.zzegs zzc(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        return (com.google.android.gms.internal.ads.zzegs) this.zzd.zza(zzcbdVar).get(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgD)).intValue(), java.util.concurrent.TimeUnit.SECONDS);
    }
}
