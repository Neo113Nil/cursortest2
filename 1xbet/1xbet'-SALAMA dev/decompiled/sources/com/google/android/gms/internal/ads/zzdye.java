package com.google.android.gms.internal.ads;

import F2.C0252s;
import F2.C0254t;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class zzdye implements zzbnj {
    @Override // com.google.android.gms.internal.ads.zzbnj
    public final JSONObject zzb(Object obj) throws JSONException {
        zzdyf zzdyfVar = (zzdyf) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjn)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzdyfVar.zzd.zzg());
            jSONObject2.put("ad_request_post_body", zzdyfVar.zzd.zzf());
        }
        jSONObject2.put("base_url", zzdyfVar.zzd.zzd());
        jSONObject2.put("signals", zzdyfVar.zzc);
        jSONObject3.put(SentryLogEvent.JsonKeys.BODY, zzdyfVar.zzb.zzc);
        jSONObject3.put("headers", C0252s.f2717f.f2718a.k(zzdyfVar.zzb.zzb));
        jSONObject3.put("response_code", zzdyfVar.zzb.zza);
        jSONObject3.put("latency", zzdyfVar.zzb.zzd);
        jSONObject.put(SentryBaseEvent.JsonKeys.REQUEST, jSONObject2);
        jSONObject.put(Response.TYPE, jSONObject3);
        jSONObject.put("flags", zzdyfVar.zzd.zzi());
        return jSONObject;
    }
}
