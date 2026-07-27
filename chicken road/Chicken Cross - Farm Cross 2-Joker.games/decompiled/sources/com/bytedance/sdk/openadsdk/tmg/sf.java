package com.bytedance.sdk.openadsdk.tmg;

import com.bytedance.sdk.component.adexpress.vj.vj;
import com.bytedance.sdk.component.pcc.lo;
import com.bytedance.sdk.openadsdk.component.reward.gm.kj;

/* loaded from: classes4.dex */
public class sf extends lo {
    @Override // com.bytedance.sdk.component.pcc.lo
    protected void gm() {
        if (this.vy != null) {
            if (kj.gm()) {
                vj.pcc().sf(this.vy, this, this.kj);
            } else {
                vj.pcc().pcc(this.vy, this, this.kj);
            }
        }
    }

    @Override // com.bytedance.sdk.component.pcc.lo
    protected void oo() {
        if (kj.gm()) {
            vj.pcc().sf(this.vy, this.kj);
        } else {
            vj.pcc().pcc(this.vy, this.kj);
        }
    }
}
