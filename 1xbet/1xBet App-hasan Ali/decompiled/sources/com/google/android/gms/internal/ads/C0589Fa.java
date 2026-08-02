package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Fa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589Fa {

    /* renamed from: a, reason: collision with root package name */
    public final List f8951a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8952b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8953c;

    public C0589Fa(JSONObject jSONObject) {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f8951a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        V9 v9 = P2.o.f4767B.f4787u;
        V9.g("clickurl", jSONObject);
        V9.g("imp_urls", jSONObject);
        V9.g("downloaded_imp_urls", jSONObject);
        V9.g("fill_urls", jSONObject);
        V9.g("video_start_urls", jSONObject);
        V9.g("video_complete_urls", jSONObject);
        V9.g("video_reward_urls", jSONObject);
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            V9.g("manual_impression_urls", optJSONObject);
        }
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f8952b = optJSONObject2 != null ? optJSONObject2.toString() : null;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        V9.g("template_ids", jSONObject);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.f8953c = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
