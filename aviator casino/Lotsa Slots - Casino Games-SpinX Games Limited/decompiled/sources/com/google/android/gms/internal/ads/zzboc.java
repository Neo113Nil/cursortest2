package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzboc implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.ads.admanager.AdManagerAdView zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbu zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbod zzc;

    zzboc(com.google.android.gms.internal.ads.zzbod zzbodVar, com.google.android.gms.ads.admanager.AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        this.zza = adManagerAdView;
        this.zzb = zzbuVar;
        java.util.Objects.requireNonNull(zzbodVar);
        this.zzc = zzbodVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.admanager.AdManagerAdView adManagerAdView = this.zza;
        if (adManagerAdView.zza(this.zzb)) {
            this.zzc.zzc().onAdManagerAdViewLoaded(adManagerAdView);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not bind.");
        }
    }
}
