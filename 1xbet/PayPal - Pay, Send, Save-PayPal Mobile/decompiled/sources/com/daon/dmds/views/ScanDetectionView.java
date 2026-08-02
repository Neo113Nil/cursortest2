package com.daon.dmds.views;

/* loaded from: classes7.dex */
public class ScanDetectionView extends android.view.View {
    android.graphics.Point Camera2StreamConfigurationMap;
    android.graphics.Point getHighResolutionOutputSizeshNQ4ISI;
    android.graphics.Point getHighSpeedVideoFpsRanges;
    android.graphics.Point getHighSpeedVideoFpsRangesFor;
    android.graphics.Point getHighSpeedVideoSizes;
    android.graphics.Point getHighSpeedVideoSizesFor;
    android.graphics.Point getInputFormats;
    android.graphics.Point getInputSizeshNQ4ISI;
    android.graphics.Point getOutputFormats;
    android.graphics.Point getOutputMinFrameDuration;
    android.graphics.Point getOutputMinFrameDurationlomOqCM;
    android.graphics.Point getOutputSizes;
    private float getOutputSizeshNQ4ISI;
    private android.graphics.Paint getOutputStallDuration;
    private com.daon.dmds.managers.ScanBoundaryManager getOutputStallDurationlomOqCM;
    private final android.os.Handler getValidOutputFormatsForInputhNQ4ISI;
    private final java.lang.Runnable isOutputSupportedFor;
    private int isOutputSupportedForhNQ4ISI;

