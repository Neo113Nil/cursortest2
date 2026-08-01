package com.bytedance.sdk.openadsdk.tmg.pcc;

import com.bytedance.sdk.openadsdk.core.mu;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vy extends com.bytedance.sdk.component.pcc.oo<JSONObject, JSONObject> {
    private final mu pcc;
    private String sf;

    public vy(mu muVar, String str) {
        this.pcc = muVar;
        this.sf = str;
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, mu muVar) {
        jrVar.pcc("endcardDynamicCreatives", new vy(muVar, "endcardDynamicCreatives"));
        jrVar.pcc("multiOpenCovert", new vy(muVar, "multiOpenCovert"));
        jrVar.pcc("skipToNextAd", new vy(muVar, "skipToNextAd"));
        jrVar.pcc("speedVideoOrTimer", new vy(muVar, "speedVideoOrTimer"));
        jrVar.pcc("openPlayable", new vy(muVar, "openPlayable"));
    }

    @Override // com.bytedance.sdk.component.pcc.oo
    public JSONObject pcc(String str, JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        if ("endcardDynamicCreatives".equals(this.sf)) {
            return this.pcc.vy(jSONObject);
        }
        if ("multiOpenCovert".equals(this.sf)) {
            this.pcc.ork(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(this.sf)) {
            this.pcc.pcc(jSONObject, this.sf);
            return null;
        }
        if ("speedVideoOrTimer".equals(this.sf)) {
            return this.pcc.kj(jSONObject);
        }
        if ("openPlayable".equals(this.sf)) {
            return this.pcc.qf(jSONObject);
        }
        return null;
    }
}
