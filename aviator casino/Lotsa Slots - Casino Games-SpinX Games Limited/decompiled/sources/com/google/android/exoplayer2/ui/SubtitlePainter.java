package com.google.android.exoplayer2.ui;

/* loaded from: classes3.dex */
final class SubtitlePainter {
    private static final float INNER_PADDING_RATIO = 0.125f;
    private static final java.lang.String TAG = "SubtitlePainter";
    private int backgroundColor;
    private final android.graphics.Paint bitmapPaint;
    private android.graphics.Rect bitmapRect;
    private float bottomPaddingFraction;
    private android.graphics.Bitmap cueBitmap;
    private float cueBitmapHeight;
    private float cueLine;
    private int cueLineAnchor;
    private int cueLineType;
    private float cuePosition;
    private int cuePositionAnchor;
    private float cueSize;
    private java.lang.CharSequence cueText;
    private android.text.Layout.Alignment cueTextAlignment;
    private float cueTextSizePx;
    private float defaultTextSizePx;
    private int edgeColor;
    private android.text.StaticLayout edgeLayout;
    private int edgeType;
    private int foregroundColor;
    private final float outlineWidth;
    private int parentBottom;
    private int parentLeft;
    private int parentRight;
    private int parentTop;
    private final float shadowOffset;
    private final float shadowRadius;
    private final float spacingAdd;
    private final float spacingMult;
    private android.text.StaticLayout textLayout;
    private int textLeft;
    private int textPaddingX;
    private final android.text.TextPaint textPaint;
    private int textTop;
    private int windowColor;
    private final android.graphics.Paint windowPaint;

