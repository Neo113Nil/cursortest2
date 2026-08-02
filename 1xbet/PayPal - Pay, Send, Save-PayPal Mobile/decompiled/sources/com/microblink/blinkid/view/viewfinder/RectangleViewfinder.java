package com.microblink.blinkid.view.viewfinder;

/* loaded from: classes10.dex */
public class RectangleViewfinder extends android.view.View {
    public static int ERROR_ANIMATION_DURATION = 800;
    private android.graphics.Rect Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private final int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private android.graphics.Bitmap getInputSizeshNQ4ISI;
    private android.graphics.Canvas getOutputFormats;
    private final android.graphics.Paint getOutputMinFrameDuration;
    private float getOutputMinFrameDurationlomOqCM;
    private final float getOutputSizes;
    private final android.graphics.Paint getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;

    public RectangleViewfinder(android.content.Context context) {
        this(context, null, 0);
    }

    public void clearError() {
        if (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRangesFor = false;
            android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes), java.lang.Integer.valueOf(this.getOutputStallDuration));
            ofObject.addUpdateListener(new com.microblink.blinkid.view.viewfinder.llIIlIlIIl(this));
            ofObject.setDuration(300L);
            ofObject.start();
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, this.getHighSpeedVideoFpsRanges);
            ofInt.addUpdateListener(new com.microblink.blinkid.view.viewfinder.IlIllIlIIl(this));
            ofInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            ofInt.setDuration(500L);
            ofInt.setStartDelay(300L);
            ofInt.reverse();
        }
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = android.graphics.Bitmap.createBitmap(getWidth(), getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            this.getOutputFormats = new android.graphics.Canvas(this.getInputSizeshNQ4ISI);
        }
        this.getOutputFormats.drawRect(this.Camera2StreamConfigurationMap, this.getOutputSizeshNQ4ISI);
        android.graphics.Canvas canvas2 = this.getOutputFormats;
        float left = getLeft();
        float top = getTop();
        float f = top + this.getOutputSizes;
        canvas2.drawLine(left, f, left + this.getInputFormats, f, this.getOutputMinFrameDuration);
        float f2 = left + this.getOutputSizes;
        canvas2.drawLine(f2, top, f2, top + this.getOutputStallDurationlomOqCM, this.getOutputMinFrameDuration);
        android.graphics.Canvas canvas3 = this.getOutputFormats;
        float right = getRight();
        float top2 = getTop();
        float f3 = this.getInputFormats;
        float f4 = right - f3;
        float f5 = top2 + this.getOutputSizes;
        canvas3.drawLine(f4, f5, f4 + f3, f5, this.getOutputMinFrameDuration);
        float f6 = right - this.getOutputSizes;
        canvas3.drawLine(f6, top2, f6, top2 + this.getOutputStallDurationlomOqCM, this.getOutputMinFrameDuration);
        android.graphics.Canvas canvas4 = this.getOutputFormats;
        float left2 = getLeft();
        float bottom = getBottom();
        float f7 = bottom - this.getOutputSizes;
        canvas4.drawLine(left2, f7, left2 + this.getInputFormats, f7, this.getOutputMinFrameDuration);
        float f8 = left2 + this.getOutputSizes;
        float f9 = this.getOutputStallDurationlomOqCM;
        float f10 = bottom - f9;
        canvas4.drawLine(f8, f10, f8, f10 + f9, this.getOutputMinFrameDuration);
        android.graphics.Canvas canvas5 = this.getOutputFormats;
        float right2 = getRight();
        float bottom2 = getBottom();
        float f11 = this.getInputFormats;
        float f12 = right2 - f11;
        float f13 = bottom2 - this.getOutputSizes;
        canvas5.drawLine(f12, f13, f12 + f11, f13, this.getOutputMinFrameDuration);
        float f14 = right2 - this.getOutputSizes;
        float f15 = this.getOutputStallDurationlomOqCM;
        float f16 = bottom2 - f15;
        canvas5.drawLine(f14, f16, f14, f16 + f15, this.getOutputMinFrameDuration);
        canvas.drawBitmap(this.getInputSizeshNQ4ISI, 0.0f, 0.0f, (android.graphics.Paint) null);
    }

    public void onError() {
        if (this.getHighSpeedVideoFpsRangesFor) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = true;
        android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(this.getOutputStallDuration), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes));
        ofObject.addUpdateListener(new com.microblink.blinkid.view.viewfinder.llIIlIlIIl(this));
        ofObject.setDuration(300L);
        ofObject.start();
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, this.getHighSpeedVideoFpsRanges);
        ofInt.addUpdateListener(new com.microblink.blinkid.view.viewfinder.IlIllIlIIl(this));
        ofInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        ofInt.setDuration(500L);
        ofInt.setStartDelay(300L);
        ofInt.start();
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.Camera2StreamConfigurationMap = new android.graphics.Rect(i, i2, i3, i4);
            this.getHighSpeedVideoFpsRanges = (((getRight() - getLeft()) - (this.getInputFormats * 2)) / 2) + 1;
            this.getOutputMinFrameDurationlomOqCM = ((((getBottom() - getTop()) - (this.getOutputStallDurationlomOqCM * 2)) / 2) + 1) / this.getHighSpeedVideoFpsRanges;
            if (getWidth() <= 0 || getHeight() <= 0) {
                return;
            }
            this.getInputSizeshNQ4ISI = android.graphics.Bitmap.createBitmap(getWidth(), getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            this.getOutputFormats = new android.graphics.Canvas(this.getInputSizeshNQ4ISI);
        }
    }

    public void setDefaultHookColor(int i) {
        this.getOutputStallDuration = i;
        this.getOutputMinFrameDuration.setColor(i);
    }

    public void setErrorHookColor(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public RectangleViewfinder(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RectangleViewfinder(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.getOutputSizeshNQ4ISI = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.getOutputMinFrameDuration = paint2;
        this.getHighSpeedVideoFpsRangesFor = false;
        int dimension = (int) context.getResources().getDimension(com.microblink.blinkid.library.R.dimen.mb_hook_length_vertical);
        this.getHighSpeedVideoSizesFor = dimension;
        this.getOutputStallDurationlomOqCM = dimension;
        int dimension2 = (int) context.getResources().getDimension(com.microblink.blinkid.library.R.dimen.mb_hook_length_horizontal);
        this.getHighResolutionOutputSizeshNQ4ISI = dimension2;
        this.getInputFormats = dimension2;
        float dimension3 = context.getResources().getDimension(com.microblink.blinkid.library.R.dimen.mb_hook_stroke_width);
        this.getOutputSizes = dimension3 / 2.0f;
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        int color = androidx.core.content.ContextCompat.getColor(context, com.microblink.blinkid.library.R.color.mb_hook_color);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setColor(color);
        paint2.setStrokeWidth(dimension3);
    }
}
