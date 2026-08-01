package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class lq extends wh {
    private boolean fum;
    private int lo;
    ObjectAnimator pcc;
    ObjectAnimator sf;
    private Runnable tz;

    public lq(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        this.lo = 0;
        this.fum = false;
        this.tz = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lq.1
            @Override // java.lang.Runnable
            public void run() {
                lq.this.pcc();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc() {
        View childAt;
        final View view;
        final View childAt2 = getChildAt(this.lo);
        int i = this.lo;
        if (i == 0) {
            this.fum = false;
        }
        boolean z = i + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.lo + 1)).getChildCount() <= 0;
        if (!this.hc.ork().vj().pcc() && z) {
            this.fum = true;
            view = getChildAt(this.lo - 1);
            this.pcc = ObjectAnimator.ofFloat(childAt2, "translationY", 0.0f, (this.kj + getChildAt(this.lo).getHeight()) / 2);
        } else {
            if (z) {
                childAt = getChildAt((this.lo + 2) % getChildCount());
            } else {
                childAt = getChildAt((this.lo + 1) % getChildCount());
            }
            this.pcc = ObjectAnimator.ofFloat(childAt2, "translationY", 0.0f, (-(this.kj + getChildAt(this.lo).getHeight())) / 2);
            if (z) {
                this.lo++;
            }
            view = childAt;
        }
        this.pcc.setInterpolator(new LinearInterpolator());
        this.pcc.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lq.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt2.setVisibility(8);
            }
        });
        if (this.fum) {
            this.sf = ObjectAnimator.ofFloat(view, "translationY", (-(this.kj + view.getHeight())) / 2, 0.0f);
        } else {
            this.sf = ObjectAnimator.ofFloat(view, "translationY", (this.kj + view.getHeight()) / 2, 0.0f);
        }
        this.sf.setInterpolator(new LinearInterpolator());
        this.sf.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lq.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                view.setVisibility(0);
            }
        });
        this.pcc.setDuration(500L);
        this.sf.setDuration(500L);
        this.pcc.start();
        this.sf.start();
        if (this.fum) {
            this.lo--;
        } else {
            int i2 = this.lo + 1;
            this.lo = i2;
            this.lo = i2 % getChildCount();
        }
        postDelayed(this.tz, 3000L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.kj - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.tz, 2500L);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mu
    public void sf() {
        removeCallbacks(this.tz);
        ObjectAnimator objectAnimator = this.pcc;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.pcc.cancel();
        }
        ObjectAnimator objectAnimator2 = this.sf;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.sf.cancel();
        }
        super.sf();
    }
}
