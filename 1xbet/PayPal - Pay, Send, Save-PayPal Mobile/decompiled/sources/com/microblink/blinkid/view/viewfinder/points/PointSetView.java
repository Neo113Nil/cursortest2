package com.microblink.blinkid.view.viewfinder.points;

/* loaded from: classes10.dex */
public class PointSetView extends android.view.View implements com.microblink.blinkid.view.viewfinder.points.IDisplayablePointsView, android.animation.ValueAnimator.AnimatorUpdateListener {
    private final android.os.Handler Camera2StreamConfigurationMap;
    private com.microblink.blinkid.geometry.PointSet getHighResolutionOutputSizeshNQ4ISI;
    private com.microblink.blinkid.secured.IlIllIIIIl getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private final android.graphics.Paint getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private android.animation.ValueAnimator getInputSizeshNQ4ISI;
    private final int getOutputFormats;
    private com.microblink.blinkid.geometry.PointSet getOutputMinFrameDuration;
    private final int getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;

    public PointSetView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        this.getHighSpeedVideoSizes = -1;
        this.getHighSpeedVideoFpsRangesFor = -1;
        this.getInputFormats = 15;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getOutputMinFrameDuration = null;
        this.getInputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = new android.os.Handler();
        this.getOutputFormats = -1;
        this.getOutputStallDuration = -1;
        this.getOutputStallDurationlomOqCM = 1;
        setBackgroundColor(0);
        this.getOutputStallDurationlomOqCM = i;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.getHighSpeedVideoSizesFor = paint;
        paint.setStrokeWidth((context.getResources().getDisplayMetrics().densityDpi + 49) / 50);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
        this.getOutputFormats = i3;
        this.getInputFormats = i2;
        this.getOutputStallDuration = 16777215 & i3;
        this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.secured.IlIllIIIIl(0, i3);
        setLayerType(1, null);
    }

    @Override // com.microblink.blinkid.view.viewfinder.points.IDisplayablePointsView
    public void addDisplayablePointsDetection(com.microblink.blinkid.metadata.detection.points.DisplayablePointsDetection displayablePointsDetection) {
        setDisplayablePointsDetection(displayablePointsDetection);
    }

    @Override // com.microblink.blinkid.view.viewfinder.IDetectionView
    public void clearDisplayedContent() {
        addDisplayablePointsDetection(null);
    }

    @Override // com.microblink.blinkid.view.viewfinder.IDetectionView
    public android.view.View getView() {
        return this;
    }

    public boolean isAnimationInProgress() {
        android.animation.ValueAnimator valueAnimator = this.getInputSizeshNQ4ISI;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.getHighSpeedVideoFpsRanges = (com.microblink.blinkid.secured.IlIllIIIIl) valueAnimator.getAnimatedValue();
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        if (this.getHighSpeedVideoSizes == -1) {
            this.getHighSpeedVideoSizes = getWidth();
        }
        if (this.getHighSpeedVideoFpsRangesFor == -1) {
            this.getHighSpeedVideoFpsRangesFor = getHeight();
        }
        com.microblink.blinkid.geometry.PointSet pointSet = this.getHighResolutionOutputSizeshNQ4ISI;
        com.microblink.blinkid.geometry.PointSet pointSet2 = this.getOutputMinFrameDuration;
        if (pointSet != null) {
            this.getHighSpeedVideoSizesFor.setColor(this.getHighSpeedVideoFpsRanges.llIIlIlIIl);
            pointSet.draw(canvas, this.getHighSpeedVideoSizesFor, this.getInputFormats);
        }
        if (pointSet2 != null) {
            this.getHighSpeedVideoSizesFor.setColor(this.getHighSpeedVideoFpsRanges.IlIllIlIIl);
            pointSet2.draw(canvas, this.getHighSpeedVideoSizesFor, this.getInputFormats);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.getHighSpeedVideoSizes = getWidth();
        int height = getHeight();
        this.getHighSpeedVideoFpsRangesFor = height;
        com.microblink.blinkid.util.Log.v(this, "PointSetView layouting to size: {}x{}", java.lang.Integer.valueOf(this.getHighSpeedVideoSizes), java.lang.Integer.valueOf(height));
    }

    @Override // com.microblink.blinkid.view.viewfinder.points.IDisplayablePointsView
    public void setDisplayablePointsDetection(com.microblink.blinkid.metadata.detection.points.DisplayablePointsDetection displayablePointsDetection) {
        this.getOutputMinFrameDuration = this.getHighResolutionOutputSizeshNQ4ISI;
        if (displayablePointsDetection != null) {
            java.util.List<com.microblink.blinkid.geometry.Point> points = displayablePointsDetection.getTransformedPointSet().getPoints();
            for (com.microblink.blinkid.geometry.Point point : points) {
                int i = this.getOutputStallDurationlomOqCM;
                if (i == 8 || i == 9) {
                    point.mirrorXYInPlace(1.0f, 1.0f);
                }
                float x = point.getX();
                float y = point.getY();
                int i2 = this.getOutputStallDurationlomOqCM;
                if (i2 == 1 || i2 == 9) {
                    point.setX((1.0f - y) * this.getHighSpeedVideoSizes);
                    point.setY(x * this.getHighSpeedVideoFpsRangesFor);
                } else {
                    point.setX(x * this.getHighSpeedVideoSizes);
                    point.setY(y * this.getHighSpeedVideoFpsRangesFor);
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.geometry.PointSet(points);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
        this.Camera2StreamConfigurationMap.post(new com.microblink.blinkid.view.viewfinder.points.llIIlIlIIl(this));
    }

    @Override // com.microblink.blinkid.view.viewfinder.IDetectionView
    public void setHostActivityOrientation(int i) {
        this.getOutputStallDurationlomOqCM = i;
    }

    public PointSetView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 15, context.getResources().getColor(com.microblink.blinkid.library.R.color.mb_recognized_frame));
    }
}
