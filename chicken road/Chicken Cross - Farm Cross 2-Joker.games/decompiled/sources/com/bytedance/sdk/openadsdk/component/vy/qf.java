package com.bytedance.sdk.openadsdk.component.vy;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class qf extends com.bytedance.sdk.openadsdk.core.wh.qf {
    private final com.bytedance.sdk.openadsdk.core.wh.kj gm;
    private final com.bytedance.sdk.openadsdk.core.wh.oo pcc;
    private final com.bytedance.sdk.openadsdk.core.wh.oo sf;

    public qf(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int sf = rj.sf(context, 12.0f);
        int sf2 = rj.sf(context, 16.0f);
        int sf3 = rj.sf(context, 20.0f);
        int sf4 = rj.sf(context, 24.0f);
        int sf5 = rj.sf(context, 28.0f);
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        this.pcc = ooVar;
        ooVar.setId(520093713);
        int sf6 = rj.sf(getContext(), 5.0f);
        ooVar.setPadding(sf6, sf6, sf6, sf6);
        ooVar.setScaleType(ImageView.ScaleType.CENTER);
        ooVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.oo.pcc());
        ooVar.setImageResource(tz.oo(lu.pcc(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(sf5, sf5);
        layoutParams.topMargin = sf3;
        layoutParams.leftMargin = sf2;
        layoutParams.setMarginStart(sf2);
        ooVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar2 = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        this.sf = ooVar2;
        ooVar2.setId(520093714);
        ooVar2.setPadding(sf6, sf6, sf6, sf6);
        ooVar2.setScaleType(ImageView.ScaleType.CENTER);
        ooVar2.setBackground(com.bytedance.sdk.openadsdk.core.widget.oo.pcc());
        ooVar2.setImageResource(tz.oo(lu.pcc(), "tt_close_btn"));
        if (ooVar2.getDrawable() != null) {
            ooVar2.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(sf5, sf5);
        layoutParams2.topMargin = sf3;
        layoutParams2.rightMargin = sf2;
        layoutParams2.setMarginEnd(sf2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        ooVar2.setLayoutParams(layoutParams2);
        ooVar2.setVisibility(4);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.gm = kjVar;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, sf4);
        layoutParams3.topMargin = sf3;
        layoutParams3.rightMargin = sf2;
        layoutParams3.addRule(11);
        layoutParams3.setMarginEnd(sf2);
        layoutParams3.addRule(21);
        kjVar.setLayoutParams(layoutParams3);
        kjVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.oo.sf());
        kjVar.setGravity(17);
        kjVar.setPadding(sf, 0, sf, 0);
        kjVar.setTextColor(-1);
        kjVar.setTextSize(1, 14.0f);
        kjVar.setVisibility(4);
        addView(ooVar);
        addView(kjVar);
        addView(ooVar2);
    }

    public View getTopDislike() {
        return this.pcc;
    }

    public com.bytedance.sdk.openadsdk.core.wh.oo getTopSkip() {
        return this.sf;
    }

    public com.bytedance.sdk.openadsdk.core.wh.kj getTopCountDown() {
        return this.gm;
    }
}
