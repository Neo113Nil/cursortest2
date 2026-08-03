package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzehx implements com.google.android.gms.internal.ads.zzfok {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzehx zza = new com.google.android.gms.internal.ads.zzehx();

    private /* synthetic */ zzehx() {
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    public final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
        com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
        return jSONObject;
    }
}
