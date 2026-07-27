package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public class atb extends wh implements com.bytedance.sdk.component.adexpress.dynamic.gm {
    private boolean pcc;

    public atb(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        this.qf = this.kj;
        this.jr = new ImageView(context);
        this.jr.setTag(Integer.valueOf(getClickArea()));
        addView(this.jr, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null) {
            if (!dynamicRootView.getRenderRequest().jsj()) {
                this.jr.setVisibility(8);
                setVisibility(8);
            }
            this.pcc = dynamicRootView.getRenderRequest().hc();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        Drawable gm;
        super.vy();
        if (this.jr != null) {
            ((ImageView) this.jr).setScaleType(ImageView.ScaleType.CENTER_CROP);
            Drawable pcc = com.bytedance.sdk.component.adexpress.oo.gm.pcc(getContext(), this.tmg);
            if (pcc != null) {
                ((ImageView) this.jr).setBackground(pcc);
            }
            if (this.pcc) {
                gm = com.bytedance.sdk.component.utils.tz.gm(getContext(), "tt_close_btn");
            } else {
                gm = com.bytedance.sdk.component.utils.tz.gm(getContext(), "tt_skip_btn");
            }
            if (gm != null) {
                gm.setAutoMirrored(true);
                ((ImageView) this.jr).setImageDrawable(gm);
            }
            int pcc2 = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.sf());
            this.jr.setPadding(pcc2, pcc2, pcc2, pcc2);
        }
        setVisibility(8);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm
    public void pcc(CharSequence charSequence, boolean z, int i, boolean z2) {
        int i2 = 0;
        if (!z && !z2) {
            i2 = 8;
        }
        setVisibility(i2);
    }
}
