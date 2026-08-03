package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeel {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final com.google.android.gms.internal.ads.zzhcg zzb;
    private final com.google.android.gms.internal.ads.zzefv zzc;
    private final com.google.android.gms.internal.ads.zzimo zzd;

    public zzeel(com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar2, com.google.android.gms.internal.ads.zzefv zzefvVar, com.google.android.gms.internal.ads.zzimo zzimoVar) {
        this.zza = zzhcgVar;
        this.zzb = zzhcgVar2;
        this.zzc = zzefvVar;
        this.zzd = zzimoVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(final com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        com.google.common.util.concurrent.ListenableFuture zzh;
        java.lang.String str = zzcbdVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(str)) {
            zzh = com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzegr(1));
        } else {
            zzh = com.google.android.gms.internal.ads.zzhbw.zzh(this.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeek
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return com.google.android.gms.internal.ads.zzeel.this.zzb(zzcbdVar);
                }
            }), java.util.concurrent.ExecutionException.class, com.google.android.gms.internal.ads.zzeeh.zza, this.zzb);
        }
        final int callingUid = android.os.Binder.getCallingUid();
        return com.google.android.gms.internal.ads.zzhbw.zzh(zzh, com.google.android.gms.internal.ads.zzegr.class, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzeei
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzeel.this.zzc(zzcbdVar, callingUid, (com.google.android.gms.internal.ads.zzegr) obj);
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.android.gms.internal.ads.zzegs zzb(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        return (com.google.android.gms.internal.ads.zzegs) this.zzc.zza(zzcbdVar).get(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgD)).intValue(), java.util.concurrent.TimeUnit.SECONDS);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(final com.google.android.gms.internal.ads.zzcbd zzcbdVar, int i, com.google.android.gms.internal.ads.zzegr zzegrVar) {
        android.os.Bundle bundle;
        if (zzcbdVar != null && (bundle = zzcbdVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return com.google.android.gms.internal.ads.zzhbw.zzj(((com.google.android.gms.internal.ads.zzeii) this.zzd.zzb()).zzb(zzcbdVar, i), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzeej
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzegs((java.io.InputStream) obj, com.google.android.gms.internal.ads.zzcbd.this));
            }
        }, this.zzb);
    }
}
