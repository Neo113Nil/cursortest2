package com.daon.dmds.views;

/* loaded from: classes7.dex */
public class DMDSImageView extends androidx.appcompat.widget.AppCompatImageView {
    private static final java.lang.String getInputFormats = "DMDSImageView";
    android.graphics.Point Camera2StreamConfigurationMap;
    android.graphics.Point getHighResolutionOutputSizeshNQ4ISI;
    android.graphics.Point getHighSpeedVideoFpsRanges;
    android.graphics.Point getHighSpeedVideoFpsRangesFor;
    android.graphics.PointF getHighSpeedVideoSizes;
    private android.graphics.Paint getHighSpeedVideoSizesFor;
    boolean getInputSizeshNQ4ISI;
    private android.graphics.Bitmap getOutputFormats;
    private int getOutputMinFrameDuration;
    private android.graphics.Matrix getOutputMinFrameDurationlomOqCM;
    private com.daon.dmds.views.DMDSImageView.CurrentPoint getOutputSizes;
    private android.graphics.Paint getOutputSizeshNQ4ISI;
    private float getOutputStallDuration;
    private com.daon.dmds.managers.ScanBoundaryManager getOutputStallDurationlomOqCM;
    private android.graphics.Point getValidOutputFormatsForInputhNQ4ISI;
    private boolean isOutputSupportedFor;
    private android.graphics.Paint isOutputSupportedForhNQ4ISI;
    private android.graphics.BitmapShader toString;
    private com.daon.dmds.views.DMDSImageView.PreviewImageListener unwrapAs;

    enum CurrentPoint {
        UPPER_LEFT,
        UPPER_RIGHT,
        LOWER_LEFT,
        LOWER_RIGHT,
        NONE
    }

    public interface PreviewImageListener {
        void enableCrop(boolean z);

        void zoomBitmap(android.graphics.Bitmap bitmap, android.graphics.Point point);
    }

    public DMDSImageView(android.content.Context context) {
        super(context);
        this.getOutputStallDuration = 2.0f;
        this.getHighSpeedVideoFpsRanges = new android.graphics.Point();
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.Point();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Point();
        this.Camera2StreamConfigurationMap = new android.graphics.Point();
        this.getInputSizeshNQ4ISI = false;
        this.isOutputSupportedFor = false;
        this.getOutputSizes = com.daon.dmds.views.DMDSImageView.CurrentPoint.NONE;
        getHighSpeedVideoFpsRangesFor();
    }

