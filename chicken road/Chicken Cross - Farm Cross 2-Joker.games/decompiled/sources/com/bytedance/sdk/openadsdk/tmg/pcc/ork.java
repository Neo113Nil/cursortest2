package com.bytedance.sdk.openadsdk.tmg.pcc;

import com.bytedance.sdk.openadsdk.core.mu;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ork extends com.bytedance.sdk.component.pcc.lu<JSONObject, JSONObject> {
    public static final HashSet<String> pcc = new HashSet<>(Arrays.asList("endcardDynamicCreatives", "multiOpenCovert", "speedVideoOrTimer", "openPlayable", "skipToNextAd"));
    private final mu sf;

    public ork(mu muVar) {
        this.sf = muVar;
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, mu muVar) {
        jrVar.pcc(pcc, new ork(muVar));
    }

    @Override // com.bytedance.sdk.component.pcc.oo
    public JSONObject pcc(String str, JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        if ("endcardDynamicCreatives".equals(str)) {
            return this.sf.vy(jSONObject);
        }
        if ("multiOpenCovert".equals(str)) {
            this.sf.ork(jSONObject);
            return null;
        }
        if ("skipToNextAd".equals(str)) {
            this.sf.pcc(jSONObject, str);
            return null;
        }
        if ("speedVideoOrTimer".equals(str)) {
            return this.sf.kj(jSONObject);
        }
        if ("openPlayable".equals(str)) {
            return this.sf.qf(jSONObject);
        }
        return null;
    }
}
