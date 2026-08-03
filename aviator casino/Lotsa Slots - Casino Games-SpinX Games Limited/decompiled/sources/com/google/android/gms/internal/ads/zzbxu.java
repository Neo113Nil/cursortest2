package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbxu implements com.google.android.gms.ads.mediation.MediationInterstitialAdapter {
    private android.app.Activity zza;
    private com.google.android.gms.ads.mediation.MediationInterstitialListener zzb;
    private android.net.Uri zzc;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(android.content.Context context, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener, android.os.Bundle bundle, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, android.os.Bundle bundle2) {
        this.zzb = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
            return;
        }
        if (!com.google.android.gms.internal.ads.zzbjr.zza(context)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Default browser does not support custom tabs. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
            return;
        }
        java.lang.String string = bundle.getString("tab_url");
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
        } else {
            this.zza = (android.app.Activity) context;
            this.zzc = android.net.Uri.parse(string);
            this.zzb.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        androidx.browser.customtabs.CustomTabsIntent build = new androidx.browser.customtabs.CustomTabsIntent.Builder().build();
        build.intent.setData(this.zzc);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzbxt(this, new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.zzc(build.intent, null), null, new com.google.android.gms.internal.ads.zzbxs(this), null, new com.google.android.gms.ads.internal.util.client.VersionInfoParcel(0, 0, false), null, null, "")));
        com.google.android.gms.ads.internal.zzt.zzh().zzd();
    }

    final /* synthetic */ android.app.Activity zza() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.ads.mediation.MediationInterstitialListener zzb() {
        return this.zzb;
    }
}
