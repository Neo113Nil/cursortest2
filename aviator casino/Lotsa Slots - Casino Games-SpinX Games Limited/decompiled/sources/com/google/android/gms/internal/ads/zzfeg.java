package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfeg implements com.google.android.gms.internal.ads.zzfci {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    public zzfeg(java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        try {
            org.json.JSONObject zzh = com.google.android.gms.ads.internal.util.zzbp.zzh((org.json.JSONObject) obj, "pii");
            zzh.put("doritos", this.zza);
            zzh.put("doritos_v2", this.zzb);
        } catch (org.json.JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting doritos string.");
        }
    }
}
