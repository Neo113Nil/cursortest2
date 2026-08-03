package com.google.android.gms.ads.rewarded;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class RewardedAdPreloader {
    private RewardedAdPreloader() {
    }

    public static boolean destroy(java.lang.String str) {
        com.google.android.gms.ads.internal.client.zzey zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzf(str);
    }

    public static void destroyAll() {
        com.google.android.gms.ads.internal.client.zzey zza = zza();
        if (zza != null) {
            zza.zzg();
        }
    }

    public static com.google.android.gms.ads.preload.PreloadConfiguration getConfiguration(java.lang.String str) {
        com.google.android.gms.ads.internal.client.zzey zza = zza();
        if (zza == null) {
            return null;
        }
        return zza.zzi(str);
    }

    public static java.util.Map<java.lang.String, com.google.android.gms.ads.preload.PreloadConfiguration> getConfigurations() {
        com.google.android.gms.ads.internal.client.zzey zza = zza();
        return zza == null ? new java.util.HashMap() : zza.zzh();
    }

    public static int getNumAdsAvailable(java.lang.String str) {
        com.google.android.gms.ads.internal.client.zzey zza = zza();
        if (zza == null) {
            return 0;
        }
        return zza.zze(str);
    }

    public static boolean isAdAvailable(java.lang.String str) {
        com.google.android.gms.ads.internal.client.zzey zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzd(str);
    }

    public static com.google.android.gms.ads.rewarded.RewardedAd pollAd(java.lang.String str) {
        com.google.android.gms.ads.internal.client.zzey zza = zza();
        if (zza == null) {
            return null;
        }
        return zza.zza(str);
    }

    public static boolean start(java.lang.String str, com.google.android.gms.ads.preload.PreloadConfiguration preloadConfiguration) {
        com.google.android.gms.ads.internal.client.zzey zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzc(str, preloadConfiguration);
    }

    private static com.google.android.gms.ads.internal.client.zzey zza() {
        com.google.android.gms.ads.internal.client.zzey zzeyVar = (com.google.android.gms.ads.internal.client.zzey) com.google.android.gms.ads.internal.client.zzeu.zzb().zza(com.google.android.gms.ads.AdFormat.REWARDED);
        if (zzeyVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.", null);
        }
        return zzeyVar;
    }

    public static boolean start(java.lang.String str, com.google.android.gms.ads.preload.PreloadConfiguration preloadConfiguration, com.google.android.gms.ads.preload.PreloadCallbackV2 preloadCallbackV2) {
        com.google.android.gms.ads.internal.client.zzey zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzb(str, preloadConfiguration, preloadCallbackV2);
    }
}
