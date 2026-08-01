package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public class yt {
    private final int gm;
    private final int oo;
    private final int pcc;
    private final int sf;

    public yt(JSONObject jSONObject) {
        this.pcc = jSONObject.optInt("max_time", 0);
        this.sf = jSONObject.optInt("auto_skip_time", -1);
        this.gm = jSONObject.optInt("show_after_inactivity", 10);
        this.oo = jSONObject.optInt("user_wait_time", 10);
    }

    public int pcc() {
        return this.pcc;
    }

    public int sf() {
        return this.gm;
    }

    public int gm() {
        return this.oo;
    }
}
