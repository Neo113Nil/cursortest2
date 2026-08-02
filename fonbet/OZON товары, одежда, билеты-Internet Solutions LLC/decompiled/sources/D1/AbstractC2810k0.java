package D1;

import D1.L;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidComposeView;
import c1.AbstractC5715f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.LinkedHashMap;
import k1.C7458d;
import k1.C7459e;
import k1.C7460f;
import k1.C7464j;
import k1.C7465k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7784B;
import l1.C7837o0;
import l1.InterfaceC7802U;
import l1.InterfaceC7825i0;
import org.jetbrains.annotations.NotNull;

/* renamed from: D1.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2810k0 extends V implements B1.U, B1.B, y0 {

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private static final Function1<AbstractC2810k0, Unit> f5479I = d.f5510b;

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private static final Function1<AbstractC2810k0, Unit> f5480J = c.f5509b;

    /* renamed from: K, reason: collision with root package name */
    @NotNull
    private static final l1.E0 f5481K = new l1.E0();

    /* renamed from: L, reason: collision with root package name */
    @NotNull
    private static final A f5482L = new A();

    /* renamed from: M, reason: collision with root package name */
    @NotNull
    private static final float[] f5483M = C7837o0.b();

    /* renamed from: N, reason: collision with root package name */
    @NotNull
    private static final a f5484N = new a();

    /* renamed from: O, reason: collision with root package name */
    @NotNull
    private static final b f5485O = new b();

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ int f5486P = 0;

    /* renamed from: A, reason: collision with root package name */
    private float f5487A;

    /* renamed from: B, reason: collision with root package name */
    private C7458d f5488B;

    /* renamed from: C, reason: collision with root package name */
    private A f5489C;

    /* renamed from: F, reason: collision with root package name */
    private boolean f5492F;

    /* renamed from: G, reason: collision with root package name */
    private w0 f5493G;

    /* renamed from: H, reason: collision with root package name */
    private o1.d f5494H;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final H f5495m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f5496n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5497o;

    /* renamed from: p, reason: collision with root package name */
    private AbstractC2810k0 f5498p;

    /* renamed from: q, reason: collision with root package name */
    private AbstractC2810k0 f5499q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f5500r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f5501s;

    /* renamed from: t, reason: collision with root package name */
    private Function1<? super InterfaceC7825i0, Unit> f5502t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private Z1.d f5503u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private Z1.s f5504v;

    /* renamed from: x, reason: collision with root package name */
    private B1.W f5506x;

    /* renamed from: y, reason: collision with root package name */
    private LinkedHashMap f5507y;

    /* renamed from: w, reason: collision with root package name */
    private float f5505w = 0.8f;

    /* renamed from: z, reason: collision with root package name */
    private long f5508z = 0;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final Function2<InterfaceC7802U, o1.d, Unit> f5490D = new f();

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f5491E = new g();

    /* renamed from: D1.k0$a */
    public static final class a implements e {
        @Override // D1.AbstractC2810k0.e
        public final int a() {
            return 16;
        }

        @Override // D1.AbstractC2810k0.e
        public final boolean b(@NotNull H h11) {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [U0.b] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6, types: [U0.b] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.e$c] */
        /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.e$c] */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.e$c] */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* JADX WARN: Type inference failed for: r8v9 */
        @Override // D1.AbstractC2810k0.e
        public final boolean c(@NotNull e.c cVar) {
            ?? r12 = 0;
            while (true) {
                int i11 = 0;
                if (cVar == 0) {
                    return false;
                }
                if (cVar instanceof C0) {
                    ((C0) cVar).Y();
                } else if ((cVar.getKindSet$ui_release() & 16) != 0 && (cVar instanceof AbstractC2813m)) {
                    e.c J12 = cVar.J1();
                    r12 = r12;
                    cVar = cVar;
                    while (J12 != null) {
                        if ((J12.getKindSet$ui_release() & 16) != 0) {
                            i11++;
                            r12 = r12;
                            if (i11 == 1) {
                                cVar = J12;
                            } else {
                                if (r12 == 0) {
                                    r12 = new U0.b(new e.c[16]);
                                }
                                if (cVar != 0) {
                                    r12.b(cVar);
                                    cVar = 0;
                                }
                                r12.b(J12);
                            }
                        }
                        J12 = J12.getChild$ui_release();
                        r12 = r12;
                        cVar = cVar;
                    }
                    if (i11 == 1) {
                    }
                }
                cVar = C2809k.b(r12);
            }
        }

        @Override // D1.AbstractC2810k0.e
        public final void d(@NotNull H h11, long j11, @NotNull C2822w c2822w, boolean z11, boolean z12) {
            h11.p0(j11, c2822w, z11, z12);
        }
    }

    /* renamed from: D1.k0$b */
    public static final class b implements e {
        @Override // D1.AbstractC2810k0.e
        public final int a() {
            return 8;
        }

        @Override // D1.AbstractC2810k0.e
        public final boolean b(@NotNull H h11) {
            I1.l B11 = h11.B();
            boolean z11 = false;
            if (B11 != null && B11.n()) {
                z11 = true;
            }
            return !z11;
        }

        @Override // D1.AbstractC2810k0.e
        public final boolean c(@NotNull e.c cVar) {
            return false;
        }

        @Override // D1.AbstractC2810k0.e
        public final void d(@NotNull H h11, long j11, @NotNull C2822w c2822w, boolean z11, boolean z12) {
            h11.q0(j11, c2822w, z12);
        }
    }

    /* renamed from: D1.k0$c */
    static final class c extends AbstractC7737t implements Function1<AbstractC2810k0, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f5509b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AbstractC2810k0 abstractC2810k0) {
            w0 b22 = abstractC2810k0.b2();
            if (b22 != null) {
                b22.invalidate();
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: D1.k0$d */
    static final class d extends AbstractC7737t implements Function1<AbstractC2810k0, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f5510b = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AbstractC2810k0 abstractC2810k0) {
            AbstractC2810k0 abstractC2810k02 = abstractC2810k0;
            if (abstractC2810k02.m0()) {
                A a11 = abstractC2810k02.f5489C;
                if (a11 == null) {
                    abstractC2810k02.N2(true);
                } else {
                    AbstractC2810k0.f5482L.a(a11);
                    abstractC2810k02.N2(true);
                    if (!AbstractC2810k0.f5482L.c(a11)) {
                        H B02 = abstractC2810k02.B0();
                        L N11 = B02.N();
                        if (N11.s() > 0) {
                            if (N11.u() || N11.v()) {
                                B02.e1(false);
                            }
                            N11.I().B1();
                        }
                        x0 f02 = B02.f0();
                        if (f02 != null) {
                            ((AndroidComposeView) f02).N0(B02);
                        }
                    }
                }
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: D1.k0$e */
    public interface e {
        int a();

        boolean b(@NotNull H h11);

        boolean c(@NotNull e.c cVar);

        void d(@NotNull H h11, long j11, @NotNull C2822w c2822w, boolean z11, boolean z12);
    }

    /* renamed from: D1.k0$f */
    static final class f extends AbstractC7737t implements Function2<InterfaceC7802U, o1.d, Unit> {
        f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC7802U interfaceC7802U, o1.d dVar) {
            InterfaceC7802U interfaceC7802U2 = interfaceC7802U;
            o1.d dVar2 = dVar;
            AbstractC2810k0 abstractC2810k0 = AbstractC2810k0.this;
            if (abstractC2810k0.B0().B0()) {
                AbstractC2810k0.J1(abstractC2810k0).f(abstractC2810k0, AbstractC2810k0.f5480J, new C2812l0(abstractC2810k0, interfaceC7802U2, dVar2));
                abstractC2810k0.f5492F = false;
            } else {
                abstractC2810k0.f5492F = true;
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: D1.k0$g */
    static final class g extends AbstractC7737t implements Function0<Unit> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AbstractC2810k0 g22 = AbstractC2810k0.this.g2();
            if (g22 != null) {
                g22.m2();
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: D1.k0$h */
    /* loaded from: classes8.dex */
    static final class h extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e.c f5514c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f5515d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f5516e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2822w f5517f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f5518g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f5519h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f5520i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(e.c cVar, e eVar, long j11, C2822w c2822w, boolean z11, boolean z12, float f7) {
            super(0);
            this.f5514c = cVar;
            this.f5515d = eVar;
            this.f5516e = j11;
            this.f5517f = c2822w;
            this.f5518g = z11;
            this.f5519h = z12;
            this.f5520i = f7;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AbstractC2810k0.this.G2(o0.a(this.f5514c, this.f5515d.a()), this.f5515d, this.f5516e, this.f5517f, this.f5518g, this.f5519h, this.f5520i);
            return Unit.f71690a;
        }
    }

    /* renamed from: D1.k0$i */
    static final class i extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC7825i0, Unit> f5521b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(Function1<? super InterfaceC7825i0, Unit> function1) {
            super(0);
            this.f5521b = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f5521b.invoke(AbstractC2810k0.f5481K);
            AbstractC2810k0.f5481K.c0();
            return Unit.f71690a;
        }
    }

    public AbstractC2810k0(@NotNull H h11) {
        this.f5495m = h11;
        this.f5503u = h11.E();
        this.f5504v = h11.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G2(e.c cVar, e eVar, long j11, C2822w c2822w, boolean z11, boolean z12, float f7) {
        if (cVar == null) {
            l2(eVar, j11, c2822w, z11, z12);
        } else if (eVar.c(cVar)) {
            c2822w.s(cVar, f7, z12, new h(cVar, eVar, j11, c2822w, z11, z12, f7));
        } else {
            G2(o0.a(cVar, eVar.a()), eVar, j11, c2822w, z11, z12, f7);
        }
    }

    private static AbstractC2810k0 H2(B1.B b11) {
        AbstractC2810k0 b12;
        B1.S s11 = b11 instanceof B1.S ? (B1.S) b11 : null;
        if (s11 != null && (b12 = s11.b()) != null) {
            return b12;
        }
        Intrinsics.g(b11, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (AbstractC2810k0) b11;
    }

    public static final z0 J1(AbstractC2810k0 abstractC2810k0) {
        return ((AndroidComposeView) K.b(abstractC2810k0.f5495m)).getF40501C();
    }

    private final void K2(AbstractC2810k0 abstractC2810k0, float[] fArr) {
        if (Intrinsics.d(abstractC2810k0, this)) {
            return;
        }
        AbstractC2810k0 abstractC2810k02 = this.f5499q;
        Intrinsics.f(abstractC2810k02);
        abstractC2810k02.K2(abstractC2810k0, fArr);
        if (!Z1.m.c(this.f5508z, 0L)) {
            float[] fArr2 = f5483M;
            C7837o0.e(fArr2);
            long j11 = this.f5508z;
            C7837o0.i(-((int) (j11 >> 32)), -((int) (j11 & 4294967295L)), fArr2);
            C7837o0.h(fArr, fArr2);
        }
        w0 w0Var = this.f5493G;
        if (w0Var != null) {
            w0Var.j(fArr);
        }
    }

    private final void L2(AbstractC2810k0 abstractC2810k0, float[] fArr) {
        AbstractC2810k0 abstractC2810k02 = this;
        while (!abstractC2810k02.equals(abstractC2810k0)) {
            w0 w0Var = abstractC2810k02.f5493G;
            if (w0Var != null) {
                w0Var.d(fArr);
            }
            if (!Z1.m.c(abstractC2810k02.f5508z, 0L)) {
                float[] fArr2 = f5483M;
                C7837o0.e(fArr2);
                C7837o0.i((int) (r1 >> 32), (int) (r1 & 4294967295L), fArr2);
                C7837o0.h(fArr, fArr2);
            }
            abstractC2810k02 = abstractC2810k02.f5499q;
            Intrinsics.f(abstractC2810k02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N2(boolean z11) {
        x0 f02;
        if (this.f5494H != null) {
            return;
        }
        w0 w0Var = this.f5493G;
        if (w0Var == null) {
            if (this.f5502t == null) {
                return;
            }
            A1.a.b("null layer with a non-null layerBlock");
            throw null;
        }
        Function1<? super InterfaceC7825i0, Unit> function1 = this.f5502t;
        if (function1 == null) {
            A1.a.c("updateLayerParameters requires a non-null layerBlock");
            throw null;
        }
        l1.E0 e02 = f5481K;
        e02.W();
        H h11 = this.f5495m;
        e02.Y(h11.E());
        e02.a0(h11.O());
        e02.b0(Z1.r.b(q0()));
        ((AndroidComposeView) K.b(h11)).getF40501C().f(this, f5479I, new i(function1));
        A a11 = this.f5489C;
        if (a11 == null) {
            a11 = new A();
            this.f5489C = a11;
        }
        a11.b(e02);
        w0Var.h(e02);
        this.f5501s = e02.t();
        this.f5505w = e02.getAlpha();
        if (!z11 || (f02 = h11.f0()) == null) {
            return;
        }
        ((AndroidComposeView) f02).D0(h11);
    }

    private final void O1(AbstractC2810k0 abstractC2810k0, C7458d c7458d, boolean z11) {
        if (abstractC2810k0 == this) {
            return;
        }
        AbstractC2810k0 abstractC2810k02 = this.f5499q;
        if (abstractC2810k02 != null) {
            abstractC2810k02.O1(abstractC2810k0, c7458d, z11);
        }
        float f7 = (int) (this.f5508z >> 32);
        c7458d.i(c7458d.b() - f7);
        c7458d.j(c7458d.c() - f7);
        float f11 = (int) (this.f5508z & 4294967295L);
        c7458d.k(c7458d.d() - f11);
        c7458d.h(c7458d.a() - f11);
        w0 w0Var = this.f5493G;
        if (w0Var != null) {
            w0Var.c(c7458d, true);
            if (this.f5501s && z11) {
                c7458d.e(0.0f, 0.0f, (int) (q0() >> 32), (int) (q0() & 4294967295L));
            }
        }
    }

    private final long P1(AbstractC2810k0 abstractC2810k0, long j11) {
        if (abstractC2810k0 == this) {
            return j11;
        }
        AbstractC2810k0 abstractC2810k02 = this.f5499q;
        return (abstractC2810k02 == null || Intrinsics.d(abstractC2810k0, abstractC2810k02)) ? X1(j11) : X1(abstractC2810k02.P1(abstractC2810k0, j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U1(InterfaceC7802U interfaceC7802U, o1.d dVar) {
        InterfaceC7802U interfaceC7802U2;
        o1.d dVar2;
        e.c i22 = i2(4);
        if (i22 == null) {
            v2(interfaceC7802U, dVar);
            return;
        }
        H h11 = this.f5495m;
        h11.getClass();
        J f40539c = ((AndroidComposeView) K.b(h11)).getF40539c();
        long b11 = Z1.r.b(q0());
        f40539c.getClass();
        U0.b bVar = null;
        while (i22 != null) {
            if (i22 instanceof InterfaceC2819t) {
                interfaceC7802U2 = interfaceC7802U;
                dVar2 = dVar;
                f40539c.m(interfaceC7802U2, b11, this, (InterfaceC2819t) i22, dVar2);
            } else {
                interfaceC7802U2 = interfaceC7802U;
                dVar2 = dVar;
                if ((i22.getKindSet$ui_release() & 4) != 0 && (i22 instanceof AbstractC2813m)) {
                    int i11 = 0;
                    for (e.c J12 = ((AbstractC2813m) i22).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                        if ((J12.getKindSet$ui_release() & 4) != 0) {
                            i11++;
                            if (i11 == 1) {
                                i22 = J12;
                            } else {
                                if (bVar == null) {
                                    bVar = new U0.b(new e.c[16]);
                                }
                                if (i22 != null) {
                                    bVar.b(i22);
                                    i22 = null;
                                }
                                bVar.b(J12);
                            }
                        }
                    }
                    if (i11 == 1) {
                        interfaceC7802U = interfaceC7802U2;
                        dVar = dVar2;
                    }
                }
            }
            i22 = C2809k.b(bVar);
            interfaceC7802U = interfaceC7802U2;
            dVar = dVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.c j2(boolean z11) {
        e.c e22;
        H h11 = this.f5495m;
        if (h11.e0() == this) {
            return h11.c0().h();
        }
        if (!z11) {
            AbstractC2810k0 abstractC2810k0 = this.f5499q;
            if (abstractC2810k0 != null) {
                return abstractC2810k0.e2();
            }
            return null;
        }
        AbstractC2810k0 abstractC2810k02 = this.f5499q;
        if (abstractC2810k02 == null || (e22 = abstractC2810k02.e2()) == null) {
            return null;
        }
        return e22.getChild$ui_release();
    }

    private final void w2(long j11, float f7, Function1<? super InterfaceC7825i0, Unit> function1, o1.d dVar) {
        H h11 = this.f5495m;
        if (dVar == null) {
            if (this.f5494H != null) {
                this.f5494H = null;
                M2(null, false);
            }
            M2(function1, false);
        } else {
            if (function1 != null) {
                A1.a.a("both ways to create layers shouldn't be used together");
                throw null;
            }
            if (this.f5494H != dVar) {
                this.f5494H = null;
                M2(null, false);
                this.f5494H = dVar;
            }
            if (this.f5493G == null) {
                x0 b11 = K.b(h11);
                Function2<InterfaceC7802U, o1.d, Unit> function2 = this.f5490D;
                Function0<Unit> function0 = this.f5491E;
                w0 a02 = ((AndroidComposeView) b11).a0(function2, function0, dVar);
                a02.f(q0());
                a02.k(j11);
                this.f5493G = a02;
                h11.j1();
                ((g) function0).invoke();
            }
        }
        if (!Z1.m.c(this.f5508z, j11)) {
            this.f5508z = j11;
            h11.N().I().B1();
            w0 w0Var = this.f5493G;
            if (w0Var != null) {
                w0Var.k(j11);
            } else {
                AbstractC2810k0 abstractC2810k0 = this.f5499q;
                if (abstractC2810k0 != null) {
                    abstractC2810k0.m2();
                }
            }
            V.n1(this);
            x0 f02 = h11.f0();
            if (f02 != null) {
                ((AndroidComposeView) f02).D0(h11);
            }
        }
        this.f5487A = f7;
        if (p1()) {
            return;
        }
        X0(g1());
    }

    public final void A2(boolean z11) {
        this.f5497o = z11;
    }

    @Override // D1.V, D1.InterfaceC2790a0
    @NotNull
    public final H B0() {
        return this.f5495m;
    }

    public final void B2(boolean z11) {
        this.f5496n = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void C2(@NotNull B1.W w11) {
        AbstractC2810k0 abstractC2810k0;
        B1.W w12 = this.f5506x;
        if (w11 != w12) {
            this.f5506x = w11;
            if (w12 == null || w11.getWidth() != w12.getWidth() || w11.getHeight() != w12.getHeight()) {
                int width = w11.getWidth();
                int height = w11.getHeight();
                w0 w0Var = this.f5493G;
                H h11 = this.f5495m;
                if (w0Var != null) {
                    w0Var.f(Z1.r.a(width, height));
                } else if (h11.B0() && (abstractC2810k0 = this.f5499q) != null) {
                    abstractC2810k0.m2();
                }
                E0(Z1.r.a(width, height));
                if (this.f5502t != null) {
                    N2(false);
                }
                boolean h12 = p0.h(4);
                e.c e22 = e2();
                if (h12 || (e22 = e22.getParent$ui_release()) != null) {
                    for (e.c j22 = j2(h12); j22 != null && (j22.getAggregateChildKindSet$ui_release() & 4) != 0; j22 = j22.getChild$ui_release()) {
                        if ((j22.getKindSet$ui_release() & 4) != 0) {
                            AbstractC2813m abstractC2813m = j22;
                            ?? r72 = 0;
                            while (abstractC2813m != 0) {
                                if (abstractC2813m instanceof InterfaceC2819t) {
                                    ((InterfaceC2819t) abstractC2813m).u0();
                                } else if ((abstractC2813m.getKindSet$ui_release() & 4) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                                    e.c J12 = abstractC2813m.J1();
                                    int i11 = 0;
                                    abstractC2813m = abstractC2813m;
                                    r72 = r72;
                                    while (J12 != null) {
                                        if ((J12.getKindSet$ui_release() & 4) != 0) {
                                            i11++;
                                            r72 = r72;
                                            if (i11 == 1) {
                                                abstractC2813m = J12;
                                            } else {
                                                if (r72 == 0) {
                                                    r72 = new U0.b(new e.c[16]);
                                                }
                                                if (abstractC2813m != 0) {
                                                    r72.b(abstractC2813m);
                                                    abstractC2813m = 0;
                                                }
                                                r72.b(J12);
                                            }
                                        }
                                        J12 = J12.getChild$ui_release();
                                        abstractC2813m = abstractC2813m;
                                        r72 = r72;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC2813m = C2809k.b(r72);
                            }
                        }
                        if (j22 == e22) {
                            break;
                        }
                    }
                }
                x0 f02 = h11.f0();
                if (f02 != null) {
                    ((AndroidComposeView) f02).D0(h11);
                }
            }
            LinkedHashMap linkedHashMap = this.f5507y;
            if (((linkedHashMap == null || linkedHashMap.isEmpty()) && w11.s().isEmpty()) || Intrinsics.d(w11.s(), this.f5507y)) {
                return;
            }
            ((L.b) Y1()).s().l();
            LinkedHashMap linkedHashMap2 = this.f5507y;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.f5507y = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(w11.s());
        }
    }

    public final void D2(AbstractC2810k0 abstractC2810k0) {
        this.f5498p = abstractC2810k0;
    }

    public final void E2(AbstractC2810k0 abstractC2810k0) {
        this.f5499q = abstractC2810k0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final boolean F2() {
        e.c j22 = j2(p0.h(16));
        if (j22 != null && j22.isAttached()) {
            if (!j22.getNode().isAttached()) {
                A1.a.b("visitLocalDescendants called on an unattached node");
                throw null;
            }
            e.c node = j22.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & 16) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & 16) != 0) {
                        AbstractC2813m abstractC2813m = node;
                        ?? r52 = 0;
                        while (abstractC2813m != 0) {
                            if (abstractC2813m instanceof C0) {
                                if (((C0) abstractC2813m).C1()) {
                                    return true;
                                }
                            } else if ((abstractC2813m.getKindSet$ui_release() & 16) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                                e.c J12 = abstractC2813m.J1();
                                int i11 = 0;
                                abstractC2813m = abstractC2813m;
                                r52 = r52;
                                while (J12 != null) {
                                    if ((J12.getKindSet$ui_release() & 16) != 0) {
                                        i11++;
                                        r52 = r52;
                                        if (i11 == 1) {
                                            abstractC2813m = J12;
                                        } else {
                                            if (r52 == 0) {
                                                r52 = new U0.b(new e.c[16]);
                                            }
                                            if (abstractC2813m != 0) {
                                                r52.b(abstractC2813m);
                                                abstractC2813m = 0;
                                            }
                                            r52.b(J12);
                                        }
                                    }
                                    J12 = J12.getChild$ui_release();
                                    abstractC2813m = abstractC2813m;
                                    r52 = r52;
                                }
                                if (i11 == 1) {
                                }
                            }
                            abstractC2813m = C2809k.b(r52);
                        }
                    }
                    node = node.getChild$ui_release();
                }
            }
        }
        return false;
    }

    @Override // B1.B
    public final boolean I() {
        return e2().isAttached();
    }

    public final long I2(long j11) {
        w0 w0Var = this.f5493G;
        if (w0Var != null) {
            j11 = w0Var.e(j11, false);
        }
        long j12 = this.f5508z;
        return P9.a.a(C7459e.g(j11) + ((int) (j12 >> 32)), C7459e.h(j11) + ((int) (j12 & 4294967295L)));
    }

    @NotNull
    public final C7460f J2() {
        C7460f c7460f;
        C7460f c7460f2;
        if (!I()) {
            c7460f2 = C7460f.f70279e;
            return c7460f2;
        }
        B1.B c11 = B1.C.c(this);
        C7458d c7458d = this.f5488B;
        if (c7458d == null) {
            c7458d = new C7458d();
            this.f5488B = c7458d;
        }
        long Q12 = Q1(d2());
        c7458d.i(-C7464j.f(Q12));
        c7458d.k(-C7464j.d(Q12));
        c7458d.j(C7464j.f(Q12) + r0());
        c7458d.h(C7464j.d(Q12) + o0());
        AbstractC2810k0 abstractC2810k0 = this;
        while (abstractC2810k0 != c11) {
            abstractC2810k0.y2(c7458d, false, true);
            if (c7458d.f()) {
                c7460f = C7460f.f70279e;
                return c7460f;
            }
            abstractC2810k0 = abstractC2810k0.f5499q;
            Intrinsics.f(abstractC2810k0);
        }
        return new C7460f(c7458d.b(), c7458d.d(), c7458d.c(), c7458d.a());
    }

    @Override // B1.B
    @NotNull
    public final C7460f K(@NotNull B1.B b11, boolean z11) {
        C7460f c7460f;
        if (!I()) {
            A1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        if (!b11.I()) {
            A1.a.b("LayoutCoordinates " + b11 + " is not attached!");
            throw null;
        }
        AbstractC2810k0 H22 = H2(b11);
        H22.p2();
        AbstractC2810k0 W12 = W1(H22);
        C7458d c7458d = this.f5488B;
        if (c7458d == null) {
            c7458d = new C7458d();
            this.f5488B = c7458d;
        }
        c7458d.i(0.0f);
        c7458d.k(0.0f);
        c7458d.j((int) (b11.a() >> 32));
        c7458d.h((int) (b11.a() & 4294967295L));
        while (H22 != W12) {
            H22.y2(c7458d, z11, false);
            if (c7458d.f()) {
                c7460f = C7460f.f70279e;
                return c7460f;
            }
            H22 = H22.f5499q;
            Intrinsics.f(H22);
        }
        O1(W12, c7458d, z11);
        return new C7460f(c7458d.b(), c7458d.d(), c7458d.c(), c7458d.a());
    }

    @Override // B1.B
    public final long L(long j11) {
        if (I()) {
            B1.B c11 = B1.C.c(this);
            return o2(c11, C7459e.j(((AndroidComposeView) K.b(this.f5495m)).W(j11), c11.y(0L)));
        }
        A1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    public final void M2(Function1<? super InterfaceC7825i0, Unit> function1, boolean z11) {
        x0 f02;
        if (!(function1 == null || this.f5494H == null)) {
            A1.a.a("layerBlock can't be provided when explicitLayer is provided");
            throw null;
        }
        H h11 = this.f5495m;
        boolean z12 = (!z11 && this.f5502t == function1 && Intrinsics.d(this.f5503u, h11.E()) && this.f5504v == h11.O()) ? false : true;
        this.f5503u = h11.E();
        this.f5504v = h11.O();
        boolean z02 = h11.z0();
        Function0<Unit> function0 = this.f5491E;
        if (!z02 || function1 == null) {
            this.f5502t = null;
            w0 w0Var = this.f5493G;
            if (w0Var != null) {
                w0Var.a();
                h11.j1();
                ((g) function0).invoke();
                if (I() && (f02 = h11.f0()) != null) {
                    ((AndroidComposeView) f02).D0(h11);
                }
            }
            this.f5493G = null;
            this.f5492F = false;
            return;
        }
        this.f5502t = function1;
        if (this.f5493G != null) {
            if (z12) {
                N2(true);
                return;
            }
            return;
        }
        w0 a02 = ((AndroidComposeView) K.b(h11)).a0(this.f5490D, function0, null);
        a02.f(q0());
        a02.k(this.f5508z);
        this.f5493G = a02;
        N2(true);
        h11.j1();
        ((g) function0).invoke();
    }

    protected final boolean P2(long j11) {
        if (!P9.a.c(j11)) {
            return false;
        }
        w0 w0Var = this.f5493G;
        return w0Var == null || !this.f5501s || w0Var.g(j11);
    }

    protected final long Q1(long j11) {
        return C7465k.a(Math.max(0.0f, (C7464j.f(j11) - r0()) / 2.0f), Math.max(0.0f, (C7464j.d(j11) - o0()) / 2.0f));
    }

    protected final float R1(long j11, long j12) {
        if (r0() >= C7464j.f(j12) && o0() >= C7464j.d(j12)) {
            return Float.POSITIVE_INFINITY;
        }
        long Q12 = Q1(j12);
        float f7 = C7464j.f(Q12);
        float d11 = C7464j.d(Q12);
        float g10 = C7459e.g(j11);
        float max = Math.max(0.0f, g10 < 0.0f ? -g10 : g10 - r0());
        float h11 = C7459e.h(j11);
        long a11 = P9.a.a(max, Math.max(0.0f, h11 < 0.0f ? -h11 : h11 - o0()));
        if ((f7 > 0.0f || d11 > 0.0f) && C7459e.g(a11) <= f7 && C7459e.h(a11) <= d11) {
            return C7459e.f(a11);
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // B1.B
    public final void S(@NotNull float[] fArr) {
        x0 b11 = K.b(this.f5495m);
        L2(H2(B1.C.c(this)), fArr);
        ((AndroidComposeView) b11).v0(fArr);
    }

    public final void S1(@NotNull InterfaceC7802U interfaceC7802U, o1.d dVar) {
        w0 w0Var = this.f5493G;
        if (w0Var != null) {
            w0Var.i(interfaceC7802U, dVar);
            return;
        }
        long j11 = this.f5508z;
        float f7 = (int) (j11 >> 32);
        float f11 = (int) (j11 & 4294967295L);
        interfaceC7802U.f(f7, f11);
        U1(interfaceC7802U, dVar);
        interfaceC7802U.f(-f7, -f11);
    }

    protected final void T1(@NotNull InterfaceC7802U interfaceC7802U, @NotNull C7784B c7784b) {
        interfaceC7802U.j(new C7460f(0.5f, 0.5f, ((int) (q0() >> 32)) - 0.5f, ((int) (q0() & 4294967295L)) - 0.5f), c7784b);
    }

    public abstract void V1();

    @Override // B1.B
    public final long W(@NotNull B1.B b11, long j11) {
        return o2(b11, j11);
    }

    @NotNull
    public final AbstractC2810k0 W1(@NotNull AbstractC2810k0 abstractC2810k0) {
        H h11 = abstractC2810k0.f5495m;
        H h12 = this.f5495m;
        if (h11 == h12) {
            e.c e22 = abstractC2810k0.e2();
            e.c e23 = e2();
            if (!e23.getNode().isAttached()) {
                A1.a.b("visitLocalAncestors called on an unattached node");
                throw null;
            }
            for (e.c parent$ui_release = e23.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & 2) != 0 && parent$ui_release == e22) {
                    return abstractC2810k0;
                }
            }
            return this;
        }
        while (h11.F() > h12.F()) {
            h11 = h11.g0();
            Intrinsics.f(h11);
        }
        H h13 = h12;
        while (h13.F() > h11.F()) {
            h13 = h13.g0();
            Intrinsics.f(h13);
        }
        while (h11 != h13) {
            h11 = h11.g0();
            h13 = h13.g0();
            if (h11 == null || h13 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (h13 != h12) {
            if (h11 != abstractC2810k0.f5495m) {
                return h11.J();
            }
            return abstractC2810k0;
        }
        return this;
    }

    public final long X1(long j11) {
        long j12 = this.f5508z;
        long a11 = P9.a.a(C7459e.g(j11) - ((int) (j12 >> 32)), C7459e.h(j11) - ((int) (j12 & 4294967295L)));
        w0 w0Var = this.f5493G;
        return w0Var != null ? w0Var.e(a11, true) : a11;
    }

    @NotNull
    public final InterfaceC2791b Y1() {
        return this.f5495m.N().r();
    }

    public final boolean Z1() {
        return this.f5497o;
    }

    @Override // D1.V
    public final V a1() {
        return this.f5498p;
    }

    public final boolean a2() {
        return this.f5492F;
    }

    public final w0 b2() {
        return this.f5493G;
    }

    @Override // D1.V
    @NotNull
    public final B1.B c1() {
        return this;
    }

    public abstract Y c2();

    public final long d2() {
        return this.f5503u.D0(this.f5495m.k0().f());
    }

    @Override // D1.V
    public final boolean e1() {
        return this.f5506x != null;
    }

    @NotNull
    public abstract e.c e2();

    public final AbstractC2810k0 f2() {
        return this.f5498p;
    }

    @Override // Z1.d
    public final float g() {
        return this.f5495m.E().g();
    }

    @Override // D1.V
    @NotNull
    public final B1.W g1() {
        B1.W w11 = this.f5506x;
        if (w11 != null) {
            return w11;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public final AbstractC2810k0 g2() {
        return this.f5499q;
    }

    @Override // B1.InterfaceC2553w
    @NotNull
    public final Z1.s getLayoutDirection() {
        return this.f5495m.O();
    }

    @Override // D1.V
    public final V h1() {
        return this.f5499q;
    }

    public final float h2() {
        return this.f5487A;
    }

    public final e.c i2(int i11) {
        boolean h11 = p0.h(i11);
        e.c e22 = e2();
        if (!h11 && (e22 = e22.getParent$ui_release()) == null) {
            return null;
        }
        for (e.c j22 = j2(h11); j22 != null && (j22.getAggregateChildKindSet$ui_release() & i11) != 0; j22 = j22.getChild$ui_release()) {
            if ((j22.getKindSet$ui_release() & i11) != 0) {
                return j22;
            }
            if (j22 == e22) {
                return null;
            }
        }
        return null;
    }

    public final void k2(@NotNull e eVar, long j11, @NotNull C2822w c2822w, boolean z11, boolean z12) {
        e.c i22 = i2(eVar.a());
        if (!P2(j11)) {
            if (z11) {
                float R12 = R1(j11, d2());
                if (Float.isInfinite(R12) || Float.isNaN(R12) || !c2822w.q(R12, false)) {
                    return;
                }
                if (i22 == null) {
                    l2(eVar, j11, c2822w, z11, false);
                    return;
                } else {
                    c2822w.o(i22, R12, false, new n0(this, i22, eVar, j11, c2822w, z11, false, R12));
                    return;
                }
            }
            return;
        }
        if (i22 == null) {
            l2(eVar, j11, c2822w, z11, z12);
            return;
        }
        float g10 = C7459e.g(j11);
        float h11 = C7459e.h(j11);
        if (g10 >= 0.0f && h11 >= 0.0f && g10 < r0() && h11 < o0()) {
            c2822w.n(i22, z12, new m0(this, i22, eVar, j11, c2822w, z11, z12));
            return;
        }
        float R13 = !z11 ? Float.POSITIVE_INFINITY : R1(j11, d2());
        if (Float.isInfinite(R13) || Float.isNaN(R13) || !c2822w.q(R13, z12)) {
            G2(i22, eVar, j11, c2822w, z11, z12, R13);
        } else {
            c2822w.o(i22, R13, z12, new n0(this, i22, eVar, j11, c2822w, z11, z12, R13));
        }
    }

    @Override // D1.V
    public final long l1() {
        return this.f5508z;
    }

    public void l2(@NotNull e eVar, long j11, @NotNull C2822w c2822w, boolean z11, boolean z12) {
        AbstractC2810k0 abstractC2810k0 = this.f5498p;
        if (abstractC2810k0 != null) {
            abstractC2810k0.k2(eVar, abstractC2810k0.X1(j11), c2822w, z11, z12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
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
    @Override // B1.Z, B1.InterfaceC2552v
    public final Object m() {
        H h11 = this.f5495m;
        if (!h11.c0().o(64)) {
            return null;
        }
        e2();
        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        for (e.c m12 = h11.c0().m(); m12 != null; m12 = m12.getParent$ui_release()) {
            if ((m12.getKindSet$ui_release() & 64) != 0) {
                ?? r62 = 0;
                AbstractC2813m abstractC2813m = m12;
                while (abstractC2813m != 0) {
                    if (abstractC2813m instanceof A0) {
                        m11.f71787a = ((A0) abstractC2813m).M(h11.E(), m11.f71787a);
                    } else if ((abstractC2813m.getKindSet$ui_release() & 64) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                        e.c J12 = abstractC2813m.J1();
                        int i11 = 0;
                        abstractC2813m = abstractC2813m;
                        r62 = r62;
                        while (J12 != null) {
                            if ((J12.getKindSet$ui_release() & 64) != 0) {
                                i11++;
                                r62 = r62;
                                if (i11 == 1) {
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
                        if (i11 == 1) {
                        }
                    }
                    abstractC2813m = C2809k.b(r62);
                }
            }
        }
        return m11.f71787a;
    }

    @Override // D1.y0
    public final boolean m0() {
        return (this.f5493G == null || this.f5500r || !this.f5495m.z0()) ? false : true;
    }

    public final void m2() {
        w0 w0Var = this.f5493G;
        if (w0Var != null) {
            w0Var.invalidate();
            return;
        }
        AbstractC2810k0 abstractC2810k0 = this.f5499q;
        if (abstractC2810k0 != null) {
            abstractC2810k0.m2();
        }
    }

    public final boolean n2() {
        if (this.f5493G != null && this.f5505w <= 0.0f) {
            return true;
        }
        AbstractC2810k0 abstractC2810k0 = this.f5499q;
        if (abstractC2810k0 != null) {
            return abstractC2810k0.n2();
        }
        return false;
    }

    public final long o2(@NotNull B1.B b11, long j11) {
        if (b11 instanceof B1.S) {
            ((B1.S) b11).b().p2();
            return ((B1.S) b11).d(this, j11 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        AbstractC2810k0 H22 = H2(b11);
        H22.p2();
        AbstractC2810k0 W12 = W1(H22);
        while (H22 != W12) {
            j11 = H22.I2(j11);
            H22 = H22.f5499q;
            Intrinsics.f(H22);
        }
        return P1(W12, j11);
    }

    public final void p2() {
        this.f5495m.N().S();
    }

    public final void q2() {
        w0 w0Var = this.f5493G;
        if (w0Var != null) {
            w0Var.invalidate();
        }
    }

    public final void r2() {
        M2(this.f5502t, true);
        w0 w0Var = this.f5493G;
        if (w0Var != null) {
            w0Var.invalidate();
        }
    }

    @Override // D1.V
    public final void s1() {
        o1.d dVar = this.f5494H;
        if (dVar != null) {
            y0(this.f5508z, this.f5487A, dVar);
        } else {
            x0(this.f5508z, this.f5487A, this.f5502t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void s2() {
        e.c parent$ui_release;
        e.c j22 = j2(p0.h(UserVerificationMethods.USER_VERIFY_PATTERN));
        if (j22 == null || (j22.getNode().getAggregateChildKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
            return;
        }
        AbstractC5715f a11 = AbstractC5715f.a.a();
        Function1<Object, Unit> h11 = a11 != null ? a11.h() : null;
        AbstractC5715f b11 = AbstractC5715f.a.b(a11);
        try {
            boolean h12 = p0.h(UserVerificationMethods.USER_VERIFY_PATTERN);
            if (h12) {
                parent$ui_release = e2();
            } else {
                parent$ui_release = e2().getParent$ui_release();
                if (parent$ui_release == null) {
                    Unit unit = Unit.f71690a;
                    AbstractC5715f.a.d(a11, b11, h11);
                }
            }
            for (e.c j23 = j2(h12); j23 != null && (j23.getAggregateChildKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0; j23 = j23.getChild$ui_release()) {
                if ((j23.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    ?? r92 = 0;
                    AbstractC2813m abstractC2813m = j23;
                    while (abstractC2813m != 0) {
                        if (abstractC2813m instanceof B) {
                            ((B) abstractC2813m).E(q0());
                        } else if ((abstractC2813m.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                            e.c J12 = abstractC2813m.J1();
                            int i11 = 0;
                            abstractC2813m = abstractC2813m;
                            r92 = r92;
                            while (J12 != null) {
                                if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                    i11++;
                                    r92 = r92;
                                    if (i11 == 1) {
                                        abstractC2813m = J12;
                                    } else {
                                        if (r92 == 0) {
                                            r92 = new U0.b(new e.c[16]);
                                        }
                                        if (abstractC2813m != 0) {
                                            r92.b(abstractC2813m);
                                            abstractC2813m = 0;
                                        }
                                        r92.b(J12);
                                    }
                                }
                                J12 = J12.getChild$ui_release();
                                abstractC2813m = abstractC2813m;
                                r92 = r92;
                            }
                            if (i11 == 1) {
                            }
                        }
                        abstractC2813m = C2809k.b(r92);
                    }
                }
                if (j23 == parent$ui_release) {
                    break;
                }
            }
            Unit unit2 = Unit.f71690a;
            AbstractC5715f.a.d(a11, b11, h11);
        } catch (Throwable th2) {
            AbstractC5715f.a.d(a11, b11, h11);
            throw th2;
        }
    }

    @Override // B1.B
    public final long t(long j11) {
        if (I()) {
            return o2(B1.C.c(this), ((AndroidComposeView) K.b(this.f5495m)).P0(j11));
        }
        A1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void t2() {
        boolean h11 = p0.h(UserVerificationMethods.USER_VERIFY_PATTERN);
        e.c e22 = e2();
        if (!h11 && (e22 = e22.getParent$ui_release()) == null) {
            return;
        }
        for (e.c j22 = j2(h11); j22 != null && (j22.getAggregateChildKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0; j22 = j22.getChild$ui_release()) {
            if ((j22.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                AbstractC2813m abstractC2813m = j22;
                ?? r52 = 0;
                while (abstractC2813m != 0) {
                    if (abstractC2813m instanceof B) {
                        ((B) abstractC2813m).y(this);
                    } else if ((abstractC2813m.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                        e.c J12 = abstractC2813m.J1();
                        int i11 = 0;
                        abstractC2813m = abstractC2813m;
                        r52 = r52;
                        while (J12 != null) {
                            if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                                i11++;
                                r52 = r52;
                                if (i11 == 1) {
                                    abstractC2813m = J12;
                                } else {
                                    if (r52 == 0) {
                                        r52 = new U0.b(new e.c[16]);
                                    }
                                    if (abstractC2813m != 0) {
                                        r52.b(abstractC2813m);
                                        abstractC2813m = 0;
                                    }
                                    r52.b(J12);
                                }
                            }
                            J12 = J12.getChild$ui_release();
                            abstractC2813m = abstractC2813m;
                            r52 = r52;
                        }
                        if (i11 == 1) {
                        }
                    }
                    abstractC2813m = C2809k.b(r52);
                }
            }
            if (j22 == e22) {
                return;
            }
        }
    }

    @Override // B1.B
    public final long u(long j11) {
        return ((AndroidComposeView) K.b(this.f5495m)).X(y(j11));
    }

    @Override // Z1.k
    public final float u1() {
        return this.f5495m.E().u1();
    }

    public final void u2() {
        this.f5500r = true;
        ((g) this.f5491E).invoke();
        z2();
    }

    @Override // B1.B
    public final void v(@NotNull B1.B b11, @NotNull float[] fArr) {
        AbstractC2810k0 H22 = H2(b11);
        H22.p2();
        AbstractC2810k0 W12 = W1(H22);
        C7837o0.e(fArr);
        H22.L2(W12, fArr);
        K2(W12, fArr);
    }

    public void v2(@NotNull InterfaceC7802U interfaceC7802U, o1.d dVar) {
        AbstractC2810k0 abstractC2810k0 = this.f5498p;
        if (abstractC2810k0 != null) {
            abstractC2810k0.S1(interfaceC7802U, dVar);
        }
    }

    @Override // B1.B
    public final B1.B w() {
        if (I()) {
            p2();
            return this.f5495m.e0().f5499q;
        }
        A1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override // B1.m0
    protected void x0(long j11, float f7, Function1<? super InterfaceC7825i0, Unit> function1) {
        if (!this.f5496n) {
            w2(j11, f7, function1, null);
            return;
        }
        Y c22 = c2();
        Intrinsics.f(c22);
        w2(c22.l1(), f7, function1, null);
    }

    public final void x2(long j11, float f7, Function1<? super InterfaceC7825i0, Unit> function1, o1.d dVar) {
        w2(Z1.m.e(j11, f0()), f7, function1, dVar);
    }

    @Override // B1.B
    public final long y(long j11) {
        if (!I()) {
            A1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        p2();
        for (AbstractC2810k0 abstractC2810k0 = this; abstractC2810k0 != null; abstractC2810k0 = abstractC2810k0.f5499q) {
            j11 = abstractC2810k0.I2(j11);
        }
        return j11;
    }

    @Override // B1.m0
    protected void y0(long j11, float f7, @NotNull o1.d dVar) {
        if (!this.f5496n) {
            w2(j11, f7, null, dVar);
            return;
        }
        Y c22 = c2();
        Intrinsics.f(c22);
        w2(c22.l1(), f7, null, dVar);
    }

    public final void y2(@NotNull C7458d c7458d, boolean z11, boolean z12) {
        w0 w0Var = this.f5493G;
        if (w0Var != null) {
            if (this.f5501s) {
                if (z12) {
                    long d22 = d2();
                    float f7 = C7464j.f(d22) / 2.0f;
                    float d11 = C7464j.d(d22) / 2.0f;
                    c7458d.e(-f7, -d11, ((int) (q0() >> 32)) + f7, ((int) (q0() & 4294967295L)) + d11);
                } else if (z11) {
                    c7458d.e(0.0f, 0.0f, (int) (q0() >> 32), (int) (q0() & 4294967295L));
                }
                if (c7458d.f()) {
                    return;
                }
            }
            w0Var.c(c7458d, false);
        }
        float f11 = (int) (this.f5508z >> 32);
        c7458d.i(c7458d.b() + f11);
        c7458d.j(c7458d.c() + f11);
        float f12 = (int) (this.f5508z & 4294967295L);
        c7458d.k(c7458d.d() + f12);
        c7458d.h(c7458d.a() + f12);
    }

    public final void z2() {
        if (this.f5493G != null) {
            if (this.f5494H != null) {
                this.f5494H = null;
            }
            M2(null, false);
            this.f5495m.e1(false);
        }
    }
}
