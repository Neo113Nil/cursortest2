package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzexf implements com.google.android.gms.internal.ads.zzfci {

    @javax.annotation.Nullable
    private final org.json.JSONObject zza;

    @javax.annotation.Nullable
    private final org.json.JSONObject zzb;

    public zzexf(@javax.annotation.Nullable org.json.JSONObject jSONObject, @javax.annotation.Nullable org.json.JSONObject jSONObject2) {
        this.zza = jSONObject;
        this.zzb = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        org.json.JSONObject jSONObject = this.zza;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        org.json.JSONObject jSONObject2 = this.zzb;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
