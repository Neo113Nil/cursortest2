package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Spannable f42207a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final b f42208b;

    /* renamed from: c, reason: collision with root package name */
    private final PrecomputedText f42209c;

    /* loaded from: classes8.dex */
    static class a {
        static Spannable a(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }

    private g(@NonNull CharSequence charSequence, @NonNull b bVar) {
        this.f42207a = new SpannableString(charSequence);
        this.f42208b = bVar;
        this.f42209c = null;
    }

    @SuppressLint({"WrongConstant"})
    public static g a(@NonNull CharSequence charSequence, @NonNull b bVar) {
        PrecomputedText.Params params;
        PrecomputedText create;
        charSequence.getClass();
        if (Build.VERSION.SDK_INT >= 29 && (params = bVar.f42214e) != null) {
            create = PrecomputedText.create(charSequence, params);
            return new g(create, bVar);
        }
        ArrayList arrayList = new ArrayList();
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length) {
            int indexOf = TextUtils.indexOf(charSequence, '\n', i11, length);
            i11 = indexOf < 0 ? length : indexOf + 1;
            arrayList.add(Integer.valueOf(i11));
        }
        int[] iArr = new int[arrayList.size()];
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            iArr[i12] = ((Integer) arrayList.get(i12)).intValue();
        }
        StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), bVar.e(), Integer.MAX_VALUE).setBreakStrategy(bVar.b()).setHyphenationFrequency(bVar.c()).setTextDirection(bVar.d()).build();
        return new g(charSequence, bVar);
    }

    @NonNull
    public final b b() {
        return this.f42208b;
    }

    public final PrecomputedText c() {
        Spannable spannable = this.f42207a;
        if (G4.d.c(spannable)) {
            return d.a(spannable);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i11) {
        return this.f42207a.charAt(i11);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f42207a.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f42207a.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f42207a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i11, int i12, Class<T> cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT < 29) {
            return (T[]) this.f42207a.getSpans(i11, i12, cls);
        }
        spans = this.f42209c.getSpans(i11, i12, cls);
        return (T[]) spans;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f42207a.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i11, int i12, Class cls) {
        return this.f42207a.nextSpanTransition(i11, i12, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f42209c.removeSpan(obj);
        } else {
            this.f42207a.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i11, int i12, int i13) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f42209c.setSpan(obj, i11, i12, i13);
        } else {
            this.f42207a.setSpan(obj, i11, i12, i13);
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i11, int i12) {
        return this.f42207a.subSequence(i11, i12);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final String toString() {
        return this.f42207a.toString();
    }

    private g(@NonNull PrecomputedText precomputedText, @NonNull b bVar) {
        this.f42207a = a.a(precomputedText);
        this.f42208b = bVar;
        this.f42209c = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final TextPaint f42210a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f42211b;

        /* renamed from: c, reason: collision with root package name */
        private final int f42212c;

        /* renamed from: d, reason: collision with root package name */
        private final int f42213d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f42214e;

        /* loaded from: classes8.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            @NonNull
            private final TextPaint f42215a;

            /* renamed from: c, reason: collision with root package name */
            private int f42217c = 1;

            /* renamed from: d, reason: collision with root package name */
            private int f42218d = 1;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f42216b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public a(@NonNull TextPaint textPaint) {
                this.f42215a = textPaint;
            }

            @NonNull
            public final b a() {
                return new b(this.f42215a, this.f42216b, this.f42217c, this.f42218d);
            }

            public final void b(int i11) {
                this.f42217c = i11;
            }

            public final void c(int i11) {
                this.f42218d = i11;
            }

            public final void d(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
                this.f42216b = textDirectionHeuristic;
            }
        }

        b(@NonNull TextPaint textPaint, @NonNull TextDirectionHeuristic textDirectionHeuristic, int i11, int i12) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = Lk0.a.a(textPaint).setBreakStrategy(i11);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i12);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f42214e = build;
            } else {
                this.f42214e = null;
            }
            this.f42210a = textPaint;
            this.f42211b = textDirectionHeuristic;
            this.f42212c = i11;
            this.f42213d = i12;
        }

        public final boolean a(@NonNull b bVar) {
            if (this.f42212c != bVar.f42212c || this.f42213d != bVar.f42213d) {
                return false;
            }
            TextPaint textPaint = this.f42210a;
            if (textPaint.getTextSize() != bVar.f42210a.getTextSize()) {
                return false;
            }
            float textScaleX = textPaint.getTextScaleX();
            TextPaint textPaint2 = bVar.f42210a;
            if (textScaleX == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                return textPaint.getTypeface() == null ? textPaint2.getTypeface() == null : textPaint.getTypeface().equals(textPaint2.getTypeface());
            }
            return false;
        }

        public final int b() {
            return this.f42212c;
        }

        public final int c() {
            return this.f42213d;
        }

        public final TextDirectionHeuristic d() {
            return this.f42211b;
        }

        @NonNull
        public final TextPaint e() {
            return this.f42210a;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return a(bVar) && this.f42211b == bVar.f42211b;
        }

        public final int hashCode() {
            TextPaint textPaint = this.f42210a;
            return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f42211b, Integer.valueOf(this.f42212c), Integer.valueOf(this.f42213d));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder sb3 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f42210a;
            sb3.append(textPaint.getTextSize());
            sb2.append(sb3.toString());
            sb2.append(", textScaleX=" + textPaint.getTextScaleX());
            sb2.append(", textSkewX=" + textPaint.getTextSkewX());
            sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            sb2.append(", textLocale=" + textPaint.getTextLocales());
            sb2.append(", typeface=" + textPaint.getTypeface());
            sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
            sb2.append(", textDir=" + this.f42211b);
            sb2.append(", breakStrategy=" + this.f42212c);
            sb2.append(", hyphenationFrequency=" + this.f42213d);
            sb2.append("}");
            return sb2.toString();
        }

        public b(@NonNull PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f42210a = textPaint;
            textDirection = params.getTextDirection();
            this.f42211b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f42212c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f42213d = hyphenationFrequency;
            this.f42214e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
