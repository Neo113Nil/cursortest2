package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class hc extends wh {
    public hc(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        this.jr = new TextView(context);
        this.jr.setTag(Integer.valueOf(getClickArea()));
        addView(this.jr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        com.bytedance.sdk.component.adexpress.sf.hc renderRequest;
        super.vy();
        this.jr.setTextAlignment(this.tmg.kj());
        ((TextView) this.jr).setTextColor(this.tmg.qf());
        ((TextView) this.jr).setTextSize(this.tmg.vj());
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            int i = 0;
            ((TextView) this.jr).setIncludeFontPadding(false);
            ((TextView) this.jr).setTextSize(Math.min(((com.bytedance.sdk.component.adexpress.oo.qf.sf(com.bytedance.sdk.component.adexpress.oo.pcc(), this.kj) - this.tmg.sf()) - this.tmg.pcc()) - 0.5f, this.tmg.vj()));
            if (this.gbb != null && (renderRequest = this.gbb.getRenderRequest()) != null) {
                String mk = renderRequest.mk();
                if (!TextUtils.isEmpty(mk)) {
                    ((TextView) this.jr).setText(mk);
                    ((TextView) this.jr).setVisibility(i);
                    return true;
                }
            }
            i = 8;
            ((TextView) this.jr).setVisibility(i);
            return true;
        }
        if (pcc()) {
            if (com.bytedance.sdk.component.adexpress.dynamic.vj.vh.sf()) {
                ((TextView) this.jr).setText(com.bytedance.sdk.component.adexpress.dynamic.vj.vh.pcc());
                return true;
            }
            ((TextView) this.jr).setText(com.bytedance.sdk.component.adexpress.dynamic.vj.vh.pcc(this.tmg.sf));
            return true;
        }
        ((TextView) this.jr).setText(com.bytedance.sdk.component.utils.tz.sf(getContext(), "tt_logo_cn"));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj
    public void wh() {
        com.bytedance.sdk.component.adexpress.sf.hc renderRequest = this.gbb.getRenderRequest();
        if (renderRequest != null && TextUtils.isEmpty(renderRequest.tsz())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.qf, this.kj);
            layoutParams.gravity = 17;
            setLayoutParams(layoutParams);
            return;
        }
        super.wh();
    }

    private boolean pcc() {
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.tmg.sf) && this.tmg.sf.contains("adx:")) || com.bytedance.sdk.component.adexpress.dynamic.vj.vh.sf();
    }
}
