package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public class jr {
    private final int pcc;
    private final int sf;

    public jr(JSONObject jSONObject) {
        this.pcc = jSONObject.optInt("auto_click", 0);
        this.sf = jSONObject.optInt("hidden_bar", 0);
    }

    public int pcc() {
        return this.pcc;
    }

    public boolean sf() {
        return this.sf == 1;
    }

    public static boolean pcc(of ofVar) {
        if (ofVar == null || !ofVar.on() || ofVar.mbt() == null) {
            return false;
        }
        return ofVar.mbt().sf();
    }
}
