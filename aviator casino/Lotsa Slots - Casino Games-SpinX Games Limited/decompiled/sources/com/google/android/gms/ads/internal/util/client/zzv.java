package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzv {
    private final com.google.android.gms.ads.internal.util.client.zzx zza;

    public zzv() {
        this.zza = new com.google.android.gms.ads.internal.util.client.zzn(1, 0, 1.0d, false);
    }

    private zzv(com.google.android.gms.ads.internal.util.client.zzx zzxVar) {
        this.zza = zzxVar;
    }

    public static com.google.android.gms.ads.internal.util.client.zzv zzb(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("ping_strategy");
        return new com.google.android.gms.ads.internal.util.client.zzv(optJSONObject == null ? new com.google.android.gms.ads.internal.util.client.zzn(1, 0, 1.0d, false) : new com.google.android.gms.ads.internal.util.client.zzn(optJSONObject.optInt("max_attempts", 1), optJSONObject.optInt("initial_backoff_ms", 0), optJSONObject.optDouble("backoff_multiplier", 1.0d), optJSONObject.optBoolean("buffer_after_max_attempts", false)));
    }

    public final com.google.android.gms.ads.internal.util.client.zzx zza() {
        return this.zza;
    }
}
