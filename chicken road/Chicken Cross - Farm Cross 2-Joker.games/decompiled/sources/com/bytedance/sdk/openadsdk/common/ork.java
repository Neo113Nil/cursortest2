package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class ork extends RelativeLayout {
    public ork(Context context) {
        super(context);
        pcc();
    }

    private void pcc() {
        Context context = getContext();
        int sf = rj.sf(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, rj.sf(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        ooVar.setId(520093720);
        ooVar.setClickable(true);
        ooVar.setFocusable(true);
        ooVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.vh.pcc(context, "tt_leftbackicon_selector"));
        int sf2 = rj.sf(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(sf2, sf2);
        layoutParams.leftMargin = sf;
        layoutParams.addRule(15);
        addView(ooVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar2 = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        ooVar2.setId(520093716);
        ooVar2.setClickable(true);
        ooVar2.setFocusable(true);
        ooVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.vh.pcc(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(sf2, sf2);
        layoutParams2.leftMargin = sf;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(ooVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar3 = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        ooVar3.setId(com.bytedance.sdk.openadsdk.utils.nac.jy);
        ooVar3.setImageDrawable(com.bytedance.sdk.component.utils.tz.gm(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(sf2, sf2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = sf;
        addView(ooVar3, layoutParams3);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        kjVar.setId(com.bytedance.sdk.openadsdk.utils.nac.vd);
        kjVar.setSingleLine(true);
        kjVar.setEllipsize(TextUtils.TruncateAt.END);
        kjVar.setGravity(17);
        kjVar.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        kjVar.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(rj.sf(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, com.bytedance.sdk.openadsdk.utils.nac.jy);
        int sf3 = rj.sf(context, 25.0f);
        layoutParams4.rightMargin = sf3;
        layoutParams4.leftMargin = sf3;
        addView(kjVar, layoutParams4);
    }
}
