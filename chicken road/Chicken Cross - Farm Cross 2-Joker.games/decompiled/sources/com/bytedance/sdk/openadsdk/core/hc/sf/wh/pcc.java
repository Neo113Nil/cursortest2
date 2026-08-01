package com.bytedance.sdk.openadsdk.core.hc.sf.wh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class pcc extends com.bytedance.adsdk.ugeno.vy.sf.pcc {
    private final com.bytedance.adsdk.ugeno.vy.sf.pcc pcc;
    private final com.bytedance.adsdk.ugeno.vy.sf.pcc sf;

    public pcc(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.vy.sf.pcc pccVar = new com.bytedance.adsdk.ugeno.vy.sf.pcc(context);
        this.pcc = pccVar;
        addView(pccVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.vy.sf.pcc pccVar2 = new com.bytedance.adsdk.ugeno.vy.sf.pcc(context);
        this.sf = pccVar2;
        pccVar2.setBackgroundColor(0);
        addView(pccVar2, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.sf.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.sf.setOnTouchListener(onTouchListener);
    }

    public com.bytedance.adsdk.ugeno.vy.sf.pcc getVideoView() {
        return this.pcc;
    }

    public com.bytedance.adsdk.ugeno.vy.sf.pcc getMarkView() {
        return this.sf;
    }
}
