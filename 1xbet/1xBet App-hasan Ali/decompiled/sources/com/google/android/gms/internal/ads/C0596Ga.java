package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596Ga {

    /* renamed from: a, reason: collision with root package name */
    public final List f9189a;

    public C0596Ga(JSONObject jSONObject) {
        if (U2.j.l(2)) {
            T2.G.m("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            try {
                C0589Fa c0589Fa = new C0589Fa(jSONArray.getJSONObject(i5));
                "banner".equalsIgnoreCase(c0589Fa.f8953c);
                arrayList.add(c0589Fa);
                if (i < 0) {
                    Iterator it = c0589Fa.f8951a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i5;
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
        this.f9189a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            V9 v9 = P2.o.f4767B.f4787u;
            V9.g("click_urls", optJSONObject);
            V9.g("imp_urls", optJSONObject);
            V9.g("downloaded_imp_urls", optJSONObject);
            V9.g("nofill_urls", optJSONObject);
            V9.g("remote_ping_urls", optJSONObject);
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1L);
            C0575Dc.a(optJSONObject.optJSONArray("rewards"));
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
