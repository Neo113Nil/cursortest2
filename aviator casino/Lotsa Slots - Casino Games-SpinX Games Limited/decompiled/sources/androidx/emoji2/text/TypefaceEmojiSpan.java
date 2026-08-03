package androidx.emoji2.text;

/* loaded from: classes2.dex */
public final class TypefaceEmojiSpan extends androidx.emoji2.text.EmojiSpan {
    private static android.graphics.Paint sDebugPaint;
    private android.text.TextPaint mWorkingPaint;

    public TypefaceEmojiSpan(androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        super(typefaceEmojiRasterizer);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
        android.graphics.Paint paint2 = paint;
        android.text.TextPaint applyCharacterSpanStyles = applyCharacterSpanStyles(charSequence, i, i2, paint2);
        if (applyCharacterSpanStyles != null && applyCharacterSpanStyles.bgColor != 0) {
            drawBackground(canvas, applyCharacterSpanStyles, f, f + getWidth(), i3, i5);
        }
        if (androidx.emoji2.text.EmojiCompat.get().isEmojiSpanIndicatorEnabled()) {
            canvas.drawRect(f, i3, f + getWidth(), i5, getDebugPaint());
        }
        androidx.emoji2.text.TypefaceEmojiRasterizer typefaceRasterizer = getTypefaceRasterizer();
        float f2 = i4;
        if (applyCharacterSpanStyles != null) {
            paint2 = applyCharacterSpanStyles;
        }
        typefaceRasterizer.draw(canvas, f, f2, paint2);
    }

    void drawBackground(android.graphics.Canvas canvas, android.text.TextPaint textPaint, float f, float f2, float f3, float f4) {
        int color = textPaint.getColor();
        android.graphics.Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(android.graphics.Paint.Style.FILL);
        canvas.drawRect(f, f3, f2, f4, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    private android.text.TextPaint applyCharacterSpanStyles(java.lang.CharSequence charSequence, int i, int i2, android.graphics.Paint paint) {
        if (charSequence instanceof android.text.Spanned) {
            android.text.style.CharacterStyle[] characterStyleArr = (android.text.style.CharacterStyle[]) ((android.text.Spanned) charSequence).getSpans(i, i2, android.text.style.CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    android.text.TextPaint textPaint = this.mWorkingPaint;
                    if (textPaint == null) {
                        textPaint = new android.text.TextPaint();
                        this.mWorkingPaint = textPaint;
                    }
                    textPaint.set(paint);
                    for (android.text.style.CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                    return textPaint;
                }
            }
            if (paint instanceof android.text.TextPaint) {
                return (android.text.TextPaint) paint;
            }
            return null;
        }
        if (paint instanceof android.text.TextPaint) {
            return (android.text.TextPaint) paint;
        }
        return null;
    }

    private static android.graphics.Paint getDebugPaint() {
        if (sDebugPaint == null) {
            android.text.TextPaint textPaint = new android.text.TextPaint();
            sDebugPaint = textPaint;
            textPaint.setColor(androidx.emoji2.text.EmojiCompat.get().getEmojiSpanIndicatorColor());
            sDebugPaint.setStyle(android.graphics.Paint.Style.FILL);
        }
        return sDebugPaint;
    }
}
