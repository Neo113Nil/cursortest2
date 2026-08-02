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

/* loaded from: classes.dex */
public final class zzboi {
    public final List zza;

    public zzboi(JSONObject jSONObject) {
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
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i7 = i8;
                                break;
                            }
                        } else {
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
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            o oVar = o.f1952C;
            zzboj zzbojVar = oVar.f1975v;
            zzboj.zza(optJSONObject, "click_urls");
            zzboj zzbojVar2 = oVar.f1975v;
            zzboj.zza(optJSONObject, "imp_urls");
            zzboj zzbojVar3 = oVar.f1975v;
            zzboj.zza(optJSONObject, "downloaded_imp_urls");
            zzboj zzbojVar4 = oVar.f1975v;
            zzboj.zza(optJSONObject, "nofill_urls");
            zzboj zzbojVar5 = oVar.f1975v;
            zzboj.zza(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1L);
            zzbvm.zza(optJSONObject.optJSONArray("rewards"));
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
