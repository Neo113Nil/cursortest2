package com.google.android.material.animation;

/* loaded from: classes8.dex */
public interface AnimatableView {

    public interface Listener {
        void onAnimationEnd();
    }

    void startAnimation(com.google.android.material.animation.AnimatableView.Listener listener);

    void stopAnimation();
}
