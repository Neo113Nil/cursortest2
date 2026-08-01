package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* loaded from: classes4.dex */
class gpj implements TTClientBidding {
    private final kj pcc;

    gpj(Context context, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        this.pcc = new kj(context, pccVar);
    }

    public kj pcc() {
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
