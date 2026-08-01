package com.bytedance.sdk.openadsdk.tmg.pcc;

import com.bytedance.sdk.component.pcc.gm;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class jr extends com.bytedance.sdk.component.pcc.gm<JSONObject, JSONObject> {
    private long gm;
    private HashSet<Integer> oo = new HashSet<>();
    private WeakReference<mu> pcc;
    private of sf;

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, final mu muVar, final of ofVar) {
        jrVar.pcc("requestDelayCallback", new gm.sf() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.jr.1
            @Override // com.bytedance.sdk.component.pcc.gm.sf
            public com.bytedance.sdk.component.pcc.gm pcc() {
                return new jr(mu.this, ofVar);
            }
        });
    }

    public jr(mu muVar, of ofVar) {
        this.pcc = new WeakReference<>(muVar);
        this.sf = ofVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.pcc.gm
    public void pcc(JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        mu muVar = this.pcc.get();
        if (muVar == null || jSONObject == null) {
            gm();
            return;
        }
        muVar.pcc(new com.bytedance.sdk.openadsdk.hc.sf() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.jr.2
            @Override // com.bytedance.sdk.openadsdk.hc.sf
            public void pcc(int i) {
                jr.this.oo.add(Integer.valueOf(i));
                if (jr.this.oo.size() >= jr.this.gm) {
                    try {
                        jr.this.pcc((jr) new JSONObject());
                        jr.this.oo.clear();
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }
        });
        if (jSONObject.optInt("delay", -1) < 0) {
            return;
        }
        this.gm = r2 / 1000;
    }
}
