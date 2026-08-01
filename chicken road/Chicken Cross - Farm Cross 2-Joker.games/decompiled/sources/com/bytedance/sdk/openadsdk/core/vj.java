package com.bytedance.sdk.openadsdk.core;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vj {
    public static void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, str, "convert_track", jSONObject);
    }
}
