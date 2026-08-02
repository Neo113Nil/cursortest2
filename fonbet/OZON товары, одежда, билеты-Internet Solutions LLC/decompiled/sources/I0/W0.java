package I0;

import B0.C2471f1;
import B0.C2489l1;
import B0.EnumC2526y0;
import B0.EnumC2529z0;
import B0.InterfaceC2477h1;
import B0.R1;
import B0.f2;
import B0.h2;
import I0.F;
import K1.C3422b;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import androidx.compose.ui.platform.S1;
import androidx.compose.ui.platform.U1;
import k1.C7459e;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t1.InterfaceC9723a;

/* loaded from: classes.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    private final f2 f11387a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Q1.D f11388b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f11389c;

    /* renamed from: d, reason: collision with root package name */
    private B0.O0 f11390d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3991w0 f11391e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.compose.ui.platform.I0 f11392f;

    /* renamed from: g, reason: collision with root package name */
    private S1 f11393g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC9723a f11394h;

    /* renamed from: i, reason: collision with root package name */
    private j1.r f11395i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C3991w0 f11396j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C3991w0 f11397k;

    /* renamed from: l, reason: collision with root package name */
    private long f11398l;

    /* renamed from: m, reason: collision with root package name */
    private Integer f11399m;

    /* renamed from: n, reason: collision with root package name */
    private long f11400n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C3991w0 f11401o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final C3991w0 f11402p;

    /* renamed from: q, reason: collision with root package name */
    private int f11403q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private Q1.K f11404r;

    /* renamed from: s, reason: collision with root package name */
    private InterfaceC3198n0 f11405s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final g f11406t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final a f11407u;

    public static final class a implements r {
        a() {
        }

        @Override // I0.r
        public final boolean a(long j11, @NotNull F f7) {
            B0.O0 H11;
            W0 w02 = W0.this;
            if (!w02.A() || w02.K().f().length() == 0 || (H11 = w02.H()) == null || H11.j() == null) {
                return false;
            }
            j1.r B11 = w02.B();
            if (B11 != null) {
                B11.d();
            }
            w02.f11398l = j11;
            w02.f11403q = -1;
            w02.t(true);
            d(w02.K(), w02.f11398l, true, f7);
            return true;
        }

        @Override // I0.r
        public final void b() {
        }

        @Override // I0.r
        public final boolean c(long j11, @NotNull F f7) {
            B0.O0 H11;
            W0 w02 = W0.this;
            if (!w02.A() || w02.K().f().length() == 0 || (H11 = w02.H()) == null || H11.j() == null) {
                return false;
            }
            d(w02.K(), j11, false, f7);
            return true;
        }

        public final void d(@NotNull Q1.K k11, long j11, boolean z11, @NotNull F f7) {
            W0.this.U(K1.Q.e(W0.m(W0.this, k11, j11, z11, false, f7, false)) ? EnumC2529z0.Cursor : EnumC2529z0.Selection);
        }
    }

    static final class b extends AbstractC7737t implements Function1<Q1.K, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f11409b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Q1.K k11) {
            return Unit.f71690a;
        }
    }

    /* loaded from: classes8.dex */
    static final class c extends AbstractC7737t implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            W0 w02 = W0.this;
            w02.o(true);
            w02.L();
            return Unit.f71690a;
        }
    }

    /* loaded from: classes8.dex */
    static final class d extends AbstractC7737t implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            W0 w02 = W0.this;
            w02.r();
            w02.L();
            return Unit.f71690a;
        }
    }

    /* loaded from: classes8.dex */
    static final class e extends AbstractC7737t implements Function0<Unit> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            W0 w02 = W0.this;
            w02.N();
            w02.L();
            return Unit.f71690a;
        }
    }

    /* loaded from: classes8.dex */
    static final class f extends AbstractC7737t implements Function0<Unit> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            W0.this.O();
            return Unit.f71690a;
        }
    }

    public static final class g implements InterfaceC2477h1 {
        g() {
        }

        private final void e() {
            W0 w02 = W0.this;
            W0.i(w02, null);
            W0.e(w02, null);
            w02.d0(true);
            w02.f11399m = null;
            boolean e11 = K1.Q.e(w02.K().e());
            w02.U(e11 ? EnumC2529z0.Cursor : EnumC2529z0.Selection);
            B0.O0 H11 = w02.H();
            if (H11 != null) {
                H11.L(!e11 && X0.b(w02, true));
            }
            B0.O0 H12 = w02.H();
            if (H12 != null) {
                H12.K(!e11 && X0.b(w02, false));
            }
            B0.O0 H13 = w02.H();
            if (H13 == null) {
                return;
            }
            H13.I(e11 && X0.b(w02, true));
        }

        @Override // B0.InterfaceC2477h1
        public final void a() {
        }

        @Override // B0.InterfaceC2477h1
        public final void b(long j11) {
            R1 j12;
            W0 w02 = W0.this;
            if (!w02.A() || w02.K().f().length() == 0) {
                return;
            }
            w02.f11400n = C7459e.k(w02.f11400n, j11);
            B0.O0 H11 = w02.H();
            if (H11 != null && (j12 = H11.j()) != null) {
                W0.e(w02, C7459e.a(C7459e.k(w02.f11398l, w02.f11400n)));
                if (w02.f11399m == null) {
                    C7459e w11 = w02.w();
                    Intrinsics.f(w11);
                    if (!j12.f(w11.n())) {
                        int transformedToOriginal = w02.F().transformedToOriginal(j12.d(w02.f11398l, true));
                        Q1.D F11 = w02.F();
                        C7459e w12 = w02.w();
                        Intrinsics.f(w12);
                        F d11 = transformedToOriginal == F11.transformedToOriginal(j12.d(w12.n(), true)) ? F.a.d() : F.a.f();
                        Q1.K K11 = w02.K();
                        C7459e w13 = w02.w();
                        Intrinsics.f(w13);
                        W0.m(w02, K11, w13.n(), false, false, d11, true);
                        int i11 = K1.Q.f15010c;
                    }
                }
                Integer num = w02.f11399m;
                int intValue = num != null ? num.intValue() : j12.d(w02.f11398l, false);
                C7459e w14 = w02.w();
                Intrinsics.f(w14);
                int d12 = j12.d(w14.n(), false);
                if (w02.f11399m == null && intValue == d12) {
                    return;
                }
                Q1.K K12 = w02.K();
                C7459e w15 = w02.w();
                Intrinsics.f(w15);
                W0.m(w02, K12, w15.n(), false, false, F.a.f(), true);
                int i112 = K1.Q.f15010c;
            }
            w02.d0(false);
        }

        @Override // B0.InterfaceC2477h1
        public final void c(long j11) {
            W0 w02;
            long j12;
            R1 j13;
            R1 j14;
            long j15;
            W0 w03 = W0.this;
            if (w03.A() && w03.y() == null) {
                W0.i(w03, EnumC2526y0.SelectionEnd);
                w03.f11403q = -1;
                w03.L();
                B0.O0 H11 = w03.H();
                if (H11 == null || (j14 = H11.j()) == null || !j14.f(j11)) {
                    w02 = w03;
                    j12 = j11;
                    B0.O0 H12 = w02.H();
                    if (H12 != null && (j13 = H12.j()) != null) {
                        int transformedToOriginal = w02.F().transformedToOriginal(j13.d(j12, true));
                        Q1.K a11 = W0.a(w02, w02.K().c(), K1.S.a(transformedToOriginal, transformedToOriginal));
                        w02.t(false);
                        InterfaceC9723a D11 = w02.D();
                        if (D11 != null) {
                            D11.a(9);
                        }
                        w02.G().invoke(a11);
                    }
                } else {
                    if (w03.K().f().length() == 0) {
                        return;
                    }
                    w03.t(false);
                    Q1.K K11 = w03.K();
                    j15 = K1.Q.f15009b;
                    long m11 = W0.m(w03, Q1.K.a(K11, null, j15, 5), j11, true, false, F.a.f(), true);
                    w02 = w03;
                    j12 = j11;
                    w02.f11399m = Integer.valueOf((int) (m11 >> 32));
                }
                w02.U(EnumC2529z0.None);
                w02.f11398l = j12;
                W0.e(w02, C7459e.a(w02.f11398l));
                w02.f11400n = 0L;
            }
        }

        @Override // B0.InterfaceC2477h1
        public final void d() {
        }

        @Override // B0.InterfaceC2477h1
        public final void onCancel() {
            e();
        }

        @Override // B0.InterfaceC2477h1
        public final void onStop() {
            e();
        }
    }

    public W0() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(EnumC2529z0 enumC2529z0) {
        B0.O0 o02 = this.f11390d;
        if (o02 != null) {
            if (o02.d() == enumC2529z0) {
                o02 = null;
            }
            if (o02 != null) {
                o02.A(enumC2529z0);
            }
        }
    }

    public static final /* synthetic */ Q1.K a(W0 w02, C3422b c3422b, long j11) {
        w02.getClass();
        return p(c3422b, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(boolean z11) {
        B0.O0 o02 = this.f11390d;
        if (o02 != null) {
            o02.J(z11);
        }
        if (z11) {
            c0();
        } else {
            L();
        }
    }

    public static final void e(W0 w02, C7459e c7459e) {
        w02.f11402p.setValue(c7459e);
    }

    public static final void i(W0 w02, EnumC2526y0 enumC2526y0) {
        w02.f11401o.setValue(enumC2526y0);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public static final long m(W0 w02, Q1.K k11, long j11, boolean z11, boolean z12, F f7, boolean z13) {
        long j12;
        R1 j13;
        InterfaceC9723a interfaceC9723a;
        int i11;
        B0.O0 o02 = w02.f11390d;
        if (o02 == null || (j13 = o02.j()) == null) {
            j12 = K1.Q.f15009b;
            return j12;
        }
        Q1.D d11 = w02.f11388b;
        long e11 = k11.e();
        int i12 = K1.Q.f15010c;
        long a11 = K1.S.a(d11.originalToTransformed((int) (e11 >> 32)), w02.f11388b.originalToTransformed((int) (k11.e() & 4294967295L)));
        boolean z14 = false;
        int d12 = j13.d(j11, false);
        int i13 = (z12 || z11) ? d12 : (int) (a11 >> 32);
        int i14 = (!z12 || z11) ? d12 : (int) (a11 & 4294967295L);
        InterfaceC3198n0 interfaceC3198n0 = w02.f11405s;
        InterfaceC3198n0 c11 = C3202p0.c(j13.e(), i13, i14, (z11 || interfaceC3198n0 == null || (i11 = w02.f11403q) == -1) ? -1 : i11, a11, z11, z12);
        if (!((S0) c11).d(interfaceC3198n0)) {
            return k11.e();
        }
        w02.f11405s = c11;
        w02.f11403q = d12;
        C3220z a12 = f7.a(c11);
        long a13 = K1.S.a(w02.f11388b.transformedToOriginal(a12.d().c()), w02.f11388b.transformedToOriginal(a12.b().c()));
        if (K1.Q.d(a13, k11.e())) {
            return k11.e();
        }
        boolean z15 = K1.Q.i(a13) != K1.Q.i(k11.e()) && K1.Q.d(K1.S.a((int) (4294967295L & a13), (int) (a13 >> 32)), k11.e());
        boolean z16 = K1.Q.e(a13) && K1.Q.e(k11.e());
        if (z13 && k11.f().length() > 0 && !z15 && !z16 && (interfaceC9723a = w02.f11394h) != null) {
            interfaceC9723a.a(9);
        }
        w02.f11389c.invoke(p(k11.c(), a13));
        if (!z13) {
            w02.d0(!K1.Q.e(a13));
        }
        B0.O0 o03 = w02.f11390d;
        if (o03 != null) {
            o03.C(z13);
        }
        B0.O0 o04 = w02.f11390d;
        if (o04 != null) {
            o04.L(!K1.Q.e(a13) && X0.b(w02, true));
        }
        B0.O0 o05 = w02.f11390d;
        if (o05 != null) {
            o05.K(!K1.Q.e(a13) && X0.b(w02, false));
        }
        B0.O0 o06 = w02.f11390d;
        if (o06 == null) {
            return a13;
        }
        if (K1.Q.e(a13) && X0.b(w02, true)) {
            z14 = true;
        }
        o06.I(z14);
        return a13;
    }

    private static Q1.K p(C3422b c3422b, long j11) {
        return new Q1.K(c3422b, j11, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A() {
        return ((Boolean) this.f11397k.getValue()).booleanValue();
    }

    public final j1.r B() {
        return this.f11395i;
    }

    public final long C(boolean z11) {
        R1 j11;
        K1.K e11;
        C3422b J11;
        B0.O0 o02 = this.f11390d;
        if (o02 == null || (j11 = o02.j()) == null || (e11 = j11.e()) == null || (J11 = J()) == null) {
            return 9205357640488583168L;
        }
        if (!Intrinsics.d(J11.h(), e11.k().j().h())) {
            return 9205357640488583168L;
        }
        long e12 = K().e();
        int i11 = K1.Q.f15010c;
        return l1.a(e11, this.f11388b.originalToTransformed((int) (z11 ? e12 >> 32 : e12 & 4294967295L)), z11, K1.Q.i(K().e()));
    }

    public final InterfaceC9723a D() {
        return this.f11394h;
    }

    @NotNull
    public final a E() {
        return this.f11407u;
    }

    @NotNull
    public final Q1.D F() {
        return this.f11388b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1<Q1.K, kotlin.Unit>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function1<Q1.K, Unit> G() {
        return this.f11389c;
    }

    public final B0.O0 H() {
        return this.f11390d;
    }

    @NotNull
    public final g I() {
        return this.f11406t;
    }

    public final C3422b J() {
        C2471f1 v11;
        B0.O0 o02 = this.f11390d;
        if (o02 == null || (v11 = o02.v()) == null) {
            return null;
        }
        return v11.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Q1.K K() {
        return (Q1.K) this.f11391e.getValue();
    }

    public final void L() {
        S1 s12;
        S1 s13 = this.f11393g;
        if ((s13 != null ? s13.getStatus() : null) != U1.Shown || (s12 = this.f11393g) == null) {
            return;
        }
        s12.hide();
    }

    public final boolean M() {
        return !Intrinsics.d(this.f11404r.f(), K().f());
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public final void N() {
        C3422b text;
        androidx.compose.ui.platform.I0 i02 = this.f11392f;
        if (i02 == null || (text = i02.getText()) == null) {
            return;
        }
        C3422b.a aVar = new C3422b.a(Q1.L.c(K(), K().f().length()));
        aVar.d(text);
        C3422b i11 = aVar.i();
        C3422b b11 = Q1.L.b(K(), K().f().length());
        C3422b.a aVar2 = new C3422b.a(i11);
        aVar2.d(b11);
        C3422b i12 = aVar2.i();
        int length = text.length() + K1.Q.h(K().e());
        this.f11389c.invoke(p(i12, K1.S.a(length, length)));
        U(EnumC2529z0.None);
        f2 f2Var = this.f11387a;
        if (f2Var != null) {
            f2Var.a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public final void O() {
        Q1.K p11 = p(K().c(), K1.S.a(0, K().f().length()));
        this.f11389c.invoke(p11);
        this.f11404r = Q1.K.a(this.f11404r, null, p11.e(), 5);
        t(true);
    }

    public final void P(androidx.compose.ui.platform.I0 i02) {
        this.f11392f = i02;
    }

    public final void Q(long j11) {
        long j12;
        B0.O0 o02 = this.f11390d;
        if (o02 != null) {
            o02.z(j11);
        }
        B0.O0 o03 = this.f11390d;
        if (o03 != null) {
            int i11 = K1.Q.f15010c;
            j12 = K1.Q.f15009b;
            o03.H(j12);
        }
        if (K1.Q.e(j11)) {
            return;
        }
        u();
    }

    public final void R(boolean z11) {
        this.f11396j.setValue(Boolean.valueOf(z11));
    }

    public final void S(boolean z11) {
        this.f11397k.setValue(Boolean.valueOf(z11));
    }

    public final void T(j1.r rVar) {
        this.f11395i = rVar;
    }

    public final void V(InterfaceC9723a interfaceC9723a) {
        this.f11394h = interfaceC9723a;
    }

    public final void W(@NotNull Q1.D d11) {
        this.f11388b = d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X(@NotNull Function1<? super Q1.K, Unit> function1) {
        this.f11389c = (AbstractC7737t) function1;
    }

    public final void Y(long j11) {
        long j12;
        B0.O0 o02 = this.f11390d;
        if (o02 != null) {
            o02.H(j11);
        }
        B0.O0 o03 = this.f11390d;
        if (o03 != null) {
            int i11 = K1.Q.f15010c;
            j12 = K1.Q.f15009b;
            o03.z(j12);
        }
        if (K1.Q.e(j11)) {
            return;
        }
        u();
    }

    public final void Z(B0.O0 o02) {
        this.f11390d = o02;
    }

    public final void a0(S1 s12) {
        this.f11393g = s12;
    }

    public final void b0(@NotNull Q1.K k11) {
        this.f11391e.setValue(k11);
    }

    public final void c0() {
        S1 s12;
        C7460f c7460f;
        B0.O0 o02;
        float f7;
        B1.B i11;
        K1.K e11;
        B1.B i12;
        K1.K e12;
        B1.B i13;
        B1.B i14;
        androidx.compose.ui.platform.I0 i02;
        if (A()) {
            B0.O0 o03 = this.f11390d;
            if (o03 == null || o03.x()) {
                c cVar = !K1.Q.e(K().e()) ? new c() : null;
                d dVar = (K1.Q.e(K().e()) || !z()) ? null : new d();
                e eVar = (z() && (i02 = this.f11392f) != null && i02.b()) ? new e() : null;
                f fVar = K1.Q.f(K().e()) != K().f().length() ? new f() : null;
                S1 s13 = this.f11393g;
                if (s13 != null) {
                    B0.O0 o04 = this.f11390d;
                    if (o04 != null) {
                        B0.O0 o05 = o04.y() ? null : o04;
                        if (o05 != null) {
                            int originalToTransformed = this.f11388b.originalToTransformed((int) (K().e() >> 32));
                            int originalToTransformed2 = this.f11388b.originalToTransformed((int) (K().e() & 4294967295L));
                            B0.O0 o06 = this.f11390d;
                            long j11 = 0;
                            long y11 = (o06 == null || (i14 = o06.i()) == null) ? 0L : i14.y(C(true));
                            B0.O0 o07 = this.f11390d;
                            if (o07 != null && (i13 = o07.i()) != null) {
                                j11 = i13.y(C(false));
                            }
                            B0.O0 o08 = this.f11390d;
                            float f11 = 0.0f;
                            if (o08 == null || (i12 = o08.i()) == null) {
                                s12 = s13;
                                o02 = o05;
                                f7 = 0.0f;
                            } else {
                                R1 j12 = o05.j();
                                float q11 = (j12 == null || (e12 = j12.e()) == null) ? 0.0f : e12.e(originalToTransformed).q();
                                s12 = s13;
                                o02 = o05;
                                f7 = C7459e.h(i12.y(P9.a.a(0.0f, q11)));
                            }
                            B0.O0 o09 = this.f11390d;
                            if (o09 != null && (i11 = o09.i()) != null) {
                                R1 j13 = o02.j();
                                f11 = C7459e.h(i11.y(P9.a.a(0.0f, (j13 == null || (e11 = j13.e()) == null) ? 0.0f : e11.e(originalToTransformed2).q())));
                            }
                            c7460f = new C7460f(Math.min(C7459e.g(y11), C7459e.g(j11)), Math.min(f7, f11), Math.max(C7459e.g(y11), C7459e.g(j11)), (o02.v().a().g() * 25) + Math.max(C7459e.h(y11), C7459e.h(j11)));
                            s12.a(c7460f, cVar, eVar, dVar, fVar);
                        }
                    }
                    s12 = s13;
                    c7460f = C7460f.f70279e;
                    s12.a(c7460f, cVar, eVar, dVar, fVar);
                }
            }
        }
    }

    public final void n() {
        long j11;
        long j12;
        B0.O0 o02 = this.f11390d;
        if (o02 != null) {
            int i11 = K1.Q.f15010c;
            j12 = K1.Q.f15009b;
            o02.z(j12);
        }
        B0.O0 o03 = this.f11390d;
        if (o03 == null) {
            return;
        }
        int i12 = K1.Q.f15010c;
        j11 = K1.Q.f15009b;
        o03.H(j11);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public final void o(boolean z11) {
        if (K1.Q.e(K().e())) {
            return;
        }
        androidx.compose.ui.platform.I0 i02 = this.f11392f;
        if (i02 != null) {
            i02.c(Q1.L.a(K()));
        }
        if (z11) {
            int g10 = K1.Q.g(K().e());
            this.f11389c.invoke(p(K().c(), K1.S.a(g10, g10)));
            U(EnumC2529z0.None);
        }
    }

    @NotNull
    public final U0 q() {
        return new U0(this);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public final void r() {
        if (K1.Q.e(K().e())) {
            return;
        }
        androidx.compose.ui.platform.I0 i02 = this.f11392f;
        if (i02 != null) {
            i02.c(Q1.L.a(K()));
        }
        C3422b c11 = Q1.L.c(K(), K().f().length());
        C3422b b11 = Q1.L.b(K(), K().f().length());
        C3422b.a aVar = new C3422b.a(c11);
        aVar.d(b11);
        C3422b i11 = aVar.i();
        int h11 = K1.Q.h(K().e());
        this.f11389c.invoke(p(i11, K1.S.a(h11, h11)));
        U(EnumC2529z0.None);
        f2 f2Var = this.f11387a;
        if (f2Var != null) {
            f2Var.a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public final void s(C7459e c7459e) {
        if (!K1.Q.e(K().e())) {
            B0.O0 o02 = this.f11390d;
            R1 j11 = o02 != null ? o02.j() : null;
            int g10 = (c7459e == null || j11 == null) ? K1.Q.g(K().e()) : this.f11388b.transformedToOriginal(j11.d(c7459e.n(), true));
            this.f11389c.invoke(Q1.K.a(K(), null, K1.S.a(g10, g10), 5));
        }
        U((c7459e == null || K().f().length() <= 0) ? EnumC2529z0.None : EnumC2529z0.Cursor);
        d0(false);
    }

    public final void t(boolean z11) {
        j1.r rVar;
        B0.O0 o02 = this.f11390d;
        if (o02 != null && !o02.e() && (rVar = this.f11395i) != null) {
            rVar.d();
        }
        this.f11404r = K();
        d0(z11);
        U(EnumC2529z0.Selection);
    }

    public final void u() {
        d0(false);
        U(EnumC2529z0.None);
    }

    public final androidx.compose.ui.platform.I0 v() {
        return this.f11392f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C7459e w() {
        return (C7459e) this.f11402p.getValue();
    }

    public final long x(@NotNull Z1.d dVar) {
        Q1.D d11 = this.f11388b;
        long e11 = K().e();
        int i11 = K1.Q.f15010c;
        int originalToTransformed = d11.originalToTransformed((int) (e11 >> 32));
        B0.O0 o02 = this.f11390d;
        R1 j11 = o02 != null ? o02.j() : null;
        Intrinsics.f(j11);
        K1.K e12 = j11.e();
        C7460f e13 = e12.e(kotlin.ranges.h.e(originalToTransformed, 0, e12.k().j().length()));
        return P9.a.a((dVar.v1(C2489l1.a()) / 2) + e13.n(), e13.h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC2526y0 y() {
        return (EnumC2526y0) this.f11401o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z() {
        return ((Boolean) this.f11396j.getValue()).booleanValue();
    }

    public W0(f2 f2Var) {
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        C3991w0 f13;
        C3991w0 f14;
        this.f11387a = f2Var;
        this.f11388b = h2.d();
        this.f11389c = b.f11409b;
        f7 = n1.f(new Q1.K(7, 0L, (String) null), D1.f25195a);
        this.f11391e = f7;
        Boolean bool = Boolean.TRUE;
        f11 = n1.f(bool, D1.f25195a);
        this.f11396j = f11;
        f12 = n1.f(bool, D1.f25195a);
        this.f11397k = f12;
        this.f11398l = 0L;
        this.f11400n = 0L;
        f13 = n1.f(null, D1.f25195a);
        this.f11401o = f13;
        f14 = n1.f(null, D1.f25195a);
        this.f11402p = f14;
        this.f11403q = -1;
        this.f11404r = new Q1.K(7, 0L, (String) null);
        this.f11406t = new g();
        this.f11407u = new a();
    }
}
