package com.bytedance.sdk.openadsdk.tmg.pcc;

import com.bytedance.sdk.openadsdk.core.mu;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class dax extends com.bytedance.sdk.component.pcc.oo<JSONObject, JSONObject> {
    private final mu pcc;

    public dax(mu muVar) {
        this.pcc = muVar;
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, mu muVar) {
        jrVar.pcc("commonConvert", new dax(muVar));
    }

    @Override // com.bytedance.sdk.component.pcc.oo
    public JSONObject pcc(String str, JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        this.pcc.wh(jSONObject);
        return null;
    }
}
