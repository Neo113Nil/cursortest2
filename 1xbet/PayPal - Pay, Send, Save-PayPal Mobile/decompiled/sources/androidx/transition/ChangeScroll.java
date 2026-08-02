package androidx.transition;

/* loaded from: classes7.dex */
public class ChangeScroll extends androidx.transition.Transition {
    private static final java.lang.String[] getHighSpeedVideoFpsRangesFor = {"android:changeScroll:x", "android:changeScroll:y"};

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    public ChangeScroll() {
    }

    public ChangeScroll(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        getHighSpeedVideoSizes(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        getHighSpeedVideoSizes(transitionValues);
    }

    @Override // androidx.transition.Transition
    public java.lang.String[] getTransitionProperties() {
        return getHighSpeedVideoFpsRangesFor;
    }

    private static void getHighSpeedVideoSizes(androidx.transition.TransitionValues transitionValues) {
        transitionValues.values.put("android:changeScroll:x", java.lang.Integer.valueOf(transitionValues.view.getScrollX()));
        transitionValues.values.put("android:changeScroll:y", java.lang.Integer.valueOf(transitionValues.view.getScrollY()));
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup viewGroup, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        android.animation.ObjectAnimator objectAnimator;
        android.animation.ObjectAnimator objectAnimator2 = null;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        android.view.View view = transitionValues2.view;
        int intValue = ((java.lang.Integer) transitionValues.values.get("android:changeScroll:x")).intValue();
        int intValue2 = ((java.lang.Integer) transitionValues2.values.get("android:changeScroll:x")).intValue();
        int intValue3 = ((java.lang.Integer) transitionValues.values.get("android:changeScroll:y")).intValue();
        int intValue4 = ((java.lang.Integer) transitionValues2.values.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = android.animation.ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = android.animation.ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        return androidx.transition.TransitionUtils.getHighResolutionOutputSizeshNQ4ISI(objectAnimator, objectAnimator2);
    }
}
