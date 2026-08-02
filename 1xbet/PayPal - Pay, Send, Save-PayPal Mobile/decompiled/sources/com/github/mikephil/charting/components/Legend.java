package com.github.mikephil.charting.components;

/* loaded from: classes8.dex */
public class Legend extends com.github.mikephil.charting.components.ComponentBase {
    private java.util.List<com.github.mikephil.charting.utils.FSize> Camera2StreamConfigurationMap;
    private float accessartificialFrame;
    private java.util.List<com.github.mikephil.charting.utils.FSize> getHighResolutionOutputSizeshNQ4ISI;
    private java.util.List<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private com.github.mikephil.charting.components.Legend.LegendDirection getHighSpeedVideoSizes;
    private android.graphics.DashPathEffect getHighSpeedVideoSizesFor;
    private float getInputFormats;
    private float getInputSizeshNQ4ISI;
    private com.github.mikephil.charting.components.LegendEntry[] getOutputFormats;
    private com.github.mikephil.charting.components.LegendEntry[] getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private com.github.mikephil.charting.components.Legend.LegendOrientation getOutputSizes;
    private com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment getOutputSizeshNQ4ISI;
    private float getOutputStallDuration;
    private float getOutputStallDurationlomOqCM;
    private float getValidOutputFormatsForInputhNQ4ISI;
    private float isOutputSupportedFor;
    private boolean isOutputSupportedForhNQ4ISI;
    public float mNeededHeight;
    public float mNeededWidth;
    public float mTextHeightMax;
    public float mTextWidthMax;
    private com.github.mikephil.charting.components.Legend.LegendForm toString;
    private com.github.mikephil.charting.components.Legend.LegendVerticalAlignment unwrapAs;

    public enum LegendDirection {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public enum LegendForm {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    public enum LegendHorizontalAlignment {
        LEFT,
        CENTER,
        RIGHT
    }

    public enum LegendOrientation {
        HORIZONTAL,
        VERTICAL
    }

    public enum LegendVerticalAlignment {
        TOP,
        CENTER,
        BOTTOM
    }

    public Legend() {
        this.getOutputMinFrameDuration = new com.github.mikephil.charting.components.LegendEntry[0];
        this.getOutputMinFrameDurationlomOqCM = false;
        this.getOutputSizeshNQ4ISI = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT;
        this.unwrapAs = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM;
        this.getOutputSizes = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL;
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getHighSpeedVideoSizes = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT;
        this.toString = com.github.mikephil.charting.components.Legend.LegendForm.SQUARE;
        this.getInputFormats = 8.0f;
        this.getInputSizeshNQ4ISI = 3.0f;
        this.getHighSpeedVideoSizesFor = null;
        this.getValidOutputFormatsForInputhNQ4ISI = 6.0f;
        this.accessartificialFrame = 0.0f;
        this.getOutputStallDurationlomOqCM = 5.0f;
        this.isOutputSupportedFor = 3.0f;
        this.getOutputStallDuration = 0.95f;
        this.mNeededWidth = 0.0f;
        this.mNeededHeight = 0.0f;
        this.mTextHeightMax = 0.0f;
        this.mTextWidthMax = 0.0f;
        this.isOutputSupportedForhNQ4ISI = false;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(16);
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(16);
        this.Camera2StreamConfigurationMap = new java.util.ArrayList(16);
        this.mTextSize = com.github.mikephil.charting.utils.Utils.convertDpToPixel(10.0f);
        this.mXOffset = com.github.mikephil.charting.utils.Utils.convertDpToPixel(5.0f);
        this.mYOffset = com.github.mikephil.charting.utils.Utils.convertDpToPixel(3.0f);
    }

    public Legend(com.github.mikephil.charting.components.LegendEntry[] legendEntryArr) {
        this();
        if (legendEntryArr == null) {
            throw new java.lang.IllegalArgumentException("entries array is NULL");
        }
        this.getOutputMinFrameDuration = legendEntryArr;
    }

    public void setEntries(java.util.List<com.github.mikephil.charting.components.LegendEntry> list) {
        this.getOutputMinFrameDuration = (com.github.mikephil.charting.components.LegendEntry[]) list.toArray(new com.github.mikephil.charting.components.LegendEntry[list.size()]);
    }

    public com.github.mikephil.charting.components.LegendEntry[] getEntries() {
        return this.getOutputMinFrameDuration;
    }

