package com.bytedance.sdk.openadsdk.gbb.pcc.sf;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.core.wh.gm;
import com.bytedance.sdk.openadsdk.core.wh.kj;
import com.bytedance.sdk.openadsdk.core.wh.oo;
import com.bytedance.sdk.openadsdk.core.wh.qf;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class sf extends gm {
    private Context pcc;

    public sf(Context context) {
        super(context);
        this.pcc = context;
        sf();
    }

    private void sf() {
        setVisibility(8);
    }

    public void pcc() {
        Context context = getContext();
        if (getChildCount() > 0) {
            setVisibility(0);
            return;
        }
        qf qfVar = new qf(context);
        qfVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        kj kjVar = new kj(context);
        kjVar.setText(tz.sf(context, "tt_history_no_data"));
        kjVar.setId(nac.vgx);
        kjVar.setTextSize(2, 18.0f);
        Typeface create = Build.VERSION.SDK_INT >= 28 ? Typeface.create(kjVar.getTypeface(), 500, false) : null;
        if (create != null) {
            kjVar.setTypeface(create);
        }
        kjVar.setTextColor(Color.parseColor("#333333"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        layoutParams.topMargin = pcc(16.0f);
        layoutParams.bottomMargin = pcc(8.0f);
        qfVar.addView(kjVar, layoutParams);
        oo ooVar = new oo(context);
        ooVar.setImageResource(tz.oo(context, "tt_history_empty_icon"));
        ooVar.setId(nac.otd);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(pcc(72.0f), pcc(72.0f));
        layoutParams2.addRule(2, kjVar.getId());
        layoutParams2.addRule(14);
        qfVar.addView(ooVar, layoutParams2);
        kj kjVar2 = new kj(context);
        kjVar2.setText(tz.sf(context, "tt_history_placeholder_submessage"));
        kjVar2.setTextSize(2, 14.0f);
        kjVar2.setTextColor(Color.parseColor("#666666"));
        kjVar2.setGravity(17);
        kjVar2.setMaxWidth(pcc(280.0f));
        kjVar2.setLineSpacing(pcc(2.0f), 1.0f);
        kjVar2.setPadding(pcc(20.0f), 0, pcc(20.0f), 0);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(3, kjVar.getId());
        layoutParams3.addRule(14);
        layoutParams3.topMargin = pcc(8.0f);
        qfVar.addView(kjVar2, layoutParams3);
        addView(qfVar);
    }

    private int pcc(float f) {
        return rj.sf(this.pcc, f);
    }
}
