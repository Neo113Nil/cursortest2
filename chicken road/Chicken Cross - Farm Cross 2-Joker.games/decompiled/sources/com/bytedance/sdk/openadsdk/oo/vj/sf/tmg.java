package com.bytedance.sdk.openadsdk.oo.vj.sf;

import com.bytedance.sdk.component.utils.lo;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class tmg extends gm {
    private long gm;
    private long oo;
    private String pcc;
    private long sf;

    public void pcc(String str) {
        this.pcc = str;
    }

    public void pcc(long j) {
        this.sf = j;
    }

    public void sf(long j) {
        this.gm = j;
    }

    public void gm(long j) {
        this.oo = j;
    }

    @Override // com.bytedance.sdk.openadsdk.oo.vj.sf.gm
    public void pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.pcc);
            jSONObject.put("preload_size", this.sf);
            jSONObject.put("load_time", this.gm);
            jSONObject.put("local_cache", this.oo);
        } catch (Throwable th) {
            lo.gm("LoadVideoSuccessModel", th.getMessage());
        }
    }
}
