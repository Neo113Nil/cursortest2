package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.material.MenuKt;
import com.bytedance.sdk.component.utils.atb;
import com.bytedance.sdk.component.utils.tz;

/* loaded from: classes4.dex */
public class vh implements qf<ViewGroup> {
    private final com.bytedance.sdk.component.adexpress.wh.ork pcc;
    private final FrameLayout sf;

    public vh(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar, String str, String str2) {
        int i;
        com.bytedance.sdk.component.adexpress.wh.ork orkVar = new com.bytedance.sdk.component.adexpress.wh.ork(context);
        this.pcc = orkVar;
        orkVar.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.sf = frameLayout;
        frameLayout.addView(orkVar, new FrameLayout.LayoutParams(-2, -2));
        double ew = qfVar.ew();
        ew = ew == 0.0d ? 1.0d : ew;
        double tmh = qfVar.tmh();
        double d = tmh != 0.0d ? tmh : 1.0d;
        if ("22".equals(str2)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, 250.0f));
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, 120.0f);
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        if ("20".equals(str2)) {
            pcc(context, frameLayout, qfVar);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 81;
            if (qfVar.hpk() > 0) {
                i = qfVar.hpk();
            } else {
                i = com.bytedance.sdk.component.adexpress.oo.sf() ? 0 : MenuKt.InTransitionDuration;
            }
            layoutParams2.bottomMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, i);
            frameLayout.setLayoutParams(layoutParams2);
            frameLayout.setClipChildren(false);
            return;
        }
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (vjVar.getDynamicWidth() * 0.32d * ew), (int) (vjVar.getDynamicWidth() * 0.32d * d));
        layoutParams3.gravity = 17;
        frameLayout.setLayoutParams(layoutParams3);
    }

    private void pcc(Context context, FrameLayout frameLayout, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, -atb.pcc(context, 5.0f), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(context.getString(tz.sf(context, "tt_splash_brush_mask_title")));
        textView.setTextColor(-1);
        textView.setTextSize(2, 20.0f);
        TextView textView2 = new TextView(context);
        textView2.setId(2097610738);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, atb.pcc(context, 5.0f), 0, 0);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(tz.sf(context, "tt_splash_brush_mask_hint")));
        if (qfVar != null && !TextUtils.isEmpty(qfVar.erj())) {
            textView2.setText(qfVar.erj());
        }
        textView2.setTextColor(-1);
        textView2.setTextSize(2, 14.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void pcc() {
        this.pcc.kj();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void sf() {
        this.pcc.wh();
        ViewParent parent = this.sf.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.sf);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public ViewGroup gm() {
        return this.sf;
    }
}
