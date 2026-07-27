package com.bytedance.sdk.openadsdk.tmg.pcc;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class hc extends com.bytedance.sdk.component.pcc.oo<JSONObject, JSONObject> {
    private WeakReference<com.bytedance.sdk.component.vy.qf> pcc;

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, com.bytedance.sdk.component.vy.qf qfVar) {
        jrVar.pcc("preventTouchEvent", new hc(qfVar));
    }

    public hc(com.bytedance.sdk.component.vy.qf qfVar) {
        this.pcc = new WeakReference<>(qfVar);
    }

    @Override // com.bytedance.sdk.component.pcc.oo
    public JSONObject pcc(String str, JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean optBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.vy.qf qfVar = this.pcc.get();
            if (qfVar != null) {
                qfVar.setIsPreventTouchEvent(optBoolean);
                jSONObject2.put("success", true);
            } else {
                jSONObject2.put("success", false);
            }
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
        }
        return jSONObject2;
    }
}
