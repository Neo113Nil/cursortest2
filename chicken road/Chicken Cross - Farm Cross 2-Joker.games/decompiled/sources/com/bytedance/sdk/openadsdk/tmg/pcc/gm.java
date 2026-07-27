package com.bytedance.sdk.openadsdk.tmg.pcc;

import com.bytedance.sdk.component.pcc.gm;
import com.bytedance.sdk.openadsdk.core.mu;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gm extends com.bytedance.sdk.component.pcc.gm<JSONObject, JSONObject> {
    private final WeakReference<mu> pcc;

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, final mu muVar) {
        jrVar.pcc("newClickEvent", new gm.sf() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gm.1
            @Override // com.bytedance.sdk.component.pcc.gm.sf
            public com.bytedance.sdk.component.pcc.gm pcc() {
                return new gm(mu.this);
            }
        });
    }

    public gm(mu muVar) {
        this.pcc = new WeakReference<>(muVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.pcc.gm
    public void pcc(JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        mu muVar = this.pcc.get();
        if (muVar == null) {
            gm();
        } else {
            muVar.vj(jSONObject);
        }
    }
}
