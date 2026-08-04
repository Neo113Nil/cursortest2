package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import J2.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzboi {
    public final List zza;

    public zzboi(JSONObject jSONObject) throws JSONException {
        if (j.j(2)) {
            J.k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i7 = -1;
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            try {
                zzboh zzbohVar = new zzboh(jSONArray.getJSONObject(i8));
                "banner".equalsIgnoreCase(zzbohVar.zzc);
                arrayList.add(zzbohVar);
                if (i7 < 0) {
                    Iterator it = zzbohVar.zza.iterator();
                    while (it.hasNext()) {
                        if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            i7 = i8;
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.zza = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
            o oVar = o.f1952C;
            zzboj zzbojVar = oVar.f1975v;
            zzboj.zza(jSONObjectOptJSONObject, "click_urls");
            zzboj zzbojVar2 = oVar.f1975v;
            zzboj.zza(jSONObjectOptJSONObject, "imp_urls");
            zzboj zzbojVar3 = oVar.f1975v;
            zzboj.zza(jSONObjectOptJSONObject, "downloaded_imp_urls");
            zzboj zzbojVar4 = oVar.f1975v;
            zzboj.zza(jSONObjectOptJSONObject, "nofill_urls");
            zzboj zzbojVar5 = oVar.f1975v;
            zzboj.zza(jSONObjectOptJSONObject, "remote_ping_urls");
            jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
            jSONObjectOptJSONObject.optLong("refresh", -1L);
            zzbvm.zza(jSONObjectOptJSONObject.optJSONArray("rewards"));
            jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
