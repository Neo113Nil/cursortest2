package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

/* loaded from: classes5.dex */
public final class f {

    public static final class a implements android.animation.Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ android.view.View f7621a;
        public final /* synthetic */ float b;

        public a(android.view.View view, float f) {
            this.f7621a = view;
            this.b = f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            this.f7621a.setScaleX(this.b);
            this.f7621a.setScaleY(this.b);
            this.f7621a.setVisibility(0);
        }
    }

    public static final void a(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 1.05f);
        ofFloat.setDuration(750L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.05f);
        ofFloat2.setDuration(750L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 1.05f, 1.0f);
        ofFloat3.setDuration(750L);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 1.05f, 1.0f);
        ofFloat4.setDuration(750L);
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 0.0f, 1.05f);
        ofFloat5.setDuration(250L);
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 0.0f, 1.05f);
        ofFloat6.setDuration(250L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(ofFloat5).with(ofFloat6);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.play(ofFloat3).with(ofFloat4);
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        animatorSet3.play(ofFloat).with(ofFloat2);
        android.animation.AnimatorSet animatorSet4 = new android.animation.AnimatorSet();
        animatorSet4.addListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f.a(view, 0.0f));
        animatorSet4.playSequentially(animatorSet, animatorSet2, animatorSet3);
        animatorSet4.setStartDelay(1000L);
        animatorSet4.start();
    }
}
