package com.bytedance.sdk.openadsdk.tmg.pcc;

import com.bytedance.sdk.component.pcc.gm;
import com.bytedance.sdk.openadsdk.core.mu;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf extends com.bytedance.sdk.component.pcc.gm<JSONObject, JSONObject> {
    private final WeakReference<mu> pcc;

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, final mu muVar) {
        jrVar.pcc("interstitial_webview_close", new gm.sf() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.sf.1
            @Override // com.bytedance.sdk.component.pcc.gm.sf
            public com.bytedance.sdk.component.pcc.gm pcc() {
                return new sf(mu.this);
            }
        });
    }

    public sf(mu muVar) {
        this.pcc = new WeakReference<>(muVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.pcc.gm
    public void pcc(JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        com.bytedance.sdk.openadsdk.core.ork.sf().jr();
        mu muVar = this.pcc.get();
        if (muVar == null) {
            gm();
        } else {
            muVar.kj();
        }
    }
}
