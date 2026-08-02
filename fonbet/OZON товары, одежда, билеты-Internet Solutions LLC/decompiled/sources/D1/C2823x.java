package D1;

import B1.AbstractC2531a;
import D1.AbstractC2810k0;
import D1.H;
import D1.L;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7784B;
import l1.C7785C;
import l1.C7807Z;
import l1.InterfaceC7802U;
import l1.InterfaceC7825i0;
import org.jetbrains.annotations.NotNull;

/* renamed from: D1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2823x extends AbstractC2810k0 {

    /* renamed from: S, reason: collision with root package name */
    @NotNull
    private static final C7784B f5570S;

    /* renamed from: Q, reason: collision with root package name */
    @NotNull
    private final G0 f5571Q;

    /* renamed from: R, reason: collision with root package name */
    private Y f5572R;

    /* renamed from: D1.x$a */
    /* loaded from: classes8.dex */
    private final class a extends Y {
        public a(C2823x c2823x) {
            super(c2823x);
        }

        @Override // B1.InterfaceC2552v
        public final int D(int i11) {
            return B0().N0(i11);
        }

        @Override // D1.Y
        protected final void K1() {
            L.a T11 = B0().T();
            Intrinsics.f(T11);
            T11.q1();
        }

        @Override // B1.InterfaceC2552v
        public final int O(int i11) {
            return B0().R0(i11);
        }

        @Override // D1.V
        public final int P0(@NotNull AbstractC2531a abstractC2531a) {
            Integer num = (Integer) ((L.a) C1()).Q0().get(abstractC2531a);
            int intValue = num != null ? num.intValue() : LinearLayoutManager.INVALID_OFFSET;
            F1().put(abstractC2531a, Integer.valueOf(intValue));
            return intValue;
        }

        @Override // B1.InterfaceC2552v
        public final int T(int i11) {
            return B0().S0(i11);
        }

        @Override // B1.InterfaceC2552v
        public final int Y(int i11) {
            return B0().O0(i11);
        }

        @Override // B1.U
        @NotNull
        public final B1.m0 a0(long j11) {
            G0(j11);
            U0.b<H> o02 = B0().o0();
            int m11 = o02.m();
            if (m11 > 0) {
                H[] l11 = o02.l();
                int i11 = 0;
                do {
                    L.a T11 = l11[i11].T();
                    Intrinsics.f(T11);
                    T11.C1(H.f.NotUsed);
                    i11++;
                } while (i11 < m11);
            }
            Y.B1(this, B0().X().mo2measure3p2s80s(this, B0().y(), j11));
            return this;
        }
    }

    static {
        long j11;
        C7784B a11 = C7785C.a();
        j11 = C7807Z.f72252f;
        a11.b(j11);
        a11.u(1.0f);
        a11.v(1);
        f5570S = a11;
    }

    public C2823x(@NotNull H h11) {
        super(h11);
        G0 g02 = new G0();
        this.f5571Q = g02;
        g02.updateCoordinator$ui_release(this);
        this.f5572R = h11.U() != null ? new a(this) : null;
    }

    @Override // B1.InterfaceC2552v
    public final int D(int i11) {
        return B0().L0(i11);
    }

    @Override // B1.InterfaceC2552v
    public final int O(int i11) {
        return B0().P0(i11);
    }

    @Override // D1.V
    public final int P0(@NotNull AbstractC2531a abstractC2531a) {
        Y y11 = this.f5572R;
        if (y11 != null) {
            return y11.P0(abstractC2531a);
        }
        Integer num = (Integer) ((L.b) Y1()).e1().get(abstractC2531a);
        return num != null ? num.intValue() : LinearLayoutManager.INVALID_OFFSET;
    }

    @NotNull
    public final G0 Q2() {
        return this.f5571Q;
    }

    @Override // B1.InterfaceC2552v
    public final int T(int i11) {
        return B0().Q0(i11);
    }

    @Override // D1.AbstractC2810k0
    public final void V1() {
        if (this.f5572R == null) {
            this.f5572R = new a(this);
        }
    }

    @Override // B1.InterfaceC2552v
    public final int Y(int i11) {
        return B0().M0(i11);
    }

    @Override // B1.U
    @NotNull
    public final B1.m0 a0(long j11) {
        if (Z1()) {
            Y y11 = this.f5572R;
            Intrinsics.f(y11);
            j11 = y11.j0();
        }
        G0(j11);
        U0.b<H> o02 = B0().o0();
        int m11 = o02.m();
        if (m11 > 0) {
            H[] l11 = o02.l();
            int i11 = 0;
            do {
                l11[i11].V().M1(H.f.NotUsed);
                i11++;
            } while (i11 < m11);
        }
        C2(B0().X().mo2measure3p2s80s(this, B0().z(), j11));
        s2();
        return this;
    }

    @Override // D1.AbstractC2810k0
    public final Y c2() {
        return this.f5572R;
    }

    @Override // D1.AbstractC2810k0
    public final e.c e2() {
        return this.f5571Q;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    @Override // D1.AbstractC2810k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l2(@NotNull AbstractC2810k0.e eVar, long j11, @NotNull C2822w c2822w, boolean z11, boolean z12) {
        boolean z13;
        int i11;
        boolean z14 = false;
        if (eVar.b(B0())) {
            if (P2(j11)) {
                z13 = z12;
            } else if (z11) {
                float R12 = R1(j11, d2());
                if (!Float.isInfinite(R12) && !Float.isNaN(R12)) {
                    z13 = false;
                }
            }
            z14 = true;
            if (z14) {
                return;
            }
            i11 = c2822w.f5560c;
            U0.b<H> n02 = B0().n0();
            int m11 = n02.m();
            if (m11 > 0) {
                H[] l11 = n02.l();
                int i12 = m11 - 1;
                do {
                    H h11 = l11[i12];
                    if (h11.B0()) {
                        eVar.d(h11, j11, c2822w, z11, z13);
                        if (c2822w.m()) {
                            if (!c2822w.l()) {
                                break;
                            } else {
                                c2822w.b();
                            }
                        }
                    }
                    i12--;
                } while (i12 >= 0);
            }
            c2822w.f5560c = i11;
            return;
        }
        z13 = z12;
        if (z14) {
        }
    }

    @Override // D1.AbstractC2810k0
    public final void v2(@NotNull InterfaceC7802U interfaceC7802U, o1.d dVar) {
        x0 b11 = K.b(B0());
        U0.b<H> n02 = B0().n0();
        int m11 = n02.m();
        if (m11 > 0) {
            H[] l11 = n02.l();
            int i11 = 0;
            do {
                H h11 = l11[i11];
                if (h11.B0()) {
                    h11.u(interfaceC7802U, dVar);
                }
                i11++;
            } while (i11 < m11);
        }
        if (((AndroidComposeView) b11).getF40503D()) {
            T1(interfaceC7802U, f5570S);
        }
    }

    @Override // D1.AbstractC2810k0, B1.m0
    protected final void x0(long j11, float f7, Function1<? super InterfaceC7825i0, Unit> function1) {
        super.x0(j11, f7, function1);
        if (q1()) {
            return;
        }
        t2();
        B0().V().F1();
    }

    @Override // D1.AbstractC2810k0, B1.m0
    protected final void y0(long j11, float f7, @NotNull o1.d dVar) {
        super.y0(j11, f7, dVar);
        if (q1()) {
            return;
        }
        t2();
        B0().V().F1();
    }
}
