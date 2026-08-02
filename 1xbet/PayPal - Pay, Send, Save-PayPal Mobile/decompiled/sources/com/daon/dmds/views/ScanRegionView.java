package com.daon.dmds.views;

/* loaded from: classes7.dex */
public class ScanRegionView extends android.view.View {
    int Camera2StreamConfigurationMap;
    private int accessartificialFrame;
    private float coroutineCreation;
    android.graphics.Point getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    com.daon.dmds.models.DMDSRect getInputFormats;
    android.graphics.Point getInputSizeshNQ4ISI;
    android.graphics.Point getOutputFormats;
    android.graphics.Point getOutputMinFrameDuration;
    boolean getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    int getOutputSizeshNQ4ISI;
    private android.graphics.Paint getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private android.graphics.Paint getValidOutputFormatsForInputhNQ4ISI;
    private com.daon.dmds.models.ScanProgress isOutputSupportedFor;
    private final android.graphics.Rect isOutputSupportedForhNQ4ISI;
    private com.daon.dmds.managers.ScanBoundaryManager toString;
    private float unwrapAs;

    public ScanRegionView(android.content.Context context) {
        super(context);
        this.unwrapAs = 0.0f;
        this.coroutineCreation = 0.0f;
        this.getOutputStallDurationlomOqCM = -1;
        this.isOutputSupportedForhNQ4ISI = new android.graphics.Rect();
        this.getInputFormats = new com.daon.dmds.models.DMDSRect(0.0f, 0.0f, 0.0f, 0.0f);
        this.getOutputFormats = new android.graphics.Point();
        this.getInputSizeshNQ4ISI = new android.graphics.Point();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Point();
        this.getOutputMinFrameDuration = new android.graphics.Point();
        this.getHighSpeedVideoSizes = -1;
        this.getOutputMinFrameDurationlomOqCM = true;
        this.isOutputSupportedFor = com.daon.dmds.models.ScanProgress.NOT_SCANNING;
        Camera2StreamConfigurationMap();
    }

