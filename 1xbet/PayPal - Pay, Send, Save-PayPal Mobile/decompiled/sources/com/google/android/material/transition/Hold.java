package com.google.android.material.transition;

/* loaded from: classes8.dex */
public final class Hold extends androidx.transition.Visibility {
    @Override // androidx.transition.Visibility
    public final android.animation.Animator onAppear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        return android.animation.ValueAnimator.ofFloat(0.0f);
    }

    @Override // androidx.transition.Visibility
    public final android.animation.Animator onDisappear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        return android.animation.ValueAnimator.ofFloat(0.0f);
    }
}
