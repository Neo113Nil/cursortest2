package com.bytedance.sdk.openadsdk.oo.vj.sf;

import com.bytedance.sdk.component.utils.lo;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ork extends gm {
    private long gm;
    private int oo;
    private String pcc;
    private long sf;
    private String vj;
    private String wh;

    public void pcc(String str) {
        this.pcc = str;
    }

    public void pcc(long j) {
        this.sf = j;
    }

    public void sf(long j) {
        this.gm = j;
    }

    public void pcc(int i) {
        this.oo = i;
    }

    public void sf(String str) {
        this.vj = str;
    }

    public void gm(String str) {
        this.wh = str;
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
            jSONObject.put("error_code", this.oo);
            jSONObject.put("error_message", this.vj);
            jSONObject.put("error_message_server", this.wh);
        } catch (Throwable th) {
            lo.gm("LoadVideoErrorModel", th.getMessage());
        }
    }
}
