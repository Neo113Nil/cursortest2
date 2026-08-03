package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzc {
    public static com.google.android.gms.ads.AdSize zza(int i, int i2, java.lang.String str) {
        return new com.google.android.gms.ads.AdSize(i, i2, str);
    }

    public static com.google.android.gms.ads.AdSize zzb(int i, int i2) {
        com.google.android.gms.ads.AdSize adSize = new com.google.android.gms.ads.AdSize(i, i2);
        adSize.zzd(true);
        adSize.zze(i2);
        return adSize;
    }

    public static com.google.android.gms.ads.AdSize zzc(int i, int i2) {
        com.google.android.gms.ads.AdSize adSize = new com.google.android.gms.ads.AdSize(i, i2);
        adSize.zzh(true);
        adSize.zzj(i2);
        return adSize;
    }

    public static boolean zzd(com.google.android.gms.ads.AdSize adSize) {
        return adSize.zzg();
    }

    public static int zze(com.google.android.gms.ads.AdSize adSize) {
        return adSize.zzi();
    }

    public static boolean zzf(com.google.android.gms.ads.AdSize adSize) {
        return adSize.zza();
    }

    public static boolean zzg(com.google.android.gms.ads.AdSize adSize) {
        return adSize.zzc();
    }

    public static int zzh(com.google.android.gms.ads.AdSize adSize) {
        return adSize.zzf();
    }

    public static boolean zzi(com.google.android.gms.ads.AdSize adSize) {
        return adSize.zzb();
    }
}
