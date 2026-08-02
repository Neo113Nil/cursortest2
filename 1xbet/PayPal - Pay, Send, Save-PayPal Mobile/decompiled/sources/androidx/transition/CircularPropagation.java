package androidx.transition;

/* loaded from: classes7.dex */
public class CircularPropagation extends androidx.transition.VisibilityPropagation {
    private float Camera2StreamConfigurationMap = 3.0f;

    public void setPropagationSpeed(float f) {
        if (f == 0.0f) {
            throw new java.lang.IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.Camera2StreamConfigurationMap = f;
    }

    @Override // androidx.transition.TransitionPropagation
    public long getStartDelay(android.view.ViewGroup viewGroup, androidx.transition.Transition transition, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        int i;
        int round;
        int i2;
        if (transitionValues == null && transitionValues2 == null) {
            return 0L;
        }
        if (transitionValues2 == null || getViewVisibility(transitionValues) == 0) {
            i = -1;
        } else {
            transitionValues = transitionValues2;
            i = 1;
        }
        int viewX = getViewX(transitionValues);
        int viewY = getViewY(transitionValues);
        android.graphics.Rect epicenter = transition.getEpicenter();
        if (epicenter != null) {
            i2 = epicenter.centerX();
            round = epicenter.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int round2 = java.lang.Math.round(r5[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            round = java.lang.Math.round(r5[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            i2 = round2;
        }
        float f = i2 - viewX;
        float f2 = round - viewY;
        float sqrt = (float) java.lang.Math.sqrt((f * f) + (f2 * f2));
        float width = viewGroup.getWidth() - 0.0f;
        float height = viewGroup.getHeight() - 0.0f;
        float sqrt2 = sqrt / ((float) java.lang.Math.sqrt((width * width) + (height * height)));
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return java.lang.Math.round(((duration * i) / this.Camera2StreamConfigurationMap) * sqrt2);
    }
}
