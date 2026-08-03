package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfdu implements com.google.android.gms.internal.ads.zzfci {
    final java.lang.String zza;
    final int zzb;

    public zzfdu(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        int i;
        java.lang.String str = this.zza;
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        if (android.text.TextUtils.isEmpty(str) || (i = this.zzb) == -1) {
            return;
        }
        try {
            org.json.JSONObject zzh = com.google.android.gms.ads.internal.util.zzbp.zzh(jSONObject, "pii");
            zzh.put("pvid", str);
            zzh.put("pvid_s", i);
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting gms core app set ID info.", e);
        }
    }
}
