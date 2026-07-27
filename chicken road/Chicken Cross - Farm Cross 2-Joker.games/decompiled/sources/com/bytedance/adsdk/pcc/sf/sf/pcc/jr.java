package com.bytedance.adsdk.pcc.sf.sf.pcc;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class jr implements com.bytedance.adsdk.pcc.sf.sf.pcc {
    private Number pcc;

    public jr(String str) {
        if (str.indexOf(46) >= 0) {
            Float valueOf = Float.valueOf(str);
            this.pcc = valueOf;
            if (Float.isInfinite(valueOf.floatValue())) {
                this.pcc = Double.valueOf(str);
                return;
            }
            return;
        }
        try {
            this.pcc = Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            this.pcc = Long.valueOf(str);
        }
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public Object pcc(Map<String, JSONObject> map) {
        return this.pcc;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public com.bytedance.adsdk.pcc.sf.oo.vj pcc() {
        return com.bytedance.adsdk.pcc.sf.oo.wh.NUMBER;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public String sf() {
        return this.pcc.toString();
    }

    public String toString() {
        return sf();
    }
}
