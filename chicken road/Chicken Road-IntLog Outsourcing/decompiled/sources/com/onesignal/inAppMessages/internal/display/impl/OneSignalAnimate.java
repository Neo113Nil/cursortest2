package com.onesignal.inAppMessages.internal.display.impl;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OneSignalAnimate {
    public static final OneSignalAnimate INSTANCE = new OneSignalAnimate();

    private OneSignalAnimate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateViewColor$lambda$0(View view, ValueAnimator valueAnimator) {
        i.e(view, "$view");
        i.e(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        i.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setBackgroundColor(((Integer) animatedValue).intValue());
    }

    public final Animation animateViewByTranslation(View view, float f3, float f6, int i2, Interpolator interpolator, Animation.AnimationListener animationListener) {
        i.e(view, "view");
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f3, f6);
        translateAnimation.setDuration(i2);
        translateAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            translateAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(translateAnimation);
        return translateAnimation;
    }

    public final ValueAnimator animateViewColor(final View view, int i2, int i3, int i6, Animator.AnimatorListener animatorListener) {
        i.e(view, "view");
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(i2);
        valueAnimator.setIntValues(i3, i6);
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.onesignal.inAppMessages.internal.display.impl.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                OneSignalAnimate.animateViewColor$lambda$0(view, valueAnimator2);
            }
        });
        if (animatorListener != null) {
            valueAnimator.addListener(animatorListener);
        }
        return valueAnimator;
    }

    public final Animation animateViewSmallToLarge(View view, int i2, Interpolator interpolator, Animation.AnimationListener animationListener) {
        i.e(view, "view");
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i2);
        scaleAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            scaleAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(scaleAnimation);
        return scaleAnimation;
    }
}
