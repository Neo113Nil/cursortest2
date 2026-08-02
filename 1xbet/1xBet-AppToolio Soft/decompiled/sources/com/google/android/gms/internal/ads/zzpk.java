package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzpk implements com.google.android.gms.ads.internal.gmsg.zzv<Object> {
    private final /* synthetic */ zzacm zzbji;
    private final /* synthetic */ zzpf zzbjj;

    zzpk(zzpf zzpfVar, zzacm zzacmVar) {
        this.zzbjj = zzpfVar;
        this.zzbji = zzacmVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final void zza(Object obj, Map<String, String> map) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : map.keySet()) {
                jSONObject.put(str2, map.get(str2));
            }
            str = this.zzbjj.zzbjh;
            jSONObject.put("id", str);
            this.zzbji.zza("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            zzakb.zzb("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
