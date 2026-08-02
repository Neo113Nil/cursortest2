package androidx.transition;

/* loaded from: classes3.dex */
public class Fade extends androidx.transition.Visibility {
    public static final int IN = 1;
    public static final int OUT = 2;

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    public Fade(int i) {
        setMode(i);
    }

    public Fade() {
    }

    public Fade(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.transition.Styleable.getHighSpeedVideoFpsRanges);
        setMode(androidx.core.content.res.TypedArrayUtils.getNamedInt(obtainStyledAttributes, (android.content.res.XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        java.lang.Float f = (java.lang.Float) transitionValues.view.getTag(androidx.transition.R.id.transition_pause_alpha);
        if (f == null) {
            if (transitionValues.view.getVisibility() == 0) {
                f = java.lang.Float.valueOf(androidx.transition.ViewUtils.getHighSpeedVideoSizes(transitionValues.view));
            } else {
                f = java.lang.Float.valueOf(0.0f);
            }
        }
        transitionValues.values.put("android:fade:transitionAlpha", f);
    }

    private android.animation.Animator getHighSpeedVideoFpsRanges(android.view.View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(view, f);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, androidx.transition.ViewUtils.getHighSpeedVideoFpsRangesFor, f2);
        androidx.transition.Fade.FadeAnimatorListener fadeAnimatorListener = new androidx.transition.Fade.FadeAnimatorListener(view);
        ofFloat.addListener(fadeAnimatorListener);
        getRootTransition().addListener(fadeAnimatorListener);
        return ofFloat;
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator onAppear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        java.lang.Float f;
        androidx.transition.ViewUtils.getHighSpeedVideoFpsRanges(view);
        return getHighSpeedVideoFpsRanges(view, (transitionValues == null || (f = (java.lang.Float) transitionValues.values.get("android:fade:transitionAlpha")) == null) ? 0.0f : f.floatValue(), 1.0f);
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator onDisappear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        java.lang.Float f;
        java.lang.Float f2;
        androidx.transition.ViewUtils.getHighSpeedVideoFpsRanges(view);
        float f3 = 1.0f;
        android.animation.Animator highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(view, (transitionValues == null || (f2 = (java.lang.Float) transitionValues.values.get("android:fade:transitionAlpha")) == null) ? 1.0f : f2.floatValue(), 0.0f);
        if (highSpeedVideoFpsRanges == null) {
            if (transitionValues2 != null && (f = (java.lang.Float) transitionValues2.values.get("android:fade:transitionAlpha")) != null) {
                f3 = f.floatValue();
            }
            androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(view, f3);
        }
        return highSpeedVideoFpsRanges;
    }

    static class FadeAnimatorListener extends android.animation.AnimatorListenerAdapter implements androidx.transition.Transition.TransitionListener {
        private boolean getHighResolutionOutputSizeshNQ4ISI = false;
        private final android.view.View getHighSpeedVideoSizes;

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition transition, boolean z) {
        }

        FadeAnimatorListener(android.view.View view) {
            this.getHighSpeedVideoSizes = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            if (this.getHighSpeedVideoSizes.hasOverlappingRendering() && this.getHighSpeedVideoSizes.getLayerType() == 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoSizes.setLayerType(2, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator, boolean z) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoSizes.setLayerType(0, null);
            }
            if (z) {
                return;
            }
            androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, 1.0f);
            androidx.transition.ViewUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, 1.0f);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition transition) {
            this.getHighSpeedVideoSizes.setTag(androidx.transition.R.id.transition_pause_alpha, java.lang.Float.valueOf(this.getHighSpeedVideoSizes.getVisibility() == 0 ? androidx.transition.ViewUtils.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes) : 0.0f));
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition transition) {
            this.getHighSpeedVideoSizes.setTag(androidx.transition.R.id.transition_pause_alpha, null);
        }
    }
}
