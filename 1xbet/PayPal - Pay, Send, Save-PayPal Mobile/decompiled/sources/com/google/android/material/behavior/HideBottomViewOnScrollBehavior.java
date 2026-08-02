package com.google.android.material.behavior;

/* loaded from: classes8.dex */
public class HideBottomViewOnScrollBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> {
    private static final int DEFAULT_ENTER_ANIMATION_DURATION_MS = 225;
    private static final int DEFAULT_EXIT_ANIMATION_DURATION_MS = 175;
    public static final int STATE_SCROLLED_DOWN = 1;
    public static final int STATE_SCROLLED_UP = 2;
    private int additionalHiddenOffsetY;
    private android.view.ViewPropertyAnimator currentAnimator;
    private int currentState;
    private int enterAnimDuration;
    private android.animation.TimeInterpolator enterAnimInterpolator;
    private int exitAnimDuration;
    private android.animation.TimeInterpolator exitAnimInterpolator;
    private int height;
    private final java.util.LinkedHashSet<com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener> onScrollStateChangedListeners;
    private static final int ENTER_ANIM_DURATION_ATTR = com.google.android.material.R.attr.motionDurationLong2;
    private static final int EXIT_ANIM_DURATION_ATTR = com.google.android.material.R.attr.motionDurationMedium4;
    private static final int ENTER_EXIT_ANIM_EASING_ATTR = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator;

    public interface OnScrollStateChangedListener {
        void onStateChanged(android.view.View view, int i);
    }

    /* loaded from: classes3.dex */
    public @interface ScrollState {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, android.view.View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior() {
        this.onScrollStateChangedListeners = new java.util.LinkedHashSet<>();
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }

    public HideBottomViewOnScrollBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onScrollStateChangedListeners = new java.util.LinkedHashSet<>();
        this.height = 0;
        this.currentState = 2;
        this.additionalHiddenOffsetY = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i) {
        this.height = v.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        this.enterAnimDuration = com.google.android.material.motion.MotionUtils.resolveThemeDuration(v.getContext(), ENTER_ANIM_DURATION_ATTR, 225);
        this.exitAnimDuration = com.google.android.material.motion.MotionUtils.resolveThemeDuration(v.getContext(), EXIT_ANIM_DURATION_ATTR, 175);
        android.content.Context context = v.getContext();
        int i2 = ENTER_EXIT_ANIM_EASING_ATTR;
        this.enterAnimInterpolator = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(context, i2, com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.exitAnimInterpolator = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(v.getContext(), i2, com.google.android.material.animation.AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    public void setAdditionalHiddenOffsetY(V v, int i) {
        this.additionalHiddenOffsetY = i;
        if (this.currentState == 1) {
            v.setTranslationY(this.height + i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            slideDown(v);
        } else if (i2 < 0) {
            slideUp(v);
        }
    }

    public boolean isScrolledUp() {
        return this.currentState == 2;
    }

    public void slideUp(V v) {
        slideUp(v, true);
    }

    public void slideUp(V v, boolean z) {
        if (isScrolledUp()) {
            return;
        }
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        updateCurrentState(v, 2);
        if (z) {
            animateChildTo(v, 0, this.enterAnimDuration, this.enterAnimInterpolator);
        } else {
            v.setTranslationY(0.0f);
        }
    }

    public boolean isScrolledDown() {
        return this.currentState == 1;
    }

    public void slideDown(V v) {
        slideDown(v, true);
    }

    public void slideDown(V v, boolean z) {
        if (isScrolledDown()) {
            return;
        }
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        updateCurrentState(v, 1);
        int i = this.height + this.additionalHiddenOffsetY;
        if (z) {
            animateChildTo(v, i, this.exitAnimDuration, this.exitAnimInterpolator);
        } else {
            v.setTranslationY(i);
        }
    }

    private void updateCurrentState(V v, int i) {
        this.currentState = i;
        java.util.Iterator<com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener> it = this.onScrollStateChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v, this.currentState);
        }
    }

    private void animateChildTo(V v, int i, long j, android.animation.TimeInterpolator timeInterpolator) {
        this.currentAnimator = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new android.animation.AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.google.android.material.behavior.HideBottomViewOnScrollBehavior.this.currentAnimator = null;
            }
        });
    }

    public void addOnScrollStateChangedListener(com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.add(onScrollStateChangedListener);
    }

    public void removeOnScrollStateChangedListener(com.google.android.material.behavior.HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.remove(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        this.onScrollStateChangedListeners.clear();
    }
}
