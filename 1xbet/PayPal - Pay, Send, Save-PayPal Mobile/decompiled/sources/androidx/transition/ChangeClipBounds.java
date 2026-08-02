package androidx.transition;

/* loaded from: classes7.dex */
public class ChangeClipBounds extends androidx.transition.Transition {
    private static final java.lang.String[] getHighSpeedVideoSizes = {"android:clipBounds:clip"};
    static final android.graphics.Rect getHighSpeedVideoFpsRanges = new android.graphics.Rect();

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
        return getHighSpeedVideoSizes;
    }

    public ChangeClipBounds() {
    }

    public ChangeClipBounds(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void Camera2StreamConfigurationMap(androidx.transition.TransitionValues transitionValues, boolean z) {
        android.view.View view = transitionValues.view;
        if (view.getVisibility() != 8) {
            android.graphics.Rect rect = z ? (android.graphics.Rect) view.getTag(androidx.transition.R.id.transition_clip) : null;
            if (rect == null) {
                rect = view.getClipBounds();
            }
            android.graphics.Rect rect2 = rect != getHighSpeedVideoFpsRanges ? rect : null;
            transitionValues.values.put("android:clipBounds:clip", rect2);
            if (rect2 == null) {
                transitionValues.values.put("android:clipBounds:bounds", new android.graphics.Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        Camera2StreamConfigurationMap(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        Camera2StreamConfigurationMap(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null || !transitionValues.values.containsKey("android:clipBounds:clip") || !transitionValues2.values.containsKey("android:clipBounds:clip")) {
            return null;
        }
        android.graphics.Rect rect = (android.graphics.Rect) transitionValues.values.get("android:clipBounds:clip");
        android.graphics.Rect rect2 = (android.graphics.Rect) transitionValues2.values.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        android.graphics.Rect rect3 = rect == null ? (android.graphics.Rect) transitionValues.values.get("android:clipBounds:bounds") : rect;
        android.graphics.Rect rect4 = rect2 == null ? (android.graphics.Rect) transitionValues2.values.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        transitionValues2.view.setClipBounds(rect);
        android.animation.ObjectAnimator ofObject = android.animation.ObjectAnimator.ofObject(transitionValues2.view, (android.util.Property<android.view.View, V>) androidx.transition.ViewUtils.getHighSpeedVideoSizes, (android.animation.TypeEvaluator) new androidx.transition.RectEvaluator(new android.graphics.Rect()), (java.lang.Object[]) new android.graphics.Rect[]{rect3, rect4});
        androidx.transition.ChangeClipBounds.Listener listener = new androidx.transition.ChangeClipBounds.Listener(transitionValues2.view, rect, rect2);
        ofObject.addListener(listener);
        addListener(listener);
        return ofObject;
    }

    static class Listener extends android.animation.AnimatorListenerAdapter implements androidx.transition.Transition.TransitionListener {
        private final android.view.View Camera2StreamConfigurationMap;
        private final android.graphics.Rect getHighResolutionOutputSizeshNQ4ISI;
        private final android.graphics.Rect getHighSpeedVideoSizes;

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition transition) {
        }

        Listener(android.view.View view, android.graphics.Rect rect, android.graphics.Rect rect2) {
            this.Camera2StreamConfigurationMap = view;
            this.getHighResolutionOutputSizeshNQ4ISI = rect;
            this.getHighSpeedVideoSizes = rect2;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition transition) {
            android.graphics.Rect clipBounds = this.Camera2StreamConfigurationMap.getClipBounds();
            if (clipBounds == null) {
                clipBounds = androidx.transition.ChangeClipBounds.getHighSpeedVideoFpsRanges;
            }
            this.Camera2StreamConfigurationMap.setTag(androidx.transition.R.id.transition_clip, clipBounds);
            this.Camera2StreamConfigurationMap.setClipBounds(this.getHighSpeedVideoSizes);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition transition) {
            this.Camera2StreamConfigurationMap.setClipBounds((android.graphics.Rect) this.Camera2StreamConfigurationMap.getTag(androidx.transition.R.id.transition_clip));
            this.Camera2StreamConfigurationMap.setTag(androidx.transition.R.id.transition_clip, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator, boolean z) {
            if (!z) {
                this.Camera2StreamConfigurationMap.setClipBounds(this.getHighSpeedVideoSizes);
            } else {
                this.Camera2StreamConfigurationMap.setClipBounds(this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }
    }
}
