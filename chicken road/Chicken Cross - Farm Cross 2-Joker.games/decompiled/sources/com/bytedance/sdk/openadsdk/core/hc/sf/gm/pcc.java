package com.bytedance.sdk.openadsdk.core.hc.sf.gm;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class pcc extends com.bytedance.adsdk.ugeno.vy.sf.pcc {
    private final com.bytedance.adsdk.ugeno.vy.sf.pcc pcc;

    public pcc(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.vy.sf.pcc pccVar = new com.bytedance.adsdk.ugeno.vy.sf.pcc(context);
        this.pcc = pccVar;
        addView(pccVar, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.vy.sf.pcc getPlayableView() {
        return this.pcc;
    }
}
