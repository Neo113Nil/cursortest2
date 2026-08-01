package com.google.android.gms.ads.interstitial;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class InterstitialAdPreloader {
    private InterstitialAdPreloader() {
    }

    public static boolean destroy(String str) {
        zzem zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzf(str);
    }

    public static void destroyAll() {
        zzem zza = zza();
        if (zza != null) {
            zza.zzg();
        }
    }

    public static PreloadConfiguration getConfiguration(String str) {
        zzem zza = zza();
        if (zza == null) {
            return null;
        }
        return zza.zzi(str);
    }

    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzem zza = zza();
        return zza == null ? new HashMap() : zza.zzh();
    }

    public static int getNumAdsAvailable(String str) {
        zzem zza = zza();
        if (zza == null) {
            return 0;
        }
        return zza.zze(str);
    }

    public static boolean isAdAvailable(String str) {
        zzem zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzd(str);
    }

    public static InterstitialAd pollAd(String str) {
        zzem zza = zza();
        if (zza == null) {
            return null;
        }
        return zza.zza(str);
    }

    public static boolean start(String str, PreloadConfiguration preloadConfiguration) {
        zzem zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzc(str, preloadConfiguration);
    }

    private static zzem zza() {
        zzem zzemVar = (zzem) zzeu.zzb().zza(AdFormat.INTERSTITIAL);
        if (zzemVar == null) {
            zzo.zzi("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.");
        }
        return zzemVar;
    }

    public static boolean start(String str, PreloadConfiguration preloadConfiguration, PreloadCallbackV2 preloadCallbackV2) {
        zzem zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzb(str, preloadConfiguration, preloadCallbackV2);
    }
}
