package androidx.transition;

/* loaded from: classes7.dex */
public class Explode extends androidx.transition.Visibility {
    private static final android.animation.TimeInterpolator getHighSpeedVideoFpsRangesFor = new android.view.animation.DecelerateInterpolator();
    private static final android.animation.TimeInterpolator getHighSpeedVideoSizes = new android.view.animation.AccelerateInterpolator();
    private int[] getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    public Explode() {
        this.getHighResolutionOutputSizeshNQ4ISI = new int[2];
        setPropagation(new androidx.transition.CircularPropagation());
    }

    public Explode(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighResolutionOutputSizeshNQ4ISI = new int[2];
        setPropagation(new androidx.transition.CircularPropagation());
    }

    private void getHighSpeedVideoSizes(androidx.transition.TransitionValues transitionValues) {
        android.view.View view = transitionValues.view;
        view.getLocationOnScreen(this.getHighResolutionOutputSizeshNQ4ISI);
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = iArr[0];
        int i2 = iArr[1];
        transitionValues.values.put("android:explode:screenBounds", new android.graphics.Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        getHighSpeedVideoSizes(transitionValues);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        getHighSpeedVideoSizes(transitionValues);
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator onAppear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        android.graphics.Rect rect = (android.graphics.Rect) transitionValues2.values.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        getHighSpeedVideoSizes(viewGroup, rect, this.getHighResolutionOutputSizeshNQ4ISI);
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        return androidx.transition.TranslationAnimationCreator.Camera2StreamConfigurationMap(view, transitionValues2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, getHighSpeedVideoFpsRangesFor, this);
    }

    @Override // androidx.transition.Visibility
    public android.animation.Animator onDisappear(android.view.ViewGroup viewGroup, android.view.View view, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        float f;
        float f2;
        if (transitionValues == null) {
            return null;
        }
        android.graphics.Rect rect = (android.graphics.Rect) transitionValues.values.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(androidx.transition.R.id.transition_position);
        if (iArr != null) {
            f = (iArr[0] - rect.left) + translationX;
            f2 = (iArr[1] - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f = translationX;
            f2 = translationY;
        }
        getHighSpeedVideoSizes(viewGroup, rect, this.getHighResolutionOutputSizeshNQ4ISI);
        int[] iArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        return androidx.transition.TranslationAnimationCreator.Camera2StreamConfigurationMap(view, transitionValues, i, i2, translationX, translationY, f + iArr2[0], f2 + iArr2[1], getHighSpeedVideoSizes, this);
    }

    private void getHighSpeedVideoSizes(android.view.View view, android.graphics.Rect rect, int[] iArr) {
        int centerY;
        int i;
        view.getLocationOnScreen(this.getHighResolutionOutputSizeshNQ4ISI);
        int[] iArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = iArr2[0];
        int i3 = iArr2[1];
        android.graphics.Rect epicenter = getEpicenter();
        if (epicenter == null) {
            i = (view.getWidth() / 2) + i2 + java.lang.Math.round(view.getTranslationX());
            centerY = (view.getHeight() / 2) + i3 + java.lang.Math.round(view.getTranslationY());
        } else {
            int centerX = epicenter.centerX();
            centerY = epicenter.centerY();
            i = centerX;
        }
        float centerX2 = rect.centerX() - i;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (java.lang.Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (java.lang.Math.random() * 2.0d)) - 1.0f;
        }
        float sqrt = (float) java.lang.Math.sqrt((centerX2 * centerX2) + (centerY2 * centerY2));
        int i4 = i - i2;
        int i5 = centerY - i3;
        float max = java.lang.Math.max(i4, view.getWidth() - i4);
        float max2 = java.lang.Math.max(i5, view.getHeight() - i5);
        float sqrt2 = (float) java.lang.Math.sqrt((max * max) + (max2 * max2));
        iArr[0] = java.lang.Math.round((centerX2 / sqrt) * sqrt2);
        iArr[1] = java.lang.Math.round(sqrt2 * (centerY2 / sqrt));
    }
}
