package com.bytedance.sdk.component.adexpress.wh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public class vj extends FrameLayout {
    private ImageView pcc;
    private AnimatorSet sf;

    public vj(Context context) {
        super(context);
        gm();
        oo();
    }

    private void gm() {
        ImageView imageView = new ImageView(getContext());
        this.pcc = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.tz.oo(getContext(), "tt_white_hand"));
        int pcc = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(pcc, pcc);
        layoutParams.gravity = 17;
        addView(this.pcc, layoutParams);
    }

    private void oo() {
        this.sf = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.pcc, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        ofFloat.setDuration(2000L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.pcc, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        ofFloat2.setDuration(2000L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.sf.playTogether(ofFloat, ofFloat2);
    }

    public void pcc() {
        AnimatorSet animatorSet = this.sf;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public void sf() {
        AnimatorSet animatorSet = this.sf;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
