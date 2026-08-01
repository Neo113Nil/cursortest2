package com.bytedance.adsdk.ugeno.core;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class hc {
    private JSONObject gm;
    private hc oo;
    private com.bytedance.adsdk.ugeno.sf.gm pcc;
    private int sf;
    private hc vj;

    public com.bytedance.adsdk.ugeno.sf.gm pcc() {
        return this.pcc;
    }

    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        this.pcc = gmVar;
    }

    public int sf() {
        return this.sf;
    }

    public void pcc(int i) {
        this.sf = i;
    }

    public JSONObject gm() {
        return this.gm;
    }

    public void pcc(JSONObject jSONObject) {
        this.gm = jSONObject;
    }

    public hc oo() {
        return this.oo;
    }

    public void pcc(hc hcVar) {
        this.oo = hcVar;
    }

    public void sf(hc hcVar) {
        this.vj = hcVar;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.pcc + ", mEventType=" + this.sf + ", mEvent=" + this.gm + AbstractJsonLexerKt.END_OBJ;
    }
}
