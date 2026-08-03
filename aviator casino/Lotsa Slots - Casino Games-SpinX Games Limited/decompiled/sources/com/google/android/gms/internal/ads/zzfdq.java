package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfdq implements com.google.android.gms.internal.ads.zzfci {
    private final java.lang.String zza;

    public zzfdq(java.lang.String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        try {
            ((org.json.JSONObject) obj).put("ms", this.zza);
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
