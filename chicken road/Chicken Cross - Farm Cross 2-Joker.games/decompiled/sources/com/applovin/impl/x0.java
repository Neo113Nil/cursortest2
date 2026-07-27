package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class x0 extends w0 {
    public x0(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        super(jSONObject, lVar);
    }

    public List f() {
        y0 a2;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.b, "transitions", null);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject != null && (a2 = y0.a(jSONObject, this.f4541a)) != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public String g() {
        return b("message");
    }

    public String h() {
        return b("title");
    }

    @Override // com.applovin.impl.w0
    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + ", title=" + h() + ", message=" + g() + ", actions=" + f() + "}";
    }
}
