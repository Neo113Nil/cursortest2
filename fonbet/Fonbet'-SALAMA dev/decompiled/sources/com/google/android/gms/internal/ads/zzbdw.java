package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbdw {
    public static final zzbdi zza = zzbdi.zzd("gads:init:init_on_bg_thread", true);
    public static final zzbdi zzb = zzbdi.zzd("gads:init:init_on_single_bg_thread", false);
    public static final zzbdi zzc = zzbdi.zzd("gads:adloader_load_bg_thread", true);
    public static final zzbdi zzd = zzbdi.zzd("gads:appopen_load_on_bg_thread", true);
    public static final zzbdi zze = zzbdi.zzd("gads:banner_destroy_bg_thread", false);
    public static final zzbdi zzf = zzbdi.zzd("gads:banner_load_bg_thread", true);
    public static final zzbdi zzg = zzbdi.zzd("gads:banner_pause_bg_thread", false);
    public static final zzbdi zzh = zzbdi.zzd("gads:banner_resume_bg_thread", false);
    public static final zzbdi zzi = zzbdi.zzd("gads:interstitial_load_on_bg_thread", true);
    public static final zzbdi zzj;
    public static final zzbdi zzk;

    static {
        zzbdi.zzd("gads:persist_flags_on_bg_thread", true);
        zzj = zzbdi.zzd("gads:query_info_bg_thread", true);
        zzk = zzbdi.zzd("gads:rewarded_load_bg_thread", true);
    }
}
