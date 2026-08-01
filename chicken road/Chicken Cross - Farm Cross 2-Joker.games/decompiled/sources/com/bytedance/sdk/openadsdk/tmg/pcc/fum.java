package com.bytedance.sdk.openadsdk.tmg.pcc;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.nn;
import com.bytedance.sdk.openadsdk.utils.rnn;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class fum extends com.bytedance.sdk.component.pcc.oo<JSONObject, JSONObject> {
    private of gm;
    private String oo;
    private com.bytedance.sdk.component.vy.qf pcc;
    private mu sf;

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, com.bytedance.sdk.component.vy.qf qfVar, mu muVar, of ofVar) {
        jrVar.pcc("closeWebview", new fum(qfVar, "closeWebview", muVar, ofVar));
        jrVar.pcc("makeVisible", new fum(qfVar, "makeVisible", muVar, ofVar));
        jrVar.pcc("getCurrentVisibleState", new fum(qfVar, "getCurrentVisibleState", muVar, ofVar));
    }

    public fum(com.bytedance.sdk.component.vy.qf qfVar, String str, mu muVar, of ofVar) {
        this.pcc = qfVar;
        this.oo = str;
        this.sf = muVar;
        this.gm = ofVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        return r4;
     */
    @Override // com.bytedance.sdk.component.pcc.oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject pcc(String str, JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        JSONObject jSONObject2;
        jSONObject2 = new JSONObject();
        String str2 = this.oo;
        str2.hashCode();
        switch (str2) {
            case "getCurrentVisibleState":
                of ofVar = this.gm;
                if (ofVar != null) {
                    jSONObject2.put("visibleState", !nn.pcc(this.pcc, 20, ofVar.tqg(), false) ? 1 : 0);
                    break;
                }
                break;
            case "closeWebview":
                rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.fum.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (fum.this.pcc != null) {
                            fum.this.pcc.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) fum.this.pcc.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(fum.this.pcc);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                break;
            case "makeVisible":
                if (this.pcc != null) {
                    jSONObject2.put("success", true);
                    rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.fum.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (fum.this.pcc != null) {
                                fum.this.pcc.setVisibility(0);
                            }
                        }
                    });
                    break;
                } else {
                    jSONObject2.put("success", false);
                    break;
                }
        }
    }
}
