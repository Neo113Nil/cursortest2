package com.bytedance.sdk.openadsdk.oo.vj.sf;

import com.bytedance.sdk.component.utils.lo;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vh extends gm {
    private final String pcc;
    private final long sf;

    public vh(String str, long j) {
        this.pcc = str;
        this.sf = j;
    }

    @Override // com.bytedance.sdk.openadsdk.oo.vj.sf.gm
    public void pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.pcc);
            jSONObject.put("preload_size", this.sf);
        } catch (Throwable th) {
            lo.gm("LoadVideoStartModel", th.getMessage());
        }
    }
}
