package com.bytedance.adsdk.pcc.sf.sf.pcc;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class lo implements com.bytedance.adsdk.pcc.sf.sf.pcc {
    private final String pcc;

    public lo(String str) {
        this.pcc = str;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public Object pcc(Map<String, JSONObject> map) {
        return this.pcc;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public com.bytedance.adsdk.pcc.sf.oo.vj pcc() {
        return com.bytedance.adsdk.pcc.sf.oo.wh.STRING;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public String sf() {
        return "'" + this.pcc + "'";
    }

    public String toString() {
        return sf();
    }
}
