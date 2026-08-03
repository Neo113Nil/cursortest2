package androidx.emoji2.text;

/* loaded from: classes2.dex */
public abstract class EmojiSpan extends android.text.style.ReplacementSpan {
    private final androidx.emoji2.text.TypefaceEmojiRasterizer mRasterizer;
    private final android.graphics.Paint.FontMetricsInt mTmpFontMetrics = new android.graphics.Paint.FontMetricsInt();
    private short mWidth = -1;
    private short mHeight = -1;
    private float mRatio = 1.0f;

    EmojiSpan(androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        androidx.core.util.Preconditions.checkNotNull(typefaceEmojiRasterizer, "rasterizer cannot be null");
        this.mRasterizer = typefaceEmojiRasterizer;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.mTmpFontMetrics);
        this.mRatio = (java.lang.Math.abs(this.mTmpFontMetrics.descent - this.mTmpFontMetrics.ascent) * 1.0f) / this.mRasterizer.getHeight();
        this.mHeight = (short) (this.mRasterizer.getHeight() * this.mRatio);
        this.mWidth = (short) (this.mRasterizer.getWidth() * this.mRatio);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = this.mTmpFontMetrics.ascent;
            fontMetricsInt.descent = this.mTmpFontMetrics.descent;
            fontMetricsInt.top = this.mTmpFontMetrics.top;
            fontMetricsInt.bottom = this.mTmpFontMetrics.bottom;
        }
        return this.mWidth;
    }

    public final androidx.emoji2.text.TypefaceEmojiRasterizer getTypefaceRasterizer() {
        return this.mRasterizer;
    }

    final int getWidth() {
        return this.mWidth;
    }

    public final int getHeight() {
        return this.mHeight;
    }

    final float getRatio() {
        return this.mRatio;
    }

    public final int getId() {
        return getTypefaceRasterizer().getId();
    }
}
