package com.bytedance.sdk.openadsdk.qy.sf;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc {
    private final float gm;
    private final int pcc;
    private final int sf;

    public pcc(int i, int i2, float f) {
        this.pcc = i;
        this.sf = i2;
        this.gm = f;
    }

    public static JSONObject pcc(pcc pccVar) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", pccVar.pcc);
        jSONObject.put("height", pccVar.sf);
        jSONObject.put("alpha", pccVar.gm);
        return jSONObject;
    }
}
