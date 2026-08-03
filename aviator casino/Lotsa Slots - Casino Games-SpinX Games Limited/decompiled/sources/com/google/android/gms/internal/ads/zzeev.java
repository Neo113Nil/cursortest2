package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeev implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;

    private zzeev(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
    }

    public static com.google.android.gms.internal.ads.zzeev zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        return new com.google.android.gms.internal.ads.zzeev(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzfpk zzfpkVar = (com.google.android.gms.internal.ads.zzfpk) this.zza.zzb();
        final android.webkit.CookieManager zza = com.google.android.gms.ads.internal.zzt.zzf().zza((android.content.Context) this.zzb.zzb());
        com.google.android.gms.internal.ads.zzfpe zzfpeVar = com.google.android.gms.internal.ads.zzfpe.WEBVIEW_COOKIE;
        java.util.Objects.requireNonNull(zzfpkVar);
        return com.google.android.gms.internal.ads.zzfov.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeeq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                android.webkit.CookieManager cookieManager = zza;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbz));
            }
        }, zzfpeVar, zzfpkVar).zzh(1L, java.util.concurrent.TimeUnit.SECONDS).zzf(java.lang.Exception.class, com.google.android.gms.internal.ads.zzeen.zza).zzi();
    }
}
