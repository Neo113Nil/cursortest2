package com.tiktok.appevents.edp;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public class TTAppLaunchEvent {
    private JSONObject prop;
    private long ts;

    public TTAppLaunchEvent(JSONObject prop, long ts) {
        this.prop = prop;
        this.ts = ts;
    }

    public JSONObject getProp() {
        return this.prop;
    }

    public void setProp(JSONObject prop) {
        this.prop = prop;
    }

    public long getTs() {
        return this.ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }
}
