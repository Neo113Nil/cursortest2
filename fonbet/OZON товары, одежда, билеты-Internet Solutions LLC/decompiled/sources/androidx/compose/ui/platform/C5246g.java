package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5246g extends AbstractC5231b {

    /* renamed from: d, reason: collision with root package name */
    private static C5246g f40876d;

    /* renamed from: c, reason: collision with root package name */
    private BreakIterator f40877c;

    /* renamed from: androidx.compose.ui.platform.g$a */
    public static final class a {
        @NotNull
        public static C5246g a(@NotNull Locale locale) {
            if (C5246g.f40876d == null) {
                C5246g.f40876d = new C5246g(locale);
            }
            C5246g c5246g = C5246g.f40876d;
            Intrinsics.g(c5246g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return c5246g;
        }
    }

    public C5246g(Locale locale) {
        this.f40877c = BreakIterator.getWordInstance(locale);
    }

    private final boolean h(int i11) {
        if (i11 <= 0 || !i(i11 - 1)) {
            return false;
        }
        return i11 == c().length() || !i(i11);
    }

    private final boolean i(int i11) {
        if (i11 < 0 || i11 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i11));
    }

    @Override // androidx.compose.ui.platform.AbstractC5231b
    public final int[] a(int i11) {
        if (c().length() > 0 && i11 < c().length()) {
            if (i11 < 0) {
                i11 = 0;
            }
            while (!i(i11) && (!i(i11) || (i11 != 0 && i(i11 - 1)))) {
                BreakIterator breakIterator = this.f40877c;
                if (breakIterator == null) {
                    Intrinsics.n("impl");
                    throw null;
                }
                i11 = breakIterator.following(i11);
                if (i11 == -1) {
                    break;
                }
            }
            BreakIterator breakIterator2 = this.f40877c;
            if (breakIterator2 == null) {
                Intrinsics.n("impl");
                throw null;
            }
            int following = breakIterator2.following(i11);
            if (following != -1 && h(following)) {
                return b(i11, following);
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractC5231b
    public final void d(@NotNull String str) {
        this.f40816a = str;
        BreakIterator breakIterator = this.f40877c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            Intrinsics.n("impl");
            throw null;
        }
    }

    @Override // androidx.compose.ui.platform.AbstractC5231b
    public final int[] e(int i11) {
        int length = c().length();
        if (length > 0 && i11 > 0) {
            if (i11 > length) {
                i11 = length;
            }
            while (i11 > 0 && !i(i11 - 1) && !h(i11)) {
                BreakIterator breakIterator = this.f40877c;
                if (breakIterator == null) {
                    Intrinsics.n("impl");
                    throw null;
                }
                i11 = breakIterator.preceding(i11);
                if (i11 == -1) {
                    break;
                }
            }
            BreakIterator breakIterator2 = this.f40877c;
            if (breakIterator2 == null) {
                Intrinsics.n("impl");
                throw null;
            }
            int preceding = breakIterator2.preceding(i11);
            if (preceding != -1 && i(preceding) && (preceding == 0 || !i(preceding - 1))) {
                return b(preceding, i11);
            }
        }
        return null;
    }
}
