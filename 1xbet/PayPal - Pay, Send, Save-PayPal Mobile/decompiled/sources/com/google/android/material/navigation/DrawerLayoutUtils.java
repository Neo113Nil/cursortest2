package com.google.android.material.navigation;

/* loaded from: classes8.dex */
public class DrawerLayoutUtils {
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;
    private static final int DEFAULT_SCRIM_ALPHA = android.graphics.Color.alpha(DEFAULT_SCRIM_COLOR);

    private DrawerLayoutUtils() {
    }

    public static android.animation.ValueAnimator.AnimatorUpdateListener getScrimCloseAnimatorUpdateListener(final androidx.drawerlayout.widget.DrawerLayout drawerLayout) {
        return new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.DrawerLayoutUtils$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                androidx.drawerlayout.widget.DrawerLayout.this.setScrimColor(androidx.core.graphics.ColorUtils.setAlphaComponent(com.google.android.material.navigation.DrawerLayoutUtils.DEFAULT_SCRIM_COLOR, com.google.android.material.animation.AnimationUtils.lerp(com.google.android.material.navigation.DrawerLayoutUtils.DEFAULT_SCRIM_ALPHA, 0, valueAnimator.getAnimatedFraction())));
            }
        };
    }

    public static android.animation.Animator.AnimatorListener getScrimCloseAnimatorListener(final androidx.drawerlayout.widget.DrawerLayout drawerLayout, final android.view.View view) {
        return new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.navigation.DrawerLayoutUtils.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                androidx.drawerlayout.widget.DrawerLayout.this.closeDrawer(view, false);
                androidx.drawerlayout.widget.DrawerLayout.this.setScrimColor(com.google.android.material.navigation.DrawerLayoutUtils.DEFAULT_SCRIM_COLOR);
            }
        };
    }
}
