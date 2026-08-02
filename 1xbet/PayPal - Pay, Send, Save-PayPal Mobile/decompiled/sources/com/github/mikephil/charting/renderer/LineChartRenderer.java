package com.github.mikephil.charting.renderer;

/* loaded from: classes8.dex */
public class LineChartRenderer extends com.github.mikephil.charting.renderer.LineRadarRenderer {
    private float[] Camera2StreamConfigurationMap;
    protected android.graphics.Path cubicFillPath;
    protected android.graphics.Path cubicPath;
    private java.util.HashMap<com.github.mikephil.charting.interfaces.datasets.IDataSet, com.github.mikephil.charting.renderer.LineChartRenderer.DataSetImageCache> getHighResolutionOutputSizeshNQ4ISI;
    private float[] getHighSpeedVideoSizes;
    protected android.graphics.Canvas mBitmapCanvas;
    protected android.graphics.Bitmap.Config mBitmapConfig;
    protected com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider mChart;
    protected android.graphics.Paint mCirclePaintInner;
    protected java.lang.ref.WeakReference<android.graphics.Bitmap> mDrawBitmap;
    protected android.graphics.Path mGenerateFilledPathBuffer;

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }

    public LineChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider lineDataProvider, com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mBitmapConfig = android.graphics.Bitmap.Config.ARGB_8888;
        this.cubicPath = new android.graphics.Path();
        this.cubicFillPath = new android.graphics.Path();
        this.Camera2StreamConfigurationMap = new float[4];
        this.mGenerateFilledPathBuffer = new android.graphics.Path();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap<>();
        this.getHighSpeedVideoSizes = new float[2];
        this.mChart = lineDataProvider;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.mCirclePaintInner = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.mCirclePaintInner.setColor(-1);
    }

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
            bitmap = android.graphics.Bitmap.createBitmap(chartWidth, chartHeight, this.mBitmapConfig);
            this.mDrawBitmap = new java.lang.ref.WeakReference<>(bitmap);
            this.mBitmapCanvas = new android.graphics.Canvas(bitmap);
        }
        bitmap.eraseColor(0);
        for (T t : this.mChart.getLineData().getDataSets()) {
            if (t.isVisible()) {
                drawDataSet(canvas, t);
            }
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.mRenderPaint);
    }

    protected void drawDataSet(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet) {
        if (iLineDataSet.getEntryCount() <= 0) {
            return;
        }
        this.mRenderPaint.setStrokeWidth(iLineDataSet.getLineWidth());
        this.mRenderPaint.setPathEffect(iLineDataSet.getDashPathEffect());
        int i = com.github.mikephil.charting.renderer.LineChartRenderer.AnonymousClass1.Camera2StreamConfigurationMap[iLineDataSet.getMode().ordinal()];
        if (i == 3) {
            drawCubicBezier(iLineDataSet);
        } else if (i != 4) {
            drawLinear(canvas, iLineDataSet);
        } else {
            drawHorizontalBezier(iLineDataSet);
        }
        this.mRenderPaint.setPathEffect(null);
    }

    /* renamed from: com.github.mikephil.charting.renderer.LineChartRenderer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[com.github.mikephil.charting.data.LineDataSet.Mode.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.github.mikephil.charting.data.LineDataSet.Mode.LINEAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.github.mikephil.charting.data.LineDataSet.Mode.STEPPED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[com.github.mikephil.charting.data.LineDataSet.Mode.CUBIC_BEZIER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[com.github.mikephil.charting.data.LineDataSet.Mode.HORIZONTAL_BEZIER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    protected void drawHorizontalBezier(com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet) {
        float phaseY = this.mAnimator.getPhaseY();
        com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        this.mXBounds.set(this.mChart, iLineDataSet);
        this.cubicPath.reset();
        if (this.mXBounds.range > 0) {
            ?? entryForIndex = iLineDataSet.getEntryForIndex(this.mXBounds.min);
            this.cubicPath.moveTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
            int i = this.mXBounds.min + 1;
            com.github.mikephil.charting.data.Entry entry = entryForIndex;
            while (i <= this.mXBounds.range + this.mXBounds.min) {
                ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i);
                float x = entry.getX() + ((entryForIndex2.getX() - entry.getX()) / 2.0f);
                android.graphics.Path path = this.cubicPath;
                float y = entry.getY();
                path.cubicTo(x, y * phaseY, x, entryForIndex2.getY() * phaseY, entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                i++;
                entry = entryForIndex2;
            }
        }
        if (iLineDataSet.isDrawFilledEnabled()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, iLineDataSet, this.cubicFillPath, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(iLineDataSet.getColor());
        this.mRenderPaint.setStyle(android.graphics.Paint.Style.STROKE);
        transformer.pathValueToPixel(this.cubicPath);
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.github.mikephil.charting.data.Entry] */
    protected void drawCubicBezier(com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet) {
        float phaseY = this.mAnimator.getPhaseY();
        com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        this.mXBounds.set(this.mChart, iLineDataSet);
        float cubicIntensity = iLineDataSet.getCubicIntensity();
        this.cubicPath.reset();
        if (this.mXBounds.range > 0) {
            int i = this.mXBounds.min;
            int i2 = this.mXBounds.min;
            int i3 = this.mXBounds.range;
            ?? entryForIndex = iLineDataSet.getEntryForIndex(java.lang.Math.max(i - 1, 0));
            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(java.lang.Math.max(i, 0));
            if (entryForIndex2 != 0) {
                this.cubicPath.moveTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                int i4 = -1;
                int i5 = this.mXBounds.min + 1;
                com.github.mikephil.charting.data.Entry entry = entryForIndex;
                com.github.mikephil.charting.data.Entry entry2 = entryForIndex2;
                com.github.mikephil.charting.data.Entry entry3 = entryForIndex2;
                while (true) {
                    com.github.mikephil.charting.data.Entry entry4 = entry3;
                    if (i5 > this.mXBounds.range + this.mXBounds.min) {
                        break;
                    }
                    if (i4 != i5) {
                        entry4 = iLineDataSet.getEntryForIndex(i5);
                    }
                    int i6 = i5 + 1;
                    if (i6 < iLineDataSet.getEntryCount()) {
                        i5 = i6;
                    }
                    ?? entryForIndex3 = iLineDataSet.getEntryForIndex(i5);
                    float x = entry4.getX();
                    float x2 = entry.getX();
                    float y = entry4.getY();
                    float y2 = entry.getY();
                    float x3 = entryForIndex3.getX();
                    float x4 = entry2.getX();
                    float y3 = entryForIndex3.getY();
                    float y4 = entry2.getY();
                    int i7 = i5;
                    this.cubicPath.cubicTo(entry2.getX() + ((x - x2) * cubicIntensity), (entry2.getY() + ((y - y2) * cubicIntensity)) * phaseY, entry4.getX() - ((x3 - x4) * cubicIntensity), (entry4.getY() - ((y3 - y4) * cubicIntensity)) * phaseY, entry4.getX(), entry4.getY() * phaseY);
                    entry = entry2;
                    i5 = i6;
                    i4 = i7;
                    entry2 = entry4;
                    entry3 = entryForIndex3;
                }
            } else {
                return;
            }
        }
        if (iLineDataSet.isDrawFilledEnabled()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, iLineDataSet, this.cubicFillPath, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(iLineDataSet.getColor());
        this.mRenderPaint.setStyle(android.graphics.Paint.Style.STROKE);
        transformer.pathValueToPixel(this.cubicPath);
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.github.mikephil.charting.data.Entry] */
    protected void drawCubicFill(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet, android.graphics.Path path, com.github.mikephil.charting.utils.Transformer transformer, com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.mChart);
        path.lineTo(iLineDataSet.getEntryForIndex(xBounds.min + xBounds.range).getX(), fillLinePosition);
        path.lineTo(iLineDataSet.getEntryForIndex(xBounds.min).getX(), fillLinePosition);
        path.close();
        transformer.pathValueToPixel(path);
        android.graphics.drawable.Drawable fillDrawable = iLineDataSet.getFillDrawable();
        if (fillDrawable != null) {
            drawFilledPath(canvas, path, fillDrawable);
        } else {
            drawFilledPath(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
        }
    }

    /* JADX WARN: Type inference failed for: r12v12, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v23, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    protected void drawLinear(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet) {
        int entryCount = iLineDataSet.getEntryCount();
        boolean z = iLineDataSet.getMode() == com.github.mikephil.charting.data.LineDataSet.Mode.STEPPED;
        int i = z ? 4 : 2;
        com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        this.mRenderPaint.setStyle(android.graphics.Paint.Style.STROKE);
        android.graphics.Canvas canvas2 = iLineDataSet.isDashedLineEnabled() ? this.mBitmapCanvas : canvas;
        this.mXBounds.set(this.mChart, iLineDataSet);
        if (iLineDataSet.isDrawFilledEnabled() && entryCount > 0) {
            drawLinearFill(canvas, iLineDataSet, transformer, this.mXBounds);
        }
        if (iLineDataSet.getColors().size() > 1) {
            int i2 = i * 2;
            if (this.Camera2StreamConfigurationMap.length <= i2) {
                this.Camera2StreamConfigurationMap = new float[i * 4];
            }
            for (int i3 = this.mXBounds.min; i3 <= this.mXBounds.range + this.mXBounds.min; i3++) {
                ?? entryForIndex = iLineDataSet.getEntryForIndex(i3);
                if (entryForIndex != 0) {
                    this.Camera2StreamConfigurationMap[0] = entryForIndex.getX();
                    this.Camera2StreamConfigurationMap[1] = entryForIndex.getY() * phaseY;
                    if (i3 < this.mXBounds.max) {
                        ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i3 + 1);
                        if (entryForIndex2 == 0) {
                            break;
                        }
                        if (z) {
                            this.Camera2StreamConfigurationMap[2] = entryForIndex2.getX();
                            float[] fArr = this.Camera2StreamConfigurationMap;
                            float f = fArr[1];
                            fArr[3] = f;
                            fArr[4] = fArr[2];
                            fArr[5] = f;
                            fArr[6] = entryForIndex2.getX();
                            this.Camera2StreamConfigurationMap[7] = entryForIndex2.getY() * phaseY;
                        } else {
                            this.Camera2StreamConfigurationMap[2] = entryForIndex2.getX();
                            this.Camera2StreamConfigurationMap[3] = entryForIndex2.getY() * phaseY;
                        }
                    } else {
                        float[] fArr2 = this.Camera2StreamConfigurationMap;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[1];
                    }
                    transformer.pointValuesToPixel(this.Camera2StreamConfigurationMap);
                    if (!this.mViewPortHandler.isInBoundsRight(this.Camera2StreamConfigurationMap[0])) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(this.Camera2StreamConfigurationMap[2]) && (this.mViewPortHandler.isInBoundsTop(this.Camera2StreamConfigurationMap[1]) || this.mViewPortHandler.isInBoundsBottom(this.Camera2StreamConfigurationMap[3]))) {
                        this.mRenderPaint.setColor(iLineDataSet.getColor(i3));
                        canvas2.drawLines(this.Camera2StreamConfigurationMap, 0, i2, this.mRenderPaint);
                    }
                }
            }
        } else {
            int i4 = entryCount * i;
            if (this.Camera2StreamConfigurationMap.length < java.lang.Math.max(i4, i) * 2) {
                this.Camera2StreamConfigurationMap = new float[java.lang.Math.max(i4, i) * 4];
            }
            if (iLineDataSet.getEntryForIndex(this.mXBounds.min) != 0) {
                int i5 = this.mXBounds.min;
                int i6 = 0;
                while (i5 <= this.mXBounds.range + this.mXBounds.min) {
                    ?? entryForIndex3 = iLineDataSet.getEntryForIndex(i5 == 0 ? 0 : i5 - 1);
                    ?? entryForIndex4 = iLineDataSet.getEntryForIndex(i5);
                    if (entryForIndex3 != 0 && entryForIndex4 != 0) {
                        this.Camera2StreamConfigurationMap[i6] = entryForIndex3.getX();
                        int i7 = i6 + 2;
                        this.Camera2StreamConfigurationMap[i6 + 1] = entryForIndex3.getY() * phaseY;
                        if (z) {
                            this.Camera2StreamConfigurationMap[i7] = entryForIndex4.getX();
                            this.Camera2StreamConfigurationMap[i6 + 3] = entryForIndex3.getY() * phaseY;
                            this.Camera2StreamConfigurationMap[i6 + 4] = entryForIndex4.getX();
                            i7 = i6 + 6;
                            this.Camera2StreamConfigurationMap[i6 + 5] = entryForIndex3.getY() * phaseY;
                        }
                        this.Camera2StreamConfigurationMap[i7] = entryForIndex4.getX();
                        this.Camera2StreamConfigurationMap[i7 + 1] = entryForIndex4.getY() * phaseY;
                        i6 = i7 + 2;
                    }
                    i5++;
                }
                if (i6 > 0) {
                    transformer.pointValuesToPixel(this.Camera2StreamConfigurationMap);
                    int max = java.lang.Math.max((this.mXBounds.range + 1) * i, i);
                    this.mRenderPaint.setColor(iLineDataSet.getColor());
                    canvas2.drawLines(this.Camera2StreamConfigurationMap, 0, max * 2, this.mRenderPaint);
                }
            }
        }
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r15v4, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    protected void drawLinearFill(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet, com.github.mikephil.charting.utils.Transformer transformer, com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        int i;
        int i2;
        android.graphics.Path path = this.mGenerateFilledPathBuffer;
        int i3 = xBounds.min;
        int i4 = xBounds.range + xBounds.min;
        int i5 = 0;
        do {
            i = (i5 * 128) + i3;
            i2 = i + 128;
            if (i2 > i4) {
                i2 = i4;
            }
            if (i <= i2) {
                float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.mChart);
                float phaseY = this.mAnimator.getPhaseY();
                boolean z = iLineDataSet.getMode() == com.github.mikephil.charting.data.LineDataSet.Mode.STEPPED;
                path.reset();
                ?? entryForIndex = iLineDataSet.getEntryForIndex(i);
                path.moveTo(entryForIndex.getX(), fillLinePosition);
                path.lineTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
                int i6 = i + 1;
                com.github.mikephil.charting.data.Entry entry = null;
                com.github.mikephil.charting.data.BaseEntry baseEntry = entryForIndex;
                while (i6 <= i2) {
                    ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i6);
                    if (z) {
                        path.lineTo(entryForIndex2.getX(), baseEntry.getY() * phaseY);
                    }
                    path.lineTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                    i6++;
                    baseEntry = entryForIndex2;
                    entry = entryForIndex2;
                }
                if (entry != null) {
                    path.lineTo(entry.getX(), fillLinePosition);
                }
                path.close();
                transformer.pathValueToPixel(path);
                android.graphics.drawable.Drawable fillDrawable = iLineDataSet.getFillDrawable();
                if (fillDrawable != null) {
                    drawFilledPath(canvas, path, fillDrawable);
                } else {
                    drawFilledPath(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
                }
            }
            i5++;
        } while (i <= i2);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas canvas) {
        int i;
        com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet;
        com.github.mikephil.charting.data.Entry entry;
        if (isDrawingValuesAllowed(this.mChart)) {
            java.util.List<T> dataSets = this.mChart.getLineData().getDataSets();
            for (int i2 = 0; i2 < dataSets.size(); i2++) {
                com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet2 = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) dataSets.get(i2);
                if (shouldDrawValues(iLineDataSet2) && iLineDataSet2.getEntryCount() > 0) {
                    applyValueTextStyle(iLineDataSet2);
                    com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iLineDataSet2.getAxisDependency());
                    int circleRadius = (int) (iLineDataSet2.getCircleRadius() * 1.75f);
                    if (!iLineDataSet2.isDrawCirclesEnabled()) {
                        circleRadius /= 2;
                    }
                    int i3 = circleRadius;
                    this.mXBounds.set(this.mChart, iLineDataSet2);
                    float[] generateTransformedValuesLine = transformer.generateTransformedValuesLine(iLineDataSet2, this.mAnimator.getPhaseX(), this.mAnimator.getPhaseY(), this.mXBounds.min, this.mXBounds.max);
                    com.github.mikephil.charting.formatter.ValueFormatter valueFormatter = iLineDataSet2.getValueFormatter();
                    com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance(iLineDataSet2.getIconsOffset());
                    mPPointF.x = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF.x);
                    mPPointF.y = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF.y);
                    int i4 = 0;
                    while (i4 < generateTransformedValuesLine.length) {
                        float f = generateTransformedValuesLine[i4];
                        float f2 = generateTransformedValuesLine[i4 + 1];
                        if (!this.mViewPortHandler.isInBoundsRight(f)) {
                            break;
                        }
                        if (this.mViewPortHandler.isInBoundsLeft(f) && this.mViewPortHandler.isInBoundsY(f2)) {
                            int i5 = i4 / 2;
                            com.github.mikephil.charting.data.Entry entryForIndex = iLineDataSet2.getEntryForIndex(this.mXBounds.min + i5);
                            if (iLineDataSet2.isDrawValuesEnabled()) {
                                entry = entryForIndex;
                                i = i3;
                                iLineDataSet = iLineDataSet2;
                                drawValue(canvas, valueFormatter.getPointLabel(entryForIndex), f, f2 - i3, iLineDataSet2.getValueTextColor(i5));
                            } else {
                                entry = entryForIndex;
                                i = i3;
                                iLineDataSet = iLineDataSet2;
                            }
                            if (entry.getIcon() != null && iLineDataSet.isDrawIconsEnabled()) {
                                android.graphics.drawable.Drawable icon = entry.getIcon();
                                com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon, (int) (f + mPPointF.x), (int) (f2 + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            }
                        } else {
                            i = i3;
                            iLineDataSet = iLineDataSet2;
                        }
                        i4 += 2;
                        iLineDataSet2 = iLineDataSet;
                        i3 = i;
                    }
                    com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValue(android.graphics.Canvas canvas, java.lang.String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas canvas) {
        drawCircles(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void drawCircles(android.graphics.Canvas canvas) {
        com.github.mikephil.charting.renderer.LineChartRenderer.DataSetImageCache dataSetImageCache;
        int i;
        int i2;
        int i3;
        ?? entryForIndex;
        this.mRenderPaint.setStyle(android.graphics.Paint.Style.FILL);
        float phaseY = this.mAnimator.getPhaseY();
        float[] fArr = this.getHighSpeedVideoSizes;
        byte b = 0;
        float f = 0.0f;
        fArr[0] = 0.0f;
        char c = 1;
        fArr[1] = 0.0f;
        java.util.List<T> dataSets = this.mChart.getLineData().getDataSets();
        int i4 = 0;
        while (i4 < dataSets.size()) {
            com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) dataSets.get(i4);
            if (iLineDataSet.isVisible() && iLineDataSet.isDrawCirclesEnabled() && iLineDataSet.getEntryCount() != 0) {
                this.mCirclePaintInner.setColor(iLineDataSet.getCircleHoleColor());
                com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
                this.mXBounds.set(this.mChart, iLineDataSet);
                float circleRadius = iLineDataSet.getCircleRadius();
                float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
                boolean z = (!iLineDataSet.isDrawCircleHoleEnabled() || circleHoleRadius >= circleRadius || circleHoleRadius <= f) ? b : c;
                boolean z2 = (z == 0 || iLineDataSet.getCircleHoleColor() != 1122867) ? b : c;
                if (this.getHighResolutionOutputSizeshNQ4ISI.containsKey(iLineDataSet)) {
                    dataSetImageCache = this.getHighResolutionOutputSizeshNQ4ISI.get(iLineDataSet);
                } else {
                    com.github.mikephil.charting.renderer.LineChartRenderer.DataSetImageCache dataSetImageCache2 = new com.github.mikephil.charting.renderer.LineChartRenderer.DataSetImageCache(this, b);
                    this.getHighResolutionOutputSizeshNQ4ISI.put(iLineDataSet, dataSetImageCache2);
                    dataSetImageCache = dataSetImageCache2;
                }
                int circleColorCount = iLineDataSet.getCircleColorCount();
                android.graphics.Bitmap[] bitmapArr = dataSetImageCache.Camera2StreamConfigurationMap;
                if (bitmapArr == null) {
                    dataSetImageCache.Camera2StreamConfigurationMap = new android.graphics.Bitmap[circleColorCount];
                } else {
                    if (bitmapArr.length != circleColorCount) {
                        dataSetImageCache.Camera2StreamConfigurationMap = new android.graphics.Bitmap[circleColorCount];
                    }
                    i = this.mXBounds.range;
                    i2 = this.mXBounds.min;
                    i3 = this.mXBounds.min;
                    while (i3 <= i + i2 && (entryForIndex = iLineDataSet.getEntryForIndex(i3)) != 0) {
                        this.getHighSpeedVideoSizes[b] = entryForIndex.getX();
                        this.getHighSpeedVideoSizes[c] = entryForIndex.getY() * phaseY;
                        transformer.pointValuesToPixel(this.getHighSpeedVideoSizes);
                        if (!this.mViewPortHandler.isInBoundsRight(this.getHighSpeedVideoSizes[b])) {
                            if (this.mViewPortHandler.isInBoundsLeft(this.getHighSpeedVideoSizes[b]) && this.mViewPortHandler.isInBoundsY(this.getHighSpeedVideoSizes[c])) {
                                android.graphics.Bitmap[] bitmapArr2 = dataSetImageCache.Camera2StreamConfigurationMap;
                                android.graphics.Bitmap bitmap = bitmapArr2[i3 % bitmapArr2.length];
                                if (bitmap != null) {
                                    float[] fArr2 = this.getHighSpeedVideoSizes;
                                    canvas.drawBitmap(bitmap, fArr2[b] - circleRadius, fArr2[c] - circleRadius, (android.graphics.Paint) null);
                                    i3++;
                                    b = 0;
                                    c = 1;
                                }
                            }
                            i3++;
                            b = 0;
                            c = 1;
                        }
                    }
                }
                dataSetImageCache.Camera2StreamConfigurationMap(iLineDataSet, z, z2);
                i = this.mXBounds.range;
                i2 = this.mXBounds.min;
                i3 = this.mXBounds.min;
                while (i3 <= i + i2) {
                    this.getHighSpeedVideoSizes[b] = entryForIndex.getX();
                    this.getHighSpeedVideoSizes[c] = entryForIndex.getY() * phaseY;
                    transformer.pointValuesToPixel(this.getHighSpeedVideoSizes);
                    if (!this.mViewPortHandler.isInBoundsRight(this.getHighSpeedVideoSizes[b])) {
                        break;
                    }
                }
            }
            i4++;
            b = 0;
            f = 0.0f;
            c = 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas canvas, com.github.mikephil.charting.highlight.Highlight[] highlightArr) {
        com.github.mikephil.charting.data.LineData lineData = this.mChart.getLineData();
        for (com.github.mikephil.charting.highlight.Highlight highlight : highlightArr) {
            com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) lineData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iLineDataSet != null && iLineDataSet.isHighlightEnabled()) {
                ?? entryForXValue = iLineDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(entryForXValue, iLineDataSet)) {
                    com.github.mikephil.charting.utils.MPPointD pixelForValues = this.mChart.getTransformer(iLineDataSet.getAxisDependency()).getPixelForValues(entryForXValue.getX(), entryForXValue.getY() * this.mAnimator.getPhaseY());
                    highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                    drawHighlightLines(canvas, (float) pixelForValues.x, (float) pixelForValues.y, iLineDataSet);
                }
            }
        }
    }

    public void setBitmapConfig(android.graphics.Bitmap.Config config) {
        this.mBitmapConfig = config;
        releaseBitmap();
    }

    public android.graphics.Bitmap.Config getBitmapConfig() {
        return this.mBitmapConfig;
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

    class DataSetImageCache {
        android.graphics.Bitmap[] Camera2StreamConfigurationMap;
        private android.graphics.Path getHighSpeedVideoFpsRanges;

        private DataSetImageCache() {
            this.getHighSpeedVideoFpsRanges = new android.graphics.Path();
        }

        /* synthetic */ DataSetImageCache(com.github.mikephil.charting.renderer.LineChartRenderer lineChartRenderer, byte b) {
            this();
        }

        protected final void Camera2StreamConfigurationMap(com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet, boolean z, boolean z2) {
            int circleColorCount = iLineDataSet.getCircleColorCount();
            float circleRadius = iLineDataSet.getCircleRadius();
            float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
            for (int i = 0; i < circleColorCount; i++) {
                int i2 = (int) (circleRadius * 2.1d);
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i2, i2, android.graphics.Bitmap.Config.ARGB_4444);
                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                this.Camera2StreamConfigurationMap[i] = createBitmap;
                com.github.mikephil.charting.renderer.LineChartRenderer.this.mRenderPaint.setColor(iLineDataSet.getCircleColor(i));
                if (z2) {
                    this.getHighSpeedVideoFpsRanges.reset();
                    this.getHighSpeedVideoFpsRanges.addCircle(circleRadius, circleRadius, circleRadius, android.graphics.Path.Direction.CW);
                    this.getHighSpeedVideoFpsRanges.addCircle(circleRadius, circleRadius, circleHoleRadius, android.graphics.Path.Direction.CCW);
                    canvas.drawPath(this.getHighSpeedVideoFpsRanges, com.github.mikephil.charting.renderer.LineChartRenderer.this.mRenderPaint);
                } else {
                    canvas.drawCircle(circleRadius, circleRadius, circleRadius, com.github.mikephil.charting.renderer.LineChartRenderer.this.mRenderPaint);
                    if (z) {
                        canvas.drawCircle(circleRadius, circleRadius, circleHoleRadius, com.github.mikephil.charting.renderer.LineChartRenderer.this.mCirclePaintInner);
                    }
                }
            }
        }
    }
}
