package com.bytedance.sdk.openadsdk.tmg.pcc;

import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class wh extends com.bytedance.sdk.component.pcc.oo<JSONObject, JSONObject> {
    private final WeakReference<mu> pcc;

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, mu muVar) {
        jrVar.pcc("interactiveFinish", new wh(muVar));
    }

    @Override // com.bytedance.sdk.component.pcc.oo
    public JSONObject pcc(String str, JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<mu> weakReference = this.pcc;
        if (weakReference != null && weakReference.get() != null) {
            mu muVar = this.pcc.get();
            of oo = muVar.oo();
            try {
                boolean z = true;
                int i = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z = false;
                }
                int optInt = jSONObject.optInt("reduce_duration", -1);
                int iz = oo != null ? oo.iz() : 0;
                if (optInt >= 0 && iz >= 0) {
                    optInt = Math.min(optInt, iz);
                } else if (optInt < 0) {
                    optInt = iz >= 0 ? iz : 0;
                }
                if (z) {
                    muVar.gm(optInt);
                } else {
                    i = -1;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
                jSONObject2.put("reduce_duration", optInt);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.lo.gm("InteractiveFinishMethod", e.getMessage());
            }
        }
        return jSONObject2;
    }

    public wh(mu muVar) {
        this.pcc = new WeakReference<>(muVar);
    }
}
