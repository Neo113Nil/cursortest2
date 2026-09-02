package w;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1004b {

    /* renamed from: a, reason: collision with root package name */
    public final android.text.TextPaint f8395a;

    /* renamed from: b, reason: collision with root package name */
    public final android.text.TextDirectionHeuristic f8396b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8397c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8398d;

    public C1004b(android.text.TextPaint textPaint, android.text.TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
        android.text.PrecomputedText.Params.Builder breakStrategy;
        android.text.PrecomputedText.Params.Builder hyphenationFrequency;
        android.text.PrecomputedText.Params.Builder textDirection;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            breakStrategy = w.AbstractC1003a.e(textPaint).setBreakStrategy(i2);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i3);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f8395a = textPaint;
        this.f8396b = textDirectionHeuristic;
        this.f8397c = i2;
        this.f8398d = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w.C1004b)) {
            return false;
        }
        w.C1004b c1004b = (w.C1004b) obj;
        if (this.f8397c == c1004b.f8397c && this.f8398d == c1004b.f8398d) {
            android.text.TextPaint textPaint = this.f8395a;
            float textSize = textPaint.getTextSize();
            android.text.TextPaint textPaint2 = c1004b.f8395a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && android.text.TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f8396b == c1004b.f8396b;
        }
        return false;
    }

    public final int hashCode() {
        android.text.TextPaint textPaint = this.f8395a;
        return java.util.Objects.hash(java.lang.Float.valueOf(textPaint.getTextSize()), java.lang.Float.valueOf(textPaint.getTextScaleX()), java.lang.Float.valueOf(textPaint.getTextSkewX()), java.lang.Float.valueOf(textPaint.getLetterSpacing()), java.lang.Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), java.lang.Boolean.valueOf(textPaint.isElegantTextHeight()), this.f8396b, java.lang.Integer.valueOf(this.f8397c), java.lang.Integer.valueOf(this.f8398d));
    }

    public final java.lang.String toString() {
        java.lang.String fontVariationSettings;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("textSize=");
        android.text.TextPaint textPaint = this.f8395a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i2 = android.os.Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i2 >= 26) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb3.append(fontVariationSettings);
            sb.append(sb3.toString());
        }
        sb.append(", textDir=" + this.f8396b);
        sb.append(", breakStrategy=" + this.f8397c);
        sb.append(", hyphenationFrequency=" + this.f8398d);
        sb.append("}");
        return sb.toString();
    }

    public C1004b(android.text.PrecomputedText.Params params) {
        android.text.TextPaint textPaint;
        android.text.TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f8395a = textPaint;
        textDirection = params.getTextDirection();
        this.f8396b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f8397c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f8398d = hyphenationFrequency;
    }
}
