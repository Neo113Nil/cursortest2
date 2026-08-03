package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzex {
    private final java.lang.String zza;
    private final android.os.Bundle zzb;
    private final java.lang.String zzc;

    public zzex(java.lang.String str, android.os.Bundle bundle, java.lang.String str2) {
        this.zza = str;
        this.zzb = bundle;
        this.zzc = str2;
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final java.lang.String zzb() {
        java.lang.String str = this.zzc;
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                return new org.json.JSONObject(str).optString("request_id", "");
            } catch (org.json.JSONException unused) {
            }
        }
        return "";
    }

    public final android.os.Bundle zzc() {
        return this.zzb;
    }
}
