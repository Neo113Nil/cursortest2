package androidx.transition;

/* loaded from: classes7.dex */
public abstract class VisibilityPropagation extends androidx.transition.TransitionPropagation {
    private static final java.lang.String[] getHighSpeedVideoSizes = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    @Override // androidx.transition.TransitionPropagation
    public void captureValues(androidx.transition.TransitionValues transitionValues) {
        android.view.View view = transitionValues.view;
        java.lang.Integer num = (java.lang.Integer) transitionValues.values.get("android:visibility:visibility");
        if (num == null) {
            num = java.lang.Integer.valueOf(view.getVisibility());
        }
        transitionValues.values.put("android:visibilityPropagation:visibility", num);
        int[] iArr = {r4, 0};
        view.getLocationOnScreen(iArr);
        int round = iArr[0] + java.lang.Math.round(view.getTranslationX());
        iArr[0] = round + (view.getWidth() / 2);
        int round2 = iArr[1] + java.lang.Math.round(view.getTranslationY());
        iArr[1] = round2;
        iArr[1] = round2 + (view.getHeight() / 2);
        transitionValues.values.put("android:visibilityPropagation:center", iArr);
    }

    @Override // androidx.transition.TransitionPropagation
    public java.lang.String[] getPropagationProperties() {
        return getHighSpeedVideoSizes;
    }

    public int getViewVisibility(androidx.transition.TransitionValues transitionValues) {
        java.lang.Integer num;
        if (transitionValues == null || (num = (java.lang.Integer) transitionValues.values.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int getViewX(androidx.transition.TransitionValues transitionValues) {
        int[] iArr;
        if (transitionValues == null || (iArr = (int[]) transitionValues.values.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[0];
    }

    public int getViewY(androidx.transition.TransitionValues transitionValues) {
        int[] iArr;
        if (transitionValues == null || (iArr = (int[]) transitionValues.values.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[1];
    }
}
