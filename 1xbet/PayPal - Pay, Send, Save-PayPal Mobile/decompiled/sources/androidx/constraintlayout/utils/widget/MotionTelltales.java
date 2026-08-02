package androidx.constraintlayout.utils.widget;

/* loaded from: classes7.dex */
public class MotionTelltales extends androidx.constraintlayout.utils.widget.MockView {
    android.graphics.Matrix Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    androidx.constraintlayout.motion.widget.MotionLayout getHighSpeedVideoFpsRanges;
    float[] getHighSpeedVideoFpsRangesFor;
    float getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    private android.graphics.Paint getOutputFormats;

    public MotionTelltales(android.content.Context context) {
        super(context);
        this.getOutputFormats = new android.graphics.Paint();
        this.getHighSpeedVideoFpsRangesFor = new float[2];
        this.Camera2StreamConfigurationMap = new android.graphics.Matrix();
        this.getInputSizeshNQ4ISI = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = -65281;
        this.getHighSpeedVideoSizes = 0.25f;
        getHighSpeedVideoFpsRangesFor(context, null);
    }

    public MotionTelltales(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getOutputFormats = new android.graphics.Paint();
        this.getHighSpeedVideoFpsRangesFor = new float[2];
        this.Camera2StreamConfigurationMap = new android.graphics.Matrix();
        this.getInputSizeshNQ4ISI = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = -65281;
        this.getHighSpeedVideoSizes = 0.25f;
        getHighSpeedVideoFpsRangesFor(context, attributeSet);
    }

    public MotionTelltales(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getOutputFormats = new android.graphics.Paint();
        this.getHighSpeedVideoFpsRangesFor = new float[2];
        this.Camera2StreamConfigurationMap = new android.graphics.Matrix();
        this.getInputSizeshNQ4ISI = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = -65281;
        this.getHighSpeedVideoSizes = 0.25f;
        getHighSpeedVideoFpsRangesFor(context, attributeSet);
    }

    private void getHighSpeedVideoFpsRangesFor(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.MotionTelltales);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.MotionTelltales_telltales_tailColor) {
                    this.getHighResolutionOutputSizeshNQ4ISI = obtainStyledAttributes.getColor(index, this.getHighResolutionOutputSizeshNQ4ISI);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionTelltales_telltales_velocityMode) {
                    this.getInputSizeshNQ4ISI = obtainStyledAttributes.getInt(index, this.getInputSizeshNQ4ISI);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionTelltales_telltales_tailScale) {
                    this.getHighSpeedVideoSizes = obtainStyledAttributes.getFloat(index, this.getHighSpeedVideoSizes);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.getOutputFormats.setColor(this.getHighResolutionOutputSizeshNQ4ISI);
        this.getOutputFormats.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setText(java.lang.CharSequence charSequence) {
        this.mText = charSequence.toString();
        requestLayout();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.Camera2StreamConfigurationMap);
        if (this.getHighSpeedVideoFpsRanges == null) {
            android.view.ViewParent parent = getParent();
            if (parent instanceof androidx.constraintlayout.motion.widget.MotionLayout) {
                this.getHighSpeedVideoFpsRanges = (androidx.constraintlayout.motion.widget.MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.getHighSpeedVideoFpsRanges.getViewVelocity(this, f2, f, this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI);
                this.Camera2StreamConfigurationMap.mapVectors(this.getHighSpeedVideoFpsRangesFor);
                float f3 = width * f2;
                float f4 = height * f;
                float[] fArr2 = this.getHighSpeedVideoFpsRangesFor;
                float f5 = fArr2[0];
                float f6 = this.getHighSpeedVideoSizes;
                float f7 = fArr2[1];
                this.Camera2StreamConfigurationMap.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f4 - (f7 * f6), this.getOutputFormats);
            }
        }
    }
}
