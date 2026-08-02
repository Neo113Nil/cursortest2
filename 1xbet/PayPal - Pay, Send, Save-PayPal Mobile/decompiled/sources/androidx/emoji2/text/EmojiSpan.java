package androidx.emoji2.text;

/* loaded from: classes3.dex */
public abstract class EmojiSpan extends android.text.style.ReplacementSpan {
    private final androidx.emoji2.text.TypefaceEmojiRasterizer Camera2StreamConfigurationMap;
    private final android.graphics.Paint.FontMetricsInt getHighSpeedVideoFpsRangesFor = new android.graphics.Paint.FontMetricsInt();
    private short getHighResolutionOutputSizeshNQ4ISI = -1;
    private short getHighSpeedVideoSizes = -1;
    private float getHighSpeedVideoFpsRanges = 1.0f;

    EmojiSpan(androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        androidx.core.util.Preconditions.checkNotNull(typefaceEmojiRasterizer, "rasterizer cannot be null");
        this.Camera2StreamConfigurationMap = typefaceEmojiRasterizer;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoFpsRanges = (java.lang.Math.abs(this.getHighSpeedVideoFpsRangesFor.descent - this.getHighSpeedVideoFpsRangesFor.ascent) * 1.0f) / this.Camera2StreamConfigurationMap.getHeight();
        this.getHighSpeedVideoSizes = (short) (this.Camera2StreamConfigurationMap.getHeight() * this.getHighSpeedVideoFpsRanges);
        this.getHighResolutionOutputSizeshNQ4ISI = (short) (this.Camera2StreamConfigurationMap.getWidth() * this.getHighSpeedVideoFpsRanges);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = this.getHighSpeedVideoFpsRangesFor.ascent;
            fontMetricsInt.descent = this.getHighSpeedVideoFpsRangesFor.descent;
            fontMetricsInt.top = this.getHighSpeedVideoFpsRangesFor.top;
            fontMetricsInt.bottom = this.getHighSpeedVideoFpsRangesFor.bottom;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.emoji2.text.TypefaceEmojiRasterizer getTypefaceRasterizer() {
        return this.Camera2StreamConfigurationMap;
    }

    final int getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int getHeight() {
        return this.getHighSpeedVideoSizes;
    }

    public final int getId() {
        return getTypefaceRasterizer().getId();
    }
}
