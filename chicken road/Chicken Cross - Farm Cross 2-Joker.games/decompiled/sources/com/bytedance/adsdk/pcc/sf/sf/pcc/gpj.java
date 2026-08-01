package com.bytedance.adsdk.pcc.sf.sf.pcc;

import io.ktor.sse.ServerSentEventKt;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class gpj implements com.bytedance.adsdk.pcc.sf.sf.sf {
    private com.bytedance.adsdk.pcc.sf.sf.pcc gm;
    private com.bytedance.adsdk.pcc.sf.sf.pcc pcc;
    private com.bytedance.adsdk.pcc.sf.sf.pcc sf;

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public Object pcc(Map<String, JSONObject> map) {
        Object pcc = this.pcc.pcc(map);
        if (pcc == null) {
            return null;
        }
        if (((Boolean) pcc).booleanValue()) {
            return this.sf.pcc(map);
        }
        return this.gm.pcc(map);
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public com.bytedance.adsdk.pcc.sf.oo.vj pcc() {
        return com.bytedance.adsdk.pcc.sf.oo.wh.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.sf
    public void pcc(com.bytedance.adsdk.pcc.sf.sf.pcc pccVar) {
        this.pcc = pccVar;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.sf
    public void sf(com.bytedance.adsdk.pcc.sf.sf.pcc pccVar) {
        this.sf = pccVar;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.sf
    public void gm(com.bytedance.adsdk.pcc.sf.sf.pcc pccVar) {
        this.gm = pccVar;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public String sf() {
        return this.pcc.sf() + "?" + this.sf.sf() + ServerSentEventKt.COLON + this.gm.sf();
    }

    public String toString() {
        return sf();
    }
}
