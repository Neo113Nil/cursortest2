package com.daon.dmds.views;

/* loaded from: classes7.dex */
public class DebugPointsView extends android.view.View {
    android.graphics.Point Camera2StreamConfigurationMap;
    android.graphics.Point getHighResolutionOutputSizeshNQ4ISI;
    android.graphics.Bitmap getHighSpeedVideoFpsRanges;
    android.graphics.Point getHighSpeedVideoFpsRangesFor;
    android.graphics.Point getHighSpeedVideoSizes;
    android.graphics.Point getHighSpeedVideoSizesFor;
    android.graphics.Point getInputFormats;
    android.graphics.Point getInputSizeshNQ4ISI;
    android.graphics.Point getOutputFormats;
    android.graphics.Point getOutputMinFrameDuration;
    android.graphics.Point getOutputMinFrameDurationlomOqCM;
    android.graphics.Point getOutputSizes;
    private android.graphics.Paint getOutputSizeshNQ4ISI;
    android.graphics.Point getOutputStallDuration;
    private com.daon.dmds.managers.ScanBoundaryManager getOutputStallDurationlomOqCM;
    private final android.os.Handler getValidOutputFormatsForInputhNQ4ISI;
    private float isOutputSupportedForhNQ4ISI;
    private final java.lang.Runnable toString;
    private int unwrapAs;

