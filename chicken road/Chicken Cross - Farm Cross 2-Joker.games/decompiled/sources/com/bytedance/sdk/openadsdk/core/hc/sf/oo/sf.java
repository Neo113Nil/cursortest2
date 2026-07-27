package com.bytedance.sdk.openadsdk.core.hc.sf.oo;

import android.content.Context;
import android.util.Log;

/* loaded from: classes4.dex */
public class sf extends com.bytedance.adsdk.ugeno.oo.oo.gm {
    private boolean tmg;
    private float vh;

    public sf(Context context) {
        super(context);
        this.vh = 100.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        if (objArr != null && objArr.length >= 2) {
            if (com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(objArr[1]), 0.0f) <= 0.0f) {
                if (this.pcc != null && !this.tmg) {
                    this.tmg = true;
                    this.pcc.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
                }
                return true;
            }
            if (this.vj.get("rate") != null) {
                this.vh = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(r2), 100);
            }
            float pcc = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(objArr[0]), 100.0f);
            Log.d("UGBaseEventMonitor", "monitor: progress=" + pcc + " mTargetProgress=" + this.vh);
            if (pcc >= this.vh) {
                if (this.pcc != null && !this.tmg) {
                    this.tmg = true;
                    this.pcc.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
                }
                return true;
            }
        }
        return false;
    }
}
