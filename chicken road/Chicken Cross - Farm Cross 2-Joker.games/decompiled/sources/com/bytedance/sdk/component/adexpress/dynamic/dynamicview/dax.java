package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public class dax extends wh implements com.bytedance.sdk.component.adexpress.dynamic.sf {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj
    public boolean vj() {
        return true;
    }

    public dax(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        this.jr = new ImageView(context);
        this.jr.setTag(5);
        addView(this.jr, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
        if (dynamicRootView.getRenderRequest() == null || dynamicRootView.getRenderRequest().jsj()) {
            return;
        }
        this.jr.setVisibility(8);
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        super.vy();
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            ((ImageView) this.jr).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) this.jr).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.gbb.mIsMute);
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            Drawable pcc = com.bytedance.sdk.component.adexpress.oo.gm.pcc(getContext(), this.tmg);
            if (pcc == null) {
                return true;
            }
            ((ImageView) this.jr).setBackground(pcc);
            return true;
        }
        ((ImageView) this.jr).setBackgroundDrawable(com.bytedance.sdk.component.adexpress.oo.kj.pcc(0, Integer.valueOf(this.tmg.mk()), new int[]{this.kj / 2}, null, null, null));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sf
    public void setSoundMute(boolean z) {
        int oo;
        if (z) {
            oo = com.bytedance.sdk.component.utils.tz.oo(getContext(), "tt_reward_full_mute");
        } else {
            oo = com.bytedance.sdk.component.utils.tz.oo(getContext(), "tt_reward_full_unmute");
        }
        ((ImageView) this.jr).setImageResource(oo);
        if (((ImageView) this.jr).getDrawable() != null) {
            ((ImageView) this.jr).getDrawable().setAutoMirrored(true);
        }
    }
}
