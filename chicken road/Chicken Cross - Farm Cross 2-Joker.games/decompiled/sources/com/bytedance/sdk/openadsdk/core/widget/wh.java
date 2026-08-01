package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class wh extends com.bytedance.sdk.openadsdk.core.wh.oo {
    private float pcc;
    private int sf;

    public wh(Context context) {
        super(context);
        this.pcc = 2.25f;
        this.sf = 12;
        pcc();
    }

    public wh(Context context, int i, float f) {
        super(context);
        this.pcc = f;
        this.sf = i;
        pcc();
    }

    private void pcc() {
        setBackground(oo.pcc());
        setImageResource(tz.oo(getContext(), "tt_close_btn"));
        int sf = rj.sf(getContext(), this.pcc);
        setPadding(sf, sf, sf, sf);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wh.oo, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int sf = rj.sf(getContext(), this.sf);
            layoutParams.width = sf;
            layoutParams.height = sf;
        }
        super.setLayoutParams(layoutParams);
    }

    public static com.bytedance.sdk.openadsdk.core.wh.oo pcc(Context context) {
        return new wh(context);
    }

    public static com.bytedance.sdk.openadsdk.core.wh.oo sf(Context context) {
        return new wh(context, 28, 5.0f);
    }

    public static com.bytedance.sdk.openadsdk.core.wh.oo pcc(Context context, ViewGroup viewGroup) {
        if (context == null || viewGroup == null) {
            return null;
        }
        wh whVar = new wh(context, 33, 0.0f);
        whVar.setImageResource(tz.oo(context, "tt_ad_close_backup"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = rj.sf(context, 20.0f);
        layoutParams.rightMargin = rj.sf(context, 16.0f);
        whVar.setLayoutParams(layoutParams);
        whVar.setVisibility(8);
        viewGroup.addView(whVar);
        return whVar;
    }
}
