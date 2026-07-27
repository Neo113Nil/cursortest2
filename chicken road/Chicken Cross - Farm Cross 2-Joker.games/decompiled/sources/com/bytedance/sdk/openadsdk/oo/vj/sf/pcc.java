package com.bytedance.sdk.openadsdk.oo.vj.sf;

import com.bytedance.sdk.openadsdk.core.model.of;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc {
    private JSONObject gm;
    private JSONObject oo;
    private of pcc;
    private String sf;
    private gm vj;
    private boolean wh = false;

    public pcc(of ofVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.pcc = ofVar;
        this.sf = str;
        this.gm = jSONObject;
        this.oo = jSONObject2;
    }

    public of pcc() {
        return this.pcc;
    }

    public String sf() {
        return this.sf;
    }

    public JSONObject gm() {
        if (this.gm == null) {
            this.gm = new JSONObject();
        }
        return this.gm;
    }

    public JSONObject oo() {
        if (this.oo == null) {
            this.oo = new JSONObject();
        }
        return this.oo;
    }

    public gm vj() {
        return this.vj;
    }

    public void pcc(gm gmVar) {
        this.vj = gmVar;
    }

    public boolean wh() {
        return this.wh;
    }

    public void pcc(boolean z) {
        this.wh = z;
    }

    public void qf() {
        gm gmVar = this.vj;
        if (gmVar != null) {
            gmVar.pcc(this);
        }
    }
}
