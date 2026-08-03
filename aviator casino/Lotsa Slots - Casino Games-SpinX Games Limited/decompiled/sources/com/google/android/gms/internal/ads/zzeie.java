package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzeie implements com.google.android.gms.internal.ads.zzbub {
    zzeie() {
    }

    @Override // com.google.android.gms.internal.ads.zzbub
    public final /* bridge */ /* synthetic */ org.json.JSONObject zzb(java.lang.Object obj) throws org.json.JSONException {
        com.google.android.gms.internal.ads.zzeif zzeifVar = (com.google.android.gms.internal.ads.zzeif) obj;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkH)).booleanValue()) {
            com.google.android.gms.internal.ads.zzcbf zzcbfVar = zzeifVar.zzc;
            jSONObject2.put("ad_request_url", zzcbfVar.zze());
            jSONObject2.put("ad_request_post_body", zzcbfVar.zzd());
        }
        com.google.android.gms.internal.ads.zzcbf zzcbfVar2 = zzeifVar.zzc;
        jSONObject2.put("base_url", zzcbfVar2.zzc());
        jSONObject2.put("signals", zzeifVar.zzb);
        com.google.android.gms.internal.ads.zzeil zzeilVar = zzeifVar.zza;
        jSONObject3.put("body", zzeilVar.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzay.zza().zzm(zzeilVar.zzb));
        jSONObject3.put("response_code", zzeilVar.zza);
        jSONObject3.put("latency", zzeilVar.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put(com.ironsource.Ve.n, jSONObject3);
        jSONObject.put("flags", zzcbfVar2.zzh());
        return jSONObject;
    }
}
