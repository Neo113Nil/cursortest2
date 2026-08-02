package com.github.mikephil.charting.charts;

/* loaded from: classes8.dex */
public abstract class PieRadarChartBase<T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>>> extends com.github.mikephil.charting.charts.Chart<T> {
    private float Camera2StreamConfigurationMap;
    private float getHighSpeedVideoFpsRangesFor;
    protected float mMinOffset;
    protected boolean mRotateEnabled;

    @Override // com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
    }

    public abstract int getIndexForAngle(float f);

    public abstract float getRadius();

    protected abstract float getRequiredBaseOffset();

    protected abstract float getRequiredLegendOffset();

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return 0.0f;
    }

    public PieRadarChartBase(android.content.Context context) {
        super(context);
        this.getHighSpeedVideoFpsRangesFor = 270.0f;
        this.Camera2StreamConfigurationMap = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    public PieRadarChartBase(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighSpeedVideoFpsRangesFor = 270.0f;
        this.Camera2StreamConfigurationMap = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    public PieRadarChartBase(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighSpeedVideoFpsRangesFor = 270.0f;
        this.Camera2StreamConfigurationMap = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mChartTouchListener = new com.github.mikephil.charting.listener.PieRadarChartTouchListener(this);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public int getMaxVisibleCount() {
        return this.mData.getEntryCount();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.mTouchEnabled && this.mChartTouchListener != null) {
            return this.mChartTouchListener.onTouch(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mChartTouchListener instanceof com.github.mikephil.charting.listener.PieRadarChartTouchListener) {
            ((com.github.mikephil.charting.listener.PieRadarChartTouchListener) this.mChartTouchListener).computeScroll();
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
        if (this.mData == null) {
            return;
        }
        calcMinMax();
        if (this.mLegend != null) {
            this.mLegendRenderer.computeLegend(this.mData);
        }
        calculateOffsets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (r2 != 2) goto L54;
     */
    @Override // com.github.mikephil.charting.charts.Chart
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void calculateOffsets() {
        float f;
        float f2;
        float f3;
        float convertDpToPixel;
        float f4;
        float f5;
        float min;
        float f6 = 0.0f;
        if (this.mLegend == null || !this.mLegend.isEnabled() || this.mLegend.isDrawInsideEnabled()) {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        } else {
            float min2 = java.lang.Math.min(this.mLegend.mNeededWidth, this.mViewPortHandler.getChartWidth() * this.mLegend.getMaxSizePercent());
            int i = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.getHighResolutionOutputSizeshNQ4ISI[this.mLegend.getOrientation().ordinal()];
            if (i == 1) {
                if (this.mLegend.getHorizontalAlignment() != com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT && this.mLegend.getHorizontalAlignment() != com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT) {
                    convertDpToPixel = 0.0f;
                } else if (this.mLegend.getVerticalAlignment() == com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER) {
                    convertDpToPixel = min2 + com.github.mikephil.charting.utils.Utils.convertDpToPixel(13.0f);
                } else {
                    convertDpToPixel = min2 + com.github.mikephil.charting.utils.Utils.convertDpToPixel(8.0f);
                    float f7 = this.mLegend.mNeededHeight;
                    float f8 = this.mLegend.mTextHeightMax;
                    com.github.mikephil.charting.utils.MPPointF center = getCenter();
                    float width = this.mLegend.getHorizontalAlignment() == com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT ? (getWidth() - convertDpToPixel) + 15.0f : convertDpToPixel - 15.0f;
                    float f9 = f7 + f8 + 15.0f;
                    float distanceToCenter = distanceToCenter(width, f9);
                    com.github.mikephil.charting.utils.MPPointF position = getPosition(center, getRadius(), getAngleForPoint(width, f9));
                    float distanceToCenter2 = distanceToCenter(position.x, position.y);
                    float convertDpToPixel2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(5.0f);
                    if (f9 < center.y || getHeight() - convertDpToPixel <= getWidth()) {
                        convertDpToPixel = distanceToCenter < distanceToCenter2 ? convertDpToPixel2 + (distanceToCenter2 - distanceToCenter) : 0.0f;
                    }
                    com.github.mikephil.charting.utils.MPPointF.recycleInstance(center);
                    com.github.mikephil.charting.utils.MPPointF.recycleInstance(position);
                }
                int i2 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.getHighSpeedVideoSizes[this.mLegend.getHorizontalAlignment().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            int i3 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.getHighSpeedVideoFpsRanges[this.mLegend.getVerticalAlignment().ordinal()];
                            if (i3 == 1) {
                                min = java.lang.Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent());
                                f4 = min;
                                convertDpToPixel = 0.0f;
                                f5 = 0.0f;
                                float requiredBaseOffset = f6 + getRequiredBaseOffset();
                                f = convertDpToPixel + getRequiredBaseOffset();
                                f2 = f4 + getRequiredBaseOffset();
                                float requiredBaseOffset2 = f5 + getRequiredBaseOffset();
                                f3 = requiredBaseOffset;
                                f6 = requiredBaseOffset2;
                            } else if (i3 == 2) {
                                min = java.lang.Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent());
                                f5 = min;
                                convertDpToPixel = 0.0f;
                                f4 = 0.0f;
                                float requiredBaseOffset3 = f6 + getRequiredBaseOffset();
                                f = convertDpToPixel + getRequiredBaseOffset();
                                f2 = f4 + getRequiredBaseOffset();
                                float requiredBaseOffset22 = f5 + getRequiredBaseOffset();
                                f3 = requiredBaseOffset3;
                                f6 = requiredBaseOffset22;
                            }
                        }
                        convertDpToPixel = 0.0f;
                    }
                    f4 = 0.0f;
                    f5 = 0.0f;
                    float requiredBaseOffset32 = f6 + getRequiredBaseOffset();
                    f = convertDpToPixel + getRequiredBaseOffset();
                    f2 = f4 + getRequiredBaseOffset();
                    float requiredBaseOffset222 = f5 + getRequiredBaseOffset();
                    f3 = requiredBaseOffset32;
                    f6 = requiredBaseOffset222;
                } else {
                    f4 = 0.0f;
                    f5 = 0.0f;
                    f6 = convertDpToPixel;
                    convertDpToPixel = 0.0f;
                    float requiredBaseOffset322 = f6 + getRequiredBaseOffset();
                    f = convertDpToPixel + getRequiredBaseOffset();
                    f2 = f4 + getRequiredBaseOffset();
                    float requiredBaseOffset2222 = f5 + getRequiredBaseOffset();
                    f3 = requiredBaseOffset322;
                    f6 = requiredBaseOffset2222;
                }
            } else {
                if (i == 2 && (this.mLegend.getVerticalAlignment() == com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP || this.mLegend.getVerticalAlignment() == com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM)) {
                    min = java.lang.Math.min(this.mLegend.mNeededHeight + getRequiredLegendOffset(), this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent());
                    int i4 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.getHighSpeedVideoFpsRanges[this.mLegend.getVerticalAlignment().ordinal()];
                    if (i4 != 1) {
                    }
                    f4 = min;
                    convertDpToPixel = 0.0f;
                    f5 = 0.0f;
                    float requiredBaseOffset3222 = f6 + getRequiredBaseOffset();
                    f = convertDpToPixel + getRequiredBaseOffset();
                    f2 = f4 + getRequiredBaseOffset();
                    float requiredBaseOffset22222 = f5 + getRequiredBaseOffset();
                    f3 = requiredBaseOffset3222;
                    f6 = requiredBaseOffset22222;
                }
                convertDpToPixel = 0.0f;
                f4 = 0.0f;
                f5 = 0.0f;
                float requiredBaseOffset32222 = f6 + getRequiredBaseOffset();
                f = convertDpToPixel + getRequiredBaseOffset();
                f2 = f4 + getRequiredBaseOffset();
                float requiredBaseOffset222222 = f5 + getRequiredBaseOffset();
                f3 = requiredBaseOffset32222;
                f6 = requiredBaseOffset222222;
            }
        }
        float convertDpToPixel3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.mMinOffset);
        if (this instanceof com.github.mikephil.charting.charts.RadarChart) {
            com.github.mikephil.charting.components.XAxis xAxis = getXAxis();
            if (xAxis.isEnabled() && xAxis.isDrawLabelsEnabled()) {
                convertDpToPixel3 = java.lang.Math.max(convertDpToPixel3, xAxis.mLabelRotatedWidth);
            }
        }
        this.mViewPortHandler.restrainViewPort(java.lang.Math.max(convertDpToPixel3, f3 + getExtraLeftOffset()), java.lang.Math.max(convertDpToPixel3, f2 + getExtraTopOffset()), java.lang.Math.max(convertDpToPixel3, f + getExtraRightOffset()), java.lang.Math.max(convertDpToPixel3, java.lang.Math.max(getRequiredBaseOffset(), f6 + getExtraBottomOffset())));
        boolean z = this.mLogEnabled;
    }

    /* renamed from: com.github.mikephil.charting.charts.PieRadarChartBase$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.github.mikephil.charting.components.Legend.LegendOrientation.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.values().length];
            getHighSpeedVideoSizes = iArr2;
            try {
                iArr2[com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoSizes[com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.values().length];
            getHighSpeedVideoFpsRanges = iArr3;
            try {
                iArr3[com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    public float getAngleForPoint(float f, float f2) {
        com.github.mikephil.charting.utils.MPPointF centerOffsets = getCenterOffsets();
        double d = f - centerOffsets.x;
        double d2 = f2 - centerOffsets.y;
        float degrees = (float) java.lang.Math.toDegrees(java.lang.Math.acos(d2 / java.lang.Math.sqrt((d * d) + (d2 * d2))));
        if (f > centerOffsets.x) {
            degrees = 360.0f - degrees;
        }
        float f3 = degrees + 90.0f;
        if (f3 > 360.0f) {
            f3 -= 360.0f;
        }
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerOffsets);
        return f3;
    }

    public com.github.mikephil.charting.utils.MPPointF getPosition(com.github.mikephil.charting.utils.MPPointF mPPointF, float f, float f2) {
        com.github.mikephil.charting.utils.MPPointF mPPointF2 = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        getPosition(mPPointF, f, f2, mPPointF2);
        return mPPointF2;
    }

    public void getPosition(com.github.mikephil.charting.utils.MPPointF mPPointF, float f, float f2, com.github.mikephil.charting.utils.MPPointF mPPointF2) {
        double d = f;
        double d2 = f2;
        mPPointF2.x = (float) (mPPointF.x + (java.lang.Math.cos(java.lang.Math.toRadians(d2)) * d));
        mPPointF2.y = (float) (mPPointF.y + (d * java.lang.Math.sin(java.lang.Math.toRadians(d2))));
    }

    public float distanceToCenter(float f, float f2) {
        float f3;
        float f4;
        com.github.mikephil.charting.utils.MPPointF centerOffsets = getCenterOffsets();
        if (f > centerOffsets.x) {
            f3 = f - centerOffsets.x;
        } else {
            f3 = centerOffsets.x - f;
        }
        if (f2 > centerOffsets.y) {
            f4 = f2 - centerOffsets.y;
        } else {
            f4 = centerOffsets.y - f2;
        }
        float sqrt = (float) java.lang.Math.sqrt(java.lang.Math.pow(f3, 2.0d) + java.lang.Math.pow(f4, 2.0d));
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerOffsets);
        return sqrt;
    }

    public void setRotationAngle(float f) {
        this.Camera2StreamConfigurationMap = f;
        this.getHighSpeedVideoFpsRangesFor = com.github.mikephil.charting.utils.Utils.getNormalizedAngle(f);
    }

    public float getRawRotationAngle() {
        return this.Camera2StreamConfigurationMap;
    }

    public float getRotationAngle() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setRotationEnabled(boolean z) {
        this.mRotateEnabled = z;
    }

    public boolean isRotationEnabled() {
        return this.mRotateEnabled;
    }

    public float getMinOffset() {
        return this.mMinOffset;
    }

    public void setMinOffset(float f) {
        this.mMinOffset = f;
    }

    public float getDiameter() {
        android.graphics.RectF contentRect = this.mViewPortHandler.getContentRect();
        contentRect.left += getExtraLeftOffset();
        contentRect.top += getExtraTopOffset();
        contentRect.right -= getExtraRightOffset();
        contentRect.bottom -= getExtraBottomOffset();
        return java.lang.Math.min(contentRect.width(), contentRect.height());
    }

    public void spin(int i, float f, float f2, com.github.mikephil.charting.animation.Easing.EasingFunction easingFunction) {
        setRotationAngle(f);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "rotationAngle", f, f2);
        ofFloat.setDuration(i);
        ofFloat.setInterpolator(easingFunction);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.github.mikephil.charting.charts.PieRadarChartBase.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.github.mikephil.charting.charts.PieRadarChartBase.this.postInvalidate();
            }
        });
        ofFloat.start();
    }
}