    private void Camera2StreamConfigurationMap() {
        setWillNotDraw(false);
        setLayerType(2, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.getOutputStallDuration = paint;
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        this.getValidOutputFormatsForInputhNQ4ISI = new android.graphics.Paint();
        this.getOutputStallDurationlomOqCM = androidx.core.content.ContextCompat.getColor(getContext(), com.daon.dmds.R.color.dmds_white);
        this.accessartificialFrame = androidx.core.content.ContextCompat.getColor(getContext(), com.daon.dmds.R.color.dmds_black_alpha70);
        setBoundaryType(com.daon.dmds.managers.ScanBoundaryManager.BoundaryType.CORNERS);
    }

    public com.daon.dmds.models.DMDSQuadrangle getScanningRegion() {
        return new com.daon.dmds.models.DMDSQuadrangle(this.getOutputFormats, this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0077  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(android.graphics.Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        float f3 = this.unwrapAs;
        float f4 = this.coroutineCreation;
        this.getValidOutputFormatsForInputhNQ4ISI.setColor(this.getOutputStallDurationlomOqCM);
        int i = this.accessartificialFrame;
        com.daon.dmds.models.ScanProgress scanProgress = this.isOutputSupportedFor;
        if (scanProgress == com.daon.dmds.models.ScanProgress.DONE) {
            i = androidx.core.content.ContextCompat.getColor(getContext(), com.daon.dmds.R.color.dmds_black);
        } else if (scanProgress == com.daon.dmds.models.ScanProgress.SCANNED) {
            f = 0.0f;
            f2 = 0.0f;
            this.getValidOutputFormatsForInputhNQ4ISI.setStrokeWidth(f2);
            canvas.drawColor(i);
            this.isOutputSupportedForhNQ4ISI.set(this.getHighSpeedVideoFpsRangesFor, this.getOutputSizes, this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
            canvas.drawRect(this.isOutputSupportedForhNQ4ISI, this.getOutputStallDuration);
            android.graphics.Point point = this.getOutputFormats;
            android.graphics.Rect rect = this.isOutputSupportedForhNQ4ISI;
            point.set(rect.left, rect.top);
            android.graphics.Point point2 = this.getInputSizeshNQ4ISI;
            android.graphics.Rect rect2 = this.isOutputSupportedForhNQ4ISI;
            point2.set(rect2.right, rect2.top);
            android.graphics.Point point3 = this.getHighResolutionOutputSizeshNQ4ISI;
            android.graphics.Rect rect3 = this.isOutputSupportedForhNQ4ISI;
            point3.set(rect3.left, rect3.bottom);
            android.graphics.Point point4 = this.getOutputMinFrameDuration;
            android.graphics.Rect rect4 = this.isOutputSupportedForhNQ4ISI;
            point4.set(rect4.right, rect4.bottom);
            if (this.getOutputMinFrameDurationlomOqCM) {
                return;
            }
            this.toString.drawBoundary(canvas, this.getValidOutputFormatsForInputhNQ4ISI, this.getOutputFormats, this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, f, f2);
            return;
        }
        f = f3;
        f2 = f4;
        this.getValidOutputFormatsForInputhNQ4ISI.setStrokeWidth(f2);
        canvas.drawColor(i);
        this.isOutputSupportedForhNQ4ISI.set(this.getHighSpeedVideoFpsRangesFor, this.getOutputSizes, this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
        canvas.drawRect(this.isOutputSupportedForhNQ4ISI, this.getOutputStallDuration);
        android.graphics.Point point5 = this.getOutputFormats;
        android.graphics.Rect rect5 = this.isOutputSupportedForhNQ4ISI;
        point5.set(rect5.left, rect5.top);
        android.graphics.Point point22 = this.getInputSizeshNQ4ISI;
        android.graphics.Rect rect22 = this.isOutputSupportedForhNQ4ISI;
        point22.set(rect22.right, rect22.top);
        android.graphics.Point point32 = this.getHighResolutionOutputSizeshNQ4ISI;
        android.graphics.Rect rect32 = this.isOutputSupportedForhNQ4ISI;
        point32.set(rect32.left, rect32.bottom);
        android.graphics.Point point42 = this.getOutputMinFrameDuration;
        android.graphics.Rect rect42 = this.isOutputSupportedForhNQ4ISI;
        point42.set(rect42.right, rect42.bottom);
        if (this.getOutputMinFrameDurationlomOqCM) {
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setBorderThickness(int i) {
        this.coroutineCreation = android.util.TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
        invalidate();
    }

    public void setBoundaryColor(int i) {
        this.getOutputStallDurationlomOqCM = i;
        invalidate();
    }

    public void setBoundaryType(com.daon.dmds.managers.ScanBoundaryManager.BoundaryType boundaryType) {
        this.toString = new com.daon.dmds.managers.ScanBoundaryManager(boundaryType);
    }

    public void setCornerLength(int i) {
        this.unwrapAs = android.util.TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
        invalidate();
    }

    public void setScanProgress(com.daon.dmds.models.ScanProgress scanProgress) {
        this.isOutputSupportedFor = scanProgress;
        invalidate();
    }

    public void setScanningBorderColor(int i) {
        this.accessartificialFrame = i;
        invalidate();
    }

    public void setScanningRegion(int i, int i2, com.daon.dmds.models.DMDSRect dMDSRect, int i3) {
        if (dMDSRect == null) {
            return;
        }
        this.getHighSpeedVideoSizes = i3;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoSizesFor = i;
        this.getInputFormats = dMDSRect;
        this.getHighSpeedVideoFpsRangesFor = (int) (i * dMDSRect.getLeft());
        this.getOutputSizes = (int) (this.Camera2StreamConfigurationMap * this.getInputFormats.getTop());
        this.getOutputSizeshNQ4ISI = (int) ((this.getHighSpeedVideoSizesFor * this.getInputFormats.getLeft()) + (this.getHighSpeedVideoSizesFor * this.getInputFormats.getWidth()));
        this.getHighSpeedVideoFpsRanges = (int) ((this.Camera2StreamConfigurationMap * this.getInputFormats.getTop()) + (this.Camera2StreamConfigurationMap * this.getInputFormats.getHeight()));
        invalidate();
    }

    public void setShowBoundary(boolean z) {
        this.getOutputMinFrameDurationlomOqCM = z;
        invalidate();
    }

    public ScanRegionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.unwrapAs = 0.0f;
        this.coroutineCreation = 0.0f;
        this.getOutputStallDurationlomOqCM = -1;
        this.isOutputSupportedForhNQ4ISI = new android.graphics.Rect();
        this.getInputFormats = new com.daon.dmds.models.DMDSRect(0.0f, 0.0f, 0.0f, 0.0f);
        this.getOutputFormats = new android.graphics.Point();
        this.getInputSizeshNQ4ISI = new android.graphics.Point();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Point();
        this.getOutputMinFrameDuration = new android.graphics.Point();
        this.getHighSpeedVideoSizes = -1;
        this.getOutputMinFrameDurationlomOqCM = true;
        this.isOutputSupportedFor = com.daon.dmds.models.ScanProgress.NOT_SCANNING;
        Camera2StreamConfigurationMap();
    }

    public ScanRegionView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.unwrapAs = 0.0f;
        this.coroutineCreation = 0.0f;
        this.getOutputStallDurationlomOqCM = -1;
        this.isOutputSupportedForhNQ4ISI = new android.graphics.Rect();
        this.getInputFormats = new com.daon.dmds.models.DMDSRect(0.0f, 0.0f, 0.0f, 0.0f);
        this.getOutputFormats = new android.graphics.Point();
        this.getInputSizeshNQ4ISI = new android.graphics.Point();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Point();
        this.getOutputMinFrameDuration = new android.graphics.Point();
        this.getHighSpeedVideoSizes = -1;
        this.getOutputMinFrameDurationlomOqCM = true;
        this.isOutputSupportedFor = com.daon.dmds.models.ScanProgress.NOT_SCANNING;
        Camera2StreamConfigurationMap();
    }

    public ScanRegionView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.unwrapAs = 0.0f;
        this.coroutineCreation = 0.0f;
        this.getOutputStallDurationlomOqCM = -1;
        this.isOutputSupportedForhNQ4ISI = new android.graphics.Rect();
        this.getInputFormats = new com.daon.dmds.models.DMDSRect(0.0f, 0.0f, 0.0f, 0.0f);
        this.getOutputFormats = new android.graphics.Point();
        this.getInputSizeshNQ4ISI = new android.graphics.Point();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Point();
        this.getOutputMinFrameDuration = new android.graphics.Point();
        this.getHighSpeedVideoSizes = -1;
        this.getOutputMinFrameDurationlomOqCM = true;
        this.isOutputSupportedFor = com.daon.dmds.models.ScanProgress.NOT_SCANNING;
        Camera2StreamConfigurationMap();
    }
}
