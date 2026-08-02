package D1;

import B1.AbstractC2531a;
import B1.m0;
import D1.H;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7825i0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final H f5282a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5283b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5285d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5286e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5287f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5288g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5289h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5290i;

    /* renamed from: j, reason: collision with root package name */
    private int f5291j;

    /* renamed from: k, reason: collision with root package name */
    private int f5292k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5293l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5294m;

    /* renamed from: n, reason: collision with root package name */
    private int f5295n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5296o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5297p;

    /* renamed from: q, reason: collision with root package name */
    private int f5298q;

    /* renamed from: s, reason: collision with root package name */
    private a f5300s;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private H.d f5284c = H.d.Idle;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final b f5299r = new b();

    /* renamed from: t, reason: collision with root package name */
    private long f5301t = Z1.c.b(0, 0, 15);

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f5302u = new c();

    public final class a extends B1.m0 implements B1.U, InterfaceC2791b, InterfaceC2796d0 {

        /* renamed from: f, reason: collision with root package name */
        private boolean f5303f;

        /* renamed from: j, reason: collision with root package name */
        private boolean f5307j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f5308k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f5309l;

        /* renamed from: m, reason: collision with root package name */
        private Z1.b f5310m;

        /* renamed from: o, reason: collision with root package name */
        private Function1<? super InterfaceC7825i0, Unit> f5312o;

        /* renamed from: p, reason: collision with root package name */
        private o1.d f5313p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f5314q;

        /* renamed from: u, reason: collision with root package name */
        private boolean f5318u;

        /* renamed from: w, reason: collision with root package name */
        private Object f5320w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f5321x;

        /* renamed from: g, reason: collision with root package name */
        private int f5304g = Integer.MAX_VALUE;

        /* renamed from: h, reason: collision with root package name */
        private int f5305h = Integer.MAX_VALUE;

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private H.f f5306i = H.f.NotUsed;

        /* renamed from: n, reason: collision with root package name */
        private long f5311n = 0;

        /* renamed from: r, reason: collision with root package name */
        @NotNull
        private final U f5315r = new U(this);

        /* renamed from: s, reason: collision with root package name */
        @NotNull
        private final U0.b<a> f5316s = new U0.b<>(new a[16]);

        /* renamed from: t, reason: collision with root package name */
        private boolean f5317t = true;

        /* renamed from: v, reason: collision with root package name */
        private boolean f5319v = true;

        /* renamed from: D1.L$a$a, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public /* synthetic */ class C0123a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5323a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f5324b;

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
                    iArr[H.d.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[H.d.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f5323a = iArr;
                int[] iArr2 = new int[H.f.values().length];
                try {
                    iArr2[H.f.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[H.f.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                f5324b = iArr2;
            }
        }

        /* loaded from: classes8.dex */
        static final class b extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Y f5326c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ L f5327d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Y y11, L l11) {
                super(0);
                this.f5326c = y11;
                this.f5327d = l11;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                a aVar = a.this;
                a.P0(aVar);
                aVar.b0(M.f5368b);
                Y c22 = aVar.P().c2();
                L l11 = this.f5327d;
                if (c22 != null) {
                    boolean p12 = c22.p1();
                    List<H> A11 = l11.f5282a.A();
                    int size = A11.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        Y c23 = A11.get(i11).e0().c2();
                        if (c23 != null) {
                            c23.w1(p12);
                        }
                    }
                }
                this.f5326c.g1().u();
                if (aVar.P().c2() != null) {
                    List<H> A12 = l11.f5282a.A();
                    int size2 = A12.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        Y c24 = A12.get(i12).e0().c2();
                        if (c24 != null) {
                            c24.w1(false);
                        }
                    }
                }
                a.K0(aVar);
                aVar.b0(N.f5369b);
                return Unit.f71690a;
            }
        }

        /* loaded from: classes8.dex */
        static final class c extends AbstractC7737t implements Function1<InterfaceC2791b, Unit> {

            /* renamed from: b, reason: collision with root package name */
            public static final c f5328b = new c(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(InterfaceC2791b interfaceC2791b) {
                interfaceC2791b.s().t(false);
                return Unit.f71690a;
            }
        }

        public a() {
            this.f5320w = L.this.I().m();
        }

        public static final void K0(a aVar) {
            U0.b<H> o02 = L.this.f5282a.o0();
            int m11 = o02.m();
            if (m11 > 0) {
                H[] l11 = o02.l();
                int i11 = 0;
                do {
                    a H11 = l11[i11].N().H();
                    Intrinsics.f(H11);
                    int i12 = H11.f5304g;
                    int i13 = H11.f5305h;
                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                        H11.l1();
                    }
                    i11++;
                } while (i11 < m11);
            }
        }

        public static final void P0(a aVar) {
            L l11 = L.this;
            int i11 = 0;
            l11.f5291j = 0;
            U0.b<H> o02 = l11.f5282a.o0();
            int m11 = o02.m();
            if (m11 > 0) {
                H[] l12 = o02.l();
                do {
                    a H11 = l12[i11].N().H();
                    Intrinsics.f(H11);
                    H11.f5304g = H11.f5305h;
                    H11.f5305h = Integer.MAX_VALUE;
                    if (H11.f5306i == H.f.InLayoutBlock) {
                        H11.f5306i = H.f.NotUsed;
                    }
                    i11++;
                } while (i11 < m11);
            }
        }

        private final void i1() {
            boolean z11 = this.f5314q;
            this.f5314q = true;
            L l11 = L.this;
            if (!z11 && l11.G()) {
                H.d1(l11.f5282a, true, 6);
            }
            U0.b<H> o02 = l11.f5282a.o0();
            int m11 = o02.m();
            if (m11 > 0) {
                H[] l12 = o02.l();
                int i11 = 0;
                do {
                    H h11 = l12[i11];
                    a T11 = h11.T();
                    if (T11 == null) {
                        throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                    }
                    if (T11.f5305h != Integer.MAX_VALUE) {
                        T11.i1();
                        H.g1(h11);
                    }
                    i11++;
                } while (i11 < m11);
            }
        }

        private final void l1() {
            if (this.f5314q) {
                int i11 = 0;
                this.f5314q = false;
                U0.b<H> o02 = L.this.f5282a.o0();
                int m11 = o02.m();
                if (m11 > 0) {
                    H[] l11 = o02.l();
                    do {
                        a H11 = l11[i11].N().H();
                        Intrinsics.f(H11);
                        H11.l1();
                        i11++;
                    } while (i11 < m11);
                }
            }
        }

        private final void o1() {
            L l11 = L.this;
            H.d1(l11.f5282a, false, 7);
            H g02 = l11.f5282a.g0();
            if (g02 == null || l11.f5282a.M() != H.f.NotUsed) {
                return;
            }
            H h11 = l11.f5282a;
            int i11 = C0123a.f5323a[g02.Q().ordinal()];
            h11.l1(i11 != 2 ? i11 != 3 ? g02.M() : H.f.InLayoutBlock : H.f.InMeasureBlock);
        }

        private final void s1(long j11, Function1 function1, o1.d dVar) {
            L l11 = L.this;
            if (l11.f5282a.A0()) {
                A1.a.a("place is called on a deactivated node");
                throw null;
            }
            l11.f5284c = H.d.LookaheadLayingOut;
            this.f5308k = true;
            this.f5321x = false;
            if (!Z1.m.c(j11, this.f5311n)) {
                if (l11.D() || l11.E()) {
                    l11.f5289h = true;
                }
                n1();
            }
            x0 b11 = K.b(l11.f5282a);
            if (l11.F() || !this.f5314q) {
                l11.Y(false);
                this.f5315r.q(false);
                ((AndroidComposeView) b11).getF40501C().c(l11.f5282a, true, new O(l11, b11, j11));
            } else {
                Y c22 = l11.K().c2();
                Intrinsics.f(c22);
                c22.M1(j11);
                q1();
            }
            this.f5311n = j11;
            this.f5312o = function1;
            this.f5313p = dVar;
            l11.f5284c = H.d.Idle;
        }

        @Override // D1.InterfaceC2791b
        public final void A() {
            H.d1(L.this.f5282a, false, 7);
        }

        public final void A1() {
            H g02;
            try {
                this.f5303f = true;
                if (!this.f5308k) {
                    A1.a.b("replace() called on item that was not placed");
                    throw null;
                }
                this.f5321x = false;
                boolean z11 = this.f5314q;
                s1(this.f5311n, this.f5312o, this.f5313p);
                if (z11 && !this.f5321x && (g02 = L.this.f5282a.g0()) != null) {
                    g02.c1(false);
                }
            } finally {
                this.f5303f = false;
            }
        }

        public final void B1() {
            this.f5317t = true;
        }

        public final void C1(@NotNull H.f fVar) {
            this.f5306i = fVar;
        }

        @Override // B1.InterfaceC2552v
        public final int D(int i11) {
            o1();
            Y c22 = L.this.K().c2();
            Intrinsics.f(c22);
            return c22.D(i11);
        }

        public final void D1() {
            this.f5305h = Integer.MAX_VALUE;
        }

        @Override // B1.Z
        public final int E(@NotNull AbstractC2531a abstractC2531a) {
            L l11 = L.this;
            H g02 = l11.f5282a.g0();
            H.d Q11 = g02 != null ? g02.Q() : null;
            H.d dVar = H.d.LookaheadMeasuring;
            U u11 = this.f5315r;
            if (Q11 == dVar) {
                u11.t(true);
            } else {
                H g03 = l11.f5282a.g0();
                if ((g03 != null ? g03.Q() : null) == H.d.LookaheadLayingOut) {
                    u11.s(true);
                }
            }
            this.f5307j = true;
            Y c22 = l11.K().c2();
            Intrinsics.f(c22);
            int E11 = c22.E(abstractC2531a);
            this.f5307j = false;
            return E11;
        }

        public final void F1() {
            this.f5314q = true;
        }

        @Override // D1.InterfaceC2791b
        public final InterfaceC2791b G() {
            L N11;
            H g02 = L.this.f5282a.g0();
            if (g02 == null || (N11 = g02.N()) == null) {
                return null;
            }
            return N11.C();
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
        
            if (r0.m() == null) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean G1() {
            Object obj = this.f5320w;
            L l11 = L.this;
            if (obj == null) {
                Y c22 = l11.K().c2();
                Intrinsics.f(c22);
            }
            if (this.f5319v) {
                this.f5319v = false;
                Y c23 = l11.K().c2();
                Intrinsics.f(c23);
                this.f5320w = c23.m();
                return true;
            }
            return false;
        }

        @Override // D1.InterfaceC2791b
        public final void M() {
            U0.b<H> o02;
            int m11;
            this.f5318u = true;
            U u11 = this.f5315r;
            u11.n();
            L l11 = L.this;
            if (l11.F() && (m11 = (o02 = l11.f5282a.o0()).m()) > 0) {
                H[] l12 = o02.l();
                int i11 = 0;
                do {
                    H h11 = l12[i11];
                    if (h11.S() && h11.Z() == H.f.InMeasureBlock) {
                        a H11 = h11.N().H();
                        Intrinsics.f(H11);
                        Z1.b z11 = h11.N().z();
                        Intrinsics.f(z11);
                        if (H11.w1(z11.p())) {
                            H.d1(l11.f5282a, false, 7);
                        }
                    }
                    i11++;
                } while (i11 < m11);
            }
            Y c22 = P().c2();
            Intrinsics.f(c22);
            if (l11.f5290i || (!this.f5307j && !c22.p1() && l11.F())) {
                l11.f5289h = false;
                H.d B11 = l11.B();
                l11.f5284c = H.d.LookaheadLayingOut;
                x0 b11 = K.b(l11.f5282a);
                l11.Z(false);
                ((AndroidComposeView) b11).getF40501C().d(l11.f5282a, true, new b(c22, l11));
                l11.f5284c = B11;
                if (l11.E() && c22.p1()) {
                    requestLayout();
                }
                l11.f5290i = false;
            }
            if (u11.k()) {
                u11.p(true);
            }
            if (u11.f() && u11.j()) {
                u11.m();
            }
            this.f5318u = false;
        }

        @Override // D1.InterfaceC2791b
        public final boolean N() {
            return this.f5314q;
        }

        @Override // B1.InterfaceC2552v
        public final int O(int i11) {
            o1();
            Y c22 = L.this.K().c2();
            Intrinsics.f(c22);
            return c22.O(i11);
        }

        @Override // D1.InterfaceC2791b
        @NotNull
        public final C2823x P() {
            return L.this.f5282a.J();
        }

        @NotNull
        public final HashMap Q0() {
            boolean z11 = this.f5307j;
            U u11 = this.f5315r;
            if (!z11) {
                L l11 = L.this;
                if (l11.B() == H.d.LookaheadMeasuring) {
                    u11.r(true);
                    if (u11.f()) {
                        l11.P();
                    }
                } else {
                    u11.q(true);
                }
            }
            Y c22 = P().c2();
            if (c22 != null) {
                c22.w1(true);
            }
            M();
            Y c23 = P().c2();
            if (c23 != null) {
                c23.w1(false);
            }
            return u11.g();
        }

        @Override // B1.InterfaceC2552v
        public final int T(int i11) {
            o1();
            Y c22 = L.this.K().c2();
            Intrinsics.f(c22);
            return c22.T(i11);
        }

        @NotNull
        public final List<a> X0() {
            L l11 = L.this;
            l11.f5282a.A();
            boolean z11 = this.f5317t;
            U0.b<a> bVar = this.f5316s;
            if (!z11) {
                return bVar.g();
            }
            H h11 = l11.f5282a;
            U0.b<H> o02 = h11.o0();
            int m11 = o02.m();
            if (m11 > 0) {
                H[] l12 = o02.l();
                int i11 = 0;
                do {
                    H h12 = l12[i11];
                    if (bVar.m() <= i11) {
                        a H11 = h12.N().H();
                        Intrinsics.f(H11);
                        bVar.b(H11);
                    } else {
                        a H12 = h12.N().H();
                        Intrinsics.f(H12);
                        bVar.x(i11, H12);
                    }
                    i11++;
                } while (i11 < m11);
            }
            bVar.v(h11.A().size(), bVar.m());
            this.f5317t = false;
            return bVar.g();
        }

        @Override // B1.InterfaceC2552v
        public final int Y(int i11) {
            o1();
            Y c22 = L.this.K().c2();
            Intrinsics.f(c22);
            return c22.Y(i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        
            if ((r1 != null ? r1.Q() : null) == D1.H.d.LookaheadLayingOut) goto L14;
         */
        @Override // B1.U
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final B1.m0 a0(long j11) {
            H.f fVar;
            L l11 = L.this;
            H g02 = l11.f5282a.g0();
            if ((g02 != null ? g02.Q() : null) != H.d.LookaheadMeasuring) {
                H g03 = l11.f5282a.g0();
            }
            l11.f5283b = false;
            H h11 = l11.f5282a;
            H g04 = h11.g0();
            if (g04 == null) {
                this.f5306i = H.f.NotUsed;
            } else {
                if (this.f5306i != H.f.NotUsed && !h11.x()) {
                    A1.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                    throw null;
                }
                int i11 = C0123a.f5323a[g04.Q().ordinal()];
                if (i11 == 1 || i11 == 2) {
                    fVar = H.f.InMeasureBlock;
                } else {
                    if (i11 != 3 && i11 != 4) {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + g04.Q());
                    }
                    fVar = H.f.InLayoutBlock;
                }
                this.f5306i = fVar;
            }
            if (l11.f5282a.M() == H.f.NotUsed) {
                l11.f5282a.p();
            }
            w1(j11);
            return this;
        }

        public final Z1.b a1() {
            return this.f5310m;
        }

        @Override // D1.InterfaceC2791b
        public final void b0(@NotNull Function1<? super InterfaceC2791b, Unit> function1) {
            U0.b<H> o02 = L.this.f5282a.o0();
            int m11 = o02.m();
            if (m11 > 0) {
                H[] l11 = o02.l();
                int i11 = 0;
                do {
                    a C11 = l11[i11].N().C();
                    Intrinsics.f(C11);
                    function1.invoke(C11);
                    i11++;
                } while (i11 < m11);
            }
        }

        @Override // D1.InterfaceC2796d0
        public final void c0(boolean z11) {
            Y c22;
            L l11 = L.this;
            Y c23 = l11.K().c2();
            if (Boolean.valueOf(z11).equals(c23 != null ? Boolean.valueOf(c23.o1()) : null) || (c22 = l11.K().c2()) == null) {
                return;
            }
            c22.c0(z11);
        }

        public final boolean c1() {
            return this.f5318u;
        }

        @NotNull
        public final H.f e1() {
            return this.f5306i;
        }

        public final boolean g1() {
            return this.f5308k;
        }

        public final void h1() {
            this.f5319v = true;
        }

        @Override // B1.Z, B1.InterfaceC2552v
        public final Object m() {
            return this.f5320w;
        }

        public final void n1() {
            U0.b<H> o02;
            int m11;
            L l11 = L.this;
            if (l11.t() <= 0 || (m11 = (o02 = l11.f5282a.o0()).m()) <= 0) {
                return;
            }
            H[] l12 = o02.l();
            int i11 = 0;
            do {
                H h11 = l12[i11];
                L N11 = h11.N();
                if ((N11.E() || N11.D()) && !N11.F()) {
                    h11.c1(false);
                }
                a H11 = N11.H();
                if (H11 != null) {
                    H11.n1();
                }
                i11++;
            } while (i11 < m11);
        }

        @Override // B1.m0
        public final int o0() {
            Y c22 = L.this.K().c2();
            Intrinsics.f(c22);
            return c22.o0();
        }

        public final void p1() {
            this.f5305h = Integer.MAX_VALUE;
            this.f5304g = Integer.MAX_VALUE;
            this.f5314q = false;
        }

        public final void q1() {
            this.f5321x = true;
            H g02 = L.this.f5282a.g0();
            if (!this.f5314q) {
                i1();
                if (this.f5303f && g02 != null) {
                    g02.c1(false);
                }
            }
            if (g02 == null) {
                this.f5305h = 0;
            } else if (!this.f5303f && (g02.Q() == H.d.LayingOut || g02.Q() == H.d.LookaheadLayingOut)) {
                if (this.f5305h != Integer.MAX_VALUE) {
                    A1.a.b("Place was called on a node which was placed already");
                    throw null;
                }
                this.f5305h = g02.N().f5291j;
                g02.N().f5291j++;
            }
            M();
        }

        @Override // B1.m0
        public final int r0() {
            Y c22 = L.this.K().c2();
            Intrinsics.f(c22);
            return c22.r0();
        }

        @Override // D1.InterfaceC2791b
        public final void requestLayout() {
            H h11 = L.this.f5282a;
            int i11 = H.f5237N;
            h11.c1(false);
        }

        @Override // D1.InterfaceC2791b
        @NotNull
        public final AbstractC2789a s() {
            return this.f5315r;
        }

        public final boolean w1(long j11) {
            L l11 = L.this;
            if (l11.f5282a.A0()) {
                A1.a.a("measure is called on a deactivated node");
                throw null;
            }
            H g02 = l11.f5282a.g0();
            l11.f5282a.i1(l11.f5282a.x() || (g02 != null && g02.x()));
            if (!l11.f5282a.S()) {
                Z1.b bVar = this.f5310m;
                if (bVar == null ? false : Z1.b.e(bVar.p(), j11)) {
                    x0 f02 = l11.f5282a.f0();
                    if (f02 != null) {
                        ((AndroidComposeView) f02).c0(l11.f5282a, true);
                    }
                    l11.f5282a.h1();
                    return false;
                }
            }
            this.f5310m = Z1.b.a(j11);
            G0(j11);
            this.f5315r.r(false);
            b0(c.f5328b);
            long q02 = this.f5309l ? q0() : Z1.r.a(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
            this.f5309l = true;
            Y c22 = l11.K().c2();
            if (!(c22 != null)) {
                A1.a.b("Lookahead result from lookaheadRemeasure cannot be null");
                throw null;
            }
            L.g(l11, j11);
            E0(Z1.r.a(c22.u0(), c22.l0()));
            return (((int) (q02 >> 32)) == c22.u0() && ((int) (4294967295L & q02)) == c22.l0()) ? false : true;
        }

        @Override // B1.m0
        protected final void x0(long j11, float f7, Function1<? super InterfaceC7825i0, Unit> function1) {
            s1(j11, function1, null);
        }

        @Override // B1.m0
        protected final void y0(long j11, float f7, @NotNull o1.d dVar) {
            s1(j11, null, dVar);
        }
    }

    public final class b extends B1.m0 implements B1.U, InterfaceC2791b, InterfaceC2796d0 {

        /* renamed from: A, reason: collision with root package name */
        private boolean f5329A;

        /* renamed from: B, reason: collision with root package name */
        private Function1<? super InterfaceC7825i0, Unit> f5330B;

        /* renamed from: C, reason: collision with root package name */
        private o1.d f5331C;

        /* renamed from: E, reason: collision with root package name */
        private float f5333E;

        /* renamed from: F, reason: collision with root package name */
        @NotNull
        private final Function0<Unit> f5334F;

        /* renamed from: G, reason: collision with root package name */
        private boolean f5335G;

        /* renamed from: f, reason: collision with root package name */
        private boolean f5337f;

        /* renamed from: i, reason: collision with root package name */
        private boolean f5340i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f5341j;

        /* renamed from: l, reason: collision with root package name */
        private boolean f5343l;

        /* renamed from: n, reason: collision with root package name */
        private Function1<? super InterfaceC7825i0, Unit> f5345n;

        /* renamed from: o, reason: collision with root package name */
        private o1.d f5346o;

        /* renamed from: p, reason: collision with root package name */
        private float f5347p;

        /* renamed from: r, reason: collision with root package name */
        private Object f5349r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f5350s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f5351t;

        /* renamed from: x, reason: collision with root package name */
        private boolean f5355x;

        /* renamed from: z, reason: collision with root package name */
        private float f5357z;

        /* renamed from: g, reason: collision with root package name */
        private int f5338g = Integer.MAX_VALUE;

        /* renamed from: h, reason: collision with root package name */
        private int f5339h = Integer.MAX_VALUE;

        /* renamed from: k, reason: collision with root package name */
        @NotNull
        private H.f f5342k = H.f.NotUsed;

        /* renamed from: m, reason: collision with root package name */
        private long f5344m = 0;

        /* renamed from: q, reason: collision with root package name */
        private boolean f5348q = true;

        /* renamed from: u, reason: collision with root package name */
        @NotNull
        private final I f5352u = new I(this);

        /* renamed from: v, reason: collision with root package name */
        @NotNull
        private final U0.b<b> f5353v = new U0.b<>(new b[16]);

        /* renamed from: w, reason: collision with root package name */
        private boolean f5354w = true;

        /* renamed from: y, reason: collision with root package name */
        @NotNull
        private final Function0<Unit> f5356y = new C0124b();

        /* renamed from: D, reason: collision with root package name */
        private long f5332D = 0;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5358a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f5359b;

            static {
                int[] iArr = new int[H.d.values().length];
                try {
                    iArr[H.d.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[H.d.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f5358a = iArr;
                int[] iArr2 = new int[H.f.values().length];
                try {
                    iArr2[H.f.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[H.f.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f5359b = iArr2;
            }
        }

        /* renamed from: D1.L$b$b, reason: collision with other inner class name */
        static final class C0124b extends AbstractC7737t implements Function0<Unit> {
            C0124b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                b bVar = b.this;
                b.P0(bVar);
                bVar.b0(P.f5373b);
                bVar.P().g1().u();
                b.K0(bVar);
                bVar.b0(Q.f5374b);
                return Unit.f71690a;
            }
        }

        static final class c extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f5361b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f5362c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(L l11, b bVar) {
                super(0);
                this.f5361b = l11;
                this.f5362c = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                m0.a b11;
                L l11 = this.f5361b;
                AbstractC2810k0 g22 = l11.K().g2();
                if (g22 == null || (b11 = g22.i1()) == null) {
                    b11 = B1.n0.b((AndroidComposeView) K.b(l11.f5282a));
                }
                m0.a aVar = b11;
                b bVar = this.f5362c;
                Function1<? super InterfaceC7825i0, Unit> function1 = bVar.f5330B;
                o1.d dVar = bVar.f5331C;
                if (dVar != null) {
                    aVar.q(l11.K(), bVar.f5332D, dVar, bVar.f5333E);
                } else if (function1 == null) {
                    aVar.f(l11.K(), bVar.f5332D, bVar.f5333E);
                } else {
                    aVar.p(l11.K(), bVar.f5332D, bVar.f5333E, function1);
                }
                return Unit.f71690a;
            }
        }

        static final class d extends AbstractC7737t implements Function1<InterfaceC2791b, Unit> {

            /* renamed from: b, reason: collision with root package name */
            public static final d f5363b = new d(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(InterfaceC2791b interfaceC2791b) {
                interfaceC2791b.s().t(false);
                return Unit.f71690a;
            }
        }

        public b() {
            this.f5334F = new c(L.this, this);
        }

        private final void A1() {
            if (this.f5350s) {
                int i11 = 0;
                this.f5350s = false;
                L l11 = L.this;
                H h11 = l11.f5282a;
                AbstractC2810k0 f22 = h11.J().f2();
                for (AbstractC2810k0 e02 = h11.e0(); !Intrinsics.d(e02, f22) && e02 != null; e02 = e02.f2()) {
                    e02.z2();
                }
                U0.b<H> o02 = l11.f5282a.o0();
                int m11 = o02.m();
                if (m11 > 0) {
                    H[] l12 = o02.l();
                    do {
                        l12[i11].V().A1();
                        i11++;
                    } while (i11 < m11);
                }
            }
        }

        private final void C1() {
            L l11 = L.this;
            H.f1(l11.f5282a, false, 7);
            H g02 = l11.f5282a.g0();
            if (g02 == null || l11.f5282a.M() != H.f.NotUsed) {
                return;
            }
            H h11 = l11.f5282a;
            int i11 = a.f5358a[g02.Q().ordinal()];
            h11.l1(i11 != 1 ? i11 != 2 ? g02.M() : H.f.InLayoutBlock : H.f.InMeasureBlock);
        }

        private final void G1(long j11, float f7, Function1<? super InterfaceC7825i0, Unit> function1, o1.d dVar) {
            L l11 = L.this;
            if (l11.f5282a.A0()) {
                A1.a.a("place is called on a deactivated node");
                throw null;
            }
            l11.f5284c = H.d.LayingOut;
            this.f5344m = j11;
            this.f5347p = f7;
            this.f5345n = function1;
            this.f5346o = dVar;
            this.f5341j = true;
            this.f5329A = false;
            x0 b11 = K.b(l11.f5282a);
            if (l11.A() || !this.f5350s) {
                this.f5352u.q(false);
                l11.W(false);
                this.f5330B = function1;
                this.f5332D = j11;
                this.f5333E = f7;
                this.f5331C = dVar;
                ((AndroidComposeView) b11).getF40501C().c(l11.f5282a, false, this.f5334F);
            } else {
                l11.K().x2(j11, f7, function1, dVar);
                F1();
            }
            l11.f5284c = H.d.Idle;
        }

        private final void I1(long j11, float f7, Function1<? super InterfaceC7825i0, Unit> function1, o1.d dVar) {
            m0.a b11;
            this.f5351t = true;
            boolean c11 = Z1.m.c(j11, this.f5344m);
            L l11 = L.this;
            if (!c11 || this.f5335G) {
                if (l11.u() || l11.v() || this.f5335G) {
                    l11.f5286e = true;
                    this.f5335G = false;
                }
                B1();
            }
            if (T.a(l11.f5282a)) {
                AbstractC2810k0 g22 = l11.K().g2();
                if (g22 == null || (b11 = g22.i1()) == null) {
                    b11 = B1.n0.b((AndroidComposeView) K.b(l11.f5282a));
                }
                a H11 = l11.H();
                Intrinsics.f(H11);
                H g02 = l11.f5282a.g0();
                if (g02 != null) {
                    g02.N().f5291j = 0;
                }
                H11.D1();
                b11.d(H11, (int) (j11 >> 32), (int) (4294967295L & j11), 0.0f);
            }
            a H12 = l11.H();
            if (H12 == null || H12.g1()) {
                G1(j11, f7, function1, dVar);
            } else {
                A1.a.b("Error: Placement happened before lookahead.");
                throw null;
            }
        }

        public static final void K0(b bVar) {
            H h11 = L.this.f5282a;
            U0.b<H> o02 = h11.o0();
            int m11 = o02.m();
            if (m11 > 0) {
                H[] l11 = o02.l();
                int i11 = 0;
                do {
                    H h12 = l11[i11];
                    if (h12.V().f5338g != h12.h0()) {
                        h11.V0();
                        h11.s0();
                        if (h12.h0() == Integer.MAX_VALUE) {
                            h12.V().A1();
                        }
                    }
                    i11++;
                } while (i11 < m11);
            }
        }

        public static final void P0(b bVar) {
            L l11 = L.this;
            l11.f5292k = 0;
            U0.b<H> o02 = l11.f5282a.o0();
            int m11 = o02.m();
            if (m11 > 0) {
                H[] l12 = o02.l();
                int i11 = 0;
                do {
                    b V11 = l12[i11].V();
                    V11.f5338g = V11.f5339h;
                    V11.f5339h = Integer.MAX_VALUE;
                    V11.f5351t = false;
                    if (V11.f5342k == H.f.InLayoutBlock) {
                        V11.f5342k = H.f.NotUsed;
                    }
                    i11++;
                } while (i11 < m11);
            }
        }

        private final void w1() {
            boolean z11 = this.f5350s;
            this.f5350s = true;
            H h11 = L.this.f5282a;
            if (!z11) {
                if (h11.W()) {
                    H.f1(h11, true, 6);
                } else if (h11.S()) {
                    H.d1(h11, true, 6);
                }
            }
            AbstractC2810k0 f22 = h11.J().f2();
            for (AbstractC2810k0 e02 = h11.e0(); !Intrinsics.d(e02, f22) && e02 != null; e02 = e02.f2()) {
                if (e02.a2()) {
                    e02.m2();
                }
            }
            U0.b<H> o02 = h11.o0();
            int m11 = o02.m();
            if (m11 > 0) {
                H[] l11 = o02.l();
                int i11 = 0;
                do {
                    H h12 = l11[i11];
                    if (h12.h0() != Integer.MAX_VALUE) {
                        h12.V().w1();
                        H.g1(h12);
                    }
                    i11++;
                } while (i11 < m11);
            }
        }

        @Override // D1.InterfaceC2791b
        public final void A() {
            H.f1(L.this.f5282a, false, 7);
        }

        public final void B1() {
            U0.b<H> o02;
            int m11;
            L l11 = L.this;
            if (l11.s() <= 0 || (m11 = (o02 = l11.f5282a.o0()).m()) <= 0) {
                return;
            }
            H[] l12 = o02.l();
            int i11 = 0;
            do {
                H h11 = l12[i11];
                L N11 = h11.N();
                if ((N11.v() || N11.u()) && !N11.A()) {
                    h11.e1(false);
                }
                N11.I().B1();
                i11++;
            } while (i11 < m11);
        }

        @Override // B1.InterfaceC2552v
        public final int D(int i11) {
            C1();
            return L.this.K().D(i11);
        }

        public final void D1() {
            this.f5339h = Integer.MAX_VALUE;
            this.f5338g = Integer.MAX_VALUE;
            this.f5350s = false;
        }

        @Override // B1.Z
        public final int E(@NotNull AbstractC2531a abstractC2531a) {
            L l11 = L.this;
            H g02 = l11.f5282a.g0();
            H.d Q11 = g02 != null ? g02.Q() : null;
            H.d dVar = H.d.Measuring;
            I i11 = this.f5352u;
            if (Q11 == dVar) {
                i11.t(true);
            } else {
                H g03 = l11.f5282a.g0();
                if ((g03 != null ? g03.Q() : null) == H.d.LayingOut) {
                    i11.s(true);
                }
            }
            this.f5343l = true;
            int E11 = l11.K().E(abstractC2531a);
            this.f5343l = false;
            return E11;
        }

        public final void F1() {
            this.f5329A = true;
            L l11 = L.this;
            H g02 = l11.f5282a.g0();
            float h22 = P().h2();
            H h11 = l11.f5282a;
            AbstractC2810k0 e02 = h11.e0();
            C2823x J11 = h11.J();
            while (e02 != J11) {
                Intrinsics.g(e02, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                F f7 = (F) e02;
                h22 += f7.h2();
                e02 = f7.f2();
            }
            if (h22 != this.f5357z) {
                this.f5357z = h22;
                if (g02 != null) {
                    g02.V0();
                }
                if (g02 != null) {
                    g02.s0();
                }
            }
            if (!this.f5350s) {
                if (g02 != null) {
                    g02.s0();
                }
                w1();
                if (this.f5337f && g02 != null) {
                    g02.e1(false);
                }
            }
            if (g02 == null) {
                this.f5339h = 0;
            } else if (!this.f5337f && g02.Q() == H.d.LayingOut) {
                if (this.f5339h != Integer.MAX_VALUE) {
                    A1.a.b("Place was called on a node which was placed already");
                    throw null;
                }
                this.f5339h = g02.N().f5292k;
                g02.N().f5292k++;
            }
            M();
        }

        @Override // D1.InterfaceC2791b
        public final InterfaceC2791b G() {
            L N11;
            H g02 = L.this.f5282a.g0();
            if (g02 == null || (N11 = g02.N()) == null) {
                return null;
            }
            return N11.r();
        }

        public final boolean J1(long j11) {
            L l11 = L.this;
            if (l11.f5282a.A0()) {
                A1.a.a("measure is called on a deactivated node");
                throw null;
            }
            x0 b11 = K.b(l11.f5282a);
            H g02 = l11.f5282a.g0();
            boolean z11 = true;
            l11.f5282a.i1(l11.f5282a.x() || (g02 != null && g02.x()));
            if (!l11.f5282a.W() && Z1.b.e(s0(), j11)) {
                ((AndroidComposeView) b11).c0(l11.f5282a, false);
                l11.f5282a.h1();
                return false;
            }
            this.f5352u.r(false);
            b0(d.f5363b);
            this.f5340i = true;
            long a11 = l11.K().a();
            G0(j11);
            L.h(l11, j11);
            if (Z1.q.c(l11.K().a(), a11) && l11.K().u0() == u0() && l11.K().l0() == l0()) {
                z11 = false;
            }
            E0(Z1.r.a(l11.K().u0(), l11.K().l0()));
            return z11;
        }

        public final void K1() {
            H g02;
            try {
                this.f5337f = true;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (!this.f5341j) {
                    A1.a.b("replace called on unplaced item");
                    throw null;
                }
                boolean z11 = this.f5350s;
                G1(this.f5344m, this.f5347p, this.f5345n, this.f5346o);
                if (z11 && !this.f5329A && (g02 = L.this.f5282a.g0()) != null) {
                    g02.e1(false);
                }
                this.f5337f = false;
            } catch (Throwable th3) {
                th = th3;
                this.f5337f = false;
                throw th;
            }
        }

        public final void L1() {
            this.f5354w = true;
        }

        @Override // D1.InterfaceC2791b
        public final void M() {
            U0.b<H> o02;
            int m11;
            this.f5355x = true;
            I i11 = this.f5352u;
            i11.n();
            L l11 = L.this;
            if (l11.A() && (m11 = (o02 = l11.f5282a.o0()).m()) > 0) {
                H[] l12 = o02.l();
                int i12 = 0;
                do {
                    H h11 = l12[i12];
                    if (h11.W() && h11.Y() == H.f.InMeasureBlock && H.Y0(h11)) {
                        H.f1(l11.f5282a, false, 7);
                    }
                    i12++;
                } while (i12 < m11);
            }
            if (l11.f5287f || (!this.f5343l && !P().p1() && l11.A())) {
                l11.f5286e = false;
                H.d B11 = l11.B();
                l11.f5284c = H.d.LayingOut;
                l11.X(false);
                H h12 = l11.f5282a;
                ((AndroidComposeView) K.b(h12)).getF40501C().d(h12, false, this.f5356y);
                l11.f5284c = B11;
                if (P().p1() && l11.v()) {
                    requestLayout();
                }
                l11.f5287f = false;
            }
            if (i11.k()) {
                i11.p(true);
            }
            if (i11.f() && i11.j()) {
                i11.m();
            }
            this.f5355x = false;
        }

        public final void M1(@NotNull H.f fVar) {
            this.f5342k = fVar;
        }

        @Override // D1.InterfaceC2791b
        public final boolean N() {
            return this.f5350s;
        }

        public final void N1() {
            this.f5350s = true;
        }

        @Override // B1.InterfaceC2552v
        public final int O(int i11) {
            C1();
            return L.this.K().O(i11);
        }

        public final boolean O1() {
            Object obj = this.f5349r;
            L l11 = L.this;
            if ((obj == null && l11.K().m() == null) || !this.f5348q) {
                return false;
            }
            this.f5348q = false;
            this.f5349r = l11.K().m();
            return true;
        }

        @Override // D1.InterfaceC2791b
        @NotNull
        public final C2823x P() {
            return L.this.f5282a.J();
        }

        @Override // B1.InterfaceC2552v
        public final int T(int i11) {
            C1();
            return L.this.K().T(i11);
        }

        @Override // B1.InterfaceC2552v
        public final int Y(int i11) {
            C1();
            return L.this.K().Y(i11);
        }

        @Override // B1.U
        @NotNull
        public final B1.m0 a0(long j11) {
            H.f fVar;
            L l11 = L.this;
            H.f M11 = l11.f5282a.M();
            H.f fVar2 = H.f.NotUsed;
            if (M11 == fVar2) {
                l11.f5282a.p();
            }
            if (T.a(l11.f5282a)) {
                a H11 = l11.H();
                Intrinsics.f(H11);
                H11.C1(fVar2);
                H11.a0(j11);
            }
            H h11 = l11.f5282a;
            H g02 = h11.g0();
            if (g02 == null) {
                this.f5342k = fVar2;
            } else {
                if (this.f5342k != fVar2 && !h11.x()) {
                    A1.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                    throw null;
                }
                int i11 = a.f5358a[g02.Q().ordinal()];
                if (i11 == 1) {
                    fVar = H.f.InMeasureBlock;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + g02.Q());
                    }
                    fVar = H.f.InLayoutBlock;
                }
                this.f5342k = fVar;
            }
            J1(j11);
            return this;
        }

        @Override // D1.InterfaceC2791b
        public final void b0(@NotNull Function1<? super InterfaceC2791b, Unit> function1) {
            U0.b<H> o02 = L.this.f5282a.o0();
            int m11 = o02.m();
            if (m11 > 0) {
                H[] l11 = o02.l();
                int i11 = 0;
                do {
                    function1.invoke(l11[i11].N().r());
                    i11++;
                } while (i11 < m11);
            }
        }

        @Override // D1.InterfaceC2796d0
        public final void c0(boolean z11) {
            L l11 = L.this;
            boolean o12 = l11.K().o1();
            if (z11 != o12) {
                l11.K().c0(o12);
                this.f5335G = true;
            }
        }

        @NotNull
        public final HashMap e1() {
            boolean z11 = this.f5343l;
            I i11 = this.f5352u;
            if (!z11) {
                L l11 = L.this;
                if (l11.B() == H.d.Measuring) {
                    i11.r(true);
                    if (i11.f()) {
                        l11.O();
                    }
                } else {
                    i11.q(true);
                }
            }
            P().w1(true);
            M();
            P().w1(false);
            return i11.g();
        }

        @NotNull
        public final List<b> g1() {
            L l11 = L.this;
            l11.f5282a.r1();
            boolean z11 = this.f5354w;
            U0.b<b> bVar = this.f5353v;
            if (!z11) {
                return bVar.g();
            }
            H h11 = l11.f5282a;
            U0.b<H> o02 = h11.o0();
            int m11 = o02.m();
            if (m11 > 0) {
                H[] l12 = o02.l();
                int i11 = 0;
                do {
                    H h12 = l12[i11];
                    if (bVar.m() <= i11) {
                        bVar.b(h12.N().I());
                    } else {
                        bVar.x(i11, h12.N().I());
                    }
                    i11++;
                } while (i11 < m11);
            }
            bVar.v(h11.A().size(), bVar.m());
            this.f5354w = false;
            return bVar.g();
        }

        public final Z1.b h1() {
            if (this.f5340i) {
                return Z1.b.a(s0());
            }
            return null;
        }

        public final boolean i1() {
            return this.f5355x;
        }

        @NotNull
        public final H.f l1() {
            return this.f5342k;
        }

        @Override // B1.Z, B1.InterfaceC2552v
        public final Object m() {
            return this.f5349r;
        }

        public final int n1() {
            return this.f5339h;
        }

        @Override // B1.m0
        public final int o0() {
            return L.this.K().o0();
        }

        public final float o1() {
            return this.f5357z;
        }

        public final void p1() {
            this.f5348q = true;
        }

        public final boolean q1() {
            return this.f5351t;
        }

        @Override // B1.m0
        public final int r0() {
            return L.this.K().r0();
        }

        @Override // D1.InterfaceC2791b
        public final void requestLayout() {
            H h11 = L.this.f5282a;
            int i11 = H.f5237N;
            h11.e1(false);
        }

        @Override // D1.InterfaceC2791b
        @NotNull
        public final AbstractC2789a s() {
            return this.f5352u;
        }

        public final void s1() {
            L.this.f5283b = true;
        }

        @Override // B1.m0
        protected final void x0(long j11, float f7, Function1<? super InterfaceC7825i0, Unit> function1) {
            I1(j11, f7, function1, null);
        }

        @Override // B1.m0
        protected final void y0(long j11, float f7, @NotNull o1.d dVar) {
            I1(j11, f7, null, dVar);
        }
    }

    static final class c extends AbstractC7737t implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            L l11 = L.this;
            l11.K().a0(l11.f5301t);
            return Unit.f71690a;
        }
    }

    public L(@NotNull H h11) {
        this.f5282a = h11;
    }

    public static final void g(L l11, long j11) {
        l11.f5284c = H.d.LookaheadMeasuring;
        l11.f5288g = false;
        H h11 = l11.f5282a;
        ((AndroidComposeView) K.b(h11)).getF40501C().e(h11, true, new S(l11, j11));
        l11.P();
        if (T.a(h11)) {
            l11.O();
        } else {
            l11.f5285d = true;
        }
        l11.f5284c = H.d.Idle;
    }

    public static final void h(L l11, long j11) {
        H.d dVar = l11.f5284c;
        H.d dVar2 = H.d.Idle;
        if (dVar != dVar2) {
            A1.a.b("layout state is not idle before measure starts");
            throw null;
        }
        H.d dVar3 = H.d.Measuring;
        l11.f5284c = dVar3;
        l11.f5285d = false;
        l11.f5301t = j11;
        H h11 = l11.f5282a;
        ((AndroidComposeView) K.b(h11)).getF40501C().e(h11, false, l11.f5302u);
        if (l11.f5284c == dVar3) {
            l11.O();
            l11.f5284c = dVar2;
        }
    }

    public final boolean A() {
        return this.f5286e;
    }

    @NotNull
    public final H.d B() {
        return this.f5284c;
    }

    public final a C() {
        return this.f5300s;
    }

    public final boolean D() {
        return this.f5297p;
    }

    public final boolean E() {
        return this.f5296o;
    }

    public final boolean F() {
        return this.f5289h;
    }

    public final boolean G() {
        return this.f5288g;
    }

    public final a H() {
        return this.f5300s;
    }

    @NotNull
    public final b I() {
        return this.f5299r;
    }

    public final boolean J() {
        return this.f5285d;
    }

    @NotNull
    public final AbstractC2810k0 K() {
        return this.f5282a.c0().l();
    }

    public final int L() {
        return this.f5299r.u0();
    }

    public final void M() {
        this.f5299r.p1();
        a aVar = this.f5300s;
        if (aVar != null) {
            aVar.h1();
        }
    }

    public final void N() {
        this.f5299r.L1();
        a aVar = this.f5300s;
        if (aVar != null) {
            aVar.B1();
        }
    }

    public final void O() {
        this.f5286e = true;
        this.f5287f = true;
    }

    public final void P() {
        this.f5289h = true;
        this.f5290i = true;
    }

    public final void Q() {
        this.f5288g = true;
    }

    public final void R() {
        this.f5285d = true;
    }

    public final void S() {
        H.d Q11 = this.f5282a.Q();
        if (Q11 == H.d.LayingOut || Q11 == H.d.LookaheadLayingOut) {
            if (this.f5299r.i1()) {
                X(true);
            } else {
                W(true);
            }
        }
        if (Q11 == H.d.LookaheadLayingOut) {
            a aVar = this.f5300s;
            if (aVar == null || !aVar.c1()) {
                Y(true);
            } else {
                Z(true);
            }
        }
    }

    public final void T() {
        AbstractC2789a s11;
        this.f5299r.s().o();
        a aVar = this.f5300s;
        if (aVar == null || (s11 = aVar.s()) == null) {
            return;
        }
        s11.o();
    }

    public final void U(int i11) {
        int i12 = this.f5295n;
        this.f5295n = i11;
        if ((i12 == 0) != (i11 == 0)) {
            H g02 = this.f5282a.g0();
            L N11 = g02 != null ? g02.N() : null;
            if (N11 != null) {
                if (i11 == 0) {
                    N11.U(N11.f5295n - 1);
                } else {
                    N11.U(N11.f5295n + 1);
                }
            }
        }
    }

    public final void V(int i11) {
        int i12 = this.f5298q;
        this.f5298q = i11;
        if ((i12 == 0) != (i11 == 0)) {
            H g02 = this.f5282a.g0();
            L N11 = g02 != null ? g02.N() : null;
            if (N11 != null) {
                if (i11 == 0) {
                    N11.V(N11.f5298q - 1);
                } else {
                    N11.V(N11.f5298q + 1);
                }
            }
        }
    }

    public final void W(boolean z11) {
        if (this.f5294m != z11) {
            this.f5294m = z11;
            if (z11 && !this.f5293l) {
                U(this.f5295n + 1);
            } else {
                if (z11 || this.f5293l) {
                    return;
                }
                U(this.f5295n - 1);
            }
        }
    }

    public final void X(boolean z11) {
        if (this.f5293l != z11) {
            this.f5293l = z11;
            if (z11 && !this.f5294m) {
                U(this.f5295n + 1);
            } else {
                if (z11 || this.f5294m) {
                    return;
                }
                U(this.f5295n - 1);
            }
        }
    }

    public final void Y(boolean z11) {
        if (this.f5297p != z11) {
            this.f5297p = z11;
            if (z11 && !this.f5296o) {
                V(this.f5298q + 1);
            } else {
                if (z11 || this.f5296o) {
                    return;
                }
                V(this.f5298q - 1);
            }
        }
    }

    public final void Z(boolean z11) {
        if (this.f5296o != z11) {
            this.f5296o = z11;
            if (z11 && !this.f5297p) {
                V(this.f5298q + 1);
            } else {
                if (z11 || this.f5297p) {
                    return;
                }
                V(this.f5298q - 1);
            }
        }
    }

    public final void a0() {
        H g02;
        boolean O12 = this.f5299r.O1();
        H h11 = this.f5282a;
        if (O12 && (g02 = h11.g0()) != null) {
            H.f1(g02, false, 7);
        }
        a aVar = this.f5300s;
        if (aVar == null || !aVar.G1()) {
            return;
        }
        if (T.a(h11)) {
            H g03 = h11.g0();
            if (g03 != null) {
                H.f1(g03, false, 7);
                return;
            }
            return;
        }
        H g04 = h11.g0();
        if (g04 != null) {
            H.d1(g04, false, 7);
        }
    }

    public final void q() {
        if (this.f5300s == null) {
            this.f5300s = new a();
        }
    }

    @NotNull
    public final b r() {
        return this.f5299r;
    }

    public final int s() {
        return this.f5295n;
    }

    public final int t() {
        return this.f5298q;
    }

    public final boolean u() {
        return this.f5294m;
    }

    public final boolean v() {
        return this.f5293l;
    }

    public final boolean w() {
        return this.f5283b;
    }

    public final int x() {
        return this.f5299r.l0();
    }

    public final Z1.b y() {
        return this.f5299r.h1();
    }

    public final Z1.b z() {
        a aVar = this.f5300s;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }
}
