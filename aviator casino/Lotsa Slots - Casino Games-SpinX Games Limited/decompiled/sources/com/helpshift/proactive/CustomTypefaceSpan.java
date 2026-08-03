package com.helpshift.proactive;

/* loaded from: classes5.dex */
public class CustomTypefaceSpan extends android.text.style.TypefaceSpan {
    private static final java.lang.String TAG = "CustomTf";
    private final android.graphics.Typeface newType;

    public CustomTypefaceSpan(android.graphics.Typeface typeface) {
        super("");
        this.newType = typeface;
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        applyCustomTypeFace(textPaint, this.newType);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint textPaint) {
        applyCustomTypeFace(textPaint, this.newType);
    }

    private static void applyCustomTypeFace(android.graphics.Paint paint, android.graphics.Typeface typeface) {
        try {
            android.graphics.Typeface typeface2 = paint.getTypeface();
            int style = (typeface2 == null ? 0 : typeface2.getStyle()) & (~typeface.getStyle());
            if ((style & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((style & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.setTypeface(typeface);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in setting typeface", e);
        }
    }
}
