package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcmt {
    private androidx.webkit.Profile zza = null;

    zzcmt() {
    }

    public final void zza(android.webkit.WebView webView) {
        if (this.zza != null) {
            try {
                androidx.webkit.WebViewCompat.setProfile(webView, "GMA_WEBVIEW_PROFILE");
                com.google.android.gms.ads.internal.util.zze.zza("WebViewCompat Profile is defined");
            } catch (java.lang.IllegalStateException e) {
                java.lang.String concat = "WebViewCompat error: ".concat(e.toString());
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpy)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "WebViewCompat.setProfile");
                }
            }
        }
    }

    final void zzb(com.google.android.gms.internal.ads.zzcmx zzcmxVar) {
        androidx.webkit.ProfileStore profileStore;
        if (!androidx.webkit.WebViewFeature.isFeatureSupported("MULTI_PROFILE")) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (androidx.webkit.ProfileStore) com.google.android.gms.internal.ads.zzgar.zza("androidx.webkit.ProfileStore", com.unity3d.services.core.fid.Constants.GET_INSTANCE, new com.google.android.gms.internal.ads.zzgaq[0]);
        } catch (java.lang.ClassCastException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.IllegalStateException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            java.lang.String message = e.getMessage();
            java.lang.String.valueOf(message);
            java.lang.String valueOf = java.lang.String.valueOf(message);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(valueOf));
            try {
                profileStore = (androidx.webkit.ProfileStore) com.google.android.gms.internal.ads.zzgar.zza("androidx.webkit.ProfileStore$-CC", com.unity3d.services.core.fid.Constants.GET_INSTANCE, new com.google.android.gms.internal.ads.zzgaq[0]);
            } catch (java.lang.ClassCastException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.IllegalStateException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e2) {
                java.lang.String message2 = e2.getMessage();
                java.lang.String.valueOf(message2);
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(java.lang.String.valueOf(message2)));
                profileStore = null;
            }
        }
        if (profileStore != null) {
            this.zza = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpx)).booleanValue()) {
                long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzcmxVar.zza;
                com.google.android.gms.internal.ads.zzdzk zza = zzcmxVar.zzb.zzd().zza();
                zza.zzc("action", "webview_p_l");
                zza.zzc("webview_p_l", java.lang.Long.toString(elapsedRealtime));
                zza.zzd();
                return;
            }
            return;
        }
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("WebViewCompat failure: No instance");
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpx)).booleanValue()) {
            com.google.android.gms.internal.ads.zzdzk zza2 = zzcmxVar.zzb.zzd().zza();
            zza2.zzc("action", "webview_p_f");
            zza2.zzc("webview_p_f", "No instance");
            zza2.zzd();
        }
    }
}
