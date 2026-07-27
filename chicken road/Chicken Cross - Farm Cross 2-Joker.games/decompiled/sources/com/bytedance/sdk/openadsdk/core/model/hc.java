package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public class hc {
    private int gm;
    private String pcc;
    private String sf;

    public String pcc() {
        return this.pcc;
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public String sf() {
        return this.sf;
    }

    public void sf(String str) {
        this.sf = str;
    }

    public int gm() {
        return this.gm;
    }

    public void pcc(int i) {
        this.gm = i;
    }

    public JSONObject oo() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.pcc);
            jSONObject.put("ft", this.gm);
            jSONObject.put("fu", this.sf);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
