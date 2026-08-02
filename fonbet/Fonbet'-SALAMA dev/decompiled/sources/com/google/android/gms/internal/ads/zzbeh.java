package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbeh {
    public static final zzbdi zza = zzbdi.zzb("gads:dynamite_load:fail:sample_rate", 10000);
    public static final zzbdi zzb = zzbdi.zzd("gads:report_dynamite_crash_in_background_thread", false);
    public static final zzbdi zzc = new zzbdi("gads:public_beta:traffic_multiplier", "1.0", 4);
    public static final zzbdi zzd = new zzbdi("gads:sdk_crash_report_class_prefix", "com.google.", 4);
    public static final zzbdi zze;
    public static final zzbdi zzf;

    static {
        zzbdi.zzd("gads:sdk_crash_report_enabled", false);
        zze = zzbdi.zzd("gads:sdk_crash_report_full_stacktrace", false);
        zzf = zzbdi.zza("gads:trapped_exception_sample_rate", 0.01d);
    }
}
