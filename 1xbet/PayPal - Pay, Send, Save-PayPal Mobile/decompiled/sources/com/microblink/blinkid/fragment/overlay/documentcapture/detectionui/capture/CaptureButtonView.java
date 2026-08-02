package com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture;

/* loaded from: classes10.dex */
public final class CaptureButtonView extends android.view.View {
    private float Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private final android.graphics.RectF getHighSpeedVideoFpsRangesFor;
    private final android.graphics.Paint getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private final android.graphics.Paint getInputFormats;
    private int getInputSizeshNQ4ISI;
    private float getOutputFormats;
    private float getOutputMinFrameDuration;
    private float getOutputSizeshNQ4ISI;

    public CaptureButtonView(android.content.Context context) {
        this(context, null);
    }

    public final float getSpinnerStartAngle() {
        return this.Camera2StreamConfigurationMap;
    }

    public final float getSpinnerSweepAngle() {
        return this.getOutputMinFrameDuration;
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.getHighResolutionOutputSizeshNQ4ISI / 2, this.getHighSpeedVideoSizesFor / 2, this.getHighSpeedVideoFpsRanges, this.getInputFormats);
        canvas.drawArc(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, false, this.getHighSpeedVideoSizes);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int i5 = i3 - i;
            this.getHighResolutionOutputSizeshNQ4ISI = i5;
            int i6 = i4 - i2;
            this.getHighSpeedVideoSizesFor = i6;
            int min = java.lang.Math.min(i5, i6);
            this.getInputSizeshNQ4ISI = min;
            float f = min;
            float f2 = 0.06f * f;
            this.getOutputFormats = f2;
            this.getOutputSizeshNQ4ISI = f * 0.04f;
            this.getHighSpeedVideoSizes.setStrokeWidth(f2);
            float f3 = (this.getOutputFormats / 2.0f) + 1.0f;
            int i7 = this.getHighResolutionOutputSizeshNQ4ISI;
            float f4 = ((i7 - r5) / 2.0f) + f3;
            float f5 = ((this.getHighSpeedVideoSizesFor - r5) / 2.0f) + f3;
            float f6 = this.getInputSizeshNQ4ISI;
            float f7 = f3 * 2.0f;
            this.getHighSpeedVideoFpsRangesFor.set(f4, f5, (f4 + f6) - f7, (f6 + f5) - f7);
            this.getHighSpeedVideoFpsRanges = (int) (((this.getInputSizeshNQ4ISI / 2) - this.getOutputFormats) - this.getOutputSizeshNQ4ISI);
        }
    }

    public final void setCircleColor(int i) {
        this.getInputFormats.setColor(i);
    }

    public final void setSpinnerColor(int i) {
        this.getHighSpeedVideoSizes.setColor(i);
    }

    public final void setSpinnerStartAngle(float f) {
        this.Camera2StreamConfigurationMap = f;
    }

    public final void setSpinnerSweepAngle(float f) {
        this.getOutputMinFrameDuration = f;
    }

    public CaptureButtonView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CaptureButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Camera2StreamConfigurationMap = 270.0f;
        this.getOutputMinFrameDuration = 90.0f;
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.RectF();
        getResources();
        int color = androidx.core.content.ContextCompat.getColor(context, com.microblink.blinkid.library.R.color.mb_capture_button_fill);
        int color2 = androidx.core.content.ContextCompat.getColor(context, com.microblink.blinkid.library.R.color.mb_capture_button_border);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.microblink.blinkid.library.R.styleable.CaptureButtonView, i, 0);
        int color3 = obtainStyledAttributes.getColor(com.microblink.blinkid.library.R.styleable.CaptureButtonView_mb_cbCircleColor, color);
        int color4 = obtainStyledAttributes.getColor(com.microblink.blinkid.library.R.styleable.CaptureButtonView_mb_cbSpinnerColor, color2);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.getInputFormats = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(color3);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.getHighSpeedVideoSizes = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(color4);
        obtainStyledAttributes.recycle();
    }
}