    public SubtitlePainter(android.content.Context context) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{android.R.attr.lineSpacingExtra, android.R.attr.lineSpacingMultiplier}, 0, 0);
        this.spacingAdd = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.spacingMult = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = java.lang.Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.outlineWidth = round;
        this.shadowRadius = round;
        this.shadowOffset = round;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.textPaint = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.windowPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.bitmapPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public void draw(com.google.android.exoplayer2.text.Cue cue, com.google.android.exoplayer2.ui.CaptionStyleCompat captionStyleCompat, float f, float f2, float f3, android.graphics.Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = cue.bitmap == null;
        if (!z) {
            i5 = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        } else if (android.text.TextUtils.isEmpty(cue.text)) {
            return;
        } else {
            i5 = cue.windowColorSet ? cue.windowColor : captionStyleCompat.windowColor;
        }
        if (areCharSequencesEqual(this.cueText, cue.text) && com.google.android.exoplayer2.util.Util.areEqual(this.cueTextAlignment, cue.textAlignment) && this.cueBitmap == cue.bitmap && this.cueLine == cue.line && this.cueLineType == cue.lineType && com.google.android.exoplayer2.util.Util.areEqual(java.lang.Integer.valueOf(this.cueLineAnchor), java.lang.Integer.valueOf(cue.lineAnchor)) && this.cuePosition == cue.position && com.google.android.exoplayer2.util.Util.areEqual(java.lang.Integer.valueOf(this.cuePositionAnchor), java.lang.Integer.valueOf(cue.positionAnchor)) && this.cueSize == cue.size && this.cueBitmapHeight == cue.bitmapHeight && this.foregroundColor == captionStyleCompat.foregroundColor && this.backgroundColor == captionStyleCompat.backgroundColor && this.windowColor == i5 && this.edgeType == captionStyleCompat.edgeType && this.edgeColor == captionStyleCompat.edgeColor && com.google.android.exoplayer2.util.Util.areEqual(this.textPaint.getTypeface(), captionStyleCompat.typeface) && this.defaultTextSizePx == f && this.cueTextSizePx == f2 && this.bottomPaddingFraction == f3 && this.parentLeft == i && this.parentTop == i2 && this.parentRight == i3 && this.parentBottom == i4) {
            drawLayout(canvas, z);
            return;
        }
        this.cueText = cue.text;
        this.cueTextAlignment = cue.textAlignment;
        this.cueBitmap = cue.bitmap;
        this.cueLine = cue.line;
        this.cueLineType = cue.lineType;
        this.cueLineAnchor = cue.lineAnchor;
        this.cuePosition = cue.position;
        this.cuePositionAnchor = cue.positionAnchor;
        this.cueSize = cue.size;
        this.cueBitmapHeight = cue.bitmapHeight;
        this.foregroundColor = captionStyleCompat.foregroundColor;
        this.backgroundColor = captionStyleCompat.backgroundColor;
        this.windowColor = i5;
        this.edgeType = captionStyleCompat.edgeType;
        this.edgeColor = captionStyleCompat.edgeColor;
        this.textPaint.setTypeface(captionStyleCompat.typeface);
        this.defaultTextSizePx = f;
        this.cueTextSizePx = f2;
        this.bottomPaddingFraction = f3;
        this.parentLeft = i;
        this.parentTop = i2;
        this.parentRight = i3;
        this.parentBottom = i4;
        if (z) {
            com.google.android.exoplayer2.util.Assertions.checkNotNull(this.cueText);
            setupTextLayout();
        } else {
            com.google.android.exoplayer2.util.Assertions.checkNotNull(this.cueBitmap);
            setupBitmapLayout();
        }
        drawLayout(canvas, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a8  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueText"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setupTextLayout() {
        android.text.SpannableStringBuilder spannableStringBuilder;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        java.lang.CharSequence charSequence = this.cueText;
        if (charSequence instanceof android.text.SpannableStringBuilder) {
            spannableStringBuilder = (android.text.SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new android.text.SpannableStringBuilder(this.cueText);
        }
        int i9 = this.parentRight - this.parentLeft;
        int i10 = this.parentBottom - this.parentTop;
        this.textPaint.setTextSize(this.defaultTextSizePx);
        int i11 = (int) ((this.defaultTextSizePx * INNER_PADDING_RATIO) + 0.5f);
        int i12 = i11 * 2;
        int i13 = i9 - i12;
        float f = this.cueSize;
        if (f != -3.4028235E38f) {
            i13 = (int) (i13 * f);
        }
        int i14 = i13;
        if (i14 <= 0) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.cueTextSizePx > 0.0f) {
            spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan((int) this.cueTextSizePx), 0, spannableStringBuilder.length(), 16711680);
        }
        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(spannableStringBuilder);
        if (this.edgeType == 1) {
            for (android.text.style.ForegroundColorSpan foregroundColorSpan : (android.text.style.ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), android.text.style.ForegroundColorSpan.class)) {
                spannableStringBuilder2.removeSpan(foregroundColorSpan);
            }
        }
        if (android.graphics.Color.alpha(this.backgroundColor) > 0) {
            int i15 = this.edgeType;
            if (i15 == 0 || i15 == 2) {
                spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new android.text.style.BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        android.text.Layout.Alignment alignment = this.cueTextAlignment;
        if (alignment == null) {
            alignment = android.text.Layout.Alignment.ALIGN_CENTER;
        }
        android.text.Layout.Alignment alignment2 = alignment;
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(spannableStringBuilder, this.textPaint, i14, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLayout = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.textLayout.getLineCount();
        int i16 = 0;
        for (int i17 = 0; i17 < lineCount; i17++) {
            i16 = java.lang.Math.max((int) java.lang.Math.ceil(this.textLayout.getLineWidth(i17)), i16);
        }
        if (this.cueSize == -3.4028235E38f || i16 >= i14) {
            i14 = i16;
        }
        int i18 = i14 + i12;
        float f2 = this.cuePosition;
        if (f2 != -3.4028235E38f) {
            int round = java.lang.Math.round(i9 * f2);
            int i19 = this.parentLeft;
            int i20 = round + i19;
            int i21 = this.cuePositionAnchor;
            i = 1;
            if (i21 != 1) {
                i2 = 2;
                if (i21 == 2) {
                    i20 -= i18;
                }
            } else {
                i2 = 2;
                i20 = ((i20 * 2) - i18) / 2;
            }
            i3 = java.lang.Math.max(i20, i19);
            i4 = java.lang.Math.min(i18 + i3, this.parentRight);
        } else {
            i = 1;
            i2 = 2;
            i3 = ((i9 - i18) / 2) + this.parentLeft;
            i4 = i3 + i18;
        }
        int i22 = i4 - i3;
        if (i22 <= 0) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f3 = this.cueLine;
        if (f3 != -3.4028235E38f) {
            if (this.cueLineType == 0) {
                i5 = java.lang.Math.round(i10 * f3) + this.parentTop;
                int i23 = this.cueLineAnchor;
                if (i23 != i2) {
                    if (i23 == i) {
                        i5 = ((i5 * 2) - height) / i2;
                    }
                    i7 = i5 + height;
                    i8 = this.parentBottom;
                    if (i7 <= i8) {
                        i5 = i8 - height;
                    } else {
                        int i24 = this.parentTop;
                        if (i5 < i24) {
                            i6 = i24;
                            this.textLayout = new android.text.StaticLayout(spannableStringBuilder, this.textPaint, i22, alignment2, this.spacingMult, this.spacingAdd, true);
                            this.edgeLayout = new android.text.StaticLayout(spannableStringBuilder2, this.textPaint, i22, alignment2, this.spacingMult, this.spacingAdd, true);
                            this.textLeft = i3;
                            this.textTop = i6;
                            this.textPaddingX = i11;
                        }
                    }
                }
                i5 -= height;
                i7 = i5 + height;
                i8 = this.parentBottom;
                if (i7 <= i8) {
                }
            } else {
                int lineBottom = this.textLayout.getLineBottom(0) - this.textLayout.getLineTop(0);
                float f4 = this.cueLine;
                if (f4 >= 0.0f) {
                    i5 = java.lang.Math.round(f4 * lineBottom) + this.parentTop;
                    i7 = i5 + height;
                    i8 = this.parentBottom;
                    if (i7 <= i8) {
                    }
                } else {
                    i5 = java.lang.Math.round((f4 + 1.0f) * lineBottom) + this.parentBottom;
                    i5 -= height;
                    i7 = i5 + height;
                    i8 = this.parentBottom;
                    if (i7 <= i8) {
                    }
                }
            }
        } else {
            i5 = (this.parentBottom - height) - ((int) (i10 * this.bottomPaddingFraction));
        }
        i6 = i5;
        this.textLayout = new android.text.StaticLayout(spannableStringBuilder, this.textPaint, i22, alignment2, this.spacingMult, this.spacingAdd, true);
        this.edgeLayout = new android.text.StaticLayout(spannableStringBuilder2, this.textPaint, i22, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLeft = i3;
        this.textTop = i6;
        this.textPaddingX = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueBitmap"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setupBitmapLayout() {
        int round;
        float f;
        int i;
        float f2;
        android.graphics.Bitmap bitmap = this.cueBitmap;
        int i2 = this.parentRight;
        int i3 = this.parentLeft;
        int i4 = this.parentBottom;
        int i5 = this.parentTop;
        float f3 = i2 - i3;
        float f4 = i3 + (this.cuePosition * f3);
        float f5 = i4 - i5;
        float f6 = i5 + (this.cueLine * f5);
        int round2 = java.lang.Math.round(f3 * this.cueSize);
        float f7 = this.cueBitmapHeight;
        if (f7 != -3.4028235E38f) {
            round = java.lang.Math.round(f5 * f7);
        } else {
            round = java.lang.Math.round(round2 * (bitmap.getHeight() / bitmap.getWidth()));
        }
        int i6 = this.cuePositionAnchor;
        if (i6 != 2) {
            if (i6 == 1) {
                f = round2 / 2;
            }
            int round3 = java.lang.Math.round(f4);
            i = this.cueLineAnchor;
            if (i == 2) {
                if (i == 1) {
                    f2 = round / 2;
                }
                int round4 = java.lang.Math.round(f6);
                this.bitmapRect = new android.graphics.Rect(round3, round4, round2 + round3, round + round4);
            }
            f2 = round;
            f6 -= f2;
            int round42 = java.lang.Math.round(f6);
            this.bitmapRect = new android.graphics.Rect(round3, round42, round2 + round3, round + round42);
        }
        f = round2;
        f4 -= f;
        int round32 = java.lang.Math.round(f4);
        i = this.cueLineAnchor;
        if (i == 2) {
        }
        f6 -= f2;
        int round422 = java.lang.Math.round(f6);
        this.bitmapRect = new android.graphics.Rect(round32, round422, round2 + round32, round + round422);
    }

    private void drawLayout(android.graphics.Canvas canvas, boolean z) {
        if (z) {
            drawTextLayout(canvas);
            return;
        }
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.bitmapRect);
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.cueBitmap);
        drawBitmapLayout(canvas);
    }

    private void drawTextLayout(android.graphics.Canvas canvas) {
        android.text.StaticLayout staticLayout = this.textLayout;
        android.text.StaticLayout staticLayout2 = this.edgeLayout;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.textLeft, this.textTop);
        if (android.graphics.Color.alpha(this.windowColor) > 0) {
            this.windowPaint.setColor(this.windowColor);
            canvas.drawRect(-this.textPaddingX, 0.0f, staticLayout.getWidth() + this.textPaddingX, staticLayout.getHeight(), this.windowPaint);
        }
        int i = this.edgeType;
        if (i == 1) {
            this.textPaint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            this.textPaint.setStrokeWidth(this.outlineWidth);
            this.textPaint.setColor(this.edgeColor);
            this.textPaint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i == 2) {
            android.text.TextPaint textPaint = this.textPaint;
            float f = this.shadowRadius;
            float f2 = this.shadowOffset;
            textPaint.setShadowLayer(f, f2, f2, this.edgeColor);
        } else if (i == 3 || i == 4) {
            boolean z = i == 3;
            int i2 = z ? -1 : this.edgeColor;
            int i3 = z ? this.edgeColor : -1;
            float f3 = this.shadowRadius / 2.0f;
            this.textPaint.setColor(this.foregroundColor);
            this.textPaint.setStyle(android.graphics.Paint.Style.FILL);
            float f4 = -f3;
            this.textPaint.setShadowLayer(this.shadowRadius, f4, f4, i2);
            staticLayout2.draw(canvas);
            this.textPaint.setShadowLayer(this.shadowRadius, f3, f3, i3);
        }
        this.textPaint.setColor(this.foregroundColor);
        this.textPaint.setStyle(android.graphics.Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueBitmap", "bitmapRect"})
    private void drawBitmapLayout(android.graphics.Canvas canvas) {
        canvas.drawBitmap(this.cueBitmap, (android.graphics.Rect) null, this.bitmapRect, this.bitmapPaint);
    }

    private static boolean areCharSequencesEqual(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }
}
