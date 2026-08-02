package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.os.Build;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import k1.C7455a;
import k1.C7458d;
import k1.C7459e;
import k1.C7462h;
import k1.C7465k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7839p0;
import l1.C7784B;
import l1.C7785C;
import l1.C7786D;
import l1.C7790H;
import l1.C7837o0;
import l1.C7845v;
import l1.InterfaceC7802U;
import l1.InterfaceC7823h0;
import l1.s0;
import n1.C8408a;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class X0 implements D1.w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private o1.d f40758a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7823h0 f40759b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f40760c;

    /* renamed from: d, reason: collision with root package name */
    private Function2<? super InterfaceC7802U, ? super o1.d, Unit> f40761d;

    /* renamed from: e, reason: collision with root package name */
    private Function0<Unit> f40762e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f40764g;

    /* renamed from: i, reason: collision with root package name */
    private float[] f40766i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f40767j;

    /* renamed from: n, reason: collision with root package name */
    private int f40771n;

    /* renamed from: o, reason: collision with root package name */
    private long f40772o;

    /* renamed from: p, reason: collision with root package name */
    private AbstractC7839p0 f40773p;

    /* renamed from: q, reason: collision with root package name */
    private C7786D f40774q;

    /* renamed from: r, reason: collision with root package name */
    private C7784B f40775r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f40776s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final Function1<InterfaceC8412e, Unit> f40777t;

    /* renamed from: f, reason: collision with root package name */
    private long f40763f = Z1.r.a(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final float[] f40765h = C7837o0.b();

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private Z1.d f40768k = Z1.f.b();

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private Z1.s f40769l = Z1.s.Ltr;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C8408a f40770m = new C8408a();

    static final class a extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC8412e interfaceC8412e) {
            InterfaceC8412e interfaceC8412e2 = interfaceC8412e;
            InterfaceC7802U a11 = interfaceC8412e2.w0().a();
            Function2 function2 = X0.this.f40761d;
            if (function2 != null) {
                function2.invoke(a11, interfaceC8412e2.w0().c());
            }
            return Unit.f71690a;
        }
    }

    public X0(@NotNull o1.d dVar, InterfaceC7823h0 interfaceC7823h0, @NotNull AndroidComposeView androidComposeView, @NotNull Function2<? super InterfaceC7802U, ? super o1.d, Unit> function2, @NotNull Function0<Unit> function0) {
        long j11;
        this.f40758a = dVar;
        this.f40759b = interfaceC7823h0;
        this.f40760c = androidComposeView;
        this.f40761d = function2;
        this.f40762e = function0;
        j11 = l1.N0.f72232b;
        this.f40772o = j11;
        this.f40777t = new a();
    }

    private final float[] n() {
        float[] o11 = o();
        float[] fArr = this.f40766i;
        if (fArr == null) {
            fArr = C7837o0.b();
            this.f40766i = fArr;
        }
        if (C5248g1.a(o11, fArr)) {
            return fArr;
        }
        return null;
    }

    private final float[] o() {
        o1.d dVar = this.f40758a;
        long b11 = P9.a.e(dVar.j()) ? C7465k.b(Z1.r.b(this.f40763f)) : dVar.j();
        float[] fArr = this.f40765h;
        C7837o0.e(fArr);
        float[] b12 = C7837o0.b();
        C7837o0.i(-C7459e.g(b11), -C7459e.h(b11), b12);
        C7837o0.h(fArr, b12);
        float[] b13 = C7837o0.b();
        C7837o0.i(dVar.s(), dVar.t(), b13);
        double k11 = (dVar.k() * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(k11);
        float sin = (float) Math.sin(k11);
        float f7 = b13[1];
        float f11 = b13[2];
        float f12 = b13[5];
        float f13 = b13[6];
        float f14 = b13[9];
        float f15 = b13[10];
        float f16 = b13[13];
        float f17 = b13[14];
        b13[1] = (f7 * cos) - (f11 * sin);
        b13[2] = (f11 * cos) + (f7 * sin);
        b13[5] = (f12 * cos) - (f13 * sin);
        b13[6] = (f13 * cos) + (f12 * sin);
        b13[9] = (f14 * cos) - (f15 * sin);
        b13[10] = (f15 * cos) + (f14 * sin);
        b13[13] = (f16 * cos) - (f17 * sin);
        b13[14] = (f17 * cos) + (f16 * sin);
        double l11 = (dVar.l() * 3.141592653589793d) / 180.0d;
        float cos2 = (float) Math.cos(l11);
        float sin2 = (float) Math.sin(l11);
        float f18 = b13[0];
        float f19 = b13[2];
        float f21 = b13[4];
        float f22 = b13[6];
        float f23 = b13[8];
        float f24 = b13[10];
        float f25 = b13[12];
        float f26 = b13[14];
        b13[0] = (f19 * sin2) + (f18 * cos2);
        b13[2] = (f19 * cos2) + ((-f18) * sin2);
        b13[4] = (f22 * sin2) + (f21 * cos2);
        b13[6] = (f22 * cos2) + ((-f21) * sin2);
        b13[8] = (f24 * sin2) + (f23 * cos2);
        b13[10] = (f24 * cos2) + ((-f23) * sin2);
        b13[12] = (f26 * sin2) + (f25 * cos2);
        b13[14] = (f26 * cos2) + ((-f25) * sin2);
        C7837o0.f(dVar.m(), b13);
        C7837o0.g(dVar.n(), dVar.o(), b13);
        C7837o0.h(fArr, b13);
        float[] b14 = C7837o0.b();
        C7837o0.i(C7459e.g(b11), C7459e.h(b11), b14);
        C7837o0.h(fArr, b14);
        return fArr;
    }

    @Override // D1.w0
    public final void a() {
        this.f40761d = null;
        this.f40762e = null;
        this.f40764g = true;
        boolean z11 = this.f40767j;
        AndroidComposeView androidComposeView = this.f40760c;
        if (z11) {
            this.f40767j = false;
            androidComposeView.z0(this, false);
        }
        InterfaceC7823h0 interfaceC7823h0 = this.f40759b;
        if (interfaceC7823h0 != null) {
            interfaceC7823h0.b(this.f40758a);
            androidComposeView.I0(this);
        }
    }

    @Override // D1.w0
    public final void b(@NotNull Function2<? super InterfaceC7802U, ? super o1.d, Unit> function2, @NotNull Function0<Unit> function0) {
        long j11;
        InterfaceC7823h0 interfaceC7823h0 = this.f40759b;
        if (interfaceC7823h0 == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f40758a.u()) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.f40758a = interfaceC7823h0.a();
        this.f40764g = false;
        this.f40761d = function2;
        this.f40762e = function0;
        j11 = l1.N0.f72232b;
        this.f40772o = j11;
        this.f40776s = false;
        this.f40763f = Z1.r.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f40773p = null;
        this.f40771n = 0;
    }

    @Override // D1.w0
    public final void c(@NotNull C7458d c7458d, boolean z11) {
        if (!z11) {
            C7837o0.d(o(), c7458d);
            return;
        }
        float[] n11 = n();
        if (n11 == null) {
            c7458d.g();
        } else {
            C7837o0.d(n11, c7458d);
        }
    }

    @Override // D1.w0
    public final void d(@NotNull float[] fArr) {
        C7837o0.h(fArr, o());
    }

    @Override // D1.w0
    public final long e(long j11, boolean z11) {
        if (!z11) {
            return C7837o0.c(j11, o());
        }
        float[] n11 = n();
        if (n11 != null) {
            return C7837o0.c(j11, n11);
        }
        return 9187343241974906880L;
    }

    @Override // D1.w0
    public final void f(long j11) {
        if (Z1.q.c(j11, this.f40763f)) {
            return;
        }
        this.f40763f = j11;
        if (this.f40767j || this.f40764g) {
            return;
        }
        AndroidComposeView androidComposeView = this.f40760c;
        androidComposeView.invalidate();
        if (true != this.f40767j) {
            this.f40767j = true;
            androidComposeView.z0(this, true);
        }
    }

    @Override // D1.w0
    public final boolean g(long j11) {
        float g10 = C7459e.g(j11);
        float h11 = C7459e.h(j11);
        if (this.f40758a.h()) {
            return O1.a(this.f40758a.i(), g10, h11);
        }
        return true;
    }

    @Override // D1.w0
    public final void h(@NotNull l1.E0 e02) {
        Function0<Unit> function0;
        int i11;
        long j11;
        Function0<Unit> function02;
        int y11 = e02.y() | this.f40771n;
        this.f40769l = e02.w();
        this.f40768k = e02.v();
        int i12 = y11 & 4096;
        if (i12 != 0) {
            this.f40772o = e02.P();
        }
        if ((y11 & 1) != 0) {
            this.f40758a.L(e02.K());
        }
        if ((y11 & 2) != 0) {
            this.f40758a.M(e02.L());
        }
        if ((y11 & 4) != 0) {
            this.f40758a.z(e02.getAlpha());
        }
        if ((y11 & 8) != 0) {
            this.f40758a.Q(e02.S());
        }
        if ((y11 & 16) != 0) {
            this.f40758a.R(e02.T());
        }
        if ((y11 & 32) != 0) {
            this.f40758a.N(e02.M());
            if (e02.M() > 0.0f && !this.f40776s && (function02 = this.f40762e) != null) {
                function02.invoke();
            }
        }
        if ((y11 & 64) != 0) {
            this.f40758a.A(e02.m());
        }
        if ((y11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            this.f40758a.O(e02.O());
        }
        if ((y11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            this.f40758a.J(e02.I());
        }
        if ((y11 & 256) != 0) {
            this.f40758a.H(e02.E());
        }
        if ((y11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            this.f40758a.I(e02.G());
        }
        if ((y11 & 2048) != 0) {
            this.f40758a.B(e02.s());
        }
        if (i12 != 0) {
            long j12 = this.f40772o;
            j11 = l1.N0.f72232b;
            if (l1.N0.c(j12, j11)) {
                this.f40758a.F(9205357640488583168L);
            } else {
                this.f40758a.F(P9.a.a(l1.N0.d(this.f40772o) * ((int) (this.f40763f >> 32)), l1.N0.e(this.f40772o) * ((int) (this.f40763f & 4294967295L))));
            }
        }
        if ((y11 & 16384) != 0) {
            this.f40758a.C(e02.t());
        }
        if ((131072 & y11) != 0) {
            this.f40758a.G(e02.D());
        }
        boolean z11 = true;
        if ((32768 & y11) != 0) {
            o1.d dVar = this.f40758a;
            int u11 = e02.u();
            if (u11 == 0) {
                i11 = 0;
            } else if (u11 == 1) {
                i11 = 1;
            } else {
                i11 = 2;
                if (u11 != 2) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            dVar.D(i11);
        }
        if (Intrinsics.d(this.f40773p, e02.A())) {
            z11 = false;
        } else {
            AbstractC7839p0 A11 = e02.A();
            this.f40773p = A11;
            if (A11 != null) {
                o1.d dVar2 = this.f40758a;
                if (A11 instanceof AbstractC7839p0.b) {
                    AbstractC7839p0.b bVar = (AbstractC7839p0.b) A11;
                    dVar2.K(P9.a.a(bVar.b().n(), bVar.b().q()), C7465k.a(bVar.b().u(), bVar.b().m()), 0.0f);
                } else if (A11 instanceof AbstractC7839p0.a) {
                    dVar2.E(((AbstractC7839p0.a) A11).b());
                } else if (A11 instanceof AbstractC7839p0.c) {
                    AbstractC7839p0.c cVar = (AbstractC7839p0.c) A11;
                    if (cVar.c() != null) {
                        dVar2.E(cVar.c());
                    } else {
                        C7462h b11 = cVar.b();
                        dVar2.K(P9.a.a(b11.e(), b11.g()), C7465k.a(b11.j(), b11.d()), C7455a.d(b11.b()));
                    }
                }
                if ((A11 instanceof AbstractC7839p0.a) && Build.VERSION.SDK_INT < 33 && (function0 = this.f40762e) != null) {
                    function0.invoke();
                }
            }
        }
        this.f40771n = e02.y();
        if (y11 != 0 || z11) {
            y2.f41105a.a(this.f40760c);
        }
    }

    @Override // D1.w0
    public final void i(@NotNull InterfaceC7802U interfaceC7802U, o1.d dVar) {
        Canvas b11 = C7845v.b(interfaceC7802U);
        if (b11.isHardwareAccelerated()) {
            l();
            this.f40776s = this.f40758a.p() > 0.0f;
            C8408a c8408a = this.f40770m;
            C8408a.b w02 = c8408a.w0();
            w02.g(interfaceC7802U);
            w02.i(dVar);
            this.f40758a.f(c8408a.w0().a(), c8408a.w0().c());
            return;
        }
        float r11 = (int) (this.f40758a.r() >> 32);
        float r12 = (int) (this.f40758a.r() & 4294967295L);
        long j11 = this.f40763f;
        float f7 = r11 + ((int) (j11 >> 32));
        float f11 = r12 + ((int) (4294967295L & j11));
        if (this.f40758a.g() < 1.0f) {
            C7784B c7784b = this.f40775r;
            if (c7784b == null) {
                c7784b = C7785C.a();
                this.f40775r = c7784b;
            }
            c7784b.setAlpha(this.f40758a.g());
            b11.saveLayer(r11, r12, f7, f11, c7784b.d());
        } else {
            interfaceC7802U.save();
        }
        interfaceC7802U.f(r11, r12);
        interfaceC7802U.s(o());
        if (this.f40758a.h() && this.f40758a.h()) {
            AbstractC7839p0 i11 = this.f40758a.i();
            if (i11 instanceof AbstractC7839p0.b) {
                interfaceC7802U.r(((AbstractC7839p0.b) i11).b());
            } else if (i11 instanceof AbstractC7839p0.c) {
                C7786D c7786d = this.f40774q;
                if (c7786d == null) {
                    c7786d = C7790H.a();
                    this.f40774q = c7786d;
                }
                c7786d.reset();
                c7786d.s(((AbstractC7839p0.c) i11).b(), s0.a.CounterClockwise);
                interfaceC7802U.u(c7786d);
            } else if (i11 instanceof AbstractC7839p0.a) {
                interfaceC7802U.u(((AbstractC7839p0.a) i11).b());
            }
        }
        Function2<? super InterfaceC7802U, ? super o1.d, Unit> function2 = this.f40761d;
        if (function2 != null) {
            function2.invoke(interfaceC7802U, null);
        }
        interfaceC7802U.p();
    }

    @Override // D1.w0
    public final void invalidate() {
        if (this.f40767j || this.f40764g) {
            return;
        }
        AndroidComposeView androidComposeView = this.f40760c;
        androidComposeView.invalidate();
        if (true != this.f40767j) {
            this.f40767j = true;
            androidComposeView.z0(this, true);
        }
    }

    @Override // D1.w0
    public final void j(@NotNull float[] fArr) {
        float[] n11 = n();
        if (n11 != null) {
            C7837o0.h(fArr, n11);
        }
    }

    @Override // D1.w0
    public final void k(long j11) {
        this.f40758a.P(j11);
        y2.f41105a.a(this.f40760c);
    }

    @Override // D1.w0
    public final void l() {
        long j11;
        if (this.f40767j) {
            long j12 = this.f40772o;
            j11 = l1.N0.f72232b;
            if (!l1.N0.c(j12, j11) && !Z1.q.c(this.f40758a.q(), this.f40763f)) {
                this.f40758a.F(P9.a.a(l1.N0.d(this.f40772o) * ((int) (this.f40763f >> 32)), l1.N0.e(this.f40772o) * ((int) (this.f40763f & 4294967295L))));
            }
            this.f40758a.w(this.f40768k, this.f40769l, this.f40763f, this.f40777t);
            if (this.f40767j) {
                this.f40767j = false;
                this.f40760c.z0(this, false);
            }
        }
    }
}
