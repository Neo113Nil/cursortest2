package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class tsz extends wh implements com.bytedance.sdk.component.adexpress.dynamic.gm {
    private int fum;
    private int lo;
    int pcc;
    boolean sf;
    private boolean tz;

    public tsz(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        this.fum = 0;
        setTag(Integer.valueOf(getClickArea()));
        pcc();
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().jsj()) {
            return;
        }
        if (this.jr != null) {
            this.jr.setVisibility(8);
        }
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj
    public void wh() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.sf) {
            layoutParams.leftMargin = this.vy;
        } else {
            layoutParams.leftMargin = this.vy + this.fum;
        }
        if (this.tz && this.tmg != null) {
            layoutParams.leftMargin = ((this.vy + this.fum) - ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.tmg.gm()))) - ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.tmg.oo()));
        }
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            layoutParams.topMargin = this.ork - ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.tmg.sf()));
        } else {
            layoutParams.topMargin = this.ork;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        if (com.bytedance.sdk.component.adexpress.oo.wh.sf(this.gbb.getRenderRequest().oo())) {
            return true;
        }
        super.vy();
        setPadding((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.tmg.gm()), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.tmg.sf()), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.tmg.oo()), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.tmg.pcc()));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.tz && this.tmg != null) {
            setMeasuredDimension(this.lo + ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.tmg.gm())) + ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.tmg.oo())), this.kj);
        } else if (this.sf) {
            setMeasuredDimension(this.qf, this.kj);
        } else {
            setMeasuredDimension(this.pcc, this.kj);
        }
    }

    private void pcc() {
        List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> vh = this.hc.vh();
        if (vh == null || vh.size() <= 0) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it = vh.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.oo.kj next = it.next();
            if (TextUtils.equals("skip-with-time-skip-btn", next.ork().sf())) {
                this.lo = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, next.kj() + (com.bytedance.sdk.component.adexpress.oo.sf() ? next.hc() : 0));
                this.pcc = this.qf - this.lo;
            }
        }
        this.fum = this.qf - this.pcc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm
    public void pcc(CharSequence charSequence, boolean z, int i, boolean z2) {
        if (z2 && this.tz != z2) {
            this.tz = z2;
            wh();
            return;
        }
        if (z && this.sf != z) {
            this.sf = z;
            wh();
        }
        this.sf = z;
    }
}
