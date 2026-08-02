package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5234c extends AbstractC5231b {

    /* renamed from: d, reason: collision with root package name */
    private static C5234c f40820d;

    /* renamed from: c, reason: collision with root package name */
    private BreakIterator f40821c;

    /* renamed from: androidx.compose.ui.platform.c$a */
    public static final class a {
        @NotNull
        public static C5234c a(@NotNull Locale locale) {
            if (C5234c.f40820d == null) {
                C5234c.f40820d = new C5234c(locale);
            }
            C5234c c5234c = C5234c.f40820d;
            Intrinsics.g(c5234c, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return c5234c;
        }
    }

    public C5234c(Locale locale) {
        this.f40821c = BreakIterator.getCharacterInstance(locale);
    }

    @Override // androidx.compose.ui.platform.AbstractC5231b
    public final int[] a(int i11) {
        int length = c().length();
        if (length <= 0 || i11 >= length) {
            return null;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        do {
            BreakIterator breakIterator = this.f40821c;
            if (breakIterator == null) {
                Intrinsics.n("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i11)) {
                BreakIterator breakIterator2 = this.f40821c;
                if (breakIterator2 == null) {
                    Intrinsics.n("impl");
                    throw null;
                }
                int following = breakIterator2.following(i11);
                if (following == -1) {
                    return null;
                }
                return b(i11, following);
            }
            BreakIterator breakIterator3 = this.f40821c;
            if (breakIterator3 == null) {
                Intrinsics.n("impl");
                throw null;
            }
            i11 = breakIterator3.following(i11);
        } while (i11 != -1);
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractC5231b
    public final void d(@NotNull String str) {
        this.f40816a = str;
        BreakIterator breakIterator = this.f40821c;
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
        if (length <= 0 || i11 <= 0) {
            return null;
        }
        if (i11 > length) {
            i11 = length;
        }
        do {
            BreakIterator breakIterator = this.f40821c;
            if (breakIterator == null) {
                Intrinsics.n("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i11)) {
                BreakIterator breakIterator2 = this.f40821c;
                if (breakIterator2 == null) {
                    Intrinsics.n("impl");
                    throw null;
                }
                int preceding = breakIterator2.preceding(i11);
                if (preceding == -1) {
                    return null;
                }
                return b(preceding, i11);
            }
            BreakIterator breakIterator3 = this.f40821c;
            if (breakIterator3 == null) {
                Intrinsics.n("impl");
                throw null;
            }
            i11 = breakIterator3.preceding(i11);
        } while (i11 != -1);
        return null;
    }
}
