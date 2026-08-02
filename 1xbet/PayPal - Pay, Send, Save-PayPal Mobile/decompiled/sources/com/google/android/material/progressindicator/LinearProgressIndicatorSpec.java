package com.google.android.material.progressindicator;

/* loaded from: classes8.dex */
public final class LinearProgressIndicatorSpec extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec {
    boolean drawHorizontallyInverse;
    public int indeterminateAnimationType;
    public int indicatorDirection;
    public int trackStopIndicatorSize;

    public LinearProgressIndicatorSpec(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicatorSpec(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, com.google.android.material.progressindicator.LinearProgressIndicator.DEF_STYLE_RES);
    }

    public LinearProgressIndicatorSpec(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        android.content.res.TypedArray obtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, attributeSet, com.google.android.material.R.styleable.LinearProgressIndicator, com.google.android.material.R.attr.linearProgressIndicatorStyle, com.google.android.material.progressindicator.LinearProgressIndicator.DEF_STYLE_RES, new int[0]);
        this.indeterminateAnimationType = obtainStyledAttributes.getInt(com.google.android.material.R.styleable.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.indicatorDirection = obtainStyledAttributes.getInt(com.google.android.material.R.styleable.LinearProgressIndicator_indicatorDirectionLinear, 0);
        this.trackStopIndicatorSize = java.lang.Math.min(obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.LinearProgressIndicator_trackStopIndicatorSize, 0), this.trackThickness);
        obtainStyledAttributes.recycle();
        validateSpec();
        this.drawHorizontallyInverse = this.indicatorDirection == 1;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    final void validateSpec() {
        super.validateSpec();
        if (this.trackStopIndicatorSize < 0) {
            throw new java.lang.IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.indeterminateAnimationType == 0) {
            if (this.trackCornerRadius > 0 && this.indicatorTrackGapSize == 0) {
                throw new java.lang.IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.indicatorColors.length < 3) {
                throw new java.lang.IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
