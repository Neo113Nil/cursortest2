package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzenf implements com.google.android.gms.internal.ads.zzels {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdng zzb;
    private final java.util.concurrent.Executor zzc;
    private final com.google.android.gms.internal.ads.zzfke zzd;
    private final com.google.android.gms.internal.ads.zzdzl zze;

    public zzenf(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdng zzdngVar, com.google.android.gms.internal.ads.zzfke zzfkeVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = context;
        this.zzb = zzdngVar;
        this.zzc = executor;
        this.zzd = zzfkeVar;
        this.zze = zzdzlVar;
    }

    private static java.lang.String zze(com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        try {
            return zzfkfVar.zzv.getString("tab_url");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final boolean zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        android.content.Context context = this.zza;
        return (context instanceof android.app.Activity) && com.google.android.gms.internal.ads.zzbjr.zza(context) && !android.text.TextUtils.isEmpty(zze(zzfkfVar));
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final com.google.common.util.concurrent.ListenableFuture zzb(final com.google.android.gms.internal.ads.zzfkq zzfkqVar, final com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoC)).booleanValue()) {
            com.google.android.gms.internal.ads.zzdzk zza = this.zze.zza();
            zza.zzc("action", "cstm_tbs_rndr");
            zza.zzd();
        }
        java.lang.String zze = zze(zzfkfVar);
        final android.net.Uri parse = zze != null ? android.net.Uri.parse(zze) : null;
        final com.google.android.gms.internal.ads.zzfki zzfkiVar = zzfkqVar.zzb.zzb;
        return com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbw.zza(null), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzene
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzenf.this.zzc(parse, zzfkqVar, zzfkfVar, zzfkiVar, obj);
            }
        }, this.zzc);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(android.net.Uri uri, com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfki zzfkiVar, java.lang.Object obj) {
        try {
            androidx.browser.customtabs.CustomTabsIntent build = new androidx.browser.customtabs.CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(build.intent, null);
            com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
            com.google.android.gms.internal.ads.zzdma zzd = this.zzb.zzd(new com.google.android.gms.internal.ads.zzcyj(zzfkqVar, zzfkfVar, null), new com.google.android.gms.internal.ads.zzdmd(new com.google.android.gms.internal.ads.zzend(this, zzcfwVar, zzfkfVar), null));
            zzcfwVar.zzc(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(zzcVar, null, zzd.zzi(), null, new com.google.android.gms.ads.internal.util.client.VersionInfoParcel(0, 0, false), null, null, zzfkiVar.zzb));
            this.zzd.zzd();
            return com.google.android.gms.internal.ads.zzhbw.zza(zzd.zzh());
        } catch (java.lang.Throwable th) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdzl zzd() {
        return this.zze;
    }
}
