package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzbsu {
    public final boolean zza;
    public final String zzb;
    public final boolean zzc;

    public zzbsu(boolean z4, String str, boolean z7) {
        this.zza = z4;
        this.zzb = str;
        this.zzc = z7;
    }

    public static zzbsu zza(JSONObject jSONObject) {
        return new zzbsu(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
