package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbzh {
    public final boolean zza;
    public final java.lang.String zzb;
    public final boolean zzc;

    public zzbzh(boolean z, java.lang.String str, boolean z2) {
        this.zza = z;
        this.zzb = str;
        this.zzc = z2;
    }

    public static com.google.android.gms.internal.ads.zzbzh zza(org.json.JSONObject jSONObject) {
        return new com.google.android.gms.internal.ads.zzbzh(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
