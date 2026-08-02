package com.google.android.material.progressindicator;

/* loaded from: classes8.dex */
public final class CircularProgressIndicatorSpec extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec {
    public int indicatorDirection;
    public int indicatorInset;
    public int indicatorSize;

    public CircularProgressIndicatorSpec(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicatorSpec(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, com.google.android.material.progressindicator.CircularProgressIndicator.DEF_STYLE_RES);
    }

    public CircularProgressIndicatorSpec(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_progress_circular_inset_medium);
        android.content.res.TypedArray obtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(context, attributeSet, com.google.android.material.R.styleable.CircularProgressIndicator, i, i2, new int[0]);
        this.indicatorSize = java.lang.Math.max(com.google.android.material.resources.MaterialResources.getDimensionPixelSize(context, obtainStyledAttributes, com.google.android.material.R.styleable.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.trackThickness * 2);
        this.indicatorInset = com.google.android.material.resources.MaterialResources.getDimensionPixelSize(context, obtainStyledAttributes, com.google.android.material.R.styleable.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.indicatorDirection = obtainStyledAttributes.getInt(com.google.android.material.R.styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
        obtainStyledAttributes.recycle();
        validateSpec();
    }

    final int getIndicatorTrackGapSizeDegree() {
        if (this.indicatorTrackGapSize == 0) {
            return 0;
        }
        return (int) java.lang.Math.round(360.0d / ((((this.indicatorSize - (this.indicatorInset * 2)) - this.trackThickness) * 3.141592653589793d) / (this.indicatorTrackGapSize + this.trackCornerRadius)));
    }
}