    public DebugPointsView(android.content.Context context) {
        super(context);
        this.getValidOutputFormatsForInputhNQ4ISI = new android.os.Handler(android.os.Looper.getMainLooper());
        this.isOutputSupportedForhNQ4ISI = 2.0f;
        this.getInputFormats = new android.graphics.Point();
        this.getOutputMinFrameDuration = new android.graphics.Point();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Point();
        this.Camera2StreamConfigurationMap = new android.graphics.Point();
        this.getHighSpeedVideoSizesFor = null;
        this.getOutputFormats = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = null;
        this.getOutputStallDuration = null;
        this.getOutputSizes = null;
        this.getInputSizeshNQ4ISI = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.toString = new java.lang.Runnable() { // from class: com.daon.dmds.views.DebugPointsView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.views.DebugPointsView.this.setVisibility(8);
            }
        };
        getHighSpeedVideoFpsRangesFor();
    }

    private void getHighSpeedVideoFpsRangesFor() {
        setWillNotDraw(false);
        setLayerType(2, null);
        this.getOutputSizeshNQ4ISI = new android.graphics.Paint();
        float applyDimension = android.util.TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        this.isOutputSupportedForhNQ4ISI = applyDimension;
        this.getOutputSizeshNQ4ISI.setStrokeWidth(applyDimension);
        this.unwrapAs = androidx.core.content.ContextCompat.getColor(getContext(), com.daon.dmds.R.color.dmds_green);
        this.getHighSpeedVideoSizesFor = new android.graphics.Point();
        this.getOutputFormats = new android.graphics.Point();
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.Point();
        this.getHighSpeedVideoSizes = new android.graphics.Point();
        this.getOutputStallDuration = new android.graphics.Point();
        this.getOutputSizes = new android.graphics.Point();
        this.getInputSizeshNQ4ISI = new android.graphics.Point();
        this.getOutputMinFrameDurationlomOqCM = new android.graphics.Point();
        setBoundaryType(com.daon.dmds.managers.ScanBoundaryManager.BoundaryType.RECTANGLE);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.getHighSpeedVideoFpsRanges != null) {
            android.graphics.Rect rect = new android.graphics.Rect(0, 0, this.getHighSpeedVideoFpsRanges.getWidth(), this.getHighSpeedVideoFpsRanges.getHeight());
            canvas.drawBitmap(this.getHighSpeedVideoFpsRanges, rect, rect, (android.graphics.Paint) null);
        }
        canvas.drawColor(androidx.core.content.ContextCompat.getColor(getContext(), android.R.color.transparent));
        this.getOutputSizeshNQ4ISI.setDither(true);
        android.graphics.Paint paint = this.getOutputSizeshNQ4ISI;
        android.graphics.Paint.Style style = android.graphics.Paint.Style.STROKE;
        paint.setStyle(style);
        this.getOutputSizeshNQ4ISI.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.getOutputSizeshNQ4ISI.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.getOutputSizeshNQ4ISI.setAntiAlias(true);
        this.getOutputSizeshNQ4ISI.setColor(this.unwrapAs);
        this.getOutputSizeshNQ4ISI.setStyle(style);
        this.getOutputStallDurationlomOqCM.setBoundaryType(com.daon.dmds.managers.ScanBoundaryManager.BoundaryType.POLYGON);
        this.getOutputStallDurationlomOqCM.drawBoundary(canvas, this.getOutputSizeshNQ4ISI, this.getInputFormats, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, 0.0f, this.isOutputSupportedForhNQ4ISI);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setBmp(android.graphics.Bitmap bitmap) {
        this.getHighSpeedVideoFpsRanges = bitmap;
        invalidate();
    }

    public void setBmpAndRect(final android.graphics.Bitmap bitmap, final com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle) {
        this.getValidOutputFormatsForInputhNQ4ISI.post(new java.lang.Runnable() { // from class: com.daon.dmds.views.DebugPointsView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.views.DebugPointsView debugPointsView = com.daon.dmds.views.DebugPointsView.this;
                android.graphics.Bitmap bitmap2 = bitmap;
                com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle2 = dMDSQuadrangle;
                debugPointsView.getHighSpeedVideoFpsRanges = bitmap2;
                debugPointsView.setRect(dMDSQuadrangle2);
            }
        });
    }

    public void setBoundaryType(com.daon.dmds.managers.ScanBoundaryManager.BoundaryType boundaryType) {
        this.getOutputStallDurationlomOqCM = new com.daon.dmds.managers.ScanBoundaryManager(boundaryType);
    }

    public void setRect(android.graphics.Point point, android.graphics.Point point2, android.graphics.Point point3, android.graphics.Point point4) {
        setVisibility(0);
        this.getInputFormats.set(point.x, point.y);
        this.getOutputMinFrameDuration.set(point2.x, point2.y);
        this.getHighResolutionOutputSizeshNQ4ISI.set(point3.x, point3.y);
        this.Camera2StreamConfigurationMap.set(point4.x, point4.y);
        android.graphics.Point point5 = this.getHighSpeedVideoSizesFor;
        android.graphics.Point point6 = this.getOutputStallDuration;
        point5.set(point6.x, point6.y);
        android.graphics.Point point7 = this.getOutputFormats;
        android.graphics.Point point8 = this.getOutputSizes;
        point7.set(point8.x, point8.y);
        android.graphics.Point point9 = this.getHighSpeedVideoFpsRangesFor;
        android.graphics.Point point10 = this.getInputSizeshNQ4ISI;
        point9.set(point10.x, point10.y);
        android.graphics.Point point11 = this.getHighSpeedVideoSizes;
        android.graphics.Point point12 = this.getOutputMinFrameDurationlomOqCM;
        point11.set(point12.x, point12.y);
        invalidate();
    }

    public void setScanningDetectionColor(int i) {
        this.unwrapAs = i;
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            this.getHighSpeedVideoSizesFor.set(0, 0);
            this.getOutputFormats.set(0, 0);
            this.getHighSpeedVideoFpsRangesFor.set(0, 0);
            this.getHighSpeedVideoSizes.set(0, 0);
            this.getInputFormats.set(0, 0);
            this.getOutputMinFrameDuration.set(0, 0);
            this.getHighResolutionOutputSizeshNQ4ISI.set(0, 0);
            this.Camera2StreamConfigurationMap.set(0, 0);
            this.getOutputStallDuration.set(0, 0);
            this.getOutputSizes.set(0, 0);
            this.getInputSizeshNQ4ISI.set(0, 0);
            this.getOutputMinFrameDurationlomOqCM.set(0, 0);
            invalidate();
        }
    }

    public void setRect(com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle) {
        setRect(dMDSQuadrangle.getUpperLeft(), dMDSQuadrangle.getUpperRight(), dMDSQuadrangle.getLowerLeft(), dMDSQuadrangle.getLowerRight());
    }

    public DebugPointsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getValidOutputFormatsForInputhNQ4ISI = new android.os.Handler(android.os.Looper.getMainLooper());
        this.isOutputSupportedForhNQ4ISI = 2.0f;
        this.getInputFormats = new android.graphics.Point();
        this.getOutputMinFrameDuration = new android.graphics.Point();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Point();
        this.Camera2StreamConfigurationMap = new android.graphics.Point();
        this.getHighSpeedVideoSizesFor = null;
        this.getOutputFormats = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = null;
        this.getOutputStallDuration = null;
        this.getOutputSizes = null;
        this.getInputSizeshNQ4ISI = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.toString = new java.lang.Runnable() { // from class: com.daon.dmds.views.DebugPointsView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.views.DebugPointsView.this.setVisibility(8);
            }
        };
        getHighSpeedVideoFpsRangesFor();
    }

    public DebugPointsView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getValidOutputFormatsForInputhNQ4ISI = new android.os.Handler(android.os.Looper.getMainLooper());
        this.isOutputSupportedForhNQ4ISI = 2.0f;
        this.getInputFormats = new android.graphics.Point();
        this.getOutputMinFrameDuration = new android.graphics.Point();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Point();
        this.Camera2StreamConfigurationMap = new android.graphics.Point();
        this.getHighSpeedVideoSizesFor = null;
        this.getOutputFormats = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = null;
        this.getOutputStallDuration = null;
        this.getOutputSizes = null;
        this.getInputSizeshNQ4ISI = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.toString = new java.lang.Runnable() { // from class: com.daon.dmds.views.DebugPointsView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.views.DebugPointsView.this.setVisibility(8);
            }
        };
        getHighSpeedVideoFpsRangesFor();
    }

    public DebugPointsView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.getValidOutputFormatsForInputhNQ4ISI = new android.os.Handler(android.os.Looper.getMainLooper());
        this.isOutputSupportedForhNQ4ISI = 2.0f;
        this.getInputFormats = new android.graphics.Point();
        this.getOutputMinFrameDuration = new android.graphics.Point();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Point();
        this.Camera2StreamConfigurationMap = new android.graphics.Point();
        this.getHighSpeedVideoSizesFor = null;
        this.getOutputFormats = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = null;
        this.getOutputStallDuration = null;
        this.getOutputSizes = null;
        this.getInputSizeshNQ4ISI = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.toString = new java.lang.Runnable() { // from class: com.daon.dmds.views.DebugPointsView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.views.DebugPointsView.this.setVisibility(8);
            }
        };
        getHighSpeedVideoFpsRangesFor();
    }
}
