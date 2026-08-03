package com.google.android.gms.ads.admanager;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class AdManagerInterstitialAd extends com.google.android.gms.ads.interstitial.InterstitialAd {
    public static void load(final android.content.Context context, final java.lang.String str, final com.google.android.gms.ads.admanager.AdManagerAdRequest adManagerAdRequest, final com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zzi.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmD)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.admanager.zzb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback2 = adManagerInterstitialAdLoadCallback;
                        com.google.android.gms.ads.admanager.AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        android.content.Context context2 = context;
                        try {
                            new com.google.android.gms.internal.ads.zzbsl(context2, str).zza(adManagerAdRequest2.zza(), adManagerInterstitialAdLoadCallback2);
                        } catch (java.lang.IllegalStateException e) {
                            com.google.android.gms.internal.ads.zzbzy.zza(context2).zzh(e, "AdManagerInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new com.google.android.gms.internal.ads.zzbsl(context, str).zza(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    public abstract com.google.android.gms.ads.admanager.AppEventListener getAppEventListener();

    public abstract void setAppEventListener(com.google.android.gms.ads.admanager.AppEventListener appEventListener);
}
