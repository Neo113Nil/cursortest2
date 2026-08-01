package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.media3.exoplayer.upstream.CmcdData;

/* loaded from: classes4.dex */
public class jsj extends qf implements com.bytedance.sdk.component.adexpress.dynamic.gm {
    private boolean lo;
    private boolean pcc;
    private boolean sf;

    public jsj(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(kjVar.ork().sf())) {
            dynamicRootView.setTimedown(this.kj);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qf, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        super.vy();
        if (com.bytedance.sdk.component.adexpress.oo.wh.sf(this.gbb.getRenderRequest().oo())) {
            setVisibility(8);
        }
        if ("timedown".equals(this.hc.ork().sf())) {
            ((TextView) this.jr).setText(String.valueOf((int) Double.parseDouble(this.tmg.ork())));
            return true;
        }
        ((TextView) this.jr).setText(((int) Double.parseDouble(this.tmg.ork())) + CmcdData.Factory.STREAMING_FORMAT_SS);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj
    public void wh() {
        if (TextUtils.equals("skip-with-countdowns-video-countdown", this.hc.ork().sf()) || TextUtils.equals("skip-with-time-countdown", this.hc.ork().sf())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.qf, this.kj);
            layoutParams.gravity = 8388627;
            if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                layoutParams.leftMargin = this.vy;
            }
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
            setLayoutParams(layoutParams);
            return;
        }
        super.wh();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.jr).getText())) {
            setMeasuredDimension(0, this.kj);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm
    public void pcc(CharSequence charSequence, boolean z, int i, boolean z2) {
        String str = "";
        if (z2 || this.lo) {
            ((TextView) this.jr).setText("");
            setVisibility(8);
            return;
        }
        try {
            if (Integer.parseInt((String) charSequence) <= 0) {
                setVisibility(8);
                return;
            }
        } catch (Exception unused) {
        }
        setVisibility(0);
        if (!z && this.gbb.getRenderRequest().pcc() && com.bytedance.sdk.component.adexpress.oo.wh.sf(this.gbb.getRenderRequest().oo())) {
            if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                ((TextView) this.jr).setText(i + CmcdData.Factory.STREAMING_FORMAT_SS);
            } else {
                ((TextView) this.jr).setText(String.format(com.bytedance.sdk.component.utils.tz.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), "tt_reward_full_skip"), Integer.valueOf(i)));
            }
            this.pcc = true;
            return;
        }
        if (com.bytedance.sdk.component.adexpress.oo.sf() && !"open_ad".equals(this.gbb.getRenderRequest().oo()) && this.gbb.getRenderRequest().pcc()) {
            this.lo = true;
            setVisibility(8);
            return;
        }
        if (!"timedown".equals(this.hc.ork().sf())) {
            ((TextView) this.jr).setText(((Object) charSequence) + CmcdData.Factory.STREAMING_FORMAT_SS);
            this.sf = true;
            if (this.pcc) {
                CharSequence text = ((TextView) this.jr).getText();
                if (text != null) {
                    str = text.toString();
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (com.bytedance.sdk.component.adexpress.dynamic.vj.vh.sf(str, this.tmg.vj(), true)[0] + com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), this.tmg.gm() + this.tmg.oo())), this.kj);
                layoutParams.gravity = 8388629;
                this.jr.setLayoutParams(layoutParams);
                this.pcc = false;
                requestLayout();
                return;
            }
            return;
        }
        ((TextView) this.jr).setText(charSequence);
    }
}
