package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class lo extends qf implements com.bytedance.sdk.component.adexpress.dynamic.gm {
    public lo(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qf, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.jr).getText())) {
            setMeasuredDimension(0, this.kj);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj
    public void wh() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.qf, this.kj);
        layoutParams.leftMargin = this.vy;
        layoutParams.gravity = 16;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm
    public void pcc(CharSequence charSequence, boolean z, int i, boolean z2) {
        if (i == 0) {
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
        } else {
            ((TextView) this.jr).setText(" | " + String.format(com.bytedance.sdk.component.utils.tz.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), "tt_reward_full_skip_count_down"), Integer.valueOf(i)));
        }
        requestLayout();
    }
}
