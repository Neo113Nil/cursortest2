package com.bytedance.sdk.openadsdk.qy.sf;

import com.bytedance.sdk.openadsdk.core.gbb.sf.gm;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.qy.sf.vj;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class oo {
    public static void pcc(final of ofVar, final pcc pccVar, final vj.pcc pccVar2) {
        ofVar.gl();
        rnn.sf(new com.bytedance.sdk.component.kj.sf.gm("mrc_report") { // from class: com.bytedance.sdk.openadsdk.qy.sf.oo.1
            @Override // java.lang.Runnable
            public void run() {
                if (ofVar.iwd()) {
                    if (ofVar.nmd()) {
                        com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(ofVar.eko(), new gm.sf("show_urls", ofVar));
                    } else {
                        com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar);
                    }
                }
                String pcc = kun.pcc(ofVar);
                final JSONObject jSONObject = new JSONObject();
                pcc pccVar3 = pccVar;
                final JSONObject jSONObject2 = null;
                if (pccVar3 != null) {
                    try {
                        jSONObject.put("root_view", pcc.pcc(pccVar3));
                        vj.pcc pccVar4 = pccVar2;
                        if (pccVar4 != null) {
                            if (pccVar4.pcc != -1) {
                                jSONObject.put("dynamic_show_type", pccVar2.pcc);
                            }
                            if (pccVar2.sf != -1) {
                                jSONObject2 = com.bytedance.sdk.openadsdk.oo.gm.pcc(pccVar2.sf + 1);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, pcc, "mrc_show", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.qy.sf.oo.1.1
                    @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                    public JSONObject gm() {
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                    public JSONObject pcc() {
                        return jSONObject2;
                    }
                });
            }
        });
    }
}
