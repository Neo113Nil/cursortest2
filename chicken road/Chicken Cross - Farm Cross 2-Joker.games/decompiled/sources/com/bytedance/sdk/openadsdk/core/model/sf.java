package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf {
    private String gm;
    private String oo;
    private String pcc;
    private String sf;
    private String vj;
    private boolean wh;

    public void pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.pcc = jSONObject.optString("icon");
        this.sf = jSONObject.optString("text");
        this.gm = jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL);
        this.oo = jSONObject.optString("privacy_title");
        this.vj = jSONObject.optString("iab_privacy_bar_text");
    }

    public String pcc() {
        return this.pcc;
    }

    public String sf() {
        return this.sf;
    }

    public String gm() {
        return this.gm;
    }

    public String oo() {
        return this.vj;
    }

    public String vj() {
        return this.oo;
    }

    public boolean wh() {
        return this.wh;
    }

    public void pcc(boolean z) {
        this.wh = z;
    }

    public JSONObject qf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_PRIVACY_URL, this.gm);
            jSONObject.put("privacy_title", this.oo);
            jSONObject.put("text", this.sf);
            jSONObject.put("icon", this.pcc);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
