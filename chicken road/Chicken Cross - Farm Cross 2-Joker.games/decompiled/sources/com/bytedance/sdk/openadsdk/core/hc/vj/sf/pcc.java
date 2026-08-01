package com.bytedance.sdk.openadsdk.core.hc.vj.sf;

import android.content.Context;

/* loaded from: classes4.dex */
public class pcc extends com.bytedance.adsdk.ugeno.oo.oo.gm {
    private boolean vh;

    public pcc(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        new Object[]{"monitor input=", objArr, "mParams=", this.vj};
        if (this.vj != null && !this.vj.isEmpty()) {
            try {
                Object obj = objArr[0];
                if (obj == null) {
                    return false;
                }
                int pcc = com.bytedance.adsdk.ugeno.qf.gm.pcc(obj.toString(), -1);
                if (this.vj.containsKey("remainingSeconds")) {
                    Object obj2 = this.vj.get("remainingSeconds");
                    int pcc2 = obj2 != null ? com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj2), -1) : -1;
                    new Object[]{"UGCountDownMonitor monitor countdown=", Integer.valueOf(pcc), "remainingSeconds=", Integer.valueOf(pcc2)};
                    if ((pcc == 0 || (pcc2 >= 0 && pcc == pcc2)) && !this.vh) {
                        this.vh = true;
                        if (this.pcc != null) {
                            this.pcc.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
                        }
                    }
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
