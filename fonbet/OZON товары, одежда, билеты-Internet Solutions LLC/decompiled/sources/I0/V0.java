package I0;

import B0.EnumC2526y0;
import B0.InterfaceC2477h1;
import B0.R1;
import I0.F;
import k1.C7459e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class V0 implements InterfaceC2477h1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ W0 f11384a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f11385b;

    V0(W0 w02, boolean z11) {
        this.f11384a = w02;
        this.f11385b = z11;
    }

    @Override // B0.InterfaceC2477h1
    public final void a() {
        R1 j11;
        boolean z11 = this.f11385b;
        EnumC2526y0 enumC2526y0 = z11 ? EnumC2526y0.SelectionStart : EnumC2526y0.SelectionEnd;
        W0 w02 = this.f11384a;
        W0.i(w02, enumC2526y0);
        long a11 = C3196m0.a(w02.C(z11));
        B0.O0 H11 = w02.H();
        if (H11 == null || (j11 = H11.j()) == null) {
            return;
        }
        long j12 = j11.j(a11);
        w02.f11398l = j12;
        W0.e(w02, C7459e.a(j12));
        w02.f11400n = 0L;
        w02.f11403q = -1;
        B0.O0 H12 = w02.H();
        if (H12 != null) {
            H12.C(true);
        }
        w02.d0(false);
    }

    @Override // B0.InterfaceC2477h1
    public final void b(long j11) {
        W0 w02 = this.f11384a;
        w02.f11400n = C7459e.k(w02.f11400n, j11);
        W0.e(w02, C7459e.a(C7459e.k(w02.f11398l, w02.f11400n)));
        Q1.K K11 = w02.K();
        C7459e w11 = w02.w();
        Intrinsics.f(w11);
        W0.m(w02, K11, w11.n(), false, this.f11385b, F.a.c(), true);
        w02.d0(false);
    }

    @Override // B0.InterfaceC2477h1
    public final void c(long j11) {
    }

    @Override // B0.InterfaceC2477h1
    public final void d() {
        W0 w02 = this.f11384a;
        W0.i(w02, null);
        W0.e(w02, null);
        w02.d0(true);
    }

    @Override // B0.InterfaceC2477h1
    public final void onCancel() {
    }

    @Override // B0.InterfaceC2477h1
    public final void onStop() {
        W0 w02 = this.f11384a;
        W0.i(w02, null);
        W0.e(w02, null);
        w02.d0(true);
    }
}
