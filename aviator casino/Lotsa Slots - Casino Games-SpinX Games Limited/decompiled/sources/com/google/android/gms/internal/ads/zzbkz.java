package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbkz {
    public static final com.google.android.gms.internal.ads.zzbka zza = com.google.android.gms.internal.ads.zzbka.zzb("gads:dynamite_load:fail:sample_rate", 10000);
    public static final com.google.android.gms.internal.ads.zzbka zzb = com.google.android.gms.internal.ads.zzbka.zza("gads:report_dynamite_crash_in_background_thread", false);
    public static final com.google.android.gms.internal.ads.zzbka zzc = new com.google.android.gms.internal.ads.zzbka("gads:public_beta:traffic_multiplier", "1.0", 4);
    public static final com.google.android.gms.internal.ads.zzbka zzd = new com.google.android.gms.internal.ads.zzbka("gads:sdk_crash_report_class_prefix", "com.google.", 4);
    public static final com.google.android.gms.internal.ads.zzbka zze;
    public static final com.google.android.gms.internal.ads.zzbka zzf;

    static {
        com.google.android.gms.internal.ads.zzbka.zza("gads:sdk_crash_report_enabled", false);
        zze = com.google.android.gms.internal.ads.zzbka.zza("gads:sdk_crash_report_full_stacktrace", false);
        zzf = com.google.android.gms.internal.ads.zzbka.zzc("gads:trapped_exception_sample_rate", 0.01d);
    }
}
