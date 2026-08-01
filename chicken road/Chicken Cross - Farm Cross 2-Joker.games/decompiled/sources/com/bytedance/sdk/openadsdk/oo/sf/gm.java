package com.bytedance.sdk.openadsdk.oo.sf;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gm implements sf {
    sf pcc;

    @Override // com.bytedance.sdk.openadsdk.oo.sf.sf
    public void pcc(JSONObject jSONObject, long j) throws JSONException {
        sf sfVar = this.pcc;
        if (sfVar != null) {
            sfVar.pcc(jSONObject, j);
        }
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j);
    }
}