    private void getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
        this.getValidOutputFormatsForInputhNQ4ISI = null;
        com.daon.dmds.views.DMDSImageView.CurrentPoint currentPoint = this.getOutputSizes;
        if (currentPoint == com.daon.dmds.views.DMDSImageView.CurrentPoint.UPPER_LEFT) {
            if (getHighSpeedVideoFpsRangesFor(new android.graphics.Point(this.getHighResolutionOutputSizeshNQ4ISI.x, r0.y - 100), new android.graphics.Point(this.getHighSpeedVideoFpsRangesFor.x, r0.y - 100), new android.graphics.Point(i, i2), true)) {
                if (getHighResolutionOutputSizeshNQ4ISI(new android.graphics.Point(r0.x - 50, this.getHighSpeedVideoFpsRangesFor.y), new android.graphics.Point(r0.x - 50, this.Camera2StreamConfigurationMap.y), new android.graphics.Point(i, i2), true)) {
                    if (getHighSpeedVideoFpsRangesFor(new android.graphics.Point(this.getHighResolutionOutputSizeshNQ4ISI.x, r0.y - 50), new android.graphics.Point(this.Camera2StreamConfigurationMap.x, r0.y - 50), new android.graphics.Point(i, i2), true)) {
                        this.getHighSpeedVideoFpsRanges.set(i, i2);
                        this.getValidOutputFormatsForInputhNQ4ISI = new android.graphics.Point(i, i2);
                    }
                }
            }
        } else if (currentPoint == com.daon.dmds.views.DMDSImageView.CurrentPoint.UPPER_RIGHT) {
            if (getHighSpeedVideoFpsRangesFor(new android.graphics.Point(this.getHighSpeedVideoFpsRanges.x, r0.y - 100), new android.graphics.Point(this.Camera2StreamConfigurationMap.x, r0.y - 100), new android.graphics.Point(i, i2), true)) {
                android.graphics.Point point = this.getHighSpeedVideoFpsRanges;
                android.graphics.Point point2 = new android.graphics.Point(point.x + 50, point.y);
                android.graphics.Point point3 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (getHighResolutionOutputSizeshNQ4ISI(point2, new android.graphics.Point(point3.x + 50, point3.y), new android.graphics.Point(i, i2), false)) {
                    if (getHighSpeedVideoFpsRangesFor(new android.graphics.Point(this.getHighResolutionOutputSizeshNQ4ISI.x, r0.y - 50), new android.graphics.Point(this.Camera2StreamConfigurationMap.x, r0.y - 50), new android.graphics.Point(i, i2), true)) {
                        this.getHighSpeedVideoFpsRangesFor.set(i, i2);
                        this.getValidOutputFormatsForInputhNQ4ISI = new android.graphics.Point(i, i2);
                    }
                }
            }
        } else if (currentPoint == com.daon.dmds.views.DMDSImageView.CurrentPoint.LOWER_LEFT) {
            android.graphics.Point point4 = this.getHighSpeedVideoFpsRanges;
            android.graphics.Point point5 = new android.graphics.Point(point4.x, point4.y + 100);
            android.graphics.Point point6 = this.Camera2StreamConfigurationMap;
            if (getHighSpeedVideoFpsRangesFor(point5, new android.graphics.Point(point6.x, point6.y + 100), new android.graphics.Point(i, i2), false)) {
                if (getHighResolutionOutputSizeshNQ4ISI(new android.graphics.Point(r0.x - 50, this.getHighSpeedVideoFpsRangesFor.y), new android.graphics.Point(r0.x - 50, this.Camera2StreamConfigurationMap.y), new android.graphics.Point(i, i2), true)) {
                    android.graphics.Point point7 = this.getHighSpeedVideoFpsRanges;
                    android.graphics.Point point8 = new android.graphics.Point(point7.x, point7.y + 50);
                    android.graphics.Point point9 = this.getHighSpeedVideoFpsRangesFor;
                    if (getHighSpeedVideoFpsRangesFor(point8, new android.graphics.Point(point9.x, point9.y + 50), new android.graphics.Point(i, i2), false)) {
                        this.getHighResolutionOutputSizeshNQ4ISI.set(i, i2);
                        this.getValidOutputFormatsForInputhNQ4ISI = new android.graphics.Point(i, i2);
                    }
                }
            }
        } else if (currentPoint == com.daon.dmds.views.DMDSImageView.CurrentPoint.LOWER_RIGHT) {
            android.graphics.Point point10 = this.getHighResolutionOutputSizeshNQ4ISI;
            android.graphics.Point point11 = new android.graphics.Point(point10.x, point10.y + 100);
            android.graphics.Point point12 = this.getHighSpeedVideoFpsRangesFor;
            if (getHighSpeedVideoFpsRangesFor(point11, new android.graphics.Point(point12.x, point12.y + 100), new android.graphics.Point(i, i2), false)) {
                android.graphics.Point point13 = this.getHighSpeedVideoFpsRanges;
                android.graphics.Point point14 = new android.graphics.Point(point13.x + 50, point13.y);
                android.graphics.Point point15 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (getHighResolutionOutputSizeshNQ4ISI(point14, new android.graphics.Point(point15.x + 50, point15.y), new android.graphics.Point(i, i2), false)) {
                    android.graphics.Point point16 = this.getHighSpeedVideoFpsRanges;
                    android.graphics.Point point17 = new android.graphics.Point(point16.x, point16.y + 50);
                    android.graphics.Point point18 = this.getHighSpeedVideoFpsRangesFor;
                    if (getHighSpeedVideoFpsRangesFor(point17, new android.graphics.Point(point18.x, point18.y + 50), new android.graphics.Point(i, i2), false)) {
                        this.Camera2StreamConfigurationMap.set(i, i2);
                        this.getValidOutputFormatsForInputhNQ4ISI = new android.graphics.Point(i, i2);
                    }
                }
            }
        }
        invalidate();
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(android.graphics.Point point, android.graphics.Point point2, android.graphics.Point point3, boolean z) {
        int i = point2.x;
        int i2 = point.x;
        float f = i != i2 ? i - i2 : 1.0f;
        int i3 = point2.y;
        float f2 = (i3 - r2) / f;
        int i4 = (int) ((point3.y - (point.y - (i2 * f2))) / f2);
        return z ? point3.x < i4 : point3.x > i4;
    }

