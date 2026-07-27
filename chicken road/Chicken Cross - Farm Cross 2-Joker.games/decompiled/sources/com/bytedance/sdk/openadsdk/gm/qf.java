package com.bytedance.sdk.openadsdk.gm;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class qf extends LinearLayout {
    private final ork gm;
    private final FilterWord pcc;
    private kj sf;

    public qf(Context context, FilterWord filterWord, ork orkVar) {
        super(context);
        setOrientation(1);
        this.pcc = filterWord;
        this.gm = orkVar;
        pcc();
    }

    private void pcc() {
        gm();
        sf();
    }

    private void sf() {
        this.sf = new kj(getContext(), this.gm);
        new LinearLayout.LayoutParams(-1, -2);
        this.sf.pcc(this.pcc.getOptions());
        addView(this.sf);
    }

    private void gm() {
        String name = this.pcc.getName();
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = rj.sf(getContext(), 12.0f);
        layoutParams.gravity = 17;
        kjVar.setGravity(17);
        kjVar.setText(name);
        kjVar.setTextColor(Color.argb(85, 22, 24, 35));
        kjVar.setTextSize(this.gm.vy() ? 14 : 10);
        addView(kjVar, layoutParams);
    }
}
