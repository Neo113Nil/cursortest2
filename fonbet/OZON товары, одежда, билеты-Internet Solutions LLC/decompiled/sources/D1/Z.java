package D1;

import D1.C2793c;
import D1.H;
import D1.L;
import D1.x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final H f5399a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5401c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5402d;

    /* renamed from: h, reason: collision with root package name */
    private Z1.b f5406h;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2817q f5400b = new C2817q();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final v0 f5403e = new v0();

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final U0.b<x0.a> f5404f = new U0.b<>(new x0.a[16]);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final U0.b<a> f5405g = new U0.b<>(new a[16]);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final H f5407a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f5408b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f5409c;

        public a(@NotNull H h11, boolean z11, boolean z12) {
            this.f5407a = h11;
            this.f5408b = z11;
            this.f5409c = z12;
        }

        @NotNull
        public final H a() {
            return this.f5407a;
        }

        public final boolean b() {
            return this.f5409c;
        }

        public final boolean c() {
            return this.f5408b;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5410a;

        static {
            int[] iArr = new int[H.d.values().length];
            try {
                iArr[H.d.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H.d.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H.d.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[H.d.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[H.d.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f5410a = iArr;
        }
    }

    public Z(@NotNull H h11) {
        this.f5399a = h11;
    }

    private final void a() {
        U0.b<x0.a> bVar = this.f5404f;
        int m11 = bVar.m();
        if (m11 > 0) {
            x0.a[] l11 = bVar.l();
            int i11 = 0;
            do {
                l11[i11].i();
                i11++;
            } while (i11 < m11);
        }
        bVar.h();
    }

    private static boolean c(H h11, Z1.b bVar) {
        if (h11.U() == null) {
            return false;
        }
        boolean E02 = bVar != null ? h11.E0(bVar) : h11.E0(h11.f5272z.z());
        H g02 = h11.g0();
        if (E02 && g02 != null) {
            if (g02.U() == null) {
                H.f1(g02, false, 3);
                return E02;
            }
            if (h11.Z() == H.f.InMeasureBlock) {
                H.d1(g02, false, 3);
                return E02;
            }
            if (h11.Z() == H.f.InLayoutBlock) {
                g02.c1(false);
            }
        }
        return E02;
    }

    private static boolean d(H h11, Z1.b bVar) {
        boolean X02 = bVar != null ? h11.X0(bVar) : H.Y0(h11);
        H g02 = h11.g0();
        if (X02 && g02 != null) {
            if (h11.Y() == H.f.InMeasureBlock) {
                H.f1(g02, false, 3);
                return X02;
            }
            if (h11.Y() == H.f.InLayoutBlock) {
                g02.e1(false);
            }
        }
        return X02;
    }

    private final void e() {
        U0.b<a> bVar = this.f5405g;
        if (bVar.p()) {
            int m11 = bVar.m();
            if (m11 > 0) {
                a[] l11 = bVar.l();
                int i11 = 0;
                do {
                    a aVar = l11[i11];
                    if (aVar.a().z0()) {
                        if (aVar.c()) {
                            H.d1(aVar.a(), aVar.b(), 2);
                        } else {
                            H.f1(aVar.a(), aVar.b(), 2);
                        }
                    }
                    i11++;
                } while (i11 < m11);
            }
            bVar.h();
        }
    }

    private final void f(H h11) {
        U0.b<H> o02 = h11.o0();
        int m11 = o02.m();
        if (m11 > 0) {
            H[] l11 = o02.l();
            int i11 = 0;
            do {
                H h12 = l11[i11];
                if (Intrinsics.d(h12.D0(), Boolean.TRUE) && !h12.A0()) {
                    if (this.f5400b.d(h12, true)) {
                        h12.G0();
                    }
                    f(h12);
                }
                i11++;
            } while (i11 < m11);
        }
    }

    private final void h(H h11, boolean z11) {
        U0.b<H> o02 = h11.o0();
        int m11 = o02.m();
        C2817q c2817q = this.f5400b;
        if (m11 > 0) {
            H[] l11 = o02.l();
            int i11 = 0;
            do {
                H h12 = l11[i11];
                if ((!z11 && k(h12)) || (z11 && l(h12))) {
                    if (T.a(h12) && !z11) {
                        if (h12.S() && c2817q.d(h12, true)) {
                            r(h12, true, false);
                        } else {
                            g(h12, true);
                        }
                    }
                    if ((z11 ? h12.S() : h12.W()) && c2817q.d(h12, z11)) {
                        r(h12, z11, false);
                    }
                    if (!(z11 ? h12.S() : h12.W())) {
                        h(h12, z11);
                    }
                }
                i11++;
            } while (i11 < m11);
        }
        if ((z11 ? h11.S() : h11.W()) && c2817q.d(h11, z11)) {
            r(h11, z11, false);
        }
    }

    private static boolean k(H h11) {
        return h11.Y() == H.f.InMeasureBlock || h11.N().r().s().j();
    }

    private static boolean l(H h11) {
        L.a C11;
        AbstractC2789a s11;
        return h11.Z() == H.f.InMeasureBlock || !((C11 = h11.N().C()) == null || (s11 = C11.s()) == null || !s11.j());
    }

    private final boolean r(H h11, boolean z11, boolean z12) {
        Z1.b bVar;
        boolean d11;
        H g02;
        if (h11.A0() || (!h11.B0() && !h11.C0() && ((!h11.W() || !k(h11)) && !Intrinsics.d(h11.D0(), Boolean.TRUE) && ((!h11.S() || !l(h11)) && !h11.v())))) {
            return false;
        }
        H h12 = this.f5399a;
        if (h11 == h12) {
            bVar = this.f5406h;
            Intrinsics.f(bVar);
        } else {
            bVar = null;
        }
        if (z11) {
            d11 = h11.S() ? c(h11, bVar) : false;
            if (z12 && ((d11 || h11.R()) && Intrinsics.d(h11.D0(), Boolean.TRUE))) {
                h11.G0();
            }
        } else {
            d11 = h11.W() ? d(h11, bVar) : false;
            if (z12 && h11.P() && (h11 == h12 || ((g02 = h11.g0()) != null && g02.B0() && h11.C0()))) {
                if (h11 == h12) {
                    h11.W0();
                } else {
                    h11.b1();
                }
                this.f5403e.d(h11);
            }
        }
        e();
        return d11;
    }

    private final void s(H h11) {
        U0.b<H> o02 = h11.o0();
        int m11 = o02.m();
        if (m11 > 0) {
            H[] l11 = o02.l();
            int i11 = 0;
            do {
                H h12 = l11[i11];
                if (k(h12)) {
                    if (T.a(h12)) {
                        t(h12, true);
                    } else {
                        s(h12);
                    }
                }
                i11++;
            } while (i11 < m11);
        }
    }

    private final void t(H h11, boolean z11) {
        Z1.b bVar;
        if (h11.A0()) {
            return;
        }
        if (h11 == this.f5399a) {
            bVar = this.f5406h;
            Intrinsics.f(bVar);
        } else {
            bVar = null;
        }
        if (z11) {
            c(h11, bVar);
        } else {
            d(h11, bVar);
        }
    }

    public final void b(boolean z11) {
        v0 v0Var = this.f5403e;
        if (z11) {
            v0Var.e(this.f5399a);
        }
        v0Var.a();
    }

    public final void g(@NotNull H h11, boolean z11) {
        if (this.f5400b.e(z11)) {
            return;
        }
        if (!this.f5401c) {
            A1.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            throw null;
        }
        if (z11 ? h11.S() : h11.W()) {
            A1.a.a("node not yet measured");
            throw null;
        }
        h(h11, z11);
    }

    public final boolean i() {
        return this.f5400b.f();
    }

    public final boolean j() {
        return this.f5403e.c();
    }

    public final boolean m(Function0<Unit> function0) {
        boolean z11;
        C2816p c2816p;
        C2817q c2817q = this.f5400b;
        H h11 = this.f5399a;
        if (!h11.z0()) {
            A1.a.a("performMeasureAndLayout called with unattached root");
            throw null;
        }
        if (!h11.B0()) {
            A1.a.a("performMeasureAndLayout called with unplaced root");
            throw null;
        }
        if (this.f5401c) {
            A1.a.a("performMeasureAndLayout called during measure layout");
            throw null;
        }
        boolean z12 = false;
        if (this.f5406h != null) {
            this.f5401c = true;
            this.f5402d = true;
            try {
                if (c2817q.f()) {
                    z11 = false;
                    while (c2817q.f()) {
                        c2816p = c2817q.f5547a;
                        boolean c11 = c2816p.c();
                        boolean z13 = !c11;
                        H d11 = (!c11 ? c2817q.f5547a : c2817q.f5548b).d();
                        boolean r11 = r(d11, z13, true);
                        if (d11 == h11 && r11) {
                            z11 = true;
                        }
                    }
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    z11 = false;
                }
                this.f5401c = false;
                this.f5402d = false;
                z12 = z11;
            } catch (Throwable th2) {
                this.f5401c = false;
                this.f5402d = false;
                throw th2;
            }
        }
        a();
        return z12;
    }

    public final void n(@NotNull H h11, long j11) {
        if (h11.A0()) {
            return;
        }
        H h12 = this.f5399a;
        if (h11.equals(h12)) {
            A1.a.a("measureAndLayout called on root");
            throw null;
        }
        if (!h12.z0()) {
            A1.a.a("performMeasureAndLayout called with unattached root");
            throw null;
        }
        if (!h12.B0()) {
            A1.a.a("performMeasureAndLayout called with unplaced root");
            throw null;
        }
        if (this.f5401c) {
            A1.a.a("performMeasureAndLayout called during measure layout");
            throw null;
        }
        if (this.f5406h != null) {
            this.f5401c = true;
            this.f5402d = false;
            try {
                this.f5400b.g(h11);
                if (!c(h11, Z1.b.a(j11))) {
                    if (h11.R()) {
                    }
                    f(h11);
                    d(h11, Z1.b.a(j11));
                    if (h11.P() && h11.B0()) {
                        h11.b1();
                        this.f5403e.d(h11);
                    }
                    e();
                    this.f5401c = false;
                    this.f5402d = false;
                }
                if (Intrinsics.d(h11.D0(), Boolean.TRUE)) {
                    h11.G0();
                }
                f(h11);
                d(h11, Z1.b.a(j11));
                if (h11.P()) {
                    h11.b1();
                    this.f5403e.d(h11);
                }
                e();
                this.f5401c = false;
                this.f5402d = false;
            } catch (Throwable th2) {
                this.f5401c = false;
                this.f5402d = false;
                throw th2;
            }
        }
        a();
    }

    public final void o() {
        C2817q c2817q = this.f5400b;
        if (c2817q.f()) {
            H h11 = this.f5399a;
            if (!h11.z0()) {
                A1.a.a("performMeasureAndLayout called with unattached root");
                throw null;
            }
            if (!h11.B0()) {
                A1.a.a("performMeasureAndLayout called with unplaced root");
                throw null;
            }
            if (this.f5401c) {
                A1.a.a("performMeasureAndLayout called during measure layout");
                throw null;
            }
            if (this.f5406h != null) {
                this.f5401c = true;
                this.f5402d = false;
                try {
                    if (!c2817q.e(true)) {
                        if (h11.U() != null) {
                            t(h11, true);
                        } else {
                            s(h11);
                        }
                    }
                    t(h11, false);
                    this.f5401c = false;
                    this.f5402d = false;
                } catch (Throwable th2) {
                    this.f5401c = false;
                    this.f5402d = false;
                    throw th2;
                }
            }
        }
    }

    public final void p(@NotNull H h11) {
        this.f5400b.g(h11);
        this.f5403e.f(h11);
    }

    public final void q(@NotNull C2793c.b bVar) {
        this.f5404f.b(bVar);
    }

    public final boolean u(@NotNull H h11, boolean z11) {
        int i11 = b.f5410a[h11.Q().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4 && i11 != 5) {
                        throw new Sc.o();
                    }
                }
            }
            if ((!h11.S() && !h11.R()) || z11) {
                h11.I0();
                h11.H0();
                if (!h11.A0()) {
                    H g02 = h11.g0();
                    boolean d11 = Intrinsics.d(h11.D0(), Boolean.TRUE);
                    C2817q c2817q = this.f5400b;
                    if (d11 && ((g02 == null || !g02.S()) && (g02 == null || !g02.R()))) {
                        c2817q.c(h11, true);
                    } else if (h11.B0() && ((g02 == null || !g02.P()) && (g02 == null || !g02.W()))) {
                        c2817q.c(h11, false);
                    }
                    if (!this.f5402d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean v(@NotNull H h11, boolean z11) {
        H g02;
        H g03;
        if (h11.U() == null) {
            A1.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            throw null;
        }
        int i11 = b.f5410a[h11.Q().ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3 || i11 == 4) {
                this.f5405g.b(new a(h11, true, z11));
            } else {
                if (i11 != 5) {
                    throw new Sc.o();
                }
                if (!h11.S() || z11) {
                    h11.J0();
                    h11.K0();
                    if (!h11.A0()) {
                        boolean d11 = Intrinsics.d(h11.D0(), Boolean.TRUE);
                        C2817q c2817q = this.f5400b;
                        if ((d11 || (h11.S() && l(h11))) && ((g02 = h11.g0()) == null || !g02.S())) {
                            c2817q.c(h11, true);
                        } else if ((h11.B0() || (h11.W() && k(h11))) && ((g03 = h11.g0()) == null || !g03.W())) {
                            c2817q.c(h11, false);
                        }
                        if (!this.f5402d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void w(@NotNull H h11) {
        this.f5403e.d(h11);
    }

    public final boolean x(@NotNull H h11, boolean z11) {
        int i11 = b.f5410a[h11.Q().ordinal()];
        if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            if (i11 != 5) {
                throw new Sc.o();
            }
            if (z11 || h11.B0() != h11.C0() || (!h11.W() && !h11.P())) {
                h11.H0();
                if (!h11.A0() && h11.C0()) {
                    H g02 = h11.g0();
                    if ((g02 == null || !g02.P()) && (g02 == null || !g02.W())) {
                        this.f5400b.c(h11, false);
                    }
                    if (!this.f5402d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean y(@NotNull H h11, boolean z11) {
        int i11 = b.f5410a[h11.Q().ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3 || i11 == 4) {
                this.f5405g.b(new a(h11, false, z11));
            } else {
                if (i11 != 5) {
                    throw new Sc.o();
                }
                if (!h11.W() || z11) {
                    h11.K0();
                    if (h11.A0() || (!h11.B0() && (!h11.W() || !k(h11)))) {
                        return false;
                    }
                    H g02 = h11.g0();
                    if (g02 == null || !g02.W()) {
                        this.f5400b.c(h11, false);
                    }
                    if (!this.f5402d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void z(long j11) {
        Z1.b bVar = this.f5406h;
        if (bVar == null ? false : Z1.b.e(bVar.p(), j11)) {
            return;
        }
        if (this.f5401c) {
            A1.a.a("updateRootConstraints called while measuring");
            throw null;
        }
        this.f5406h = Z1.b.a(j11);
        H h11 = this.f5399a;
        if (h11.U() != null) {
            h11.J0();
        }
        h11.K0();
        this.f5400b.c(h11, h11.U() != null);
    }
}
