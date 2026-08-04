package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzbem {
    public static final zzbdi zza = zzbdi.zzd("gads:trustless_token_for_decagon:enabled", true);
    public static final zzbdi zzb;

    static {
        zzbdi.zzd("gads:invalidate_token_at_refresh_start", true);
        zzbdi.zzd("gms:expose_token_for_gma:enabled", true);
        zzbdi.zzd("gads:referesh_rate_limit", false);
        zzb = zzbdi.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzbdi.zzd("gads:token_anonymization:enabled", true);
        zzbdi.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}
