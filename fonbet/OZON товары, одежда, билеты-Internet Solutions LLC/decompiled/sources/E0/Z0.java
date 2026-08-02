package E0;

import D1.AbstractC2810k0;
import P1.AbstractC3809p;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import k1.C7459e;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import z0.InterfaceC10969b;

/* loaded from: classes8.dex */
public final class Z0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private V0 f7131a;

    /* renamed from: b, reason: collision with root package name */
    private Function2<? super Z1.d, ? super Function0<K1.K>, Unit> f7132b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final V0 f7133c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3991w0 f7134d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3991w0 f7135e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C3991w0 f7136f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C3991w0 f7137g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC10969b f7138h;

    public Z0() {
        C3991w0 f7;
        V0 v02 = new V0();
        this.f7131a = v02;
        this.f7133c = v02;
        this.f7134d = n1.f(null, n1.h());
        this.f7135e = n1.f(null, n1.h());
        this.f7136f = n1.f(null, n1.h());
        f7 = n1.f(Z1.h.a(0), D1.f25195a);
        this.f7137g = f7;
        this.f7138h = androidx.compose.foundation.relocation.c.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(long j11) {
        C7460f c7460f;
        B1.B i11 = i();
        if (i11 != null) {
            if (i11.I()) {
                B1.B e11 = e();
                c7460f = e11 != null ? e11.K(i11, true) : null;
            } else {
                c7460f = C7460f.f70279e;
            }
        }
        c7460f = C7460f.f70279e;
        return a1.a(j11, c7460f);
    }

    @NotNull
    public final InterfaceC10969b c() {
        return this.f7138h;
    }

    public final B1.B d() {
        return (B1.B) this.f7135e.getValue();
    }

    public final B1.B e() {
        return (B1.B) this.f7136f.getValue();
    }

    public final K1.K f() {
        return this.f7133c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float g() {
        return ((Z1.h) this.f7137g.getValue()).d();
    }

    public final int h(long j11, boolean z11) {
        K1.K value = this.f7133c.getValue();
        if (value == null) {
            return -1;
        }
        if (z11) {
            j11 = b(j11);
        }
        return value.w(a1.b(this, j11));
    }

    public final B1.B i() {
        return (B1.B) this.f7134d.getValue();
    }

    public final boolean j(long j11) {
        K1.K value = this.f7133c.getValue();
        if (value == null) {
            return false;
        }
        long b11 = a1.b(this, b(j11));
        int q11 = value.q(C7459e.h(b11));
        return C7459e.g(b11) >= value.r(q11) && C7459e.g(b11) <= value.s(q11);
    }

    @NotNull
    public final K1.K k(@NotNull B1.Y y11, @NotNull Z1.s sVar, @NotNull AbstractC3809p.a aVar, long j11) {
        K1.K v11 = this.f7131a.v(y11, sVar, aVar, j11);
        Function2<? super Z1.d, ? super Function0<K1.K>, Unit> function2 = this.f7132b;
        if (function2 != null) {
            function2.invoke(y11, new Y0(this));
        }
        return v11;
    }

    public final void l(AbstractC2810k0 abstractC2810k0) {
        this.f7135e.setValue(abstractC2810k0);
    }

    public final void m(AbstractC2810k0 abstractC2810k0) {
        this.f7136f.setValue(abstractC2810k0);
    }

    public final void n(float f7) {
        this.f7137g.setValue(Z1.h.a(f7));
    }

    public final void o(Function2<? super Z1.d, ? super Function0<K1.K>, Unit> function2) {
        this.f7132b = function2;
    }

    public final void p(AbstractC2810k0 abstractC2810k0) {
        this.f7134d.setValue(abstractC2810k0);
    }

    public final void q(@NotNull c1 c1Var, @NotNull K1.T t2, boolean z11, boolean z12) {
        this.f7131a.w(c1Var, t2, z11, z12);
    }
}
