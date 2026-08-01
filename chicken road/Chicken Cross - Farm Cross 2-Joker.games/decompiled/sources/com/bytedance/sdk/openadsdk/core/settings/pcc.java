package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.fum;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.settings.ork;
import com.bytedance.sdk.openadsdk.core.settings.vj;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc extends ork {
    public pcc() {
        super(new ork.pcc() { // from class: com.bytedance.sdk.openadsdk.core.settings.pcc.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.ork.pcc
            public void pcc() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.ork.pcc
            public void sf() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ork
    protected String pcc() {
        try {
            if (lu.pcc() != null && !fum.pcc(lu.pcc())) {
                return "tt_set_apm_" + fum.gm(lu.pcc()) + ".prop";
            }
            return "tt_set_apm.prop";
        } catch (Throwable unused) {
            return "tt_set_apm";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.vj
    public void pcc(JSONObject jSONObject) {
        vj.pcc sf = sf();
        if (jSONObject.has("apm_url")) {
            sf.pcc("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("perf_con");
                if (optJSONObject != null && optJSONObject.has("perf_con_apm")) {
                    sf.pcc("perf_con_apm", optJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        sf.pcc();
        vj();
    }
}
