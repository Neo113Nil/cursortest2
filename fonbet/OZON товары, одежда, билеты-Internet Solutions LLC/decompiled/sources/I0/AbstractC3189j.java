package I0;

import B0.C2456a1;
import B0.C2459b1;
import I0.AbstractC3189j;
import K1.C3422b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: I0.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC3189j<T extends AbstractC3189j<T>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3422b f11542a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11543b;

    /* renamed from: c, reason: collision with root package name */
    private final K1.K f11544c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Q1.D f11545d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final i1 f11546e;

    /* renamed from: f, reason: collision with root package name */
    private long f11547f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private C3422b f11548g;

    public AbstractC3189j(C3422b c3422b, long j11, K1.K k11, Q1.D d11, i1 i1Var) {
        this.f11542a = c3422b;
        this.f11543b = j11;
        this.f11544c = k11;
        this.f11545d = d11;
        this.f11546e = i1Var;
        this.f11547f = j11;
        this.f11548g = c3422b;
    }

    private final int G() {
        long j11 = this.f11547f;
        int i11 = K1.Q.f15010c;
        return this.f11545d.originalToTransformed((int) (j11 & 4294967295L));
    }

    private final boolean n() {
        K1.K k11 = this.f11544c;
        return (k11 != null ? k11.x(G()) : null) != V1.g.Rtl;
    }

    private final int o(K1.K k11, int i11) {
        int G11 = G();
        i1 i1Var = this.f11546e;
        if (i1Var.a() == null) {
            i1Var.c(Float.valueOf(k11.e(G11).n()));
        }
        int p11 = k11.p(G11) + i11;
        if (p11 < 0) {
            return 0;
        }
        if (p11 >= k11.m()) {
            return this.f11548g.h().length();
        }
        float l11 = k11.l(p11) - 1;
        Float a11 = i1Var.a();
        Intrinsics.f(a11);
        float floatValue = a11.floatValue();
        if ((n() && floatValue >= k11.s(p11)) || (!n() && floatValue <= k11.r(p11))) {
            return k11.n(p11);
        }
        return this.f11545d.transformedToOriginal(k11.w(P9.a.a(a11.floatValue(), l11)));
    }

    @NotNull
    public final void A() {
        this.f11546e.b();
        if (this.f11548g.h().length() > 0) {
            if (n()) {
                y();
            } else {
                B();
            }
        }
    }

    @NotNull
    public final void B() {
        Integer f7;
        this.f11546e.b();
        if (this.f11548g.h().length() <= 0 || (f7 = f()) == null) {
            return;
        }
        int intValue = f7.intValue();
        F(intValue, intValue);
    }

    @NotNull
    public final void C() {
        K1.K k11;
        if (this.f11548g.h().length() <= 0 || (k11 = this.f11544c) == null) {
            return;
        }
        int o11 = o(k11, -1);
        F(o11, o11);
    }

    @NotNull
    public final void D() {
        this.f11546e.b();
        C3422b c3422b = this.f11548g;
        if (c3422b.h().length() > 0) {
            F(0, c3422b.h().length());
        }
    }

    @NotNull
    public final void E() {
        if (this.f11548g.h().length() > 0) {
            int i11 = K1.Q.f15010c;
            this.f11547f = K1.S.a((int) (this.f11543b >> 32), (int) (this.f11547f & 4294967295L));
        }
    }

    protected final void F(int i11, int i12) {
        this.f11547f = K1.S.a(i11, i12);
    }

    @NotNull
    public final void a(@NotNull Function1 function1) {
        this.f11546e.b();
        if (this.f11548g.h().length() > 0) {
            if (K1.Q.e(this.f11547f)) {
                function1.invoke(this);
            } else if (n()) {
                int h11 = K1.Q.h(this.f11547f);
                F(h11, h11);
            } else {
                int g10 = K1.Q.g(this.f11547f);
                F(g10, g10);
            }
        }
    }

    @NotNull
    public final void b(@NotNull Function1 function1) {
        this.f11546e.b();
        if (this.f11548g.h().length() > 0) {
            if (K1.Q.e(this.f11547f)) {
                function1.invoke(this);
            } else if (n()) {
                int g10 = K1.Q.g(this.f11547f);
                F(g10, g10);
            } else {
                int h11 = K1.Q.h(this.f11547f);
                F(h11, h11);
            }
        }
    }

    @NotNull
    public final void c() {
        this.f11546e.b();
        if (this.f11548g.h().length() > 0) {
            long j11 = this.f11547f;
            int i11 = K1.Q.f15010c;
            int i12 = (int) (j11 & 4294967295L);
            F(i12, i12);
        }
    }

    @NotNull
    public final C3422b d() {
        return this.f11548g;
    }

    public final Integer e() {
        K1.K k11 = this.f11544c;
        if (k11 == null) {
            return null;
        }
        int g10 = K1.Q.g(this.f11547f);
        Q1.D d11 = this.f11545d;
        return Integer.valueOf(d11.transformedToOriginal(k11.n(k11.p(d11.originalToTransformed(g10)))));
    }

    public final Integer f() {
        K1.K k11 = this.f11544c;
        if (k11 == null) {
            return null;
        }
        int h11 = K1.Q.h(this.f11547f);
        Q1.D d11 = this.f11545d;
        return Integer.valueOf(d11.transformedToOriginal(k11.t(k11.p(d11.originalToTransformed(h11)))));
    }

    public final int g() {
        String h11 = this.f11548g.h();
        long j11 = this.f11547f;
        int i11 = K1.Q.f15010c;
        return C2459b1.a((int) (j11 & 4294967295L), h11);
    }

    public final Integer h() {
        int length;
        K1.K k11 = this.f11544c;
        if (k11 == null) {
            return null;
        }
        int G11 = G();
        while (true) {
            C3422b c3422b = this.f11542a;
            if (G11 < c3422b.length()) {
                int length2 = this.f11548g.h().length() - 1;
                if (G11 <= length2) {
                    length2 = G11;
                }
                long B11 = k11.B(length2);
                int i11 = K1.Q.f15010c;
                int i12 = (int) (B11 & 4294967295L);
                if (i12 > G11) {
                    length = this.f11545d.transformedToOriginal(i12);
                    break;
                }
                G11++;
            } else {
                length = c3422b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    @NotNull
    public final Q1.D i() {
        return this.f11545d;
    }

    public final int j() {
        String h11 = this.f11548g.h();
        long j11 = this.f11547f;
        int i11 = K1.Q.f15010c;
        return C2459b1.b((int) (j11 & 4294967295L), h11);
    }

    public final Integer k() {
        int i11;
        K1.K k11 = this.f11544c;
        if (k11 == null) {
            return null;
        }
        int G11 = G();
        while (true) {
            if (G11 <= 0) {
                i11 = 0;
                break;
            }
            int length = this.f11548g.h().length() - 1;
            if (G11 <= length) {
                length = G11;
            }
            long B11 = k11.B(length);
            int i12 = K1.Q.f15010c;
            int i13 = (int) (B11 >> 32);
            if (i13 < G11) {
                i11 = this.f11545d.transformedToOriginal(i13);
                break;
            }
            G11--;
        }
        return Integer.valueOf(i11);
    }

    public final long l() {
        return this.f11547f;
    }

    @NotNull
    public final String m() {
        return this.f11548g.h();
    }

    @NotNull
    public final void p() {
        K1.K k11;
        if (this.f11548g.h().length() <= 0 || (k11 = this.f11544c) == null) {
            return;
        }
        int o11 = o(k11, 1);
        F(o11, o11);
    }

    @NotNull
    public final void q() {
        int g10;
        int j11;
        i1 i1Var = this.f11546e;
        i1Var.b();
        if (this.f11548g.h().length() > 0) {
            if (n()) {
                i1Var.b();
                if (this.f11548g.h().length() <= 0 || (j11 = j()) == -1) {
                    return;
                }
                F(j11, j11);
                return;
            }
            i1Var.b();
            if (this.f11548g.h().length() <= 0 || (g10 = g()) == -1) {
                return;
            }
            F(g10, g10);
        }
    }

    @NotNull
    public final void r() {
        Integer h11;
        Integer k11;
        i1 i1Var = this.f11546e;
        i1Var.b();
        if (this.f11548g.h().length() > 0) {
            if (n()) {
                i1Var.b();
                if (this.f11548g.h().length() <= 0 || (k11 = k()) == null) {
                    return;
                }
                int intValue = k11.intValue();
                F(intValue, intValue);
                return;
            }
            i1Var.b();
            if (this.f11548g.h().length() <= 0 || (h11 = h()) == null) {
                return;
            }
            int intValue2 = h11.intValue();
            F(intValue2, intValue2);
        }
    }

    @NotNull
    public final void s() {
        this.f11546e.b();
        C3422b c3422b = this.f11548g;
        if (c3422b.h().length() > 0) {
            int a11 = C2456a1.a(K1.Q.g(this.f11547f), c3422b.h());
            if (a11 == K1.Q.g(this.f11547f) && a11 != c3422b.h().length()) {
                a11 = C2456a1.a(a11 + 1, c3422b.h());
            }
            F(a11, a11);
        }
    }

    @NotNull
    public final void t() {
        this.f11546e.b();
        C3422b c3422b = this.f11548g;
        if (c3422b.h().length() > 0) {
            int b11 = C2456a1.b(K1.Q.h(this.f11547f), c3422b.h());
            if (b11 == K1.Q.h(this.f11547f) && b11 != 0) {
                b11 = C2456a1.b(b11 - 1, c3422b.h());
            }
            F(b11, b11);
        }
    }

    @NotNull
    public final void u() {
        int j11;
        int g10;
        i1 i1Var = this.f11546e;
        i1Var.b();
        if (this.f11548g.h().length() > 0) {
            if (n()) {
                i1Var.b();
                if (this.f11548g.h().length() <= 0 || (g10 = g()) == -1) {
                    return;
                }
                F(g10, g10);
                return;
            }
            i1Var.b();
            if (this.f11548g.h().length() <= 0 || (j11 = j()) == -1) {
                return;
            }
            F(j11, j11);
        }
    }

    @NotNull
    public final void v() {
        Integer k11;
        Integer h11;
        i1 i1Var = this.f11546e;
        i1Var.b();
        if (this.f11548g.h().length() > 0) {
            if (n()) {
                i1Var.b();
                if (this.f11548g.h().length() <= 0 || (h11 = h()) == null) {
                    return;
                }
                int intValue = h11.intValue();
                F(intValue, intValue);
                return;
            }
            i1Var.b();
            if (this.f11548g.h().length() <= 0 || (k11 = k()) == null) {
                return;
            }
            int intValue2 = k11.intValue();
            F(intValue2, intValue2);
        }
    }

    @NotNull
    public final void w() {
        this.f11546e.b();
        C3422b c3422b = this.f11548g;
        if (c3422b.h().length() > 0) {
            int length = c3422b.h().length();
            F(length, length);
        }
    }

    @NotNull
    public final void x() {
        this.f11546e.b();
        if (this.f11548g.h().length() > 0) {
            F(0, 0);
        }
    }

    @NotNull
    public final void y() {
        Integer e11;
        this.f11546e.b();
        if (this.f11548g.h().length() <= 0 || (e11 = e()) == null) {
            return;
        }
        int intValue = e11.intValue();
        F(intValue, intValue);
    }

    @NotNull
    public final void z() {
        this.f11546e.b();
        if (this.f11548g.h().length() > 0) {
            if (n()) {
                B();
            } else {
                y();
            }
        }
    }
}
