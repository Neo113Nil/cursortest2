package androidx.core.view.insets;

/* loaded from: classes7.dex */
public class GradientProtection extends androidx.core.view.insets.Protection {
    private static final float[] getOutputFormats = new float[100];
    private int getInputSizeshNQ4ISI;
    private final int[] getOutputMinFrameDuration;
    private float getOutputMinFrameDurationlomOqCM;
    private boolean getOutputSizeshNQ4ISI;
    private final android.graphics.drawable.GradientDrawable getOutputStallDurationlomOqCM;

    static {
        android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
        for (int i = 99; i >= 0; i--) {
            getOutputFormats[i] = pathInterpolator.getInterpolation((99 - i) / 99.0f);
        }
    }

    public GradientProtection(int i) {
        super(i);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        this.getOutputStallDurationlomOqCM = gradientDrawable;
        this.getOutputMinFrameDuration = new int[getOutputFormats.length];
        this.getInputSizeshNQ4ISI = 0;
        this.getOutputMinFrameDurationlomOqCM = 1.2f;
        if (i == 1) {
            gradientDrawable.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT);
            return;
        }
        if (i == 2) {
            gradientDrawable.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM);
        } else if (i == 4) {
            gradientDrawable.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT);
        } else {
            if (i != 8) {
                return;
            }
            gradientDrawable.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP);
        }
    }

    public GradientProtection(int i, int i2) {
        this(i);
        setColor(i2);
    }

    @Override // androidx.core.view.insets.Protection
    final void Camera2StreamConfigurationMap(int i) {
        if (this.getOutputSizeshNQ4ISI) {
            return;
        }
        getHighSpeedVideoFpsRanges(i);
    }

    private void getHighSpeedVideoFpsRanges(int i) {
        if (this.getInputSizeshNQ4ISI != i) {
            this.getInputSizeshNQ4ISI = i;
            int[] iArr = this.getOutputMinFrameDuration;
            for (int length = iArr.length - 1; length >= 0; length--) {
                iArr[length] = android.graphics.Color.argb((int) (getOutputFormats[length] * android.graphics.Color.alpha(i)), android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i));
            }
            this.getOutputStallDurationlomOqCM.setColors(this.getOutputMinFrameDuration);
            androidx.core.view.insets.Protection.Attributes.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, this.getOutputStallDurationlomOqCM);
        }
    }

    public void setColor(int i) {
        this.getOutputSizeshNQ4ISI = true;
        getHighSpeedVideoFpsRanges(i);
    }

    public int getColor() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.core.view.insets.Protection
    final int getHighSpeedVideoFpsRangesFor(int i) {
        return (int) (this.getOutputMinFrameDurationlomOqCM * i);
    }

    public void setScale(float f) {
        if (f < 0.0f) {
            throw new java.lang.IllegalArgumentException("Scale must not be negative.");
        }
        this.getOutputMinFrameDurationlomOqCM = f;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public float getScale() {
        return this.getOutputMinFrameDurationlomOqCM;
    }
}
