package com.bytedance.sdk.openadsdk.component.reward.gm.pcc;

import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class oo {
    private String gm;
    private String kj;
    private float oo;
    private String ork;
    private int pcc;
    private float qf;
    private boolean sf = true;
    private float vj;
    private JSONObject vy;
    private float wh;

    public String pcc() {
        return this.ork;
    }

    public void pcc(String str) {
        this.ork = str;
    }

    public int sf() {
        return this.pcc;
    }

    public void pcc(int i) {
        this.pcc = i;
    }

    public boolean gm() {
        return this.sf;
    }

    public void pcc(boolean z) {
        this.sf = z;
    }

    public String oo() {
        return this.gm;
    }

    public void sf(String str) {
        this.gm = str;
    }

    public float vj() {
        return this.oo;
    }

    public void pcc(float f) {
        this.oo = f;
    }

    public float wh() {
        return this.vj;
    }

    public void sf(float f) {
        this.vj = f;
    }

    public float qf() {
        return this.wh;
    }

    public void gm(float f) {
        this.wh = f;
    }

    public float kj() {
        return this.qf;
    }

    public void oo(float f) {
        this.qf = f;
    }

    public String vy() {
        return this.kj;
    }

    public void gm(String str) {
        this.kj = str;
    }

    public void pcc(JSONObject jSONObject) {
        this.vy = jSONObject;
    }

    public static oo sf(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        oo ooVar = new oo();
        ooVar.sf(jSONObject.optString("url"));
        ooVar.pcc(jSONObject.optInt("showType"));
        ooVar.pcc(jSONObject.optBoolean("lpClickable", true));
        float sf = rj.sf(lu.pcc(), (float) jSONObject.optDouble("x"));
        float sf2 = rj.sf(lu.pcc(), (float) jSONObject.optDouble("y"));
        float sf3 = rj.sf(lu.pcc(), (float) jSONObject.optDouble("width"));
        float sf4 = rj.sf(lu.pcc(), (float) jSONObject.optDouble("height"));
        ooVar.pcc(sf);
        ooVar.sf(sf2);
        ooVar.gm(sf3);
        ooVar.oo(sf4);
        ooVar.gm(jSONObject.optString("tag"));
        ooVar.pcc(jSONObject.optString(SDKConstants.PARAM_SESSION_ID));
        JSONObject optJSONObject = jSONObject.optJSONObject("materialDict");
        if (optJSONObject != null) {
            ooVar.pcc(optJSONObject);
        }
        return ooVar;
    }

    public boolean pcc(float f, float f2) {
        return f >= vj() && f <= vj() + qf() && f2 >= wh() && f2 <= wh() + kj();
    }
}
