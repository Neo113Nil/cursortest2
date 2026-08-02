package androidx.transition;

/* loaded from: classes7.dex */
public class SidePropagation extends androidx.transition.VisibilityPropagation {
    private float getHighSpeedVideoSizes = 3.0f;
    private int getHighResolutionOutputSizeshNQ4ISI = 80;

    public void setSide(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public void setPropagationSpeed(float f) {
        if (f == 0.0f) {
            throw new java.lang.IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.getHighSpeedVideoSizes = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r18.getLayoutDirection() == 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        r15 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0081, code lost:
    
        r15 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007d, code lost:
    
        if (r18.getLayoutDirection() == 1) goto L24;
     */
    @Override // androidx.transition.TransitionPropagation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long getStartDelay(android.view.ViewGroup viewGroup, androidx.transition.Transition transition, androidx.transition.TransitionValues transitionValues, androidx.transition.TransitionValues transitionValues2) {
        int i;
        int i2;
        int i3;
        int abs;
        int width;
        androidx.transition.TransitionValues transitionValues3 = transitionValues;
        if (transitionValues3 == null && transitionValues2 == null) {
            return 0L;
        }
        android.graphics.Rect epicenter = transition.getEpicenter();
        if (transitionValues2 == null || getViewVisibility(transitionValues3) == 0) {
            i = -1;
        } else {
            transitionValues3 = transitionValues2;
            i = 1;
        }
        int viewX = getViewX(transitionValues3);
        int viewY = getViewY(transitionValues3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + java.lang.Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + java.lang.Math.round(viewGroup.getTranslationY());
        int width2 = viewGroup.getWidth() + round;
        int height = viewGroup.getHeight() + round2;
        if (epicenter != null) {
            i2 = epicenter.centerX();
            i3 = epicenter.centerY();
        } else {
            i2 = (round + width2) / 2;
            i3 = (round2 + height) / 2;
        }
        int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i4 != 8388611) {
            if (i4 == 8388613) {
            }
        }
        if (i4 == 3) {
            abs = java.lang.Math.abs(i3 - viewY) + (width2 - viewX);
        } else if (i4 == 5) {
            abs = java.lang.Math.abs(i3 - viewY) + (viewX - round);
        } else if (i4 == 48) {
            abs = java.lang.Math.abs(i2 - viewX) + (height - viewY);
        } else {
            abs = i4 != 80 ? 0 : (viewY - round2) + java.lang.Math.abs(i2 - viewX);
        }
        float f = abs;
        int i5 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i5 == 3 || i5 == 5 || i5 == 8388611 || i5 == 8388613) {
            width = viewGroup.getWidth();
        } else {
            width = viewGroup.getHeight();
        }
        float f2 = f / width;
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return java.lang.Math.round(((duration * i) / this.getHighSpeedVideoSizes) * f2);
    }
}
