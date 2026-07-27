package com.bytedance.adsdk.pcc.sf.sf.pcc;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class oo extends nac {
    public oo() {
        super(com.bytedance.adsdk.pcc.sf.oo.gm.EQ);
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public Object pcc(Map<String, JSONObject> map) {
        Object pcc = this.pcc.pcc(map);
        Object pcc2 = this.sf.pcc(map);
        if (pcc == null && pcc2 == null) {
            return Boolean.TRUE;
        }
        if (pcc == null && pcc2 != null) {
            return Boolean.FALSE;
        }
        if (pcc != null && pcc2 == null) {
            return Boolean.FALSE;
        }
        if ((pcc instanceof Number) && (pcc2 instanceof Number)) {
            return Boolean.valueOf(com.bytedance.adsdk.pcc.sf.vj.pcc.sf.pcc((Number) pcc, (Number) pcc2));
        }
        return Boolean.valueOf(pcc.equals(pcc2));
    }
}
