package com.bytedance.sdk.component.adexpress.wh;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes4.dex */
public class jr extends FrameLayout {
    private tz gm;
    private AnimatorSet oo;
    private Context pcc;
    private ImageView sf;
    private boolean vj;
    private TextView wh;

    public jr(Context context) {
        super(context);
        this.vj = true;
        this.pcc = context;
        this.oo = new AnimatorSet();
        gm();
        oo();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.wh.jr.1
            @Override // java.lang.Runnable
            public void run() {
                int pcc = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(jr.this.pcc, 50.0f);
                int pcc2 = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(jr.this.pcc, 50.0f);
                if (jr.this.gm.getMeasuredHeight() > 0) {
                    pcc = jr.this.gm.getMeasuredHeight();
                }
                if (jr.this.gm.getMeasuredWidth() > 0) {
                    pcc2 = jr.this.gm.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jr.this.sf.getLayoutParams();
                layoutParams.topMargin = ((int) ((pcc / 2.0f) - com.bytedance.sdk.component.adexpress.oo.qf.pcc(jr.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(jr.this.pcc, 40.0f));
                layoutParams.leftMargin = ((int) ((pcc2 / 2.0f) - com.bytedance.sdk.component.adexpress.oo.qf.pcc(jr.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(jr.this.pcc, 20.0f));
                layoutParams.bottomMargin = (int) (((-pcc) / 2.0f) + com.bytedance.sdk.component.adexpress.oo.qf.pcc(jr.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-pcc2) / 2.0f) + com.bytedance.sdk.component.adexpress.oo.qf.pcc(jr.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                jr.this.sf.setLayoutParams(layoutParams);
            }
        });
    }

    private void gm() {
        this.gm = new tz(this.pcc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 50.0f), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 50.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 40.0f);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 20.0f);
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.gm, layoutParams);
        this.sf = new ImageView(this.pcc);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 78.0f), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 78.0f));
        this.sf.setImageResource(com.bytedance.sdk.component.utils.tz.oo(this.pcc, "tt_splash_hand"));
        addView(this.sf, layoutParams2);
        TextView textView = new TextView(this.pcc);
        this.wh = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.pcc, 10.0f);
        addView(this.wh, layoutParams3);
        this.wh.setVisibility(8);
    }

    private void oo() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.sf, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        ofFloat.setDuration(600L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.wh.jr.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(jr.this.sf, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.start();
                jr.this.sf.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (jr.this.vj) {
                    jr.this.gm.pcc();
                }
                jr.this.vj = !r2.vj;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.sf, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        ofFloat2.setDuration(600L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.oo.playTogether(ofFloat, ofFloat2);
    }

    public void setGuideText(String str) {
        this.wh.setVisibility(0);
        this.wh.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.wh.setTextColor(i);
    }

    public void pcc() {
        this.oo.start();
    }

    public void sf() {
        AnimatorSet animatorSet = this.oo;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        tz tzVar = this.gm;
        if (tzVar != null) {
            tzVar.sf();
        }
        ImageView imageView = this.sf;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }
}
