package com.bytedance.sdk.component.adexpress.dynamic.vj;

import com.bytedance.sdk.component.adexpress.sf.hc;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class qf implements kj {
    private com.bytedance.sdk.component.adexpress.dynamic.wh.sf pcc;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.vj.kj
    public void pcc(com.bytedance.sdk.component.adexpress.dynamic.wh.sf sfVar) {
        this.pcc = sfVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.vj.kj
    public void pcc(final hc hcVar) {
        if (hcVar.tmg() == 1) {
            sf(hcVar);
        } else {
            com.bytedance.sdk.component.adexpress.oo.oo.pcc(new com.bytedance.sdk.component.kj.sf.gm("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.vj.qf.1
                @Override // java.lang.Runnable
                public void run() {
                    qf.this.sf(hcVar);
                }
            }, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(hc hcVar) {
        try {
            JSONObject gm = hcVar.gm();
            JSONObject jSONObject = new JSONObject(gm.optString("template_Plugin"));
            JSONObject optJSONObject = gm.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.oo.kj pcc = new wh(jSONObject, optJSONObject, gm.optJSONObject("AdSize"), new JSONObject(gm.optString("diff_template_Plugin"))).pcc(hcVar.sf(), hcVar.ork(), optJSONObject.optDouble("score_exact_i18n"), optJSONObject.optString("comment_num_i18n"), hcVar);
            try {
                JSONObject jSONObject2 = new JSONObject(optJSONObject.optString("dynamic_creative"));
                pcc.pcc(jSONObject2.optString("color"));
                pcc.pcc(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.pcc.pcc(pcc);
        } catch (Exception unused2) {
        }
    }
}
