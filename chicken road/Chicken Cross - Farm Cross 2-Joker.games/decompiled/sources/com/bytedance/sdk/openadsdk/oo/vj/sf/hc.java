package com.bytedance.sdk.openadsdk.oo.vj.sf;

import com.bytedance.sdk.component.utils.lo;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class hc extends gm {
    public long gm;
    public long pcc;
    public int sf;

    public void pcc(long j) {
        this.pcc = j;
    }

    public void pcc(int i) {
        this.sf = i;
    }

    public void sf(long j) {
        this.gm = j;
    }

    @Override // com.bytedance.sdk.openadsdk.oo.vj.sf.gm
    public void pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.pcc);
            jSONObject.put("buffers_count", this.sf);
            jSONObject.put("total_duration", this.gm);
        } catch (Throwable th) {
            lo.gm("PlayBufferModel", th.getMessage());
        }
    }
}
