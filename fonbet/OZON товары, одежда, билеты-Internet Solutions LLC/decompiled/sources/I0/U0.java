package I0;

import B0.EnumC2526y0;
import B0.InterfaceC2477h1;
import B0.R1;
import k1.C7459e;
import kotlin.jvm.internal.Intrinsics;
import t1.InterfaceC9723a;

/* loaded from: classes8.dex */
public final class U0 implements InterfaceC2477h1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ W0 f11382a;

    U0(W0 w02) {
        this.f11382a = w02;
    }

    @Override // B0.InterfaceC2477h1
    public final void a() {
    }

    @Override // B0.InterfaceC2477h1
    public final void b(long j11) {
        R1 j12;
        InterfaceC9723a D11;
        W0 w02 = this.f11382a;
        w02.f11400n = C7459e.k(w02.f11400n, j11);
        B0.O0 H11 = w02.H();
        if (H11 == null || (j12 = H11.j()) == null) {
            return;
        }
        W0.e(w02, C7459e.a(C7459e.k(w02.f11398l, w02.f11400n)));
        Q1.D F11 = w02.F();
        C7459e w11 = w02.w();
        Intrinsics.f(w11);
        int transformedToOriginal = F11.transformedToOriginal(j12.d(w11.n(), true));
        long a11 = K1.S.a(transformedToOriginal, transformedToOriginal);
        if (K1.Q.d(a11, w02.K().e())) {
            return;
        }
        B0.O0 H12 = w02.H();
        if ((H12 == null || H12.x()) && (D11 = w02.D()) != null) {
            D11.a(9);
        }
        w02.G().invoke(W0.a(w02, w02.K().c(), a11));
    }

    @Override // B0.InterfaceC2477h1
    public final void c(long j11) {
        R1 j12;
        W0 w02 = this.f11382a;
        long a11 = C3196m0.a(w02.C(true));
        B0.O0 H11 = w02.H();
        if (H11 == null || (j12 = H11.j()) == null) {
            return;
        }
        long j13 = j12.j(a11);
        w02.f11398l = j13;
        W0.e(w02, C7459e.a(j13));
        w02.f11400n = 0L;
        W0.i(w02, EnumC2526y0.Cursor);
        w02.d0(false);
    }

    @Override // B0.InterfaceC2477h1
    public final void d() {
        W0 w02 = this.f11382a;
        W0.i(w02, null);
        W0.e(w02, null);
    }

    @Override // B0.InterfaceC2477h1
    public final void onCancel() {
    }

    @Override // B0.InterfaceC2477h1
    public final void onStop() {
        W0 w02 = this.f11382a;
        W0.i(w02, null);
        W0.e(w02, null);
    }
}
