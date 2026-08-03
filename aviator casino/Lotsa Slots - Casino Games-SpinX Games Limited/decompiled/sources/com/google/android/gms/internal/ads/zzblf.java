package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzblf {
    public static final com.google.android.gms.internal.ads.zzbka zza = com.google.android.gms.internal.ads.zzbka.zza("gads:trustless_token_for_decagon:enabled", true);
    public static final com.google.android.gms.internal.ads.zzbka zzb;

    static {
        com.google.android.gms.internal.ads.zzbka.zza("gads:invalidate_token_at_refresh_start", true);
        com.google.android.gms.internal.ads.zzbka.zza("gms:expose_token_for_gma:enabled", true);
        com.google.android.gms.internal.ads.zzbka.zza("gads:referesh_rate_limit", false);
        zzb = com.google.android.gms.internal.ads.zzbka.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        com.google.android.gms.internal.ads.zzbka.zza("gads:token_anonymization:enabled", true);
        com.google.android.gms.internal.ads.zzbka.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}
