package com.bytedance.sdk.component.adexpress.wh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class qf extends fum {
    private AnimatorSet gm;
    private TextView pcc;
    private View sf;

    @Override // com.bytedance.sdk.component.adexpress.wh.fum
    protected void pcc(Context context) {
    }

    public qf(Context context) {
        super(context);
        this.gm = new AnimatorSet();
        sf(context);
    }

    private void sf(Context context) {
        View pcc = com.bytedance.sdk.component.adexpress.gm.pcc.pcc(context);
        this.sf = pcc;
        addView(pcc);
        setClipChildren(false);
        this.pcc = (TextView) findViewById(2097610748);
    }

    public void setButtonText(String str) {
        if (this.pcc == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.pcc.setText(str);
    }

    private void oo() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.sf, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), -3.0f));
        ofFloat.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.sf, "alpha", 1.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new CycleInterpolator(1.0f));
        ofFloat2.setRepeatCount(-1);
        this.gm.playTogether(ofFloat, ofFloat2);
        this.gm.setDuration(1000L);
        this.gm.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.wh.fum
    public void pcc() {
        oo();
    }

    @Override // com.bytedance.sdk.component.adexpress.wh.fum
    public void sf() {
        this.gm.cancel();
    }
}
