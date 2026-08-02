package A0;

import java.text.BreakIterator;

/* renamed from: A0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018d extends AbstractC0015c {

    /* renamed from: e, reason: collision with root package name */
    public static C0018d f479e;
    public static C0018d f;

    /* renamed from: g, reason: collision with root package name */
    public static C0018d f480g;

    /* renamed from: h, reason: collision with root package name */
    public static final V0.j f481h = V0.j.f5941l;
    public static final V0.j i = V0.j.f5940k;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f482c;

    /* renamed from: d, reason: collision with root package name */
    public Object f483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0018d(int i5) {
        super(0);
        this.f482c = i5;
    }

    @Override // A0.AbstractC0015c
    public final int[] a(int i5) {
        int i6;
        switch (this.f482c) {
            case 0:
                int length = e().length();
                if (length <= 0 || i5 >= length) {
                    return null;
                }
                if (i5 < 0) {
                    i5 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f483d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.l.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i5)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f483d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.l.k("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i5);
                        if (following == -1) {
                            return null;
                        }
                        return b(i5, following);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f483d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.l.k("impl");
                        throw null;
                    }
                    i5 = breakIterator3.following(i5);
                } while (i5 != -1);
                return null;
            case 1:
                if (e().length() <= 0 || i5 >= e().length()) {
                    return null;
                }
                if (i5 < 0) {
                    i5 = 0;
                }
                while (!t(i5) && (!t(i5) || (i5 != 0 && t(i5 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f483d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.l.k("impl");
                        throw null;
                    }
                    i5 = breakIterator4.following(i5);
                    if (i5 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f483d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.l.k("impl");
                    throw null;
                }
                int following2 = breakIterator5.following(i5);
                if (following2 == -1 || !s(following2)) {
                    return null;
                }
                return b(i5, following2);
            default:
                if (e().length() <= 0 || i5 >= e().length()) {
                    return null;
                }
                V0.j jVar = f481h;
                if (i5 < 0) {
                    K0.L l5 = (K0.L) this.f483d;
                    if (l5 == null) {
                        kotlin.jvm.internal.l.k("layoutResult");
                        throw null;
                    }
                    i6 = l5.e(0);
                } else {
                    K0.L l6 = (K0.L) this.f483d;
                    if (l6 == null) {
                        kotlin.jvm.internal.l.k("layoutResult");
                        throw null;
                    }
                    int e3 = l6.e(i5);
                    i6 = q(e3, jVar) == i5 ? e3 : e3 + 1;
                }
                K0.L l7 = (K0.L) this.f483d;
                if (l7 == null) {
                    kotlin.jvm.internal.l.k("layoutResult");
                    throw null;
                }
                if (i6 >= l7.f2793b.f) {
                    return null;
                }
                return b(q(i6, jVar), q(i6, i) + 1);
        }
    }

    @Override // A0.AbstractC0015c
    public final int[] k(int i5) {
        int i6;
        switch (this.f482c) {
            case 0:
                int length = e().length();
                if (length <= 0 || i5 <= 0) {
                    return null;
                }
                if (i5 > length) {
                    i5 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f483d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.l.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i5)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f483d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.l.k("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i5);
                        if (preceding == -1) {
                            return null;
                        }
                        return b(preceding, i5);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f483d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.l.k("impl");
                        throw null;
                    }
                    i5 = breakIterator3.preceding(i5);
                } while (i5 != -1);
                return null;
            case 1:
                int length2 = e().length();
                if (length2 <= 0 || i5 <= 0) {
                    return null;
                }
                if (i5 > length2) {
                    i5 = length2;
                }
                while (i5 > 0 && !t(i5 - 1) && !s(i5)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f483d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.l.k("impl");
                        throw null;
                    }
                    i5 = breakIterator4.preceding(i5);
                    if (i5 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f483d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.l.k("impl");
                    throw null;
                }
                int preceding2 = breakIterator5.preceding(i5);
                if (preceding2 == -1 || !t(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !t(preceding2 - 1)) {
                    return b(preceding2, i5);
                }
                return null;
            default:
                if (e().length() <= 0 || i5 <= 0) {
                    return null;
                }
                int length3 = e().length();
                V0.j jVar = i;
                if (i5 > length3) {
                    K0.L l5 = (K0.L) this.f483d;
                    if (l5 == null) {
                        kotlin.jvm.internal.l.k("layoutResult");
                        throw null;
                    }
                    i6 = l5.e(e().length());
                } else {
                    K0.L l6 = (K0.L) this.f483d;
                    if (l6 == null) {
                        kotlin.jvm.internal.l.k("layoutResult");
                        throw null;
                    }
                    int e3 = l6.e(i5);
                    i6 = q(e3, jVar) + 1 == i5 ? e3 : e3 - 1;
                }
                if (i6 < 0) {
                    return null;
                }
                return b(q(i6, f481h), q(i6, jVar) + 1);
        }
    }

    public int q(int i5, V0.j jVar) {
        K0.L l5 = (K0.L) this.f483d;
        if (l5 == null) {
            kotlin.jvm.internal.l.k("layoutResult");
            throw null;
        }
        int h3 = l5.h(i5);
        K0.L l6 = (K0.L) this.f483d;
        if (l6 == null) {
            kotlin.jvm.internal.l.k("layoutResult");
            throw null;
        }
        if (jVar != l6.i(h3)) {
            K0.L l7 = (K0.L) this.f483d;
            if (l7 != null) {
                return l7.h(i5);
            }
            kotlin.jvm.internal.l.k("layoutResult");
            throw null;
        }
        if (((K0.L) this.f483d) != null) {
            return r6.d(i5, false) - 1;
        }
        kotlin.jvm.internal.l.k("layoutResult");
        throw null;
    }

    public void r(String str) {
        switch (this.f482c) {
            case 0:
                this.f474a = str;
                BreakIterator breakIterator = (BreakIterator) this.f483d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.l.k("impl");
                    throw null;
                }
            default:
                this.f474a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f483d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.l.k("impl");
                    throw null;
                }
        }
    }

    public boolean s(int i5) {
        if (i5 <= 0 || !t(i5 - 1)) {
            return false;
        }
        return i5 == e().length() || !t(i5);
    }

    public boolean t(int i5) {
        if (i5 < 0 || i5 >= e().length()) {
            return false;
        }
        return Character.isLetterOrDigit(e().codePointAt(i5));
    }
}
