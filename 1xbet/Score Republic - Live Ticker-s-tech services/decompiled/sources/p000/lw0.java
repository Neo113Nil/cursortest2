package p000;

import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class lw0 {

    /* JADX INFO: renamed from: a */
    public final TextPaint f4915a;

    /* JADX INFO: renamed from: b */
    public final TextDirectionHeuristic f4916b;

    /* JADX INFO: renamed from: c */
    public final int f4917c;

    /* JADX INFO: renamed from: d */
    public final int f4918d;

    public lw0(PrecomputedText.Params params) {
        this.f4915a = params.getTextPaint();
        this.f4916b = params.getTextDirection();
        this.f4917c = params.getBreakStrategy();
        this.f4918d = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lw0)) {
            return false;
        }
        lw0 lw0Var = (lw0) obj;
        int i = lw0Var.f4917c;
        TextPaint textPaint = lw0Var.f4915a;
        if (this.f4917c == i && this.f4918d == lw0Var.f4918d) {
            TextPaint textPaint2 = this.f4915a;
            return textPaint2.getTextSize() == textPaint.getTextSize() && textPaint2.getTextScaleX() == textPaint.getTextScaleX() && textPaint2.getTextSkewX() == textPaint.getTextSkewX() && textPaint2.getLetterSpacing() == textPaint.getLetterSpacing() && TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) && textPaint2.getFlags() == textPaint.getFlags() && textPaint2.getTextLocales().equals(textPaint.getTextLocales()) && (textPaint2.getTypeface() != null ? textPaint2.getTypeface().equals(textPaint.getTypeface()) : textPaint.getTypeface() == null) && this.f4916b == lw0Var.f4916b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f4915a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f4916b, Integer.valueOf(this.f4917c), Integer.valueOf(this.f4918d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f4915a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f4916b);
        sb.append(", breakStrategy=" + this.f4917c);
        sb.append(", hyphenationFrequency=" + this.f4918d);
        sb.append("}");
        return sb.toString();
    }
}
