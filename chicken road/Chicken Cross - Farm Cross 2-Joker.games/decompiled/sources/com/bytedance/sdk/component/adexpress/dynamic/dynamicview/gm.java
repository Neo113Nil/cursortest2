package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class gm extends wh {
    private boolean fum;
    private int lo;
    ObjectAnimator pcc;
    ObjectAnimator sf;
    private Runnable tz;

    public gm(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        this.lo = 0;
        this.fum = false;
        this.tz = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gm.1
            @Override // java.lang.Runnable
            public void run() {
                gm.this.pcc();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc() {
        final View childAt;
        final View childAt2 = getChildAt(this.lo);
        if (childAt2 == null) {
            return;
        }
        int i = this.lo;
        if (i == 0) {
            this.fum = false;
        }
        if (i + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.lo + 1)).getChildCount() <= 0) {
            this.fum = true;
            childAt = getChildAt(this.lo - 1);
            this.pcc = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (this.qf + getChildAt(this.lo).getWidth()) / 2);
        } else {
            childAt = getChildAt(this.lo + 1);
            this.pcc = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (-(this.qf + getChildAt(this.lo).getWidth())) / 2);
        }
        if (childAt == null) {
            return;
        }
        this.pcc.setInterpolator(new LinearInterpolator());
        this.pcc.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gm.2
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
            this.sf = ObjectAnimator.ofFloat(childAt, "translationX", (-(this.qf + childAt.getWidth())) / 2, 0.0f);
        } else {
            this.sf = ObjectAnimator.ofFloat(childAt, "translationX", (this.qf + childAt.getWidth()) / 2, 0.0f);
        }
        this.sf.setInterpolator(new LinearInterpolator());
        this.sf.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gm.3
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
                childAt.setVisibility(0);
            }
        });
        this.pcc.setDuration(500L);
        this.sf.setDuration(500L);
        this.pcc.start();
        this.sf.start();
        if (this.fum) {
            this.lo--;
        } else {
            this.lo++;
        }
        postDelayed(this.tz, 2000L);
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
