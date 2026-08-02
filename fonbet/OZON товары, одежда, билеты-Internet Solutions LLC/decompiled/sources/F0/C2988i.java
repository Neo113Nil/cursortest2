package F0;

import B0.C2456a1;
import B0.C2459b1;
import E0.c1;
import K1.Q;
import K1.S;
import c1.AbstractC5715f;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: F0.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2988i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c1 f8242a;

    /* renamed from: b, reason: collision with root package name */
    private final K1.K f8243b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8244c;

    /* renamed from: d, reason: collision with root package name */
    private final float f8245d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2989j f8246e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final D0.a f8247f;

    /* renamed from: g, reason: collision with root package name */
    private long f8248g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f8249h;

    public C2988i(@NotNull c1 c1Var, K1.K k11, boolean z11, float f7, @NotNull C2989j c2989j) {
        this.f8242a = c1Var;
        this.f8243b = k11;
        this.f8244c = z11;
        this.f8245d = f7;
        this.f8246e = c2989j;
        AbstractC5715f a11 = AbstractC5715f.a.a();
        Function1<Object, Unit> h11 = a11 != null ? a11.h() : null;
        AbstractC5715f b11 = AbstractC5715f.a.b(a11);
        try {
            D0.a j11 = c1Var.j();
            AbstractC5715f.a.d(a11, b11, h11);
            this.f8247f = j11;
            this.f8248g = j11.d();
            this.f8249h = j11.toString();
        } catch (Throwable th2) {
            AbstractC5715f.a.d(a11, b11, h11);
            throw th2;
        }
    }

    private final void K(int i11) {
        this.f8248g = S.a(i11, i11);
    }

    private final boolean n() {
        K1.K k11 = this.f8243b;
        if (k11 == null) {
            return true;
        }
        long j11 = this.f8248g;
        int i11 = Q.f15010c;
        V1.g x11 = k11.x((int) (j11 & 4294967295L));
        return x11 == null || x11 == V1.g.Ltr;
    }

    private final int o(K1.K k11, int i11) {
        long j11 = this.f8248g;
        int i12 = Q.f15010c;
        int i13 = (int) (j11 & 4294967295L);
        C2989j c2989j = this.f8246e;
        if (Float.isNaN(c2989j.a())) {
            c2989j.c(k11.e(i13).n());
        }
        int p11 = k11.p(i13) + i11;
        if (p11 < 0) {
            return 0;
        }
        if (p11 >= k11.m()) {
            return this.f8249h.length();
        }
        float l11 = k11.l(p11) - 1;
        float a11 = c2989j.a();
        return ((!n() || a11 < k11.s(p11)) && (n() || a11 > k11.r(p11))) ? k11.w(P9.a.a(a11, l11)) : k11.n(p11);
    }

    private final int p(int i11) {
        long d11 = this.f8247f.d();
        int i12 = Q.f15010c;
        int i13 = (int) (d11 & 4294967295L);
        K1.K k11 = this.f8243b;
        if (k11 != null) {
            float f7 = this.f8245d;
            if (!Float.isNaN(f7)) {
                C7460f z11 = k11.e(i13).z(0.0f, f7 * i11);
                float l11 = k11.l(k11.q(z11.q()));
                return Math.abs(z11.q() - l11) > Math.abs(z11.h() - l11) ? k11.w(z11.s()) : k11.w(z11.j());
            }
        }
        return i13;
    }

    private final void u() {
        this.f8246e.b();
        String str = this.f8249h;
        if (str.length() > 0) {
            long j11 = this.f8248g;
            int i11 = Q.f15010c;
            int i12 = (int) (j11 & 4294967295L);
            int a11 = O.a(str, i12, true, this.f8242a);
            if (a11 != i12) {
                K(a11);
            }
        }
    }

    private final void w() {
        this.f8246e.b();
        String str = this.f8249h;
        if (str.length() > 0) {
            long j11 = this.f8248g;
            int i11 = Q.f15010c;
            int i12 = (int) (j11 & 4294967295L);
            int a11 = O.a(str, i12, false, this.f8242a);
            if (a11 != i12) {
                K(a11);
            }
        }
    }

    @NotNull
    public final void A() {
        this.f8246e.b();
        String str = this.f8249h;
        if (str.length() > 0) {
            K(str.length());
        }
    }

    @NotNull
    public final void B() {
        this.f8246e.b();
        if (this.f8249h.length() > 0) {
            K(0);
        }
    }

    @NotNull
    public final void C() {
        this.f8246e.b();
        if (this.f8249h.length() > 0) {
            K(g());
        }
    }

    @NotNull
    public final void D() {
        this.f8246e.b();
        if (this.f8249h.length() > 0) {
            if (n()) {
                F();
            } else {
                C();
            }
        }
    }

    @NotNull
    public final void E() {
        this.f8246e.b();
        if (this.f8249h.length() > 0) {
            if (n()) {
                C();
            } else {
                F();
            }
        }
    }

    @NotNull
    public final void F() {
        this.f8246e.b();
        if (this.f8249h.length() > 0) {
            K(h());
        }
    }

    @NotNull
    public final void G() {
        K1.K k11 = this.f8243b;
        if (k11 != null && this.f8249h.length() > 0) {
            K(o(k11, -1));
        }
    }

    @NotNull
    public final void H() {
        if (this.f8249h.length() > 0) {
            K(p(-1));
        }
    }

    @NotNull
    public final void I() {
        this.f8246e.b();
        String str = this.f8249h;
        if (str.length() > 0) {
            this.f8248g = S.a(0, str.length());
        }
    }

    @NotNull
    public final void J() {
        if (this.f8249h.length() > 0) {
            long d11 = this.f8247f.d();
            int i11 = Q.f15010c;
            this.f8248g = S.a((int) (d11 >> 32), (int) (this.f8248g & 4294967295L));
        }
    }

    @NotNull
    public final void c(@NotNull Function1 function1) {
        this.f8246e.b();
        if (this.f8249h.length() > 0) {
            if (Q.e(this.f8248g)) {
                function1.invoke(this);
            } else if (n()) {
                K(Q.h(this.f8248g));
            } else {
                K(Q.g(this.f8248g));
            }
        }
    }

    @NotNull
    public final void d(@NotNull Function1 function1) {
        this.f8246e.b();
        if (this.f8249h.length() > 0) {
            if (Q.e(this.f8248g)) {
                function1.invoke(this);
            } else if (n()) {
                K(Q.g(this.f8248g));
            } else {
                K(Q.h(this.f8248g));
            }
        }
    }

    @NotNull
    public final void e() {
        this.f8246e.b();
        if (this.f8249h.length() > 0) {
            long j11 = this.f8248g;
            int i11 = Q.f15010c;
            K((int) (j11 & 4294967295L));
        }
    }

    @NotNull
    public final D0.a f() {
        return this.f8247f;
    }

    public final int g() {
        K1.K k11 = this.f8243b;
        return k11 != null ? k11.n(k11.p(Q.g(this.f8248g))) : this.f8249h.length();
    }

    public final int h() {
        K1.K k11 = this.f8243b;
        if (k11 != null) {
            return k11.t(k11.p(Q.h(this.f8248g)));
        }
        return 0;
    }

    public final int i() {
        long j11 = this.f8248g;
        int i11 = Q.f15010c;
        return C2459b1.a((int) (j11 & 4294967295L), this.f8249h);
    }

    public final int j() {
        String str = this.f8249h;
        K1.K k11 = this.f8243b;
        if (k11 == null) {
            return str.length();
        }
        long j11 = this.f8248g;
        int i11 = Q.f15010c;
        int i12 = (int) (j11 & 4294967295L);
        while (true) {
            D0.a aVar = this.f8247f;
            if (i12 >= aVar.length()) {
                return aVar.length();
            }
            int length = str.length() - 1;
            if (i12 <= length) {
                length = i12;
            }
            long B11 = k11.B(length);
            int i13 = Q.f15010c;
            int i14 = (int) (B11 & 4294967295L);
            if (i14 > i12) {
                return i14;
            }
            i12++;
        }
    }

    public final int k() {
        long j11 = this.f8248g;
        int i11 = Q.f15010c;
        return C2459b1.b((int) (j11 & 4294967295L), this.f8249h);
    }

    public final int l() {
        K1.K k11 = this.f8243b;
        if (k11 == null) {
            return 0;
        }
        long j11 = this.f8248g;
        int i11 = Q.f15010c;
        for (int i12 = (int) (j11 & 4294967295L); i12 > 0; i12--) {
            int length = this.f8249h.length() - 1;
            if (i12 <= length) {
                length = i12;
            }
            long B11 = k11.B(length);
            int i13 = Q.f15010c;
            int i14 = (int) (B11 >> 32);
            if (i14 < i12) {
                return i14;
            }
        }
        return 0;
    }

    public final long m() {
        return this.f8248g;
    }

    @NotNull
    public final void q() {
        K1.K k11 = this.f8243b;
        if (k11 != null && this.f8249h.length() > 0) {
            K(o(k11, 1));
        }
    }

    @NotNull
    public final void r() {
        if (this.f8249h.length() > 0) {
            K(p(1));
        }
    }

    @NotNull
    public final void s() {
        this.f8246e.b();
        if (this.f8249h.length() > 0) {
            if (n()) {
                w();
            } else {
                u();
            }
        }
    }

    @NotNull
    public final void t() {
        C2989j c2989j = this.f8246e;
        c2989j.b();
        String str = this.f8249h;
        if (str.length() > 0) {
            if (n()) {
                c2989j.b();
                if (str.length() > 0) {
                    K(l());
                    return;
                }
                return;
            }
            c2989j.b();
            if (str.length() > 0) {
                K(j());
            }
        }
    }

    @NotNull
    public final void v() {
        this.f8246e.b();
        String str = this.f8249h;
        if (str.length() > 0) {
            int a11 = C2456a1.a(Q.g(this.f8248g), str);
            if (a11 == Q.g(this.f8248g) && a11 != str.length()) {
                a11 = C2456a1.a(a11 + 1, str);
            }
            K(a11);
        }
    }

    @NotNull
    public final void x() {
        this.f8246e.b();
        String str = this.f8249h;
        if (str.length() > 0) {
            int b11 = C2456a1.b(Q.h(this.f8248g), str);
            if (b11 == Q.h(this.f8248g) && b11 != 0) {
                b11 = C2456a1.b(b11 - 1, str);
            }
            K(b11);
        }
    }

    @NotNull
    public final void y() {
        this.f8246e.b();
        if (this.f8249h.length() > 0) {
            if (n()) {
                u();
            } else {
                w();
            }
        }
    }

    @NotNull
    public final void z() {
        C2989j c2989j = this.f8246e;
        c2989j.b();
        String str = this.f8249h;
        if (str.length() > 0) {
            if (n()) {
                c2989j.b();
                if (str.length() > 0) {
                    K(j());
                    return;
                }
                return;
            }
            c2989j.b();
            if (str.length() > 0) {
                K(l());
            }
        }
    }
}
