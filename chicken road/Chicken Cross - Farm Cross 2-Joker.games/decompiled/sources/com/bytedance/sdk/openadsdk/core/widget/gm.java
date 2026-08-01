package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class gm extends com.bytedance.sdk.openadsdk.core.wh.oo {
    public gm(Context context) {
        super(context);
        pcc();
    }

    private void pcc() {
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.nac.jum);
    }

    public void pcc(int i, of ofVar) {
        if (ofVar.on() || (ofVar.uxz() && ofVar.of())) {
            rj.pcc((View) this, 0);
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc((int) rj.pcc(getContext(), i, true), this, ofVar);
        }
    }
}
