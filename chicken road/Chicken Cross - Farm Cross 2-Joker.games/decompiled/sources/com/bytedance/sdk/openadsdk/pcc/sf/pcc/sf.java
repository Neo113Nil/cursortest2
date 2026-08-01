package com.bytedance.sdk.openadsdk.pcc.sf.pcc;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.lo;

/* loaded from: classes4.dex */
public class sf extends gm {
    public sf(Context context, of ofVar, AdSlot adSlot) {
        super(context, ofVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.sf.pcc.gm
    protected void pcc() {
        this.ork = new lo(this.kj, this.sf, this.vy, this.vh, false);
        this.pcc.pcc(((lo) this.ork).getVideoController());
        gm();
    }

    public com.bytedance.sdk.openadsdk.gpj.gm.pcc sf() {
        if (this.ork != null) {
            return ((lo) this.ork).getVideoModel();
        }
        return null;
    }
}
