package l1;

import L0.f;
import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f17760a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f17761b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17762c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17763d;

    public b(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i5) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = f.h(textPaint).setBreakStrategy(i);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i5);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f17760a = textPaint;
        this.f17761b = textDirectionHeuristic;
        this.f17762c = i;
        this.f17763d = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r2 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (r0.getTypeface() != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r3.getTypeface() == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        if (r5.f17761b != r6.f17761b) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
    
        if (r0.getTypeface().equals(r3.getTypeface()) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if (r0.getTextLocale().equals(r3.getTextLocale()) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        LocaleList textLocales;
        LocaleList textLocales2;
        boolean equals;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f17762c == bVar.f17762c && this.f17763d == bVar.f17763d) {
                TextPaint textPaint = this.f17760a;
                float textSize = textPaint.getTextSize();
                TextPaint textPaint2 = bVar.f17760a;
                if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags()) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        textLocales = textPaint.getTextLocales();
                        textLocales2 = textPaint2.getTextLocales();
                        equals = textLocales.equals(textLocales2);
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        LocaleList textLocales;
        TextDirectionHeuristic textDirectionHeuristic = this.f17761b;
        int i = Build.VERSION.SDK_INT;
        int i5 = this.f17763d;
        int i6 = this.f17762c;
        TextPaint textPaint = this.f17760a;
        if (i < 24) {
            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i6), Integer.valueOf(i5));
        }
        Float valueOf = Float.valueOf(textPaint.getTextSize());
        Float valueOf2 = Float.valueOf(textPaint.getTextScaleX());
        Float valueOf3 = Float.valueOf(textPaint.getTextSkewX());
        Float valueOf4 = Float.valueOf(textPaint.getLetterSpacing());
        Integer valueOf5 = Integer.valueOf(textPaint.getFlags());
        textLocales = textPaint.getTextLocales();
        return Objects.hash(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, textLocales, textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i6), Integer.valueOf(i5));
    }

    public final String toString() {
        String fontVariationSettings;
        LocaleList textLocales;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f17760a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            StringBuilder sb3 = new StringBuilder(", textLocale=");
            textLocales = textPaint.getTextLocales();
            sb3.append(textLocales);
            sb.append(sb3.toString());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            StringBuilder sb4 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb4.append(fontVariationSettings);
            sb.append(sb4.toString());
        }
        sb.append(", textDir=" + this.f17761b);
        sb.append(", breakStrategy=" + this.f17762c);
        sb.append(", hyphenationFrequency=" + this.f17763d);
        sb.append("}");
        return sb.toString();
    }

    public b(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f17760a = textPaint;
        textDirection = params.getTextDirection();
        this.f17761b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f17762c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f17763d = hyphenationFrequency;
    }
}
