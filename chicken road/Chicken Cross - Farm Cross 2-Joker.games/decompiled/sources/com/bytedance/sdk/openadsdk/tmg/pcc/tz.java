package com.bytedance.sdk.openadsdk.tmg.pcc;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.nn;
import com.bytedance.sdk.openadsdk.utils.rnn;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class tz extends com.bytedance.sdk.component.pcc.lu<JSONObject, JSONObject> {
    public static final HashSet<String> pcc = new HashSet<>(Arrays.asList("closeWebview", "makeVisible", "getCurrentVisibleState"));
    private mu gm;
    private of oo;
    private com.bytedance.sdk.component.vy.qf sf;

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, com.bytedance.sdk.component.vy.qf qfVar, mu muVar, of ofVar) {
        jrVar.pcc(pcc, new tz(qfVar, muVar, ofVar));
    }

    public tz(com.bytedance.sdk.component.vy.qf qfVar, mu muVar, of ofVar) {
        this.sf = qfVar;
        this.gm = muVar;
        this.oo = ofVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        return r5;
     */
    @Override // com.bytedance.sdk.component.pcc.oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject pcc(String str, JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        JSONObject jSONObject2;
        jSONObject2 = new JSONObject();
        str.hashCode();
        switch (str) {
            case "getCurrentVisibleState":
                of ofVar = this.oo;
                if (ofVar != null) {
                    jSONObject2.put("visibleState", !nn.pcc(this.sf, 20, ofVar.tqg(), false) ? 1 : 0);
                    break;
                }
                break;
            case "closeWebview":
                rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.tz.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (tz.this.sf != null) {
                            tz.this.sf.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) tz.this.sf.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(tz.this.sf);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                break;
            case "makeVisible":
                if (this.sf != null) {
                    jSONObject2.put("success", true);
                    rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.tz.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (tz.this.sf != null) {
                                tz.this.sf.setVisibility(0);
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
