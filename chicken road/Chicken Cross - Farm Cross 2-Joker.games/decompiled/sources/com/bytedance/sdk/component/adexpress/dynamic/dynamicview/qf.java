package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class qf extends wh {
    public qf(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        this.jr = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.pcc(context);
        this.jr.setTag(Integer.valueOf(getClickArea()));
        addView(this.jr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (com.bytedance.sdk.component.adexpress.oo.sf() && "fillButton".equals(this.hc.ork().sf())) {
            ((TextView) this.jr).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView) this.jr).setMaxLines(1);
            FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
            widgetLayoutParams.width -= this.tmg.lu() * 2;
            widgetLayoutParams.height -= this.tmg.lu() * 2;
            widgetLayoutParams.topMargin += this.tmg.lu();
            widgetLayoutParams.leftMargin += this.tmg.lu();
            widgetLayoutParams.setMarginStart(widgetLayoutParams.leftMargin);
            widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
            return widgetLayoutParams;
        }
        return super.getWidgetLayoutParams();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        super.vy();
        if (TextUtils.equals("download-progress-button", this.hc.ork().sf()) && TextUtils.isEmpty(this.tmg.ork())) {
            this.jr.setVisibility(4);
            return true;
        }
        this.jr.setTextAlignment(this.tmg.kj());
        ((TextView) this.jr).setText(this.tmg.ork());
        ((TextView) this.jr).setTextColor(this.tmg.qf());
        ((TextView) this.jr).setTextSize(this.tmg.vj());
        ((TextView) this.jr).setGravity(17);
        ((TextView) this.jr).setIncludeFontPadding(false);
        if ("fillButton".equals(this.hc.ork().sf())) {
            this.jr.setPadding(0, 0, 0, 0);
        } else {
            this.jr.setPadding(this.tmg.gm(), this.tmg.sf(), this.tmg.oo(), this.tmg.pcc());
        }
        return true;
    }
}
