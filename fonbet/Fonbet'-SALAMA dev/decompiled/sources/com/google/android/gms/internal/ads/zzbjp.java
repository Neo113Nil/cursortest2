package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import I2.P;
import J2.j;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbjp implements zzbiz {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            try {
                zzbjo zzbjoVar = (zzbjo) this.zzb.remove(str);
                if (zzbjoVar == null) {
                    int i7 = J.f3546b;
                    j.g("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    zzbjoVar.zza(str3 + concat);
                    return;
                }
                if (str5 == null) {
                    zzbjoVar.zzb(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (J.m()) {
                        J.k("Result GMSG: " + jSONObject.toString(2));
                    }
                    zzbjoVar.zzb(jSONObject);
                } catch (JSONException e7) {
                    zzbjoVar.zza(e7.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final I3.b zzb(zzbmg zzbmgVar, String str, JSONObject jSONObject) {
        zzbzf zzbzfVar = new zzbzf();
        P p5 = o.f1952C.f1957c;
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbjn(this, zzbzfVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            zzbmgVar.zzp(str, jSONObject2);
        } catch (Exception e7) {
            zzbzfVar.zzd(e7);
        }
        return zzbzfVar;
    }

    public final void zzc(String str, zzbjo zzbjoVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbjoVar);
        }
    }
}
