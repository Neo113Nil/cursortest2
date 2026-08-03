package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcng {
    private java.lang.String zza;
    private com.google.android.gms.internal.ads.zziht zzb;
    private com.google.android.gms.internal.ads.zzilq zzc;
    private final java.util.concurrent.ScheduledExecutorService zzd;
    private final java.util.concurrent.atomic.AtomicBoolean zze = new java.util.concurrent.atomic.AtomicBoolean(false);

    zzcng(com.google.android.gms.internal.ads.zzcmt zzcmtVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zzd = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        try {
            java.lang.String variationsHeader = androidx.webkit.WebViewFeature.isFeatureSupported("GET_VARIATIONS_HEADER") ? androidx.webkit.WebViewCompat.getVariationsHeader() : null;
            if (variationsHeader != null && !variationsHeader.isEmpty()) {
                this.zza = variationsHeader;
                byte[] decode = android.util.Base64.decode(variationsHeader, 10);
                this.zzb = com.google.android.gms.internal.ads.zziht.zzc(decode, com.google.android.gms.internal.ads.zzido.zzb());
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzki)).booleanValue()) {
                    this.zzc = com.google.android.gms.internal.ads.zzilq.zzc(decode, com.google.android.gms.internal.ads.zzido.zzb());
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkg)).booleanValue()) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkf)).booleanValue()) {
                        this.zzd.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcnf
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                com.google.android.gms.internal.ads.zzcng.this.zze();
                            }
                        }, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkh)).intValue(), java.util.concurrent.TimeUnit.MINUTES);
                    }
                }
            }
        } catch (com.google.android.gms.internal.ads.zziet | java.lang.IllegalArgumentException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ChromeVariations");
        }
    }

    public final void zza() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkf)).booleanValue() && !this.zze.getAndSet(true)) {
            zze();
        }
    }

    public final java.lang.String zzb() {
        com.google.android.gms.internal.ads.zzilq zzilqVar = this.zzc;
        if (zzilqVar != null) {
            return android.util.Base64.encodeToString(zzilqVar.zzaN(), 10);
        }
        return null;
    }

    public final java.lang.String zzc() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zziht zzd() {
        return this.zzb;
    }
}
