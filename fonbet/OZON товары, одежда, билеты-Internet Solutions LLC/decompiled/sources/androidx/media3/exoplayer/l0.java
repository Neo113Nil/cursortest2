package androidx.media3.exoplayer;

import F3.InterfaceC3018x;
import j3.AbstractC7252H;
import j3.C7272n;
import java.io.IOException;
import java.util.Objects;
import t3.C9734F;

/* loaded from: classes.dex */
final class l0 {

    /* renamed from: a, reason: collision with root package name */
    private final j0 f44083a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44084b;

    /* renamed from: c, reason: collision with root package name */
    private final j0 f44085c;

    /* renamed from: d, reason: collision with root package name */
    private int f44086d = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f44087e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f44088f = false;

    public l0(j0 j0Var, j0 j0Var2, int i11) {
        this.f44083a = j0Var;
        this.f44084b = i11;
        this.f44085c = j0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int E(j0 j0Var, N n11, I3.F f7, C5447i c5447i) throws C5449k {
        j0 j0Var2;
        int i11;
        if (j0Var == null || j0Var.getState() == 0 || (j0Var == (j0Var2 = this.f44083a) && ((i11 = this.f44086d) == 2 || i11 == 4))) {
            return 1;
        }
        if (j0Var == this.f44085c && this.f44086d == 3) {
            return 1;
        }
        F3.U n12 = j0Var.n();
        F3.U[] uArr = n11.f43665c;
        int i12 = this.f44084b;
        Object[] objArr = n12 != uArr[i12];
        boolean b11 = f7.b(i12);
        if (!b11 || objArr != false) {
            if (!j0Var.k()) {
                I3.y yVar = f7.f11824c[i12];
                int length = yVar != null ? yVar.length() : 0;
                C7272n[] c7272nArr = new C7272n[length];
                for (int i13 = 0; i13 < length; i13++) {
                    yVar.getClass();
                    c7272nArr[i13] = yVar.m(i13);
                }
                F3.U u11 = uArr[i12];
                u11.getClass();
                j0Var.h(c7272nArr, u11, n11.i(), n11.h(), n11.f43669g.f43679a);
                return 3;
            }
            if (!j0Var.a()) {
                return 0;
            }
            d(j0Var, c5447i);
            if (!b11 || r()) {
                y(j0Var == j0Var2);
                return 1;
            }
        }
        return 1;
    }

    private static void J(j0 j0Var, long j11) {
        j0Var.t();
        if (j0Var instanceof H3.h) {
            ((H3.h) j0Var).f0(j11);
        }
    }

    private void d(j0 j0Var, C5447i c5447i) {
        G10.a.h(this.f44083a == j0Var || this.f44085c == j0Var);
        if (v(j0Var)) {
            c5447i.a(j0Var);
            if (j0Var.getState() == 2) {
                j0Var.stop();
            }
            j0Var.disable();
        }
    }

    private j0 j(N n11) {
        if (n11 == null) {
            return null;
        }
        F3.U[] uArr = n11.f43665c;
        int i11 = this.f44084b;
        if (uArr[i11] == null) {
            return null;
        }
        j0 j0Var = this.f44083a;
        if (j0Var.n() == uArr[i11]) {
            return j0Var;
        }
        j0 j0Var2 = this.f44085c;
        if (j0Var2 == null || j0Var2.n() != uArr[i11]) {
            return null;
        }
        return j0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r9.o() >= r1.i()) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean n(N n11, j0 j0Var) {
        if (j0Var != null) {
            F3.U[] uArr = n11.f43665c;
            int i11 = this.f44084b;
            F3.U u11 = uArr[i11];
            if (j0Var.n() != null) {
                if (j0Var.n() == u11) {
                    if (u11 != null && !j0Var.f()) {
                        N g10 = n11.g();
                        if (n11.f43669g.f43685g) {
                            if (g10 != null) {
                                if (g10.f43667e) {
                                    if (!(j0Var instanceof H3.h)) {
                                        if (!(j0Var instanceof C3.c)) {
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
                N g11 = n11.g();
                if (g11 == null || g11.f43665c[i11] != j0Var.n()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean v(j0 j0Var) {
        return j0Var.getState() != 0;
    }

    private void y(boolean z11) {
        if (z11) {
            if (this.f44087e) {
                this.f44083a.reset();
                this.f44087e = false;
                return;
            }
            return;
        }
        if (this.f44088f) {
            j0 j0Var = this.f44085c;
            j0Var.getClass();
            j0Var.reset();
            this.f44088f = false;
        }
    }

    public final void A(N n11) throws IOException {
        j0 j11 = j(n11);
        j11.getClass();
        j11.u();
    }

    public final void B() {
        this.f44083a.release();
        this.f44087e = false;
        j0 j0Var = this.f44085c;
        if (j0Var != null) {
            j0Var.release();
            this.f44088f = false;
        }
    }

    public final void C(long j11, long j12) throws C5449k {
        j0 j0Var = this.f44083a;
        if (v(j0Var)) {
            j0Var.c(j11, j12);
        }
        j0 j0Var2 = this.f44085c;
        if (j0Var2 == null || !v(j0Var2)) {
            return;
        }
        j0Var2.c(j11, j12);
    }

    public final int D(N n11, I3.F f7, C5447i c5447i) throws C5449k {
        int E11 = E(this.f44083a, n11, f7, c5447i);
        return E11 == 1 ? E(this.f44085c, n11, f7, c5447i) : E11;
    }

    public final void F() {
        if (!v(this.f44083a)) {
            y(true);
        }
        j0 j0Var = this.f44085c;
        if (j0Var == null || v(j0Var)) {
            return;
        }
        y(false);
    }

    public final void G(N n11, long j11) throws C5449k {
        j0 j12 = j(n11);
        if (j12 != null) {
            j12.p(j11);
        }
    }

    public final void H(long j11) {
        int i11;
        j0 j0Var = this.f44083a;
        if (v(j0Var) && (i11 = this.f44086d) != 4 && i11 != 2) {
            J(j0Var, j11);
        }
        j0 j0Var2 = this.f44085c;
        if (j0Var2 == null || j0Var2.getState() == 0 || this.f44086d == 3) {
            return;
        }
        J(j0Var2, j11);
    }

    public final void I(N n11, long j11) {
        j0 j12 = j(n11);
        j12.getClass();
        J(j12, j11);
    }

    public final void K(float f7, float f11) throws C5449k {
        this.f44083a.A(f7, f11);
        j0 j0Var = this.f44085c;
        if (j0Var != null) {
            j0Var.A(f7, f11);
        }
    }

    public final void L(t3.H h11) throws C5449k {
        this.f44083a.j(18, h11);
        j0 j0Var = this.f44085c;
        if (j0Var != null) {
            j0Var.j(18, h11);
        }
    }

    public final void M(AbstractC7252H abstractC7252H) {
        this.f44083a.m(abstractC7252H);
        j0 j0Var = this.f44085c;
        if (j0Var != null) {
            j0Var.m(abstractC7252H);
        }
    }

    public final void N(L3.u uVar) throws C5449k {
        j0 j0Var = this.f44083a;
        if (j0Var.v() != 2) {
            return;
        }
        j0Var.j(7, uVar);
        j0 j0Var2 = this.f44085c;
        if (j0Var2 != null) {
            j0Var2.j(7, uVar);
        }
    }

    public final void O(Object obj) throws C5449k {
        j0 j0Var = this.f44083a;
        if (j0Var.v() != 2) {
            return;
        }
        int i11 = this.f44086d;
        if (i11 != 4 && i11 != 1) {
            j0Var.j(1, obj);
            return;
        }
        j0 j0Var2 = this.f44085c;
        j0Var2.getClass();
        j0Var2.j(1, obj);
    }

    public final void P(float f7) throws C5449k {
        j0 j0Var = this.f44083a;
        if (j0Var.v() != 1) {
            return;
        }
        j0Var.j(2, Float.valueOf(f7));
        j0 j0Var2 = this.f44085c;
        if (j0Var2 != null) {
            j0Var2.j(2, Float.valueOf(f7));
        }
    }

    public final void Q() throws C5449k {
        j0 j0Var = this.f44083a;
        if (j0Var.getState() == 1 && this.f44086d != 4) {
            j0Var.start();
            return;
        }
        j0 j0Var2 = this.f44085c;
        if (j0Var2 == null || j0Var2.getState() != 1 || this.f44086d == 3) {
            return;
        }
        j0Var2.start();
    }

    public final void R() {
        int i11;
        G10.a.h(!r());
        if (v(this.f44083a)) {
            i11 = 3;
        } else {
            j0 j0Var = this.f44085c;
            i11 = (j0Var == null || j0Var.getState() == 0) ? 2 : 4;
        }
        this.f44086d = i11;
    }

    public final void S() {
        j0 j0Var = this.f44083a;
        if (v(j0Var) && j0Var.getState() == 2) {
            j0Var.stop();
        }
        j0 j0Var2 = this.f44085c;
        if (j0Var2 == null || j0Var2.getState() == 0 || j0Var2.getState() != 2) {
            return;
        }
        j0Var2.stop();
    }

    public final boolean a(N n11) {
        j0 j11 = j(n11);
        return j11 == null || j11.f() || j11.isReady() || j11.a();
    }

    public final void b(C5447i c5447i) throws C5449k {
        j0 j0Var = this.f44083a;
        d(j0Var, c5447i);
        j0 j0Var2 = this.f44085c;
        if (j0Var2 != null) {
            boolean z11 = (j0Var2.getState() != 0) && this.f44086d != 3;
            d(j0Var2, c5447i);
            y(false);
            if (z11) {
                j0Var2.getClass();
                j0Var2.j(17, j0Var);
            }
        }
        this.f44086d = 0;
    }

    public final void c(C5447i c5447i) {
        j0 j0Var;
        if (r()) {
            int i11 = this.f44086d;
            boolean z11 = i11 == 4 || i11 == 2;
            int i12 = i11 != 4 ? 0 : 1;
            if (z11) {
                j0Var = this.f44083a;
            } else {
                j0Var = this.f44085c;
                j0Var.getClass();
            }
            d(j0Var, c5447i);
            y(z11);
            this.f44086d = i12;
        }
    }

    public final void e(C9734F c9734f, I3.y yVar, F3.U u11, long j11, boolean z11, boolean z12, long j12, long j13, InterfaceC3018x.b bVar, C5447i c5447i) throws C5449k {
        int length = yVar != null ? yVar.length() : 0;
        C7272n[] c7272nArr = new C7272n[length];
        for (int i11 = 0; i11 < length; i11++) {
            yVar.getClass();
            c7272nArr[i11] = yVar.m(i11);
        }
        int i12 = this.f44086d;
        if (i12 == 0 || i12 == 2 || i12 == 4) {
            this.f44087e = true;
            this.f44083a.l(c9734f, c7272nArr, u11, z11, z12, j12, j13, bVar);
            c5447i.c(this.f44083a);
        } else {
            this.f44088f = true;
            j0 j0Var = this.f44085c;
            j0Var.getClass();
            j0Var.l(c9734f, c7272nArr, u11, z11, z12, j12, j13, bVar);
            c5447i.c(j0Var);
        }
    }

    public final void f() {
        j0 j0Var = this.f44083a;
        if (v(j0Var)) {
            j0Var.s();
            return;
        }
        j0 j0Var2 = this.f44085c;
        if (j0Var2 == null || !v(j0Var2)) {
            return;
        }
        j0Var2.s();
    }

    public final int g() {
        boolean v11 = v(this.f44083a);
        j0 j0Var = this.f44085c;
        return (v11 ? 1 : 0) + ((j0Var == null || !v(j0Var)) ? 0 : 1);
    }

    public final long h(long j11, long j12) {
        j0 j0Var = this.f44083a;
        long w11 = v(j0Var) ? j0Var.w(j11, j12) : Long.MAX_VALUE;
        j0 j0Var2 = this.f44085c;
        return (j0Var2 == null || j0Var2.getState() == 0) ? w11 : Math.min(w11, j0Var2.w(j11, j12));
    }

    public final long i(N n11) {
        j0 j11 = j(n11);
        Objects.requireNonNull(j11);
        return j11.o();
    }

    public final int k() {
        return this.f44083a.v();
    }

    public final void l(Object obj, N n11) throws C5449k {
        j0 j11 = j(n11);
        j11.getClass();
        j11.j(11, obj);
    }

    public final boolean m(N n11) {
        return n(n11, this.f44083a) && n(n11, this.f44085c);
    }

    public final boolean o(N n11) {
        j0 j11 = j(n11);
        j11.getClass();
        return j11.f();
    }

    public final boolean p() {
        return this.f44085c != null;
    }

    public final boolean q() {
        j0 j0Var = this.f44083a;
        boolean a11 = v(j0Var) ? j0Var.a() : true;
        j0 j0Var2 = this.f44085c;
        return (j0Var2 == null || j0Var2.getState() == 0) ? a11 : a11 & j0Var2.a();
    }

    public final boolean r() {
        int i11 = this.f44086d;
        return i11 == 2 || i11 == 4 || i11 == 3;
    }

    public final boolean s(N n11) {
        int i11 = this.f44086d;
        return ((i11 == 2 || i11 == 4) && j(n11) == this.f44083a) || (this.f44086d == 3 && j(n11) == this.f44085c);
    }

    public final boolean t(N n11) {
        return j(n11) != null;
    }

    public final boolean u() {
        int i11 = this.f44086d;
        if (i11 == 0 || i11 == 2 || i11 == 4) {
            return v(this.f44083a);
        }
        j0 j0Var = this.f44085c;
        j0Var.getClass();
        return j0Var.getState() != 0;
    }

    public final void w(F3.U u11, C5447i c5447i, long j11, boolean z11) throws C5449k {
        j0 j0Var = this.f44083a;
        if (v(j0Var)) {
            if (u11 != j0Var.n()) {
                d(j0Var, c5447i);
            } else if (z11) {
                j0Var.p(j11);
            }
        }
        j0 j0Var2 = this.f44085c;
        if (j0Var2 == null || !v(j0Var2)) {
            return;
        }
        if (u11 != j0Var2.n()) {
            d(j0Var2, c5447i);
        } else if (z11) {
            j0Var2.p(j11);
        }
    }

    public final void x() throws C5449k {
        int i11 = this.f44086d;
        if (i11 != 3 && i11 != 4) {
            if (i11 == 2) {
                this.f44086d = 0;
                return;
            }
            return;
        }
        boolean z11 = i11 == 4;
        j0 j0Var = this.f44083a;
        j0 j0Var2 = this.f44085c;
        if (z11) {
            j0Var2.getClass();
            j0Var2.j(17, j0Var);
        } else {
            j0Var2.getClass();
            j0Var.j(17, j0Var2);
        }
        this.f44086d = this.f44086d != 4 ? 1 : 0;
    }

    public final void z(I3.F f7, I3.F f11, long j11) {
        int i11;
        int i12 = this.f44084b;
        boolean b11 = f7.b(i12);
        boolean b12 = f11.b(i12);
        j0 j0Var = this.f44083a;
        j0 j0Var2 = this.f44085c;
        if (j0Var2 == null || (i11 = this.f44086d) == 3 || (i11 == 0 && v(j0Var))) {
            j0Var2 = j0Var;
        }
        if (!b11 || j0Var2.k()) {
            return;
        }
        boolean z11 = j0Var.v() == -2;
        C9734F c9734f = f7.f11823b[i12];
        C9734F c9734f2 = f11.f11823b[i12];
        if (!b12 || !Objects.equals(c9734f2, c9734f) || z11 || r()) {
            J(j0Var2, j11);
        }
    }
}
