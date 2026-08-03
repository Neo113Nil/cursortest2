package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public class MobileAds {
    public static final java.lang.String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(android.content.Context context) {
        com.google.android.gms.ads.internal.client.zzeu.zzb().zzm(context);
    }

    public static com.google.android.gms.ads.initialization.InitializationStatus getInitializationStatus() {
        return com.google.android.gms.ads.internal.client.zzeu.zzb().zzl();
    }

    private static java.lang.String getInternalVersion() {
        return com.google.android.gms.ads.internal.client.zzeu.zzb().zzo();
    }

    public static com.google.android.gms.ads.RequestConfiguration getRequestConfiguration() {
        return com.google.android.gms.ads.internal.client.zzeu.zzb().zzp();
    }

    public static com.google.android.gms.ads.VersionInfo getVersion() {
        com.google.android.gms.ads.internal.client.zzeu.zzb();
        java.lang.String[] split = android.text.TextUtils.split("25.2.0", "\\.");
        if (split.length != 3) {
            return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
        }
        try {
            return new com.google.android.gms.ads.VersionInfo(java.lang.Integer.parseInt(split[0]), java.lang.Integer.parseInt(split[1]), java.lang.Integer.parseInt(split[2]));
        } catch (java.lang.NumberFormatException unused) {
            return new com.google.android.gms.ads.VersionInfo(0, 0, 0);
        }
    }

    public static void initialize(android.content.Context context) {
        com.google.android.gms.ads.internal.client.zzeu.zzb().zzc(context, null, null);
    }

    public static void openAdInspector(android.content.Context context, com.google.android.gms.ads.OnAdInspectorClosedListener onAdInspectorClosedListener) {
        com.google.android.gms.ads.internal.client.zzeu.zzb().zzn(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(android.content.Context context, java.lang.String str) {
        com.google.android.gms.ads.internal.client.zzeu.zzb().zzj(context, str);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z) {
        return com.google.android.gms.ads.internal.client.zzeu.zzb().zzr(z);
    }

    public static androidx.browser.customtabs.CustomTabsSession registerCustomTabsSession(android.content.Context context, androidx.browser.customtabs.CustomTabsClient customTabsClient, java.lang.String str, androidx.browser.customtabs.CustomTabsCallback customTabsCallback) {
        com.google.android.gms.ads.internal.client.zzeu.zzb();
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzcem zza = com.google.android.gms.internal.ads.zzbzs.zza(context);
        if (zza == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (androidx.browser.customtabs.CustomTabsSession) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zza.zzm(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), com.google.android.gms.dynamic.ObjectWrapper.wrap(customTabsClient), str, com.google.android.gms.dynamic.ObjectWrapper.wrap(customTabsCallback)));
        } catch (android.os.RemoteException | java.lang.IllegalArgumentException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to register custom tabs session. Error: ", e);
            return null;
        }
    }

    public static void registerRtbAdapter(java.lang.Class<? extends com.google.android.gms.ads.mediation.rtb.RtbAdapter> cls) {
        com.google.android.gms.ads.internal.client.zzeu.zzb().zzk(cls);
    }

    public static void registerWebView(android.webkit.WebView webView) {
        com.google.android.gms.ads.internal.client.zzeu.zzb();
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (webView == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("The webview to be registered cannot be null.");
            return;
        }
        com.google.android.gms.internal.ads.zzcem zza = com.google.android.gms.internal.ads.zzbzs.zza(webView.getContext());
        if (zza == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Internal error, query info generator is null.");
            return;
        }
        try {
            zza.zzj(com.google.android.gms.dynamic.ObjectWrapper.wrap(webView));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    public static void setAppMuted(boolean z) {
        com.google.android.gms.ads.internal.client.zzeu.zzb().zzh(z);
    }

    public static void setAppVolume(float f) {
        com.google.android.gms.ads.internal.client.zzeu.zzb().zzf(f);
    }

    private static void setPlugin(java.lang.String str) {
        com.google.android.gms.ads.internal.client.zzeu.zzb().zzs(str);
    }

    public static void setRequestConfiguration(com.google.android.gms.ads.RequestConfiguration requestConfiguration) {
        com.google.android.gms.ads.internal.client.zzeu.zzb().zzq(requestConfiguration);
    }

    @java.lang.Deprecated
    public static void startPreload(android.content.Context context, java.util.List<com.google.android.gms.ads.preload.PreloadConfiguration> list, com.google.android.gms.ads.preload.PreloadCallback preloadCallback) {
        com.google.android.gms.ads.internal.client.zzeu.zzb().zze(context, list, preloadCallback);
    }

    private static void stop() {
        com.google.android.gms.ads.internal.client.zzeu.zzb().zzd();
    }

    public static void initialize(android.content.Context context, com.google.android.gms.ads.initialization.OnInitializationCompleteListener onInitializationCompleteListener) {
        com.google.android.gms.ads.internal.client.zzeu.zzb().zzc(context, null, onInitializationCompleteListener);
    }
}
