package com.bytedance.sdk.openadsdk.lu;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lu;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.ork;
import com.ironsource.C4665u;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class vj implements oo {
    private int gm;
    private int oo;
    private int pcc;
    private oo sf;
    private int vj;

    public vj(oo ooVar, int i, int i2, int i3) {
        this.pcc = Integer.MIN_VALUE;
        this.sf = ooVar;
        this.gm = i;
        this.oo = i2;
        this.vj = i3;
        Context pcc = pcc.pcc();
        if (pcc != null) {
            this.pcc = lu.gm(pcc);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lu.oo
    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
        JSONObject jSONObject;
        com.bytedance.sdk.openadsdk.lu.sf.pcc pcc = this.sf.pcc();
        pcc.pcc(BuildConfig.VERSION_NAME);
        pcc.pcc(this.gm);
        pcc.sf(this.oo);
        pcc.gm(this.vj);
        pcc.wh(ork.sf().qf());
        pcc.oo(jr.oo());
        String gm = pcc.gm();
        if (this.pcc != Integer.MIN_VALUE && ("get_ad".equals(gm) || "dislike".equals(gm) || "settings_fetch".equals(gm) || C4665u.j.equals(gm) || "strategy_fetch".equals(gm))) {
            try {
                String hc = pcc.hc();
                if (TextUtils.isEmpty(hc)) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(hc);
                }
                jSONObject.put("nt", this.pcc);
                pcc.qf(jSONObject.toString());
            } catch (Throwable unused) {
            }
        }
        return pcc;
    }
}
