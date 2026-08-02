package com.google.android.material.tabs;

/* loaded from: classes8.dex */
class FadeTabIndicatorInterpolator extends com.google.android.material.tabs.TabIndicatorInterpolator {
    private static final float FADE_THRESHOLD = 0.5f;

    FadeTabIndicatorInterpolator() {
    }

    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    void updateIndicatorForOffset(com.google.android.material.tabs.TabLayout tabLayout, android.view.View view, android.view.View view2, float f, android.graphics.drawable.Drawable drawable) {
        float lerp;
        if (f >= 0.5f) {
            view = view2;
        }
        android.graphics.RectF calculateIndicatorWidthForTab = calculateIndicatorWidthForTab(tabLayout, view);
        if (f < 0.5f) {
            lerp = com.google.android.material.animation.AnimationUtils.lerp(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            lerp = com.google.android.material.animation.AnimationUtils.lerp(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) calculateIndicatorWidthForTab.left, drawable.getBounds().top, (int) calculateIndicatorWidthForTab.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (lerp * 255.0f));
    }
}
