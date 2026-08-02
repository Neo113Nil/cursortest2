package N;

import A1.J0;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f4629a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f4630b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4631c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4632d;

    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i7, int i8) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = J0.j(textPaint).setBreakStrategy(i7);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i8);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f4629a = textPaint;
        this.f4630b = textDirectionHeuristic;
        this.f4631c = i7;
        this.f4632d = i8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4631c == cVar.f4631c && this.f4632d == cVar.f4632d) {
            TextPaint textPaint = this.f4629a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = cVar.f4629a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f4630b == cVar.f4630b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f4629a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f4630b, Integer.valueOf(this.f4631c), Integer.valueOf(this.f4632d));
    }

    public final String toString() {
        String fontVariationSettings;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f4629a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i7 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i7 >= 26) {
            StringBuilder sb3 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb3.append(fontVariationSettings);
            sb.append(sb3.toString());
        }
        sb.append(", textDir=" + this.f4630b);
        sb.append(", breakStrategy=" + this.f4631c);
        sb.append(", hyphenationFrequency=" + this.f4632d);
        sb.append("}");
        return sb.toString();
    }

    public c(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f4629a = textPaint;
        textDirection = params.getTextDirection();
        this.f4630b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f4631c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f4632d = hyphenationFrequency;
    }
}
