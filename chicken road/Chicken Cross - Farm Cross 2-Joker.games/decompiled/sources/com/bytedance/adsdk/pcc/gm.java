package com.bytedance.adsdk.pcc;

import com.bytedance.adsdk.ugeno.gm.pcc;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class gm implements com.bytedance.adsdk.ugeno.gm.pcc {
    @Override // com.bytedance.adsdk.ugeno.gm.pcc
    public pcc.InterfaceC0103pcc pcc(String str) {
        return pcc.pcc(str);
    }

    static class pcc implements pcc.InterfaceC0103pcc {
        private com.bytedance.adsdk.pcc.sf.pcc pcc;
        private String sf;

        private pcc(String str) {
            this.sf = str;
            this.pcc = com.bytedance.adsdk.pcc.sf.pcc.pcc(str);
        }

        public static pcc pcc(String str) {
            return new pcc(str);
        }

        @Override // com.bytedance.adsdk.ugeno.gm.pcc.InterfaceC0103pcc
        public Object pcc(JSONObject jSONObject) {
            com.bytedance.adsdk.pcc.sf.pcc pccVar = this.pcc;
            if (pccVar == null) {
                return this.sf;
            }
            Object pcc = pccVar.pcc(jSONObject);
            if (pcc instanceof String) {
                return pcc;
            }
            if (pcc instanceof com.bytedance.adsdk.pcc.sf.pcc.pcc) {
                return String.valueOf(nac.pcc((com.bytedance.adsdk.pcc.sf.pcc.pcc) pcc));
            }
            if (pcc != null && pcc.getClass().isArray()) {
                try {
                    return new JSONArray(pcc).toString();
                } catch (JSONException unused) {
                    return String.valueOf(pcc);
                }
            }
            return String.valueOf(pcc);
        }
    }
}
