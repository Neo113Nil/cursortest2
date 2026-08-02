package androidx.transition;

/* loaded from: classes7.dex */
class TranslationAnimationCreator {
    static android.animation.Animator Camera2StreamConfigurationMap(android.view.View view, androidx.transition.TransitionValues transitionValues, int i, int i2, float f, float f2, float f3, float f4, android.animation.TimeInterpolator timeInterpolator, androidx.transition.Transition transition) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) transitionValues.view.getTag(androidx.transition.R.id.transition_position)) != null) {
            f = (r2[0] - i) + translationX;
            f2 = (r2[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        android.animation.ObjectAnimator ofPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(view, android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_X, f, f3), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_Y, f2, f4));
        androidx.transition.TranslationAnimationCreator.TransitionPositionListener transitionPositionListener = new androidx.transition.TranslationAnimationCreator.TransitionPositionListener(view, transitionValues.view, translationX, translationY);
        transition.addListener(transitionPositionListener);
        ofPropertyValuesHolder.addListener(transitionPositionListener);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    static class TransitionPositionListener extends android.animation.AnimatorListenerAdapter implements androidx.transition.Transition.TransitionListener {
        private boolean Camera2StreamConfigurationMap;
        private float getHighResolutionOutputSizeshNQ4ISI;
        private float getHighSpeedVideoFpsRanges;
        private final android.view.View getHighSpeedVideoFpsRangesFor;
        private final float getHighSpeedVideoSizes;
        private final float getInputFormats;
        private final android.view.View getOutputFormats;
        private int[] getOutputMinFrameDuration;

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition transition) {
        }

        TransitionPositionListener(android.view.View view, android.view.View view2, float f, float f2) {
            this.getHighSpeedVideoFpsRangesFor = view;
            this.getOutputFormats = view2;
            this.getHighSpeedVideoSizes = f;
            this.getInputFormats = f2;
            int[] iArr = (int[]) view2.getTag(androidx.transition.R.id.transition_position);
            this.getOutputMinFrameDuration = iArr;
            if (iArr != null) {
                view2.setTag(androidx.transition.R.id.transition_position, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRangesFor.setTranslationX(this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoFpsRangesFor.setTranslationY(this.getInputFormats);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator, boolean z) {
            if (z) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.setTranslationX(this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoFpsRangesFor.setTranslationY(this.getInputFormats);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition transition, boolean z) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.getOutputFormats.setTag(androidx.transition.R.id.transition_position, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition transition) {
            onTransitionEnd(transition, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition transition) {
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRangesFor.setTranslationX(this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoFpsRangesFor.setTranslationY(this.getInputFormats);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition transition) {
            this.getHighSpeedVideoFpsRangesFor.setTranslationX(this.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoFpsRangesFor.setTranslationY(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition transition) {
            if (this.getOutputMinFrameDuration == null) {
                this.getOutputMinFrameDuration = new int[2];
            }
            this.getHighSpeedVideoFpsRangesFor.getLocationOnScreen(this.getOutputMinFrameDuration);
            this.getOutputFormats.setTag(androidx.transition.R.id.transition_position, this.getOutputMinFrameDuration);
            this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor.getTranslationX();
            this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getTranslationY();
            this.getHighSpeedVideoFpsRangesFor.setTranslationX(this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoFpsRangesFor.setTranslationY(this.getInputFormats);
        }
    }

    private TranslationAnimationCreator() {
    }
}