    public float getMaximumEntryWidth(android.graphics.Paint paint) {
        float convertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.getOutputStallDurationlomOqCM);
        float f = 0.0f;
        float f2 = 0.0f;
        for (com.github.mikephil.charting.components.LegendEntry legendEntry : this.getOutputMinFrameDuration) {
            float convertDpToPixel2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(java.lang.Float.isNaN(legendEntry.formSize) ? this.getInputFormats : legendEntry.formSize);
            if (convertDpToPixel2 > f2) {
                f2 = convertDpToPixel2;
            }
            java.lang.String str = legendEntry.label;
            if (str != null) {
                float calcTextWidth = com.github.mikephil.charting.utils.Utils.calcTextWidth(paint, str);
                if (calcTextWidth > f) {
                    f = calcTextWidth;
                }
            }
        }
        return f + f2 + convertDpToPixel;
    }

    public float getMaximumEntryHeight(android.graphics.Paint paint) {
        float f = 0.0f;
        for (com.github.mikephil.charting.components.LegendEntry legendEntry : this.getOutputMinFrameDuration) {
            java.lang.String str = legendEntry.label;
            if (str != null) {
                float calcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(paint, str);
                if (calcTextHeight > f) {
                    f = calcTextHeight;
                }
            }
        }
        return f;
    }

    public com.github.mikephil.charting.components.LegendEntry[] getExtraEntries() {
        return this.getOutputFormats;
    }

    public void setExtra(java.util.List<com.github.mikephil.charting.components.LegendEntry> list) {
        this.getOutputFormats = (com.github.mikephil.charting.components.LegendEntry[]) list.toArray(new com.github.mikephil.charting.components.LegendEntry[list.size()]);
    }

    public void setExtra(com.github.mikephil.charting.components.LegendEntry[] legendEntryArr) {
        if (legendEntryArr == null) {
            legendEntryArr = new com.github.mikephil.charting.components.LegendEntry[0];
        }
        this.getOutputFormats = legendEntryArr;
    }

    public void setExtra(int[] iArr, java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < java.lang.Math.min(iArr.length, strArr.length); i++) {
            com.github.mikephil.charting.components.LegendEntry legendEntry = new com.github.mikephil.charting.components.LegendEntry();
            legendEntry.formColor = iArr[i];
            legendEntry.label = strArr[i];
            if (legendEntry.formColor == 1122868 || legendEntry.formColor == 0) {
                legendEntry.form = com.github.mikephil.charting.components.Legend.LegendForm.NONE;
            } else if (legendEntry.formColor == 1122867) {
                legendEntry.form = com.github.mikephil.charting.components.Legend.LegendForm.EMPTY;
            }
            arrayList.add(legendEntry);
        }
        this.getOutputFormats = (com.github.mikephil.charting.components.LegendEntry[]) arrayList.toArray(new com.github.mikephil.charting.components.LegendEntry[arrayList.size()]);
    }

    public void setCustom(com.github.mikephil.charting.components.LegendEntry[] legendEntryArr) {
        this.getOutputMinFrameDuration = legendEntryArr;
        this.getOutputMinFrameDurationlomOqCM = true;
    }

    public void setCustom(java.util.List<com.github.mikephil.charting.components.LegendEntry> list) {
        this.getOutputMinFrameDuration = (com.github.mikephil.charting.components.LegendEntry[]) list.toArray(new com.github.mikephil.charting.components.LegendEntry[list.size()]);
        this.getOutputMinFrameDurationlomOqCM = true;
    }

    public void resetCustom() {
        this.getOutputMinFrameDurationlomOqCM = false;
    }

    public boolean isLegendCustom() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment getHorizontalAlignment() {
        return this.getOutputSizeshNQ4ISI;
    }

    public void setHorizontalAlignment(com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment legendHorizontalAlignment) {
        this.getOutputSizeshNQ4ISI = legendHorizontalAlignment;
    }

    public com.github.mikephil.charting.components.Legend.LegendVerticalAlignment getVerticalAlignment() {
        return this.unwrapAs;
    }

    public void setVerticalAlignment(com.github.mikephil.charting.components.Legend.LegendVerticalAlignment legendVerticalAlignment) {
        this.unwrapAs = legendVerticalAlignment;
    }

    public com.github.mikephil.charting.components.Legend.LegendOrientation getOrientation() {
        return this.getOutputSizes;
    }

    public void setOrientation(com.github.mikephil.charting.components.Legend.LegendOrientation legendOrientation) {
        this.getOutputSizes = legendOrientation;
    }

