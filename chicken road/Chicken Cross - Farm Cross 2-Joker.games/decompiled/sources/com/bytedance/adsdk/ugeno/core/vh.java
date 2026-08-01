package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vh {
    private JSONObject gm;
    private Map<String, Object> oo;
    private Context pcc;
    private JSONObject sf;

    public void pcc(Context context) {
        this.pcc = context;
    }

    public void pcc(JSONObject jSONObject) {
        this.sf = jSONObject;
    }

    public JSONObject pcc() {
        return this.gm;
    }

    public void sf(JSONObject jSONObject) {
        this.gm = jSONObject;
    }

    public Map<String, Object> sf() {
        return this.oo;
    }

    public void pcc(Map<String, Object> map) {
        this.oo = map;
    }
}
