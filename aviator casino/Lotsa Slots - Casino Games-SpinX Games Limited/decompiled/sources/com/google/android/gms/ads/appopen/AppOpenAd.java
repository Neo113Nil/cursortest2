package com.google.android.gms.ads.appopen;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class AppOpenAd {

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
    public static abstract class AppOpenAdLoadCallback extends com.google.android.gms.ads.AdLoadCallback<com.google.android.gms.ads.appopen.AppOpenAd> {
    }

    @java.lang.Deprecated
    public static boolean isAdAvailable(android.content.Context context, java.lang.String str) {
        try {
            return com.google.android.gms.ads.zzb.zza(context).zzh(str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public static void load(final android.content.Context context, final java.lang.String str, final com.google.android.gms.ads.AdRequest adRequest, final com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zzd.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmD)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.appopen.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback2 = appOpenAdLoadCallback;
                        com.google.android.gms.ads.AdRequest adRequest2 = adRequest;
                        android.content.Context context2 = context;
                        try {
                            new com.google.android.gms.internal.ads.zzbgr(context2, str, adRequest2.zza(), appOpenAdLoadCallback2).zza();
                        } catch (java.lang.IllegalStateException e) {
                            com.google.android.gms.internal.ads.zzbzy.zza(context2).zzh(e, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new com.google.android.gms.internal.ads.zzbgr(context, str, adRequest.zza(), appOpenAdLoadCallback).zza();
    }

    @java.lang.Deprecated
    public static com.google.android.gms.ads.appopen.AppOpenAd pollAd(android.content.Context context, java.lang.String str) {
        try {
            com.google.android.gms.internal.ads.zzbgj zzi = com.google.android.gms.ads.zzb.zza(context).zzi(str);
            if (zzi != null) {
                return new com.google.android.gms.internal.ads.zzbgf(zzi, str);
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzl("Failed to obtain an App Open ad from the preloader.", null);
            return null;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    public abstract java.lang.String getAdUnitId();

    public abstract com.google.android.gms.ads.FullScreenContentCallback getFullScreenContentCallback();

    public abstract com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener();

    public abstract long getPlacementId();

    public abstract com.google.android.gms.ads.ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener);

    public abstract void setPlacementId(long j);

    public abstract void show(android.app.Activity activity);
}
