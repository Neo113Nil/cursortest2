package N;

import A1.J0;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f4629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f4630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4632d;

    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i7, int i8) {
        if (Build.VERSION.SDK_INT >= 29) {
            J0.j(textPaint).setBreakStrategy(i7).setHyphenationFrequency(i8).setTextDirection(textDirectionHeuristic).build();
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
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f4630b);
        sb.append(", breakStrategy=" + this.f4631c);
        sb.append(", hyphenationFrequency=" + this.f4632d);
        sb.append("}");
        return sb.toString();
    }

    public c(PrecomputedText.Params params) {
        this.f4629a = params.getTextPaint();
        this.f4630b = params.getTextDirection();
        this.f4631c = params.getBreakStrategy();
        this.f4632d = params.getHyphenationFrequency();
    }
}
