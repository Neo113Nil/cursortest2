package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* loaded from: classes4.dex */
class lo implements TTClientBidding {
    private final ork pcc;

    lo(Context context, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, AdSlot adSlot) {
        this.pcc = new ork(context, pccVar, adSlot);
    }

    public ork pcc() {
        return this.pcc;
    }

    public void sf() {
        this.pcc.pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d) {
        this.pcc.win(d);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d, String str, String str2) {
        this.pcc.loss(d, str, str2);
    }
}
