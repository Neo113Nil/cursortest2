package com.bytedance.sdk.openadsdk.core.hc.wh.pcc;

import com.bytedance.sdk.openadsdk.core.model.of;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class sf {
    protected of pcc;

    public abstract String pcc();

    public void pcc(JSONObject jSONObject) {
    }

    public abstract JSONObject sf();

    public sf(of ofVar) {
        this.pcc = ofVar;
    }

    public static class pcc {
        public static sf pcc(of ofVar, com.bytedance.sdk.openadsdk.core.hc.wh.pcc pccVar) {
            if (ofVar == null) {
                return null;
            }
            int tqg = ofVar.tqg();
            if (tqg == 1) {
                return new com.bytedance.sdk.openadsdk.core.hc.wh.pcc.pcc(ofVar, pccVar);
            }
            if (tqg == 3) {
                return new oo(ofVar, pccVar);
            }
            if (tqg == 7 || tqg == 8) {
                return new vj(ofVar, pccVar);
            }
            return null;
        }
    }
}
