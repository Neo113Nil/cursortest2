package D1;

import B1.InterfaceC2553w;
import B1.m0;
import D1.AbstractC2810k0;
import D1.L;
import D1.x0;
import S0.A;
import S0.InterfaceC3963i;
import android.view.View;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.C5251h1;
import androidx.compose.ui.platform.c2;
import c2.C5728b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i1.InterfaceC6986f;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7802U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class H implements InterfaceC3963i, B1.o0, y0, InterfaceC2801g, x0.a {

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private static final c f5233J = new c("Undefined intrinsics block and it is required");

    /* renamed from: K, reason: collision with root package name */
    @NotNull
    private static final Function0<H> f5234K = a.f5273b;

    /* renamed from: L, reason: collision with root package name */
    @NotNull
    private static final b f5235L = new b();

    /* renamed from: M, reason: collision with root package name */
    @NotNull
    private static final G f5236M = new G();

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f5237N = 0;

    /* renamed from: A, reason: collision with root package name */
    private B1.L f5238A;

    /* renamed from: B, reason: collision with root package name */
    private AbstractC2810k0 f5239B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f5240C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.e f5241D;

    /* renamed from: E, reason: collision with root package name */
    private androidx.compose.ui.e f5242E;

    /* renamed from: F, reason: collision with root package name */
    private Function1<? super x0, Unit> f5243F;

    /* renamed from: G, reason: collision with root package name */
    private Function1<? super x0, Unit> f5244G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f5245H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f5246I;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5247a;

    /* renamed from: b, reason: collision with root package name */
    private int f5248b;

    /* renamed from: c, reason: collision with root package name */
    private H f5249c;

    /* renamed from: d, reason: collision with root package name */
    private int f5250d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2798e0<H> f5251e;

    /* renamed from: f, reason: collision with root package name */
    private U0.b<H> f5252f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5253g;

    /* renamed from: h, reason: collision with root package name */
    private H f5254h;

    /* renamed from: i, reason: collision with root package name */
    private AndroidComposeView f5255i;

    /* renamed from: j, reason: collision with root package name */
    private C5728b f5256j;

    /* renamed from: k, reason: collision with root package name */
    private int f5257k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5258l;

    /* renamed from: m, reason: collision with root package name */
    private I1.l f5259m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final U0.b<H> f5260n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5261o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private B1.V f5262p;

    /* renamed from: q, reason: collision with root package name */
    private C2825z f5263q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private Z1.d f5264r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private Z1.s f5265s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private c2 f5266t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private S0.A f5267u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private f f5268v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private f f5269w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f5270x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final C2804h0 f5271y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final L f5272z;

    static final class a extends AbstractC7737t implements Function0<H> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f5273b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final H invoke() {
            return new H(3);
        }
    }

    public static final class b implements c2 {
        @Override // androidx.compose.ui.platform.c2
        public final float b() {
            return 16.0f;
        }

        @Override // androidx.compose.ui.platform.c2
        public final long d() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.c2
        public final long e() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.c2
        public final long f() {
            return 0L;
        }
    }

    public static final class c extends e {
        @Override // B1.V
        /* renamed from: measure-3p2s80s */
        public final B1.W mo2measure3p2s80s(B1.Y y11, List list, long j11) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d Idle;
        public static final d LayingOut;
        public static final d LookaheadLayingOut;
        public static final d LookaheadMeasuring;
        public static final d Measuring;

        static {
            d dVar = new d("Measuring", 0);
            Measuring = dVar;
            d dVar2 = new d("LookaheadMeasuring", 1);
            LookaheadMeasuring = dVar2;
            d dVar3 = new d("LayingOut", 2);
            LayingOut = dVar3;
            d dVar4 = new d("LookaheadLayingOut", 3);
            LookaheadLayingOut = dVar4;
            d dVar5 = new d("Idle", 4);
            Idle = dVar5;
            $VALUES = new d[]{dVar, dVar2, dVar3, dVar4, dVar5};
        }

        private d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    public static abstract class e implements B1.V {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f5274a;

        public e(@NotNull String str) {
            this.f5274a = str;
        }

        @Override // B1.V
        public final int maxIntrinsicHeight(InterfaceC2553w interfaceC2553w, List list, int i11) {
            throw new IllegalStateException(this.f5274a.toString());
        }

        @Override // B1.V
        public final int maxIntrinsicWidth(InterfaceC2553w interfaceC2553w, List list, int i11) {
            throw new IllegalStateException(this.f5274a.toString());
        }

        @Override // B1.V
        public final int minIntrinsicHeight(InterfaceC2553w interfaceC2553w, List list, int i11) {
            throw new IllegalStateException(this.f5274a.toString());
        }

        @Override // B1.V
        public final int minIntrinsicWidth(InterfaceC2553w interfaceC2553w, List list, int i11) {
            throw new IllegalStateException(this.f5274a.toString());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        private static final /* synthetic */ f[] $VALUES;
        public static final f InLayoutBlock;
        public static final f InMeasureBlock;
        public static final f NotUsed;

        static {
            f fVar = new f("InMeasureBlock", 0);
            InMeasureBlock = fVar;
            f fVar2 = new f("InLayoutBlock", 1);
            InLayoutBlock = fVar2;
            f fVar3 = new f("NotUsed", 2);
            NotUsed = fVar3;
            $VALUES = new f[]{fVar, fVar2, fVar3};
        }

        private f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5275a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f5275a = iArr;
        }
    }

    static final class h extends AbstractC7737t implements Function0<Unit> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            H.this.N().N();
            return Unit.f71690a;
        }
    }

    static final class i extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<I1.l> f5278c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(kotlin.jvm.internal.M<I1.l> m11) {
            super(0);
            this.f5278c = m11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.e$c] */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.e$c] */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [U0.b] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6, types: [U0.b] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r4v7, types: [I1.l, T] */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C2804h0 c02 = H.this.c0();
            if ((C2804h0.c(c02) & 8) != 0) {
                for (e.c m11 = c02.m(); m11 != null; m11 = m11.getParent$ui_release()) {
                    if ((m11.getKindSet$ui_release() & 8) != 0) {
                        AbstractC2813m abstractC2813m = m11;
                        ?? r32 = 0;
                        while (abstractC2813m != 0) {
                            if (abstractC2813m instanceof E0) {
                                E0 e02 = (E0) abstractC2813m;
                                boolean shouldClearDescendantSemantics = e02.getShouldClearDescendantSemantics();
                                kotlin.jvm.internal.M<I1.l> m12 = this.f5278c;
                                if (shouldClearDescendantSemantics) {
                                    ?? lVar = new I1.l();
                                    m12.f71787a = lVar;
                                    lVar.r(true);
                                }
                                if (e02.getShouldMergeDescendantSemantics()) {
                                    m12.f71787a.s(true);
                                }
                                e02.applySemantics(m12.f71787a);
                            } else if ((abstractC2813m.getKindSet$ui_release() & 8) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                                e.c J12 = abstractC2813m.J1();
                                int i11 = 0;
                                abstractC2813m = abstractC2813m;
                                r32 = r32;
                                while (J12 != null) {
                                    if ((J12.getKindSet$ui_release() & 8) != 0) {
                                        i11++;
                                        r32 = r32;
                                        if (i11 == 1) {
                                            abstractC2813m = J12;
                                        } else {
                                            if (r32 == 0) {
                                                r32 = new U0.b(new e.c[16]);
                                            }
                                            if (abstractC2813m != 0) {
                                                r32.b(abstractC2813m);
                                                abstractC2813m = 0;
                                            }
                                            r32.b(J12);
                                        }
                                    }
                                    J12 = J12.getChild$ui_release();
                                    abstractC2813m = abstractC2813m;
                                    r32 = r32;
                                }
                                if (i11 == 1) {
                                }
                            }
                            abstractC2813m = C2809k.b(r32);
                        }
                    }
                }
            }
            return Unit.f71690a;
        }
    }

    public H() {
        this(3);
    }

    private final void U0(H h11) {
        if (h11.f5272z.s() > 0) {
            this.f5272z.U(r0.s() - 1);
        }
        if (this.f5255i != null) {
            h11.s();
        }
        h11.f5254h = null;
        h11.f5271y.l().E2(null);
        if (h11.f5247a) {
            this.f5250d--;
            U0.b<H> f7 = h11.f5251e.f();
            int m11 = f7.m();
            if (m11 > 0) {
                H[] l11 = f7.l();
                int i11 = 0;
                do {
                    l11[i11].f5271y.l().E2(null);
                    i11++;
                } while (i11 < m11);
            }
        }
        y0();
        V0();
    }

    public static /* synthetic */ boolean Y0(H h11) {
        return h11.X0(h11.f5272z.y());
    }

    private final C2825z d0() {
        C2825z c2825z = this.f5263q;
        if (c2825z != null) {
            return c2825z;
        }
        C2825z c2825z2 = new C2825z(this, this.f5262p);
        this.f5263q = c2825z2;
        return c2825z2;
    }

    public static void d1(H h11, boolean z11, int i11) {
        H g02;
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        boolean z12 = (i11 & 2) != 0;
        boolean z13 = (i11 & 4) != 0;
        if (h11.f5249c == null) {
            A1.a.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
            throw null;
        }
        AndroidComposeView androidComposeView = h11.f5255i;
        if (androidComposeView == null || h11.f5258l || h11.f5247a) {
            return;
        }
        androidComposeView.E0(h11, true, z11, z12);
        if (z13) {
            L.a H11 = h11.f5272z.H();
            Intrinsics.f(H11);
            L l11 = L.this;
            H g03 = l11.f5282a.g0();
            f fVar = l11.f5282a.f5268v;
            if (g03 == null || fVar == f.NotUsed) {
                return;
            }
            while (g03.f5268v == fVar && (g02 = g03.g0()) != null) {
                g03 = g02;
            }
            int i12 = L.a.C0123a.f5324b[fVar.ordinal()];
            if (i12 == 1) {
                if (g03.f5249c != null) {
                    d1(g03, z11, 6);
                    return;
                } else {
                    f1(g03, z11, 6);
                    return;
                }
            }
            if (i12 != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (g03.f5249c != null) {
                g03.c1(z11);
            } else {
                g03.e1(z11);
            }
        }
    }

    public static void f1(H h11, boolean z11, int i11) {
        AndroidComposeView androidComposeView;
        H g02;
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        boolean z12 = (i11 & 2) != 0;
        boolean z13 = (i11 & 4) != 0;
        if (h11.f5258l || h11.f5247a || (androidComposeView = h11.f5255i) == null) {
            return;
        }
        androidComposeView.E0(h11, false, z11, z12);
        if (z13) {
            L l11 = L.this;
            H g03 = l11.f5282a.g0();
            f fVar = l11.f5282a.f5268v;
            if (g03 == null || fVar == f.NotUsed) {
                return;
            }
            while (g03.f5268v == fVar && (g02 = g03.g0()) != null) {
                g03 = g02;
            }
            int i12 = L.b.a.f5359b[fVar.ordinal()];
            if (i12 == 1) {
                f1(g03, z11, 6);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                g03.e1(z11);
            }
        }
    }

    public static void g1(@NotNull H h11) {
        int i11 = g.f5275a[h11.f5272z.B().ordinal()];
        L l11 = h11.f5272z;
        if (i11 != 1) {
            throw new IllegalStateException("Unexpected state " + l11.B());
        }
        if (l11.G()) {
            d1(h11, true, 6);
            return;
        }
        if (l11.F()) {
            h11.c1(true);
        }
        if (l11.J()) {
            f1(h11, true, 6);
        } else if (l11.A()) {
            h11.e1(true);
        }
    }

    public static int k(H h11, H h12) {
        return h11.f5272z.I().o1() == h12.f5272z.I().o1() ? Intrinsics.i(h11.h0(), h12.h0()) : Float.compare(h11.f5272z.I().o1(), h12.f5272z.I().o1());
    }

    private final void m1(H h11) {
        if (Intrinsics.d(h11, this.f5249c)) {
            return;
        }
        this.f5249c = h11;
        if (h11 != null) {
            this.f5272z.q();
            C2804h0 c2804h0 = this.f5271y;
            AbstractC2810k0 f22 = c2804h0.i().f2();
            for (AbstractC2810k0 l11 = c2804h0.l(); !Intrinsics.d(l11, f22) && l11 != null; l11 = l11.f2()) {
                l11.V1();
            }
        }
        u0();
    }

    private final void q() {
        this.f5269w = this.f5268v;
        this.f5268v = f.NotUsed;
        U0.b<H> o02 = o0();
        int m11 = o02.m();
        if (m11 > 0) {
            H[] l11 = o02.l();
            int i11 = 0;
            do {
                H h11 = l11[i11];
                if (h11.f5268v == f.InLayoutBlock) {
                    h11.q();
                }
                i11++;
            } while (i11 < m11);
        }
    }

    private final String r(int i11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        U0.b<H> o02 = o0();
        int m11 = o02.m();
        if (m11 > 0) {
            H[] l11 = o02.l();
            int i13 = 0;
            do {
                sb2.append(l11[i13].r(i11 + 1));
                i13++;
            } while (i13 < m11);
        }
        String sb3 = sb2.toString();
        if (i11 != 0) {
            return sb3;
        }
        String substring = sb3.substring(0, sb3.length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    private final void y0() {
        H h11;
        if (this.f5250d > 0) {
            this.f5253g = true;
        }
        if (!this.f5247a || (h11 = this.f5254h) == null) {
            return;
        }
        h11.y0();
    }

    @NotNull
    public final List<H> A() {
        return o0().g();
    }

    public final boolean A0() {
        return this.f5246I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [I1.l, T] */
    public final I1.l B() {
        if (!z0() || this.f5246I) {
            return null;
        }
        if (!this.f5271y.o(8) || this.f5259m != null) {
            return this.f5259m;
        }
        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        m11.f71787a = new I1.l();
        ((AndroidComposeView) K.b(this)).getF40501C().g(this, new i(m11));
        I1.l lVar = (I1.l) m11.f71787a;
        this.f5259m = lVar;
        return lVar;
    }

    public final boolean B0() {
        return this.f5272z.I().N();
    }

    @NotNull
    public final S0.A C() {
        return this.f5267u;
    }

    public final boolean C0() {
        return this.f5272z.I().q1();
    }

    @NotNull
    public final B1.B D() {
        return this.f5271y.i();
    }

    public final Boolean D0() {
        L.a H11 = this.f5272z.H();
        if (H11 != null) {
            return Boolean.valueOf(H11.N());
        }
        return null;
    }

    @NotNull
    public final Z1.d E() {
        return this.f5264r;
    }

    public final boolean E0(Z1.b bVar) {
        if (bVar == null || this.f5249c == null) {
            return false;
        }
        L.a H11 = this.f5272z.H();
        Intrinsics.f(H11);
        return H11.w1(bVar.p());
    }

    public final int F() {
        return this.f5257k;
    }

    @NotNull
    public final List<H> G() {
        return this.f5251e.b();
    }

    public final void G0() {
        if (this.f5268v == f.NotUsed) {
            q();
        }
        L.a H11 = this.f5272z.H();
        Intrinsics.f(H11);
        H11.A1();
    }

    public final boolean H() {
        long n02 = this.f5271y.i().n0();
        return Z1.b.i(n02) && Z1.b.h(n02);
    }

    public final void H0() {
        this.f5272z.O();
    }

    public final int I() {
        return this.f5272z.x();
    }

    public final void I0() {
        this.f5272z.P();
    }

    @NotNull
    public final C2823x J() {
        return this.f5271y.i();
    }

    public final void J0() {
        this.f5272z.Q();
    }

    public final View K() {
        C5728b c5728b = this.f5256j;
        if (c5728b != null) {
            return c5728b.k();
        }
        return null;
    }

    public final void K0() {
        this.f5272z.R();
    }

    public final C5728b L() {
        return this.f5256j;
    }

    public final int L0(int i11) {
        return d0().b(i11);
    }

    @NotNull
    public final f M() {
        return this.f5268v;
    }

    public final int M0(int i11) {
        return d0().c(i11);
    }

    @NotNull
    public final L N() {
        return this.f5272z;
    }

    public final int N0(int i11) {
        return d0().d(i11);
    }

    @NotNull
    public final Z1.s O() {
        return this.f5265s;
    }

    public final int O0(int i11) {
        return d0().e(i11);
    }

    public final boolean P() {
        return this.f5272z.A();
    }

    public final int P0(int i11) {
        return d0().f(i11);
    }

    @NotNull
    public final d Q() {
        return this.f5272z.B();
    }

    public final int Q0(int i11) {
        return d0().g(i11);
    }

    public final boolean R() {
        return this.f5272z.F();
    }

    public final int R0(int i11) {
        return d0().h(i11);
    }

    public final boolean S() {
        return this.f5272z.G();
    }

    public final int S0(int i11) {
        return d0().i(i11);
    }

    public final L.a T() {
        return this.f5272z.H();
    }

    public final void T0(int i11, int i12, int i13) {
        if (i11 == i12) {
            return;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i11 > i12 ? i11 + i14 : i11;
            int i16 = i11 > i12 ? i12 + i14 : (i12 + i13) - 2;
            C2798e0<H> c2798e0 = this.f5251e;
            c2798e0.a(i16, c2798e0.g(i15));
        }
        V0();
        y0();
        u0();
    }

    public final H U() {
        return this.f5249c;
    }

    @NotNull
    public final L.b V() {
        return this.f5272z.I();
    }

    public final void V0() {
        if (!this.f5247a) {
            this.f5261o = true;
            return;
        }
        H g02 = g0();
        if (g02 != null) {
            g02.V0();
        }
    }

    public final boolean W() {
        return this.f5272z.J();
    }

    public final void W0() {
        m0.a b11;
        C2823x i11;
        if (this.f5268v == f.NotUsed) {
            q();
        }
        H g02 = g0();
        if (g02 == null || (i11 = g02.f5271y.i()) == null || (b11 = i11.i1()) == null) {
            b11 = B1.n0.b((AndroidComposeView) K.b(this));
        }
        b11.h(this.f5272z.I(), 0, 0, 0.0f);
    }

    @NotNull
    public final B1.V X() {
        return this.f5262p;
    }

    public final boolean X0(Z1.b bVar) {
        if (bVar == null) {
            return false;
        }
        if (this.f5268v == f.NotUsed) {
            p();
        }
        return this.f5272z.I().J1(bVar.p());
    }

    @NotNull
    public final f Y() {
        return this.f5272z.I().l1();
    }

    @NotNull
    public final f Z() {
        f e12;
        L.a H11 = this.f5272z.H();
        return (H11 == null || (e12 = H11.e1()) == null) ? f.NotUsed : e12;
    }

    public final void Z0() {
        C2798e0<H> c2798e0 = this.f5251e;
        int e11 = c2798e0.e();
        while (true) {
            e11--;
            if (-1 >= e11) {
                c2798e0.c();
                return;
            }
            U0(c2798e0.d(e11));
        }
    }

    @Override // S0.InterfaceC3963i
    public final void a() {
        C5728b c5728b = this.f5256j;
        if (c5728b != null) {
            c5728b.a();
        }
        B1.L l11 = this.f5238A;
        if (l11 != null) {
            l11.a();
        }
        this.f5246I = true;
        this.f5271y.r();
        if (z0()) {
            x0();
        }
    }

    @NotNull
    public final List<B1.b0> a0() {
        return this.f5271y.k();
    }

    public final void a1(int i11, int i12) {
        if (!(i12 >= 0)) {
            A1.a.a("count (" + i12 + ") must be greater than 0");
            throw null;
        }
        int i13 = (i12 + i11) - 1;
        if (i11 > i13) {
            return;
        }
        while (true) {
            C2798e0<H> c2798e0 = this.f5251e;
            U0(c2798e0.d(i13));
            c2798e0.g(i13);
            if (i13 == i11) {
                return;
            } else {
                i13--;
            }
        }
    }

    @Override // B1.o0
    public final void b() {
        if (this.f5249c != null) {
            d1(this, false, 5);
        } else {
            f1(this, false, 5);
        }
        Z1.b y11 = this.f5272z.y();
        if (y11 != null) {
            AndroidComposeView androidComposeView = this.f5255i;
            if (androidComposeView != null) {
                androidComposeView.y0(this, y11.p());
                return;
            }
            return;
        }
        AndroidComposeView androidComposeView2 = this.f5255i;
        if (androidComposeView2 != null) {
            androidComposeView2.x0(true);
        }
    }

    public final boolean b0() {
        return this.f5245H;
    }

    public final void b1() {
        if (this.f5268v == f.NotUsed) {
            q();
        }
        this.f5272z.I().K1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // D1.InterfaceC2801g
    public final void c(@NotNull Z1.s sVar) {
        if (this.f5265s != sVar) {
            this.f5265s = sVar;
            u0();
            H g02 = g0();
            if (g02 != null) {
                g02.s0();
            }
            t0();
            C2804h0 c2804h0 = this.f5271y;
            if ((C2804h0.c(c2804h0) & 4) != 0) {
                for (e.c h11 = c2804h0.h(); h11 != null; h11 = h11.getChild$ui_release()) {
                    if ((h11.getKindSet$ui_release() & 4) != 0) {
                        AbstractC2813m abstractC2813m = h11;
                        ?? r22 = 0;
                        while (abstractC2813m != 0) {
                            if (abstractC2813m instanceof InterfaceC2819t) {
                                InterfaceC2819t interfaceC2819t = (InterfaceC2819t) abstractC2813m;
                                if (interfaceC2819t instanceof InterfaceC6986f) {
                                    ((InterfaceC6986f) interfaceC2819t).c1();
                                }
                            } else if ((abstractC2813m.getKindSet$ui_release() & 4) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                                e.c J12 = abstractC2813m.J1();
                                int i11 = 0;
                                abstractC2813m = abstractC2813m;
                                r22 = r22;
                                while (J12 != null) {
                                    if ((J12.getKindSet$ui_release() & 4) != 0) {
                                        i11++;
                                        r22 = r22;
                                        if (i11 == 1) {
                                            abstractC2813m = J12;
                                        } else {
                                            if (r22 == 0) {
                                                r22 = new U0.b(new e.c[16]);
                                            }
                                            if (abstractC2813m != 0) {
                                                r22.b(abstractC2813m);
                                                abstractC2813m = 0;
                                            }
                                            r22.b(J12);
                                        }
                                    }
                                    J12 = J12.getChild$ui_release();
                                    abstractC2813m = abstractC2813m;
                                    r22 = r22;
                                }
                                if (i11 == 1) {
                                }
                            }
                            abstractC2813m = C2809k.b(r22);
                        }
                    }
                    if ((h11.getAggregateChildKindSet$ui_release() & 4) == 0) {
                        return;
                    }
                }
            }
        }
    }

    @NotNull
    public final C2804h0 c0() {
        return this.f5271y;
    }

    public final void c1(boolean z11) {
        AndroidComposeView androidComposeView;
        if (this.f5247a || (androidComposeView = this.f5255i) == null) {
            return;
        }
        androidComposeView.F0(this, true, z11);
    }

    @Override // D1.InterfaceC2801g
    public final void d(@NotNull androidx.compose.ui.e eVar) {
        if (!(!this.f5247a || this.f5241D == androidx.compose.ui.e.f40358c0)) {
            A1.a.a("Modifiers are not supported on virtual LayoutNodes");
            throw null;
        }
        if (this.f5246I) {
            A1.a.a("modifier is updated when deactivated");
            throw null;
        }
        if (!z0()) {
            this.f5242E = eVar;
            return;
        }
        this.f5241D = eVar;
        C2804h0 c2804h0 = this.f5271y;
        c2804h0.w(eVar);
        this.f5272z.a0();
        if (this.f5249c == null && c2804h0.o(UserVerificationMethods.USER_VERIFY_NONE)) {
            m1(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // D1.InterfaceC2801g
    public final void e(@NotNull S0.A a11) {
        this.f5267u = a11;
        j((Z1.d) a11.b(androidx.compose.ui.platform.K0.e()));
        c((Z1.s) a11.b(androidx.compose.ui.platform.K0.k()));
        f((c2) a11.b(androidx.compose.ui.platform.K0.r()));
        C2804h0 c2804h0 = this.f5271y;
        if ((C2804h0.c(c2804h0) & 32768) != 0) {
            for (e.c h11 = c2804h0.h(); h11 != null; h11 = h11.getChild$ui_release()) {
                if ((h11.getKindSet$ui_release() & 32768) != 0) {
                    AbstractC2813m abstractC2813m = h11;
                    ?? r32 = 0;
                    while (abstractC2813m != 0) {
                        if (abstractC2813m instanceof InterfaceC2803h) {
                            e.c node = ((InterfaceC2803h) abstractC2813m).getNode();
                            if (node.isAttached()) {
                                p0.d(node);
                            } else {
                                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                            }
                        } else if ((abstractC2813m.getKindSet$ui_release() & 32768) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                            e.c J12 = abstractC2813m.J1();
                            int i11 = 0;
                            abstractC2813m = abstractC2813m;
                            r32 = r32;
                            while (J12 != null) {
                                if ((J12.getKindSet$ui_release() & 32768) != 0) {
                                    i11++;
                                    r32 = r32;
                                    if (i11 == 1) {
                                        abstractC2813m = J12;
                                    } else {
                                        if (r32 == 0) {
                                            r32 = new U0.b(new e.c[16]);
                                        }
                                        if (abstractC2813m != 0) {
                                            r32.b(abstractC2813m);
                                            abstractC2813m = 0;
                                        }
                                        r32.b(J12);
                                    }
                                }
                                J12 = J12.getChild$ui_release();
                                abstractC2813m = abstractC2813m;
                                r32 = r32;
                            }
                            if (i11 == 1) {
                            }
                        }
                        abstractC2813m = C2809k.b(r32);
                    }
                }
                if ((h11.getAggregateChildKindSet$ui_release() & 32768) == 0) {
                    return;
                }
            }
        }
    }

    @NotNull
    public final AbstractC2810k0 e0() {
        return this.f5271y.l();
    }

    public final void e1(boolean z11) {
        AndroidComposeView androidComposeView;
        if (this.f5247a || (androidComposeView = this.f5255i) == null) {
            return;
        }
        androidComposeView.F0(this, false, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // D1.InterfaceC2801g
    public final void f(@NotNull c2 c2Var) {
        if (Intrinsics.d(this.f5266t, c2Var)) {
            return;
        }
        this.f5266t = c2Var;
        C2804h0 c2804h0 = this.f5271y;
        if ((C2804h0.c(c2804h0) & 16) != 0) {
            for (e.c h11 = c2804h0.h(); h11 != null; h11 = h11.getChild$ui_release()) {
                if ((h11.getKindSet$ui_release() & 16) != 0) {
                    AbstractC2813m abstractC2813m = h11;
                    ?? r32 = 0;
                    while (abstractC2813m != 0) {
                        if (abstractC2813m instanceof C0) {
                            ((C0) abstractC2813m).D1();
                        } else if ((abstractC2813m.getKindSet$ui_release() & 16) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                            e.c J12 = abstractC2813m.J1();
                            int i11 = 0;
                            abstractC2813m = abstractC2813m;
                            r32 = r32;
                            while (J12 != null) {
                                if ((J12.getKindSet$ui_release() & 16) != 0) {
                                    i11++;
                                    r32 = r32;
                                    if (i11 == 1) {
                                        abstractC2813m = J12;
                                    } else {
                                        if (r32 == 0) {
                                            r32 = new U0.b(new e.c[16]);
                                        }
                                        if (abstractC2813m != 0) {
                                            r32.b(abstractC2813m);
                                            abstractC2813m = 0;
                                        }
                                        r32.b(J12);
                                    }
                                }
                                J12 = J12.getChild$ui_release();
                                abstractC2813m = abstractC2813m;
                                r32 = r32;
                            }
                            if (i11 == 1) {
                            }
                        }
                        abstractC2813m = C2809k.b(r32);
                    }
                }
                if ((h11.getAggregateChildKindSet$ui_release() & 16) == 0) {
                    return;
                }
            }
        }
    }

    public final x0 f0() {
        return this.f5255i;
    }

    @Override // S0.InterfaceC3963i
    public final void g() {
        if (!z0()) {
            A1.a.a("onReuse is only expected on attached node");
            throw null;
        }
        C5728b c5728b = this.f5256j;
        if (c5728b != null) {
            c5728b.g();
        }
        B1.L l11 = this.f5238A;
        if (l11 != null) {
            l11.g();
        }
        boolean z11 = this.f5246I;
        C2804h0 c2804h0 = this.f5271y;
        if (z11) {
            this.f5246I = false;
            x0();
        } else {
            c2804h0.r();
        }
        this.f5248b = I1.o.b();
        c2804h0.p();
        c2804h0.s();
        g1(this);
    }

    public final H g0() {
        H h11 = this.f5254h;
        while (h11 != null && h11.f5247a) {
            h11 = h11.f5254h;
        }
        return h11;
    }

    @Override // D1.InterfaceC2801g
    public final void h(@NotNull B1.V v11) {
        if (Intrinsics.d(this.f5262p, v11)) {
            return;
        }
        this.f5262p = v11;
        C2825z c2825z = this.f5263q;
        if (c2825z != null) {
            c2825z.j(v11);
        }
        u0();
    }

    public final int h0() {
        return this.f5272z.I().n1();
    }

    public final void h1() {
        U0.b<H> o02 = o0();
        int m11 = o02.m();
        if (m11 > 0) {
            H[] l11 = o02.l();
            int i11 = 0;
            do {
                H h11 = l11[i11];
                f fVar = h11.f5269w;
                h11.f5268v = fVar;
                if (fVar != f.NotUsed) {
                    h11.h1();
                }
                i11++;
            } while (i11 < m11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // D1.x0.a
    public final void i() {
        e.c j22;
        C2804h0 c2804h0 = this.f5271y;
        C2823x i11 = c2804h0.i();
        boolean h11 = p0.h(UserVerificationMethods.USER_VERIFY_PATTERN);
        e.c e22 = i11.e2();
        if (!h11 && (e22 = e22.getParent$ui_release()) == null) {
            return;
        }
        for (j22 = i11.j2(h11); j22 != null && (j22.getAggregateChildKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0; j22 = j22.getChild$ui_release()) {
            if ((j22.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                AbstractC2813m abstractC2813m = j22;
                ?? r62 = 0;
                while (abstractC2813m != 0) {
                    if (abstractC2813m instanceof B) {
                        ((B) abstractC2813m).y(c2804h0.i());
                    } else if ((abstractC2813m.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                        e.c J12 = abstractC2813m.J1();
                        int i12 = 0;
                        abstractC2813m = abstractC2813m;
                        r62 = r62;
                        while (J12 != null) {
                            if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                i12++;
                                r62 = r62;
                                if (i12 == 1) {
                                    abstractC2813m = J12;
                                } else {
                                    if (r62 == 0) {
                                        r62 = new U0.b(new e.c[16]);
                                    }
                                    if (abstractC2813m != 0) {
                                        r62.b(abstractC2813m);
                                        abstractC2813m = 0;
                                    }
                                    r62.b(J12);
                                }
                            }
                            J12 = J12.getChild$ui_release();
                            abstractC2813m = abstractC2813m;
                            r62 = r62;
                        }
                        if (i12 == 1) {
                        }
                    }
                    abstractC2813m = C2809k.b(r62);
                }
            }
            if (j22 == e22) {
                return;
            }
        }
    }

    public final int i0() {
        return this.f5248b;
    }

    public final void i1(boolean z11) {
        this.f5270x = z11;
    }

    @Override // D1.InterfaceC2801g
    public final void j(@NotNull Z1.d dVar) {
        if (Intrinsics.d(this.f5264r, dVar)) {
            return;
        }
        this.f5264r = dVar;
        u0();
        H g02 = g0();
        if (g02 != null) {
            g02.s0();
        }
        t0();
        for (e.c h11 = this.f5271y.h(); h11 != null; h11 = h11.getChild$ui_release()) {
            if ((h11.getKindSet$ui_release() & 16) != 0) {
                ((C0) h11).s1();
            } else if (h11 instanceof InterfaceC6986f) {
                ((InterfaceC6986f) h11).c1();
            }
        }
    }

    public final B1.L j0() {
        return this.f5238A;
    }

    public final void j1() {
        this.f5240C = true;
    }

    @NotNull
    public final c2 k0() {
        return this.f5266t;
    }

    public final void k1(C5728b c5728b) {
        this.f5256j = c5728b;
    }

    public final int l0() {
        return this.f5272z.L();
    }

    public final void l1(@NotNull f fVar) {
        this.f5268v = fVar;
    }

    @Override // D1.y0
    public final boolean m0() {
        return z0();
    }

    @NotNull
    public final U0.b<H> n0() {
        boolean z11 = this.f5261o;
        U0.b<H> bVar = this.f5260n;
        if (z11) {
            bVar.h();
            bVar.c(bVar.m(), o0());
            bVar.z(f5236M);
            this.f5261o = false;
        }
        return bVar;
    }

    public final void n1(boolean z11) {
        this.f5245H = z11;
    }

    public final void o(@NotNull AndroidComposeView androidComposeView) {
        H h11;
        if (!(this.f5255i == null)) {
            A1.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + r(0));
            throw null;
        }
        H h12 = this.f5254h;
        if (h12 != null && !Intrinsics.d(h12.f5255i, androidComposeView)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(androidComposeView);
            sb2.append(") than the parent's owner(");
            H g02 = g0();
            sb2.append(g02 != null ? g02.f5255i : null);
            sb2.append("). This tree: ");
            sb2.append(r(0));
            sb2.append(" Parent tree: ");
            H h13 = this.f5254h;
            sb2.append(h13 != null ? h13.r(0) : null);
            A1.a.b(sb2.toString());
            throw null;
        }
        H g03 = g0();
        L l11 = this.f5272z;
        if (g03 == null) {
            l11.I().N1();
            L.a H11 = l11.H();
            if (H11 != null) {
                H11.F1();
            }
        }
        C2804h0 c2804h0 = this.f5271y;
        c2804h0.l().E2(g03 != null ? g03.f5271y.i() : null);
        this.f5255i = androidComposeView;
        this.f5257k = (g03 != null ? g03.f5257k : -1) + 1;
        androidx.compose.ui.e eVar = this.f5242E;
        if (eVar != null) {
            this.f5241D = eVar;
            c2804h0.w(eVar);
            l11.a0();
            if (this.f5249c == null && c2804h0.o(UserVerificationMethods.USER_VERIFY_NONE)) {
                m1(this);
            }
        }
        this.f5242E = null;
        if (c2804h0.o(8)) {
            x0();
        }
        androidComposeView.getClass();
        H h14 = this.f5254h;
        if (h14 == null || (h11 = h14.f5249c) == null) {
            h11 = this.f5249c;
        }
        m1(h11);
        if (this.f5249c == null && c2804h0.o(UserVerificationMethods.USER_VERIFY_NONE)) {
            m1(this);
        }
        if (!this.f5246I) {
            c2804h0.p();
        }
        U0.b<H> f7 = this.f5251e.f();
        int m11 = f7.m();
        if (m11 > 0) {
            H[] l12 = f7.l();
            int i11 = 0;
            do {
                l12[i11].o(androidComposeView);
                i11++;
            } while (i11 < m11);
        }
        if (!this.f5246I) {
            c2804h0.s();
        }
        u0();
        if (g03 != null) {
            g03.u0();
        }
        AbstractC2810k0 f22 = c2804h0.i().f2();
        for (AbstractC2810k0 l13 = c2804h0.l(); !Intrinsics.d(l13, f22) && l13 != null; l13 = l13.f2()) {
            l13.r2();
        }
        Function1<? super x0, Unit> function1 = this.f5243F;
        if (function1 != null) {
            function1.invoke(androidComposeView);
        }
        l11.a0();
        if (this.f5246I || !c2804h0.n()) {
            return;
        }
        for (e.c h15 = c2804h0.h(); h15 != null; h15 = h15.getChild$ui_release()) {
            if (((h15.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) | ((h15.getKindSet$ui_release() & 2048) != 0) | ((h15.getKindSet$ui_release() & 4096) != 0)) {
                p0.a(h15);
            }
        }
    }

    @NotNull
    public final U0.b<H> o0() {
        r1();
        if (this.f5250d == 0) {
            return this.f5251e.f();
        }
        U0.b<H> bVar = this.f5252f;
        Intrinsics.f(bVar);
        return bVar;
    }

    public final void o1(Function1<? super x0, Unit> function1) {
        this.f5243F = function1;
    }

    @Override // S0.InterfaceC3963i
    public final void onRelease() {
        C5728b c5728b = this.f5256j;
        if (c5728b != null) {
            c5728b.onRelease();
        }
        B1.L l11 = this.f5238A;
        if (l11 != null) {
            l11.onRelease();
        }
        C2804h0 c2804h0 = this.f5271y;
        AbstractC2810k0 f22 = c2804h0.i().f2();
        for (AbstractC2810k0 l12 = c2804h0.l(); !Intrinsics.d(l12, f22) && l12 != null; l12 = l12.f2()) {
            l12.u2();
        }
    }

    public final void p() {
        this.f5269w = this.f5268v;
        this.f5268v = f.NotUsed;
        U0.b<H> o02 = o0();
        int m11 = o02.m();
        if (m11 > 0) {
            H[] l11 = o02.l();
            int i11 = 0;
            do {
                H h11 = l11[i11];
                if (h11.f5268v != f.NotUsed) {
                    h11.p();
                }
                i11++;
            } while (i11 < m11);
        }
    }

    public final void p0(long j11, @NotNull C2822w c2822w, boolean z11, boolean z12) {
        AbstractC2810k0.a aVar;
        C2804h0 c2804h0 = this.f5271y;
        AbstractC2810k0 l11 = c2804h0.l();
        int i11 = AbstractC2810k0.f5486P;
        long X12 = l11.X1(j11);
        AbstractC2810k0 l12 = c2804h0.l();
        aVar = AbstractC2810k0.f5484N;
        l12.k2(aVar, X12, c2822w, z11, z12);
    }

    public final void p1(Function1<? super x0, Unit> function1) {
        this.f5244G = function1;
    }

    public final void q0(long j11, @NotNull C2822w c2822w, boolean z11) {
        AbstractC2810k0.b bVar;
        C2804h0 c2804h0 = this.f5271y;
        AbstractC2810k0 l11 = c2804h0.l();
        int i11 = AbstractC2810k0.f5486P;
        long X12 = l11.X1(j11);
        AbstractC2810k0 l12 = c2804h0.l();
        bVar = AbstractC2810k0.f5485O;
        l12.k2(bVar, X12, c2822w, true, z11);
    }

    public final void q1(B1.L l11) {
        this.f5238A = l11;
    }

    public final void r0(int i11, @NotNull H h11) {
        if (!(h11.f5254h == null)) {
            StringBuilder sb2 = new StringBuilder("Cannot insert ");
            sb2.append(h11);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(r(0));
            sb2.append(" Other tree: ");
            H h12 = h11.f5254h;
            sb2.append(h12 != null ? h12.r(0) : null);
            A1.a.b(sb2.toString());
            throw null;
        }
        if (h11.f5255i != null) {
            A1.a.b("Cannot insert " + h11 + " because it already has an owner. This tree: " + r(0) + " Other tree: " + h11.r(0));
            throw null;
        }
        h11.f5254h = this;
        this.f5251e.a(i11, h11);
        V0();
        if (h11.f5247a) {
            this.f5250d++;
        }
        y0();
        AndroidComposeView androidComposeView = this.f5255i;
        if (androidComposeView != null) {
            h11.o(androidComposeView);
        }
        if (h11.f5272z.s() > 0) {
            L l11 = this.f5272z;
            l11.U(l11.s() + 1);
        }
    }

    public final void r1() {
        if (this.f5250d <= 0 || !this.f5253g) {
            return;
        }
        int i11 = 0;
        this.f5253g = false;
        U0.b<H> bVar = this.f5252f;
        if (bVar == null) {
            bVar = new U0.b<>(new H[16]);
            this.f5252f = bVar;
        }
        bVar.h();
        U0.b<H> f7 = this.f5251e.f();
        int m11 = f7.m();
        if (m11 > 0) {
            H[] l11 = f7.l();
            do {
                H h11 = l11[i11];
                if (h11.f5247a) {
                    bVar.c(bVar.m(), h11.o0());
                } else {
                    bVar.b(h11);
                }
                i11++;
            } while (i11 < m11);
        }
        this.f5272z.N();
    }

    public final void s() {
        AndroidComposeView androidComposeView = this.f5255i;
        if (androidComposeView == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            H g02 = g0();
            sb2.append(g02 != null ? g02.r(0) : null);
            A1.a.c(sb2.toString());
            throw null;
        }
        H g03 = g0();
        L l11 = this.f5272z;
        if (g03 != null) {
            g03.s0();
            g03.u0();
            L.b I11 = l11.I();
            f fVar = f.NotUsed;
            I11.M1(fVar);
            L.a H11 = l11.H();
            if (H11 != null) {
                H11.C1(fVar);
            }
        }
        l11.T();
        Function1<? super x0, Unit> function1 = this.f5244G;
        if (function1 != null) {
            function1.invoke(androidComposeView);
        }
        C2804h0 c2804h0 = this.f5271y;
        if (c2804h0.o(8)) {
            x0();
        }
        c2804h0.t();
        this.f5258l = true;
        U0.b<H> f7 = this.f5251e.f();
        int m11 = f7.m();
        if (m11 > 0) {
            H[] l12 = f7.l();
            int i11 = 0;
            do {
                l12[i11].s();
                i11++;
            } while (i11 < m11);
        }
        this.f5258l = false;
        c2804h0.q();
        androidComposeView.A0(this);
        this.f5255i = null;
        m1(null);
        this.f5257k = 0;
        l11.I().D1();
        L.a H12 = l11.H();
        if (H12 != null) {
            H12.p1();
        }
    }

    public final void s0() {
        if (this.f5240C) {
            C2804h0 c2804h0 = this.f5271y;
            AbstractC2810k0 i11 = c2804h0.i();
            AbstractC2810k0 g22 = c2804h0.l().g2();
            this.f5239B = null;
            while (true) {
                if (Intrinsics.d(i11, g22)) {
                    break;
                }
                if ((i11 != null ? i11.b2() : null) != null) {
                    this.f5239B = i11;
                    break;
                }
                i11 = i11 != null ? i11.g2() : null;
            }
        }
        AbstractC2810k0 abstractC2810k0 = this.f5239B;
        if (abstractC2810k0 != null && abstractC2810k0.b2() == null) {
            A1.a.c("layer was not set");
            throw null;
        }
        if (abstractC2810k0 != null) {
            abstractC2810k0.m2();
            return;
        }
        H g02 = g0();
        if (g02 != null) {
            g02.s0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void t() {
        L l11 = this.f5272z;
        if (l11.B() != d.Idle || l11.A() || l11.J() || this.f5246I || !B0()) {
            return;
        }
        C2804h0 c2804h0 = this.f5271y;
        if ((C2804h0.c(c2804h0) & 256) != 0) {
            for (e.c h11 = c2804h0.h(); h11 != null; h11 = h11.getChild$ui_release()) {
                if ((h11.getKindSet$ui_release() & 256) != 0) {
                    AbstractC2813m abstractC2813m = h11;
                    ?? r42 = 0;
                    while (abstractC2813m != 0) {
                        if (abstractC2813m instanceof InterfaceC2821v) {
                            InterfaceC2821v interfaceC2821v = (InterfaceC2821v) abstractC2813m;
                            interfaceC2821v.s(C2809k.d(interfaceC2821v, 256));
                        } else if ((abstractC2813m.getKindSet$ui_release() & 256) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                            e.c J12 = abstractC2813m.J1();
                            int i11 = 0;
                            abstractC2813m = abstractC2813m;
                            r42 = r42;
                            while (J12 != null) {
                                if ((J12.getKindSet$ui_release() & 256) != 0) {
                                    i11++;
                                    r42 = r42;
                                    if (i11 == 1) {
                                        abstractC2813m = J12;
                                    } else {
                                        if (r42 == 0) {
                                            r42 = new U0.b(new e.c[16]);
                                        }
                                        if (abstractC2813m != 0) {
                                            r42.b(abstractC2813m);
                                            abstractC2813m = 0;
                                        }
                                        r42.b(J12);
                                    }
                                }
                                J12 = J12.getChild$ui_release();
                                abstractC2813m = abstractC2813m;
                                r42 = r42;
                            }
                            if (i11 == 1) {
                            }
                        }
                        abstractC2813m = C2809k.b(r42);
                    }
                }
                if ((h11.getAggregateChildKindSet$ui_release() & 256) == 0) {
                    return;
                }
            }
        }
    }

    public final void t0() {
        C2804h0 c2804h0 = this.f5271y;
        AbstractC2810k0 l11 = c2804h0.l();
        C2823x i11 = c2804h0.i();
        while (l11 != i11) {
            Intrinsics.g(l11, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            F f7 = (F) l11;
            w0 b22 = f7.b2();
            if (b22 != null) {
                b22.invalidate();
            }
            l11 = f7.f2();
        }
        w0 b23 = c2804h0.i().b2();
        if (b23 != null) {
            b23.invalidate();
        }
    }

    @NotNull
    public final String toString() {
        return C5251h1.a(this) + " children: " + A().size() + " measurePolicy: " + this.f5262p;
    }

    public final void u(@NotNull InterfaceC7802U interfaceC7802U, o1.d dVar) {
        this.f5271y.l().S1(interfaceC7802U, dVar);
    }

    public final void u0() {
        if (this.f5249c != null) {
            d1(this, false, 7);
        } else {
            f1(this, false, 7);
        }
    }

    public final boolean v() {
        L.a C11;
        AbstractC2789a s11;
        L l11 = this.f5272z;
        return l11.r().s().j() || !((C11 = l11.C()) == null || (s11 = C11.s()) == null || !s11.j());
    }

    public final void v0() {
        L l11 = this.f5272z;
        if (l11.A() || l11.J() || this.f5245H) {
            return;
        }
        ((AndroidComposeView) K.b(this)).N0(this);
    }

    public final boolean w() {
        return this.f5242E != null;
    }

    public final void w0() {
        this.f5272z.M();
    }

    public final boolean x() {
        return this.f5270x;
    }

    public final void x0() {
        this.f5259m = null;
        ((AndroidComposeView) K.b(this)).G0();
    }

    @NotNull
    public final List<B1.U> y() {
        L.a H11 = this.f5272z.H();
        Intrinsics.f(H11);
        return H11.X0();
    }

    @NotNull
    public final List<B1.U> z() {
        return this.f5272z.I().g1();
    }

    public final boolean z0() {
        return this.f5255i != null;
    }

    public H(boolean z11, int i11) {
        Z1.d dVar;
        this.f5247a = z11;
        this.f5248b = i11;
        this.f5251e = new C2798e0<>(new U0.b(new H[16]), new h());
        this.f5260n = new U0.b<>(new H[16]);
        this.f5261o = true;
        this.f5262p = f5233J;
        dVar = K.f5281a;
        this.f5264r = dVar;
        this.f5265s = Z1.s.Ltr;
        this.f5266t = f5235L;
        S0.A.f25189W.getClass();
        this.f5267u = A.a.a();
        f fVar = f.NotUsed;
        this.f5268v = fVar;
        this.f5269w = fVar;
        this.f5271y = new C2804h0(this);
        this.f5272z = new L(this);
        this.f5240C = true;
        this.f5241D = androidx.compose.ui.e.f40358c0;
    }

    public /* synthetic */ H(int i11) {
        this((i11 & 1) == 0, I1.o.b());
    }
}
