package com.facetec.sdk;

@java.lang.FunctionalInterface
/* loaded from: classes8.dex */
interface b extends android.animation.Animator.AnimatorListener {
    @Override // android.animation.Animator.AnimatorListener
    default void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    default void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    default void onAnimationStart(android.animation.Animator animator) {
    }
}
