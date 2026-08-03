package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbij {
    public static final android.content.SharedPreferences zza(android.content.Context context) {
        try {
            return context.getSharedPreferences("google_adapter_flags", 0);
        } catch (java.lang.IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
            return null;
        }
    }

    public static final android.content.SharedPreferences zzb(android.content.Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (java.lang.IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
            return null;
        }
    }
}
