package com.github.mikephil.charting.renderer;

/* loaded from: classes8.dex */
public class LegendRenderer extends com.github.mikephil.charting.renderer.Renderer {
    protected java.util.List<com.github.mikephil.charting.components.LegendEntry> computedEntries;
    private android.graphics.Path getHighResolutionOutputSizeshNQ4ISI;
    protected android.graphics.Paint.FontMetrics legendFontMetrics;
    protected com.github.mikephil.charting.components.Legend mLegend;
    protected android.graphics.Paint mLegendFormPaint;
    protected android.graphics.Paint mLegendLabelPaint;

    public LegendRenderer(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, com.github.mikephil.charting.components.Legend legend) {
        super(viewPortHandler);
        this.computedEntries = new java.util.ArrayList(16);
        this.legendFontMetrics = new android.graphics.Paint.FontMetrics();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Path();
        this.mLegend = legend;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.mLegendLabelPaint = paint;
        paint.setTextSize(com.github.mikephil.charting.utils.Utils.convertDpToPixel(9.0f));
        this.mLegendLabelPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.mLegendFormPaint = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
    }

    public android.graphics.Paint getLabelPaint() {
        return this.mLegendLabelPaint;
    }

    public android.graphics.Paint getFormPaint() {
        return this.mLegendFormPaint;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.github.mikephil.charting.interfaces.datasets.IDataSet] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.github.mikephil.charting.interfaces.datasets.IDataSet] */
    public void computeLegend(com.github.mikephil.charting.data.ChartData<?> chartData) {
        if (!this.mLegend.isLegendCustom()) {
            this.computedEntries.clear();
            for (int i = 0; i < chartData.getDataSetCount(); i++) {
                ?? dataSetByIndex = chartData.getDataSetByIndex(i);
                java.util.List<java.lang.Integer> colors = dataSetByIndex.getColors();
                int entryCount = dataSetByIndex.getEntryCount();
                if (dataSetByIndex instanceof com.github.mikephil.charting.interfaces.datasets.IBarDataSet) {
                    com.github.mikephil.charting.interfaces.datasets.IBarDataSet iBarDataSet = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) dataSetByIndex;
                    if (iBarDataSet.isStacked()) {
                        java.lang.String[] stackLabels = iBarDataSet.getStackLabels();
                        for (int i2 = 0; i2 < colors.size() && i2 < iBarDataSet.getStackSize(); i2++) {
                            this.computedEntries.add(new com.github.mikephil.charting.components.LegendEntry(stackLabels[i2 % stackLabels.length], dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i2).intValue()));
                        }
                        if (iBarDataSet.getLabel() != null) {
                            this.computedEntries.add(new com.github.mikephil.charting.components.LegendEntry(dataSetByIndex.getLabel(), com.github.mikephil.charting.components.Legend.LegendForm.NONE, Float.NaN, Float.NaN, null, com.github.mikephil.charting.utils.ColorTemplate.COLOR_NONE));
                        }
                    }
                }
                if (dataSetByIndex instanceof com.github.mikephil.charting.interfaces.datasets.IPieDataSet) {
                    com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet = (com.github.mikephil.charting.interfaces.datasets.IPieDataSet) dataSetByIndex;
                    for (int i3 = 0; i3 < colors.size() && i3 < entryCount; i3++) {
                        this.computedEntries.add(new com.github.mikephil.charting.components.LegendEntry(iPieDataSet.getEntryForIndex(i3).getLabel(), dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i3).intValue()));
                    }
                    if (iPieDataSet.getLabel() != null) {
                        this.computedEntries.add(new com.github.mikephil.charting.components.LegendEntry(dataSetByIndex.getLabel(), com.github.mikephil.charting.components.Legend.LegendForm.NONE, Float.NaN, Float.NaN, null, com.github.mikephil.charting.utils.ColorTemplate.COLOR_NONE));
                    }
                } else {
                    if (dataSetByIndex instanceof com.github.mikephil.charting.interfaces.datasets.ICandleDataSet) {
                        com.github.mikephil.charting.interfaces.datasets.ICandleDataSet iCandleDataSet = (com.github.mikephil.charting.interfaces.datasets.ICandleDataSet) dataSetByIndex;
                        if (iCandleDataSet.getDecreasingColor() != 1122867) {
                            int decreasingColor = iCandleDataSet.getDecreasingColor();
                            int increasingColor = iCandleDataSet.getIncreasingColor();
                            this.computedEntries.add(new com.github.mikephil.charting.components.LegendEntry(null, dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), decreasingColor));
                            this.computedEntries.add(new com.github.mikephil.charting.components.LegendEntry(dataSetByIndex.getLabel(), dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), increasingColor));
                        }
                    }
                    int i4 = 0;
                    while (i4 < colors.size() && i4 < entryCount) {
                        this.computedEntries.add(new com.github.mikephil.charting.components.LegendEntry((i4 >= colors.size() + (-1) || i4 >= entryCount + (-1)) ? chartData.getDataSetByIndex(i).getLabel() : null, dataSetByIndex.getForm(), dataSetByIndex.getFormSize(), dataSetByIndex.getFormLineWidth(), dataSetByIndex.getFormLineDashEffect(), colors.get(i4).intValue()));
                        i4++;
                    }
                }
            }
            if (this.mLegend.getExtraEntries() != null) {
                java.util.Collections.addAll(this.computedEntries, this.mLegend.getExtraEntries());
            }
            this.mLegend.setEntries(this.computedEntries);
        }
        android.graphics.Typeface typeface = this.mLegend.getTypeface();
        if (typeface != null) {
            this.mLegendLabelPaint.setTypeface(typeface);
        }
        this.mLegendLabelPaint.setTextSize(this.mLegend.getTextSize());
        this.mLegendLabelPaint.setColor(this.mLegend.getTextColor());
        this.mLegend.calculateDimensions(this.mLegendLabelPaint, this.mViewPortHandler);
    }

    public void renderLegend(android.graphics.Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        java.util.List<java.lang.Boolean> list;
        float f7;
        java.util.List<com.github.mikephil.charting.utils.FSize> list2;
        android.graphics.Canvas canvas2;
        int i;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float contentTop;
        float f14;
        float f15;
        com.github.mikephil.charting.components.Legend.LegendDirection legendDirection;
        com.github.mikephil.charting.components.LegendEntry legendEntry;
        float f16;
        float contentBottom;
        float contentRight;
        float contentLeft;
        double d;
        if (this.mLegend.isEnabled()) {
            android.graphics.Typeface typeface = this.mLegend.getTypeface();
            if (typeface != null) {
                this.mLegendLabelPaint.setTypeface(typeface);
            }
            this.mLegendLabelPaint.setTextSize(this.mLegend.getTextSize());
            this.mLegendLabelPaint.setColor(this.mLegend.getTextColor());
            float lineHeight = com.github.mikephil.charting.utils.Utils.getLineHeight(this.mLegendLabelPaint, this.legendFontMetrics);
            float lineSpacing = com.github.mikephil.charting.utils.Utils.getLineSpacing(this.mLegendLabelPaint, this.legendFontMetrics) + com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.mLegend.getYEntrySpace());
            float calcTextHeight = lineHeight - (com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mLegendLabelPaint, "ABC") / 2.0f);
            com.github.mikephil.charting.components.LegendEntry[] entries = this.mLegend.getEntries();
            float convertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.mLegend.getFormToTextSpace());
            float convertDpToPixel2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.mLegend.getXEntrySpace());
            com.github.mikephil.charting.components.Legend.LegendOrientation orientation = this.mLegend.getOrientation();
            com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment horizontalAlignment = this.mLegend.getHorizontalAlignment();
            com.github.mikephil.charting.components.Legend.LegendVerticalAlignment verticalAlignment = this.mLegend.getVerticalAlignment();
            com.github.mikephil.charting.components.Legend.LegendDirection direction = this.mLegend.getDirection();
            float convertDpToPixel3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.mLegend.getFormSize());
            float convertDpToPixel4 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.mLegend.getStackSpace());
            float yOffset = this.mLegend.getYOffset();
            float xOffset = this.mLegend.getXOffset();
            int i2 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.getHighSpeedVideoSizes[horizontalAlignment.ordinal()];
            float f17 = convertDpToPixel4;
            float f18 = convertDpToPixel2;
            if (i2 != 1) {
                if (i2 == 2) {
                    f = lineHeight;
                    f2 = lineSpacing;
                    if (orientation == com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL) {
                        contentRight = this.mViewPortHandler.getChartWidth();
                    } else {
                        contentRight = this.mViewPortHandler.contentRight();
                    }
                    f4 = contentRight - xOffset;
                    if (direction == com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT) {
                        f4 -= this.mLegend.mNeededWidth;
                    }
                } else if (i2 != 3) {
                    f = lineHeight;
                    f2 = lineSpacing;
                    f3 = 0.0f;
                } else {
                    if (orientation == com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL) {
                        contentLeft = this.mViewPortHandler.getChartWidth() / 2.0f;
                    } else {
                        contentLeft = this.mViewPortHandler.contentLeft() + (this.mViewPortHandler.contentWidth() / 2.0f);
                    }
                    f4 = contentLeft + (direction == com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT ? xOffset : -xOffset);
                    if (orientation == com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL) {
                        f2 = lineSpacing;
                        double d2 = f4;
                        if (direction == com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT) {
                            f = lineHeight;
                            d = ((-this.mLegend.mNeededWidth) / 2.0d) + xOffset;
                        } else {
                            f = lineHeight;
                            d = (this.mLegend.mNeededWidth / 2.0d) - xOffset;
                        }
                        f4 = (float) (d2 + d);
                    } else {
                        f = lineHeight;
                        f2 = lineSpacing;
                    }
                }
                f3 = f4;
            } else {
                f = lineHeight;
                f2 = lineSpacing;
                if (orientation != com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL) {
                    xOffset += this.mViewPortHandler.contentLeft();
                }
                if (direction == com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT) {
                    f4 = this.mLegend.mNeededWidth + xOffset;
                    f3 = f4;
                } else {
                    f3 = xOffset;
                }
            }
            int i3 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.getHighSpeedVideoFpsRangesFor[orientation.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.getHighSpeedVideoFpsRanges[verticalAlignment.ordinal()];
                    if (i4 == 1) {
                        contentTop = (horizontalAlignment == com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER ? 0.0f : this.mViewPortHandler.contentTop()) + yOffset;
                    } else if (i4 == 2) {
                        if (horizontalAlignment == com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER) {
                            contentBottom = this.mViewPortHandler.getChartHeight();
                        } else {
                            contentBottom = this.mViewPortHandler.contentBottom();
                        }
                        contentTop = contentBottom - (this.mLegend.mNeededHeight + yOffset);
                    } else {
                        contentTop = i4 != 3 ? 0.0f : ((this.mViewPortHandler.getChartHeight() / 2.0f) - (this.mLegend.mNeededHeight / 2.0f)) + this.mLegend.getYOffset();
                    }
                    float f19 = contentTop;
                    float f20 = 0.0f;
                    boolean z = false;
                    int i5 = 0;
                    while (i5 < entries.length) {
                        com.github.mikephil.charting.components.LegendEntry legendEntry2 = entries[i5];
                        boolean z2 = legendEntry2.form != com.github.mikephil.charting.components.Legend.LegendForm.NONE;
                        float convertDpToPixel5 = java.lang.Float.isNaN(legendEntry2.formSize) ? convertDpToPixel3 : com.github.mikephil.charting.utils.Utils.convertDpToPixel(legendEntry2.formSize);
                        if (z2) {
                            f16 = direction == com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT ? f3 + f20 : f3 - (convertDpToPixel5 - f20);
                            f15 = f17;
                            f14 = calcTextHeight;
                            legendDirection = direction;
                            drawForm(canvas, f16, f19 + calcTextHeight, legendEntry2, this.mLegend);
                            if (legendDirection == com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT) {
                                f16 += convertDpToPixel5;
                            }
                            legendEntry = legendEntry2;
                        } else {
                            f14 = calcTextHeight;
                            f15 = f17;
                            legendDirection = direction;
                            legendEntry = legendEntry2;
                            f16 = f3;
                        }
                        if (legendEntry.label != null) {
                            if (z2 && !z) {
                                f16 += legendDirection == com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT ? convertDpToPixel : -convertDpToPixel;
                            } else if (z) {
                                f16 = f3;
                            }
                            if (legendDirection == com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT) {
                                f16 -= com.github.mikephil.charting.utils.Utils.calcTextWidth(this.mLegendLabelPaint, legendEntry.label);
                            }
                            float f21 = f16;
                            if (!z) {
                                drawLabel(canvas, f21, f19 + f, legendEntry.label);
                            } else {
                                f19 += f + f2;
                                drawLabel(canvas, f21, f19 + f, legendEntry.label);
                            }
                            f19 += f + f2;
                            f20 = 0.0f;
                        } else {
                            f20 += convertDpToPixel5 + f15;
                            z = true;
                        }
                        i5++;
                        f17 = f15;
                        direction = legendDirection;
                        calcTextHeight = f14;
                    }
                    return;
                }
                return;
            }
            float f22 = f17;
            java.util.List<com.github.mikephil.charting.utils.FSize> calculatedLineSizes = this.mLegend.getCalculatedLineSizes();
            java.util.List<com.github.mikephil.charting.utils.FSize> calculatedLabelSizes = this.mLegend.getCalculatedLabelSizes();
            java.util.List<java.lang.Boolean> calculatedLabelBreakPoints = this.mLegend.getCalculatedLabelBreakPoints();
            int i6 = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.getHighSpeedVideoFpsRanges[verticalAlignment.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    yOffset = (this.mViewPortHandler.getChartHeight() - yOffset) - this.mLegend.mNeededHeight;
                } else {
                    yOffset = i6 != 3 ? 0.0f : yOffset + ((this.mViewPortHandler.getChartHeight() - this.mLegend.mNeededHeight) / 2.0f);
                }
            }
            int length = entries.length;
            float f23 = f3;
            int i7 = 0;
            int i8 = 0;
            while (i7 < length) {
                float f24 = f22;
                com.github.mikephil.charting.components.LegendEntry legendEntry3 = entries[i7];
                int i9 = length;
                boolean z3 = legendEntry3.form != com.github.mikephil.charting.components.Legend.LegendForm.NONE;
                float convertDpToPixel6 = java.lang.Float.isNaN(legendEntry3.formSize) ? convertDpToPixel3 : com.github.mikephil.charting.utils.Utils.convertDpToPixel(legendEntry3.formSize);
                if (i7 >= calculatedLabelBreakPoints.size() || !calculatedLabelBreakPoints.get(i7).booleanValue()) {
                    f5 = f23;
                    f6 = yOffset;
                } else {
                    f6 = yOffset + f + f2;
                    f5 = f3;
                }
                if (f5 == f3 && horizontalAlignment == com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER && i8 < calculatedLineSizes.size()) {
                    if (direction == com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT) {
                        f13 = calculatedLineSizes.get(i8).width;
                    } else {
                        f13 = -calculatedLineSizes.get(i8).width;
                    }
                    f5 += f13 / 2.0f;
                    i8++;
                }
                int i10 = i8;
                boolean z4 = legendEntry3.label == null;
                if (z3) {
                    if (direction == com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT) {
                        f5 -= convertDpToPixel6;
                    }
                    float f25 = f5;
                    f7 = f3;
                    i = i7;
                    list = calculatedLabelBreakPoints;
                    list2 = calculatedLineSizes;
                    canvas2 = canvas;
                    drawForm(canvas, f25, f6 + calcTextHeight, legendEntry3, this.mLegend);
                    f5 = direction == com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT ? f25 + convertDpToPixel6 : f25;
                } else {
                    list = calculatedLabelBreakPoints;
                    f7 = f3;
                    list2 = calculatedLineSizes;
                    canvas2 = canvas;
                    i = i7;
                }
                if (!z4) {
                    if (z3) {
                        f5 += direction == com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT ? -convertDpToPixel : convertDpToPixel;
                    }
                    if (direction == com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT) {
                        f5 -= calculatedLabelSizes.get(i).width;
                    }
                    drawLabel(canvas2, f5, f6 + f, legendEntry3.label);
                    if (direction == com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT) {
                        f5 += calculatedLabelSizes.get(i).width;
                    }
                    if (direction == com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT) {
                        f8 = f18;
                        f12 = -f8;
                    } else {
                        f8 = f18;
                        f12 = f8;
                    }
                    f11 = f5 + f12;
                    f9 = f24;
                } else {
                    f8 = f18;
                    if (direction == com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT) {
                        f9 = f24;
                        f10 = -f9;
                    } else {
                        f9 = f24;
                        f10 = f9;
                    }
                    f11 = f5 + f10;
                }
                f18 = f8;
                f22 = f9;
                i7 = i + 1;
                yOffset = f6;
                i8 = i10;
                f3 = f7;
                calculatedLabelBreakPoints = list;
                calculatedLineSizes = list2;
                f23 = f11;
                length = i9;
            }
        }
    }

    protected void drawForm(android.graphics.Canvas canvas, float f, float f2, com.github.mikephil.charting.components.LegendEntry legendEntry, com.github.mikephil.charting.components.Legend legend) {
        if (legendEntry.formColor == 1122868 || legendEntry.formColor == 1122867 || legendEntry.formColor == 0) {
            return;
        }
        int save = canvas.save();
        com.github.mikephil.charting.components.Legend.LegendForm legendForm = legendEntry.form;
        if (legendForm == com.github.mikephil.charting.components.Legend.LegendForm.DEFAULT) {
            legendForm = legend.getForm();
        }
        this.mLegendFormPaint.setColor(legendEntry.formColor);
        float convertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(java.lang.Float.isNaN(legendEntry.formSize) ? legend.getFormSize() : legendEntry.formSize);
        float f3 = convertDpToPixel / 2.0f;
        int i = com.github.mikephil.charting.renderer.LegendRenderer.AnonymousClass1.Camera2StreamConfigurationMap[legendForm.ordinal()];
        if (i == 3 || i == 4) {
            this.mLegendFormPaint.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawCircle(f + f3, f2, f3, this.mLegendFormPaint);
        } else if (i == 5) {
            this.mLegendFormPaint.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawRect(f, f2 - f3, f + convertDpToPixel, f2 + f3, this.mLegendFormPaint);
        } else if (i == 6) {
            float convertDpToPixel2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(java.lang.Float.isNaN(legendEntry.formLineWidth) ? legend.getFormLineWidth() : legendEntry.formLineWidth);
            android.graphics.DashPathEffect formLineDashEffect = legendEntry.formLineDashEffect == null ? legend.getFormLineDashEffect() : legendEntry.formLineDashEffect;
            this.mLegendFormPaint.setStyle(android.graphics.Paint.Style.STROKE);
            this.mLegendFormPaint.setStrokeWidth(convertDpToPixel2);
            this.mLegendFormPaint.setPathEffect(formLineDashEffect);
            this.getHighResolutionOutputSizeshNQ4ISI.reset();
            this.getHighResolutionOutputSizeshNQ4ISI.moveTo(f, f2);
            this.getHighResolutionOutputSizeshNQ4ISI.lineTo(f + convertDpToPixel, f2);
            canvas.drawPath(this.getHighResolutionOutputSizeshNQ4ISI, this.mLegendFormPaint);
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: com.github.mikephil.charting.renderer.LegendRenderer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.github.mikephil.charting.components.Legend.LegendForm.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.github.mikephil.charting.components.Legend.LegendForm.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.github.mikephil.charting.components.Legend.LegendForm.EMPTY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[com.github.mikephil.charting.components.Legend.LegendForm.DEFAULT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[com.github.mikephil.charting.components.Legend.LegendForm.CIRCLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[com.github.mikephil.charting.components.Legend.LegendForm.SQUARE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[com.github.mikephil.charting.components.Legend.LegendForm.LINE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[com.github.mikephil.charting.components.Legend.LegendOrientation.values().length];
            getHighSpeedVideoFpsRangesFor = iArr2;
            try {
                iArr2[com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.values().length];
            getHighSpeedVideoFpsRanges = iArr3;
            try {
                iArr3[com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.values().length];
            getHighSpeedVideoSizes = iArr4;
            try {
                iArr4[com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighSpeedVideoSizes[com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighSpeedVideoSizes[com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
        }
    }

    protected void drawLabel(android.graphics.Canvas canvas, float f, float f2, java.lang.String str) {
        canvas.drawText(str, f, f2, this.mLegendLabelPaint);
    }
}
