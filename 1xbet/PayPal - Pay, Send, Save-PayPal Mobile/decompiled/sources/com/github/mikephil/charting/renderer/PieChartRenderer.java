package com.github.mikephil.charting.renderer;

/* loaded from: classes8.dex */
public class PieChartRenderer extends com.github.mikephil.charting.renderer.DataRenderer {
    private android.text.TextPaint Camera2StreamConfigurationMap;
    private android.graphics.RectF getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.CharSequence getHighSpeedVideoFpsRanges;
    private android.graphics.Paint getHighSpeedVideoFpsRangesFor;
    private android.text.StaticLayout getHighSpeedVideoSizes;
    private android.graphics.Path getHighSpeedVideoSizesFor;
    private android.graphics.RectF[] getInputSizeshNQ4ISI;
    private android.graphics.Path getOutputFormats;
    private android.graphics.RectF getOutputMinFrameDuration;
    protected android.graphics.Canvas mBitmapCanvas;
    protected com.github.mikephil.charting.charts.PieChart mChart;
    protected java.lang.ref.WeakReference<android.graphics.Bitmap> mDrawBitmap;
    protected android.graphics.Path mDrawCenterTextPathBuffer;
    protected android.graphics.RectF mDrawHighlightedRectF;
    protected android.graphics.Paint mHolePaint;
    protected android.graphics.Paint mTransparentCirclePaint;
    protected android.graphics.Paint mValueLinePaint;

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }

    public PieChartRenderer(com.github.mikephil.charting.charts.PieChart pieChart, com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.RectF();
        this.getInputSizeshNQ4ISI = new android.graphics.RectF[]{new android.graphics.RectF(), new android.graphics.RectF(), new android.graphics.RectF()};
        this.getOutputFormats = new android.graphics.Path();
        this.getOutputMinFrameDuration = new android.graphics.RectF();
        this.getHighSpeedVideoSizesFor = new android.graphics.Path();
        this.mDrawCenterTextPathBuffer = new android.graphics.Path();
        this.mDrawHighlightedRectF = new android.graphics.RectF();
        this.mChart = pieChart;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.mHolePaint = paint;
        paint.setColor(-1);
        this.mHolePaint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.mTransparentCirclePaint = paint2;
        paint2.setColor(-1);
        this.mTransparentCirclePaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mTransparentCirclePaint.setAlpha(105);
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        this.Camera2StreamConfigurationMap = textPaint;
        textPaint.setColor(-16777216);
        this.Camera2StreamConfigurationMap.setTextSize(com.github.mikephil.charting.utils.Utils.convertDpToPixel(12.0f));
        this.mValuePaint.setTextSize(com.github.mikephil.charting.utils.Utils.convertDpToPixel(13.0f));
        this.mValuePaint.setColor(-1);
        this.mValuePaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.getHighSpeedVideoFpsRangesFor = paint3;
        paint3.setColor(-1);
        this.getHighSpeedVideoFpsRangesFor.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.getHighSpeedVideoFpsRangesFor.setTextSize(com.github.mikephil.charting.utils.Utils.convertDpToPixel(13.0f));
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        this.mValueLinePaint = paint4;
        paint4.setStyle(android.graphics.Paint.Style.STROKE);
    }

    public android.graphics.Paint getPaintHole() {
        return this.mHolePaint;
    }

    public android.graphics.Paint getPaintTransparentCircle() {
        return this.mTransparentCirclePaint;
    }

    public android.text.TextPaint getPaintCenterText() {
        return this.Camera2StreamConfigurationMap;
    }

    public android.graphics.Paint getPaintEntryLabels() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas canvas) {
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        java.lang.ref.WeakReference<android.graphics.Bitmap> weakReference = this.mDrawBitmap;
        android.graphics.Bitmap bitmap = weakReference == null ? null : weakReference.get();
        if (bitmap == null || bitmap.getWidth() != chartWidth || bitmap.getHeight() != chartHeight) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            bitmap = android.graphics.Bitmap.createBitmap(chartWidth, chartHeight, android.graphics.Bitmap.Config.ARGB_4444);
            this.mDrawBitmap = new java.lang.ref.WeakReference<>(bitmap);
            this.mBitmapCanvas = new android.graphics.Canvas(bitmap);
        }
        bitmap.eraseColor(0);
        for (com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet : ((com.github.mikephil.charting.data.PieData) this.mChart.getData()).getDataSets()) {
            if (iPieDataSet.isVisible() && iPieDataSet.getEntryCount() > 0) {
                drawDataSet(canvas, iPieDataSet);
            }
        }
    }

    protected float calculateMinimumRadiusForSpacedSlice(com.github.mikephil.charting.utils.MPPointF mPPointF, float f, float f2, float f3, float f4, float f5, float f6) {
        double d = (f5 + f6) * 0.017453292f;
        float cos = mPPointF.x + (((float) java.lang.Math.cos(d)) * f);
        float sin = mPPointF.y + (((float) java.lang.Math.sin(d)) * f);
        double d2 = (f5 + (f6 / 2.0f)) * 0.017453292f;
        return (float) ((f - ((float) ((java.lang.Math.sqrt(java.lang.Math.pow(cos - f3, 2.0d) + java.lang.Math.pow(sin - f4, 2.0d)) / 2.0d) * java.lang.Math.tan(((180.0d - f2) / 2.0d) * 0.017453292519943295d)))) - java.lang.Math.sqrt(java.lang.Math.pow((mPPointF.x + (((float) java.lang.Math.cos(d2)) * f)) - ((cos + f3) / 2.0f), 2.0d) + java.lang.Math.pow((mPPointF.y + (((float) java.lang.Math.sin(d2)) * f)) - ((sin + f4) / 2.0f), 2.0d)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected float getSliceSpace(com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet) {
        if (!iPieDataSet.isAutomaticallyDisableSliceSpacingEnabled()) {
            return iPieDataSet.getSliceSpace();
        }
        if (iPieDataSet.getSliceSpace() / this.mViewPortHandler.getSmallestContentExtension() > (iPieDataSet.getYMin() / ((com.github.mikephil.charting.data.PieData) this.mChart.getData()).getYValueSum()) * 2.0f) {
            return 0.0f;
        }
        return iPieDataSet.getSliceSpace();
    }

    protected void drawDataSet(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet) {
        int i;
        float f;
        float f2;
        float f3;
        android.graphics.RectF rectF;
        int i2;
        float[] fArr;
        int i3;
        android.graphics.RectF rectF2;
        float f4;
        com.github.mikephil.charting.utils.MPPointF mPPointF;
        int i4;
        float f5;
        com.github.mikephil.charting.utils.MPPointF mPPointF2;
        int i5;
        float f6;
        com.github.mikephil.charting.utils.MPPointF mPPointF3;
        com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet2 = iPieDataSet;
        float rotationAngle = this.mChart.getRotationAngle();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        android.graphics.RectF circleBox = this.mChart.getCircleBox();
        int entryCount = iPieDataSet.getEntryCount();
        float[] drawAngles = this.mChart.getDrawAngles();
        com.github.mikephil.charting.utils.MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        boolean z = this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled();
        float holeRadius = z ? (this.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        float holeRadius2 = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        android.graphics.RectF rectF3 = new android.graphics.RectF();
        boolean z2 = z && this.mChart.isDrawRoundedSlicesEnabled();
        int i6 = 0;
        for (int i7 = 0; i7 < entryCount; i7++) {
            if (java.lang.Math.abs(iPieDataSet2.getEntryForIndex(i7).getY()) > com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                i6++;
            }
        }
        float sliceSpace = i6 <= 1 ? 0.0f : getSliceSpace(iPieDataSet2);
        int i8 = 0;
        float f7 = 0.0f;
        while (i8 < entryCount) {
            float f8 = drawAngles[i8];
            if (java.lang.Math.abs(iPieDataSet2.getEntryForIndex(i8).getY()) > com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON && (!this.mChart.needsHighlight(i8) || z2)) {
                boolean z3 = sliceSpace > 0.0f && f8 <= 180.0f;
                i2 = entryCount;
                this.mRenderPaint.setColor(iPieDataSet2.getColor(i8));
                float f9 = i6 == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                float f10 = rotationAngle + ((f7 + (f9 / 2.0f)) * phaseY);
                float f11 = (f8 - f9) * phaseY;
                float f12 = f11 < 0.0f ? 0.0f : f11;
                this.getOutputFormats.reset();
                if (z2) {
                    float f13 = radius - holeRadius2;
                    i = i8;
                    i4 = i6;
                    double d = f10 * 0.017453292f;
                    f2 = rotationAngle;
                    f3 = phaseX;
                    float cos = centerCircleBox.x + (((float) java.lang.Math.cos(d)) * f13);
                    float sin = centerCircleBox.y + (f13 * ((float) java.lang.Math.sin(d)));
                    rectF3.set(cos - holeRadius2, sin - holeRadius2, cos + holeRadius2, sin + holeRadius2);
                } else {
                    i = i8;
                    i4 = i6;
                    f2 = rotationAngle;
                    f3 = phaseX;
                }
                double d2 = f10 * 0.017453292f;
                float f14 = holeRadius;
                float cos2 = (((float) java.lang.Math.cos(d2)) * radius) + centerCircleBox.x;
                float sin2 = centerCircleBox.y + (((float) java.lang.Math.sin(d2)) * radius);
                if (f12 >= 360.0f && f12 % 360.0f <= com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                    fArr = drawAngles;
                    this.getOutputFormats.addCircle(centerCircleBox.x, centerCircleBox.y, radius, android.graphics.Path.Direction.CW);
                } else {
                    fArr = drawAngles;
                    if (z2) {
                        this.getOutputFormats.arcTo(rectF3, f10 + 180.0f, -180.0f);
                    }
                    this.getOutputFormats.arcTo(circleBox, f10, f12);
                }
                android.graphics.RectF rectF4 = rectF3;
                this.getOutputMinFrameDuration.set(centerCircleBox.x - f14, centerCircleBox.y - f14, centerCircleBox.x + f14, centerCircleBox.y + f14);
                if (!z) {
                    f = radius;
                    f4 = f14;
                    i3 = i4;
                    rectF2 = rectF4;
                    rectF = circleBox;
                    mPPointF = centerCircleBox;
                    f5 = 360.0f;
                } else if (f14 > 0.0f || z3) {
                    if (z3) {
                        i3 = i4;
                        rectF = circleBox;
                        f4 = f14;
                        i5 = 1;
                        f = radius;
                        mPPointF2 = centerCircleBox;
                        float calculateMinimumRadiusForSpacedSlice = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f8 * phaseY, cos2, sin2, f10, f12);
                        if (calculateMinimumRadiusForSpacedSlice < 0.0f) {
                            calculateMinimumRadiusForSpacedSlice = -calculateMinimumRadiusForSpacedSlice;
                        }
                        f6 = java.lang.Math.max(f4, calculateMinimumRadiusForSpacedSlice);
                    } else {
                        f = radius;
                        mPPointF2 = centerCircleBox;
                        f4 = f14;
                        i3 = i4;
                        rectF = circleBox;
                        i5 = 1;
                        f6 = f4;
                    }
                    float f15 = (i3 == i5 || f6 == 0.0f) ? 0.0f : sliceSpace / (f6 * 0.017453292f);
                    float f16 = f15 / 2.0f;
                    float f17 = (f8 - f15) * phaseY;
                    if (f17 < 0.0f) {
                        f17 = 0.0f;
                    }
                    float f18 = f2 + ((f7 + f16) * phaseY) + f17;
                    if (f12 >= 360.0f && f12 % 360.0f <= com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                        this.getOutputFormats.addCircle(mPPointF2.x, mPPointF2.y, f6, android.graphics.Path.Direction.CCW);
                        mPPointF = mPPointF2;
                        rectF2 = rectF4;
                    } else {
                        if (z2) {
                            float f19 = f - holeRadius2;
                            double d3 = 0.017453292f * f18;
                            mPPointF3 = mPPointF2;
                            float cos3 = mPPointF2.x + (((float) java.lang.Math.cos(d3)) * f19);
                            float sin3 = mPPointF3.y + (((float) java.lang.Math.sin(d3)) * f19);
                            rectF2 = rectF4;
                            rectF2.set(cos3 - holeRadius2, sin3 - holeRadius2, cos3 + holeRadius2, sin3 + holeRadius2);
                            this.getOutputFormats.arcTo(rectF2, f18, 180.0f);
                        } else {
                            mPPointF3 = mPPointF2;
                            rectF2 = rectF4;
                            double d4 = f18 * 0.017453292f;
                            this.getOutputFormats.lineTo(mPPointF3.x + (((float) java.lang.Math.cos(d4)) * f6), mPPointF3.y + (f6 * ((float) java.lang.Math.sin(d4))));
                        }
                        this.getOutputFormats.arcTo(this.getOutputMinFrameDuration, f18, -f17);
                        mPPointF = mPPointF3;
                    }
                    this.getOutputFormats.close();
                    this.mBitmapCanvas.drawPath(this.getOutputFormats, this.mRenderPaint);
                    f7 += f8 * f3;
                } else {
                    f = radius;
                    f4 = f14;
                    i3 = i4;
                    rectF2 = rectF4;
                    f5 = 360.0f;
                    rectF = circleBox;
                    mPPointF = centerCircleBox;
                }
                if (f12 % f5 > com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                    if (z3) {
                        float calculateMinimumRadiusForSpacedSlice2 = calculateMinimumRadiusForSpacedSlice(mPPointF, f, f8 * phaseY, cos2, sin2, f10, f12);
                        double d5 = (f10 + (f12 / 2.0f)) * 0.017453292f;
                        this.getOutputFormats.lineTo(mPPointF.x + (((float) java.lang.Math.cos(d5)) * calculateMinimumRadiusForSpacedSlice2), mPPointF.y + (calculateMinimumRadiusForSpacedSlice2 * ((float) java.lang.Math.sin(d5))));
                    } else {
                        this.getOutputFormats.lineTo(mPPointF.x, mPPointF.y);
                    }
                }
                this.getOutputFormats.close();
                this.mBitmapCanvas.drawPath(this.getOutputFormats, this.mRenderPaint);
                f7 += f8 * f3;
            } else {
                f7 += f8 * phaseX;
                i = i8;
                f = radius;
                f2 = rotationAngle;
                f3 = phaseX;
                rectF = circleBox;
                i2 = entryCount;
                fArr = drawAngles;
                i3 = i6;
                rectF2 = rectF3;
                f4 = holeRadius;
                mPPointF = centerCircleBox;
            }
            i8 = i + 1;
            iPieDataSet2 = iPieDataSet;
            holeRadius = f4;
            rectF3 = rectF2;
            centerCircleBox = mPPointF;
            i6 = i3;
            radius = f;
            entryCount = i2;
            circleBox = rectF;
            rotationAngle = f2;
            phaseX = f3;
            drawAngles = fArr;
        }
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerCircleBox);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas canvas) {
        int i;
        java.util.List<com.github.mikephil.charting.interfaces.datasets.IPieDataSet> list;
        float f;
        float[] fArr;
        float[] fArr2;
        float f2;
        float f3;
        float f4;
        com.github.mikephil.charting.utils.MPPointF mPPointF;
        android.graphics.Canvas canvas2;
        float f5;
        com.github.mikephil.charting.data.PieDataSet.ValuePosition valuePosition;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        com.github.mikephil.charting.utils.MPPointF mPPointF2;
        com.github.mikephil.charting.data.PieEntry pieEntry;
        com.github.mikephil.charting.formatter.ValueFormatter valueFormatter;
        com.github.mikephil.charting.utils.MPPointF mPPointF3;
        float f12;
        com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet;
        android.graphics.Canvas canvas3;
        java.lang.String str;
        java.lang.String str2;
        com.github.mikephil.charting.utils.MPPointF mPPointF4;
        android.graphics.Canvas canvas4 = canvas;
        com.github.mikephil.charting.utils.MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        float holeRadius2 = this.mChart.getHoleRadius() / 100.0f;
        float f13 = (radius / 10.0f) * 3.6f;
        if (this.mChart.isDrawHoleEnabled()) {
            f13 = (radius - (radius * holeRadius2)) / 2.0f;
            if (!this.mChart.isDrawSlicesUnderHoleEnabled() && this.mChart.isDrawRoundedSlicesEnabled()) {
                rotationAngle = (float) (rotationAngle + ((holeRadius * 360.0f) / (radius * 6.283185307179586d)));
            }
        }
        float f14 = rotationAngle;
        float f15 = radius - f13;
        com.github.mikephil.charting.data.PieData pieData = (com.github.mikephil.charting.data.PieData) this.mChart.getData();
        java.util.List<com.github.mikephil.charting.interfaces.datasets.IPieDataSet> dataSets = pieData.getDataSets();
        float yValueSum = pieData.getYValueSum();
        boolean isDrawEntryLabelsEnabled = this.mChart.isDrawEntryLabelsEnabled();
        canvas.save();
        float convertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(5.0f);
        int i2 = 0;
        int i3 = 0;
        while (i3 < dataSets.size()) {
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet2 = dataSets.get(i3);
            boolean isDrawValuesEnabled = iPieDataSet2.isDrawValuesEnabled();
            if (isDrawValuesEnabled || isDrawEntryLabelsEnabled) {
                com.github.mikephil.charting.data.PieDataSet.ValuePosition xValuePosition = iPieDataSet2.getXValuePosition();
                com.github.mikephil.charting.data.PieDataSet.ValuePosition yValuePosition = iPieDataSet2.getYValuePosition();
                applyValueTextStyle(iPieDataSet2);
                int i4 = i2;
                i = i3;
                float calcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mValuePaint, com.visa.cbp.getEncExpo.updateVisuals) + com.github.mikephil.charting.utils.Utils.convertDpToPixel(4.0f);
                com.github.mikephil.charting.formatter.ValueFormatter valueFormatter2 = iPieDataSet2.getValueFormatter();
                int entryCount = iPieDataSet2.getEntryCount();
                list = dataSets;
                this.mValueLinePaint.setColor(iPieDataSet2.getValueLineColor());
                this.mValueLinePaint.setStrokeWidth(com.github.mikephil.charting.utils.Utils.convertDpToPixel(iPieDataSet2.getValueLineWidth()));
                float sliceSpace = getSliceSpace(iPieDataSet2);
                com.github.mikephil.charting.utils.MPPointF mPPointF5 = com.github.mikephil.charting.utils.MPPointF.getInstance(iPieDataSet2.getIconsOffset());
                com.github.mikephil.charting.utils.MPPointF mPPointF6 = centerCircleBox;
                mPPointF5.x = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF5.x);
                mPPointF5.y = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF5.y);
                int i5 = 0;
                while (i5 < entryCount) {
                    com.github.mikephil.charting.utils.MPPointF mPPointF7 = mPPointF5;
                    com.github.mikephil.charting.data.PieEntry entryForIndex = iPieDataSet2.getEntryForIndex(i5);
                    int i6 = entryCount;
                    float f16 = f14 + (((i4 == 0 ? 0.0f : absoluteAngles[i4 - 1] * phaseX) + ((drawAngles[i4] - ((sliceSpace / (f15 * 0.017453292f)) / 2.0f)) / 2.0f)) * phaseY);
                    float f17 = sliceSpace;
                    java.lang.String pieLabel = valueFormatter2.getPieLabel(this.mChart.isUsePercentValuesEnabled() ? (entryForIndex.getY() / yValueSum) * 100.0f : entryForIndex.getY(), entryForIndex);
                    float[] fArr3 = drawAngles;
                    java.lang.String label = entryForIndex.getLabel();
                    com.github.mikephil.charting.formatter.ValueFormatter valueFormatter3 = valueFormatter2;
                    double d = f16 * 0.017453292f;
                    float[] fArr4 = absoluteAngles;
                    float f18 = phaseX;
                    float cos = (float) java.lang.Math.cos(d);
                    float f19 = phaseY;
                    float sin = (float) java.lang.Math.sin(d);
                    boolean z = isDrawEntryLabelsEnabled && xValuePosition == com.github.mikephil.charting.data.PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    float f20 = f14;
                    boolean z2 = isDrawValuesEnabled && yValuePosition == com.github.mikephil.charting.data.PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    boolean z3 = isDrawEntryLabelsEnabled && xValuePosition == com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE;
                    com.github.mikephil.charting.data.PieDataSet.ValuePosition valuePosition2 = xValuePosition;
                    boolean z4 = isDrawValuesEnabled && yValuePosition == com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE;
                    if (z || z2) {
                        float valueLinePart1Length = iPieDataSet2.getValueLinePart1Length();
                        float valueLinePart2Length = iPieDataSet2.getValueLinePart2Length();
                        float valueLinePart1OffsetPercentage = iPieDataSet2.getValueLinePart1OffsetPercentage() / 100.0f;
                        valuePosition = yValuePosition;
                        if (this.mChart.isDrawHoleEnabled()) {
                            float f21 = radius * holeRadius2;
                            f6 = ((radius - f21) * valueLinePart1OffsetPercentage) + f21;
                        } else {
                            f6 = radius * valueLinePart1OffsetPercentage;
                        }
                        float abs = iPieDataSet2.isValueLineVariableLength() ? valueLinePart2Length * f15 * java.lang.Math.abs((float) java.lang.Math.sin(d)) : valueLinePart2Length * f15;
                        com.github.mikephil.charting.utils.MPPointF mPPointF8 = mPPointF6;
                        float f22 = mPPointF8.x;
                        float f23 = mPPointF8.y;
                        float f24 = (valueLinePart1Length + 1.0f) * f15;
                        f7 = radius;
                        float f25 = (f24 * cos) + mPPointF8.x;
                        f8 = f15;
                        float f26 = mPPointF8.y + (f24 * sin);
                        boolean z5 = z2;
                        double d2 = f16 % 360.0d;
                        if (d2 >= 90.0d && d2 <= 270.0d) {
                            float f27 = f25 - abs;
                            this.mValuePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                            if (z) {
                                this.getHighSpeedVideoFpsRangesFor.setTextAlign(android.graphics.Paint.Align.RIGHT);
                            }
                            f10 = f27 - convertDpToPixel;
                            f9 = f27;
                        } else {
                            f9 = f25 + abs;
                            this.mValuePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
                            if (z) {
                                this.getHighSpeedVideoFpsRangesFor.setTextAlign(android.graphics.Paint.Align.LEFT);
                            }
                            f10 = f9 + convertDpToPixel;
                        }
                        if (iPieDataSet2.getValueLineColor() != 1122867) {
                            if (iPieDataSet2.isUsingSliceColorAsValueLineColor()) {
                                this.mValueLinePaint.setColor(iPieDataSet2.getColor(i5));
                            }
                            valueFormatter = valueFormatter3;
                            f12 = sin;
                            iPieDataSet = iPieDataSet2;
                            f11 = cos;
                            mPPointF2 = mPPointF7;
                            pieEntry = entryForIndex;
                            mPPointF3 = mPPointF8;
                            canvas.drawLine(f22 + (f6 * cos), (f6 * sin) + f23, f25, f26, this.mValueLinePaint);
                            canvas.drawLine(f25, f26, f9, f26, this.mValueLinePaint);
                        } else {
                            f11 = cos;
                            mPPointF2 = mPPointF7;
                            pieEntry = entryForIndex;
                            valueFormatter = valueFormatter3;
                            mPPointF3 = mPPointF8;
                            f12 = sin;
                            iPieDataSet = iPieDataSet2;
                        }
                        if (z && z5) {
                            drawValue(canvas, pieLabel, f10, f26, iPieDataSet.getValueTextColor(i5));
                            if (i5 >= pieData.getEntryCount() || label == null) {
                                canvas3 = canvas;
                                str2 = label;
                            } else {
                                canvas3 = canvas;
                                str = label;
                                drawEntryLabel(canvas3, str, f10, f26 + calcTextHeight);
                                str2 = str;
                            }
                        } else {
                            canvas3 = canvas;
                            str = label;
                            if (z) {
                                if (i5 < pieData.getEntryCount() && str != null) {
                                    drawEntryLabel(canvas3, str, f10, f26 + (calcTextHeight / 2.0f));
                                }
                            } else if (z5) {
                                float f28 = f10;
                                str2 = str;
                                drawValue(canvas, pieLabel, f28, (calcTextHeight / 2.0f) + f26, iPieDataSet.getValueTextColor(i5));
                            }
                            str2 = str;
                        }
                    } else {
                        valuePosition = yValuePosition;
                        f7 = radius;
                        f11 = cos;
                        mPPointF3 = mPPointF6;
                        mPPointF2 = mPPointF7;
                        pieEntry = entryForIndex;
                        valueFormatter = valueFormatter3;
                        str2 = label;
                        canvas3 = canvas;
                        f12 = sin;
                        f8 = f15;
                        iPieDataSet = iPieDataSet2;
                    }
                    if (z3 || z4) {
                        float f29 = mPPointF3.x + (f8 * f11);
                        float f30 = (f8 * f12) + mPPointF3.y;
                        this.mValuePaint.setTextAlign(android.graphics.Paint.Align.CENTER);
                        if (z3 && z4) {
                            drawValue(canvas, pieLabel, f29, f30, iPieDataSet.getValueTextColor(i5));
                            if (i5 < pieData.getEntryCount() && str2 != null) {
                                drawEntryLabel(canvas3, str2, f29, f30 + calcTextHeight);
                            }
                        } else {
                            if (z3) {
                                if (i5 < pieData.getEntryCount() && str2 != null) {
                                    drawEntryLabel(canvas3, str2, f29, f30 + (calcTextHeight / 2.0f));
                                }
                            } else if (z4) {
                                drawValue(canvas, pieLabel, f29, f30 + (calcTextHeight / 2.0f), iPieDataSet.getValueTextColor(i5));
                            }
                            if (pieEntry.getIcon() == null && iPieDataSet.isDrawIconsEnabled()) {
                                android.graphics.drawable.Drawable icon = pieEntry.getIcon();
                                mPPointF4 = mPPointF2;
                                com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon, (int) (((mPPointF4.y + f8) * f11) + mPPointF3.x), (int) (((mPPointF4.y + f8) * f12) + mPPointF3.y + mPPointF4.x), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            } else {
                                mPPointF4 = mPPointF2;
                            }
                            i4++;
                            i5++;
                            mPPointF5 = mPPointF4;
                            iPieDataSet2 = iPieDataSet;
                            f15 = f8;
                            sliceSpace = f17;
                            entryCount = i6;
                            drawAngles = fArr3;
                            phaseX = f18;
                            phaseY = f19;
                            f14 = f20;
                            xValuePosition = valuePosition2;
                            radius = f7;
                            yValuePosition = valuePosition;
                            valueFormatter2 = valueFormatter;
                            mPPointF6 = mPPointF3;
                            absoluteAngles = fArr4;
                        }
                    }
                    if (pieEntry.getIcon() == null) {
                    }
                    mPPointF4 = mPPointF2;
                    i4++;
                    i5++;
                    mPPointF5 = mPPointF4;
                    iPieDataSet2 = iPieDataSet;
                    f15 = f8;
                    sliceSpace = f17;
                    entryCount = i6;
                    drawAngles = fArr3;
                    phaseX = f18;
                    phaseY = f19;
                    f14 = f20;
                    xValuePosition = valuePosition2;
                    radius = f7;
                    yValuePosition = valuePosition;
                    valueFormatter2 = valueFormatter;
                    mPPointF6 = mPPointF3;
                    absoluteAngles = fArr4;
                }
                f = radius;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                f2 = phaseX;
                f3 = phaseY;
                f4 = f14;
                mPPointF = mPPointF6;
                canvas2 = canvas;
                f5 = f15;
                com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF5);
                i2 = i4;
            } else {
                i = i3;
                list = dataSets;
                f = radius;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                f2 = phaseX;
                f3 = phaseY;
                f4 = f14;
                f5 = f15;
                canvas2 = canvas4;
                mPPointF = centerCircleBox;
            }
            i3 = i + 1;
            canvas4 = canvas2;
            centerCircleBox = mPPointF;
            dataSets = list;
            f15 = f5;
            drawAngles = fArr;
            absoluteAngles = fArr2;
            phaseX = f2;
            phaseY = f3;
            f14 = f4;
            radius = f;
        }
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerCircleBox);
        canvas.restore();
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValue(android.graphics.Canvas canvas, java.lang.String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }

    protected void drawEntryLabel(android.graphics.Canvas canvas, java.lang.String str, float f, float f2) {
        canvas.drawText(str, f, f2, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas canvas) {
        drawHole(canvas);
        canvas.drawBitmap(this.mDrawBitmap.get(), 0.0f, 0.0f, (android.graphics.Paint) null);
        drawCenterText(canvas);
    }

    protected void drawHole(android.graphics.Canvas canvas) {
        if (!this.mChart.isDrawHoleEnabled() || this.mBitmapCanvas == null) {
            return;
        }
        float radius = this.mChart.getRadius();
        float holeRadius = (this.mChart.getHoleRadius() / 100.0f) * radius;
        com.github.mikephil.charting.utils.MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        if (android.graphics.Color.alpha(this.mHolePaint.getColor()) > 0) {
            this.mBitmapCanvas.drawCircle(centerCircleBox.x, centerCircleBox.y, holeRadius, this.mHolePaint);
        }
        if (android.graphics.Color.alpha(this.mTransparentCirclePaint.getColor()) > 0 && this.mChart.getTransparentCircleRadius() > this.mChart.getHoleRadius()) {
            int alpha = this.mTransparentCirclePaint.getAlpha();
            float transparentCircleRadius = this.mChart.getTransparentCircleRadius() / 100.0f;
            this.mTransparentCirclePaint.setAlpha((int) (alpha * this.mAnimator.getPhaseX() * this.mAnimator.getPhaseY()));
            this.getHighSpeedVideoSizesFor.reset();
            this.getHighSpeedVideoSizesFor.addCircle(centerCircleBox.x, centerCircleBox.y, radius * transparentCircleRadius, android.graphics.Path.Direction.CW);
            this.getHighSpeedVideoSizesFor.addCircle(centerCircleBox.x, centerCircleBox.y, holeRadius, android.graphics.Path.Direction.CCW);
            this.mBitmapCanvas.drawPath(this.getHighSpeedVideoSizesFor, this.mTransparentCirclePaint);
            this.mTransparentCirclePaint.setAlpha(alpha);
        }
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerCircleBox);
    }

    protected void drawCenterText(android.graphics.Canvas canvas) {
        float radius;
        com.github.mikephil.charting.utils.MPPointF mPPointF;
        java.lang.CharSequence centerText = this.mChart.getCenterText();
        if (!this.mChart.isDrawCenterTextEnabled() || centerText == null) {
            return;
        }
        com.github.mikephil.charting.utils.MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        com.github.mikephil.charting.utils.MPPointF centerTextOffset = this.mChart.getCenterTextOffset();
        float f = centerCircleBox.x + centerTextOffset.x;
        float f2 = centerCircleBox.y + centerTextOffset.y;
        if (this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled()) {
            radius = this.mChart.getRadius() * (this.mChart.getHoleRadius() / 100.0f);
        } else {
            radius = this.mChart.getRadius();
        }
        android.graphics.RectF rectF = this.getInputSizeshNQ4ISI[0];
        rectF.left = f - radius;
        rectF.top = f2 - radius;
        rectF.right = f + radius;
        rectF.bottom = f2 + radius;
        android.graphics.RectF rectF2 = this.getInputSizeshNQ4ISI[1];
        rectF2.set(rectF);
        float centerTextRadiusPercent = this.mChart.getCenterTextRadiusPercent() / 100.0f;
        if (centerTextRadiusPercent > 0.0d) {
            rectF2.inset((rectF2.width() - (rectF2.width() * centerTextRadiusPercent)) / 2.0f, (rectF2.height() - (rectF2.height() * centerTextRadiusPercent)) / 2.0f);
        }
        if (centerText.equals(this.getHighSpeedVideoFpsRanges) && rectF2.equals(this.getHighResolutionOutputSizeshNQ4ISI)) {
            mPPointF = centerTextOffset;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.set(rectF2);
            this.getHighSpeedVideoFpsRanges = centerText;
            mPPointF = centerTextOffset;
            this.getHighSpeedVideoSizes = new android.text.StaticLayout(centerText, 0, centerText.length(), this.Camera2StreamConfigurationMap, (int) java.lang.Math.max(java.lang.Math.ceil(this.getHighResolutionOutputSizeshNQ4ISI.width()), 1.0d), android.text.Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        float height = this.getHighSpeedVideoSizes.getHeight();
        canvas.save();
        android.graphics.Path path = this.mDrawCenterTextPathBuffer;
        path.reset();
        path.addOval(rectF, android.graphics.Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(rectF2.left, rectF2.top + ((rectF2.height() - height) / 2.0f));
        this.getHighSpeedVideoSizes.draw(canvas);
        canvas.restore();
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerCircleBox);
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas canvas, com.github.mikephil.charting.highlight.Highlight[] highlightArr) {
        int i;
        android.graphics.RectF rectF;
        float f;
        float[] fArr;
        boolean z;
        com.github.mikephil.charting.utils.MPPointF mPPointF;
        com.github.mikephil.charting.interfaces.datasets.IPieDataSet dataSetByIndex;
        float f2;
        int i2;
        float[] fArr2;
        float f3;
        int i3;
        float f4;
        float f5;
        com.github.mikephil.charting.highlight.Highlight[] highlightArr2 = highlightArr;
        boolean z2 = this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled();
        if (z2 && this.mChart.isDrawRoundedSlicesEnabled()) {
            return;
        }
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        com.github.mikephil.charting.utils.MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        float holeRadius = z2 ? (this.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        android.graphics.RectF rectF2 = this.mDrawHighlightedRectF;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i4 = 0;
        while (i4 < highlightArr2.length) {
            int x = (int) highlightArr2[i4].getX();
            if (x >= drawAngles.length || (dataSetByIndex = ((com.github.mikephil.charting.data.PieData) this.mChart.getData()).getDataSetByIndex(highlightArr2[i4].getDataSetIndex())) == null || !dataSetByIndex.isHighlightEnabled()) {
                i = i4;
                rectF = rectF2;
                f = holeRadius;
                fArr = drawAngles;
                z = z2;
                mPPointF = centerCircleBox;
            } else {
                int entryCount = dataSetByIndex.getEntryCount();
                int i5 = 0;
                for (int i6 = 0; i6 < entryCount; i6++) {
                    if (java.lang.Math.abs(dataSetByIndex.getEntryForIndex(i6).getY()) > com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                        i5++;
                    }
                }
                if (x == 0) {
                    i2 = 1;
                    f2 = 0.0f;
                } else {
                    f2 = absoluteAngles[x - 1] * phaseX;
                    i2 = 1;
                }
                float sliceSpace = i5 <= i2 ? 0.0f : dataSetByIndex.getSliceSpace();
                float f6 = drawAngles[x];
                float selectionShift = dataSetByIndex.getSelectionShift();
                int i7 = i4;
                float f7 = radius + selectionShift;
                float f8 = holeRadius;
                rectF2.set(this.mChart.getCircleBox());
                float f9 = -selectionShift;
                rectF2.inset(f9, f9);
                boolean z3 = sliceSpace > 0.0f && f6 <= 180.0f;
                this.mRenderPaint.setColor(dataSetByIndex.getColor(x));
                float f10 = i5 == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                float f11 = i5 == 1 ? 0.0f : sliceSpace / (f7 * 0.017453292f);
                float f12 = (((f10 / 2.0f) + f2) * phaseY) + rotationAngle;
                float f13 = (f6 - f10) * phaseY;
                float f14 = f13 < 0.0f ? 0.0f : f13;
                float f15 = (((f11 / 2.0f) + f2) * phaseY) + rotationAngle;
                float f16 = (f6 - f11) * phaseY;
                if (f16 < 0.0f) {
                    f16 = 0.0f;
                }
                this.getOutputFormats.reset();
                if (f14 >= 360.0f && f14 % 360.0f <= com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                    this.getOutputFormats.addCircle(centerCircleBox.x, centerCircleBox.y, f7, android.graphics.Path.Direction.CW);
                    fArr2 = drawAngles;
                    f3 = f2;
                    i3 = i5;
                    z = z2;
                } else {
                    fArr2 = drawAngles;
                    f3 = f2;
                    double d = f15 * 0.017453292f;
                    i3 = i5;
                    z = z2;
                    this.getOutputFormats.moveTo(centerCircleBox.x + (((float) java.lang.Math.cos(d)) * f7), centerCircleBox.y + (((float) java.lang.Math.sin(d)) * f7));
                    this.getOutputFormats.arcTo(rectF2, f15, f16);
                }
                if (z3) {
                    double d2 = f12 * 0.017453292f;
                    i = i7;
                    rectF = rectF2;
                    f = f8;
                    mPPointF = centerCircleBox;
                    fArr = fArr2;
                    f4 = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f6 * phaseY, (((float) java.lang.Math.cos(d2)) * radius) + centerCircleBox.x, centerCircleBox.y + (((float) java.lang.Math.sin(d2)) * radius), f12, f14);
                } else {
                    rectF = rectF2;
                    mPPointF = centerCircleBox;
                    i = i7;
                    f = f8;
                    fArr = fArr2;
                    f4 = 0.0f;
                }
                this.getOutputMinFrameDuration.set(mPPointF.x - f, mPPointF.y - f, mPPointF.x + f, mPPointF.y + f);
                if (z && (f > 0.0f || z3)) {
                    if (z3) {
                        if (f4 < 0.0f) {
                            f4 = -f4;
                        }
                        f5 = java.lang.Math.max(f, f4);
                    } else {
                        f5 = f;
                    }
                    float f17 = (i3 == 1 || f5 == 0.0f) ? 0.0f : sliceSpace / (f5 * 0.017453292f);
                    float f18 = f17 / 2.0f;
                    float f19 = (f6 - f17) * phaseY;
                    if (f19 < 0.0f) {
                        f19 = 0.0f;
                    }
                    float f20 = ((f3 + f18) * phaseY) + rotationAngle + f19;
                    if (f14 >= 360.0f && f14 % 360.0f <= com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                        this.getOutputFormats.addCircle(mPPointF.x, mPPointF.y, f5, android.graphics.Path.Direction.CCW);
                    } else {
                        double d3 = f20 * 0.017453292f;
                        this.getOutputFormats.lineTo(mPPointF.x + (((float) java.lang.Math.cos(d3)) * f5), mPPointF.y + (f5 * ((float) java.lang.Math.sin(d3))));
                        this.getOutputFormats.arcTo(this.getOutputMinFrameDuration, f20, -f19);
                    }
                } else if (f14 % 360.0f > com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                    if (z3) {
                        double d4 = (f12 + (f14 / 2.0f)) * 0.017453292f;
                        this.getOutputFormats.lineTo(mPPointF.x + (((float) java.lang.Math.cos(d4)) * f4), mPPointF.y + (f4 * ((float) java.lang.Math.sin(d4))));
                    } else {
                        this.getOutputFormats.lineTo(mPPointF.x, mPPointF.y);
                    }
                }
                this.getOutputFormats.close();
                this.mBitmapCanvas.drawPath(this.getOutputFormats, this.mRenderPaint);
            }
            i4 = i + 1;
            rectF2 = rectF;
            holeRadius = f;
            centerCircleBox = mPPointF;
            drawAngles = fArr;
            z2 = z;
            highlightArr2 = highlightArr;
        }
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerCircleBox);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawRoundedSlices(android.graphics.Canvas canvas) {
        float f;
        float[] fArr;
        float f2;
        if (this.mChart.isDrawRoundedSlicesEnabled()) {
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet dataSet = ((com.github.mikephil.charting.data.PieData) this.mChart.getData()).getDataSet();
            if (dataSet.isVisible()) {
                float phaseX = this.mAnimator.getPhaseX();
                float phaseY = this.mAnimator.getPhaseY();
                com.github.mikephil.charting.utils.MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
                float radius = this.mChart.getRadius();
                float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
                float[] drawAngles = this.mChart.getDrawAngles();
                float rotationAngle = this.mChart.getRotationAngle();
                int i = 0;
                while (i < dataSet.getEntryCount()) {
                    float f3 = drawAngles[i];
                    if (java.lang.Math.abs(dataSet.getEntryForIndex(i).getY()) > com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                        double d = radius - holeRadius;
                        double d2 = (rotationAngle + f3) * phaseY;
                        f = phaseY;
                        fArr = drawAngles;
                        f2 = rotationAngle;
                        float cos = (float) (centerCircleBox.x + (java.lang.Math.cos(java.lang.Math.toRadians(d2)) * d));
                        float sin = (float) ((d * java.lang.Math.sin(java.lang.Math.toRadians(d2))) + centerCircleBox.y);
                        this.mRenderPaint.setColor(dataSet.getColor(i));
                        this.mBitmapCanvas.drawCircle(cos, sin, holeRadius, this.mRenderPaint);
                    } else {
                        f = phaseY;
                        fArr = drawAngles;
                        f2 = rotationAngle;
                    }
                    rotationAngle = f2 + (f3 * phaseX);
                    i++;
                    phaseY = f;
                    drawAngles = fArr;
                }
                com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerCircleBox);
            }
        }
    }

    public void releaseBitmap() {
        android.graphics.Canvas canvas = this.mBitmapCanvas;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.mBitmapCanvas = null;
        }
        java.lang.ref.WeakReference<android.graphics.Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference != null) {
            android.graphics.Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.mDrawBitmap.clear();
            this.mDrawBitmap = null;
        }
    }
}
