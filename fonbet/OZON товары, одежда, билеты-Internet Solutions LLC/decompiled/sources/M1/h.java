package M1;

import Am.C2438a;
import L1.C3559x;
import java.text.BreakIterator;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CharSequence f17236a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17237b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17238c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final BreakIterator f17239d;

    public static final class a {
        public static boolean a(int i11) {
            int type = Character.getType(i11);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public h(@NotNull CharSequence charSequence, int i11, Locale locale) {
        this.f17236a = charSequence;
        if (charSequence.length() < 0) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i11 < 0 || i11 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f17239d = wordInstance;
        this.f17237b = Math.max(0, -50);
        this.f17238c = Math.min(charSequence.length(), i11 + 50);
        wordInstance.setText(new C3559x(i11, charSequence));
    }

    private final void a(int i11) {
        int i12 = this.f17237b;
        int i13 = this.f17238c;
        if (i11 > i13 || i12 > i11) {
            throw new IllegalArgumentException(Ek.a.d(C2438a.a("Invalid offset: ", i11, ". Valid range is [", " , ", i12), i13, ']').toString());
        }
    }

    private final boolean f(int i11) {
        return i11 <= this.f17238c && this.f17237b + 1 <= i11 && Character.isLetterOrDigit(Character.codePointBefore(this.f17236a, i11));
    }

    private final boolean h(int i11) {
        return i11 < this.f17238c && this.f17237b <= i11 && Character.isLetterOrDigit(Character.codePointAt(this.f17236a, i11));
    }

    public final int b(int i11) {
        a(i11);
        boolean f7 = f(i11);
        BreakIterator breakIterator = this.f17239d;
        if (f7) {
            return (!breakIterator.isBoundary(i11) || h(i11)) ? breakIterator.following(i11) : i11;
        }
        if (h(i11)) {
            return breakIterator.following(i11);
        }
        return -1;
    }

    public final int c(int i11) {
        a(i11);
        boolean h11 = h(i11);
        BreakIterator breakIterator = this.f17239d;
        if (h11) {
            return (!breakIterator.isBoundary(i11) || f(i11)) ? breakIterator.preceding(i11) : i11;
        }
        if (f(i11)) {
            return breakIterator.preceding(i11);
        }
        return -1;
    }

    public final int d(int i11) {
        a(i11);
        while (i11 != -1) {
            if (i(i11) && !g(i11)) {
                return i11;
            }
            i11 = k(i11);
        }
        return i11;
    }

    public final int e(int i11) {
        a(i11);
        while (i11 != -1) {
            if (!i(i11) && g(i11)) {
                return i11;
            }
            i11 = j(i11);
        }
        return i11;
    }

    public final boolean g(int i11) {
        int i12 = this.f17237b + 1;
        if (i11 > this.f17238c || i12 > i11) {
            return false;
        }
        return a.a(Character.codePointBefore(this.f17236a, i11));
    }

    public final boolean i(int i11) {
        if (i11 >= this.f17238c || this.f17237b > i11) {
            return false;
        }
        return a.a(Character.codePointAt(this.f17236a, i11));
    }

    public final int j(int i11) {
        a(i11);
        return this.f17239d.following(i11);
    }

    public final int k(int i11) {
        a(i11);
        return this.f17239d.preceding(i11);
    }
}
