package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Vendor;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class z0 implements com.fyber.inneractive.sdk.util.b1 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f5298a = 50;
    public Integer b = 50;
    public Set c = null;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "pausePct", this.f5298a);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "playPct", this.b);
        JSONArray jSONArray = new JSONArray();
        Set<Vendor> set = this.c;
        if (set != null) {
            for (Vendor vendor : set) {
                if (vendor != null) {
                    jSONArray.put(vendor);
                }
            }
        }
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "vendor", jSONArray);
        return jSONObject;
    }
}
