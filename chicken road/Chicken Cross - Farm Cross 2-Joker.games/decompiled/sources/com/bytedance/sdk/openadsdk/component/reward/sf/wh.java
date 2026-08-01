package com.bytedance.sdk.openadsdk.component.reward.sf;

import com.bytedance.sdk.openadsdk.core.model.of;

/* loaded from: classes4.dex */
public class wh {
    public static sf pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        of ofVar = sfVar.sf;
        if (qf.pcc(ofVar) && !gm.pcc(ofVar)) {
            return new qf(sfVar);
        }
        if (oo.pcc(ofVar)) {
            return new oo(sfVar);
        }
        if (gm.pcc(ofVar)) {
            return new gm(sfVar);
        }
        return new vj(sfVar);
    }
}
