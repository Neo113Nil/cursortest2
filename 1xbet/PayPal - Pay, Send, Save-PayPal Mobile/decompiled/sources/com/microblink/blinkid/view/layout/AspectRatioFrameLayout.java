package com.microblink.blinkid.view.layout;

/* loaded from: classes10.dex */
public class AspectRatioFrameLayout extends android.widget.FrameLayout {
    private float getHighSpeedVideoSizes;

    public AspectRatioFrameLayout(android.content.Context context) {
        this(context, null);
    }

    public float getAspectRatio() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.getHighSpeedVideoSizes == 0.0f) {
            super.onMeasure(i, i2);
            return;
        }
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        float f = size;
        float f2 = this.getHighSpeedVideoSizes;
        float f3 = f / f2;
        float f4 = size2;
        if (f3 > f4) {
            f = f4 * f2;
            f3 = f4;
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec((int) f, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((int) f3, 1073741824));
    }

    public void setAspectRatio(float f) {
        this.getHighSpeedVideoSizes = f;
        invalidate();
    }

    public AspectRatioFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.microblink.blinkid.library.R.styleable.AspectRatioFrameLayout, i, 0);
        this.getHighSpeedVideoSizes = obtainStyledAttributes.getFloat(com.microblink.blinkid.library.R.styleable.AspectRatioFrameLayout_mb_aspectRatio, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
