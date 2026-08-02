package androidx.emoji2.text;

/* loaded from: classes7.dex */
class DefaultGlyphChecker implements androidx.emoji2.text.EmojiCompat.GlyphChecker {
    private static final java.lang.ThreadLocal<java.lang.StringBuilder> getHighSpeedVideoFpsRangesFor = new java.lang.ThreadLocal<>();
    private final android.text.TextPaint getHighSpeedVideoSizes;

    DefaultGlyphChecker() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.getHighSpeedVideoSizes = textPaint;
        textPaint.setTextSize(10.0f);
    }

    @Override // androidx.emoji2.text.EmojiCompat.GlyphChecker
    public boolean hasGlyph(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        java.lang.ThreadLocal<java.lang.StringBuilder> threadLocal = getHighSpeedVideoFpsRangesFor;
        if (threadLocal.get() == null) {
            threadLocal.set(new java.lang.StringBuilder());
        }
        java.lang.StringBuilder sb = threadLocal.get();
        sb.setLength(0);
        while (i < i2) {
            sb.append(charSequence.charAt(i));
            i++;
        }
        return androidx.core.graphics.PaintCompat.hasGlyph(this.getHighSpeedVideoSizes, sb.toString());
    }
}
