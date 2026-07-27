package com.bytedance.adsdk.pcc.sf.sf.pcc;

import com.ironsource.U3;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class qf implements com.bytedance.adsdk.pcc.sf.sf.pcc {
    private final Object pcc;

    public qf(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.pcc = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.pcc = Boolean.FALSE;
        } else {
            if (str.equalsIgnoreCase("null")) {
                this.pcc = null;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public Object pcc(Map<String, JSONObject> map) {
        return this.pcc;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public com.bytedance.adsdk.pcc.sf.oo.vj pcc() {
        return com.bytedance.adsdk.pcc.sf.oo.wh.CONSTANT;
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.pcc + U3.j.e;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public String sf() {
        Object obj = this.pcc;
        if (obj != null) {
            return obj.toString();
        }
        return "NULL";
    }
}
