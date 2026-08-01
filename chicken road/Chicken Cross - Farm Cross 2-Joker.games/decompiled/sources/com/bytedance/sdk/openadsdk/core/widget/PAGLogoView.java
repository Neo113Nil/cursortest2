package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class PAGLogoView extends LinearLayout {
    protected int containerHeight;
    private com.bytedance.sdk.openadsdk.core.wh.oo mAdLogo;
    private com.bytedance.sdk.openadsdk.core.wh.kj mAdText;

    public PAGLogoView(Context context) {
        this(context, null);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView(context);
    }

    private void initView(Context context) {
        int sf = rj.sf(context, 2.0f);
        this.containerHeight = rj.sf(getContext(), 12.0f);
        this.mAdLogo = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(rj.sf(context, 14.0f), rj.sf(context, 6.0f));
        layoutParams.leftMargin = sf;
        this.mAdLogo.setLayoutParams(layoutParams);
        this.mAdLogo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.mAdText = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, this.containerHeight);
        layoutParams2.leftMargin = sf;
        layoutParams2.rightMargin = sf;
        this.mAdText.setLayoutParams(layoutParams2);
        this.mAdText.setTextSize(1, 8.0f);
        this.mAdText.setGravity(17);
        this.mAdText.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(this.mAdLogo);
        addView(this.mAdText);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(sf);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    public static PAGLogoView createPAGLogoViewByMaterial(Context context, of ofVar) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.initData(ofVar);
        return pAGLogoView;
    }

    public void initData(of ofVar) {
        if (ofVar == null) {
            return;
        }
        initData(ofVar.bo());
    }

    public void initData(com.bytedance.sdk.openadsdk.core.model.sf sfVar) {
        if (sfVar == null) {
            return;
        }
        if (sfVar.wh()) {
            this.mAdLogo.setImageDrawable(tz.gm(com.bytedance.sdk.openadsdk.core.lu.pcc(), "tt_ad_logo"));
        } else {
            String pcc = sfVar.pcc();
            if (TextUtils.isEmpty(pcc)) {
                this.mAdLogo.setVisibility(8);
            } else {
                if (pcc.contains("logo")) {
                    this.mAdLogo.setImageDrawable(tz.gm(com.bytedance.sdk.openadsdk.core.lu.pcc(), "tt_ad_logo"));
                } else {
                    com.bytedance.sdk.openadsdk.ork.oo.pcc(pcc).gm(1).pcc(this.mAdLogo);
                }
                this.mAdLogo.setVisibility(0);
            }
        }
        String sf = sfVar.sf();
        if (sfVar.wh()) {
            this.mAdText.setText(tz.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), "tt_logo_en"));
        } else if (TextUtils.isEmpty(sf)) {
            this.mAdText.setVisibility(8);
        } else {
            this.mAdText.setText(sf);
            this.mAdText.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = this.containerHeight;
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.wh.vy.pcc(this, layoutParams));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
