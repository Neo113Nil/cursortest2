package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import k1.C7458d;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7784B;
import l1.C7785C;
import l1.C7803V;
import l1.C7811b0;
import l1.C7837o0;
import l1.C7845v;
import l1.InterfaceC7802U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class H1 implements D1.w0 {

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final Function2<O0, Matrix, Unit> f40647n = a.f40661b;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f40648a;

    /* renamed from: b, reason: collision with root package name */
    private Function2<? super InterfaceC7802U, ? super o1.d, Unit> f40649b;

    /* renamed from: c, reason: collision with root package name */
    private Function0<Unit> f40650c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f40651d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f40653f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f40654g;

    /* renamed from: h, reason: collision with root package name */
    private C7784B f40655h;

    /* renamed from: k, reason: collision with root package name */
    private long f40658k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final O0 f40659l;

    /* renamed from: m, reason: collision with root package name */
    private int f40660m;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C5266m1 f40652e = new C5266m1();

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C5254i1<O0> f40656i = new C5254i1<>(f40647n);

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C7803V f40657j = new C7803V();

    static final class a extends AbstractC7737t implements Function2<O0, Matrix, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f40661b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(O0 o02, Matrix matrix) {
            o02.z(matrix);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<InterfaceC7802U, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC7802U, o1.d, Unit> f40662b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super InterfaceC7802U, ? super o1.d, Unit> function2) {
            super(1);
            this.f40662b = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC7802U interfaceC7802U) {
            this.f40662b.invoke(interfaceC7802U, null);
            return Unit.f71690a;
        }
    }

    public H1(@NotNull AndroidComposeView androidComposeView, @NotNull Function2<? super InterfaceC7802U, ? super o1.d, Unit> function2, @NotNull Function0<Unit> function0) {
        long j11;
        this.f40648a = androidComposeView;
        this.f40649b = function2;
        this.f40650c = function0;
        j11 = l1.N0.f72232b;
        this.f40658k = j11;
        O0 f12 = Build.VERSION.SDK_INT >= 29 ? new F1() : new C5292v1(androidComposeView);
        f12.x();
        f12.u(false);
        this.f40659l = f12;
    }

    private final void m(boolean z11) {
        if (z11 != this.f40651d) {
            this.f40651d = z11;
            this.f40648a.z0(this, z11);
        }
    }

    @Override // D1.w0
    public final void a() {
        O0 o02 = this.f40659l;
        if (o02.r()) {
            o02.s();
        }
        this.f40649b = null;
        this.f40650c = null;
        this.f40653f = true;
        m(false);
        AndroidComposeView androidComposeView = this.f40648a;
        androidComposeView.M0();
        androidComposeView.I0(this);
    }

    @Override // D1.w0
    public final void b(@NotNull Function2<? super InterfaceC7802U, ? super o1.d, Unit> function2, @NotNull Function0<Unit> function0) {
        long j11;
        m(false);
        this.f40653f = false;
        this.f40654g = false;
        int i11 = l1.N0.f72233c;
        j11 = l1.N0.f72232b;
        this.f40658k = j11;
        this.f40649b = function2;
        this.f40650c = function0;
    }

    @Override // D1.w0
    public final void c(@NotNull C7458d c7458d, boolean z11) {
        O0 o02 = this.f40659l;
        C5254i1<O0> c5254i1 = this.f40656i;
        if (!z11) {
            C7837o0.d(c5254i1.b(o02), c7458d);
            return;
        }
        float[] a11 = c5254i1.a(o02);
        if (a11 == null) {
            c7458d.g();
        } else {
            C7837o0.d(a11, c7458d);
        }
    }

    @Override // D1.w0
    public final void d(@NotNull float[] fArr) {
        C7837o0.h(fArr, this.f40656i.b(this.f40659l));
    }

    @Override // D1.w0
    public final long e(long j11, boolean z11) {
        O0 o02 = this.f40659l;
        C5254i1<O0> c5254i1 = this.f40656i;
        if (!z11) {
            return C7837o0.c(j11, c5254i1.b(o02));
        }
        float[] a11 = c5254i1.a(o02);
        if (a11 != null) {
            return C7837o0.c(j11, a11);
        }
        return 9187343241974906880L;
    }

    @Override // D1.w0
    public final void f(long j11) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        float d11 = l1.N0.d(this.f40658k) * i11;
        O0 o02 = this.f40659l;
        o02.C(d11);
        o02.D(l1.N0.e(this.f40658k) * i12);
        if (o02.I(o02.getLeft(), o02.K(), o02.getLeft() + i11, o02.K() + i12)) {
            o02.E(this.f40652e.b());
            if (!this.f40651d && !this.f40653f) {
                this.f40648a.invalidate();
                m(true);
            }
            this.f40656i.c();
        }
    }

    @Override // D1.w0
    public final boolean g(long j11) {
        float g10 = C7459e.g(j11);
        float h11 = C7459e.h(j11);
        O0 o02 = this.f40659l;
        if (o02.J()) {
            return 0.0f <= g10 && g10 < ((float) o02.getWidth()) && 0.0f <= h11 && h11 < ((float) o02.getHeight());
        }
        if (o02.y()) {
            return this.f40652e.f(j11);
        }
        return true;
    }

    @Override // D1.w0
    public final void h(@NotNull l1.E0 e02) {
        Function0<Unit> function0;
        int y11 = e02.y() | this.f40660m;
        int i11 = y11 & 4096;
        if (i11 != 0) {
            this.f40658k = e02.P();
        }
        O0 o02 = this.f40659l;
        boolean y12 = o02.y();
        boolean z11 = false;
        C5266m1 c5266m1 = this.f40652e;
        boolean z12 = y12 && !c5266m1.e();
        if ((y11 & 1) != 0) {
            o02.j(e02.K());
        }
        if ((y11 & 2) != 0) {
            o02.k(e02.L());
        }
        if ((y11 & 4) != 0) {
            o02.setAlpha(e02.getAlpha());
        }
        if ((y11 & 8) != 0) {
            o02.n(e02.S());
        }
        if ((y11 & 16) != 0) {
            o02.c(e02.T());
        }
        if ((y11 & 32) != 0) {
            o02.v(e02.M());
        }
        if ((y11 & 64) != 0) {
            o02.L(C7811b0.i(e02.m()));
        }
        if ((y11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            o02.M(C7811b0.i(e02.O()));
        }
        if ((y11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            o02.h(e02.I());
        }
        if ((y11 & 256) != 0) {
            o02.e(e02.E());
        }
        if ((y11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            o02.f(e02.G());
        }
        if ((y11 & 2048) != 0) {
            o02.d(e02.s());
        }
        if (i11 != 0) {
            o02.C(l1.N0.d(this.f40658k) * o02.getWidth());
            o02.D(l1.N0.e(this.f40658k) * o02.getHeight());
        }
        boolean z13 = e02.t() && e02.N() != l1.y0.a();
        if ((y11 & 24576) != 0) {
            o02.H(z13);
            o02.u(e02.t() && e02.N() == l1.y0.a());
        }
        if ((131072 & y11) != 0) {
            o02.l(e02.D());
        }
        if ((32768 & y11) != 0) {
            o02.q(e02.u());
        }
        boolean g10 = this.f40652e.g(e02.A(), e02.getAlpha(), z13, e02.M(), e02.i());
        if (c5266m1.c()) {
            o02.E(c5266m1.b());
        }
        if (z13 && !c5266m1.e()) {
            z11 = true;
        }
        AndroidComposeView androidComposeView = this.f40648a;
        if (z12 == z11 && (!z11 || !g10)) {
            y2.f41105a.a(androidComposeView);
        } else if (!this.f40651d && !this.f40653f) {
            androidComposeView.invalidate();
            m(true);
        }
        if (!this.f40654g && o02.getElevation() > 0.0f && (function0 = this.f40650c) != null) {
            function0.invoke();
        }
        if ((y11 & 7963) != 0) {
            this.f40656i.c();
        }
        this.f40660m = e02.y();
    }

    @Override // D1.w0
    public final void i(@NotNull InterfaceC7802U interfaceC7802U, o1.d dVar) {
        Canvas b11 = C7845v.b(interfaceC7802U);
        boolean isHardwareAccelerated = b11.isHardwareAccelerated();
        O0 o02 = this.f40659l;
        if (isHardwareAccelerated) {
            l();
            boolean z11 = o02.getElevation() > 0.0f;
            this.f40654g = z11;
            if (z11) {
                interfaceC7802U.q();
            }
            o02.t(b11);
            if (this.f40654g) {
                interfaceC7802U.i();
                return;
            }
            return;
        }
        float left = o02.getLeft();
        float K11 = o02.K();
        float G11 = o02.G();
        float B11 = o02.B();
        if (o02.getAlpha() < 1.0f) {
            C7784B c7784b = this.f40655h;
            if (c7784b == null) {
                c7784b = C7785C.a();
                this.f40655h = c7784b;
            }
            c7784b.setAlpha(o02.getAlpha());
            b11.saveLayer(left, K11, G11, B11, c7784b.d());
        } else {
            interfaceC7802U.save();
        }
        interfaceC7802U.f(left, K11);
        interfaceC7802U.s(this.f40656i.b(o02));
        if (o02.y() || o02.J()) {
            this.f40652e.a(interfaceC7802U);
        }
        Function2<? super InterfaceC7802U, ? super o1.d, Unit> function2 = this.f40649b;
        if (function2 != null) {
            function2.invoke(interfaceC7802U, null);
        }
        interfaceC7802U.p();
        m(false);
    }

    @Override // D1.w0
    public final void invalidate() {
        if (this.f40651d || this.f40653f) {
            return;
        }
        this.f40648a.invalidate();
        m(true);
    }

    @Override // D1.w0
    public final void j(@NotNull float[] fArr) {
        float[] a11 = this.f40656i.a(this.f40659l);
        if (a11 != null) {
            C7837o0.h(fArr, a11);
        }
    }

    @Override // D1.w0
    public final void k(long j11) {
        O0 o02 = this.f40659l;
        int left = o02.getLeft();
        int K11 = o02.K();
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        if (left == i11 && K11 == i12) {
            return;
        }
        if (left != i11) {
            o02.A(i11 - left);
        }
        if (K11 != i12) {
            o02.w(i12 - K11);
        }
        y2.f41105a.a(this.f40648a);
        this.f40656i.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    @Override // D1.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        l1.s0 s0Var;
        Function2<? super InterfaceC7802U, ? super o1.d, Unit> function2;
        boolean z11 = this.f40651d;
        O0 o02 = this.f40659l;
        if (z11 || !o02.r()) {
            if (o02.y()) {
                C5266m1 c5266m1 = this.f40652e;
                if (!c5266m1.e()) {
                    s0Var = c5266m1.d();
                    function2 = this.f40649b;
                    if (function2 != null) {
                        o02.F(this.f40657j, s0Var, new b(function2));
                    }
                    m(false);
                }
            }
            s0Var = null;
            function2 = this.f40649b;
            if (function2 != null) {
            }
            m(false);
        }
    }
}