    public ScanDetectionView(android.content.Context context) {
        super(context);
        this.getValidOutputFormatsForInputhNQ4ISI = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getOutputSizeshNQ4ISI = 2.0f;
        this.getHighSpeedVideoFpsRanges = new android.graphics.Point();
        this.getHighSpeedVideoSizesFor = new android.graphics.Point();
        this.Camera2StreamConfigurationMap = new android.graphics.Point();
        this.getHighSpeedVideoSizes = new android.graphics.Point();
        this.getOutputFormats = null;
        this.getInputFormats = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getOutputSizes = null;
        this.getInputSizeshNQ4ISI = null;
        this.getOutputMinFrameDuration = null;
        this.isOutputSupportedFor = new java.lang.Runnable() { // from class: com.daon.dmds.views.ScanDetectionView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.views.ScanDetectionView.this.setVisibility(8);
            }
        };
        getHighSpeedVideoFpsRangesFor();
    }

    private void getHighSpeedVideoFpsRangesFor() {
        setWillNotDraw(false);
        setLayerType(2, null);
        this.getOutputStallDuration = new android.graphics.Paint();
        float applyDimension = android.util.TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        this.getOutputSizeshNQ4ISI = applyDimension;
        this.getOutputStallDuration.setStrokeWidth(applyDimension);
        this.isOutputSupportedForhNQ4ISI = androidx.core.content.ContextCompat.getColor(getContext(), com.daon.dmds.R.color.dmds_green);
        this.getOutputFormats = new android.graphics.Point();
        this.getInputFormats = new android.graphics.Point();
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.Point();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Point();
        this.getOutputMinFrameDurationlomOqCM = new android.graphics.Point();
        this.getOutputSizes = new android.graphics.Point();
        this.getInputSizeshNQ4ISI = new android.graphics.Point();
        this.getOutputMinFrameDuration = new android.graphics.Point();
        setBoundaryType(com.daon.dmds.managers.ScanBoundaryManager.BoundaryType.RECTANGLE);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(androidx.core.content.ContextCompat.getColor(getContext(), android.R.color.transparent));
        this.getOutputStallDuration.setDither(true);
        android.graphics.Paint paint = this.getOutputStallDuration;
        android.graphics.Paint.Style style = android.graphics.Paint.Style.STROKE;
        paint.setStyle(style);
        this.getOutputStallDuration.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.getOutputStallDuration.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.getOutputStallDuration.setAntiAlias(true);
        this.getOutputStallDuration.setColor(this.isOutputSupportedForhNQ4ISI);
        this.getOutputStallDuration.setStyle(style);
        this.getOutputStallDurationlomOqCM.setBoundaryType(com.daon.dmds.managers.ScanBoundaryManager.BoundaryType.POLYGON);
        this.getOutputStallDurationlomOqCM.drawBoundary(canvas, this.getOutputStallDuration, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, 0.0f, this.getOutputSizeshNQ4ISI);
        this.getOutputStallDuration.setStyle(android.graphics.Paint.Style.FILL);
        this.getOutputStallDurationlomOqCM.setBoundaryType(com.daon.dmds.managers.ScanBoundaryManager.BoundaryType.RECTANGLE);
        this.getOutputStallDurationlomOqCM.drawBoundary(canvas, this.getOutputStallDuration, this.getOutputFormats, this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, 0.0f, this.getOutputSizeshNQ4ISI);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setBoundaryType(com.daon.dmds.managers.ScanBoundaryManager.BoundaryType boundaryType) {
        this.getOutputStallDurationlomOqCM = new com.daon.dmds.managers.ScanBoundaryManager(boundaryType);
    }

    public void setRect(android.graphics.Point point, android.graphics.Point point2, android.graphics.Point point3, android.graphics.Point point4) {
        setVisibility(0);
        this.getHighSpeedVideoFpsRanges.set(point.x, point.y);
        this.getHighSpeedVideoSizesFor.set(point2.x, point2.y);
        this.Camera2StreamConfigurationMap.set(point3.x, point3.y);
        this.getHighSpeedVideoSizes.set(point4.x, point4.y);
        android.graphics.Point point5 = this.getOutputFormats;
        android.graphics.Point point6 = this.getOutputMinFrameDurationlomOqCM;
        point5.set(point6.x, point6.y);
        android.graphics.Point point7 = this.getInputFormats;
        android.graphics.Point point8 = this.getOutputSizes;
        point7.set(point8.x, point8.y);
        android.graphics.Point point9 = this.getHighSpeedVideoFpsRangesFor;
        android.graphics.Point point10 = this.getInputSizeshNQ4ISI;
        point9.set(point10.x, point10.y);
        android.graphics.Point point11 = this.getHighResolutionOutputSizeshNQ4ISI;
        android.graphics.Point point12 = this.getOutputMinFrameDuration;
        point11.set(point12.x, point12.y);
        invalidate();
        this.getValidOutputFormatsForInputhNQ4ISI.removeCallbacksAndMessages(null);
        this.getValidOutputFormatsForInputhNQ4ISI.postDelayed(this.isOutputSupportedFor, 400L);
    }

    public void setRectMrz(android.graphics.Point point, android.graphics.Point point2, android.graphics.Point point3, android.graphics.Point point4) {
        this.getOutputMinFrameDurationlomOqCM.set(point.x, point.y);
        this.getOutputSizes.set(point2.x, point2.y);
        this.getInputSizeshNQ4ISI.set(point3.x, point3.y);
        this.getOutputMinFrameDuration.set(point4.x, point4.y);
    }

    public void setScanningDetectionColor(int i) {
        this.isOutputSupportedForhNQ4ISI = i;
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            this.getOutputFormats.set(0, 0);
            this.getInputFormats.set(0, 0);
            this.getHighSpeedVideoFpsRangesFor.set(0, 0);
            this.getHighResolutionOutputSizeshNQ4ISI.set(0, 0);
            this.getHighSpeedVideoFpsRanges.set(0, 0);
            this.getHighSpeedVideoSizesFor.set(0, 0);
            this.Camera2StreamConfigurationMap.set(0, 0);
            this.getHighSpeedVideoSizes.set(0, 0);
            this.getOutputMinFrameDurationlomOqCM.set(0, 0);
            this.getOutputSizes.set(0, 0);
            this.getInputSizeshNQ4ISI.set(0, 0);
            this.getOutputMinFrameDuration.set(0, 0);
            invalidate();
        }
    }

    public void setRect(com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle) {
        setRect(dMDSQuadrangle.getUpperLeft(), dMDSQuadrangle.getUpperRight(), dMDSQuadrangle.getLowerLeft(), dMDSQuadrangle.getLowerRight());
    }

    public ScanDetectionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getValidOutputFormatsForInputhNQ4ISI = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getOutputSizeshNQ4ISI = 2.0f;
        this.getHighSpeedVideoFpsRanges = new android.graphics.Point();
        this.getHighSpeedVideoSizesFor = new android.graphics.Point();
        this.Camera2StreamConfigurationMap = new android.graphics.Point();
        this.getHighSpeedVideoSizes = new android.graphics.Point();
        this.getOutputFormats = null;
        this.getInputFormats = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getOutputSizes = null;
        this.getInputSizeshNQ4ISI = null;
        this.getOutputMinFrameDuration = null;
        this.isOutputSupportedFor = new java.lang.Runnable() { // from class: com.daon.dmds.views.ScanDetectionView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.views.ScanDetectionView.this.setVisibility(8);
            }
        };
        getHighSpeedVideoFpsRangesFor();
    }

    public ScanDetectionView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getValidOutputFormatsForInputhNQ4ISI = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getOutputSizeshNQ4ISI = 2.0f;
        this.getHighSpeedVideoFpsRanges = new android.graphics.Point();
        this.getHighSpeedVideoSizesFor = new android.graphics.Point();
        this.Camera2StreamConfigurationMap = new android.graphics.Point();
        this.getHighSpeedVideoSizes = new android.graphics.Point();
        this.getOutputFormats = null;
        this.getInputFormats = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getOutputSizes = null;
        this.getInputSizeshNQ4ISI = null;
        this.getOutputMinFrameDuration = null;
        this.isOutputSupportedFor = new java.lang.Runnable() { // from class: com.daon.dmds.views.ScanDetectionView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.views.ScanDetectionView.this.setVisibility(8);
            }
        };
        getHighSpeedVideoFpsRangesFor();
    }

    public ScanDetectionView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.getValidOutputFormatsForInputhNQ4ISI = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getOutputSizeshNQ4ISI = 2.0f;
        this.getHighSpeedVideoFpsRanges = new android.graphics.Point();
        this.getHighSpeedVideoSizesFor = new android.graphics.Point();
        this.Camera2StreamConfigurationMap = new android.graphics.Point();
        this.getHighSpeedVideoSizes = new android.graphics.Point();
        this.getOutputFormats = null;
        this.getInputFormats = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getOutputSizes = null;
        this.getInputSizeshNQ4ISI = null;
        this.getOutputMinFrameDuration = null;
        this.isOutputSupportedFor = new java.lang.Runnable() { // from class: com.daon.dmds.views.ScanDetectionView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.views.ScanDetectionView.this.setVisibility(8);
            }
        };
        getHighSpeedVideoFpsRangesFor();
    }
}
