package com.bytedance.sdk.openadsdk.oo.vj.sf;

import com.bytedance.sdk.component.utils.lo;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class qf extends gm {
    private long pcc;
    private long sf;

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
        } catch (Throwable th) {
            lo.gm("FeedPauseModel", th.getMessage());
        }
    }
}
