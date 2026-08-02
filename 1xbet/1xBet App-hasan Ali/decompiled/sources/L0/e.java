package L0;

import X3.C0442b;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3004a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f3005b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3006c;

    /* renamed from: d, reason: collision with root package name */
    public float f3007d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f3008e = Float.NaN;
    public BoringLayout.Metrics f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3009g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f3010h;

    public e(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f3004a = charSequence;
        this.f3005b = textPaint;
        this.f3006c = i;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f3009g) {
            TextDirectionHeuristic a5 = l.a(this.f3006c);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f3004a;
            TextPaint textPaint = this.f3005b;
            this.f = i >= 33 ? BoringLayout.isBoring(charSequence, textPaint, a5, true, null) : !a5.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.f3009g = true;
        }
        return this.f;
    }

    public final CharSequence b() {
        CharacterStyle[] characterStyleArr;
        CharSequence charSequence = this.f3010h;
        if (charSequence == null) {
            charSequence = this.f3004a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (h.f(spanned, CharacterStyle.class) && (characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class)) != null && characterStyleArr.length != 0) {
                    C0442b i = kotlin.jvm.internal.l.i(characterStyleArr);
                    SpannableString spannableString = null;
                    while (i.hasNext()) {
                        CharacterStyle characterStyle = (CharacterStyle) i.next();
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence = spannableString;
                    }
                }
            }
            this.f3010h = charSequence;
        }
        return charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (L0.h.f(r2, N0.e.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float c() {
        if (!Float.isNaN(this.f3007d)) {
            return this.f3007d;
        }
        BoringLayout.Metrics a5 = a();
        float f = a5 != null ? a5.width : -1;
        TextPaint textPaint = this.f3005b;
        if (f < 0.0f) {
            f = (float) Math.ceil(Layout.getDesiredWidth(b(), 0, b().length(), textPaint));
        }
        if (f != 0.0f) {
            CharSequence charSequence = this.f3004a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!h.f(spanned, N0.f.class)) {
                }
                f += 0.5f;
            }
        }
        this.f3007d = f;
        return f;
    }
}
