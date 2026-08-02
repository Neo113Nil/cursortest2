package com.microblink.blinkid.view.ocrResult;

/* loaded from: classes10.dex */
public class OcrResultCharsView extends android.view.View implements com.microblink.blinkid.view.ocrResult.IOcrResultView {
    private int Camera2StreamConfigurationMap;
    private final android.animation.ArgbEvaluator getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private final int getHighSpeedVideoSizesFor;
    private final int getInputSizeshNQ4ISI;
    private final android.graphics.Paint getOutputFormats;
    private final java.util.concurrent.ConcurrentHashMap getOutputMinFrameDuration;

    public OcrResultCharsView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.getOutputMinFrameDuration = new java.util.concurrent.ConcurrentHashMap();
        this.getHighSpeedVideoFpsRangesFor = -1;
        this.Camera2StreamConfigurationMap = -1;
        this.getOutputFormats = null;
        this.getHighResolutionOutputSizeshNQ4ISI = new android.animation.ArgbEvaluator();
        this.getInputSizeshNQ4ISI = androidx.core.internal.view.SupportMenu.CATEGORY_MASK;
        this.getHighSpeedVideoSizesFor = -16711936;
        this.getHighSpeedVideoFpsRanges = -256;
        this.getHighSpeedVideoSizes = 1;
        setBackgroundColor(0);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.getOutputFormats = paint;
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setTextAlign(android.graphics.Paint.Align.LEFT);
        paint.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        paint.setShadowLayer(10.0f, 2.0f, 2.0f, -16777216);
        android.content.res.Resources resources = context.getResources();
        this.getInputSizeshNQ4ISI = resources.getColor(com.microblink.blinkid.library.R.color.mb_min_quality_ocr_color);
        this.getHighSpeedVideoFpsRanges = resources.getColor(com.microblink.blinkid.library.R.color.mb_med_quality_ocr_color);
        this.getHighSpeedVideoSizesFor = resources.getColor(com.microblink.blinkid.library.R.color.mb_max_quality_ocr_color);
        this.getHighSpeedVideoSizes = i;
        setLayerType(1, paint);
    }

    @Override // com.microblink.blinkid.view.ocrResult.IOcrResultView
    public void addOcrResult(com.microblink.blinkid.metadata.ocr.DisplayableOcrResult displayableOcrResult) {
        this.getOutputMinFrameDuration.put(displayableOcrResult.getResultName(), displayableOcrResult);
        postInvalidate();
    }

    @Override // com.microblink.blinkid.view.viewfinder.IDetectionView
    public void clearDisplayedContent() {
        this.getOutputMinFrameDuration.clear();
        postInvalidate();
    }

    @Override // com.microblink.blinkid.view.viewfinder.IDetectionView
    public android.view.View getView() {
        return this;
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        java.util.Iterator it;
        com.microblink.blinkid.results.ocr.OcrBlock[] ocrBlockArr;
        int i;
        int intValue;
        int i2 = 0;
        if (com.microblink.blinkid.util.Log.getCurrentLogLevel().ordinal() >= com.microblink.blinkid.util.Log.LogLevel.LOG_DEBUG.ordinal()) {
            com.microblink.blinkid.secured.IIIlllIIlI.llIIlIlIIl.push(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.microblink.blinkid.util.Log.w(this, "OCR result drawing started", new java.lang.Object[0]);
        }
        if (this.getHighSpeedVideoFpsRangesFor == -1) {
            this.getHighSpeedVideoFpsRangesFor = getWidth();
        }
        if (this.Camera2StreamConfigurationMap == -1) {
            this.Camera2StreamConfigurationMap = getHeight();
        }
        canvas.save();
        int i3 = this.getHighSpeedVideoSizes;
        if (i3 == 1) {
            canvas.rotate(90.0f, this.getHighSpeedVideoFpsRangesFor / 2.0f, this.Camera2StreamConfigurationMap / 2.0f);
        } else if (i3 == 8) {
            canvas.rotate(180.0f, this.getHighSpeedVideoFpsRangesFor / 2.0f, this.Camera2StreamConfigurationMap / 2.0f);
        } else if (i3 == 9) {
            canvas.rotate(270.0f, this.getHighSpeedVideoFpsRangesFor / 2.0f, this.Camera2StreamConfigurationMap / 2.0f);
        }
        int i4 = this.getHighSpeedVideoSizes;
        if (i4 == 1 || i4 == 9) {
            float f = this.Camera2StreamConfigurationMap;
            float f2 = this.getHighSpeedVideoFpsRangesFor;
            canvas.scale(f / f2, f2 / f, f2 / 2.0f, f / 2.0f);
        }
        canvas.scale(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        java.util.Iterator it2 = this.getOutputMinFrameDuration.entrySet().iterator();
        while (it2.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
            com.microblink.blinkid.util.Log.d(this, "Drawing OCR result for name {}", entry.getKey());
            com.microblink.blinkid.metadata.ocr.DisplayableOcrResult displayableOcrResult = (com.microblink.blinkid.metadata.ocr.DisplayableOcrResult) entry.getValue();
            com.microblink.blinkid.util.Log.i(this, "Drawing OCR result to canvas. Hardware accelerated: {}", java.lang.Boolean.valueOf(canvas.isHardwareAccelerated()));
            canvas.save();
            canvas.concat(displayableOcrResult.getTransformMatrix());
            com.microblink.blinkid.results.ocr.OcrBlock[] blocks = displayableOcrResult.getOcrResult().getBlocks();
            if (blocks != null) {
                int length = blocks.length;
                int i5 = i2;
                while (i5 < length) {
                    com.microblink.blinkid.results.ocr.OcrLine[] lines = blocks[i5].getLines();
                    if (lines != null) {
                        int length2 = lines.length;
                        int i6 = i2;
                        while (i6 < length2) {
                            com.microblink.blinkid.results.ocr.CharWithVariants[] chars = lines[i6].getChars();
                            if (chars != null) {
                                int length3 = chars.length;
                                int i7 = i2;
                                while (i7 < length3) {
                                    com.microblink.blinkid.results.ocr.CharWithVariants charWithVariants = chars[i7];
                                    if (charWithVariants != null) {
                                        com.microblink.blinkid.results.ocr.OcrChar ocrChar = charWithVariants.getChar();
                                        if (!java.lang.Character.isWhitespace(ocrChar.getValue())) {
                                            com.microblink.blinkid.geometry.Rectangle position = ocrChar.getPosition();
                                            this.getOutputFormats.setTextSize(position.getHeight());
                                            android.graphics.Paint paint = this.getOutputFormats;
                                            int quality = ocrChar.getQuality();
                                            it = it2;
                                            if (quality <= 80) {
                                                ocrBlockArr = blocks;
                                                i = length;
                                                intValue = ((java.lang.Integer) this.getHighResolutionOutputSizeshNQ4ISI.evaluate(quality / 80.0f, java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI), java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRanges))).intValue();
                                            } else {
                                                ocrBlockArr = blocks;
                                                i = length;
                                                intValue = ((java.lang.Integer) this.getHighResolutionOutputSizeshNQ4ISI.evaluate((quality - 80) / 20.0f, java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRanges), java.lang.Integer.valueOf(this.getHighSpeedVideoSizesFor))).intValue();
                                            }
                                            paint.setColor(intValue);
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                            sb.append(ocrChar.getValue());
                                            canvas.drawText(sb.toString(), position.getX(), position.getHeight() + position.getY(), this.getOutputFormats);
                                            i7++;
                                            it2 = it;
                                            blocks = ocrBlockArr;
                                            length = i;
                                        }
                                    }
                                    it = it2;
                                    ocrBlockArr = blocks;
                                    i = length;
                                    i7++;
                                    it2 = it;
                                    blocks = ocrBlockArr;
                                    length = i;
                                }
                            }
                            i6++;
                            it2 = it2;
                            blocks = blocks;
                            length = length;
                            i2 = 0;
                        }
                    }
                    i5++;
                    it2 = it2;
                    blocks = blocks;
                    length = length;
                    i2 = 0;
                }
            }
            canvas.restore();
            it2 = it2;
            i2 = 0;
        }
        canvas.restore();
        if (com.microblink.blinkid.util.Log.getCurrentLogLevel().ordinal() >= com.microblink.blinkid.util.Log.LogLevel.LOG_DEBUG.ordinal()) {
            java.util.Stack stack = com.microblink.blinkid.secured.IIIlllIIlI.llIIlIlIIl;
            com.microblink.blinkid.util.Log.w(this, "OCR result drawing took {} ms", java.lang.Long.valueOf(!stack.isEmpty() ? java.lang.System.currentTimeMillis() - ((java.lang.Long) stack.pop()).longValue() : -1L));
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.getHighSpeedVideoFpsRangesFor = getWidth();
        int height = getHeight();
        this.Camera2StreamConfigurationMap = height;
        com.microblink.blinkid.util.Log.v(this, "OCR view layouting to size: {}x{}", java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor), java.lang.Integer.valueOf(height));
    }

    @Override // com.microblink.blinkid.view.viewfinder.IDetectionView
    public void setHostActivityOrientation(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    @Override // com.microblink.blinkid.view.ocrResult.IOcrResultView
    public void setOcrResult(com.microblink.blinkid.metadata.ocr.DisplayableOcrResult displayableOcrResult) {
        this.getOutputMinFrameDuration.clear();
        addOcrResult(displayableOcrResult);
    }
}
