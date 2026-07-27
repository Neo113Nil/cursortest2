package com.bytedance.sdk.openadsdk.core.hc.vj.sf;

import android.content.Context;

/* loaded from: classes4.dex */
public class oo extends com.bytedance.adsdk.ugeno.oo.oo.gm {
    private boolean vh;

    public oo(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        if (this.vj == null || this.vj.isEmpty()) {
            return false;
        }
        long longValue = ((Long) objArr[0]).longValue() / 1000;
        long longValue2 = ((Long) objArr[1]).longValue() / 1000;
        if (longValue <= 0) {
            this.vh = false;
        }
        if (this.vj.containsKey("percent")) {
            Object obj = this.vj.get("percent");
            float pcc = obj != null ? com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj), -1.0f) : -1.0f;
            if (pcc >= 0.0f && longValue >= (pcc / 100.0f) * longValue2 && !this.vh) {
                this.vh = true;
                if (this.pcc != null) {
                    this.pcc.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
                }
            }
        } else {
            if (longValue >= (this.vj.get("interval") != null ? com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(r9), -1) : -1) && !this.vh) {
                this.vh = true;
                if (this.pcc != null) {
                    this.pcc.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
                }
            }
        }
        return true;
    }
}
