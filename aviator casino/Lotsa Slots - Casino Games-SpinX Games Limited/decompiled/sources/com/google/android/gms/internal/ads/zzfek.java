package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfek implements com.google.android.gms.internal.ads.zzfci {
    private final java.util.List zza;

    public zzfek(java.util.List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        try {
            ((org.json.JSONObject) obj).put("eid", android.text.TextUtils.join(",", this.zza));
        } catch (org.json.JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting experiment ids.");
        }
    }
}
