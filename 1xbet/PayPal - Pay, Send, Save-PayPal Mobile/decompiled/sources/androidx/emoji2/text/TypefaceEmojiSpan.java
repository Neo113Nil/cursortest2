package androidx.emoji2.text;

/* loaded from: classes7.dex */
public final class TypefaceEmojiSpan extends androidx.emoji2.text.EmojiSpan {
    private static android.graphics.Paint getHighSpeedVideoFpsRanges;
    private android.text.TextPaint Camera2StreamConfigurationMap;

    public TypefaceEmojiSpan(androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        super(typefaceEmojiRasterizer);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
        android.graphics.Paint paint2 = paint;
        android.text.TextPaint textPaint = null;
        if (charSequence instanceof android.text.Spanned) {
            android.text.style.CharacterStyle[] characterStyleArr = (android.text.style.CharacterStyle[]) ((android.text.Spanned) charSequence).getSpans(i, i2, android.text.style.CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    android.text.TextPaint textPaint2 = this.Camera2StreamConfigurationMap;
                    if (textPaint2 == null) {
                        textPaint2 = new android.text.TextPaint();
                        this.Camera2StreamConfigurationMap = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (android.text.style.CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof android.text.style.MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint2 instanceof android.text.TextPaint) {
                textPaint = (android.text.TextPaint) paint2;
            }
        } else if (paint2 instanceof android.text.TextPaint) {
            textPaint = (android.text.TextPaint) paint2;
        }
        android.text.TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            android.graphics.Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawRect(f, i3, f + getHighResolutionOutputSizeshNQ4ISI(), i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        if (androidx.emoji2.text.EmojiCompat.get().isEmojiSpanIndicatorEnabled()) {
            float f2 = i3;
            float highResolutionOutputSizeshNQ4ISI = f + getHighResolutionOutputSizeshNQ4ISI();
            float f3 = i5;
            if (getHighSpeedVideoFpsRanges == null) {
                android.text.TextPaint textPaint4 = new android.text.TextPaint();
                getHighSpeedVideoFpsRanges = textPaint4;
                textPaint4.setColor(androidx.emoji2.text.EmojiCompat.get().getEmojiSpanIndicatorColor());
                getHighSpeedVideoFpsRanges.setStyle(android.graphics.Paint.Style.FILL);
            }
            canvas.drawRect(f, f2, highResolutionOutputSizeshNQ4ISI, f3, getHighSpeedVideoFpsRanges);
        }
        androidx.emoji2.text.TypefaceEmojiRasterizer typefaceRasterizer = getTypefaceRasterizer();
        float f4 = i4;
        if (textPaint3 != null) {
            paint2 = textPaint3;
        }
        typefaceRasterizer.draw(canvas, f, f4, paint2);
    }
}