    public boolean isDrawInsideEnabled() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setDrawInside(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public com.github.mikephil.charting.components.Legend.LegendDirection getDirection() {
        return this.getHighSpeedVideoSizes;
    }

    public void setDirection(com.github.mikephil.charting.components.Legend.LegendDirection legendDirection) {
        this.getHighSpeedVideoSizes = legendDirection;
    }

    public com.github.mikephil.charting.components.Legend.LegendForm getForm() {
        return this.toString;
    }

    public void setForm(com.github.mikephil.charting.components.Legend.LegendForm legendForm) {
        this.toString = legendForm;
    }

    public void setFormSize(float f) {
        this.getInputFormats = f;
    }

    public float getFormSize() {
        return this.getInputFormats;
    }

    public void setFormLineWidth(float f) {
        this.getInputSizeshNQ4ISI = f;
    }

    public float getFormLineWidth() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setFormLineDashEffect(android.graphics.DashPathEffect dashPathEffect) {
        this.getHighSpeedVideoSizesFor = dashPathEffect;
    }

    public android.graphics.DashPathEffect getFormLineDashEffect() {
        return this.getHighSpeedVideoSizesFor;
    }

    public float getXEntrySpace() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public void setXEntrySpace(float f) {
        this.getValidOutputFormatsForInputhNQ4ISI = f;
    }

    public float getYEntrySpace() {
        return this.accessartificialFrame;
    }

    public void setYEntrySpace(float f) {
        this.accessartificialFrame = f;
    }

    public float getFormToTextSpace() {
        return this.getOutputStallDurationlomOqCM;
    }

    public void setFormToTextSpace(float f) {
        this.getOutputStallDurationlomOqCM = f;
    }

    public float getStackSpace() {
        return this.isOutputSupportedFor;
    }

    public void setStackSpace(float f) {
        this.isOutputSupportedFor = f;
    }

    public void setWordWrapEnabled(boolean z) {
        this.isOutputSupportedForhNQ4ISI = z;
    }

    public boolean isWordWrapEnabled() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public float getMaxSizePercent() {
        return this.getOutputStallDuration;
    }

    public void setMaxSizePercent(float f) {
        this.getOutputStallDuration = f;
    }

    public java.util.List<com.github.mikephil.charting.utils.FSize> getCalculatedLabelSizes() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.List<java.lang.Boolean> getCalculatedLabelBreakPoints() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.util.List<com.github.mikephil.charting.utils.FSize> getCalculatedLineSizes() {
        return this.Camera2StreamConfigurationMap;
    }

    public void calculateDimensions(android.graphics.Paint paint, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        float f;
        float f2;
        float f3;
        float f4;
        float convertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.getInputFormats);
        float convertDpToPixel2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.isOutputSupportedFor);
        float convertDpToPixel3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.getOutputStallDurationlomOqCM);
        float convertDpToPixel4 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.getValidOutputFormatsForInputhNQ4ISI);
        float convertDpToPixel5 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.accessartificialFrame);
        boolean z = this.isOutputSupportedForhNQ4ISI;
        com.github.mikephil.charting.components.LegendEntry[] legendEntryArr = this.getOutputMinFrameDuration;
        int length = legendEntryArr.length;
        this.mTextWidthMax = getMaximumEntryWidth(paint);
        this.mTextHeightMax = getMaximumEntryHeight(paint);
        int i = com.github.mikephil.charting.components.Legend.AnonymousClass1.getHighSpeedVideoSizes[this.getOutputSizes.ordinal()];
        if (i == 1) {
            float lineHeight = com.github.mikephil.charting.utils.Utils.getLineHeight(paint);
            float f5 = 0.0f;
            float f6 = 0.0f;
            boolean z2 = false;
            float f7 = 0.0f;
            for (int i2 = 0; i2 < length; i2++) {
                com.github.mikephil.charting.components.LegendEntry legendEntry = legendEntryArr[i2];
                boolean z3 = legendEntry.form != com.github.mikephil.charting.components.Legend.LegendForm.NONE;
                float convertDpToPixel6 = java.lang.Float.isNaN(legendEntry.formSize) ? convertDpToPixel : com.github.mikephil.charting.utils.Utils.convertDpToPixel(legendEntry.formSize);
                java.lang.String str = legendEntry.label;
                if (!z2) {
                    f6 = 0.0f;
                }
                if (z3) {
                    if (z2) {
                        f6 += convertDpToPixel2;
                    }
                    f6 += convertDpToPixel6;
                }
                if (str != null) {
                    if (z3 && !z2) {
                        f6 += convertDpToPixel3;
                    } else if (z2) {
                        f5 += lineHeight + convertDpToPixel5;
                        f7 = java.lang.Math.max(f7, f6);
                        f6 = 0.0f;
                        z2 = false;
                    }
                    float calcTextWidth = com.github.mikephil.charting.utils.Utils.calcTextWidth(paint, str);
                    if (i2 < length - 1) {
                        f5 += lineHeight + convertDpToPixel5;
                    }
                    f6 += calcTextWidth;
                } else {
                    f6 += convertDpToPixel6;
                    if (i2 < length - 1) {
                        f6 += convertDpToPixel2;
                    }
                    z2 = true;
                }
                f7 = java.lang.Math.max(f7, f6);
            }
            this.mNeededWidth = f7;
            this.mNeededHeight = f5;
        } else if (i == 2) {
            float lineHeight2 = com.github.mikephil.charting.utils.Utils.getLineHeight(paint);
            float lineSpacing = com.github.mikephil.charting.utils.Utils.getLineSpacing(paint);
            float contentWidth = viewPortHandler.contentWidth();
            float f8 = this.getOutputStallDuration;
            this.getHighSpeedVideoFpsRanges.clear();
            this.getHighResolutionOutputSizeshNQ4ISI.clear();
            this.Camera2StreamConfigurationMap.clear();
            int i3 = -1;
            int i4 = 0;
            float f9 = 0.0f;
            float f10 = 0.0f;
            float f11 = 0.0f;
            while (i4 < length) {
                com.github.mikephil.charting.components.LegendEntry legendEntry2 = legendEntryArr[i4];
                float f12 = convertDpToPixel4;
                com.github.mikephil.charting.components.LegendEntry[] legendEntryArr2 = legendEntryArr;
                boolean z4 = legendEntry2.form != com.github.mikephil.charting.components.Legend.LegendForm.NONE;
                float convertDpToPixel7 = java.lang.Float.isNaN(legendEntry2.formSize) ? convertDpToPixel : com.github.mikephil.charting.utils.Utils.convertDpToPixel(legendEntry2.formSize);
                java.lang.String str2 = legendEntry2.label;
                float f13 = convertDpToPixel5;
                float f14 = lineSpacing;
                this.getHighSpeedVideoFpsRanges.add(java.lang.Boolean.FALSE);
                float f15 = i3 == -1 ? 0.0f : f9 + convertDpToPixel2;
                if (str2 != null) {
                    f = convertDpToPixel2;
                    this.getHighResolutionOutputSizeshNQ4ISI.add(com.github.mikephil.charting.utils.Utils.calcTextSize(paint, str2));
                    f2 = f15 + (z4 ? convertDpToPixel3 + convertDpToPixel7 : 0.0f) + this.getHighResolutionOutputSizeshNQ4ISI.get(i4).width;
                } else {
                    f = convertDpToPixel2;
                    float f16 = convertDpToPixel7;
                    this.getHighResolutionOutputSizeshNQ4ISI.add(com.github.mikephil.charting.utils.FSize.getInstance(0.0f, 0.0f));
                    f2 = f15 + (!z4 ? 0.0f : f16);
                    if (i3 == -1) {
                        i3 = i4;
                    }
                }
                if (str2 != null || i4 == length - 1) {
                    float f17 = f11;
                    float f18 = f17 == 0.0f ? 0.0f : f12;
                    if (!z || f17 == 0.0f || (contentWidth * f8) - f17 >= f18 + f2) {
                        f3 = f10;
                        f4 = f17 + f18 + f2;
                    } else {
                        this.Camera2StreamConfigurationMap.add(com.github.mikephil.charting.utils.FSize.getInstance(f17, lineHeight2));
                        float max = java.lang.Math.max(f10, f17);
                        this.getHighSpeedVideoFpsRanges.set(i3 >= 0 ? i3 : i4, java.lang.Boolean.TRUE);
                        f4 = f2;
                        f3 = max;
                    }
                    if (i4 == length - 1) {
                        this.Camera2StreamConfigurationMap.add(com.github.mikephil.charting.utils.FSize.getInstance(f4, lineHeight2));
                        f3 = java.lang.Math.max(f3, f4);
                    }
                    f10 = f3;
                    f11 = f4;
                }
                if (str2 != null) {
                    i3 = -1;
                }
                i4++;
                convertDpToPixel2 = f;
                convertDpToPixel4 = f12;
                legendEntryArr = legendEntryArr2;
                lineSpacing = f14;
                f9 = f2;
                convertDpToPixel5 = f13;
            }
            float f19 = convertDpToPixel5;
            float f20 = lineSpacing;
            this.mNeededWidth = f10;
            this.mNeededHeight = (lineHeight2 * this.Camera2StreamConfigurationMap.size()) + ((f20 + f19) * (this.Camera2StreamConfigurationMap.size() == 0 ? 0 : this.Camera2StreamConfigurationMap.size() - 1));
        }
        this.mNeededHeight += this.mYOffset;
        this.mNeededWidth += this.mXOffset;
    }

    /* renamed from: com.github.mikephil.charting.components.Legend$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.github.mikephil.charting.components.Legend.LegendOrientation.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }
}
