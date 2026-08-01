package com.bytedance.adsdk.pcc.sf.sf.pcc;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class vj extends nac {
    public vj() {
        super(com.bytedance.adsdk.pcc.sf.oo.gm.GT_EQ);
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public Object pcc(Map<String, JSONObject> map) {
        Object pcc;
        if (this.pcc.pcc(map) == null || (pcc = this.sf.pcc(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.pcc.sf.vj.pcc.oo.pcc(r0, (Number) pcc)).booleanValue());
    }
}
