package T0;

import S0.AbstractC3984t;
import S0.C3944b1;
import S0.C3945c;
import S0.C3947c1;
import S0.C3966j0;
import S0.C3968k0;
import S0.C3969l;
import S0.C3988v;
import S0.InterfaceC3963i;
import S0.V0;
import S0.W;
import S0.r;
import S0.z1;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3969l f26360a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private a f26361b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26362c;

    /* renamed from: f, reason: collision with root package name */
    private int f26365f;

    /* renamed from: g, reason: collision with root package name */
    private int f26366g;

    /* renamed from: l, reason: collision with root package name */
    private int f26371l;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final W f26363d = new W();

    /* renamed from: e, reason: collision with root package name */
    private boolean f26364e = true;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private z1<Object> f26367h = new z1<>();

    /* renamed from: i, reason: collision with root package name */
    private int f26368i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f26369j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f26370k = -1;

    public b(@NotNull C3969l c3969l, @NotNull a aVar) {
        this.f26360a = c3969l;
        this.f26361b = aVar;
    }

    private final void A(boolean z11) {
        C3969l c3969l = this.f26360a;
        int t2 = z11 ? c3969l.y0().t() : c3969l.y0().j();
        int i11 = t2 - this.f26365f;
        if (i11 < 0) {
            r.j("Tried to seek backward");
            throw null;
        }
        if (i11 > 0) {
            this.f26361b.e(i11);
            this.f26365f = t2;
        }
    }

    private final void y() {
        int i11 = this.f26366g;
        if (i11 > 0) {
            this.f26361b.H(i11);
            this.f26366g = 0;
        }
        z1<Object> z1Var = this.f26367h;
        if (z1Var.d()) {
            this.f26361b.k(z1Var.i());
            z1Var.a();
        }
    }

    private final void z() {
        int i11 = this.f26371l;
        if (i11 > 0) {
            int i12 = this.f26368i;
            if (i12 >= 0) {
                y();
                this.f26361b.y(i12, i11);
                this.f26368i = -1;
            } else {
                int i13 = this.f26370k;
                int i14 = this.f26369j;
                y();
                this.f26361b.u(i13, i14, i11);
                this.f26369j = -1;
                this.f26370k = -1;
            }
            this.f26371l = 0;
        }
    }

    public final void B() {
        C3969l c3969l = this.f26360a;
        if (c3969l.y0().w() > 0) {
            C3944b1 y02 = c3969l.y0();
            int t2 = y02.t();
            W w11 = this.f26363d;
            if (w11.h(-2) != t2) {
                if (!this.f26362c && this.f26364e) {
                    A(false);
                    this.f26361b.p();
                    this.f26362c = true;
                }
                if (t2 > 0) {
                    C3945c a11 = y02.a(t2);
                    w11.j(t2);
                    A(false);
                    this.f26361b.o(a11);
                    this.f26362c = true;
                }
            }
        }
    }

    public final void C() {
        y();
        if (this.f26362c) {
            M();
            k();
        }
    }

    public final void D(@NotNull C3988v c3988v, @NotNull AbstractC3984t abstractC3984t, @NotNull C3968k0 c3968k0) {
        this.f26361b.v(c3988v, abstractC3984t, c3968k0);
    }

    public final void E(@NotNull V0 v02) {
        this.f26361b.w(v02);
    }

    public final void F() {
        A(false);
        B();
        this.f26361b.x();
        this.f26365f = this.f26360a.y0().o() + this.f26365f;
    }

    public final void G(int i11, int i12) {
        if (i12 > 0) {
            if (!(i11 >= 0)) {
                r.j("Invalid remove index " + i11);
                throw null;
            }
            if (this.f26368i == i11) {
                this.f26371l += i12;
                return;
            }
            z();
            this.f26368i = i11;
            this.f26371l = i12;
        }
    }

    public final void H() {
        this.f26361b.z();
    }

    public final void I() {
        this.f26362c = false;
        this.f26363d.a();
        this.f26365f = 0;
    }

    public final void J(@NotNull a aVar) {
        this.f26361b = aVar;
    }

    public final void K(boolean z11) {
        this.f26364e = z11;
    }

    public final void L(@NotNull Function0<Unit> function0) {
        this.f26361b.A(function0);
    }

    public final void M() {
        this.f26361b.B();
    }

    public final void N(int i11) {
        if (i11 > 0) {
            A(false);
            B();
            this.f26361b.C(i11);
        }
    }

    public final void O(Object obj, @NotNull C3945c c3945c, int i11) {
        this.f26361b.D(obj, c3945c, i11);
    }

    public final void P(Object obj) {
        A(false);
        this.f26361b.E(obj);
    }

    public final <T, V> void Q(V v11, @NotNull Function2<? super T, ? super V, Unit> function2) {
        y();
        this.f26361b.F(v11, function2);
    }

    public final void R(int i11, Object obj) {
        A(true);
        this.f26361b.G(i11, obj);
    }

    public final void S(InterfaceC3963i interfaceC3963i) {
        y();
        this.f26361b.I(interfaceC3963i);
    }

    public final void a(@NotNull C3945c c3945c, Object obj) {
        this.f26361b.f(c3945c, obj);
    }

    public final void b(@NotNull ArrayList arrayList, @NotNull a1.d dVar) {
        this.f26361b.g(arrayList, dVar);
    }

    public final void c(C3966j0 c3966j0, @NotNull AbstractC3984t abstractC3984t, @NotNull C3968k0 c3968k0, @NotNull C3968k0 c3968k02) {
        this.f26361b.h(c3966j0, abstractC3984t, c3968k0, c3968k02);
    }

    public final void d() {
        A(false);
        this.f26361b.i();
    }

    public final void e(@NotNull a1.d dVar, @NotNull C3945c c3945c) {
        y();
        this.f26361b.j(dVar, c3945c);
    }

    public final void f(@NotNull Function1 function1, @NotNull C3988v c3988v) {
        this.f26361b.l(function1, c3988v);
    }

    public final void g() {
        int t2 = this.f26360a.y0().t();
        W w11 = this.f26363d;
        if (!(w11.h(-1) <= t2)) {
            r.j("Missed recording an endGroup");
            throw null;
        }
        if (w11.h(-1) == t2) {
            A(false);
            w11.i();
            this.f26361b.m();
        }
    }

    public final void h() {
        this.f26361b.n();
        this.f26365f = 0;
    }

    public final void i() {
        z();
    }

    public final void j(int i11, int i12) {
        z();
        y();
        C3969l c3969l = this.f26360a;
        int L11 = c3969l.y0().I(i12) ? 1 : c3969l.y0().L(i12);
        if (L11 > 0) {
            G(i11, L11);
        }
    }

    public final void k() {
        if (this.f26362c) {
            A(false);
            A(false);
            this.f26361b.m();
            this.f26362c = false;
        }
    }

    public final void l() {
        y();
        if (this.f26363d.d()) {
            return;
        }
        r.j("Missed recording an endGroup()");
        throw null;
    }

    @NotNull
    public final a m() {
        return this.f26361b;
    }

    public final boolean n() {
        return this.f26364e;
    }

    public final boolean o() {
        return this.f26360a.y0().t() - this.f26365f < 0;
    }

    public final void p(@NotNull a aVar, a1.d dVar) {
        this.f26361b.q(aVar, dVar);
    }

    public final void q(@NotNull C3945c c3945c, @NotNull C3947c1 c3947c1) {
        y();
        A(false);
        B();
        z();
        this.f26361b.r(c3945c, c3947c1);
    }

    public final void r(@NotNull C3945c c3945c, @NotNull C3947c1 c3947c1, @NotNull c cVar) {
        y();
        A(false);
        B();
        z();
        this.f26361b.s(c3945c, c3947c1, cVar);
    }

    public final void s(int i11) {
        A(false);
        B();
        this.f26361b.t(i11);
    }

    public final void t(Object obj) {
        z();
        this.f26367h.h(obj);
    }

    public final void u(int i11, int i12, int i13) {
        if (i13 > 0) {
            int i14 = this.f26371l;
            if (i14 > 0 && this.f26369j == i11 - i14 && this.f26370k == i12 - i14) {
                this.f26371l = i14 + i13;
                return;
            }
            z();
            this.f26369j = i11;
            this.f26370k = i12;
            this.f26371l = i13;
        }
    }

    public final void v(int i11) {
        this.f26365f = (i11 - this.f26360a.y0().j()) + this.f26365f;
    }

    public final void w(int i11) {
        this.f26365f = i11;
    }

    public final void x() {
        z();
        z1<Object> z1Var = this.f26367h;
        if (z1Var.d()) {
            z1Var.g();
        } else {
            this.f26366g++;
        }
    }
}