    private static float getHighSpeedVideoFpsRanges(android.graphics.Point point, android.graphics.Point point2, android.graphics.Point point3) {
        double sqrt = java.lang.Math.sqrt(java.lang.Math.pow(java.lang.Math.abs(point2.x - point.x), 2.0d) + java.lang.Math.pow(java.lang.Math.abs(point2.y - point.y), 2.0d));
        double sqrt2 = java.lang.Math.sqrt(java.lang.Math.pow(java.lang.Math.abs(point3.x - point.x), 2.0d) + java.lang.Math.pow(java.lang.Math.abs(point3.y - point.y), 2.0d));
        return (float) java.lang.Math.toDegrees(java.lang.Math.acos(((java.lang.Math.pow(sqrt, 2.0d) + java.lang.Math.pow(sqrt2, 2.0d)) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.pow(java.lang.Math.abs(point2.x - point3.x), 2.0d) + java.lang.Math.pow(java.lang.Math.abs(point2.y - point3.y), 2.0d)), 2.0d)) / ((sqrt * 2.0d) * sqrt2)));
    }

    private void getHighSpeedVideoFpsRangesFor() {
        setWillNotDraw(false);
        setLayerType(2, null);
        this.getOutputSizeshNQ4ISI = new android.graphics.Paint();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.getHighSpeedVideoSizesFor = paint;
        paint.setStrokeWidth(2.0f);
        this.getHighSpeedVideoSizesFor.setDither(true);
        this.getHighSpeedVideoSizesFor.setStyle(android.graphics.Paint.Style.STROKE);
        this.getHighSpeedVideoSizesFor.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.getHighSpeedVideoSizesFor.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.getHighSpeedVideoSizesFor.setAntiAlias(true);
        float applyDimension = android.util.TypedValue.applyDimension(1, 3.0f, getResources().getDisplayMetrics());
        this.getOutputStallDuration = applyDimension;
        this.getOutputSizeshNQ4ISI.setStrokeWidth(applyDimension);
        this.getOutputMinFrameDuration = androidx.core.content.ContextCompat.getColor(getContext(), com.daon.dmds.R.color.crop_border_color);
        setBoundaryType(com.daon.dmds.managers.ScanBoundaryManager.BoundaryType.POLYGON);
        this.getHighSpeedVideoSizes = new android.graphics.PointF(0.0f, 0.0f);
        this.getOutputMinFrameDurationlomOqCM = new android.graphics.Matrix();
        this.isOutputSupportedForhNQ4ISI = new android.graphics.Paint();
    }

    private static boolean getHighSpeedVideoFpsRangesFor(android.graphics.Point point, android.graphics.Point point2, android.graphics.Point point3, boolean z) {
        int i = point2.x;
        int i2 = point.x;
        float f = i != i2 ? i2 - i : 1.0f;
        float f2 = (r2 - point2.y) / f;
        int i3 = (int) ((point3.x * f2) + (point.y - (i2 * f2)));
        return z ? point3.y < i3 : point3.y > i3;
    }

    public com.daon.dmds.models.DMDSQuadrangle getSelectionRect() {
        return new com.daon.dmds.models.DMDSQuadrangle(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Point point;
        super.onDraw(canvas);
        canvas.drawColor(androidx.core.content.ContextCompat.getColor(getContext(), android.R.color.transparent));
        this.getOutputSizeshNQ4ISI.setDither(true);
        android.graphics.Paint paint = this.getOutputSizeshNQ4ISI;
        android.graphics.Paint.Style style = android.graphics.Paint.Style.STROKE;
        paint.setStyle(style);
        this.getOutputSizeshNQ4ISI.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        this.getOutputSizeshNQ4ISI.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.getOutputSizeshNQ4ISI.setAntiAlias(true);
        this.getOutputSizeshNQ4ISI.setColor(this.getOutputMinFrameDuration);
        this.getOutputSizeshNQ4ISI.setStyle(style);
        this.getOutputStallDurationlomOqCM.drawBoundary(canvas, this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, 0.0f, this.getOutputStallDuration);
        if (this.getInputSizeshNQ4ISI) {
            this.getHighSpeedVideoSizesFor.setColor(androidx.core.content.ContextCompat.getColor(getContext(), com.daon.dmds.R.color.circle_fill_color));
            this.getHighSpeedVideoSizesFor.setStyle(android.graphics.Paint.Style.FILL);
            this.getOutputStallDurationlomOqCM.drawCircle(canvas, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges);
            this.getOutputStallDurationlomOqCM.drawCircle(canvas, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor);
            this.getOutputStallDurationlomOqCM.drawCircle(canvas, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI);
            this.getOutputStallDurationlomOqCM.drawCircle(canvas, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoSizesFor.setColor(androidx.core.content.ContextCompat.getColor(getContext(), com.daon.dmds.R.color.circle_stroke_color));
            this.getHighSpeedVideoSizesFor.setStyle(style);
            this.getOutputStallDurationlomOqCM.drawCircle(canvas, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges);
            this.getOutputStallDurationlomOqCM.drawCircle(canvas, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor);
            this.getOutputStallDurationlomOqCM.drawCircle(canvas, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI);
            this.getOutputStallDurationlomOqCM.drawCircle(canvas, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap);
        }
        com.daon.dmds.views.DMDSImageView.PreviewImageListener previewImageListener = this.unwrapAs;
        if (previewImageListener != null && (point = this.getValidOutputFormatsForInputhNQ4ISI) != null) {
            int i = point.x;
            int i2 = point.y;
            android.graphics.Point point2 = this.getHighSpeedVideoFpsRanges;
            android.graphics.Point point3 = new android.graphics.Point(point2.x, point2.y);
            android.graphics.Point point4 = this.getHighSpeedVideoFpsRangesFor;
            android.graphics.Point point5 = new android.graphics.Point(point4.x, point4.y);
            android.graphics.Point point6 = this.getHighResolutionOutputSizeshNQ4ISI;
            android.graphics.Point point7 = new android.graphics.Point(point6.x, point6.y);
            android.graphics.Point point8 = this.Camera2StreamConfigurationMap;
            android.graphics.Point point9 = new android.graphics.Point(point8.x, point8.y);
            com.daon.dmds.views.DMDSImageView.CurrentPoint currentPoint = this.getOutputSizes;
            if (currentPoint == com.daon.dmds.views.DMDSImageView.CurrentPoint.UPPER_LEFT) {
                point3.set(i, i2);
            } else if (currentPoint == com.daon.dmds.views.DMDSImageView.CurrentPoint.UPPER_RIGHT) {
                point5.set(i, i2);
            } else if (currentPoint == com.daon.dmds.views.DMDSImageView.CurrentPoint.LOWER_LEFT) {
                point7.set(i, i2);
            } else if (currentPoint == com.daon.dmds.views.DMDSImageView.CurrentPoint.LOWER_RIGHT) {
                point9.set(i, i2);
            }
            previewImageListener.enableCrop(getHighSpeedVideoFpsRanges(point3, point7, point5) < 120.0f && getHighSpeedVideoFpsRanges(point5, point3, point9) < 120.0f && getHighSpeedVideoFpsRanges(point9, point5, point7) < 120.0f && getHighSpeedVideoFpsRanges(point7, point3, point9) < 120.0f);
        }
        if (!this.isOutputSupportedFor) {
            buildDrawingCache();
            com.daon.dmds.views.DMDSImageView.PreviewImageListener previewImageListener2 = this.unwrapAs;
            if (previewImageListener2 != null) {
                previewImageListener2.zoomBitmap(null, null);
                return;
            }
            return;
        }
        if (this.unwrapAs == null || this.getValidOutputFormatsForInputhNQ4ISI == null) {
            return;
        }
        android.graphics.Bitmap drawingCache = getDrawingCache();
        this.getOutputFormats = drawingCache;
        android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
        android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(drawingCache, tileMode, tileMode);
        this.toString = bitmapShader;
        this.isOutputSupportedForhNQ4ISI.setShader(bitmapShader);
        this.getOutputMinFrameDurationlomOqCM.reset();
        this.getOutputMinFrameDurationlomOqCM.postScale(2.0f, 2.0f);
        this.isOutputSupportedForhNQ4ISI.getShader().setLocalMatrix(this.getOutputMinFrameDurationlomOqCM);
        int abs = java.lang.Math.abs(this.getOutputFormats.getWidth() - this.getValidOutputFormatsForInputhNQ4ISI.x);
        int abs2 = java.lang.Math.abs(this.getOutputFormats.getHeight() - this.getValidOutputFormatsForInputhNQ4ISI.y);
        if (abs > 40) {
            abs = 40;
        }
        if (abs2 > 40) {
            abs2 = 40;
        }
        android.graphics.Point point10 = this.getValidOutputFormatsForInputhNQ4ISI;
        int i3 = point10.x;
        int i4 = i3 - abs;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = point10.y - abs2;
        int i6 = i5 >= 0 ? i5 : 0;
        if (i3 + abs > this.getOutputFormats.getWidth()) {
            i4 = this.getOutputFormats.getWidth() - (abs * 2);
        }
        int i7 = i4;
        if (this.getValidOutputFormatsForInputhNQ4ISI.y + abs > this.getOutputFormats.getHeight()) {
            i6 = this.getOutputFormats.getHeight() - (abs2 * 2);
        }
        int i8 = i6;
        if (abs == 0 || abs2 == 0) {
            com.daon.dmds.utils.DobsLogUtils.logDebug(getInputFormats, java.lang.String.format(java.util.Locale.US, "RadiusX=%d, RadiusY=%d", java.lang.Integer.valueOf(abs), java.lang.Integer.valueOf(abs2)));
        } else {
            this.unwrapAs.zoomBitmap(android.graphics.Bitmap.createBitmap(this.getOutputFormats, i7, i8, abs * 2, abs2 * 2, this.getOutputMinFrameDurationlomOqCM, true), this.getValidOutputFormatsForInputhNQ4ISI);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r0 != 3) goto L40;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f) {
            return false;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        getGlobalVisibleRect(rect);
        if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    getHighResolutionOutputSizeshNQ4ISI((int) motionEvent.getX(), (int) motionEvent.getY());
                }
            }
            getHighResolutionOutputSizeshNQ4ISI((int) motionEvent.getX(), (int) motionEvent.getY());
            this.isOutputSupportedFor = false;
            this.getOutputSizes = com.daon.dmds.views.DMDSImageView.CurrentPoint.NONE;
        } else {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            android.graphics.Point point = this.getHighSpeedVideoFpsRanges;
            if (java.lang.Math.abs(point.x - x) >= 48 || java.lang.Math.abs(point.y - y) >= 48) {
                android.graphics.Point point2 = this.getHighSpeedVideoFpsRangesFor;
                if (java.lang.Math.abs(point2.x - x) >= 48 || java.lang.Math.abs(point2.y - y) >= 48) {
                    android.graphics.Point point3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (java.lang.Math.abs(point3.x - x) >= 48 || java.lang.Math.abs(point3.y - y) >= 48) {
                        android.graphics.Point point4 = this.Camera2StreamConfigurationMap;
                        if (java.lang.Math.abs(point4.x - x) < 48 && java.lang.Math.abs(point4.y - y) < 48) {
                            this.getOutputSizes = com.daon.dmds.views.DMDSImageView.CurrentPoint.LOWER_RIGHT;
                        }
                    } else {
                        this.getOutputSizes = com.daon.dmds.views.DMDSImageView.CurrentPoint.LOWER_LEFT;
                    }
                } else {
                    this.getOutputSizes = com.daon.dmds.views.DMDSImageView.CurrentPoint.UPPER_RIGHT;
                }
            } else {
                this.getOutputSizes = com.daon.dmds.views.DMDSImageView.CurrentPoint.UPPER_LEFT;
            }
            com.daon.dmds.utils.DobsLogUtils.logDebug(getInputFormats, java.lang.String.format("Current detected point: %s", this.getOutputSizes));
            getHighResolutionOutputSizeshNQ4ISI((int) motionEvent.getX(), (int) motionEvent.getY());
            this.isOutputSupportedFor = true;
        }
        this.getHighSpeedVideoSizes.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return true;
    }

    public void setBoundaryType(com.daon.dmds.managers.ScanBoundaryManager.BoundaryType boundaryType) {
        this.getOutputStallDurationlomOqCM = new com.daon.dmds.managers.ScanBoundaryManager(boundaryType);
    }

    public void setCropBorderColor(int i) {
        this.getOutputMinFrameDuration = i;
        invalidate();
    }

    public void setRect(android.graphics.Point point, android.graphics.Point point2, android.graphics.Point point3, android.graphics.Point point4) {
        this.getInputSizeshNQ4ISI = true;
        this.getHighSpeedVideoFpsRanges.set(point.x, point.y);
        this.getHighSpeedVideoFpsRangesFor.set(point2.x, point2.y);
        this.getHighResolutionOutputSizeshNQ4ISI.set(point3.x, point3.y);
        this.Camera2StreamConfigurationMap.set(point4.x, point4.y);
        invalidate();
    }

    public void setRectVisibility(boolean z) {
        this.getInputSizeshNQ4ISI = z;
    }

    public void setZoomListener(com.daon.dmds.views.DMDSImageView.PreviewImageListener previewImageListener) {
        this.unwrapAs = previewImageListener;
    }

    public DMDSImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getOutputStallDuration = 2.0f;
        this.getHighSpeedVideoFpsRanges = new android.graphics.Point();
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.Point();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Point();
        this.Camera2StreamConfigurationMap = new android.graphics.Point();
        this.getInputSizeshNQ4ISI = false;
        this.isOutputSupportedFor = false;
        this.getOutputSizes = com.daon.dmds.views.DMDSImageView.CurrentPoint.NONE;
        getHighSpeedVideoFpsRangesFor();
    }

    public DMDSImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getOutputStallDuration = 2.0f;
        this.getHighSpeedVideoFpsRanges = new android.graphics.Point();
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.Point();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Point();
        this.Camera2StreamConfigurationMap = new android.graphics.Point();
        this.getInputSizeshNQ4ISI = false;
        this.isOutputSupportedFor = false;
        this.getOutputSizes = com.daon.dmds.views.DMDSImageView.CurrentPoint.NONE;
        getHighSpeedVideoFpsRangesFor();
    }
}
