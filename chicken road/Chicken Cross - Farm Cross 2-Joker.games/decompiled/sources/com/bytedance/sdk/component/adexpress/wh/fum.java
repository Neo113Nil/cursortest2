package com.bytedance.sdk.component.adexpress.wh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c;

/* loaded from: classes4.dex */
public class fum extends RelativeLayout {
    private ImageView gm;
    private AnimatorSet kj;
    private TextView oo;
    private String ork;
    private ImageView pcc;
    private AnimatorSet qf;
    private ImageView sf;
    private int vh;
    private TextView vj;
    private AnimatorSet vy;
    private AnimatorSet wh;

    public fum(Context context) {
        super(context);
        this.wh = new AnimatorSet();
        this.qf = new AnimatorSet();
        this.kj = new AnimatorSet();
        this.vy = new AnimatorSet();
        this.vh = 100;
        pcc(context);
    }

    public fum(Context context, String str) {
        super(context);
        this.wh = new AnimatorSet();
        this.qf = new AnimatorSet();
        this.kj = new AnimatorSet();
        this.vy = new AnimatorSet();
        this.vh = 100;
        setClipChildren(false);
        this.ork = str;
        pcc(context);
    }

    protected void pcc(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.oo.pcc();
        }
        if (CampaignEx.CLICKMODE_ON.equals(this.ork)) {
            addView(com.bytedance.sdk.component.adexpress.gm.pcc.wh(context));
            this.vh = (int) (this.vh * 1.25d);
        } else {
            addView(com.bytedance.sdk.component.adexpress.gm.pcc.vj(context));
        }
        this.pcc = (ImageView) findViewById(2097610734);
        this.sf = (ImageView) findViewById(2097610735);
        this.oo = (TextView) findViewById(2097610730);
        this.gm = (ImageView) findViewById(2097610733);
        this.vj = (TextView) findViewById(2097610731);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.wh;
    }

    public void pcc() {
        gm();
        this.wh.start();
        this.wh.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.wh.fum.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                fum.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.wh.fum.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        fum.this.wh.start();
                    }
                }, 200L);
            }
        });
    }

    public void gm() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.pcc, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.pcc, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.pcc, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), -this.vh));
        ofFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), this.vh));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.wh.fum.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (fum.this.gm != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) fum.this.gm.getLayoutParams();
                    layoutParams.height = num.intValue();
                    fum.this.gm.setLayoutParams(layoutParams);
                }
            }
        });
        ofInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.gm, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.gm, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.sf, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.sf, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.sf, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.sf, "scaleY", 0.0f, 1.0f);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.sf, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.oo.qf.pcc(getContext(), -this.vh));
        ofFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.qf.setDuration(50L);
        this.vy.setDuration(c.m);
        this.kj.setDuration(50L);
        this.qf.playTogether(ofFloat2, ofFloat7, ofFloat5);
        this.kj.playTogether(ofFloat, ofFloat6, ofFloat8, ofFloat9, ofFloat4);
        this.vy.playTogether(ofFloat3, ofInt, ofFloat10);
        this.wh.playSequentially(this.kj, this.vy, this.qf);
    }

    public void sf() {
        try {
            AnimatorSet animatorSet = this.wh;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.kj;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.qf;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.vy;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void setGuideText(String str) {
        TextView textView = this.oo;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.vj != null) {
            if (TextUtils.isEmpty(str)) {
                this.vj.setText("");
            } else {
                this.vj.setText(str);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sf();
    }
}
