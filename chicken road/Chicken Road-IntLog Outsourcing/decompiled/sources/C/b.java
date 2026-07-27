package C;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f318a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f319b;

    /* renamed from: c, reason: collision with root package name */
    public final int f320c;

    /* renamed from: d, reason: collision with root package name */
    public final int f321d;

    public b(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = A2.a.j(textPaint).setBreakStrategy(i2);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i3);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f318a = textPaint;
        this.f319b = textDirectionHeuristic;
        this.f320c = i2;
        this.f321d = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f320c == bVar.f320c && this.f321d == bVar.f321d) {
            TextPaint textPaint = this.f318a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = bVar.f318a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f319b == bVar.f319b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f318a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f319b, Integer.valueOf(this.f320c), Integer.valueOf(this.f321d));
    }

    public final String toString() {
        String fontVariationSettings;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f318a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i2 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i2 >= 26) {
            StringBuilder sb3 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb3.append(fontVariationSettings);
            sb.append(sb3.toString());
        }
        sb.append(", textDir=" + this.f319b);
        sb.append(", breakStrategy=" + this.f320c);
        sb.append(", hyphenationFrequency=" + this.f321d);
        sb.append("}");
        return sb.toString();
    }

    public b(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f318a = textPaint;
        textDirection = params.getTextDirection();
        this.f319b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f320c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f321d = hyphenationFrequency;
    }
}
