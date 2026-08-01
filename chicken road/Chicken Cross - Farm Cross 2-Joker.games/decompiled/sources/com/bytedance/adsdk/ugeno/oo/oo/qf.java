package com.bytedance.adsdk.ugeno.oo.oo;

import android.content.Context;

/* loaded from: classes4.dex */
public class qf extends gm {
    public qf(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int pcc = com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(objArr[0]), 0);
            if (this.vj == null || this.vj.isEmpty()) {
                this.pcc.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
            } else {
                Object obj = this.vj.get("type");
                if (pcc == (obj != null ? com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj), 0) : 0)) {
                    this.pcc.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
                }
            }
        }
        return false;
    }
}
