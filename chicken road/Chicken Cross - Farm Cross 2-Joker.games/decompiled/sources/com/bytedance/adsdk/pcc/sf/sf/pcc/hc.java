package com.bytedance.adsdk.pcc.sf.sf.pcc;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class hc extends nac {
    public hc() {
        super(com.bytedance.adsdk.pcc.sf.oo.gm.MULTI);
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public Object pcc(Map<String, JSONObject> map) {
        Object pcc;
        Object pcc2 = this.pcc.pcc(map);
        if (pcc2 == null || (pcc = this.sf.pcc(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.pcc.sf.vj.pcc.qf.pcc((Number) pcc2, (Number) pcc);
    }
}
