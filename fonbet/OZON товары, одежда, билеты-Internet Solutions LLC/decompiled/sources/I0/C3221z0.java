package I0;

import B0.EnumC2526y0;
import B0.InterfaceC2477h1;
import I0.F;
import k1.C7459e;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: I0.z0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3221z0 implements InterfaceC2477h1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f11671a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3215w0 f11672b;

    C3221z0(boolean z11, C3215w0 c3215w0) {
        this.f11671a = z11;
        this.f11672b = c3215w0;
    }

    @Override // B0.InterfaceC2477h1
    public final void a() {
        C3220z x11;
        B1.B v11;
        C3215w0 c3215w0 = this.f11672b;
        boolean z11 = this.f11671a;
        if ((z11 ? c3215w0.y() : c3215w0.s()) == null || (x11 = c3215w0.x()) == null) {
            return;
        }
        InterfaceC3216x m11 = c3215w0.m(z11 ? x11.d() : x11.b());
        if (m11 == null || (v11 = m11.v()) == null) {
            return;
        }
        long c11 = m11.c(x11, z11);
        if (P9.a.e(c11)) {
            return;
        }
        C3215w0.c(c3215w0, C7459e.a(c3215w0.D().W(v11, C3196m0.a(c11))));
        C3215w0.f(c3215w0, z11 ? EnumC2526y0.SelectionStart : EnumC2526y0.SelectionEnd);
        c3215w0.N(false);
    }

    @Override // B0.InterfaceC2477h1
    public final void b(long j11) {
        C3215w0 c3215w0 = this.f11672b;
        if (c3215w0.r() == null) {
            return;
        }
        C3215w0.e(c3215w0, C7459e.k(c3215w0.q(), j11));
        long k11 = C7459e.k(c3215w0.p(), c3215w0.q());
        C7459e a11 = C7459e.a(k11);
        if (c3215w0.Q(a11.n(), c3215w0.p(), this.f11671a, F.a.c())) {
            C3215w0.d(c3215w0, k11);
            C3215w0.e(c3215w0, 0L);
        }
    }

    @Override // B0.InterfaceC2477h1
    public final void c(long j11) {
        C3215w0 c3215w0 = this.f11672b;
        if (c3215w0.r() == null) {
            return;
        }
        C3220z x11 = c3215w0.x();
        Intrinsics.f(x11);
        boolean z11 = this.f11671a;
        V c11 = c3215w0.f11621a.l().c((z11 ? x11.d() : x11.b()).d());
        if (c11 == 0) {
            throw new IllegalStateException("SelectionRegistrar should contain the current selection's selectableIds");
        }
        InterfaceC3216x interfaceC3216x = (InterfaceC3216x) c11;
        B1.B v11 = interfaceC3216x.v();
        if (v11 == null) {
            throw new IllegalStateException("Current selectable should have layout coordinates.");
        }
        long c12 = interfaceC3216x.c(x11, z11);
        if (P9.a.e(c12)) {
            return;
        }
        C3215w0.d(c3215w0, c3215w0.D().W(v11, C3196m0.a(c12)));
        C3215w0.e(c3215w0, 0L);
    }

    @Override // B0.InterfaceC2477h1
    public final void d() {
        C3215w0 c3215w0 = this.f11672b;
        c3215w0.N(true);
        C3215w0.f(c3215w0, null);
        C3215w0.c(c3215w0, null);
    }

    @Override // B0.InterfaceC2477h1
    public final void onCancel() {
        C3215w0 c3215w0 = this.f11672b;
        c3215w0.N(true);
        C3215w0.f(c3215w0, null);
        C3215w0.c(c3215w0, null);
    }

    @Override // B0.InterfaceC2477h1
    public final void onStop() {
        C3215w0 c3215w0 = this.f11672b;
        c3215w0.N(true);
        C3215w0.f(c3215w0, null);
        C3215w0.c(c3215w0, null);
    }
}
