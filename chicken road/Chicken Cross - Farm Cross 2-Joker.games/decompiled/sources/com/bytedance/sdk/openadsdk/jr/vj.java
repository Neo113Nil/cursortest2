package com.bytedance.sdk.openadsdk.jr;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.core.wh.kj;
import com.bytedance.sdk.openadsdk.core.wh.qf;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class vj extends qf {
    public vj(Context context) {
        this(context, null);
    }

    public vj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public vj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        pcc(context);
    }

    private void pcc(Context context) {
        setId(nac.zx);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        kj kjVar = new kj(context);
        kjVar.setId(nac.fi);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        kjVar.setLayoutParams(layoutParams);
        kjVar.setIncludeFontPadding(false);
        kjVar.setText(tz.pcc(context, "tt_video_without_wifi_tips"));
        kjVar.setTextColor(Color.parseColor("#cacaca"));
        kjVar.setTextSize(2, 14.0f);
        addView(kjVar);
        qf qfVar = new qf(context);
        qfVar.setId(nac.dk);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, nac.fi);
        layoutParams2.addRule(13);
        qfVar.setLayoutParams(layoutParams2);
        addView(qfVar);
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        ooVar.setId(nac.rf);
        int sf = rj.sf(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(sf, sf);
        layoutParams3.addRule(15);
        ooVar.setLayoutParams(layoutParams3);
        ooVar.setImageDrawable(tz.gm(context, "tt_new_play_video"));
        ooVar.setScaleType(ImageView.ScaleType.FIT_XY);
        qfVar.addView(ooVar);
    }
}
