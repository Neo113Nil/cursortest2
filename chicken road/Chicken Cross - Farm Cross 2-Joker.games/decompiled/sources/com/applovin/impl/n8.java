package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.ironsource.C4572od;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class n8 {

    /* renamed from: a, reason: collision with root package name */
    private final y2 f4353a;
    private final f4 b;
    private final List c;

    public n8(JSONObject jSONObject, MaxAdFormat maxAdFormat, i3 i3Var, com.applovin.impl.sdk.l lVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.b = new f4(jSONObject2, lVar);
        } else {
            this.b = null;
        }
        this.f4353a = new y2(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, i3Var);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, C4572od.c, new JSONArray());
        this.c = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject3 != null) {
                this.c.add(new f4(jSONObject3, lVar));
            }
        }
    }

    public f4 a() {
        return this.b;
    }

    public y2 b() {
        return this.f4353a;
    }

    public List c() {
        return this.c;
    }

    public boolean d() {
        return this.b != null;
    }
}
