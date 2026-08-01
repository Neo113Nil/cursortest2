package com.bytedance.sdk.openadsdk.oo.vj.sf;

import com.bytedance.sdk.component.utils.lo;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gbb extends gm {
    private final int gm;
    private final int oo;
    private long pcc;
    private long sf;
    private final String vj;

    public gbb(com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc pccVar) {
        this.gm = pccVar.pcc();
        this.oo = pccVar.sf();
        this.vj = pccVar.gm();
    }

    public void pcc(long j) {
        this.pcc = j;
    }

    public void sf(long j) {
        this.sf = j;
    }

    @Override // com.bytedance.sdk.openadsdk.oo.vj.sf.gm
    public void pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.pcc);
            jSONObject.put("total_duration", this.sf);
            jSONObject.put("error_code", this.gm);
            jSONObject.put("extra_error_code", this.oo);
            jSONObject.put("error_message", this.vj);
        } catch (Throwable th) {
            lo.gm("PlayErrorModel", th.getMessage());
        }
    }
}
