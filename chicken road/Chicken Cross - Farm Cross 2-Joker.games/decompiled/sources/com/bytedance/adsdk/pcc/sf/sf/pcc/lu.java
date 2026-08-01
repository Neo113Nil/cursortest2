package com.bytedance.adsdk.pcc.sf.sf.pcc;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class lu extends nac {
    private static final ThreadLocal<StringBuilder> oo = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.pcc.sf.sf.pcc.lu.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public lu() {
        super(com.bytedance.adsdk.pcc.sf.oo.gm.PLUS);
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public Object pcc(Map<String, JSONObject> map) {
        Object pcc;
        Object pcc2 = this.pcc.pcc(map);
        if (pcc2 == null || (pcc = this.sf.pcc(map)) == null) {
            return null;
        }
        if ((pcc2 instanceof String) || (pcc instanceof String)) {
            StringBuilder sb = oo.get();
            sb.append(pcc2).append(pcc);
            String sb2 = sb.toString();
            sb.setLength(0);
            return sb2;
        }
        return com.bytedance.adsdk.pcc.sf.vj.pcc.kj.pcc((Number) pcc2, (Number) pcc);
    }
}
